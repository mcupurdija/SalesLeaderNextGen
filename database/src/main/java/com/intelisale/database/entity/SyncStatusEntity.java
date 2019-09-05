package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SyncStatus")
public class SyncStatusEntity extends BaseColumns {

    private String tableName;
    private String syncDate;
    private Integer syncProgress;
    private Integer status;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public Integer getSyncProgress() {
        return syncProgress;
    }

    public void setSyncProgress(Integer syncProgress) {
        this.syncProgress = syncProgress;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
