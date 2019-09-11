package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.ItemAllowedToCustomerDao;
import com.intelisale.database.dao.ItemConnectionsDao;
import com.intelisale.database.dao.ItemDao;
import com.intelisale.database.dao.ItemPackagesDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.ItemAllowedToCustomerEntity;
import com.intelisale.database.entity.ItemConnectionsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemPackagesEntity;

import java.util.List;

public class SyncItemsRepository extends SyncRepository {

    private final ItemDao itemDao;
    private final ItemConnectionsDao itemConnectionsDao;
    private final ItemPackagesDao itemPackagesDao;
    private final ItemAllowedToCustomerDao itemAllowedToCustomerDao;

    public SyncItemsRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, ItemDao itemDao, ItemConnectionsDao itemConnectionsDao, ItemPackagesDao itemPackagesDao, ItemAllowedToCustomerDao itemAllowedToCustomerDao) {
        super(globalDao, syncStatusDao, TableNames.ITEMS);

        this.itemDao = itemDao;
        this.itemConnectionsDao = itemConnectionsDao;
        this.itemPackagesDao = itemPackagesDao;
        this.itemAllowedToCustomerDao = itemAllowedToCustomerDao;
    }

    public void syncItems(List<ItemEntity> entityList) {
        itemDao.insertOrUpdate(entityList, TableNames.ITEMS);
    }

    public void syncItemConnections(List<ItemConnectionsEntity> entityList) {
        itemConnectionsDao.insertOrUpdate(entityList, TableNames.SL_ITEMS_CONNECTIONS);
    }

    public void syncItemPackages(List<ItemPackagesEntity> entityList) {
        itemPackagesDao.insertOrUpdate(entityList, TableNames.SL_ITEMS_PACKAGES);
    }

    public void syncItemAllowedToCustomer(List<ItemAllowedToCustomerEntity> entityList) {
        itemAllowedToCustomerDao.insertOrUpdate(entityList, TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER);
    }
}