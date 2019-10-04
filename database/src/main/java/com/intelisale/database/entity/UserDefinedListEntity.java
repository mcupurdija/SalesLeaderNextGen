package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.USER_DEFINED_LISTS, indices = {@Index(value = {"listID", "customerID"}, unique = true)})
public class UserDefinedListEntity extends CodeBookColumns {

    private Integer listID;
    private Integer customerID;
    private String listName;
    private String specialType;
    private Boolean listEditable;

    public Integer getListID() {
        return listID;
    }

    public void setListID(Integer listID) {
        this.listID = listID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
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
