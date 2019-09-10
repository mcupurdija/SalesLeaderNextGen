package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "PostalCodesAndCities")
public class PostalCodesAndCitiesEntity extends BaseAuditColumns {

    private String postalCode;
    private String city;
    private Integer municipalityID;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMunicipalityID() {
        return municipalityID;
    }

    public void setMunicipalityID(Integer municipalityID) {
        this.municipalityID = municipalityID;
    }
}
