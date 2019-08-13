package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderShelvesPerCustomers")
public class SalesLeaderShelvePerCustomersEntity extends CodeBookColumns {

    private int shelfItemId;
    private int customerId;
    private boolean shelfIsORSY100;

    public int getShelfItemId() {
        return shelfItemId;
    }

    public void setShelfItemId(int shelfItemId) {
        this.shelfItemId = shelfItemId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean isShelfIsORSY100() {
        return shelfIsORSY100;
    }

    public void setShelfIsORSY100(boolean shelfIsORSY100) {
        this.shelfIsORSY100 = shelfIsORSY100;
    }
}
