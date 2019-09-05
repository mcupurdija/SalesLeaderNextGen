package com.intelisale.database.entity.column;

import androidx.room.ColumnInfo;

public class BaseAuditColumns extends BaseColumns {

    private Integer serverId;

    private Integer modifiedByUserId;

    @ColumnInfo(defaultValue = "1970-01-01T00:00:00.000")
    private String modifiedDate;

    @ColumnInfo(defaultValue = "0")
    private Integer auditId;

    @ColumnInfo(defaultValue = "1")
    private Boolean active;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Integer getModifiedByUserId() {
        return modifiedByUserId;
    }

    public void setModifiedByUserId(Integer modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
