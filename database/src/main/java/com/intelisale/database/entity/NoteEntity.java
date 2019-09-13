package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.NOTES, indices = {@Index(value = "serverID", unique = true)})
public class NoteEntity extends BaseAuditColumns {

    private Integer noteTargetTypeID;
    private Integer noteTargetID;
    private String noteContent;
    private Integer customerID;
    private Integer createdByUserID;
    private String createdDate;
    private String reminder;
    private Boolean sent;

    public Integer getNoteTargetTypeID() {
        return noteTargetTypeID;
    }

    public void setNoteTargetTypeID(Integer noteTargetTypeID) {
        this.noteTargetTypeID = noteTargetTypeID;
    }

    public Integer getNoteTargetID() {
        return noteTargetID;
    }

    public void setNoteTargetID(Integer noteTargetID) {
        this.noteTargetID = noteTargetID;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(Integer createdByUserID) {
        this.createdByUserID = createdByUserID;
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
