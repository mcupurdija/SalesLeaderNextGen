package com.intelisale.core.settings.sharedpreferences;

import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import com.intelisale.core.settings.SettingDataEntry;
import com.intelisale.core.settings.SettingsEntryFactory;

public class SharedPrefsSettingsEntryFactory extends SettingsEntryFactory {

    private final SharedPreferences mSharedPreferences;

    public SharedPrefsSettingsEntryFactory(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> SettingDataEntry<T> getDataEntry(Class<T> clazz, String key, @Nullable T defaultValue) {

        if (clazz == Boolean.class)
            return (SettingDataEntry<T>) new SharedPrefsBooleanEntry(mSharedPreferences, key, (Boolean) defaultValue);
        if (clazz == String.class)
            return (SettingDataEntry<T>) new SharedPrefsStringEntry(mSharedPreferences, key, (String) defaultValue);
        if (clazz == Integer.class)
            return (SettingDataEntry<T>) new SharedPrefsIntegerEntry(mSharedPreferences, key, (Integer) defaultValue);
        if (clazz == Long.class)
            return (SettingDataEntry<T>) new SharedPrefsLongEntry(mSharedPreferences, key, (Long) defaultValue);
        if (clazz == Double.class)
            return (SettingDataEntry<T>) new SharedPrefsDoubleEntry(mSharedPreferences, key, (Double) defaultValue);

        throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " is not supported yet");

    }

}
