package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class StockAvailabilityStatusSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("statusName")
    private String statusName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByUserId")
    private Integer modifiedByUserId;
    @JsonProperty("active")
    private Boolean active;
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

    @JsonProperty("statusName")
    public String getStatusName() {
        return statusName;
    }

    @JsonProperty("statusName")
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
