package com.intelisale.database.repository;

import android.util.SparseIntArray;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.ItemAllowedToCustomerDao;
import com.intelisale.database.dao.ItemConnectionsDao;
import com.intelisale.database.dao.ItemDao;
import com.intelisale.database.dao.ItemPackagesDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.ItemAllowedToCustomerEntity;
import com.intelisale.database.entity.ItemConnectionsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemPackagesEntity;
import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

import java.util.List;

public class SyncItemsRepository {

    private final ItemDao itemDao;
    private final SparseIntArray itemsIdServerIdArray;
    private final ItemConnectionsDao itemConnectionsDao;
    private final SparseIntArray itemConnectionsIdServerIdArray;
    private final ItemPackagesDao itemPackagesDao;
    private final SparseIntArray itemPackagesIdServerIdArray;
    private final ItemAllowedToCustomerDao itemAllowedToCustomerDao;
    private final SparseIntArray itemAllowedToCustomerIdServerIdArray;
    private final SyncStatusDao syncStatusDao;

    public SyncItemsRepository(ItemDao itemDao, ItemConnectionsDao itemConnectionsDao, ItemPackagesDao itemPackagesDao, ItemAllowedToCustomerDao itemAllowedToCustomerDao, SyncStatusDao syncStatusDao) {
        this.itemDao = itemDao;
        itemsIdServerIdArray = itemDao.getIdServerId(TableNames.ITEMS);
        this.itemConnectionsDao = itemConnectionsDao;
        itemConnectionsIdServerIdArray = itemConnectionsDao.getIdServerId(TableNames.SL_ITEMS_CONNECTIONS);
        this.itemPackagesDao = itemPackagesDao;
        itemPackagesIdServerIdArray = itemPackagesDao.getIdServerId(TableNames.SL_ITEMS_PACKAGES);
        this.itemAllowedToCustomerDao = itemAllowedToCustomerDao;
        itemAllowedToCustomerIdServerIdArray = itemAllowedToCustomerDao.getIdServerId(TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER);
        this.syncStatusDao = syncStatusDao;
    }

    public String getModifiedDate(String tableName) {
        switch (tableName) {
            case TableNames.ITEMS:
                return itemDao.getMaxModifiedDate(TableNames.ITEMS);
            case TableNames.SL_ITEMS_CONNECTIONS:
                return itemConnectionsDao.getMaxModifiedDate(TableNames.SL_ITEMS_CONNECTIONS);
            case TableNames.SL_ITEMS_PACKAGES:
                return itemPackagesDao.getMaxModifiedDate(TableNames.SL_ITEMS_PACKAGES);
            case TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER:
                return itemAllowedToCustomerDao.getMaxModifiedDate(TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER);
        }
        return null;
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

    public void updateStatus(boolean status) {

        SyncStatusEntity syncStatusEntity = new SyncStatusEntity();
        syncStatusEntity.setId(syncStatusDao.getId(TableNames.ITEMS));
        syncStatusEntity.setGroupName(TableNames.ITEMS);
        syncStatusEntity.setSyncDate(DateUtils.formatDateTime(DateTime.now()));
        syncStatusEntity.setSyncProgress(100);
        syncStatusEntity.setStatus(status ? SyncStatusEntity.STATUS_SUCCESS : SyncStatusEntity.STATUS_FAIL);

        updateStatus(syncStatusEntity);
    }

    public void updateStatus(int percentageCompleted) {

        SyncStatusEntity syncStatusEntity = new SyncStatusEntity();
        syncStatusEntity.setId(syncStatusDao.getId(TableNames.ITEMS));
        syncStatusEntity.setGroupName(TableNames.ITEMS);
        syncStatusEntity.setSyncProgress(percentageCompleted);
        syncStatusEntity.setStatus(SyncStatusEntity.STATUS_IN_PROGRESS);

        updateStatus(syncStatusEntity);
    }

    private void updateStatus(SyncStatusEntity syncStatusEntity) {
        syncStatusDao.update(syncStatusEntity);
    }
}