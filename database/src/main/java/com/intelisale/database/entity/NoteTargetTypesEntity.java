package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "NotesTargetTypes")
public class NoteTargetTypesEntity extends CodeBookColumns {

    private Integer noteTargetGroupId;
    private Integer createdByUserId;
    private String createdDate;

    public Integer getNoteTargetGroupId() {
        return noteTargetGroupId;
    }

    public void setNoteTargetGroupId(Integer noteTargetGroupId) {
        this.noteTargetGroupId = noteTargetGroupId;
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
}
