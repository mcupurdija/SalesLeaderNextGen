package com.intelisale.sync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;

import com.intelisale.salesleader.ui.common.base.BaseFragment;
import com.intelisale.sync.di.DaggerSyncComponent;
import com.intelisale.sync.work.SyncCustomersWork;
import com.intelisale.sync.work.SyncItemsWork;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class SyncFragment extends BaseFragment {

    private static final String CUSTOMERS_WR_TAG = "SyncCustomersWork";
    private static final String ITEMS_WR_TAG = "SyncItemsWork";

    @Inject
    WorkManager mWorkManager;

    public SyncFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();

        OneTimeWorkRequest syncCustomersWorkRequest = new OneTimeWorkRequest.Builder(SyncCustomersWork.class).addTag(CUSTOMERS_WR_TAG).build();
        OneTimeWorkRequest syncItemsWorkRequest = new OneTimeWorkRequest.Builder(SyncItemsWork.class).addTag(ITEMS_WR_TAG).build();

        WorkContinuation mWorkContinuation = mWorkManager.beginWith(syncCustomersWorkRequest).then(syncItemsWorkRequest);
        mWorkContinuation.enqueue();
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sync, container, false);
    }

    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncFragment(this);
    }
}
