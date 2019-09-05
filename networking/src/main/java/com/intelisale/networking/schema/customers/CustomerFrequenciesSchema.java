package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerFrequenciesSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("customerId")
    private Integer customerId;
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("week")
    private Integer week;
    @JsonProperty("day")
    private Integer day;
    @JsonProperty("visitTime")
    private Double visitTime;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByUserId")
    private Integer modifiedByUserId;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("createdByUserId")
    private Integer createdByUserId;
    @JsonProperty("activityGroup")
    private Integer activityGroup;
    @JsonProperty("cycle")
    private Integer cycle;
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

    @JsonProperty("customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("week")
    public Integer getWeek() {
        return week;
    }

    @JsonProperty("week")
    public void setWeek(Integer week) {
        this.week = week;
    }

    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    @JsonProperty("visitTime")
    public Double getVisitTime() {
        return visitTime;
    }

    @JsonProperty("visitTime")
    public void setVisitTime(Double visitTime) {
        this.visitTime = visitTime;
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
    public Integer getModifiedByUserId() {
        return modifiedByUserId;
    }

    @JsonProperty("modifiedByUserId")
    public void setModifiedByUserId(Integer modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("createdByUserId")
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    @JsonProperty("createdByUserId")
    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @JsonProperty("activityGroup")
    public Integer getActivityGroup() {
        return activityGroup;
    }

    @JsonProperty("activityGroup")
    public void setActivityGroup(Integer activityGroup) {
        this.activityGroup = activityGroup;
    }

    @JsonProperty("cycle")
    public Integer getCycle() {
        return cycle;
    }

    @JsonProperty("cycle")
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
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