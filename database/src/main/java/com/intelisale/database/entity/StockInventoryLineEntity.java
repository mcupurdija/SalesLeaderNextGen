package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "StockInventoryLines")
public class StockInventoryLineEntity extends BaseAuditColumns {

    private Integer stockInventoryHeaderId;
    private Integer itemId;
    private Double quantity;
    private Double unitPrice;

    public Integer getStockInventoryHeaderId() {
        return stockInventoryHeaderId;
    }

    public void setStockInventoryHeaderId(Integer stockInventoryHeaderId) {
        this.stockInventoryHeaderId = stockInventoryHeaderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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
