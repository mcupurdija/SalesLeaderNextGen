package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.SL_ITEMS_ALLOWED_TO_CUSTOMER, indices = {@Index(value = "serverID", unique = true)})
public class ItemAllowedToCustomerEntity extends BaseAuditColumns {

    private Integer itemID;
    private Integer salesLeaderSalesLevelTypeID;
    private String salesLevelCode;
    private Integer salesPriceTypeID;
    private Double salesPrice;
    private Double salesDiscount;
    private String comment;
    private String fromDate;
    private String toDate;
    private Integer approvalStatusID;
    private Integer sortIndex;

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getSalesLeaderSalesLevelTypeID() {
        return salesLeaderSalesLevelTypeID;
    }

    public void setSalesLeaderSalesLevelTypeID(Integer salesLeaderSalesLevelTypeID) {
        this.salesLeaderSalesLevelTypeID = salesLeaderSalesLevelTypeID;
    }

    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    public Integer getSalesPriceTypeID() {
        return salesPriceTypeID;
    }

    public void setSalesPriceTypeID(Integer salesPriceTypeID) {
        this.salesPriceTypeID = salesPriceTypeID;
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

    public Integer getApprovalStatusID() {
        return approvalStatusID;
    }

    public void setApprovalStatusID(Integer approvalStatusID) {
        this.approvalStatusID = approvalStatusID;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
