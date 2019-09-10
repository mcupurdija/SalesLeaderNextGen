package com.intelisale.networking.schema.items;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemPackagesSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("itemPackageID")
    private Integer itemPackageID;
    @JsonProperty("itemComponentID")
    private Integer itemComponentID;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("sortIndex")
    private Integer sortIndex;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("itemComponentPrice")
    private Double itemComponentPrice;
    @JsonProperty("itemComponentQuantity")
    private Integer itemComponentQuantity;
    @JsonProperty("itemComponentPct")
    private Double itemComponentPct;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("itemComponentDiscPrice")
    private Double itemComponentDiscPrice;
    @JsonProperty("itemComponentDiscount")
    private Integer itemComponentDiscount;
    @JsonProperty("createdByUserID")
    private Integer createdByUserID;
    @JsonProperty("item")
    private ItemSchema item;
    @JsonProperty("salesPrice")
    private Integer salesPrice;
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

    @JsonProperty("itemPackageID")
    public Integer getItemPackageID() {
        return itemPackageID;
    }

    @JsonProperty("itemPackageID")
    public void setItemPackageID(Integer itemPackageID) {
        this.itemPackageID = itemPackageID;
    }

    @JsonProperty("itemComponentID")
    public Integer getItemComponentID() {
        return itemComponentID;
    }

    @JsonProperty("itemComponentID")
    public void setItemComponentID(Integer itemComponentID) {
        this.itemComponentID = itemComponentID;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("sortIndex")
    public Integer getSortIndex() {
        return sortIndex;
    }

    @JsonProperty("sortIndex")
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
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

    @JsonProperty("itemComponentPrice")
    public Double getItemComponentPrice() {
        return itemComponentPrice;
    }

    @JsonProperty("itemComponentPrice")
    public void setItemComponentPrice(Double itemComponentPrice) {
        this.itemComponentPrice = itemComponentPrice;
    }

    @JsonProperty("itemComponentQuantity")
    public Integer getItemComponentQuantity() {
        return itemComponentQuantity;
    }

    @JsonProperty("itemComponentQuantity")
    public void setItemComponentQuantity(Integer itemComponentQuantity) {
        this.itemComponentQuantity = itemComponentQuantity;
    }

    @JsonProperty("itemComponentPct")
    public Double getItemComponentPct() {
        return itemComponentPct;
    }

    @JsonProperty("itemComponentPct")
    public void setItemComponentPct(Double itemComponentPct) {
        this.itemComponentPct = itemComponentPct;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("itemComponentDiscPrice")
    public Double getItemComponentDiscPrice() {
        return itemComponentDiscPrice;
    }

    @JsonProperty("itemComponentDiscPrice")
    public void setItemComponentDiscPrice(Double itemComponentDiscPrice) {
        this.itemComponentDiscPrice = itemComponentDiscPrice;
    }

    @JsonProperty("itemComponentDiscount")
    public Integer getItemComponentDiscount() {
        return itemComponentDiscount;
    }

    @JsonProperty("itemComponentDiscount")
    public void setItemComponentDiscount(Integer itemComponentDiscount) {
        this.itemComponentDiscount = itemComponentDiscount;
    }

    @JsonProperty("createdByUserID")
    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    @JsonProperty("createdByUserID")
    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    @JsonProperty("item")
    public ItemSchema getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(ItemSchema item) {
        this.item = item;
    }

    @JsonProperty("salesPrice")
    public Integer getSalesPrice() {
        return salesPrice;
    }

    @JsonProperty("salesPrice")
    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
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
