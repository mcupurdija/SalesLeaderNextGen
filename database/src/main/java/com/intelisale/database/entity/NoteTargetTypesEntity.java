package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

import org.joda.time.DateTime;

@Entity(tableName = "NotesTargetTypes")
public class NoteTargetTypesEntity extends CodeBookColumns {

    private int noteTargetGroupId;
    private int createdByUserId;
    private DateTime createdDate;

    public int getNoteTargetGroupId() {
        return noteTargetGroupId;
    }

    public void setNoteTargetGroupId(int noteTargetGroupId) {
        this.noteTargetGroupId = noteTargetGroupId;
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
}
