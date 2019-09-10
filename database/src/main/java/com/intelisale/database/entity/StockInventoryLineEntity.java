package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "StockInventoryLines")
public class StockInventoryLineEntity extends BaseAuditColumns {

    private Integer stockInventoryHeaderID;
    private Integer itemID;
    private Double quantity;
    private Double unitPrice;

    public Integer getStockInventoryHeaderID() {
        return stockInventoryHeaderID;
    }

    public void setStockInventoryHeaderID(Integer stockInventoryHeaderID) {
        this.stockInventoryHeaderID = stockInventoryHeaderID;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
