package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.ItemMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.repository.SyncItemsRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.items.ItemSchema;
import com.intelisale.networking.schema.items.SyncItemsResponseSchema;
import com.intelisale.networking.schema.sync.SyncSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.sync.di.DaggerSyncComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncItemsWork extends BaseWorker {

    private static final int ITEMS_PAGE_SIZE = 5000;

    private int itemsCounter = 0, itemsResultsCounter = Integer.MAX_VALUE;
    private int percentageCompleted;

    private Map<String, SyncSchema> syncRequest;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncItemsRepository syncItemsRepository;

    public SyncItemsWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public Result doWork() {

        while (setSyncRequest()) {

            Call<BaseSchema<SyncItemsResponseSchema>> call = syncApi.syncItems(1, new ArrayList<>(syncRequest.values()));
            try {
                Response<BaseSchema<SyncItemsResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncItemsResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncItemsResponseSchema syncItemsResponseSchema = responseSchema.getData();
                        if (syncItemsResponseSchema != null) {

                            BaseRecordSchema<ItemSchema> itemsRecordSchema = syncItemsResponseSchema.getItems();
                            if (itemsRecordSchema != null) {

                                if (itemsRecordSchema.getRecords() != null && itemsRecordSchema.getRecords().size() > 0) {

                                    List<ItemEntity> itemEntities = ItemMapper.INSTANCE.itemSchemaToEntityList(itemsRecordSchema.getRecords());
                                    syncItemsRepository.syncItems(itemEntities);

                                    itemsCounter += ITEMS_PAGE_SIZE;
                                }
                                itemsResultsCounter = itemsRecordSchema.getNumOfRecords();
                            }
                        }
                    } else {

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

    private boolean setSyncRequest() {

        if (syncRequest == null) {
            percentageCompleted = 1;

            syncRequest = new HashMap<>();
            // ITEMS
            syncRequest.put(TableNames.ITEMS, new SyncSchema(SyncTableNames.Items, syncItemsRepository.getItemsModifiedDate(), itemsCounter, ITEMS_PAGE_SIZE));

        } else {
            percentageCompleted = 0;

            if (itemsCounter < itemsResultsCounter) {
                Objects.requireNonNull(syncRequest.get(TableNames.ITEMS)).setPageNumber(itemsCounter);
                addPercentageCompleted(itemsCounter);
            } else {
                syncRequest.remove(TableNames.ITEMS);
                addPercentageCompleted(itemsResultsCounter);
            }

            if (syncRequest.size() > 0) {

                if (syncRequest.containsKey(TableNames.ITEMS))
                    Objects.requireNonNull(syncRequest.get(TableNames.ITEMS)).setPageSize(ITEMS_PAGE_SIZE);

            }
        }

//        updateSyncProgress

        return syncRequest.size() > 0;
    }

    private void addPercentageCompleted(int value) {

        int resultSum = itemsResultsCounter;
        if (resultSum != 0) percentageCompleted += value * 100 / resultSum;
    }


    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncItemsWork(this);
    }
}
