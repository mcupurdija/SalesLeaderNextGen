package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerCustomLists")
public class CustomerCustomListEntity extends BaseAuditColumns {

    private Integer customerId;
    private Integer customListHeaderId;
    private String fromDate;
    private String toDate;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomListHeaderId() {
        return customListHeaderId;
    }

    public void setCustomListHeaderId(Integer customListHeaderId) {
        this.customListHeaderId = customListHeaderId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
