package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerPlanTurnover")
public class CustomerPlanTurnoverEntity extends BaseAuditColumns {

    private int customerId;
    private String screenPosition;
    private double planTurnoverValue;
    private int sortIndex;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(String screenPosition) {
        this.screenPosition = screenPosition;
    }

    public double getPlanTurnoverValue() {
        return planTurnoverValue;
    }

    public void setPlanTurnoverValue(double planTurnoverValue) {
        this.planTurnoverValue = planTurnoverValue;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }
}
