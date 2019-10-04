package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SERVICE_CLASSIFICATION, indices = {@Index(value = "serverID", unique = true)})
public class ServiceClassificationEntity extends CodeBookColumns {

    private Integer serviceClassificationTypeID;

    public Integer getServiceClassificationTypeID() {
        return serviceClassificationTypeID;
    }

    public void setServiceClassificationTypeID(Integer serviceClassificationTypeID) {
        this.serviceClassificationTypeID = serviceClassificationTypeID;
    }
}
