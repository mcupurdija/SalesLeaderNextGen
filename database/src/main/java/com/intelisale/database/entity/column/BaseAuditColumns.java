package com.intelisale.database.entity.column;

import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

public class BaseAuditColumns extends BaseColumns {

    private int serverId;
//    private int financialEntityId;
    private String modifiedDate;
    private int auditId;
    private int modifiedByUserId;
    private boolean active;

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

//    public int getFinancialEntityId() {
//        return financialEntityId;
//    }
//
//    public void setFinancialEntityId(int financialEntityId) {
//        this.financialEntityId = financialEntityId;
//    }

    public String getModifiedDate() {
        if (modifiedDate != null) return modifiedDate;
        return DateUtils.formatDateTime(new DateTime(1970, 1, 1, 0, 0, 0));
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public int getModifiedByUserId() {
        return modifiedByUserId;
    }

    public void setModifiedByUserId(int modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
