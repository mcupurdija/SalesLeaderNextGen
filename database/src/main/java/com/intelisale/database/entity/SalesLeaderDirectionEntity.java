package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_DIRECTIONS, indices = {@Index(value = "serverID", unique = true)})
public class SalesLeaderDirectionEntity extends CodeBookColumns {
}
