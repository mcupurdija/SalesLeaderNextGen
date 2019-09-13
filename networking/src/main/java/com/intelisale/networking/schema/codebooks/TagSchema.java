package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagSchema implements Serializable {

    @JsonProperty("TagID")
    private Integer tagID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ModifiedDate")
    private String modifiedDate;
    @JsonProperty("AuditID")
    private Integer auditID;
    @JsonProperty("ModifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("Active")
    private Boolean active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public TagSchema() {
    }

    @JsonProperty("TagID")
    public Integer getTagID() {
        return tagID;
    }

    @JsonProperty("TagID")
    public void setTagID(Integer tagID) {
        this.tagID = tagID;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ModifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("ModifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("AuditID")
    public Integer getAuditID() {
        return auditID;
    }

    @JsonProperty("AuditID")
    public void setAuditID(Integer auditID) {
        this.auditID = auditID;
    }

    @JsonProperty("ModifiedByUserID")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("ModifiedByUserID")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("Active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("Active")
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
