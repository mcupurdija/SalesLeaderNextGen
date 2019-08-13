package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "ServiceClassification")
public class ServiceClassificationEntity extends CodeBookColumns {

    private int serviceClassificationTypeId;

    public int getServiceClassificationTypeId() {
        return serviceClassificationTypeId;
    }

    public void setServiceClassificationTypeId(int serviceClassificationTypeId) {
        this.serviceClassificationTypeId = serviceClassificationTypeId;
    }
}
