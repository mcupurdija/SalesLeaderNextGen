package com.intelisale.database.repository;

import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.SyncStatusEntity;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SyncStatusRepository {

    private final SyncStatusDao syncStatusDao;

    public SyncStatusRepository(SyncStatusDao syncStatusDao) {
        this.syncStatusDao = syncStatusDao;
    }

    public Flowable<List<SyncStatusEntity>> getAll() {
        return syncStatusDao.getAll();
    }

    public Disposable updateStatus(String groupName, String status) {
        return syncStatusDao.updateStatus(groupName, status).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
    }

    public Disposable updateStatusCompleted(String groupName, String status) {
        return syncStatusDao.updateStatusCompleted(groupName, status).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe();
    }
}
