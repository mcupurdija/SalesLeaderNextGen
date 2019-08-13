package com.intelisale.database.entity.column;

public class ItemsCustomersCardColumns extends BaseAuditColumns {

    private int itemId;
    private int customerId;
    private int branchMapRang;
    private int squareColor;
    private boolean soldInCurrentMonth;
    private boolean itemHasTAForCustomer;
    private boolean ovsItem;
    private boolean itemIsComponentOfPackage;
    private boolean itemHasCampaign;
    private boolean itemIncludedForCustomer;
    private int sortIndex;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public boolean isSoldInCurrentMonth() {
        return soldInCurrentMonth;
    }

    public void setSoldInCurrentMonth(boolean soldInCurrentMonth) {
        this.soldInCurrentMonth = soldInCurrentMonth;
    }

    public boolean isItemHasTAForCustomer() {
        return itemHasTAForCustomer;
    }

    public void setItemHasTAForCustomer(boolean itemHasTAForCustomer) {
        this.itemHasTAForCustomer = itemHasTAForCustomer;
    }

    public boolean isOvsItem() {
        return ovsItem;
    }

    public void setOvsItem(boolean ovsItem) {
        this.ovsItem = ovsItem;
    }

    public boolean isItemIsComponentOfPackage() {
        return itemIsComponentOfPackage;
    }

    public void setItemIsComponentOfPackage(boolean itemIsComponentOfPackage) {
        this.itemIsComponentOfPackage = itemIsComponentOfPackage;
    }

    public boolean isItemHasCampaign() {
        return itemHasCampaign;
    }

    public void setItemHasCampaign(boolean itemHasCampaign) {
        this.itemHasCampaign = itemHasCampaign;
    }

    public boolean isItemIncludedForCustomer() {
        return itemIncludedForCustomer;
    }

    public void setItemIncludedForCustomer(boolean itemIncludedForCustomer) {
        this.itemIncludedForCustomer = itemIncludedForCustomer;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }
}
