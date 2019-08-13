package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

import org.joda.time.DateTime;

@Entity(tableName = "ItemSaleHistory")
public class ItemSaleHistoryEntity extends BaseColumns {

    private int itemId;
    private int customerId;
    private DateTime postingDate;
    private double quantity;
    private int itemUnitOfMeasureId;
    private double unitPrice;
    private double lineDiscount;
    private int salesPriceTypeId;
    private String salesSource;
    private boolean priceIncreased;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public DateTime getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(DateTime postingDate) {
        this.postingDate = postingDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getItemUnitOfMeasureId() {
        return itemUnitOfMeasureId;
    }

    public void setItemUnitOfMeasureId(int itemUnitOfMeasureId) {
        this.itemUnitOfMeasureId = itemUnitOfMeasureId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getLineDiscount() {
        return lineDiscount;
    }

    public void setLineDiscount(double lineDiscount) {
        this.lineDiscount = lineDiscount;
    }

    public int getSalesPriceTypeId() {
        return salesPriceTypeId;
    }

    public void setSalesPriceTypeId(int salesPriceTypeId) {
        this.salesPriceTypeId = salesPriceTypeId;
    }

    public String getSalesSource() {
        return salesSource;
    }

    public void setSalesSource(String salesSource) {
        this.salesSource = salesSource;
    }

    public boolean isPriceIncreased() {
        return priceIncreased;
    }

    public void setPriceIncreased(boolean priceIncreased) {
        this.priceIncreased = priceIncreased;
    }
}
