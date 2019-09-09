package com.intelisale.database.entity.column;

import androidx.room.ColumnInfo;

public class BaseAuditColumns extends BaseColumns {

    private Integer serverID;

    private Integer modifiedByUserID;

    @ColumnInfo(defaultValue = "1970-01-01T00:00:00.000")
    private String modifiedDate;

    @ColumnInfo(defaultValue = "0")
    private Integer auditID;

    @ColumnInfo(defaultValue = "1")
    private Boolean active;

    public Integer getServerID() {
        return serverID;
    }

    public void setServerID(Integer serverID) {
        this.serverID = serverID;
    }

    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getAuditID() {
        return auditID;
    }

    public void setAuditID(Integer auditID) {
        this.auditID = auditID;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
