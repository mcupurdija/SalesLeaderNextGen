package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Items")
public class ItemEntity extends BaseAuditColumns {

    private String code;
    private String description;
    private String description2;
    private Integer categoryOfItemsId;
    private Double unitSalesPriceLCY;
    private Integer itemUnitOfMeasureId;
    private Double availableQuantity;
    private Integer itemStatusId;
    private String statusOfItem;
    private String itemBarCodeForBSUOM;
    private Double minimumSalesUnitQty;
    private Double suggestedSalesUnitQty;
    private Integer itemSuccessorId;
    private Integer itemSuccessorStatusId;
    private Integer itemVATGroupId;
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

    public Integer getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    public void setCategoryOfItemsId(Integer categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    public Double getUnitSalesPriceLCY() {
        return unitSalesPriceLCY;
    }

    public void setUnitSalesPriceLCY(Double unitSalesPriceLCY) {
        this.unitSalesPriceLCY = unitSalesPriceLCY;
    }

    public Integer getItemUnitOfMeasureId() {
        return itemUnitOfMeasureId;
    }

    public void setItemUnitOfMeasureId(Integer itemUnitOfMeasureId) {
        this.itemUnitOfMeasureId = itemUnitOfMeasureId;
    }

    public Double getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getItemStatusId() {
        return itemStatusId;
    }

    public void setItemStatusId(Integer itemStatusId) {
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

    public Integer getItemSuccessorId() {
        return itemSuccessorId;
    }

    public void setItemSuccessorId(Integer itemSuccessorId) {
        this.itemSuccessorId = itemSuccessorId;
    }

    public Integer getItemSuccessorStatusId() {
        return itemSuccessorStatusId;
    }

    public void setItemSuccessorStatusId(Integer itemSuccessorStatusId) {
        this.itemSuccessorStatusId = itemSuccessorStatusId;
    }

    public Integer getItemVATGroupId() {
        return itemVATGroupId;
    }

    public void setItemVATGroupId(Integer itemVATGroupId) {
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

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
