package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_ITEMS_CONNECTIONS)
public class ItemConnectionsEntity extends CodeBookColumns {

    private Integer itemID;
    private Integer connectedItemID;
    private Integer salesLeaderDirectionID;

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getConnectedItemID() {
        return connectedItemID;
    }

    public void setConnectedItemID(Integer connectedItemID) {
        this.connectedItemID = connectedItemID;
    }

    public Integer getSalesLeaderDirectionID() {
        return salesLeaderDirectionID;
    }

    public void setSalesLeaderDirectionID(Integer salesLeaderDirectionID) {
        this.salesLeaderDirectionID = salesLeaderDirectionID;
    }
}
