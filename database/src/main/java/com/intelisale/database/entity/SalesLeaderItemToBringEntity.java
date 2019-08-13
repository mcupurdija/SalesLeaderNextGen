package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SalesLeaderItemsToBring")
public class SalesLeaderItemToBringEntity extends BaseColumns {

    private int itemId;
    private int branchMapRang;
    private int squareColor;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getBranchMapRang() {
        return branchMapRang;
    }

    public void setBranchMapRang(int branchMapRang) {
        this.branchMapRang = branchMapRang;
    }

    public int getSquareColor() {
        return squareColor;
    }

    public void setSquareColor(int squareColor) {
        this.squareColor = squareColor;
    }
}
