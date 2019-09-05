package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.ItemsCustomersCardColumns;

@Entity(tableName = "SalesLeaderNewItemsCustomersCard")
public class SalesLeaderNewItemCustomersCardEntity extends ItemsCustomersCardColumns {

    private Integer groupsOfCustomerId;

    public Integer getGroupsOfCustomerId() {
        return groupsOfCustomerId;
    }

    public void setGroupsOfCustomerId(Integer groupsOfCustomerId) {
        this.groupsOfCustomerId = groupsOfCustomerId;
    }
}
