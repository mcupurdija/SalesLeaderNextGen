package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "GroupsOfCustomersCategoryItems")
public class GroupOfCustomersCategoryItemsEntity extends CodeBookColumns {

    private int groupOfCustomerId;
    private int categoryOfItemsId;
    private int rank;
    private int importance;

    public int getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    public void setGroupOfCustomerId(int groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    public int getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(int categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
}
