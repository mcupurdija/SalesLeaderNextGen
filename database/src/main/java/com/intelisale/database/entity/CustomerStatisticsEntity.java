package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_STATISTICS, indices = {@Index(value = "serverID", unique = true)})
public class CustomerStatisticsEntity extends BaseAuditColumns {

    private Integer customerID;
    private String period;
    private Double turnover;
    private Integer items;
    private Integer lines;
    private Integer visits;
    private Integer orders;
    private Integer offers;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getOffers() {
        return offers;
    }

    public void setOffers(Integer offers) {
        this.offers = offers;
    }
}
