package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerProductGroupPotentialSchema {

    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("categoryOfItemsID")
    private Integer categoryOfItemsID;
    @JsonProperty("turnover")
    private Integer turnover;
    @JsonProperty("potential")
    private Double potential;
    @JsonProperty("unusedPotential")
    private Double unusedPotential;
    @JsonProperty("noOfItems")
    private Integer noOfItems;
    @JsonProperty("categoryRank")
    private Integer categoryRank;
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

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("categoryOfItemsID")
    public Integer getCategoryOfItemsID() {
        return categoryOfItemsID;
    }

    @JsonProperty("categoryOfItemsID")
    public void setCategoryOfItemsID(Integer categoryOfItemsID) {
        this.categoryOfItemsID = categoryOfItemsID;
    }

    @JsonProperty("turnover")
    public Integer getTurnover() {
        return turnover;
    }

    @JsonProperty("turnover")
    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    @JsonProperty("potential")
    public Double getPotential() {
        return potential;
    }

    @JsonProperty("potential")
    public void setPotential(Double potential) {
        this.potential = potential;
    }

    @JsonProperty("unusedPotential")
    public Double getUnusedPotential() {
        return unusedPotential;
    }

    @JsonProperty("unusedPotential")
    public void setUnusedPotential(Double unusedPotential) {
        this.unusedPotential = unusedPotential;
    }

    @JsonProperty("noOfItems")
    public Integer getNoOfItems() {
        return noOfItems;
    }

    @JsonProperty("noOfItems")
    public void setNoOfItems(Integer noOfItems) {
        this.noOfItems = noOfItems;
    }

    @JsonProperty("categoryRank")
    public Integer getCategoryRank() {
        return categoryRank;
    }

    @JsonProperty("categoryRank")
    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
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