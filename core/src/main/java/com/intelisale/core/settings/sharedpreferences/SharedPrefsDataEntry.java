package com.intelisale.core.settings.sharedpreferences;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

import com.intelisale.core.settings.SettingDataEntry;

/**
 * Implementation of {@link SettingDataEntry} backed by {@link SharedPreferences}
 */
abstract class SharedPrefsDataEntry<T> extends SettingDataEntry<T> implements
        SharedPreferences.OnSharedPreferenceChangeListener {

    final SharedPreferences mPreferences;

    SharedPrefsDataEntry(SharedPreferences preferences, String key, T defaultValue) {
        super(key, defaultValue);
        this.mPreferences = preferences;
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void remove() {
        mPreferences.edit().remove(mKey).apply();
    }


    @Override
    protected void onFirstListenerRegistered() {
        mPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onLastListenerUnregistered() {
        mPreferences.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        notifyListeners(getValue());
    }

}