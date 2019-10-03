package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.USER_DEFINED_LISTS, indices = {@Index(value = {"listId", "customerId"}, unique = true)})
public class UserDefinedListEntity extends CodeBookColumns {

    private Integer listId;
    private Integer customerId;
    private String listName;
    private String specialType;
    private Boolean listEditable;

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
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

    public Boolean isListEditable() {
        return listEditable;
    }

    public void setListEditable(Boolean listEditable) {
        this.listEditable = listEditable;
    }
}
