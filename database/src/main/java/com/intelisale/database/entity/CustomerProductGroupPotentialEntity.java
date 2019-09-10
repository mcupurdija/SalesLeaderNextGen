package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_PRODUCT_GROUP)
public class CustomerProductGroupPotentialEntity extends BaseAuditColumns {

    private Integer customerID;
    private Integer categoryOfItemsID;
    private Double turnover;
    private Double potential;
    private Double unusedPotential;
    private Integer noOfItems;
    private Integer categoryRank;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Double getPotential() {
        return potential;
    }

    public void setPotential(Double potential) {
        this.potential = potential;
    }

    public Double getUnusedPotential() {
        return unusedPotential;
    }

    public void setUnusedPotential(Double unusedPotential) {
        this.unusedPotential = unusedPotential;
    }

    public Integer getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(Integer noOfItems) {
        this.noOfItems = noOfItems;
    }

    public Integer getCategoryRank() {
        return categoryRank;
    }

    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
    }
}
