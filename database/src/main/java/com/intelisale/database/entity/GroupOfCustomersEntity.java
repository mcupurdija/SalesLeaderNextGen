package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "GroupsOfCustomers")
public class GroupOfCustomersEntity extends CodeBookColumns {

    private String parentCode;
    private Integer parentGroupOfCustomerId;
    private Integer groupsOfCustomersLevelId;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getParentGroupOfCustomerId() {
        return parentGroupOfCustomerId;
    }

    public void setParentGroupOfCustomerId(Integer parentGroupOfCustomerId) {
        this.parentGroupOfCustomerId = parentGroupOfCustomerId;
    }

    public Integer getGroupsOfCustomersLevelId() {
        return groupsOfCustomersLevelId;
    }

    public void setGroupsOfCustomersLevelId(Integer groupsOfCustomersLevelId) {
        this.groupsOfCustomersLevelId = groupsOfCustomersLevelId;
    }
}
