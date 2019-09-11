package com.intelisale.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.intelisale.database.entity.SyncStatusEntity;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public abstract class SyncStatusDao extends BaseDao<SyncStatusEntity> {

    @Query("SELECT id FROM SyncStatus WHERE groupName LIKE :groupName")
    public abstract int getId(String groupName);

    @Query("SELECT * FROM SyncStatus")
    public abstract Flowable<List<SyncStatusEntity>> getAll();
}
