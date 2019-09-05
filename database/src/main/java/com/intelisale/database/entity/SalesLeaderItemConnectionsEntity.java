package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderItemConnections")
public class SalesLeaderItemConnectionsEntity extends CodeBookColumns {

    private Integer itemId;
    private Integer connectedItemId;
    private Integer salesLeaderDirectionId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getConnectedItemId() {
        return connectedItemId;
    }

    public void setConnectedItemId(Integer connectedItemId) {
        this.connectedItemId = connectedItemId;
    }

    public Integer getSalesLeaderDirectionId() {
        return salesLeaderDirectionId;
    }

    public void setSalesLeaderDirectionId(Integer salesLeaderDirectionId) {
        this.salesLeaderDirectionId = salesLeaderDirectionId;
    }
}
