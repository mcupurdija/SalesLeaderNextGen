package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Items")
public class ItemEntity extends BaseAuditColumns {

    private String code;
    private String description;
    private String description2;
    private int categoryOfItemsId;
    private double unitSalesPriceLCY;
    private int itemUnitOfMeasureId;
    private double availableQuantity;
    private int itemStatusId;
    private String statusOfItem;
    private String itemBarCodeForBSUOM;
    private double minimumSalesUnitQty;
    private double suggestedSalesUnitQty;
    private int itemSuccessorId;
    private int itemSuccessorStatusId;
    private int itemVATGroupId;
    private String smallPictureName;
    private String largePictureName;
    private String youtubeVideoCode;
    private String extraField;
    private String catalogCode;
    private String productManager;
    private boolean sent;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public int getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(int categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public double getUnitSalesPriceLCY() {
        return unitSalesPriceLCY;
    }

    public void setUnitSalesPriceLCY(double unitSalesPriceLCY) {
        this.unitSalesPriceLCY = unitSalesPriceLCY;
    }

    public int getItemUnitOfMeasureId() {
        return itemUnitOfMeasureId;
    }

    public void setItemUnitOfMeasureId(int itemUnitOfMeasureId) {
        this.itemUnitOfMeasureId = itemUnitOfMeasureId;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(int itemStatusId) {
        this.itemStatusId = itemStatusId;
    }

    public String getStatusOfItem() {
        return statusOfItem;
    }

    public void setStatusOfItem(String statusOfItem) {
        this.statusOfItem = statusOfItem;
    }

    public String getItemBarCodeForBSUOM() {
        return itemBarCodeForBSUOM;
    }

    public void setItemBarCodeForBSUOM(String itemBarCodeForBSUOM) {
        this.itemBarCodeForBSUOM = itemBarCodeForBSUOM;
    }

    public double getMinimumSalesUnitQty() {
        return minimumSalesUnitQty;
    }

    public void setMinimumSalesUnitQty(double minimumSalesUnitQty) {
        this.minimumSalesUnitQty = minimumSalesUnitQty;
    }

    public double getSuggestedSalesUnitQty() {
        return suggestedSalesUnitQty;
    }

    public void setSuggestedSalesUnitQty(double suggestedSalesUnitQty) {
        this.suggestedSalesUnitQty = suggestedSalesUnitQty;
    }

    public int getItemSuccessorId() {
        return itemSuccessorId;
    }

    public void setItemSuccessorId(int itemSuccessorId) {
        this.itemSuccessorId = itemSuccessorId;
    }

    public int getItemSuccessorStatusId() {
        return itemSuccessorStatusId;
    }

    public void setItemSuccessorStatusId(int itemSuccessorStatusId) {
        this.itemSuccessorStatusId = itemSuccessorStatusId;
    }

    public int getItemVATGroupId() {
        return itemVATGroupId;
    }

    public void setItemVATGroupId(int itemVATGroupId) {
        this.itemVATGroupId = itemVATGroupId;
    }

    public String getSmallPictureName() {
        return smallPictureName;
    }

    public void setSmallPictureName(String smallPictureName) {
        this.smallPictureName = smallPictureName;
    }

    public String getLargePictureName() {
        return largePictureName;
    }

    public void setLargePictureName(String largePictureName) {
        this.largePictureName = largePictureName;
    }

    public String getYoutubeVideoCode() {
        return youtubeVideoCode;
    }

    public void setYoutubeVideoCode(String youtubeVideoCode) {
        this.youtubeVideoCode = youtubeVideoCode;
    }

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getProductManager() {
        return productManager;
    }

    public void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
