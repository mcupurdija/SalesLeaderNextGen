package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "NotesAttachments")
public class NoteAttachmentsEntity extends BaseAuditColumns {

    private int noteId;
    private String filePath;
    private String devicePath;
    private DateTime createdDate;
    private int typeId;
    private boolean deletedFromDevice;
    private boolean sent;

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isDeletedFromDevice() {
        return deletedFromDevice;
    }

    public void setDeletedFromDevice(boolean deletedFromDevice) {
        this.deletedFromDevice = deletedFromDevice;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
