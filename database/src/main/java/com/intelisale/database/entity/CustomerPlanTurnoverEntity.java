package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomerPlanTurnover")
public class CustomerPlanTurnoverEntity extends BaseAuditColumns {

    private Integer customerId;
    private String screenPosition;
    private Double planTurnoverValue;
    private Integer sortIndex;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(String screenPosition) {
        this.screenPosition = screenPosition;
    }

    public Double getPlanTurnoverValue() {
        return planTurnoverValue;
    }

    public void setPlanTurnoverValue(Double planTurnoverValue) {
        this.planTurnoverValue = planTurnoverValue;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
