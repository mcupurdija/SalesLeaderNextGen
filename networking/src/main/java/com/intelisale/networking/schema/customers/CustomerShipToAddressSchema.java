package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerShipToAddressSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("businessKey")
    private String businessKey;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description2")
    private String description2;
    @JsonProperty("adress")
    private String adress;
    @JsonProperty("code")
    private String code;
    @JsonProperty("postalCodeAndCityID")
    private Integer postalCodeAndCityID;
    @JsonProperty("county_Region")
    private String countyRegion;
    @JsonProperty("phoneNo")
    private String phoneNo;
    @JsonProperty("mobileNo")
    private String mobileNo;
    @JsonProperty("faxNo")
    private String faxNo;
    @JsonProperty("email")
    private String email;
    @JsonProperty("homePage")
    private String homePage;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("municipalityOfOperating")
    private String municipalityOfOperating;
    @JsonProperty("regionOfOperating")
    private String regionOfOperating;
    @JsonProperty("cityOfOperating")
    private String cityOfOperating;
    @JsonProperty("postCodeOfOperating")
    private String postCodeOfOperating;
    @JsonProperty("countyOfOperating")
    private String countyOfOperating;
    @JsonProperty("gpsLatitude")
    private String gpsLatitude;
    @JsonProperty("gpsLongitude")
    private String gpsLongitude;
    @JsonProperty("gpsAccuracy")
    private String gpsAccuracy;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("customerSourceTable")
    private Integer customerSourceTable;
    @JsonProperty("contactPerson")
    private String contactPerson;
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

    @JsonProperty("businessKey")
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonProperty("businessKey")
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description2")
    public String getDescription2() {
        return description2;
    }

    @JsonProperty("description2")
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    @JsonProperty("adress")
    public String getAdress() {
        return adress;
    }

    @JsonProperty("adress")
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("postalCodeAndCityID")
    public Integer getPostalCodeAndCityID() {
        return postalCodeAndCityID;
    }

    @JsonProperty("postalCodeAndCityID")
    public void setPostalCodeAndCityID(Integer postalCodeAndCityID) {
        this.postalCodeAndCityID = postalCodeAndCityID;
    }

    @JsonProperty("county_Region")
    public String getCountyRegion() {
        return countyRegion;
    }

    @JsonProperty("county_Region")
    public void setCountyRegion(String countyRegion) {
        this.countyRegion = countyRegion;
    }

    @JsonProperty("phoneNo")
    public String getPhoneNo() {
        return phoneNo;
    }

    @JsonProperty("phoneNo")
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @JsonProperty("mobileNo")
    public String getMobileNo() {
        return mobileNo;
    }

    @JsonProperty("mobileNo")
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @JsonProperty("faxNo")
    public String getFaxNo() {
        return faxNo;
    }

    @JsonProperty("faxNo")
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("homePage")
    public String getHomePage() {
        return homePage;
    }

    @JsonProperty("homePage")
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("municipalityOfOperating")
    public String getMunicipalityOfOperating() {
        return municipalityOfOperating;
    }

    @JsonProperty("municipalityOfOperating")
    public void setMunicipalityOfOperating(String municipalityOfOperating) {
        this.municipalityOfOperating = municipalityOfOperating;
    }

    @JsonProperty("regionOfOperating")
    public String getRegionOfOperating() {
        return regionOfOperating;
    }

    @JsonProperty("regionOfOperating")
    public void setRegionOfOperating(String regionOfOperating) {
        this.regionOfOperating = regionOfOperating;
    }

    @JsonProperty("cityOfOperating")
    public String getCityOfOperating() {
        return cityOfOperating;
    }

    @JsonProperty("cityOfOperating")
    public void setCityOfOperating(String cityOfOperating) {
        this.cityOfOperating = cityOfOperating;
    }

    @JsonProperty("postCodeOfOperating")
    public String getPostCodeOfOperating() {
        return postCodeOfOperating;
    }

    @JsonProperty("postCodeOfOperating")
    public void setPostCodeOfOperating(String postCodeOfOperating) {
        this.postCodeOfOperating = postCodeOfOperating;
    }

    @JsonProperty("countyOfOperating")
    public String getCountyOfOperating() {
        return countyOfOperating;
    }

    @JsonProperty("countyOfOperating")
    public void setCountyOfOperating(String countyOfOperating) {
        this.countyOfOperating = countyOfOperating;
    }

    @JsonProperty("gpsLatitude")
    public String getGpsLatitude() {
        return gpsLatitude;
    }

    @JsonProperty("gpsLatitude")
    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    @JsonProperty("gpsLongitude")
    public String getGpsLongitude() {
        return gpsLongitude;
    }

    @JsonProperty("gpsLongitude")
    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    @JsonProperty("gpsAccuracy")
    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    @JsonProperty("gpsAccuracy")
    public void setGpsAccuracy(String gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
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

    @JsonProperty("customerSourceTable")
    public Integer getCustomerSourceTable() {
        return customerSourceTable;
    }

    @JsonProperty("customerSourceTable")
    public void setCustomerSourceTable(Integer customerSourceTable) {
        this.customerSourceTable = customerSourceTable;
    }

    @JsonProperty("contactPerson")
    public String getContactPerson() {
        return contactPerson;
    }

    @JsonProperty("contactPerson")
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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