package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.ItemMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.ItemAllowedToCustomerEntity;
import com.intelisale.database.entity.ItemConnectionsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemPackagesEntity;
import com.intelisale.database.repository.SyncItemsRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.items.ItemAllowedToCustomerSchema;
import com.intelisale.networking.schema.items.ItemConnectionsSchema;
import com.intelisale.networking.schema.items.ItemPackagesSchema;
import com.intelisale.networking.schema.items.ItemSchema;
import com.intelisale.networking.schema.items.SyncItemsResponseSchema;
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

public class SyncItemsWork extends BaseWorker {

    private ItemMapper itemMapper = ItemMapper.INSTANCE;

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

        // 0. ITEM
        SyncObject obj0 = new SyncObject(SyncTableNames.Items, syncItemsRepository.getModifiedDate(TableNames.ITEMS), 5000);
        // 1. ITEM CONNECTIONS
        SyncObject obj1 = new SyncObject(SyncTableNames.SLItemsConnections, syncItemsRepository.getModifiedDate(TableNames.SL_ITEMS_CONNECTIONS), 5000);
        // 2. ITEM PACKAGES
        SyncObject obj2 = new SyncObject(SyncTableNames.SLItemsPackages, syncItemsRepository.getModifiedDate(TableNames.SL_ITEMS_PACKAGES), 5000);
        // 3. ITEM ALLOWED TO CUSTOMERS
        SyncObject obj3 = new SyncObject(SyncTableNames.SLItemsAllowedToCustomers, syncItemsRepository.getModifiedDate(TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER), 5000);

        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0, obj1, obj2, obj3});

        while (paginationHelper.setSyncRequest()) {

            syncItemsRepository.updateStatus(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncItemsResponseSchema>> call = syncApi.syncItems(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncItemsResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncItemsResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncItemsResponseSchema syncItemsResponseSchema = responseSchema.getData();
                        if (syncItemsResponseSchema != null) {

                            // 0. ITEM
                            BaseRecordSchema<ItemSchema> itemsRecordSchema = syncItemsResponseSchema.getItemSchema();
                            if (itemsRecordSchema != null) {

                                if (itemsRecordSchema.getRecords() != null && itemsRecordSchema.getRecords().size() > 0) {

                                    List<ItemEntity> itemEntities = itemMapper.itemListMapper(itemsRecordSchema.getRecords());
                                    syncItemsRepository.syncItems(itemEntities);

                                    paginationHelper.incrementEntityCounter(0);
                                }

                                paginationHelper.updateEntityResultsCounter(0, itemsRecordSchema.getNumOfRecords());
                            }

                            // 1. ITEM CONNECTIONS
                            BaseRecordSchema<ItemConnectionsSchema> itemConnectionsSchema = syncItemsResponseSchema.getItemConnectionsSchema();
                            if (itemConnectionsSchema != null) {

                                if (itemConnectionsSchema.getRecords() != null && itemConnectionsSchema.getRecords().size() > 0) {

                                    List<ItemConnectionsEntity> itemConnectionsEntities = itemMapper.itemConnectionsListMapper(itemConnectionsSchema.getRecords());
                                    syncItemsRepository.syncItemConnections(itemConnectionsEntities);

                                    paginationHelper.incrementEntityCounter(1);
                                }

                                paginationHelper.updateEntityResultsCounter(1, itemConnectionsSchema.getNumOfRecords());
                            }

                            // 2. ITEM PACKAGES
                            BaseRecordSchema<ItemPackagesSchema> itemPackagesSchema = syncItemsResponseSchema.getItemPackagesSchema();
                            if (itemPackagesSchema != null) {

                                if (itemPackagesSchema.getRecords() != null && itemPackagesSchema.getRecords().size() > 0) {

                                    List<ItemPackagesEntity> itemPackagesEntities = itemMapper.itemPackagesListMapper(itemPackagesSchema.getRecords());
                                    syncItemsRepository.syncItemPackages(itemPackagesEntities);

                                    paginationHelper.incrementEntityCounter(2);
                                }

                                paginationHelper.updateEntityResultsCounter(2, itemPackagesSchema.getNumOfRecords());
                            }

                            // 3. ITEMS ALLOWED TO CUSTOMERS
                            BaseRecordSchema<ItemAllowedToCustomerSchema> itemAllowedToCustomerSchema = syncItemsResponseSchema.getItemAllowedToCustomerSchema();
                            if (itemAllowedToCustomerSchema != null) {

                                if (itemAllowedToCustomerSchema.getRecords() != null && itemAllowedToCustomerSchema.getRecords().size() > 0) {

                                    List<ItemAllowedToCustomerEntity> itemAllowedToCustomerEntities = itemMapper.itemAllowedToCustomerListMapper(itemAllowedToCustomerSchema.getRecords());
                                    syncItemsRepository.syncItemAllowedToCustomer(itemAllowedToCustomerEntities);

                                    paginationHelper.incrementEntityCounter(3);
                                }

                                paginationHelper.updateEntityResultsCounter(3, itemAllowedToCustomerSchema.getNumOfRecords());
                            }
                        }
                    } else {

                    }
                } else {

                    syncItemsRepository.updateStatus(false);
                    return Result.failure();
                }
            } catch (Exception e) {

                syncItemsRepository.updateStatus(false);
                return Result.failure();
            }
        }

        syncItemsRepository.updateStatus(true);
        return Result.success();
    }

    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncItemsWork(this);
    }
}
