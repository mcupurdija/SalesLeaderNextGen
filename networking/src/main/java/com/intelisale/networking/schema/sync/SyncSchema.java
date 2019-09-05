package com.intelisale.networking.schema.sync;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncSchema {

    @JsonProperty("tableName")
    private String tableName;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("itemID")
    private Integer itemID;
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("pageNumber")
    private Integer pageNumber;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public SyncSchema() {
    }

    public SyncSchema(String tableName, String modifiedDate, Integer pageNumber, Integer pageSize) {
        this.tableName = tableName;
        this.modifiedDate = modifiedDate;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("itemID")
    public Integer getItemID() {
        return itemID;
    }

    @JsonProperty("itemID")
    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("pageNumber")
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @NotNull
    @Override
    public String toString() {
        return "SyncSchema{" +
                "tableName='" + tableName + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", customerID=" + customerID +
                ", itemID=" + itemID +
                ", userId=" + userId +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                '}';
    }
}