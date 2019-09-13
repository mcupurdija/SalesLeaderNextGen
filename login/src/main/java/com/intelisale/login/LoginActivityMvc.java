package com.intelisale.login;

import com.intelisale.core.ui.ObservableViewMvc;

public interface LoginActivityMvc extends ObservableViewMvc<LoginActivityMvc.Listener> {

    void onLogin();

    void onLoginFailed();

    void showProgressIndicator();

    interface Listener {
        void onLoginButtonClicked(String username, String password);
    }
}
