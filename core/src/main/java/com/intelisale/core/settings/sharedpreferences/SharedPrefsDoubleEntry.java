package com.intelisale.core.settings.sharedpreferences;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/**
 * Implementation of {@link SharedPrefsDataEntry} for double
 */
@SuppressWarnings("unused")
class SharedPrefsDoubleEntry extends SharedPrefsDataEntry<Double> {

    SharedPrefsDoubleEntry(SharedPreferences preferences, String key, Double defaultValue) {
        super(preferences, key, defaultValue);
    }

    @Override
    public Double getValue() {
        final double defValD = mDefaultValue == null ? 0 : mDefaultValue;
        return Double.longBitsToDouble(mPreferences.getLong(mKey, Double.doubleToLongBits(defValD)));
    }

    @SuppressLint("CommitPrefEdits")
    @Override
    public void setValue(Double value) {
        final double valD = value == null ? 0 : value;
        mPreferences.edit().putLong(mKey, Double.doubleToLongBits(valD)).apply();
    }
}
