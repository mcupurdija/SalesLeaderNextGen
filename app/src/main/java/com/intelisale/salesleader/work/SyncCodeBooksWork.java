package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

import com.intelisale.salesleader.di.DaggerWorkComponent;
import com.intelisale.salesleader.ui.common.base.BaseWorker;

public class SyncCodeBooksWork extends BaseWorker {

    public SyncCodeBooksWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public ListenableWorker.Result doWork() {
        return Result.success();
    }

    private void inject() {
        DaggerWorkComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncCodeBooksWork(this);
    }
}
