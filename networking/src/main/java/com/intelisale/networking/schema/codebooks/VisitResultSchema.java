package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitResultSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("visitTypeID")
    private Integer visitTypeID;
    @JsonProperty("code")
    private String code;
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
    @JsonProperty("groupName")
    private String groupName;
    @JsonProperty("visitTypeCode")
    private String visitTypeCode;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("visitTypeID")
    public Integer getVisitTypeID() {
        return visitTypeID;
    }

    @JsonProperty("visitTypeID")
    public void setVisitTypeID(Integer visitTypeID) {
        this.visitTypeID = visitTypeID;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
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

    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("visitTypeCode")
    public String getVisitTypeCode() {
        return visitTypeCode;
    }

    @JsonProperty("visitTypeCode")
    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode;
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
