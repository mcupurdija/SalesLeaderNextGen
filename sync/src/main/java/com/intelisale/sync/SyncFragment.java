package com.intelisale.sync;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.salesleader.ui.common.base.BaseFragment;
import com.intelisale.sync.di.DaggerSyncComponent;
import com.intelisale.sync.work.DummyWork;
import com.intelisale.sync.work.SyncCustomersWork;
import com.intelisale.sync.work.SyncItemsWork;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class SyncFragment extends BaseFragment implements SyncFragmentMvc.Listener {

    private static final String CUSTOMERS_WR_TAG = "SyncCustomersWork";
    private static final String ITEMS_WR_TAG = "SyncItemsWork";

    @Inject
    SyncStatusDao mSyncStatusDao;
    @Inject
    WorkManager mWorkManager;

    private SyncFragmentMvc mSyncFragmentMvc;

    public SyncFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mSyncFragmentMvc = new SyncFragmentMvcImpl(inflater, null);
        return mSyncFragmentMvc.getRootView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Disposable disposable = mSyncStatusDao.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<SyncStatusEntity>>() {
            @Override
            public void accept(List<SyncStatusEntity> entities) throws Exception {

                mSyncFragmentMvc.bindEntities(entities);
            }
        });
        compositeDisposable.add(disposable);
    }

    protected void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncFragment(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        mSyncFragmentMvc.registerListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mSyncFragmentMvc.unregisterListener(this);
    }

    @Override
    @SuppressLint("EnqueueWork")
    public void onSyncButtonClicked(List<String> checkedItems) {

        if (checkedItems.size() > 0) {

            WorkContinuation mWorkContinuation = mWorkManager.beginWith(new OneTimeWorkRequest.Builder(DummyWork.class).build());
            for (String item : checkedItems) {
                switch (item) {
                    case TableNames.CUSTOMERS:
                        OneTimeWorkRequest syncCustomersWorkRequest = new OneTimeWorkRequest.Builder(SyncCustomersWork.class).addTag(CUSTOMERS_WR_TAG).build();
                        mWorkContinuation = mWorkContinuation.then(syncCustomersWorkRequest);
                        break;
                    case TableNames.ITEMS:
                        OneTimeWorkRequest syncItemsWorkRequest = new OneTimeWorkRequest.Builder(SyncItemsWork.class).addTag(ITEMS_WR_TAG).build();
                        mWorkContinuation = mWorkContinuation.then(syncItemsWorkRequest);
                        break;
                }
            }

            mWorkContinuation.enqueue();
        }
    }
}
