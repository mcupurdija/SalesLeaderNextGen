package com.intelisale.networking.schema.contacts;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelisale.networking.schema.BaseRecordSchema;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncContactsResponseSchema {

    @JsonProperty("Contacts")
    private BaseRecordSchema<ContactSchema> contacts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Contacts")
    public BaseRecordSchema<ContactSchema> getContacts() {
        return contacts;
    }

    @JsonProperty("Contacts")
    public void setContacts(BaseRecordSchema<ContactSchema> contacts) {
        this.contacts = contacts;
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