package com.intelisale.database.dao;

import android.annotation.SuppressLint;

import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomerCustomListEntity;

import java.util.ArrayList;
import java.util.List;

@Dao
public abstract class CustomerCustomListDao extends BaseDao<CustomerCustomListEntity> {

    @RawQuery
    abstract int getIdFromPrimarySet(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    @SuppressLint("DefaultLocale")
    public int getIdFromPrimarySet(int customerID, int customListHeaderID) {
        return getIdFromPrimarySet(new SimpleSQLiteQuery(String.format("SELECT id FROM CustomerCustomLists WHERE customerID = %d AND customListHeaderID = %d", customerID, customListHeaderID)));
    }

    @Transaction
    public void insertOrUpdateCustom(List<CustomerCustomListEntity> objList) {

        if (getCount(TableNames.CUSTOMER_CUSTOM_LISTS) > 0) {

            List<CustomerCustomListEntity> objToUpdateList = new ArrayList<>();
            List<CustomerCustomListEntity> objToInsertList = new ArrayList<>();

            for (CustomerCustomListEntity obj : objList) {

                int id = getIdFromPrimarySet(obj.getCustomerID(), obj.getCustomListHeaderID());
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
