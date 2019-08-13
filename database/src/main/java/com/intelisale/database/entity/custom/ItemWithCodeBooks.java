package com.intelisale.database.entity.custom;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.intelisale.database.entity.CategoryOfItemsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemStatusEntity;
import com.intelisale.database.entity.ItemUnitOfMeasureEntity;

import java.util.List;

public class ItemWithCodeBooks {

    @Embedded
    private ItemEntity itemEntity;
    @Relation(parentColumn = "categoryOfItemsId", entityColumn = "serverId")
    private List<CategoryOfItemsEntity> categoryOfItemsEntities;
    @Relation(parentColumn = "itemStatusId", entityColumn = "serverId")
    private List<ItemStatusEntity> itemStatusEntities;
    @Relation(parentColumn = "itemUnitOfMeasureId", entityColumn = "serverId")
    private List<ItemUnitOfMeasureEntity> itemUnitOfMeasureEntities;

    public ItemEntity getItemEntity() {
        return itemEntity;
    }

    public void setItemEntity(ItemEntity itemEntity) {
        this.itemEntity = itemEntity;
    }

    public List<CategoryOfItemsEntity> getCategoryOfItemsEntities() {
        return categoryOfItemsEntities;
    }

    public void setCategoryOfItemsEntities(List<CategoryOfItemsEntity> categoryOfItemsEntities) {
        this.categoryOfItemsEntities = categoryOfItemsEntities;
    }

    public List<ItemStatusEntity> getItemStatusEntities() {
        return itemStatusEntities;
    }

    public void setItemStatusEntities(List<ItemStatusEntity> itemStatusEntities) {
        this.itemStatusEntities = itemStatusEntities;
    }

    public List<ItemUnitOfMeasureEntity> getItemUnitOfMeasureEntities() {
        return itemUnitOfMeasureEntities;
    }

    public void setItemUnitOfMeasureEntities(List<ItemUnitOfMeasureEntity> itemUnitOfMeasureEntities) {
        this.itemUnitOfMeasureEntities = itemUnitOfMeasureEntities;
    }
}
