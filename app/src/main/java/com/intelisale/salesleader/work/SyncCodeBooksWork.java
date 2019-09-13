package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

import com.intelisale.salesleader.ui.common.base.BaseWorker;

public class SyncCodeBooksWork extends BaseWorker {

    public SyncCodeBooksWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
    }

    @NonNull
    @Override
    public ListenableWorker.Result doWork() {
        return null;
    }
}
