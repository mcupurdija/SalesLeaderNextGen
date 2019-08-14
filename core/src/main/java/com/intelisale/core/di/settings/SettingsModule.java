package com.intelisale.core.di.settings;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.intelisale.core.Constants;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.settings.sharedpreferences.SharedPrefsSettingsEntryFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingsModule {

    @Singleton
    @Provides
    SettingsManager settingsManager(Application application) {
        SharedPreferences sharedPreferences = application.getSharedPreferences(Constants.SHARED_PREFS_FILE, Context.MODE_PRIVATE);
        return new SettingsManager(new SharedPrefsSettingsEntryFactory(sharedPreferences));
    }
}
