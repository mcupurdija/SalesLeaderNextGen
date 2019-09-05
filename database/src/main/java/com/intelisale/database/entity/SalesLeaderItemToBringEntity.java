package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SalesLeaderItemsToBring")
public class SalesLeaderItemToBringEntity extends BaseColumns {

    private Integer itemId;
    private Integer branchMapRang;
    private Integer squareColor;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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
