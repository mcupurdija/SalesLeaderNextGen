package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "StockInventoryLines")
public class StockInventoryLineEntity extends BaseAuditColumns {

    private int stockInventoryHeaderId;
    private int itemId;
    private double quantity;
    private double unitPrice;

    public int getStockInventoryHeaderId() {
        return stockInventoryHeaderId;
    }

    public void setStockInventoryHeaderId(int stockInventoryHeaderId) {
        this.stockInventoryHeaderId = stockInventoryHeaderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
