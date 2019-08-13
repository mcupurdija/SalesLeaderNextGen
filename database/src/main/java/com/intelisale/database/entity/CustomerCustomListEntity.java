package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "CustomerCustomLists")
public class CustomerCustomListEntity extends BaseAuditColumns {

    private int customerId;
    private int customListHeaderId;
    private DateTime fromDate;
    private DateTime toDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomListHeaderId() {
        return customListHeaderId;
    }

    public void setCustomListHeaderId(int customListHeaderId) {
        this.customListHeaderId = customListHeaderId;
    }

    public DateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(DateTime fromDate) {
        this.fromDate = fromDate;
    }

    public DateTime getToDate() {
        return toDate;
    }

    public void setToDate(DateTime toDate) {
        this.toDate = toDate;
    }
}
