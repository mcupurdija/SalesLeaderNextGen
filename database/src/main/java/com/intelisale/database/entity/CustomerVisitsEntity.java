package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "CustomerVisits")
public class CustomerVisitsEntity extends BaseAuditColumns {

    private int customerId;
    private int customerVisits;
    private DateTime visitDate;
    private int customerTime;
    private int productivityPerVisit;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerVisits() {
        return customerVisits;
    }

    public void setCustomerVisits(int customerVisits) {
        this.customerVisits = customerVisits;
    }

    public DateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(DateTime visitDate) {
        this.visitDate = visitDate;
    }

    public int getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(int customerTime) {
        this.customerTime = customerTime;
    }

    public int getProductivityPerVisit() {
        return productivityPerVisit;
    }

    public void setProductivityPerVisit(int productivityPerVisit) {
        this.productivityPerVisit = productivityPerVisit;
    }
}
