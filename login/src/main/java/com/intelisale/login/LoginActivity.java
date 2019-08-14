package com.intelisale.login;

import android.os.Bundle;

import com.intelisale.login.di.DaggerLoginComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void inject() {
        DaggerLoginComponent.builder()
                .activity(this)
                .coreComponent(getCoreComponent())
                .build()
                .inject(this);
    }
}
