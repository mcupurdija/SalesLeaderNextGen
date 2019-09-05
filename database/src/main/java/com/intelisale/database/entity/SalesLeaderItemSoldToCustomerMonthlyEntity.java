package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "SalesLeaderItemsSoldToCustomerMonthly")
public class SalesLeaderItemSoldToCustomerMonthlyEntity extends BaseAuditColumns {

    private Integer itemId;
    private Integer customerId;
    private Integer groupOfCustomerId;
    private Integer soldYear;
    private Integer soldMonth;
    private Double quantity;
    private Double turnover;
    private Double cogs;
    private Double salesLinesCount;

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

    public Integer getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    public void setGroupOfCustomerId(Integer groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    public Integer getSoldYear() {
        return soldYear;
    }

    public void setSoldYear(Integer soldYear) {
        this.soldYear = soldYear;
    }

    public Integer getSoldMonth() {
        return soldMonth;
    }

    public void setSoldMonth(Integer soldMonth) {
        this.soldMonth = soldMonth;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Double getCogs() {
        return cogs;
    }

    public void setCogs(Double cogs) {
        this.cogs = cogs;
    }

    public Double getSalesLinesCount() {
        return salesLinesCount;
    }

    public void setSalesLinesCount(Double salesLinesCount) {
        this.salesLinesCount = salesLinesCount;
    }
}
