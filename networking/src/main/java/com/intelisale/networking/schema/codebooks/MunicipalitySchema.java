package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MunicipalitySchema {

    @JsonProperty("municipalityID")
    private Integer municipalityID;
    @JsonProperty("municipalityCodeBusinessKey")
    private String municipalityCodeBusinessKey;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("municipalityCode1")
    private String municipalityCode;
    @JsonProperty("municipalityName")
    private String municipalityName;
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

    @JsonProperty("municipalityID")
    public Integer getMunicipalityID() {
        return municipalityID;
    }

    @JsonProperty("municipalityID")
    public void setMunicipalityID(Integer municipalityID) {
        this.municipalityID = municipalityID;
    }

    @JsonProperty("municipalityCodeBusinessKey")
    public String getMunicipalityCodeBusinessKey() {
        return municipalityCodeBusinessKey;
    }

    @JsonProperty("municipalityCodeBusinessKey")
    public void setMunicipalityCodeBusinessKey(String municipalityCodeBusinessKey) {
        this.municipalityCodeBusinessKey = municipalityCodeBusinessKey;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("municipalityCode1")
    public String getMunicipalityCode1() {
        return municipalityCode;
    }

    @JsonProperty("municipalityCode1")
    public void setMunicipalityCode1(String municipalityCode1) {
        this.municipalityCode = municipalityCode1;
    }

    @JsonProperty("municipalityName")
    public String getMunicipalityName() {
        return municipalityName;
    }

    @JsonProperty("municipalityName")
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
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

    @JsonProperty("sctive")
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
