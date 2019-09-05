package com.intelisale.database.entity.column;

import androidx.room.PrimaryKey;

public class BaseColumns {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
