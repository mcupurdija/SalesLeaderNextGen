package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SalesLeaderItemsSoldToCustomerMonthlyTmp")
public class SalesLeaderItemSoldToCustomerMonthlyTmpEntity extends BaseColumns {

    private Integer itemID;
    private Double m1Qty;
    private Double m2Qty;
    private Double m3Qty;
    private Double m4Qty;
    private Double m5Qty;
    private Double m6Qty;
    private Double m7Qty;
    private Double m8Qty;
    private Double m9Qty;
    private Double m10Qty;
    private Double m11Qty;
    private Double m12Qty;
    private Double total;

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Double getM1Qty() {
        return m1Qty;
    }

    public void setM1Qty(Double m1Qty) {
        this.m1Qty = m1Qty;
    }

    public Double getM2Qty() {
        return m2Qty;
    }

    public void setM2Qty(Double m2Qty) {
        this.m2Qty = m2Qty;
    }

    public Double getM3Qty() {
        return m3Qty;
    }

    public void setM3Qty(Double m3Qty) {
        this.m3Qty = m3Qty;
    }

    public Double getM4Qty() {
        return m4Qty;
    }

    public void setM4Qty(Double m4Qty) {
        this.m4Qty = m4Qty;
    }

    public Double getM5Qty() {
        return m5Qty;
    }

    public void setM5Qty(Double m5Qty) {
        this.m5Qty = m5Qty;
    }

    public Double getM6Qty() {
        return m6Qty;
    }

    public void setM6Qty(Double m6Qty) {
        this.m6Qty = m6Qty;
    }

    public Double getM7Qty() {
        return m7Qty;
    }

    public void setM7Qty(Double m7Qty) {
        this.m7Qty = m7Qty;
    }

    public Double getM8Qty() {
        return m8Qty;
    }

    public void setM8Qty(Double m8Qty) {
        this.m8Qty = m8Qty;
    }

    public Double getM9Qty() {
        return m9Qty;
    }

    public void setM9Qty(Double m9Qty) {
        this.m9Qty = m9Qty;
    }

    public Double getM10Qty() {
        return m10Qty;
    }

    public void setM10Qty(Double m10Qty) {
        this.m10Qty = m10Qty;
    }

    public Double getM11Qty() {
        return m11Qty;
    }

    public void setM11Qty(Double m11Qty) {
        this.m11Qty = m11Qty;
    }

    public Double getM12Qty() {
        return m12Qty;
    }

    public void setM12Qty(Double m12Qty) {
        this.m12Qty = m12Qty;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
