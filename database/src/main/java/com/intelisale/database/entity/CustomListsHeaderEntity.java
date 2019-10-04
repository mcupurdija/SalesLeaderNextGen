package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.CUSTOM_LISTS_HEADERS, indices = {@Index(value = "serverID", unique = true)})
public class CustomListsHeaderEntity extends CodeBookColumns {

    private Integer salesLeaderSalesLevelTypeID;
    private Integer salesLevelID;
    private Boolean forAllUsers;

    public Integer getSalesLeaderSalesLevelTypeID() {
        return salesLeaderSalesLevelTypeID;
    }

    public void setSalesLeaderSalesLevelTypeID(Integer salesLeaderSalesLevelTypeID) {
        this.salesLeaderSalesLevelTypeID = salesLeaderSalesLevelTypeID;
    }

    public Integer getSalesLevelID() {
        return salesLevelID;
    }

    public void setSalesLevelID(Integer salesLevelID) {
        this.salesLevelID = salesLevelID;
    }

    public Boolean isForAllUsers() {
        return forAllUsers;
    }

    public void setForAllUsers(Boolean forAllUsers) {
        this.forAllUsers = forAllUsers;
    }
}
