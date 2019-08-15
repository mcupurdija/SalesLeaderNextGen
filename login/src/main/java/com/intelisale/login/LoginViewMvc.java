package com.intelisale.login;

import com.intelisale.core.ui.ObservableViewMvc;

public interface LoginViewMvc extends ObservableViewMvc<LoginViewMvc.Listener> {

    void onLogin();

    void onLoginFailed();

    interface Listener {
        void onLoginButtonClicked(String username, String password);
    }
}
