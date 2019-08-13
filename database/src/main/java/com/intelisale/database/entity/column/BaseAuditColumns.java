package com.intelisale.database.entity.column;

import org.joda.time.DateTime;

public class BaseAuditColumns extends BaseColumns {

    private int serverId;
//    private int financialEntityId;
    private DateTime modifiedDate;
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


    public DateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(DateTime modifiedDate) {
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
