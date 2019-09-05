package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerVisits")
public class CustomerVisitsEntity extends BaseAuditColumns {

    private Integer customerId;
    private Integer customerVisits;
    private String visitDate;
    private Integer customerTime;
    private Integer productivityPerVisit;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerVisits() {
        return customerVisits;
    }

    public void setCustomerVisits(Integer customerVisits) {
        this.customerVisits = customerVisits;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public Integer getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(Integer customerTime) {
        this.customerTime = customerTime;
    }

    public Integer getProductivityPerVisit() {
        return productivityPerVisit;
    }

    public void setProductivityPerVisit(Integer productivityPerVisit) {
        this.productivityPerVisit = productivityPerVisit;
    }
}
