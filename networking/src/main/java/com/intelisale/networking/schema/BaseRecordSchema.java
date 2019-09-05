package com.intelisale.networking.schema;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseRecordSchema<T> {

    @JsonProperty("records")
    private List<T> records = null;
    @JsonProperty("numOfRecords")
    private int numOfRecords;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("records")
    public List<T> getRecords() {
        return records;
    }

    @JsonProperty("records")
    public void setRecords(List<T> records) {
        this.records = records;
    }

    @JsonProperty("numOfRecords")
    public int getNumOfRecords() {
        return numOfRecords;
    }

    @JsonProperty("numOfRecords")
    public void setNumOfRecords(int numOfRecords) {
        this.numOfRecords = numOfRecords;
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
