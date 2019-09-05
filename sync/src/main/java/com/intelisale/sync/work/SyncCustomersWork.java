package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.customers.CustomerSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
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

public class SyncCustomersWork extends BaseWorker {

    private static final int CUSTOMERS_PAGE_SIZE = 500;

    private int customersCounter = 0, customersResultsCounter;
    private int percentageCompleted;

    private Map<String, SyncSchema> syncRequest;

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

        while (setSyncRequest()) {

            Call<BaseSchema<SyncCustomersResponseSchema>> call = syncApi.syncCustomers(1, new ArrayList<>(syncRequest.values()));
            try {
                Response<BaseSchema<SyncCustomersResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncCustomersResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncCustomersResponseSchema syncCustomersResponseSchema = responseSchema.getData();
                        if (syncCustomersResponseSchema != null) {

                            BaseRecordSchema<CustomerSchema> customerRecordSchema = syncCustomersResponseSchema.getCustomers();
                            if (customerRecordSchema != null) {

                                if (customerRecordSchema.getRecords() != null && customerRecordSchema.getRecords().size() > 0) {

                                    List<CustomerEntity> customerEntityList = new ArrayList<>();
                                    for (CustomerSchema customerSchema : customerRecordSchema.getRecords()) {

                                        CustomerEntity customerEntity = new CustomerEntity();

                                        customerEntity.setServerId(customerSchema.getId());
                                        customerEntity.setName(customerSchema.getName());
                                        customerEntity.setModifiedDate(customerSchema.getModifiedDate());

                                        customerEntityList.add(customerEntity);
                                    }
                                    syncCustomersRepository.syncCustomers(customerEntityList);
                                    customersCounter += CUSTOMERS_PAGE_SIZE;
                                }
                                customersResultsCounter = customerRecordSchema.getNumOfRecords();
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
            // CUSTOMERS
            syncRequest.put(TableNames.CUSTOMERS, new SyncSchema(SyncTableNames.Customers, syncCustomersRepository.getCustomersModifiedDate(), customersCounter, CUSTOMERS_PAGE_SIZE));

        } else {
            percentageCompleted = 0;

            if (customersCounter < customersResultsCounter) {
                Objects.requireNonNull(syncRequest.get(TableNames.CUSTOMERS)).setPageNumber(customersCounter);
                addPercentageCompleted(customersCounter);
            } else {
                syncRequest.remove(TableNames.CUSTOMERS);
                addPercentageCompleted(customersResultsCounter);
            }

            if (syncRequest.size() > 0) {

                if (syncRequest.containsKey(TableNames.CUSTOMERS))
                    Objects.requireNonNull(syncRequest.get(TableNames.CUSTOMERS)).setPageSize(CUSTOMERS_PAGE_SIZE);

            }
        }

//        updateSyncProgress

        return syncRequest.size() > 0;
    }

    private void addPercentageCompleted(int value) {

        int resultSum = customersResultsCounter;
        if (resultSum != 0) percentageCompleted += value * 100 / resultSum;
    }


    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncCustomersWork(this);
    }
}
