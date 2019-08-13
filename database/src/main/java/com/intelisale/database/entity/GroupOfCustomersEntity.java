package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "GroupsOfCustomers")
public class GroupOfCustomersEntity extends CodeBookColumns {

    private String parentCode;
    private int parentGroupOfCustomerId;
    private int groupsOfCustomersLevelId;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public int getParentGroupOfCustomerId() {
        return parentGroupOfCustomerId;
    }

    public void setParentGroupOfCustomerId(int parentGroupOfCustomerId) {
        this.parentGroupOfCustomerId = parentGroupOfCustomerId;
    }

    public int getGroupsOfCustomersLevelId() {
        return groupsOfCustomersLevelId;
    }

    public void setGroupsOfCustomersLevelId(int groupsOfCustomersLevelId) {
        this.groupsOfCustomersLevelId = groupsOfCustomersLevelId;
    }
}
