package com.intelisale.login;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.intelisale.core.ui.BaseViewMvc;

import org.apache.commons.lang3.StringUtils;

class LoginViewMvcImpl extends BaseViewMvc<LoginViewMvc.Listener> implements LoginViewMvc {

    LoginViewMvcImpl(LayoutInflater layoutInflater, ViewGroup container) {
        setRootView(layoutInflater.inflate(R.layout.activity_login, container, false));

        final TextInputLayout mUsernameLayout = findViewById(R.id.etlUsername);
        final TextInputEditText mUsername = findViewById(R.id.etUsername);
        final TextInputLayout mPasswordLayout = findViewById(R.id.etlPassword);
        final TextInputEditText mPassword = findViewById(R.id.etPassword);
        final MaterialButton mLogin = findViewById(R.id.bLogin);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable username = mUsername.getText();
                Editable password = mPassword.getText();

                if (StringUtils.isBlank(username)) {
                    mUsernameLayout.setError("You need to fill out this field");
                    mUsernameLayout.requestFocus();
                    return;
                } else {
                    mUsernameLayout.setError(null);
                }

                if (StringUtils.isEmpty(password)) {
                    mPasswordLayout.setError("You need to fill out this field");
                    mPasswordLayout.requestFocus();
                    return;
                } else {
                    mPasswordLayout.setError(null);
                }

                for (Listener listener : getListeners()) {
                    listener.onLoginButtonClicked(username.toString(), password.toString());
                }
            }
        });
    }

}