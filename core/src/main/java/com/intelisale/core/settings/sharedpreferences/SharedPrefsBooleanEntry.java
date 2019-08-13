package com.intelisale.core.settings.sharedpreferences;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/**
 * Implementation of {@link SharedPrefsDataEntry} for boolean
 */
@SuppressWarnings("unused")
class SharedPrefsBooleanEntry extends SharedPrefsDataEntry<Boolean> {

    SharedPrefsBooleanEntry(SharedPreferences preferences, String key, Boolean defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Boolean getValue() {
        return mPreferences.getBoolean(mKey, mDefaultValue == null ? false : mDefaultValue);
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void setValue(Boolean value) {
        mPreferences.edit().putBoolean(mKey, value == null ? false : value).apply();
    }
}
