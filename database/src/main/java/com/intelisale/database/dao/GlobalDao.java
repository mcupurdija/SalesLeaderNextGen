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
        return getCount(new SimpleSQLiteQuery(String.format("SELECT COUNT(*) FROM %s", tableName)));
    }

    @RawQuery
    abstract String getMaxModifiedDate(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public String getMaxModifiedDate(String tableName) {
        String result = getMaxModifiedDate(new SimpleSQLiteQuery(String.format("SELECT MAX(modifiedDate) FROM %s", tableName)));
        return result != null ? result : DateUtils.getDefaultDate();
    }

    @RawQuery
    abstract List<IdServerId> getIdServerId(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public SparseIntArray getIdServerId(String tableName) {

        List<IdServerId> idServerIdList = getIdServerId(new SimpleSQLiteQuery(String.format("SELECT id, serverId FROM %s", tableName)));

        SparseIntArray sparseIntArray = new SparseIntArray();
        for (IdServerId idServerId : idServerIdList) {
            sparseIntArray.append(idServerId.getServerId(), idServerId.getId());
        }

        return sparseIntArray;
    }
}
