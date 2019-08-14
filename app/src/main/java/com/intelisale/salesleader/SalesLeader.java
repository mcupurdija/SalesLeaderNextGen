package com.intelisale.salesleader;

import android.app.Application;
import android.content.Context;

import androidx.annotation.UiThread;
import androidx.multidex.MultiDex;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.CoreModule;
import com.intelisale.core.di.DaggerCoreComponent;
import com.intelisale.core.di.settings.SettingsModule;
import com.intelisale.core.logging.TimberReleaseTree;
import com.intelisale.database.di.DatabaseModule;
import com.intelisale.networking.di.NetworkingModule;

import timber.log.Timber;

public class SalesLeader extends Application {

    private CoreComponent mCoreComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(BuildConfig.DEBUG ? new Timber.DebugTree() : new TimberReleaseTree());
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @UiThread
    public CoreComponent getCoreComponent() {
        if (mCoreComponent == null) {
            mCoreComponent = DaggerCoreComponent.builder()
                    .coreModule(new CoreModule(this))
                    .databaseModule(new DatabaseModule(this))
                    .networkingModule(new NetworkingModule())
                    .settingsModule(new SettingsModule())
                    .build();
        }
        return mCoreComponent;
    }
}
