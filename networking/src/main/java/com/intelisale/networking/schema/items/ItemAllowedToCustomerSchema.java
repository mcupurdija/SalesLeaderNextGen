package com.intelisale.networking.schema.items;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemAllowedToCustomerSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("itemID")
    private Integer itemID;
    @JsonProperty("slSalesLevelTypeID")
    private Integer slSalesLevelTypeID;
    @JsonProperty("salesLevelCode")
    private String salesLevelCode;
    @JsonProperty("salesPriceTypeID")
    private Integer salesPriceTypeID;
    @JsonProperty("salesPrice")
    private Double salesPrice;
    @JsonProperty("salesDiscount")
    private Integer salesDiscount;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private String toDate;
    @JsonProperty("sortIndex")
    private Integer sortIndex;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("sourceTable")
    private Integer sourceTable;
    @JsonProperty("createdInERP")
    private Boolean createdInERP;
    @JsonProperty("createdInERPDate")
    private String createdInERPDate;
    @JsonProperty("quantity")
    private Double quantity;
    @JsonProperty("picturePath")
    private String picturePath;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("approvalStatusID")
    private Integer approvalStatusID;
    @JsonProperty("createdByUserID")
    private Integer createdByUserID;
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

    @JsonProperty("itemID")
    public Integer getItemID() {
        return itemID;
    }

    @JsonProperty("itemID")
    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    @JsonProperty("slSalesLevelTypeID")
    public Integer getSlSalesLevelTypeID() {
        return slSalesLevelTypeID;
    }

    @JsonProperty("slSalesLevelTypeID")
    public void setSlSalesLevelTypeID(Integer slSalesLevelTypeID) {
        this.slSalesLevelTypeID = slSalesLevelTypeID;
    }

    @JsonProperty("salesLevelCode")
    public String getSalesLevelCode() {
        return salesLevelCode;
    }

    @JsonProperty("salesLevelCode")
    public void setSalesLevelCode(String salesLevelCode) {
        this.salesLevelCode = salesLevelCode;
    }

    @JsonProperty("salesPriceTypeID")
    public Integer getSalesPriceTypeID() {
        return salesPriceTypeID;
    }

    @JsonProperty("salesPriceTypeID")
    public void setSalesPriceTypeID(Integer salesPriceTypeID) {
        this.salesPriceTypeID = salesPriceTypeID;
    }

    @JsonProperty("salesPrice")
    public Double getSalesPrice() {
        return salesPrice;
    }

    @JsonProperty("salesPrice")
    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @JsonProperty("salesDiscount")
    public Integer getSalesDiscount() {
        return salesDiscount;
    }

    @JsonProperty("salesDiscount")
    public void setSalesDiscount(Integer salesDiscount) {
        this.salesDiscount = salesDiscount;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("fromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("fromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("toDate")
    public String getToDate() {
        return toDate;
    }

    @JsonProperty("toDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @JsonProperty("sortIndex")
    public Integer getSortIndex() {
        return sortIndex;
    }

    @JsonProperty("sortIndex")
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
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

    @JsonProperty("sourceTable")
    public Integer getSourceTable() {
        return sourceTable;
    }

    @JsonProperty("sourceTable")
    public void setSourceTable(Integer sourceTable) {
        this.sourceTable = sourceTable;
    }

    @JsonProperty("createdInERP")
    public Boolean getCreatedInERP() {
        return createdInERP;
    }

    @JsonProperty("createdInERP")
    public void setCreatedInERP(Boolean createdInERP) {
        this.createdInERP = createdInERP;
    }

    @JsonProperty("createdInERPDate")
    public String getCreatedInERPDate() {
        return createdInERPDate;
    }

    @JsonProperty("createdInERPDate")
    public void setCreatedInERPDate(String createdInERPDate) {
        this.createdInERPDate = createdInERPDate;
    }

    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("picturePath")
    public String getPicturePath() {
        return picturePath;
    }

    @JsonProperty("picturePath")
    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("approvalStatusID")
    public Integer getApprovalStatusID() {
        return approvalStatusID;
    }

    @JsonProperty("approvalStatusID")
    public void setApprovalStatusID(Integer approvalStatusID) {
        this.approvalStatusID = approvalStatusID;
    }

    @JsonProperty("createdByUserID")
    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    @JsonProperty("createdByUserID")
    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
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
