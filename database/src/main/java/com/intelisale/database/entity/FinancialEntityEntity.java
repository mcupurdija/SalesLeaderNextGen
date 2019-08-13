package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "FinancialEntities")
public class FinancialEntityEntity extends BaseAuditColumns {

    private int companyID;
    private String name;
    private String address;
    private String city;
    private String postCode;
    private String sqlServerName;
    private String databaseName;
    private String sqlServerUserName;
    private String sqlServerPassword;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getSqlServerName() {
        return sqlServerName;
    }

    public void setSqlServerName(String sqlServerName) {
        this.sqlServerName = sqlServerName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getSqlServerUserName() {
        return sqlServerUserName;
    }

    public void setSqlServerUserName(String sqlServerUserName) {
        this.sqlServerUserName = sqlServerUserName;
    }

    public String getSqlServerPassword() {
        return sqlServerPassword;
    }

    public void setSqlServerPassword(String sqlServerPassword) {
        this.sqlServerPassword = sqlServerPassword;
    }
}
