package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerVisitSchema {

    @JsonProperty("customerVisitsStatID")
    private Integer customerVisitsStatID;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("date")
    private String date;
    @JsonProperty("customerVisits")
    private Integer customerVisits;
    @JsonProperty("customerTime")
    private Integer customerTime;
    @JsonProperty("productivityPerVisit")
    private Integer productivityPerVisit;
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

    @JsonProperty("customerVisitsStatID")
    public Integer getCustomerVisitsStatID() {
        return customerVisitsStatID;
    }

    @JsonProperty("customerVisitsStatID")
    public void setCustomerVisitsStatID(Integer customerVisitsStatID) {
        this.customerVisitsStatID = customerVisitsStatID;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("customerVisits")
    public Integer getCustomerVisits() {
        return customerVisits;
    }

    @JsonProperty("customerVisits")
    public void setCustomerVisits(Integer customerVisits) {
        this.customerVisits = customerVisits;
    }

    @JsonProperty("customerTime")
    public Integer getCustomerTime() {
        return customerTime;
    }

    @JsonProperty("customerTime")
    public void setCustomerTime(Integer customerTime) {
        this.customerTime = customerTime;
    }

    @JsonProperty("productivityPerVisit")
    public Integer getProductivityPerVisit() {
        return productivityPerVisit;
    }

    @JsonProperty("productivityPerVisit")
    public void setProductivityPerVisit(Integer productivityPerVisit) {
        this.productivityPerVisit = productivityPerVisit;
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