package com.intelisale.database.repository;

import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.SyncStatusDao;

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

    public void updateProgress(int syncProgress) {
        syncStatusDao.updateProgress(groupName, syncProgress);
    }
}
