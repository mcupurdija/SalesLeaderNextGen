package com.intelisale.salesleader.ui.common.base;

import android.annotation.SuppressLint;

import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

import io.reactivex.disposables.CompositeDisposable;

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    @UiThread
    protected abstract void inject();

    protected CoreComponent getCoreComponent() {
        return ((SalesLeader) getApplication()).getCoreComponent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}
