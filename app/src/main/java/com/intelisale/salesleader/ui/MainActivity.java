package com.intelisale.salesleader.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.util.Activities;
import com.intelisale.core.util.ActivityHelper;
import com.intelisale.core.util.HttpUtils;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.schema.login.UserDetailsSchema;
import com.intelisale.salesleader.di.DaggerMainComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainViewMvc.Listener {

    private static final int LOGIN_REQUEST_CODE = 0;

    @Inject
    LayoutInflater mLayoutInflater;
    @Inject
    ObjectMapper mObjectMapper;
    @Inject
    SettingsManager mSettingsManager;
    @Inject
    SessionManager mSessionManager;

    private MainViewMvc mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        mViewMvc = new MainViewMvcImpl(mLayoutInflater, null, this);
        setContentView(mViewMvc.getRootView());

        mViewMvc.setNavigationDrawer();

        if (mSettingsManager.isUserLogged()) {
            mSessionManager.setToken(mSessionManager.getToken());
            mSessionManager.setUserDetailsSchema(HttpUtils.deserialize(mObjectMapper, mSettingsManager.getUserData(), UserDetailsSchema.class));
        } else {
            startActivityForResult(ActivityHelper.intentTo(Activities.LoginActivity), LOGIN_REQUEST_CODE);
            overridePendingTransition(0, 0);
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

    @Override
    protected void onStart() {
        super.onStart();
        mViewMvc.registerListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mViewMvc.unregisterListener(this);
    }

    @Override
    public void onBackPressed() {
        mViewMvc.onBackPressed();
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

}
