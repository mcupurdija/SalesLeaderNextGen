package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

import org.joda.time.DateTime;

@Entity(tableName = "SyncStatus")
public class SyncStatusEntity extends BaseColumns {

    private String tableName;
    private DateTime syncDate;
    private int syncProgress;
    private int status;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DateTime getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(DateTime syncDate) {
        this.syncDate = syncDate;
    }

    public int getSyncProgress() {
        return syncProgress;
    }

    public void setSyncProgress(int syncProgress) {
        this.syncProgress = syncProgress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
