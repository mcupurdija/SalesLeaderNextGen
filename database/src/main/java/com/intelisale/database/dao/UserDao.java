package com.intelisale.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.intelisale.database.entity.UserEntity;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public abstract class UserDao extends BaseDao<UserEntity> {

    @Query("SELECT COUNT(*) FROM Users")
    public abstract int getCount();

    @Query("SELECT * FROM Users")
    public abstract Flowable<List<UserEntity>> findAllUsers();
}
