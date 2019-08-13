package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderCategoriesAllowedToCustomer")
public class SalesLeaderCategoryAllowedToCustomerEntity extends CodeBookColumns {

    private int categoryOfItemsId;
    private int salesLeaderSalesLevelTypeId;
    private String salesLevelCode;
    private int sourceTable;

    public int getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(int categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public int getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(int salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
    }

    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    public int getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(int sourceTable) {
        this.sourceTable = sourceTable;
    }
}
