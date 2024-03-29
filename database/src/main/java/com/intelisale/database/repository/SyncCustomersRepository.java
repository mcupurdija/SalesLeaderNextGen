package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.CustomListsLineDao;
import com.intelisale.database.dao.CustomerCustomListDao;
import com.intelisale.database.dao.CustomerDao;
import com.intelisale.database.dao.CustomerFrequenciesDao;
import com.intelisale.database.dao.CustomerPlanTurnoverDao;
import com.intelisale.database.dao.CustomerProcessDao;
import com.intelisale.database.dao.CustomerProductGroupPotentialDao;
import com.intelisale.database.dao.CustomerShipToAddressesDao;
import com.intelisale.database.dao.CustomerStatisticsDao;
import com.intelisale.database.dao.CustomerVisitsDao;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.SalesLeaderCategoryAllowedToCustomerDao;
import com.intelisale.database.dao.SalesLeaderShelvePerCustomersDao;
import com.intelisale.database.dao.SyncStatusDao;
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

import java.util.List;

public class SyncCustomersRepository extends SyncRepository {

    private final CustomerDao customerDao;
    private final CustomerProcessDao customerProcessDao;
    private final CustomerShipToAddressesDao customerShipToAddressesDao;
    private final CustomerVisitsDao customerVisitsDao;
    private final CustomerStatisticsDao customerStatisticsDao;
    private final CustomerPlanTurnoverDao customerPlanTurnoverDao;
    private final CustomerProductGroupPotentialDao customerProductGroupPotentialDao;
    private final CustomerCustomListDao customerCustomListDao;
    private final CustomListsLineDao customListsLineDao;
    private final SalesLeaderShelvePerCustomersDao salesLeaderShelvePerCustomersDao;
    private final SalesLeaderCategoryAllowedToCustomerDao salesLeaderCategoryAllowedToCustomerDao;
    private final CustomerFrequenciesDao customerFrequenciesDao;


    public SyncCustomersRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, CustomerDao customerDao, CustomerProcessDao customerProcessDao, CustomerShipToAddressesDao customerShipToAddressesDao, CustomerVisitsDao customerVisitsDao, CustomerStatisticsDao customerStatisticsDao, CustomerPlanTurnoverDao customerPlanTurnoverDao, CustomerProductGroupPotentialDao customerProductGroupPotentialDao, CustomerCustomListDao customerCustomListDao, CustomListsLineDao customListsLineDao, SalesLeaderShelvePerCustomersDao salesLeaderShelvePerCustomersDao, SalesLeaderCategoryAllowedToCustomerDao salesLeaderCategoryAllowedToCustomerDao, CustomerFrequenciesDao customerFrequenciesDao) {
        super(globalDao, syncStatusDao, TableNames.CUSTOMERS);

        this.customerDao = customerDao;
        this.customerProcessDao = customerProcessDao;
        this.customerShipToAddressesDao = customerShipToAddressesDao;
        this.customerVisitsDao = customerVisitsDao;
        this.customerStatisticsDao = customerStatisticsDao;
        this.customerPlanTurnoverDao = customerPlanTurnoverDao;
        this.customerProductGroupPotentialDao = customerProductGroupPotentialDao;
        this.customerCustomListDao = customerCustomListDao;
        this.customListsLineDao = customListsLineDao;
        this.salesLeaderShelvePerCustomersDao = salesLeaderShelvePerCustomersDao;
        this.salesLeaderCategoryAllowedToCustomerDao = salesLeaderCategoryAllowedToCustomerDao;
        this.customerFrequenciesDao = customerFrequenciesDao;
    }

    public void syncCustomers(List<CustomerEntity> entityList) {
        customerDao.insertOrUpdate(entityList, TableNames.CUSTOMERS);
    }

    public void syncCustomerProcesses(List<CustomerProcessEntity> entityList) {
        customerProcessDao.insertOrUpdate(entityList, TableNames.SL_CUSTOMERS_PROCESSES);
    }

    public void syncCustomerShipToAddresses(List<CustomerShipToAddressesEntity> entityList) {
        customerShipToAddressesDao.insertOrUpdate(entityList, TableNames.CUSTOMER_SHIP_TO_ADDRESSES);
    }

    public void syncCustomerVisits(List<CustomerVisitsEntity> entityList) {
        customerVisitsDao.insertOrUpdate(entityList, TableNames.CUSTOMER_VISITS);
    }

    public void syncCustomerStatistics(List<CustomerStatisticsEntity> entityList) {
        customerStatisticsDao.insertOrUpdate(entityList, TableNames.CUSTOMER_STATISTICS);
    }

    public void syncCustomerPlanTurnover(List<CustomerPlanTurnoverEntity> entityList) {
        customerPlanTurnoverDao.insertOrUpdate(entityList, TableNames.CUSTOMER_PLAN_TURNOVER);
    }

    public void syncCustomerProductGroupPotential(List<CustomerProductGroupPotentialEntity> entityList) {
        customerProductGroupPotentialDao.insertOrUpdate(entityList, TableNames.CUSTOMER_PRODUCT_GROUP);
    }

    public void syncCustomerCustomLists(List<CustomerCustomListEntity> entityList) {
        customerCustomListDao.insertOrUpdate(entityList, TableNames.CUSTOMER_CUSTOM_LISTS);
    }

    public void syncCustomListsLines(List<CustomListsLineEntity> entityList) {
        customListsLineDao.insertOrUpdate(entityList, TableNames.CUSTOM_LISTS_LINES);
    }

    public void syncSalesLeaderShelvePerCustomers(List<SalesLeaderShelvePerCustomersEntity> entityList) {
        salesLeaderShelvePerCustomersDao.insertOrUpdate(entityList, TableNames.SL_SHELVES_PER_CUSTOMERS);
    }

    public void syncSalesLeaderCategoryAllowedToCustomer(List<SalesLeaderCategoryAllowedToCustomerEntity> entityList) {
        salesLeaderCategoryAllowedToCustomerDao.insertOrUpdate(entityList, TableNames.SL_CATEGORIES_ALLOWED_TO_CUSTOMER);
    }

    public void syncCustomerFrequencies(List<CustomerFrequenciesEntity> entityList) {
        customerFrequenciesDao.insertOrUpdate(entityList, TableNames.CUSTOMER_FREQUENCIES);
    }
}