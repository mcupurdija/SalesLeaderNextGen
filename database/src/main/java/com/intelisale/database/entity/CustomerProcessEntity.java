package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_CUSTOMERS_PROCESSES)
public class CustomerProcessEntity extends CodeBookColumns {

    private Integer processID;
    private Integer customerID;

    public Integer getProcessID() {
        return processID;
    }

    public void setProcessID(Integer processID) {
        this.processID = processID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }
}
