package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "SalesLeaderItemsAllowedToCustomer")
public class SalesLeaderItemAllowedToCustomerEntity extends BaseAuditColumns {

    private Integer itemId;
    private Integer salesLeaderSalesLevelTypeId;
    private String salesLevelCode;
    private Integer salesPriceTypeId;
    private Double salesPrice;
    private Double salesDiscount;
    private String comment;
    private String fromDate;
    private String toDate;
    private Integer approvalStatusId;
    private Integer sortIndex;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSalesLeaderSalesLevelTypeId() {
        return salesLeaderSalesLevelTypeId;
    }

    public void setSalesLeaderSalesLevelTypeId(Integer salesLeaderSalesLevelTypeId) {
        this.salesLeaderSalesLevelTypeId = salesLeaderSalesLevelTypeId;
    }

    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    public Integer getSalesPriceTypeId() {
        return salesPriceTypeId;
    }

    public void setSalesPriceTypeId(Integer salesPriceTypeId) {
        this.salesPriceTypeId = salesPriceTypeId;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Double getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(Double salesDiscount) {
        this.salesDiscount = salesDiscount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Integer getApprovalStatusId() {
        return approvalStatusId;
    }

    public void setApprovalStatusId(Integer approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
