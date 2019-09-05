package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerStatisticSchema {

    @JsonProperty("customerStatisticsID")
    private Integer customerStatisticsID;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("period")
    private String period;
    @JsonProperty("diffItems")
    private Integer diffItems;
    @JsonProperty("salesLines")
    private Integer salesLines;
    @JsonProperty("visits")
    private Integer visits;
    @JsonProperty("orders")
    private Integer orders;
    @JsonProperty("offers")
    private Integer offers;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("turnover")
    private Double turnover;
    @JsonProperty("turnoverNotInvoiced")
    private Integer turnoverNotInvoiced;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerStatisticsID")
    public Integer getCustomerStatisticsID() {
        return customerStatisticsID;
    }

    @JsonProperty("customerStatisticsID")
    public void setCustomerStatisticsID(Integer customerStatisticsID) {
        this.customerStatisticsID = customerStatisticsID;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("diffItems")
    public Integer getDiffItems() {
        return diffItems;
    }

    @JsonProperty("diffItems")
    public void setDiffItems(Integer diffItems) {
        this.diffItems = diffItems;
    }

    @JsonProperty("salesLines")
    public Integer getSalesLines() {
        return salesLines;
    }

    @JsonProperty("salesLines")
    public void setSalesLines(Integer salesLines) {
        this.salesLines = salesLines;
    }

    @JsonProperty("visits")
    public Integer getVisits() {
        return visits;
    }

    @JsonProperty("visits")
    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    @JsonProperty("orders")
    public Integer getOrders() {
        return orders;
    }

    @JsonProperty("orders")
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @JsonProperty("offers")
    public Integer getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Integer offers) {
        this.offers = offers;
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

    @JsonProperty("turnover")
    public Double getTurnover() {
        return turnover;
    }

    @JsonProperty("turnover")
    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    @JsonProperty("turnoverNotInvoiced")
    public Integer getTurnoverNotInvoiced() {
        return turnoverNotInvoiced;
    }

    @JsonProperty("turnoverNotInvoiced")
    public void setTurnoverNotInvoiced(Integer turnoverNotInvoiced) {
        this.turnoverNotInvoiced = turnoverNotInvoiced;
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