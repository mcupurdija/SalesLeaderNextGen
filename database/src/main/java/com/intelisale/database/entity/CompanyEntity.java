package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Companies")
public class CompanyEntity extends BaseAuditColumns {

    private String companyName;
    private String companyAddress;
    private String companyCity;
    private String companyPostCode;
    private Boolean disableLogin;
    private Boolean validateVisits;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyPostCode() {
        return companyPostCode;
    }

    public void setCompanyPostCode(String companyPostCode) {
        this.companyPostCode = companyPostCode;
    }

    public Boolean isDisableLogin() {
        return disableLogin;
    }

    public void setDisableLogin(Boolean disableLogin) {
        this.disableLogin = disableLogin;
    }

    public Boolean isValidateVisits() {
        return validateVisits;
    }

    public void setValidateVisits(Boolean validateVisits) {
        this.validateVisits = validateVisits;
    }
}
