package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupOfCustomersCategoryItemSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("groupOfCustomerId")
    private Integer groupOfCustomerId;
    @JsonProperty("categoryOfItemsId")
    private Integer categoryOfItemsId;
    @JsonProperty("rank")
    private Integer rank;
    @JsonProperty("importance")
    private Integer importance;
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

    @JsonProperty("groupOfCustomerId")
    public Integer getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    @JsonProperty("groupOfCustomerId")
    public void setGroupOfCustomerId(Integer groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    @JsonProperty("categoryOfItemsId")
    public Integer getCategoryOfItemsId() {
        return categoryOfItemsId;
    }

    @JsonProperty("categoryOfItemsId")
    public void setCategoryOfItemsId(Integer categoryOfItemsId) {
        this.categoryOfItemsId = categoryOfItemsId;
    }

    @JsonProperty("rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @JsonProperty("importance")
    public Integer getImportance() {
        return importance;
    }

    @JsonProperty("importance")
    public void setImportance(Integer importance) {
        this.importance = importance;
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
