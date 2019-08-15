package com.intelisale.salesleader.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.util.Activities;
import com.intelisale.core.util.ActivityHelper;
import com.intelisale.networking.SessionManager;
import com.intelisale.salesleader.R;
import com.intelisale.salesleader.di.DaggerMainComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private static final int LOGIN_REQUEST_CODE = 0;

    @Inject
    SettingsManager settingsManager;
    @Inject
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        setContentView(R.layout.activity_main);

        if (!settingsManager.isUserLogged()) {
            startActivityForResult(ActivityHelper.intentTo(Activities.LoginActivity), LOGIN_REQUEST_CODE);
            overridePendingTransition(0, 0);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == LOGIN_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // TODO update drawer header
            }
        }
    }

    @Override
    protected void inject() {
        DaggerMainComponent.builder()
                .activity(this)
                .coreComponent(getCoreComponent())
                .presentationModule(new PresentationModule(this))
                .build()
                .inject(this);
    }

}
