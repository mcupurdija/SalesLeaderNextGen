package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.ItemsCustomersCardColumns;

@Entity(tableName = "SalesLeaderNewItemsCustomersCard")
public class SalesLeaderNewItemCustomersCardEntity extends ItemsCustomersCardColumns {

    private int groupsOfCustomerId;

    public int getGroupsOfCustomerId() {
        return groupsOfCustomerId;
    }

    public void setGroupsOfCustomerId(int groupsOfCustomerId) {
        this.groupsOfCustomerId = groupsOfCustomerId;
    }
}
