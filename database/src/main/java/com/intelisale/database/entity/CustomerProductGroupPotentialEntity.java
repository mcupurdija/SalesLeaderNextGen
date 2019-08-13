package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerProductGroupPotential")
public class CustomerProductGroupPotentialEntity extends BaseAuditColumns {

    private int categoryOfItemsId;
    private double turnover;
    private double potential;
    private double unusedPotential;
    private int noOfItems;
    private int categoryRank;

    public int getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(int categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getPotential() {
        return potential;
    }

    public void setPotential(double potential) {
        this.potential = potential;
    }

    public double getUnusedPotential() {
        return unusedPotential;
    }

    public void setUnusedPotential(double unusedPotential) {
        this.unusedPotential = unusedPotential;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public int getCategoryRank() {
        return categoryRank;
    }

    public void setCategoryRank(int categoryRank) {
        this.categoryRank = categoryRank;
    }
}
