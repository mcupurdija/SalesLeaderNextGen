package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderItemsPackages")
public class SalesLeaderItemPackagesEntity extends CodeBookColumns {

    private Integer itemPackageId;
    private Integer itemComponentId;
    private Double itemComponentPrice;
    private Double itemComponentQuantity;

    public Integer getItemPackageId() {
        return itemPackageId;
    }

    public void setItemPackageId(Integer itemPackageId) {
        this.itemPackageId = itemPackageId;
    }

    public Integer getItemComponentId() {
        return itemComponentId;
    }

    public void setItemComponentId(Integer itemComponentId) {
        this.itemComponentId = itemComponentId;
    }

    public Double getItemComponentPrice() {
        return itemComponentPrice;
    }

    public void setItemComponentPrice(Double itemComponentPrice) {
        this.itemComponentPrice = itemComponentPrice;
    }

    public Double getItemComponentQuantity() {
        return itemComponentQuantity;
    }

    public void setItemComponentQuantity(Double itemComponentQuantity) {
        this.itemComponentQuantity = itemComponentQuantity;
    }
}
