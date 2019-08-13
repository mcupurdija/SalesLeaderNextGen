package com.intelisale.salesleader.ui.common.base;

import android.app.Service;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

public abstract class BaseService extends Service {

    public CoreComponent getCoreComponent() {
        return ((SalesLeader) getApplication()).getCoreComponent();
    }
}
