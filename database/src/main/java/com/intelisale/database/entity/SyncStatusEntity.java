package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SyncStatus")
public class SyncStatusEntity extends BaseColumns {

    private String groupName;
    private String syncDate;
    private Integer syncProgress;
    private String status;

    public SyncStatusEntity() {
    }

    @Ignore
    public SyncStatusEntity(String groupName, String syncDate, Integer syncProgress, String status) {
        this.groupName = groupName;
        this.syncDate = syncDate;
        this.syncProgress = syncProgress;
        this.status = status;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}