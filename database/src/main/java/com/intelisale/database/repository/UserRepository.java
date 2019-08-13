package com.intelisale.database.repository;

import com.intelisale.database.dao.UserDao;
import com.intelisale.database.entity.UserEntity;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class UserRepository {

    private final UserDao userDao;

    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    public Flowable<List<UserEntity>> getAllUsers() {
        return userDao.findAllUsers();
    }

    public Single<Long> addUser(UserEntity userEntity) {
        return userDao.insertRx(userEntity);
    }
}
