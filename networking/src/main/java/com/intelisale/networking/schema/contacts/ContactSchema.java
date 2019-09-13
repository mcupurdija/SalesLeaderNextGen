package com.intelisale.networking.schema.contacts;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("businessKey")
    private String businessKey;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("code")
    private String code;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("customerID")
    private Integer customerID;
    @JsonProperty("contactDepartmentID")
    private Integer contactDepartmentID;
    @JsonProperty("contactPositionID")
    private Integer contactPositionID;
    @JsonProperty("address")
    private String address;
    @JsonProperty("postalCodeAndCityID")
    private Integer postalCodeAndCityID;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("primarContactAtCustomer")
    private Boolean primarContactAtCustomer;
    @JsonProperty("createdByUserID")
    private Integer createdByUserID;
    @JsonProperty("employeeID")
    private Integer employeeID;
    @JsonProperty("custBusinessUnitCode")
    private String custBusinessUnitCode;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("customerID")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerID")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("contactDepartmentID")
    public Integer getContactDepartmentID() {
        return contactDepartmentID;
    }

    @JsonProperty("contactDepartmentID")
    public void setContactDepartmentID(Integer contactDepartmentID) {
        this.contactDepartmentID = contactDepartmentID;
    }

    @JsonProperty("contactPositionID")
    public Integer getContactPositionID() {
        return contactPositionID;
    }

    @JsonProperty("contactPositionID")
    public void setContactPositionID(Integer contactPositionID) {
        this.contactPositionID = contactPositionID;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("postalCodeAndCityID")
    public Integer getPostalCodeAndCityID() {
        return postalCodeAndCityID;
    }

    @JsonProperty("postalCodeAndCityID")
    public void setPostalCodeAndCityID(Integer postalCodeAndCityID) {
        this.postalCodeAndCityID = postalCodeAndCityID;
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

    @JsonProperty("primarContactAtCustomer")
    public Boolean getPrimarContactAtCustomer() {
        return primarContactAtCustomer;
    }

    @JsonProperty("primarContactAtCustomer")
    public void setPrimarContactAtCustomer(Boolean primarContactAtCustomer) {
        this.primarContactAtCustomer = primarContactAtCustomer;
    }

    @JsonProperty("createdByUserID")
    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    @JsonProperty("createdByUserID")
    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    @JsonProperty("employeeID")
    public Integer getEmployeeID() {
        return employeeID;
    }

    @JsonProperty("employeeID")
    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    @JsonProperty("custBusinessUnitCode")
    public String getCustBusinessUnitCode() {
        return custBusinessUnitCode;
    }

    @JsonProperty("custBusinessUnitCode")
    public void setCustBusinessUnitCode(String custBusinessUnitCode) {
        this.custBusinessUnitCode = custBusinessUnitCode;
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