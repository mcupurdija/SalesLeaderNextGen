package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "SalesLeaderItemsAllowedToCustomer")
public class SalesLeaderItemAllowedToCustomerEntity extends BaseAuditColumns {

    private int itemId;
    private int salesLeaderSalesLevelTypeId;
    private String salesLevelCode;
    private int salesPriceTypeId;
    private double salesPrice;
    private double salesDiscount;
    private String comment;
    private DateTime fromDate;
    private DateTime toDate;
    private int approvalStatusId;
    private int sortIndex;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(int salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
    }

    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    public int getSalesPriceTypeId() {
        return salesPriceTypeId;
    }

    public void setSalesPriceTypeId(int salesPriceTypeId) {
        this.salesPriceTypeId = salesPriceTypeId;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(double salesDiscount) {
        this.salesDiscount = salesDiscount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(DateTime fromDate) {
        this.fromDate = fromDate;
    }

    public DateTime getToDate() {
        return toDate;
    }

    public void setToDate(DateTime toDate) {
        this.toDate = toDate;
    }

    public int getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(int approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }
}
