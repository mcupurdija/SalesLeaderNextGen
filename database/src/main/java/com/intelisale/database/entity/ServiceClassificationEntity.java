package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "ServiceClassification")
public class ServiceClassificationEntity extends CodeBookColumns {

    private Integer serviceClassificationTypeId;

    public Integer getServiceClassificationTypeId() {
        return serviceClassificationTypeId;
    }

    public void setServiceClassificationTypeId(Integer serviceClassificationTypeId) {
        this.serviceClassificationTypeId = serviceClassificationTypeId;
    }
}
