package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "Notes")
public class NoteEntity extends BaseAuditColumns {

    private int noteTargetTypeId;
    private int noteTargetId;
    private String noteContent;
    private int customerId;
    private int createdByUserId;
    private DateTime createdDate;
    private String reminder;
    private boolean sent;

    public int getNoteTargetTypeId() {
        return noteTargetTypeId;
    }

    public void setNoteTargetTypeId(int noteTargetTypeId) {
        this.noteTargetTypeId = noteTargetTypeId;
    }

    public int getNoteTargetId() {
        return noteTargetId;
    }

    public void setNoteTargetId(int noteTargetId) {
        this.noteTargetId = noteTargetId;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(int createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
