package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerProductGroupPotential")
public class CustomerProductGroupPotentialEntity extends BaseAuditColumns {

    private Integer categoryOfItemsId;
    private Double turnover;
    private Double potential;
    private Double unusedPotential;
    private Integer noOfItems;
    private Integer categoryRank;

    public Integer getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(Integer categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
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
