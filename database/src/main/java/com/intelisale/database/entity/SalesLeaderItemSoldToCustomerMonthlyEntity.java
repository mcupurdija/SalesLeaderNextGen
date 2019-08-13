package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "SalesLeaderItemsSoldToCustomerMonthly")
public class SalesLeaderItemSoldToCustomerMonthlyEntity extends BaseAuditColumns {

    private int itemId;
    private int customerId;
    private int groupOfCustomerId;
    private int soldYear;
    private int soldMonth;
    private double quantity;
    private double turnover;
    private double cogs;
    private double salesLinesCount;

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

    public int getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    public void setGroupOfCustomerId(int groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    public int getSoldYear() {
        return soldYear;
    }

    public void setSoldYear(int soldYear) {
        this.soldYear = soldYear;
    }

    public int getSoldMonth() {
        return soldMonth;
    }

    public void setSoldMonth(int soldMonth) {
        this.soldMonth = soldMonth;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getCogs() {
        return cogs;
    }

    public void setCogs(double cogs) {
        this.cogs = cogs;
    }

    public double getSalesLinesCount() {
        return salesLinesCount;
    }

    public void setSalesLinesCount(double salesLinesCount) {
        this.salesLinesCount = salesLinesCount;
    }
}
