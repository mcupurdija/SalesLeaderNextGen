package com.intelisale.database.dao;

import android.util.SparseIntArray;

import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.intelisale.database.entity.custom.IdServerId;
import com.intelisale.database.utils.DateUtils;

import java.util.List;

@Dao
public abstract class GlobalDao {

    @RawQuery
    abstract int getCount(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public int getCount(String tableName) {
        return getCount(new SimpleSQLiteQuery("SELECT COUNT(*) FROM " + tableName));
    }

    @RawQuery
    abstract String getMaxModifiedDate(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public String getMaxModifiedDate(String tableName) {
        String result = getMaxModifiedDate(new SimpleSQLiteQuery("SELECT MAX(modifiedDate) FROM " + tableName));
        return result != null ? result : DateUtils.getDefaultDate();
    }

    @RawQuery
    abstract List<IdServerId> getIdServerId(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public SparseIntArray getIdServerId(String tableName) {

        List<IdServerId> idServerIdList = getIdServerId(new SimpleSQLiteQuery("SELECT id, serverId FROM " + tableName));

        SparseIntArray sparseIntArray = new SparseIntArray();
        for (IdServerId idServerId : idServerIdList) {
            sparseIntArray.append(idServerId.getServerId(), idServerId.getId());
        }

        return sparseIntArray;
    }
}
