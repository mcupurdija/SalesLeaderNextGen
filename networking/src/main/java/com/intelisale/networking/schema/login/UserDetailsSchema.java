package com.intelisale.networking.schema.login;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetailsSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("financialEntities")
    private List<FinancialEntitySchema> financialEntities = null;
    @JsonProperty("roles")
    private List<RoleSchema> roles = null;
    @JsonProperty("permissions")
    private List<PermissionSchema> permissions = null;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("image")
    private String image;
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

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("financialEntities")
    public List<FinancialEntitySchema> getFinancialEntities() {
        return financialEntities;
    }

    @JsonProperty("financialEntities")
    public void setFinancialEntities(List<FinancialEntitySchema> financialEntities) {
        this.financialEntities = financialEntities;
    }

    @JsonProperty("roles")
    public List<RoleSchema> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<RoleSchema> roles) {
        this.roles = roles;
    }

    @JsonProperty("permissions")
    public List<PermissionSchema> getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(List<PermissionSchema> permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
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