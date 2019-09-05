package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Notes")
public class NoteEntity extends BaseAuditColumns {

    private Integer noteTargetTypeId;
    private Integer noteTargetId;
    private String noteContent;
    private Integer customerId;
    private Integer createdByUserId;
    private String createdDate;
    private String reminder;
    private Boolean sent;

    public Integer getNoteTargetTypeId() {
        return noteTargetTypeId;
    }

    public void setNoteTargetTypeId(Integer noteTargetTypeId) {
        this.noteTargetTypeId = noteTargetTypeId;
    }

    public Integer getNoteTargetId() {
        return noteTargetId;
    }

    public void setNoteTargetId(Integer noteTargetId) {
        this.noteTargetId = noteTargetId;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
