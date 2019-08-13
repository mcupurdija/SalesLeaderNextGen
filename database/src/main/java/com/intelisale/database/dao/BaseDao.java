package com.intelisale.database.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Transaction;
import androidx.room.Update;

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

    @Transaction
    public void insertOrUpdate(T obj) {

        long id = insert(obj);
        if (id == -1L) update(obj);
    }

    @Transaction
    public void insertOrUpdate(List<T> objList) {

        long[] insertResults = insert(objList);
        List<T> objToUpdateList = new ArrayList<>();

        for (int i = 0; i < insertResults.length; i++) {
            if (insertResults[i] == -1L) objToUpdateList.add(objList.get(i));
        }

        if (!objToUpdateList.isEmpty()) update(objToUpdateList);
    }
}