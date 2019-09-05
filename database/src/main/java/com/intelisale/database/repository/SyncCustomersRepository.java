package com.intelisale.database.repository;

import android.util.SparseIntArray;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.CustomListsLineDao;
import com.intelisale.database.dao.CustomerCustomListDao;
import com.intelisale.database.dao.CustomerDao;
import com.intelisale.database.dao.CustomerPlanTurnoverDao;
import com.intelisale.database.dao.CustomerProcessDao;
import com.intelisale.database.dao.CustomerProductGroupPotentialDao;
import com.intelisale.database.dao.CustomerShipToAddressesDao;
import com.intelisale.database.dao.CustomerStatisticsDao;
import com.intelisale.database.dao.CustomerVisitsDao;
import com.intelisale.database.dao.SalesLeaderCategoryAllowedToCustomerDao;
import com.intelisale.database.dao.SalesLeaderShelvePerCustomersDao;
import com.intelisale.database.entity.CustomListsLineEntity;
import com.intelisale.database.entity.CustomerCustomListEntity;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.entity.CustomerPlanTurnoverEntity;
import com.intelisale.database.entity.CustomerProcessEntity;
import com.intelisale.database.entity.CustomerProductGroupPotentialEntity;
import com.intelisale.database.entity.CustomerShipToAddressesEntity;
import com.intelisale.database.entity.CustomerStatisticsEntity;
import com.intelisale.database.entity.CustomerVisitsEntity;
import com.intelisale.database.entity.SalesLeaderCategoryAllowedToCustomerEntity;
import com.intelisale.database.entity.SalesLeaderShelvePerCustomersEntity;
import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

import java.util.List;

public class SyncCustomersRepository {

    private final CustomerDao customerDao;
    private final SparseIntArray customersIdServerIdArray;

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

    public SyncCustomersRepository(CustomerDao customerDao, CustomerProcessDao customerProcessDao, CustomerShipToAddressesDao customerShipToAddressesDao, CustomerVisitsDao customerVisitsDao, CustomerStatisticsDao customerStatisticsDao, CustomerPlanTurnoverDao customerPlanTurnoverDao, CustomerProductGroupPotentialDao customerProductGroupPotentialDao, CustomerCustomListDao customerCustomListDao, CustomListsLineDao customListsLineDao, SalesLeaderShelvePerCustomersDao salesLeaderShelvePerCustomersDao, SalesLeaderCategoryAllowedToCustomerDao salesLeaderCategoryAllowedToCustomerDao) {
        this.customerDao = customerDao;
        customersIdServerIdArray = customerDao.getIdServerId(TableNames.CUSTOMERS);
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
    }

    public String getCustomersModifiedDate() {
        if (customerDao.getCount(TableNames.CUSTOMERS) > 0) {
            return customerDao.getMaxModifiedDate(TableNames.CUSTOMERS);
        } else {
            return DateUtils.formatDateTime(new DateTime(1970, 1, 1, 0, 0, 0));
        }
    }

    public void syncCustomers(List<CustomerEntity> entityList) {
        customerDao.insertOrUpdateByServerId(entityList, customersIdServerIdArray);
    }

    public void syncCustomerProcesses(List<CustomerProcessEntity> entityList, SparseIntArray idServerIdArray) {
        customerProcessDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerShipToAddresses(List<CustomerShipToAddressesEntity> entityList, SparseIntArray idServerIdArray) {
        customerShipToAddressesDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerVisits(List<CustomerVisitsEntity> entityList, SparseIntArray idServerIdArray) {
        customerVisitsDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerStatistics(List<CustomerStatisticsEntity> entityList, SparseIntArray idServerIdArray) {
        customerStatisticsDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerPlanTurnover(List<CustomerPlanTurnoverEntity> entityList, SparseIntArray idServerIdArray) {
        customerPlanTurnoverDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerProductGroupPotential(List<CustomerProductGroupPotentialEntity> entityList, SparseIntArray idServerIdArray) {
        customerProductGroupPotentialDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomerCustomLists(List<CustomerCustomListEntity> entityList, SparseIntArray idServerIdArray) {
        customerCustomListDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncCustomListsLines(List<CustomListsLineEntity> entityList, SparseIntArray idServerIdArray) {
        customListsLineDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncSalesLeaderShelvePerCustomers(List<SalesLeaderShelvePerCustomersEntity> entityList, SparseIntArray idServerIdArray) {
        salesLeaderShelvePerCustomersDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }

    public void syncSalesLeaderCategoryAllowedToCustomer(List<SalesLeaderCategoryAllowedToCustomerEntity> entityList, SparseIntArray idServerIdArray) {
        salesLeaderCategoryAllowedToCustomerDao.insertOrUpdateByServerId(entityList, idServerIdArray);
    }
}