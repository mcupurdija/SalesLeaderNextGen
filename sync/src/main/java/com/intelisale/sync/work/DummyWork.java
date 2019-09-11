package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.salesleader.ui.common.base.BaseWorker;

public class DummyWork extends BaseWorker {

    public DummyWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        return Result.success();
    }
}
