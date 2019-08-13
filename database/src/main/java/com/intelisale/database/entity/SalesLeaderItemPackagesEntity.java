package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderItemsPackages")
public class SalesLeaderItemPackagesEntity extends CodeBookColumns {

    private int itemPackageId;
    private int itemComponentId;
    private double itemComponentPrice;
    private double itemComponentQuantity;

    public int getItemPackageId() {
        return itemPackageId;
    }

    public void setItemPackageId(int itemPackageId) {
        this.itemPackageId = itemPackageId;
    }

    public int getItemComponentId() {
        return itemComponentId;
    }

    public void setItemComponentId(int itemComponentId) {
        this.itemComponentId = itemComponentId;
    }

    public double getItemComponentPrice() {
        return itemComponentPrice;
    }

    public void setItemComponentPrice(double itemComponentPrice) {
        this.itemComponentPrice = itemComponentPrice;
    }

    public double getItemComponentQuantity() {
        return itemComponentQuantity;
    }

    public void setItemComponentQuantity(double itemComponentQuantity) {
        this.itemComponentQuantity = itemComponentQuantity;
    }
}
