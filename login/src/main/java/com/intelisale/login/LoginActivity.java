package com.intelisale.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.notifications.DialogManager;
import com.intelisale.core.notifications.ToastManager;
import com.intelisale.core.useCase.LoginUseCase;
import com.intelisale.login.di.DaggerLoginComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginViewMvc.Listener, LoginUseCase.Listener {

    @Inject
    LayoutInflater layoutInflater;
    @Inject
    DialogManager mDialogManager;
    @Inject
    ToastManager mToastManager;
    @Inject
    LoginUseCase mLoginUseCase;

    private LoginViewMvc mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        mViewMvc = new LoginViewMvcImpl(layoutInflater, null);
        setContentView(mViewMvc.getRootView());

        boolean tokenExpired = getIntent().getBooleanExtra(Intent.EXTRA_REMOTE_INTENT_TOKEN, false);
        if (tokenExpired) {
            mToastManager.displayCenteredToast("SESIJA JE ISTEKLA");
            mViewMvc.showProgressIndicator();
            mLoginUseCase.loginInBackground();
        }
    }

    @Override
    protected void inject() {
        DaggerLoginComponent.builder()
                .activity(this)
                .coreComponent(getCoreComponent())
                .presentationModule(new PresentationModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewMvc.registerListener(this);
        mLoginUseCase.registerListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mViewMvc.unregisterListener(this);
        mLoginUseCase.unregisterListener(this);
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public void onLoginButtonClicked(String username, String password) {
        mLoginUseCase.loginUser(username, password);
    }

    @Override
    public void onLoginSucceeded() {
        setResult(RESULT_OK);
        finish();
    }

    @Override
    public void onLoginFailed(String message) {
        mViewMvc.onLoginFailed();
        mDialogManager.showAlertDialog(message);
    }
}