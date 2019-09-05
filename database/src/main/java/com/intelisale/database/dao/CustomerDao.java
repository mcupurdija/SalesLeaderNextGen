package com.intelisale.database.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.intelisale.database.entity.CustomerEntity;

@Dao
public abstract class CustomerDao extends BaseDao<CustomerEntity> {

    @Query("SELECT COUNT(*) FROM Customers")
    public abstract int getCount();

    @Query("SELECT MAX(modifiedDate) FROM Customers")
    public abstract String getModifiedDate();
}