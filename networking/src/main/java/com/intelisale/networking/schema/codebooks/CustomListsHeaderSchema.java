package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomListsHeaderSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("slSalesLevelTypeId")
    private Integer slSalesLevelTypeId;
    @JsonProperty("salesLevelId")
    private Integer salesLevelId;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("forAllUsers")
    private Boolean forAllUsers;
    @JsonProperty("sortIndex")
    private Integer sortIndex;
    @JsonProperty("createdByUserId")
    private Integer createdByUserId;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("slSalesLevelTypeId")
    public Integer getSlSalesLevelTypeId() {
        return slSalesLevelTypeId;
    }

    @JsonProperty("slSalesLevelTypeId")
    public void setSlSalesLevelTypeId(Integer slSalesLevelTypeId) {
        this.slSalesLevelTypeId = slSalesLevelTypeId;
    }

    @JsonProperty("salesLevelId")
    public Integer getSalesLevelId() {
        return salesLevelId;
    }

    @JsonProperty("salesLevelId")
    public void setSalesLevelId(Integer salesLevelId) {
        this.salesLevelId = salesLevelId;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("modifiedByUserID")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserID")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("forAllUsers")
    public Boolean getForAllUsers() {
        return forAllUsers;
    }

    @JsonProperty("forAllUsers")
    public void setForAllUsers(Boolean forAllUsers) {
        this.forAllUsers = forAllUsers;
    }

    @JsonProperty("sortIndex")
    public Integer getSortIndex() {
        return sortIndex;
    }

    @JsonProperty("sortIndex")
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    @JsonProperty("createdByUserId")
    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    @JsonProperty("createdByUserId")
    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
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
