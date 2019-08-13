package com.intelisale.database.entity.column;

import androidx.room.PrimaryKey;

public class BaseColumns {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
