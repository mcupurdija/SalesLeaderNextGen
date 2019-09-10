package com.intelisale.database.repository;

import android.util.SparseIntArray;

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

    private final SparseIntArray itemsIdServerIdArray, itemConnectionsIdServerIdArray, itemPackagesIdServerIdArray, itemAllowedToCustomerIdServerIdArray;

    public SyncItemsRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, ItemDao itemDao, ItemConnectionsDao itemConnectionsDao, ItemPackagesDao itemPackagesDao, ItemAllowedToCustomerDao itemAllowedToCustomerDao) {
        super(globalDao, syncStatusDao, TableNames.ITEMS);

        this.itemDao = itemDao;
        this.itemConnectionsDao = itemConnectionsDao;
        this.itemPackagesDao = itemPackagesDao;
        this.itemAllowedToCustomerDao = itemAllowedToCustomerDao;

        itemsIdServerIdArray = globalDao.getIdServerId(TableNames.ITEMS);
        itemConnectionsIdServerIdArray = globalDao.getIdServerId(TableNames.SL_ITEMS_CONNECTIONS);
        itemPackagesIdServerIdArray = globalDao.getIdServerId(TableNames.SL_ITEMS_PACKAGES);
        itemAllowedToCustomerIdServerIdArray = globalDao.getIdServerId(TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER);
    }

    public void syncItems(List<ItemEntity> entityList) {
        itemDao.insertOrUpdateByServerId(entityList, itemsIdServerIdArray);
    }

    public void syncItemConnections(List<ItemConnectionsEntity> entityList) {
        itemConnectionsDao.insertOrUpdateByServerId(entityList, itemConnectionsIdServerIdArray);
    }

    public void syncItemPackages(List<ItemPackagesEntity> entityList) {
        itemPackagesDao.insertOrUpdateByServerId(entityList, itemPackagesIdServerIdArray);
    }

    public void syncItemAllowedToCustomer(List<ItemAllowedToCustomerEntity> entityList) {
        itemAllowedToCustomerDao.insertOrUpdateByServerId(entityList, itemAllowedToCustomerIdServerIdArray);
    }
}