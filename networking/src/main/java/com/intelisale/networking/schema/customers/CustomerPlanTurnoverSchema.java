package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerPlanTurnoverSchema {

    @JsonProperty("planVsPrometID")
    private Integer planVsPrometID;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("screnPosition")
    private String screenPosition;
    @JsonProperty("value")
    private Double value;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("planVsPrometID")
    public Integer getPlanVsPrometID() {
        return planVsPrometID;
    }

    @JsonProperty("planVsPrometID")
    public void setPlanVsPrometID(Integer planVsPrometID) {
        this.planVsPrometID = planVsPrometID;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("screnPosition")
    public String getScreenPosition() {
        return screenPosition;
    }

    @JsonProperty("screnPosition")
    public void setScreenPosition(String screenPosition) {
        this.screenPosition = screenPosition;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}