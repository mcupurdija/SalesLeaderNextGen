package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_SHELVES_PER_CUSTOMERS, indices = {@Index(value = "serverID", unique = true)})
public class SalesLeaderShelvePerCustomersEntity extends CodeBookColumns {

    private Integer shelfItemID;
    private Integer customerID;
    private Boolean shelfIsORSY100;

    public Integer getShelfItemID() {
        return shelfItemID;
    }

    public void setShelfItemID(Integer shelfItemID) {
        this.shelfItemID = shelfItemID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Boolean isShelfIsORSY100() {
        return shelfIsORSY100;
    }

    public void setShelfIsORSY100(Boolean shelfIsORSY100) {
        this.shelfIsORSY100 = shelfIsORSY100;
    }
}
