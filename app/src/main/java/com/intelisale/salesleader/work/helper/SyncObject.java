package com.intelisale.salesleader.work.helper;

public class SyncObject {

    private String syncTableName;
    private String modifiedDate;
    private final int pageSize;

    public SyncObject(String syncTableName, String modifiedDate, int pageSize) {
        this.syncTableName = syncTableName;
        this.modifiedDate = modifiedDate;
        this.pageSize = pageSize;
    }

    public String getSyncTableName() {
        return syncTableName;
    }

    public void setSyncTableName(String syncTableName) {
        this.syncTableName = syncTableName;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getPageSize() {
        return pageSize;
    }
}
