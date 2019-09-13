package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.NOTES_ATTACHMENTS, indices = {@Index(value = "serverID", unique = true)})
public class NoteAttachmentsEntity extends BaseAuditColumns {

    private Integer noteID;
    private String filePath;
    private String devicePath;
    private String createdDate;
    private Integer typeID;
    private Boolean deletedFromDevice;
    private Boolean sent;

    public Integer getNoteID() {
        return noteID;
    }

    public void setNoteID(Integer noteID) {
        this.noteID = noteID;
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

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
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
