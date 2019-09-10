package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_VISITS)
public class CustomerVisitsEntity extends BaseAuditColumns {

    private Integer customerID;
    private Integer customerVisits;
    private String visitDate;
    private Integer customerTime;
    private Integer productivityPerVisit;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
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
