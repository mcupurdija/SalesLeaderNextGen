package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "ItemSaleHistory")
public class ItemSaleHistoryEntity extends BaseColumns {

    private Integer itemId;
    private Integer customerId;
    private String postingDate;
    private Double quantity;
    private Integer itemUnitOfMeasureId;
    private Double unitPrice;
    private Double lineDiscount;
    private Integer salesPriceTypeId;
    private String salesSource;
    private Boolean priceIncreased;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Integer getItemUnitOfMeasureId() {
        return itemUnitOfMeasureId;
    }

    public void setItemUnitOfMeasureId(Integer itemUnitOfMeasureId) {
        this.itemUnitOfMeasureId = itemUnitOfMeasureId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getLineDiscount() {
        return lineDiscount;
    }

    public void setLineDiscount(Double lineDiscount) {
        this.lineDiscount = lineDiscount;
    }

    public Integer getSalesPriceTypeId() {
        return salesPriceTypeId;
    }

    public void setSalesPriceTypeId(Integer salesPriceTypeId) {
        this.salesPriceTypeId = salesPriceTypeId;
    }

    public String getSalesSource() {
        return salesSource;
    }

    public void setSalesSource(String salesSource) {
        this.salesSource = salesSource;
    }

    public Boolean isPriceIncreased() {
        return priceIncreased;
    }

    public void setPriceIncreased(Boolean priceIncreased) {
        this.priceIncreased = priceIncreased;
    }
}
