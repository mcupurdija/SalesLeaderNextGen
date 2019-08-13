package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "VisitSubResults")
public class VisitSubResultEntity extends CodeBookColumns {

    private String name;
    private int visitTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitTypeId() {
        return visitTypeId;
    }

    public void setVisitTypeId(int visitTypeId) {
        this.visitTypeId = visitTypeId;
    }
}