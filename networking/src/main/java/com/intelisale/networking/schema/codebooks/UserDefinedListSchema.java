package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDefinedListSchema {

    @JsonProperty("userDefinedListsID")
    private Integer userDefinedListsID;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("listName")
    private String listName;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("listEditable")
    private Boolean listEditable;
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
    @JsonProperty("specialType")
    private String specialType;
    @JsonProperty("userID")
    private Integer userID;
    @JsonProperty("differentForCustomer")
    private Boolean differentForCustomer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("userDefinedListsID")
    public Integer getUserDefinedListsID() {
        return userDefinedListsID;
    }

    @JsonProperty("userDefinedListsID")
    public void setUserDefinedListsID(Integer userDefinedListsID) {
        this.userDefinedListsID = userDefinedListsID;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("listName")
    public String getListName() {
        return listName;
    }

    @JsonProperty("listName")
    public void setListName(String listName) {
        this.listName = listName;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("listEditable")
    public Boolean getListEditable() {
        return listEditable;
    }

    @JsonProperty("listEditable")
    public void setListEditable(Boolean listEditable) {
        this.listEditable = listEditable;
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

    @JsonProperty("specialType")
    public String getSpecialType() {
        return specialType;
    }

    @JsonProperty("specialType")
    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    @JsonProperty("userID")
    public Integer getUserID() {
        return userID;
    }

    @JsonProperty("userID")
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    @JsonProperty("differentForCustomer")
    public Boolean getDifferentForCustomer() {
        return differentForCustomer;
    }

    @JsonProperty("differentForCustomer")
    public void setDifferentForCustomer(Boolean differentForCustomer) {
        this.differentForCustomer = differentForCustomer;
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
