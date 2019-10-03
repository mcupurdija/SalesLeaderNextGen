package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.VISIT_SUB_RESULTS, indices = {@Index(value = "serverID", unique = true)})
public class VisitSubResultEntity extends CodeBookColumns {

    private String name;
    private Integer visitTypeID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVisitTypeID() {
        return visitTypeID;
    }

    public void setVisitTypeID(Integer visitTypeID) {
        this.visitTypeID = visitTypeID;
    }
}