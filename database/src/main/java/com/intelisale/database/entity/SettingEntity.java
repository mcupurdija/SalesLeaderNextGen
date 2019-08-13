package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "Settings")
public class SettingEntity extends BaseColumns {

    private int serverId;
    private int financialEntityId;
    private String name;
    private String value;
    private boolean active;

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public int getFinancialEntityId() {
        return financialEntityId;
    }

    public void setFinancialEntityId(int financialEntityId) {
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
