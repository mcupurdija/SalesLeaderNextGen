package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.CUSTOMER_SHIP_TO_ADDRESSES)
public class CustomerShipToAddressesEntity extends CodeBookColumns {

    private String description2;
    private String address;
    private Integer postalCodeAndCityID;
    private String countyRegion;
    private String phoneNo;
    private String mobileNo;
    private String faxNo;
    private String email;
    private String homePage;
    private Integer customerID;
    private String municipalityOfOperating;
    private String regionOfOperating;
    private String cityOfOperating;
    private String postCodeOfOperating;
    private String countyOfOperating;
    private String gpsLatitude;
    private String gpsLongitude;
    private String gpsAccuracy;
    private String contactPerson;

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
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

    public String getCountyRegion() {
        return countyRegion;
    }

    public void setCountyRegion(String countyRegion) {
        this.countyRegion = countyRegion;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getMunicipalityOfOperating() {
        return municipalityOfOperating;
    }

    public void setMunicipalityOfOperating(String municipalityOfOperating) {
        this.municipalityOfOperating = municipalityOfOperating;
    }

    public String getRegionOfOperating() {
        return regionOfOperating;
    }

    public void setRegionOfOperating(String regionOfOperating) {
        this.regionOfOperating = regionOfOperating;
    }

    public String getCityOfOperating() {
        return cityOfOperating;
    }

    public void setCityOfOperating(String cityOfOperating) {
        this.cityOfOperating = cityOfOperating;
    }

    public String getPostCodeOfOperating() {
        return postCodeOfOperating;
    }

    public void setPostCodeOfOperating(String postCodeOfOperating) {
        this.postCodeOfOperating = postCodeOfOperating;
    }

    public String getCountyOfOperating() {
        return countyOfOperating;
    }

    public void setCountyOfOperating(String countyOfOperating) {
        this.countyOfOperating = countyOfOperating;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    public void setGpsAccuracy(String gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
