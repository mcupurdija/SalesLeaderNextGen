package com.intelisale.networking.schema.items;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("businessKey")
    private String businessKey;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description2")
    private String description2;
    @JsonProperty("categoryOfItemsID")
    private Integer categoryOfItemsID;
    @JsonProperty("unitSalesPriceLCY")
    private Double unitSalesPriceLCY;
    @JsonProperty("baseSales_ItemUnitOfMeasureID")
    private Integer baseSalesItemUnitOfMeasureID;
    @JsonProperty("avialableQuantity")
    private Double availableQuantity;
    @JsonProperty("statusID")
    private Integer statusID;
    @JsonProperty("itemBarCodeForBSUOM")
    private String itemBarCodeForBSUOM;
    @JsonProperty("minimumSalesUnitQty")
    private Double minimumSalesUnitQty;
    @JsonProperty("sugastedSalesUnitQty")
    private Double suggestedSalesUnitQty;
    @JsonProperty("itemSuccessorID")
    private Integer itemSuccessorID;
    @JsonProperty("itemSuccessorStatusID")
    private Integer itemSuccessorStatusID;
    @JsonProperty("itemVATGroupID")
    private Integer itemVATGroupID;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("smallPictureName")
    private String smallPictureName;
    @JsonProperty("largePictureName")
    private String largePictureName;
    @JsonProperty("newItemDate")
    private String newItemDate;
    @JsonProperty("youtubeVideoCode")
    private String youtubeVideoCode;
    @JsonProperty("extraField")
    private String extraField;
    @JsonProperty("catalogCode")
    private String catalogCode;
    @JsonProperty("unitCost")
    private Integer unitCost;
    @JsonProperty("minimumPrice")
    private Double minimumPrice;
    @JsonProperty("isSLItemOnly")
    private Boolean isSLItemOnly;
    @JsonProperty("codeName")
    private String codeName;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("createdByUserID")
    private Integer createdByUserID;
    @JsonProperty("productManager")
    private String productManager;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("businessKey")
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonProperty("businessKey")
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description2")
    public String getDescription2() {
        return description2;
    }

    @JsonProperty("description2")
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    @JsonProperty("categoryOfItemsID")
    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    @JsonProperty("categoryOfItemsID")
    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
    }

    @JsonProperty("unitSalesPriceLCY")
    public Double getUnitSalesPriceLCY() {
        return unitSalesPriceLCY;
    }

    @JsonProperty("unitSalesPriceLCY")
    public void setUnitSalesPriceLCY(Double unitSalesPriceLCY) {
        this.unitSalesPriceLCY = unitSalesPriceLCY;
    }

    @JsonProperty("baseSales_ItemUnitOfMeasureID")
    public Integer getBaseSalesItemUnitOfMeasureID() {
        return baseSalesItemUnitOfMeasureID;
    }

    @JsonProperty("baseSales_ItemUnitOfMeasureID")
    public void setBaseSalesItemUnitOfMeasureID(Integer baseSalesItemUnitOfMeasureID) {
        this.baseSalesItemUnitOfMeasureID = baseSalesItemUnitOfMeasureID;
    }

    @JsonProperty("avialableQuantity")
    public Double getAvailableQuantity() {
        return availableQuantity;
    }

    @JsonProperty("avialableQuantity")
    public void setAvailableQuantity(Double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @JsonProperty("statusID")
    public Integer getStatusID() {
        return statusID;
    }

    @JsonProperty("statusID")
    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    @JsonProperty("itemBarCodeForBSUOM")
    public String getItemBarCodeForBSUOM() {
        return itemBarCodeForBSUOM;
    }

    @JsonProperty("itemBarCodeForBSUOM")
    public void setItemBarCodeForBSUOM(String itemBarCodeForBSUOM) {
        this.itemBarCodeForBSUOM = itemBarCodeForBSUOM;
    }

    @JsonProperty("minimumSalesUnitQty")
    public Double getMinimumSalesUnitQty() {
        return minimumSalesUnitQty;
    }

    @JsonProperty("minimumSalesUnitQty")
    public void setMinimumSalesUnitQty(Double minimumSalesUnitQty) {
        this.minimumSalesUnitQty = minimumSalesUnitQty;
    }

    @JsonProperty("sugastedSalesUnitQty")
    public Double getSuggestedSalesUnitQty() {
        return suggestedSalesUnitQty;
    }

    @JsonProperty("sugastedSalesUnitQty")
    public void setSuggestedSalesUnitQty(Double suggestedSalesUnitQty) {
        this.suggestedSalesUnitQty = suggestedSalesUnitQty;
    }

    @JsonProperty("itemSuccessorID")
    public Integer getItemSuccessorID() {
        return itemSuccessorID;
    }

    @JsonProperty("itemSuccessorID")
    public void setItemSuccessorID(Integer itemSuccessorID) {
        this.itemSuccessorID = itemSuccessorID;
    }

    @JsonProperty("itemSuccessorStatusID")
    public Integer getItemSuccessorStatusID() {
        return itemSuccessorStatusID;
    }

    @JsonProperty("itemSuccessorStatusID")
    public void setItemSuccessorStatusID(Integer itemSuccessorStatusID) {
        this.itemSuccessorStatusID = itemSuccessorStatusID;
    }

    @JsonProperty("itemVATGroupID")
    public Integer getItemVATGroupID() {
        return itemVATGroupID;
    }

    @JsonProperty("itemVATGroupID")
    public void setItemVATGroupID(Integer itemVATGroupID) {
        this.itemVATGroupID = itemVATGroupID;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("auditID")
    public Integer getAuditID() {
        return auditID;
    }

    @JsonProperty("auditID")
    public void setAuditID(Integer auditID) {
        this.auditID = auditID;
    }

    @JsonProperty("modifiedByUserID")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserID")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("smallPictureName")
    public String getSmallPictureName() {
        return smallPictureName;
    }

    @JsonProperty("smallPictureName")
    public void setSmallPictureName(String smallPictureName) {
        this.smallPictureName = smallPictureName;
    }

    @JsonProperty("largePictureName")
    public String getLargePictureName() {
        return largePictureName;
    }

    @JsonProperty("largePictureName")
    public void setLargePictureName(String largePictureName) {
        this.largePictureName = largePictureName;
    }

    @JsonProperty("newItemDate")
    public String getNewItemDate() {
        return newItemDate;
    }

    @JsonProperty("newItemDate")
    public void setNewItemDate(String newItemDate) {
        this.newItemDate = newItemDate;
    }

    @JsonProperty("youtubeVideoCode")
    public String getYoutubeVideoCode() {
        return youtubeVideoCode;
    }

    @JsonProperty("youtubeVideoCode")
    public void setYoutubeVideoCode(String youtubeVideoCode) {
        this.youtubeVideoCode = youtubeVideoCode;
    }

    @JsonProperty("extraField")
    public String getExtraField() {
        return extraField;
    }

    @JsonProperty("extraField")
    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    @JsonProperty("catalogCode")
    public String getCatalogCode() {
        return catalogCode;
    }

    @JsonProperty("catalogCode")
    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    @JsonProperty("unitCost")
    public Integer getUnitCost() {
        return unitCost;
    }

    @JsonProperty("unitCost")
    public void setUnitCost(Integer unitCost) {
        this.unitCost = unitCost;
    }

    @JsonProperty("minimumPrice")
    public Double getMinimumPrice() {
        return minimumPrice;
    }

    @JsonProperty("minimumPrice")
    public void setMinimumPrice(Double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @JsonProperty("isSLItemOnly")
    public Boolean getIsSLItemOnly() {
        return isSLItemOnly;
    }

    @JsonProperty("isSLItemOnly")
    public void setIsSLItemOnly(Boolean isSLItemOnly) {
        this.isSLItemOnly = isSLItemOnly;
    }

    @JsonProperty("codeName")
    public String getCodeName() {
        return codeName;
    }

    @JsonProperty("codeName")
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("createdByUserID")
    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    @JsonProperty("createdByUserID")
    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    @JsonProperty("productManager")
    public String getProductManager() {
        return productManager;
    }

    @JsonProperty("productManager")
    public void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}