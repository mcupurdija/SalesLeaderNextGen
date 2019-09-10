package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.ITEMS)
public class ItemEntity extends BaseAuditColumns {

    private String code;
    private String description;
    private String description2;
    private Integer categoryOfItemsID;
    private Double unitSalesPriceLCY;
    private Integer itemUnitOfMeasureID;
    private Double availableQuantity;
    private Integer itemStatusID;
    private String statusOfItem;
    private String itemBarCodeForBSUOM;
    private Double minimumSalesUnitQty;
    private Double suggestedSalesUnitQty;
    private Integer itemSuccessorID;
    private Integer itemSuccessorStatusID;
    private Integer itemVATGroupID;
    private String smallPictureName;
    private String largePictureName;
    private String youtubeVideoCode;
    private String extraField;
    private String catalogCode;
    private String productManager;
    private Boolean sent;

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

    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
    }

    public Double getUnitSalesPriceLCY() {
        return unitSalesPriceLCY;
    }

    public void setUnitSalesPriceLCY(Double unitSalesPriceLCY) {
        this.unitSalesPriceLCY = unitSalesPriceLCY;
    }

    public Integer getItemUnitOfMeasureID() {
        return itemUnitOfMeasureID;
    }

    public void setItemUnitOfMeasureID(Integer itemUnitOfMeasureID) {
        this.itemUnitOfMeasureID = itemUnitOfMeasureID;
    }

    public Double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getItemStatusID() {
        return itemStatusID;
    }

    public void setItemStatusID(Integer itemStatusID) {
        this.itemStatusID = itemStatusID;
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

    public Double getMinimumSalesUnitQty() {
        return minimumSalesUnitQty;
    }

    public void setMinimumSalesUnitQty(Double minimumSalesUnitQty) {
        this.minimumSalesUnitQty = minimumSalesUnitQty;
    }

    public Double getSuggestedSalesUnitQty() {
        return suggestedSalesUnitQty;
    }

    public void setSuggestedSalesUnitQty(Double suggestedSalesUnitQty) {
        this.suggestedSalesUnitQty = suggestedSalesUnitQty;
    }

    public Integer getItemSuccessorID() {
        return itemSuccessorID;
    }

    public void setItemSuccessorID(Integer itemSuccessorID) {
        this.itemSuccessorID = itemSuccessorID;
    }

    public Integer getItemSuccessorStatusID() {
        return itemSuccessorStatusID;
    }

    public void setItemSuccessorStatusID(Integer itemSuccessorStatusID) {
        this.itemSuccessorStatusID = itemSuccessorStatusID;
    }

    public Integer getItemVATGroupID() {
        return itemVATGroupID;
    }

    public void setItemVATGroupID(Integer itemVATGroupID) {
        this.itemVATGroupID = itemVATGroupID;
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

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
