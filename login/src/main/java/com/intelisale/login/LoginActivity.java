package com.intelisale.login;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.dialog.DialogManager;
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
    LoginUseCase mUseCase;

    private LoginViewMvcImpl mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        mViewMvc = new LoginViewMvcImpl(layoutInflater, null);
        setContentView(mViewMvc.getRootView());
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
        mUseCase.registerListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mViewMvc.unregisterListener(this);
        mUseCase.unregisterListener(this);
    }

    @Override
    public void onLoginButtonClicked(String username, String password) {
        mUseCase.loginUser(username, password);
    }

    @Override
    public void onLoginSucceeded() {
        finish();
    }

    @Override
    public void onLoginFailed(String message) {
        mViewMvc.onLoginFailed();
        mDialogManager.showAlertDialog(message);
    }
}
