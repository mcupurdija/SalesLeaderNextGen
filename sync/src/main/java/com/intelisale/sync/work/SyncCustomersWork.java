package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.CustomerMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.customers.CustomerSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.sync.di.DaggerSyncComponent;
import com.intelisale.sync.work.helper.PaginationHelper;
import com.intelisale.sync.work.helper.SyncObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncCustomersWork extends BaseWorker {

    private CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncCustomersRepository syncCustomersRepository;

    public SyncCustomersWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public Result doWork() {

        // 0. CUSTOMERS
        SyncObject obj0 = new SyncObject(SyncTableNames.Customers, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMERS), 500);


        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0});

        while (paginationHelper.setSyncRequest()) {

            syncCustomersRepository.updateStatus(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncCustomersResponseSchema>> call = syncApi.syncCustomers(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncCustomersResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncCustomersResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncCustomersResponseSchema syncCustomersResponseSchema = responseSchema.getData();
                        if (syncCustomersResponseSchema != null) {

                            BaseRecordSchema<CustomerSchema> customerRecordSchema = syncCustomersResponseSchema.getCustomers();
                            if (customerRecordSchema != null && customerRecordSchema.getRecords() != null && customerRecordSchema.getRecords().size() > 0) {

                                List<CustomerEntity> customerEntities = customerMapper.customerSchemaToEntityList(customerRecordSchema.getRecords());
                                syncCustomersRepository.syncCustomers(customerEntities);

                                paginationHelper.updateCounters(0, customerRecordSchema.getNumOfRecords());
                            }


                        }
                    } else {

                        syncCustomersRepository.updateStatus(false);
                        return Result.failure();
                    }
                } else {

                    syncCustomersRepository.updateStatus(false);
                    return Result.failure();
                }
            } catch (Exception e) {

                syncCustomersRepository.updateStatus(false);
                return Result.failure();
            }
        }

        syncCustomersRepository.updateStatus(true);
        return Result.success();
    }

    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncCustomersWork(this);
    }
}
