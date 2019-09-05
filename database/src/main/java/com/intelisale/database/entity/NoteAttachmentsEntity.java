package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "NotesAttachments")
public class NoteAttachmentsEntity extends BaseAuditColumns {

    private Integer noteId;
    private String filePath;
    private String devicePath;
    private String createdDate;
    private Integer typeId;
    private Boolean deletedFromDevice;
    private Boolean sent;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Boolean isDeletedFromDevice() {
        return deletedFromDevice;
    }

    public void setDeletedFromDevice(Boolean deletedFromDevice) {
        this.deletedFromDevice = deletedFromDevice;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
