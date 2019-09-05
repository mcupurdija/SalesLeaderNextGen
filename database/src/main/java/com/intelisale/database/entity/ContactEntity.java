package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Contacts")
public class ContactEntity extends BaseAuditColumns {

    private String code;
    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private Integer customerId;
    private Integer contactDepartmentId;
    private Integer contactPositionId;
    private Integer employeeId;
    private String address;
    private Integer postalCodeAndCityId;
    private Boolean sent;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getContactDepartmentId() {
        return contactDepartmentId;
    }

    public void setContactDepartmentId(Integer contactDepartmentId) {
        this.contactDepartmentId = contactDepartmentId;
    }

    public Integer getContactPositionId() {
        return contactPositionId;
    }

    public void setContactPositionId(Integer contactPositionId) {
        this.contactPositionId = contactPositionId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalCodeAndCityId() {
        return postalCodeAndCityId;
    }

    public void setPostalCodeAndCityId(Integer postalCodeAndCityId) {
        this.postalCodeAndCityId = postalCodeAndCityId;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
