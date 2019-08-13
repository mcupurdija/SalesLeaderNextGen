package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "CategoriesOfItems")
public class CategoryOfItemsEntity extends CodeBookColumns {

    private String parentCode;
    private int parentCategoryOfItemsId;
    private String smallPictureName;
    private String largePictureName;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public int getParentCategoryOfItemsId() {
        return parentCategoryOfItemsId;
    }

    public void setParentCategoryOfItemsId(int parentCategoryOfItemsId) {
        this.parentCategoryOfItemsId = parentCategoryOfItemsId;
    }

    public String getSmallPictureName() {
        return smallPictureName;
    }

    public void setSmallPictureName(String smallPictureName) {
        this.smallPictureName = smallPictureName;
    }

    public String getLargePictureName() {
        return largePictureName;
    }

    public void setLargePictureName(String largePictureName) {
        this.largePictureName = largePictureName;
    }
}
