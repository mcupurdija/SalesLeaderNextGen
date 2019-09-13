package com.intelisale.networking.schema.notes;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("noteTargetTypeId")
    private Integer noteTargetTypeID;
    @JsonProperty("noteTargetId")
    private Integer noteTargetID;
    @JsonProperty("noteContent")
    private String noteContent;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("createdByUserId")
    private Integer createdByUserID;
    @JsonProperty("modifiedByUserId")
    private Integer modifiedByUserID;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("customerId")
    private Integer customerID;
    @JsonProperty("reminder")
    private String reminder;
    @JsonProperty("clientId")
    private Integer clientID;
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

    @JsonProperty("noteTargetTypeId")
    public Integer getNoteTargetTypeID() {
        return noteTargetTypeID;
    }

    @JsonProperty("noteTargetTypeId")
    public void setNoteTargetTypeID(Integer noteTargetTypeID) {
        this.noteTargetTypeID = noteTargetTypeID;
    }

    @JsonProperty("noteTargetId")
    public Integer getNoteTargetID() {
        return noteTargetID;
    }

    @JsonProperty("noteTargetId")
    public void setNoteTargetID(Integer noteTargetID) {
        this.noteTargetID = noteTargetID;
    }

    @JsonProperty("noteContent")
    public String getNoteContent() {
        return noteContent;
    }

    @JsonProperty("noteContent")
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("createdByUserId")
    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    @JsonProperty("createdByUserId")
    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    @JsonProperty("modifiedByUserId")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserId")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("customerId")
    public Integer getCustomerID() {
        return customerID;
    }

    @JsonProperty("customerId")
    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    @JsonProperty("reminder")
    public String getReminder() {
        return reminder;
    }

    @JsonProperty("reminder")
    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    @JsonProperty("clientId")
    public Integer getClientID() {
        return clientID;
    }

    @JsonProperty("clientId")
    public void setClientID(Integer clientID) {
        this.clientID = clientID;
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
