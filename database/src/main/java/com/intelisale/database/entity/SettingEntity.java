package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "Settings")
public class SettingEntity extends BaseColumns {

    private Integer serverId;
    private Integer financialEntityId;
    private String name;
    private String value;
    private Boolean active;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Integer getFinancialEntityId() {
        return financialEntityId;
    }

    public void setFinancialEntityId(Integer financialEntityId) {
        this.financialEntityId = financialEntityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
