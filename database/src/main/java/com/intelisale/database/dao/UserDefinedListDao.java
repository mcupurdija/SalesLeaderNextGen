package com.intelisale.database.dao;

import androidx.room.Dao;

import com.intelisale.database.entity.UserDefinedListEntity;

@Dao
public abstract class UserDefinedListDao extends BaseDao<UserDefinedListEntity> {

    private int listId;
    private int customerId;
    private String listName;
    private String specialType;
    private boolean listEditable;

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getSpecialType() {
        return specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    public boolean isListEditable() {
        return listEditable;
    }

    public void setListEditable(boolean listEditable) {
        this.listEditable = listEditable;
    }
}
