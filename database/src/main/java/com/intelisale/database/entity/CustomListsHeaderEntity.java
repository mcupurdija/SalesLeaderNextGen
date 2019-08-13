package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "CustomListsHeaders")
public class CustomListsHeaderEntity extends CodeBookColumns {

    private int salesLeaderSalesLevelTypeId;
    private int salesLevelId;
    private boolean forAllUsers;

    public int getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(int salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
    }

    public int getSalesLevelId() {
        return salesLevelId;
    }

    public void setSalesLevelId(int salesLevelId) {
        this.salesLevelId = salesLevelId;
    }

    public boolean isForAllUsers() {
        return forAllUsers;
    }

    public void setForAllUsers(boolean forAllUsers) {
        this.forAllUsers = forAllUsers;
    }
}
