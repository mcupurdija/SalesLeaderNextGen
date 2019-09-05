package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderShelvesPerCustomers")
public class SalesLeaderShelvePerCustomersEntity extends CodeBookColumns {

    private Integer shelfItemId;
    private Integer customerId;
    private Boolean shelfIsORSY100;

    public Integer getShelfItemId() {
        return shelfItemId;
    }

    public void setShelfItemId(Integer shelfItemId) {
        this.shelfItemId = shelfItemId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Boolean isShelfIsORSY100() {
        return shelfIsORSY100;
    }

    public void setShelfIsORSY100(Boolean shelfIsORSY100) {
        this.shelfIsORSY100 = shelfIsORSY100;
    }
}
