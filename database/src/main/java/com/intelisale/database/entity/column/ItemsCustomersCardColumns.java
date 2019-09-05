package com.intelisale.database.entity.column;

public class ItemsCustomersCardColumns extends BaseAuditColumns {

    private Integer itemId;
    private Integer customerId;
    private Integer branchMapRang;
    private Integer squareColor;
    private Boolean soldInCurrentMonth;
    private Boolean itemHasTAForCustomer;
    private Boolean ovsItem;
    private Boolean itemIsComponentOfPackage;
    private Boolean itemHasCampaign;
    private Boolean itemIncludedForCustomer;
    private Integer sortIndex;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Boolean isSoldInCurrentMonth() {
        return soldInCurrentMonth;
    }

    public void setSoldInCurrentMonth(Boolean soldInCurrentMonth) {
        this.soldInCurrentMonth = soldInCurrentMonth;
    }

    public Boolean isItemHasTAForCustomer() {
        return itemHasTAForCustomer;
    }

    public void setItemHasTAForCustomer(Boolean itemHasTAForCustomer) {
        this.itemHasTAForCustomer = itemHasTAForCustomer;
    }

    public Boolean isOvsItem() {
        return ovsItem;
    }

    public void setOvsItem(Boolean ovsItem) {
        this.ovsItem = ovsItem;
    }

    public Boolean isItemIsComponentOfPackage() {
        return itemIsComponentOfPackage;
    }

    public void setItemIsComponentOfPackage(Boolean itemIsComponentOfPackage) {
        this.itemIsComponentOfPackage = itemIsComponentOfPackage;
    }

    public Boolean isItemHasCampaign() {
        return itemHasCampaign;
    }

    public void setItemHasCampaign(Boolean itemHasCampaign) {
        this.itemHasCampaign = itemHasCampaign;
    }

    public Boolean isItemIncludedForCustomer() {
        return itemIncludedForCustomer;
    }

    public void setItemIncludedForCustomer(Boolean itemIncludedForCustomer) {
        this.itemIncludedForCustomer = itemIncludedForCustomer;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
