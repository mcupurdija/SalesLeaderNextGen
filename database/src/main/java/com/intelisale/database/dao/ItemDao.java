package com.intelisale.database.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.custom.ItemWithCodeBooks;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public abstract class ItemDao extends BaseDao<ItemEntity> {

    @Transaction
    @Query("SELECT * FROM Items WHERE Items.active = 1")
    public abstract Flowable<List<ItemWithCodeBooks>> getAllItems();
}
