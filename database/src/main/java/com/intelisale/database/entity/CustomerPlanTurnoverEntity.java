package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMER_PLAN_TURNOVER, indices = {@Index(value = "serverID", unique = true)})
public class CustomerPlanTurnoverEntity extends BaseAuditColumns {

    private Integer customerID;
    private String screenPosition;
    private Double planTurnoverValue;
    private Integer sortIndex;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
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
