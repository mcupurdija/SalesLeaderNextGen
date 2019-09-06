package com.intelisale.sync;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;

import com.intelisale.salesleader.ui.common.base.BaseFragment;
import com.intelisale.sync.di.DaggerSyncComponent;
import com.intelisale.sync.work.SyncItemsWork;

import org.jetbrains.annotations.NotNull;

public class SyncFragment extends BaseFragment {

    private Context mContext;

    public SyncFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        inject();

        WorkManager mWorkManager = WorkManager.getInstance(mContext.getApplicationContext());
        WorkContinuation mWorkContinuation = mWorkManager.beginWith(OneTimeWorkRequest.from(SyncItemsWork.class));
        mWorkContinuation.enqueue();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext = null;
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
