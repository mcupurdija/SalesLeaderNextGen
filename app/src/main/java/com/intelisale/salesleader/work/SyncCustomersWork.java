package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.CustomerMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomListsLineEntity;
import com.intelisale.database.entity.CustomerCustomListEntity;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.entity.CustomerFrequenciesEntity;
import com.intelisale.database.entity.CustomerPlanTurnoverEntity;
import com.intelisale.database.entity.CustomerProcessEntity;
import com.intelisale.database.entity.CustomerProductGroupPotentialEntity;
import com.intelisale.database.entity.CustomerShipToAddressesEntity;
import com.intelisale.database.entity.CustomerStatisticsEntity;
import com.intelisale.database.entity.CustomerVisitsEntity;
import com.intelisale.database.entity.SalesLeaderCategoryAllowedToCustomerEntity;
import com.intelisale.database.entity.SalesLeaderShelvePerCustomersEntity;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.customers.CustomListLineSchema;
import com.intelisale.networking.schema.customers.CustomerCustomListSchema;
import com.intelisale.networking.schema.customers.CustomerFrequenciesSchema;
import com.intelisale.networking.schema.customers.CustomerPlanTurnoverSchema;
import com.intelisale.networking.schema.customers.CustomerProductGroupPotentialSchema;
import com.intelisale.networking.schema.customers.CustomerSchema;
import com.intelisale.networking.schema.customers.CustomerShipToAddressSchema;
import com.intelisale.networking.schema.customers.CustomerStatisticSchema;
import com.intelisale.networking.schema.customers.CustomerVisitSchema;
import com.intelisale.networking.schema.customers.SLCategoriesAllowedToCustomerSchema;
import com.intelisale.networking.schema.customers.SLProcessesPerCustomerSchema;
import com.intelisale.networking.schema.customers.SLShelvesPerCustomerSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
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

        // 0. CUSTOMER
        SyncObject obj0 = new SyncObject(SyncTableNames.Customers, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMERS), 500);
        // 1. CUSTOMER PROCESSES
        SyncObject obj1 = new SyncObject(SyncTableNames.SLProcessesPerCustomers, syncCustomersRepository.getModifiedDate(TableNames.SL_CUSTOMERS_PROCESSES), 1000);
        // 2. CUSTOMER SHELVES
        SyncObject obj2 = new SyncObject(SyncTableNames.SLShelvesPerCustomers, syncCustomersRepository.getModifiedDate(TableNames.SL_SHELVES_PER_CUSTOMERS), 1000);
        // 3. CUSTOMER SHIP TO ADDRESSES
        SyncObject obj3 = new SyncObject(SyncTableNames.CustomerShipToAddresses, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_SHIP_TO_ADDRESSES), 500);
        // 4. CATEGORIES ALLOWED TO CUSTOMER (USED TO FILTER NEW ITEMS)
        SyncObject obj4 = new SyncObject(SyncTableNames.SLCategoriesAllowedToCustomer, syncCustomersRepository.getModifiedDate(TableNames.SL_CATEGORIES_ALLOWED_TO_CUSTOMER), 1000);
        // 5. CUSTOMER VISITS
        SyncObject obj5 = new SyncObject(SyncTableNames.CustomerVisits, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_VISITS), 5000);
        // 6. CUSTOMER STATISTICS
        SyncObject obj6 = new SyncObject(SyncTableNames.CustomerStatistics, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_STATISTICS), 1000);
        // 7. CUSTOMER PLAN TURNOVER
        SyncObject obj7 = new SyncObject(SyncTableNames.CustomerPlanTurnover, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_PLAN_TURNOVER), 5000);
        // 8. CUSTOMER PRODUCT GROUP POTENTIAL
        SyncObject obj8 = new SyncObject(SyncTableNames.CustomerProductGroupPotential, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_PRODUCT_GROUP), 5000);
        // 9. CUSTOMER CUSTOM LISTS
        SyncObject obj9 = new SyncObject(SyncTableNames.CustomersCustomLists, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_CUSTOM_LISTS), 500);
        // 10. CUSTOM LISTS LINES
        SyncObject obj10 = new SyncObject(SyncTableNames.CustomListsLines, syncCustomersRepository.getModifiedDate(TableNames.CUSTOM_LISTS_LINES), 1000);
        // 11. CUSTOMER FREQUENCIES
        SyncObject obj11 = new SyncObject(SyncTableNames.VisitsFrequencies, syncCustomersRepository.getModifiedDate(TableNames.CUSTOMER_FREQUENCIES), 1000);

        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11});

        while (paginationHelper.setSyncRequest()) {

            syncCustomersRepository.updateProgress(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncCustomersResponseSchema>> call = syncApi.syncCustomers(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncCustomersResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncCustomersResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncCustomersResponseSchema syncCustomersResponseSchema = responseSchema.getData();
                        if (syncCustomersResponseSchema != null) {

                            // 0. CUSTOMER
                            BaseRecordSchema<CustomerSchema> customerRecordSchema = syncCustomersResponseSchema.getCustomers();
                            if (customerRecordSchema != null && customerRecordSchema.getRecords() != null) {

                                List<CustomerEntity> customerEntities = customerMapper.customerEntities(customerRecordSchema.getRecords());
                                syncCustomersRepository.syncCustomers(customerEntities);

                                paginationHelper.updateCounters(0, customerRecordSchema.getNumOfRecords());
                            }

                            // 1. CUSTOMER PROCESSES
                            BaseRecordSchema<SLProcessesPerCustomerSchema> slProcessesPerCustomersSchema = syncCustomersResponseSchema.getSlProcessesPerCustomers();
                            if (slProcessesPerCustomersSchema != null && slProcessesPerCustomersSchema.getRecords() != null) {

                                List<CustomerProcessEntity> customerProcessEntities = customerMapper.customerProcessEntities(slProcessesPerCustomersSchema.getRecords());
                                syncCustomersRepository.syncCustomerProcesses(customerProcessEntities);

                                paginationHelper.updateCounters(1, slProcessesPerCustomersSchema.getNumOfRecords());
                            }

                            // 2. CUSTOMER SHELVES
                            BaseRecordSchema<SLShelvesPerCustomerSchema> slShelvesPerCustomersSchema = syncCustomersResponseSchema.getSlShelvesPerCustomers();
                            if (slShelvesPerCustomersSchema != null && slShelvesPerCustomersSchema.getRecords() != null) {

                                List<SalesLeaderShelvePerCustomersEntity> salesLeaderShelvePerCustomersEntities = customerMapper.salesLeaderShelvePerCustomersEntities(slShelvesPerCustomersSchema.getRecords());
                                syncCustomersRepository.syncSalesLeaderShelvePerCustomers(salesLeaderShelvePerCustomersEntities);

                                paginationHelper.updateCounters(2, slShelvesPerCustomersSchema.getNumOfRecords());
                            }

                            // 3. CUSTOMER SHIP TO ADDRESSES
                            BaseRecordSchema<CustomerShipToAddressSchema> customerShipToAddressesSchema = syncCustomersResponseSchema.getCustomerShipToAddresses();
                            if (customerShipToAddressesSchema != null && customerShipToAddressesSchema.getRecords() != null) {

                                List<CustomerShipToAddressesEntity> customerShipToAddressesEntities = customerMapper.customerShipToAddressesEntities(customerShipToAddressesSchema.getRecords());
                                syncCustomersRepository.syncCustomerShipToAddresses(customerShipToAddressesEntities);

                                paginationHelper.updateCounters(3, customerShipToAddressesSchema.getNumOfRecords());
                            }

                            // 4. CATEGORIES ALLOWED TO CUSTOMER (USED TO FILTER NEW ITEMS)
                            BaseRecordSchema<SLCategoriesAllowedToCustomerSchema> slCategoriesAllowedToCustomersSchema = syncCustomersResponseSchema.getSlCategoriesAllowedToCustomer();
                            if (slCategoriesAllowedToCustomersSchema != null && slCategoriesAllowedToCustomersSchema.getRecords() != null) {

                                List<SalesLeaderCategoryAllowedToCustomerEntity> salesLeaderCategoryAllowedToCustomerEntities = customerMapper.salesLeaderCategoryAllowedToCustomerEntities(slCategoriesAllowedToCustomersSchema.getRecords());
                                syncCustomersRepository.syncSalesLeaderCategoryAllowedToCustomer(salesLeaderCategoryAllowedToCustomerEntities);

                                paginationHelper.updateCounters(4, slCategoriesAllowedToCustomersSchema.getNumOfRecords());
                            }

                            // 5. CUSTOMER VISITS
                            BaseRecordSchema<CustomerVisitSchema> customerVisitsSchema = syncCustomersResponseSchema.getCustomerVisits();
                            if (customerVisitsSchema != null && customerVisitsSchema.getRecords() != null) {

                                List<CustomerVisitsEntity> customerVisitsEntities = customerMapper.customerVisitsEntities(customerVisitsSchema.getRecords());
                                syncCustomersRepository.syncCustomerVisits(customerVisitsEntities);

                                paginationHelper.updateCounters(5, customerVisitsSchema.getNumOfRecords());
                            }

                            // 6. CUSTOMER STATISTICS
                            BaseRecordSchema<CustomerStatisticSchema> customerStatisticsSchema = syncCustomersResponseSchema.getCustomerStatistics();
                            if (customerStatisticsSchema != null && customerStatisticsSchema.getRecords() != null) {

                                List<CustomerStatisticsEntity> customerStatisticsEntities = customerMapper.customerStatisticsEntities(customerStatisticsSchema.getRecords());
                                syncCustomersRepository.syncCustomerStatistics(customerStatisticsEntities);

                                paginationHelper.updateCounters(6, customerStatisticsSchema.getNumOfRecords());
                            }

                            // 7. CUSTOMER PLAN TURNOVER
                            BaseRecordSchema<CustomerPlanTurnoverSchema> customerPlanTurnoversSchema = syncCustomersResponseSchema.getCustomerPlanTurnover();
                            if (customerPlanTurnoversSchema != null && customerPlanTurnoversSchema.getRecords() != null) {

                                List<CustomerPlanTurnoverEntity> customerPlanTurnoverEntities = customerMapper.customerPlanTurnoverEntities(customerPlanTurnoversSchema.getRecords());
                                syncCustomersRepository.syncCustomerPlanTurnover(customerPlanTurnoverEntities);

                                paginationHelper.updateCounters(7, customerPlanTurnoversSchema.getNumOfRecords());
                            }

                            // 8. CUSTOMER PRODUCT GROUP POTENTIAL
                            BaseRecordSchema<CustomerProductGroupPotentialSchema> customerProductGroupPotentialsSchema = syncCustomersResponseSchema.getCustomerProductGroupPotential();
                            if (customerProductGroupPotentialsSchema != null && customerProductGroupPotentialsSchema.getRecords() != null) {

                                List<CustomerProductGroupPotentialEntity> customerProductGroupPotentialEntities = customerMapper.customerProductGroupPotentialEntities(customerProductGroupPotentialsSchema.getRecords());
                                syncCustomersRepository.syncCustomerProductGroupPotential(customerProductGroupPotentialEntities);

                                paginationHelper.updateCounters(8, customerProductGroupPotentialsSchema.getNumOfRecords());
                            }

                            // 9. CUSTOMER CUSTOM LISTS
                            BaseRecordSchema<CustomerCustomListSchema> customerCustomListsSchema = syncCustomersResponseSchema.getCustomerCustomLists();
                            if (customerCustomListsSchema != null && customerCustomListsSchema.getRecords() != null) {

                                List<CustomerCustomListEntity> customerCustomListEntities = customerMapper.customerCustomListEntities(customerCustomListsSchema.getRecords());
                                syncCustomersRepository.syncCustomerCustomLists(customerCustomListEntities);

                                paginationHelper.updateCounters(9, customerCustomListsSchema.getNumOfRecords());
                            }

                            // 10. CUSTOM LISTS LINES
                            BaseRecordSchema<CustomListLineSchema> customListLinesSchema = syncCustomersResponseSchema.getCustomListLines();
                            if (customListLinesSchema != null && customListLinesSchema.getRecords() != null) {

                                List<CustomListsLineEntity> customListsLineEntities = customerMapper.customListsLineEntities(customListLinesSchema.getRecords());
                                syncCustomersRepository.syncCustomListsLines(customListsLineEntities);

                                paginationHelper.updateCounters(10, customListLinesSchema.getNumOfRecords());
                            }

                            // 11. CUSTOMER FREQUENCIES
                            BaseRecordSchema<CustomerFrequenciesSchema> customerFrequenciesSchema = syncCustomersResponseSchema.getCustomerFrequencies();
                            if (customerFrequenciesSchema != null && customerFrequenciesSchema.getRecords() != null) {

                                List<CustomerFrequenciesEntity> customerFrequenciesEntities = customerMapper.customerFrequenciesEntities(customerFrequenciesSchema.getRecords());
                                syncCustomersRepository.syncCustomerFrequencies(customerFrequenciesEntities);

                                paginationHelper.updateCounters(11, customerFrequenciesSchema.getNumOfRecords());
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
                .injectSyncCustomersWork(this);
    }
}
