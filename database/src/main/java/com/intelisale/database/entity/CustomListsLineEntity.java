package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOM_LISTS_LINES)
public class CustomListsLineEntity extends BaseAuditColumns {

    private Integer customListHeaderId;
    private Integer itemId;
    private Integer sortIndex;

    public Integer getCustomListHeaderId() {
        return customListHeaderId;
    }

    public void setCustomListHeaderId(Integer customListHeaderId) {
        this.customListHeaderId = customListHeaderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
