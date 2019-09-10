package com.intelisale.networking.schema.items;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelisale.networking.schema.BaseRecordSchema;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncItemsResponseSchema {

    @JsonProperty("Items")
    private BaseRecordSchema<ItemSchema> itemSchema = null;
    @JsonProperty("SLItemsAllowedToCustomers")
    private BaseRecordSchema<ItemAllowedToCustomerSchema> itemAllowedToCustomerSchema = null;
    @JsonProperty("SLItemsConnections")
    private BaseRecordSchema<ItemConnectionsSchema> itemConnectionsSchema = null;
    @JsonProperty("SLItemsPackages")
    private BaseRecordSchema<ItemPackagesSchema> itemPackagesSchema = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Items")
    public BaseRecordSchema<ItemSchema> getItemSchema() {
        return itemSchema;
    }

    @JsonProperty("Items")
    public void setItemSchema(BaseRecordSchema<ItemSchema> itemSchema) {
        this.itemSchema = itemSchema;
    }

    @JsonProperty("SLItemsAllowedToCustomers")
    public BaseRecordSchema<ItemAllowedToCustomerSchema> getItemAllowedToCustomerSchema() {
        return itemAllowedToCustomerSchema;
    }

    @JsonProperty("SLItemsAllowedToCustomers")
    public void setItemAllowedToCustomerSchema(BaseRecordSchema<ItemAllowedToCustomerSchema> itemAllowedToCustomerSchema) {
        this.itemAllowedToCustomerSchema = itemAllowedToCustomerSchema;
    }

    @JsonProperty("SLItemsConnections")
    public BaseRecordSchema<ItemConnectionsSchema> getItemConnectionsSchema() {
        return itemConnectionsSchema;
    }

    @JsonProperty("SLItemsConnections")
    public void setItemConnectionsSchema(BaseRecordSchema<ItemConnectionsSchema> itemConnectionsSchema) {
        this.itemConnectionsSchema = itemConnectionsSchema;
    }

    @JsonProperty("SLItemsPackages")
    public BaseRecordSchema<ItemPackagesSchema> getItemPackagesSchema() {
        return itemPackagesSchema;
    }

    @JsonProperty("SLItemsPackages")
    public void setItemPackagesSchema(BaseRecordSchema<ItemPackagesSchema> itemPackagesSchema) {
        this.itemPackagesSchema = itemPackagesSchema;
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
