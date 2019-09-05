package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SLCategoriesAllowedToCustomerSchema {

    @JsonProperty("slCategoriesAllowedToCust")
    private Integer slCategoriesAllowedToCust;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("categoryOfItemsID")
    private Integer categoryOfItemsID;
    @JsonProperty("slSalesLevelTypeID")
    private Integer slSalesLevelTypeID;
    @JsonProperty("salesLevelCode")
    private String salesLevelCode;
    @JsonProperty("sortIndex")
    private Integer sortIndex;
    @JsonProperty("sourceTable")
    private Integer sourceTable;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("slCategoriesAllowedToCust")
    public Integer getSlCategoriesAllowedToCust() {
        return slCategoriesAllowedToCust;
    }

    @JsonProperty("slCategoriesAllowedToCust")
    public void setSlCategoriesAllowedToCust(Integer slCategoriesAllowedToCust) {
        this.slCategoriesAllowedToCust = slCategoriesAllowedToCust;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("categoryOfItemsID")
    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    @JsonProperty("categoryOfItemsID")
    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
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

    @JsonProperty("sortIndex")
    public Integer getSortIndex() {
        return sortIndex;
    }

    @JsonProperty("sortIndex")
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    @JsonProperty("sourceTable")
    public Integer getSourceTable() {
        return sourceTable;
    }

    @JsonProperty("sourceTable")
    public void setSourceTable(Integer sourceTable) {
        this.sourceTable = sourceTable;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}