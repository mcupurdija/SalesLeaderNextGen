package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SERVICE_CLASSIFICATION_TYPES, indices = {@Index(value = "serverID", unique = true)})
public class ServiceClassificationTypeEntity extends CodeBookColumns {
}
