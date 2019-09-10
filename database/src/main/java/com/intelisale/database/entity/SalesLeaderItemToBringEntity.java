package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SalesLeaderItemsToBring")
public class SalesLeaderItemToBringEntity extends BaseColumns {

    private Integer itemID;
    private Integer branchMapRang;
    private Integer squareColor;

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getBranchMapRang() {
        return branchMapRang;
    }

    public void setBranchMapRang(Integer branchMapRang) {
        this.branchMapRang = branchMapRang;
    }

    public Integer getSquareColor() {
        return squareColor;
    }

    public void setSquareColor(Integer squareColor) {
        this.squareColor = squareColor;
    }
}
