package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_CUSTOM_LISTS)
public class CustomerCustomListEntity extends BaseAuditColumns {

    private Integer customerID;
    private Integer customListHeaderID;
    private String fromDate;
    private String toDate;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getCustomListHeaderID() {
        return customListHeaderID;
    }

    public void setCustomListHeaderID(Integer customListHeaderID) {
        this.customListHeaderID = customListHeaderID;
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
