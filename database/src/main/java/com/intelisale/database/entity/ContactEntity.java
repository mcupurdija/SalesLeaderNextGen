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
    private int customerId;
    private int contactDepartmentId;
    private int contactPositionId;
    private int employeeId;
    private String address;
    private int postalCodeAndCityId;
    private boolean sent;

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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getContactDepartmentId() {
        return contactDepartmentId;
    }

    public void setContactDepartmentId(int contactDepartmentId) {
        this.contactDepartmentId = contactDepartmentId;
    }

    public int getContactPositionId() {
        return contactPositionId;
    }

    public void setContactPositionId(int contactPositionId) {
        this.contactPositionId = contactPositionId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCodeAndCityId() {
        return postalCodeAndCityId;
    }

    public void setPostalCodeAndCityId(int postalCodeAndCityId) {
        this.postalCodeAndCityId = postalCodeAndCityId;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
