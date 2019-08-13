package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "SalesLeaderItemsSoldToCustomerMonthlyTmp")
public class SalesLeaderItemSoldToCustomerMonthlyTmpEntity extends BaseColumns {

    private int itemId;
    private double m1Qty;
    private double m2Qty;
    private double m3Qty;
    private double m4Qty;
    private double m5Qty;
    private double m6Qty;
    private double m7Qty;
    private double m8Qty;
    private double m9Qty;
    private double m10Qty;
    private double m11Qty;
    private double m12Qty;
    private double total;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getM1Qty() {
        return m1Qty;
    }

    public void setM1Qty(double m1Qty) {
        this.m1Qty = m1Qty;
    }

    public double getM2Qty() {
        return m2Qty;
    }

    public void setM2Qty(double m2Qty) {
        this.m2Qty = m2Qty;
    }

    public double getM3Qty() {
        return m3Qty;
    }

    public void setM3Qty(double m3Qty) {
        this.m3Qty = m3Qty;
    }

    public double getM4Qty() {
        return m4Qty;
    }

    public void setM4Qty(double m4Qty) {
        this.m4Qty = m4Qty;
    }

    public double getM5Qty() {
        return m5Qty;
    }

    public void setM5Qty(double m5Qty) {
        this.m5Qty = m5Qty;
    }

    public double getM6Qty() {
        return m6Qty;
    }

    public void setM6Qty(double m6Qty) {
        this.m6Qty = m6Qty;
    }

    public double getM7Qty() {
        return m7Qty;
    }

    public void setM7Qty(double m7Qty) {
        this.m7Qty = m7Qty;
    }

    public double getM8Qty() {
        return m8Qty;
    }

    public void setM8Qty(double m8Qty) {
        this.m8Qty = m8Qty;
    }

    public double getM9Qty() {
        return m9Qty;
    }

    public void setM9Qty(double m9Qty) {
        this.m9Qty = m9Qty;
    }

    public double getM10Qty() {
        return m10Qty;
    }

    public void setM10Qty(double m10Qty) {
        this.m10Qty = m10Qty;
    }

    public double getM11Qty() {
        return m11Qty;
    }

    public void setM11Qty(double m11Qty) {
        this.m11Qty = m11Qty;
    }

    public double getM12Qty() {
        return m12Qty;
    }

    public void setM12Qty(double m12Qty) {
        this.m12Qty = m12Qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
