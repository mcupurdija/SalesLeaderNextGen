package com.intelisale.database.repository;

import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

public class SyncRepository {

    private final GlobalDao globalDao;
    private final SyncStatusDao syncStatusDao;
    private final String groupName;

    SyncRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, String groupName) {
        this.globalDao = globalDao;
        this.syncStatusDao = syncStatusDao;
        this.groupName = groupName;
    }

    public String getModifiedDate(String tableName) {
        return globalDao.getMaxModifiedDate(tableName);
    }

    public void updateStatus(boolean success) {

        SyncStatusEntity syncStatusEntity = new SyncStatusEntity();
        syncStatusEntity.setId(syncStatusDao.getId(groupName));
        syncStatusEntity.setGroupName(groupName);
        syncStatusEntity.setSyncDate(DateUtils.formatDateTime(DateTime.now()));
        syncStatusEntity.setSyncProgress(100);
        syncStatusEntity.setStatus(success ? SyncStatusEntity.STATUS_SUCCESS : SyncStatusEntity.STATUS_FAIL);

        updateStatus(syncStatusEntity);
    }

    public void updateStatus(int percentageCompleted) {

        SyncStatusEntity syncStatusEntity = new SyncStatusEntity();
        syncStatusEntity.setId(syncStatusDao.getId(groupName));
        syncStatusEntity.setGroupName(groupName);
        syncStatusEntity.setSyncProgress(percentageCompleted);
        syncStatusEntity.setStatus(SyncStatusEntity.STATUS_IN_PROGRESS);

        updateStatus(syncStatusEntity);
    }

    private void updateStatus(SyncStatusEntity syncStatusEntity) {
        syncStatusDao.update(syncStatusEntity);
    }
}
