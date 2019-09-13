package com.intelisale.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.intelisale.database.entity.SyncStatusEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

@Dao
public abstract class SyncStatusDao extends BaseDao<SyncStatusEntity> {

    @Query("UPDATE SyncStatus SET status = :status WHERE groupName = :groupName")
    public abstract Completable updateStatus(String groupName, String status);

    @Query("UPDATE SyncStatus SET syncProgress = :syncProgress WHERE groupName = :groupName")
    public abstract void updateProgress(String groupName, int syncProgress);

    @Query("SELECT * FROM SyncStatus")
    public abstract Flowable<List<SyncStatusEntity>> getAll();
}