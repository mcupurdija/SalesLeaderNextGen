package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.NOTES_TARGET_TYPES, indices = {@Index(value = "serverID", unique = true)})
public class NoteTargetTypesEntity extends CodeBookColumns {

    private Integer noteTargetGroupID;
    private Integer createdByUserID;
    private String createdDate;

    public Integer getNoteTargetGroupID() {
        return noteTargetGroupID;
    }

    public void setNoteTargetGroupID(Integer noteTargetGroupID) {
        this.noteTargetGroupID = noteTargetGroupID;
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
}
