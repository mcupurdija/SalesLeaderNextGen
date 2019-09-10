package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerCustomListSchema {

    @JsonProperty("customerId")
    private Integer customerID;
    @JsonProperty("customListHeaderId")
    private Integer customListHeaderID;
    @JsonProperty("dateFrom")
    private String dateFrom;
    @JsonProperty("dateTo")
    private String dateTo;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByUserId")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerId")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerId")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("customListHeaderId")
    public Integer getCustomListHeaderID() {
        return customListHeaderID;
    }

    @JsonProperty("customListHeaderId")
    public void setCustomListHeaderID(Integer customListHeaderID) {
        this.customListHeaderID = customListHeaderID;
    }

    @JsonProperty("dateFrom")
    public String getDateFrom() {
        return dateFrom;
    }

    @JsonProperty("dateFrom")
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    @JsonProperty("dateTo")
    public String getDateTo() {
        return dateTo;
    }

    @JsonProperty("dateTo")
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("modifiedByUserId")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserId")
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