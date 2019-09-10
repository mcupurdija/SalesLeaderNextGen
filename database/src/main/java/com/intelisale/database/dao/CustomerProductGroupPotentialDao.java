package com.intelisale.database.dao;

import android.annotation.SuppressLint;

import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomerProductGroupPotentialEntity;

import java.util.ArrayList;
import java.util.List;

@Dao
public abstract class CustomerProductGroupPotentialDao extends BaseDao<CustomerProductGroupPotentialEntity> {

    @RawQuery
    abstract int getIdFromPrimarySet(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    @SuppressLint("DefaultLocale")
    public int getIdFromPrimarySet(int customerID, int categoryOfItemsID) {
        return getIdFromPrimarySet(new SimpleSQLiteQuery(String.format("SELECT id FROM %s WHERE customerID = %d AND categoryOfItemsID = %d", TableNames.CUSTOMER_PRODUCT_GROUP, customerID, categoryOfItemsID)));
    }

    @Transaction
    public void insertOrUpdateCustom(List<CustomerProductGroupPotentialEntity> objList) {

        if (getCount(TableNames.CUSTOMER_PRODUCT_GROUP) > 0) {

            List<CustomerProductGroupPotentialEntity> objToUpdateList = new ArrayList<>();
            List<CustomerProductGroupPotentialEntity> objToInsertList = new ArrayList<>();

            for (CustomerProductGroupPotentialEntity obj : objList) {

                int id = getIdFromPrimarySet(obj.getCustomerID(), obj.getCategoryOfItemsID());
                if (id > 0) {
                    obj.setId(id);
                    objToUpdateList.add(obj);
                } else {
                    objToInsertList.add(obj);
                }
            }

            update(objToUpdateList);
            insert(objToInsertList);

        } else {
            insert(objList);
        }
    }
}