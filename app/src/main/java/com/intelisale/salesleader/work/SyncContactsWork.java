package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.ContactMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.ContactEntity;
import com.intelisale.database.repository.SyncContactsRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.contacts.ContactSchema;
import com.intelisale.networking.schema.contacts.SyncContactsResponseSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.di.DaggerWorkComponent;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.salesleader.work.helper.PaginationHelper;
import com.intelisale.salesleader.work.helper.SyncObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncContactsWork extends BaseWorker {

    private ContactMapper contactMapper = ContactMapper.INSTANCE;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncContactsRepository syncContactsRepository;

    public SyncContactsWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public ListenableWorker.Result doWork() {

        // 0. CONTACT
        SyncObject obj0 = new SyncObject(SyncTableNames.Contacts, syncContactsRepository.getModifiedDate(TableNames.CONTACTS), 1000);

        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0});

        while (paginationHelper.setSyncRequest()) {

            syncContactsRepository.updateProgress(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncContactsResponseSchema>> call = syncApi.syncContacts(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncContactsResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncContactsResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncContactsResponseSchema syncContactsResponseSchema = responseSchema.getData();
                        if (syncContactsResponseSchema != null) {

                            // 0. CONTACT
                            BaseRecordSchema<ContactSchema> contactsRecordSchema = syncContactsResponseSchema.getContacts();
                            if (contactsRecordSchema != null && contactsRecordSchema.getRecords() != null) {

                                List<ContactEntity> contactEntities = contactMapper.contactEntities(contactsRecordSchema.getRecords());
                                syncContactsRepository.syncContacts(contactEntities);

                                paginationHelper.updateCounters(0, contactsRecordSchema.getNumOfRecords());
                            }
                        }
                    } else {

                        return Result.failure();
                    }
                } else {

                    return Result.failure();
                }
            } catch (Exception e) {

                return Result.failure();
            }
        }

        return Result.success();
    }

    private void inject() {
        DaggerWorkComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncContactsWork(this);
    }
}
