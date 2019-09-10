package com.intelisale.database.dao;

import android.util.SparseIntArray;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.RawQuery;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.intelisale.database.entity.column.BaseAuditColumns;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Single;

abstract class BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract long insert(T obj);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract Single<Long> insertRx(final T obj);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract long[] insert(List<T> objList);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public abstract Single<List<Long>> insertRx(final List<T> objList);

    @Update
    public abstract int update(T obj);

    @Update
    public abstract Single<Integer> updateRx(final T obj);

    @Update
    public abstract int update(List<T> objList);

    @Update
    public abstract Single<Integer> updateRx(final List<T> objList);

    @Delete
    public abstract int delete(T obj);

    @Delete
    public abstract Single<Integer> deleteRx(T obj);

    @RawQuery
    abstract int getCount(SimpleSQLiteQuery simpleSQLiteQuery);

    @Transaction
    public int getCount(String tableName) {
        return getCount(new SimpleSQLiteQuery(String.format("SELECT COUNT(*) FROM %s", tableName)));
    }

    @Transaction
    public void insertOrUpdateByServerId(T obj) {

        long id = insert(obj);
        if (id == -1L) update(obj);
    }

    @Transaction
    public void insertOrUpdate(List<T> objList, String tableName) {

        if (getCount(tableName) > 0) {

            long[] insertResults = insert(objList);
            List<T> objToUpdateList = new ArrayList<>();

            for (int i = 0; i < insertResults.length; i++) {
                if (insertResults[i] == -1L) objToUpdateList.add(objList.get(i));
            }

            if (!objToUpdateList.isEmpty()) update(objToUpdateList);

        } else {
            insert(objList);
        }
    }

    @Transaction
    public void insertOrUpdateByServerId(List<T> objList, SparseIntArray idServerIdArray) {

        if (idServerIdArray.size() > 0) {

            List<T> objToUpdateList = new ArrayList<>();
            List<T> objToInsertList = new ArrayList<>();

            for (T obj : objList) {

                int id = idServerIdArray.get(((BaseAuditColumns) obj).getServerID());
                if (id > 0) {
                    ((BaseAuditColumns) obj).setId(id);
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