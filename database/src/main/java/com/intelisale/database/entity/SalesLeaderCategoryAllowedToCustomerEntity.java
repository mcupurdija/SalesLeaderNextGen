package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_CATEGORIES_ALLOWED_TO_CUSTOMER, indices = {@Index(value = "serverID", unique = true)})
public class SalesLeaderCategoryAllowedToCustomerEntity extends CodeBookColumns {

    private Integer categoryOfItemsID;
    private Integer salesLeaderSalesLevelTypeID;
    private String salesLevelCode;
    private Integer sourceTable;

    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
    }

    public Integer getSalesLeaderSalesLevelTypeID() {
        return salesLeaderSalesLevelTypeID;
    }

    public void setSalesLeaderSalesLevelTypeID(Integer salesLeaderSalesLevelTypeID) {
        this.salesLeaderSalesLevelTypeID = salesLeaderSalesLevelTypeID;
    }

    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    public Integer getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(Integer sourceTable) {
        this.sourceTable = sourceTable;
    }
}
