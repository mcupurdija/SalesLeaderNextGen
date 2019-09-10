package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = "CategoriesOfItems")
public class CategoryOfItemsEntity extends CodeBookColumns {

    private String parentCode;
    private Integer parentCategoryOfItemsID;
    private String smallPictureName;
    private String largePictureName;

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Integer getParentCategoryOfItemsID() {
        return parentCategoryOfItemsID;
    }

    public void setParentCategoryOfItemsID(Integer parentCategoryOfItemsID) {
        this.parentCategoryOfItemsID = parentCategoryOfItemsID;
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
