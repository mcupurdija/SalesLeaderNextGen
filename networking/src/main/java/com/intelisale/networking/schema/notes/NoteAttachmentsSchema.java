package com.intelisale.networking.schema.notes;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteAttachmentsSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("noteId")
    private Integer noteID;
    @JsonProperty("filePath")
    private String filePath;
    @JsonProperty("devicePath")
    private String devicePath;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByUserId")
    private Integer modifiedByUserID;
    @JsonProperty("typeID")
    private Integer typeID;
    @JsonProperty("clientId")
    private Integer clientID;
    @JsonProperty("active")
    private Boolean active;
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

    @JsonProperty("noteId")
    public Integer getNoteID() {
        return noteID;
    }

    @JsonProperty("noteId")
    public void setNoteID(Integer noteID) {
        this.noteID = noteID;
    }

    @JsonProperty("filePath")
    public String getFilePath() {
        return filePath;
    }

    @JsonProperty("filePath")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @JsonProperty("devicePath")
    public String getDevicePath() {
        return devicePath;
    }

    @JsonProperty("devicePath")
    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("modifiedByUserId")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserId")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("typeID")
    public Integer getTypeID() {
        return typeID;
    }

    @JsonProperty("typeID")
    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    @JsonProperty("clientId")
    public Integer getClientID() {
        return clientID;
    }

    @JsonProperty("clientId")
    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
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
