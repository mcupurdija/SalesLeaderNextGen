package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "CustomListsLines")
public class CustomListsLineEntity extends BaseAuditColumns {

    private int customListHeaderId;
    private int itemId;
    private int sortIndex;

    public int getCustomListHeaderId() {
        return customListHeaderId;
    }

    public void setCustomListHeaderId(int customListHeaderId) {
        this.customListHeaderId = customListHeaderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }
}
