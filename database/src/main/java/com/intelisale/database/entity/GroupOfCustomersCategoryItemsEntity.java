package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.GROUP_OF_CUSTOMERS_CATEGORY_ITEMS, indices = {@Index(value = "serverID", unique = true)})
public class GroupOfCustomersCategoryItemsEntity extends CodeBookColumns {

    private Integer groupOfCustomerId;
    private Integer categoryOfItemsId;
    private Integer rank;
    private Integer importance;

    public Integer getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    public void setGroupOfCustomerId(Integer groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    public Integer getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(Integer categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }
}
