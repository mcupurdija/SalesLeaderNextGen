package com.intelisale.core.settings;

/**
 * This class encapsulates various settings/configurations/data which affect functionality of
 * the app.
 */
public class SettingsManager {

    private static final String KEY_IS_USER_LOGGED = "isUserLogged";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_USER_DATA = "userData";

    public final SettingDataEntry<Boolean> isUserLoggedEntry;
    public final SettingDataEntry<String> tokenEntry;
    public final SettingDataEntry<String> userDataEntry;

    public SettingsManager(SettingsEntryFactory settingsEntryFactory) {
        isUserLoggedEntry = settingsEntryFactory.getDataEntry(Boolean.class, KEY_IS_USER_LOGGED, false);
        tokenEntry = settingsEntryFactory.getDataEntry(String.class, KEY_TOKEN, null);
        userDataEntry = settingsEntryFactory.getDataEntry(String.class, KEY_USER_DATA, null);
    }

    public boolean isUserLogged() {
        return isUserLoggedEntry.getValue();
    }

    public void setUserLogged(boolean value) {
        isUserLoggedEntry.setValue(value);
    }

    public String getToken() {
        return tokenEntry.getValue();
    }

    public void setToken(String value) {
        tokenEntry.setValue(value);
    }

    public String getUserData() {
        return userDataEntry.getValue();
    }

    public void setUserData(String value) {
        userDataEntry.setValue(value);
    }
}
