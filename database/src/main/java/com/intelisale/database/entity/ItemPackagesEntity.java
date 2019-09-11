package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.CodeBookColumns;

@Entity(tableName = TableNames.SL_ITEMS_PACKAGES, indices = {@Index(value = "serverID", unique = true)})
public class ItemPackagesEntity extends CodeBookColumns {

    private Integer itemPackageID;
    private Integer itemComponentID;
    private Double itemComponentPrice;
    private Double itemComponentQuantity;

    public Integer getItemPackageID() {
        return itemPackageID;
    }

    public void setItemPackageID(Integer itemPackageID) {
        this.itemPackageID = itemPackageID;
    }

    public Integer getItemComponentID() {
        return itemComponentID;
    }

    public void setItemComponentID(Integer itemComponentID) {
        this.itemComponentID = itemComponentID;
    }

    public Double getItemComponentPrice() {
        return itemComponentPrice;
    }

    public void setItemComponentPrice(Double itemComponentPrice) {
        this.itemComponentPrice = itemComponentPrice;
    }

    public Double getItemComponentQuantity() {
        return itemComponentQuantity;
    }

    public void setItemComponentQuantity(Double itemComponentQuantity) {
        this.itemComponentQuantity = itemComponentQuantity;
    }
}
