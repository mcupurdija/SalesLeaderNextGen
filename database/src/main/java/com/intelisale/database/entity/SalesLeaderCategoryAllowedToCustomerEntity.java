package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderCategoriesAllowedToCustomer")
public class SalesLeaderCategoryAllowedToCustomerEntity extends CodeBookColumns {

    private Integer categoryOfItemsId;
    private Integer salesLeaderSalesLevelTypeId;
    private String salesLevelCode;
    private Integer sourceTable;

    public Integer getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(Integer categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public Integer getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(Integer salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
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
