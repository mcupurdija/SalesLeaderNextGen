package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "SalesLeaderItemConnections")
public class SalesLeaderItemConnectionsEntity extends CodeBookColumns {

    private int itemId;
    private int connectedItemId;
    private int salesLeaderDirectionId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getConnectedItemId() {
        return connectedItemId;
    }

    public void setConnectedItemId(int connectedItemId) {
        this.connectedItemId = connectedItemId;
    }

    public int getSalesLeaderDirectionId() {
        return salesLeaderDirectionId;
    }

    public void setSalesLeaderDirectionId(int salesLeaderDirectionId) {
        this.salesLeaderDirectionId = salesLeaderDirectionId;
    }
}
