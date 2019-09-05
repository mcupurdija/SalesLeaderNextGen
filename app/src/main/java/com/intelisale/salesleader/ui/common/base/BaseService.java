package com.intelisale.salesleader.ui.common.base;

import androidx.core.app.JobIntentService;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

public abstract class BaseService extends JobIntentService {

    public CoreComponent getCoreComponent() {
        return ((SalesLeader) getApplication()).getCoreComponent();
    }
}
