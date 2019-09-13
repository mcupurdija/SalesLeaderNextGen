package com.intelisale.salesleader.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intelisale.core.Constants;
import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.util.Activities;
import com.intelisale.core.util.ActivityHelper;
import com.intelisale.core.util.HttpUtils;
import com.intelisale.database.TableNames;
import com.intelisale.database.repository.SyncStatusRepository;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.schema.login.UserDetailsSchema;
import com.intelisale.salesleader.di.DaggerMainComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainActivityMvc.Listener {

    private static final int LOGIN_REQUEST_CODE = 0;

    @Inject
    LayoutInflater mLayoutInflater;
    @Inject
    ObjectMapper mObjectMapper;
    @Inject
    SettingsManager mSettingsManager;
    @Inject
    SessionManager mSessionManager;
    @Inject
    WorkManager mWorkManager;
    @Inject
    SyncStatusRepository mSyncStatusRepository;

    private MainActivityMvc mViewMvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        mViewMvc = new MainActivityMvcImpl(mLayoutInflater, null, this);
        setContentView(mViewMvc.getRootView());

        mViewMvc.setNavigationDrawer();

        if (mSettingsManager.isUserLogged()) {
            mSessionManager.setToken(mSessionManager.getToken());
            mSessionManager.setUserDetailsSchema(HttpUtils.deserialize(mObjectMapper, mSettingsManager.getUserData(), UserDetailsSchema.class));
        } else {
            startActivityForResult(ActivityHelper.intentTo(Activities.LoginActivity), LOGIN_REQUEST_CODE);
            overridePendingTransition(0, 0);
        }

        observeWork();
    }

    private void observeWork() {

        mWorkManager.getWorkInfosByTagLiveData(Constants.CUSTOMERS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatus(TableNames.CUSTOMERS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.CONTACTS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatus(TableNames.CONTACTS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.ITEMS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatus(TableNames.ITEMS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.SETTINGS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatus(TableNames.SETTINGS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.NOTES_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatus(TableNames.NOTES, infoList);
            }
        });
    }

    private void updateSyncStatus(String tableName, List<WorkInfo> infoList) {
        if (infoList.size() == 0) return;
        mSyncStatusRepository.updateStatus(tableName, infoList.get(infoList.size() - 1).getState().name());
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
