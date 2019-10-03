package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.CUSTOM_LISTS_HEADERS, indices = {@Index(value = "serverID", unique = true)})
public class CustomListsHeaderEntity extends CodeBookColumns {

    private Integer salesLeaderSalesLevelTypeId;
    private Integer salesLevelId;
    private Boolean forAllUsers;

    public Integer getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(Integer salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
    }

    public Integer getSalesLevelId() {
        return salesLevelId;
    }

    public void setSalesLevelId(Integer salesLevelId) {
        this.salesLevelId = salesLevelId;
    }

    public Boolean isForAllUsers() {
        return forAllUsers;
    }

    public void setForAllUsers(Boolean forAllUsers) {
        this.forAllUsers = forAllUsers;
    }
}
