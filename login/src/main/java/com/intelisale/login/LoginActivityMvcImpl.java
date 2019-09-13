package com.intelisale.login;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.intelisale.core.ui.BaseViewMvc;

import org.apache.commons.lang3.StringUtils;

class LoginActivityMvcImpl extends BaseViewMvc<LoginActivityMvc.Listener> implements LoginActivityMvc, TextView.OnEditorActionListener, View.OnClickListener {

    private TextInputLayout mUsernameLayout;
    private TextInputEditText mUsername;
    private TextInputLayout mPasswordLayout;
    private TextInputEditText mPassword;
    private MaterialButton mLogin;
    private ProgressBar mProgressBar;

    LoginActivityMvcImpl(LayoutInflater layoutInflater, ViewGroup container) {
        setRootView(layoutInflater.inflate(R.layout.activity_login, container, false));

        mUsernameLayout = findViewById(R.id.etlUsername);
        mUsername = findViewById(R.id.etUsername);
        mPasswordLayout = findViewById(R.id.etlPassword);
        mPassword = findViewById(R.id.etPassword);
        mLogin = findViewById(R.id.bLogin);
        mProgressBar = findViewById(R.id.pbLogin);

        mPassword.setOnEditorActionListener(this);
        mLogin.setOnClickListener(this);
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_DONE) {
            onLogin();
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        onLogin();
    }

    public void onLogin() {

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

        showProgressIndicator();
    }

    public void onLoginFailed() {

        mProgressBar.setVisibility(View.GONE);
        mLogin.setEnabled(true);
    }

    @Override
    public void showProgressIndicator() {

        mLogin.setEnabled(false);
        mProgressBar.setVisibility(View.VISIBLE);
    }
}