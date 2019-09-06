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
    private BaseRecordSchema<ItemSchema> items = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Items")
    public BaseRecordSchema<ItemSchema> getItems() {
        return items;
    }

    @JsonProperty("Items")
    public void setItems(BaseRecordSchema<ItemSchema> items) {
        this.items = items;
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
