package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "StockInventoryHeaders")
public class StockInventoryHeaderEntity extends BaseAuditColumns {

    private Integer customerID;
    private Boolean sent;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
