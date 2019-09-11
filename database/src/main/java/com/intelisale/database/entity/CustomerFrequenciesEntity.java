package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_FREQUENCIES, indices = {@Index(value = "serverID", unique = true)})
public class CustomerFrequenciesEntity extends BaseAuditColumns {

    private Integer customerID;
    private Integer userID;
    private Integer week;
    private Integer dayOfWeek;
    private Double visitTime;
    private Integer activityGroup;
    private Integer cycle;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Double getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Double visitTime) {
        this.visitTime = visitTime;
    }

    public Integer getActivityGroup() {
        return activityGroup;
    }

    public void setActivityGroup(Integer activityGroup) {
        this.activityGroup = activityGroup;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }
}
