package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "GroupsOfCustomers")
public class GroupOfCustomersEntity extends CodeBookColumns {

    private String parentCode;
    private Integer parentGroupOfCustomerID;
    private Integer groupsOfCustomersLevelID;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getParentGroupOfCustomerID() {
        return parentGroupOfCustomerID;
    }

    public void setParentGroupOfCustomerID(Integer parentGroupOfCustomerID) {
        this.parentGroupOfCustomerID = parentGroupOfCustomerID;
    }

    public Integer getGroupsOfCustomersLevelID() {
        return groupsOfCustomersLevelID;
    }

    public void setGroupsOfCustomersLevelID(Integer groupsOfCustomersLevelID) {
        this.groupsOfCustomersLevelID = groupsOfCustomersLevelID;
    }
}
