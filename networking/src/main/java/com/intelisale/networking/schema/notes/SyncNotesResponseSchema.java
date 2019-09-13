package com.intelisale.networking.schema.notes;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelisale.networking.schema.BaseRecordSchema;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncNotesResponseSchema {

    @JsonProperty("NotesTargetGroups")
    private BaseRecordSchema<NoteTargetGroupsSchema> noteTargetGroups = null;
    @JsonProperty("NotesTargetTypes")
    private BaseRecordSchema<NoteTargetTypesSchema> noteTargetTypes = null;
    @JsonProperty("Notes")
    private BaseRecordSchema<NoteSchema> notes = null;
    @JsonProperty("NotesAttachments")
    private BaseRecordSchema<NoteAttachmentsSchema> noteAttachments = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NotesTargetGroups")
    public BaseRecordSchema<NoteTargetGroupsSchema> getNoteTargetGroups() {
        return noteTargetGroups;
    }

    @JsonProperty("NotesTargetGroups")
    public void setNoteTargetGroups(BaseRecordSchema<NoteTargetGroupsSchema> noteTargetGroups) {
        this.noteTargetGroups = noteTargetGroups;
    }

    @JsonProperty("NotesTargetTypes")
    public BaseRecordSchema<NoteTargetTypesSchema> getNoteTargetTypes() {
        return noteTargetTypes;
    }

    @JsonProperty("NotesTargetTypes")
    public void setNoteTargetTypes(BaseRecordSchema<NoteTargetTypesSchema> noteTargetTypes) {
        this.noteTargetTypes = noteTargetTypes;
    }

    @JsonProperty("Notes")
    public BaseRecordSchema<NoteSchema> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(BaseRecordSchema<NoteSchema> notes) {
        this.notes = notes;
    }

    @JsonProperty("NotesAttachments")
    public BaseRecordSchema<NoteAttachmentsSchema> getNoteAttachments() {
        return noteAttachments;
    }

    @JsonProperty("NotesAttachments")
    public void setNoteAttachments(BaseRecordSchema<NoteAttachmentsSchema> noteAttachments) {
        this.noteAttachments = noteAttachments;
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
