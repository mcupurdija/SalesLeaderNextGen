package com.intelisale.salesleader.ui.common.base;

import android.annotation.SuppressLint;

import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {

    @UiThread
    protected abstract void inject();

    public CoreComponent getCoreComponent() {
        return ((SalesLeader) getApplication()).getCoreComponent();
    }
}
