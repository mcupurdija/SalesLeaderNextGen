package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SyncStatus")
public class SyncStatusEntity extends BaseColumns {

    public static final int STATUS_IN_PROGRESS = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_FAIL = 2;

    private String groupName;
    private String syncDate;
    private Integer syncProgress;
    private Integer status;

    public SyncStatusEntity() {
    }

    public SyncStatusEntity(String groupName, String syncDate, Integer syncProgress, Integer status) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}