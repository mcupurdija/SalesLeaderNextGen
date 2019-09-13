package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CONTACTS, indices = {@Index(value = "serverID", unique = true)})
public class ContactEntity extends BaseAuditColumns {

    private String code;
    private String firstName;
    private String lastName;
    private String phone;
    private String mobile;
    private String email;
    private Integer customerID;
    private Integer contactDepartmentID;
    private Integer contactPositionID;
    private Integer employeeID;
    private String address;
    private Integer postalCodeAndCityID;
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

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getContactDepartmentID() {
        return contactDepartmentID;
    }

    public void setContactDepartmentID(Integer contactDepartmentID) {
        this.contactDepartmentID = contactDepartmentID;
    }

    public Integer getContactPositionID() {
        return contactPositionID;
    }

    public void setContactPositionID(Integer contactPositionID) {
        this.contactPositionID = contactPositionID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalCodeAndCityID() {
        return postalCodeAndCityID;
    }

    public void setPostalCodeAndCityID(Integer postalCodeAndCityID) {
        this.postalCodeAndCityID = postalCodeAndCityID;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
