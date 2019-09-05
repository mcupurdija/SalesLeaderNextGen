package com.intelisale.salesleader.ui.common.base;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

public abstract class BaseWorker extends Worker {

    /**
     * @param appContext   The application {@link Context}
     * @param workerParams Parameters to setup the internal state of this worker
     */
    public BaseWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
    }

    public CoreComponent getCoreComponent() {
        return ((SalesLeader) getApplicationContext()).getCoreComponent();
    }
}
