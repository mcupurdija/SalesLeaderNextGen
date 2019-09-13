package com.intelisale.salesleader.work;

import android.annotation.SuppressLint;

import androidx.lifecycle.Observer;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;

import com.intelisale.core.Constants;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.core.notifications.ToastManager;
import com.intelisale.database.TableNames;
import com.intelisale.database.repository.SyncStatusRepository;
import com.intelisale.salesleader.work.helper.DummyWork;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

@FeatureScope
@SuppressLint("EnqueueWork")
public class MyWorkManager {

    private final WorkManager mWorkManager;
    private final SyncStatusRepository mSyncStatusRepository;
    private final ToastManager mToastManager;

    private Map<String, String> successTracker = new HashMap<>();

    @Inject
    MyWorkManager(WorkManager mWorkManager, SyncStatusRepository mSyncStatusRepository, ToastManager mToastManager) {
        this.mWorkManager = mWorkManager;
        this.mSyncStatusRepository = mSyncStatusRepository;
        this.mToastManager = mToastManager;
    }

    public void enqueueSelected(@NotNull List<String> checkedItems) {

        if (checkedItems.size() == 0) return;

        WorkContinuation mWorkContinuation = mWorkManager.beginWith(new OneTimeWorkRequest.Builder(DummyWork.class).build());
        for (String item : checkedItems) {
            switch (item) {
                case TableNames.SETTINGS:
                    mWorkContinuation = mWorkContinuation.then(addSettingsWorkRequest());
                    break;
                case TableNames.CODEBOOKS:
                    mWorkContinuation = mWorkContinuation.then(addCodeBooksWorkRequest());
                    break;
                case TableNames.CUSTOMERS:
                    mWorkContinuation = mWorkContinuation.then(addCustomersWorkRequest());
                    break;
                case TableNames.CONTACTS:
                    mWorkContinuation = mWorkContinuation.then(addContactsWorkRequest());
                    break;
                case TableNames.ITEMS:
                    mWorkContinuation = mWorkContinuation.then(addItemsWorkRequest());
                    break;
                case TableNames.NOTES:
                    mWorkContinuation = mWorkContinuation.then(addNotesWorkRequest());
                    break;
            }
        }

        enqueueAndObserveWork(mWorkContinuation);
    }

    public void enqueueAll() {

        WorkContinuation mWorkContinuation = mWorkManager.beginWith(new OneTimeWorkRequest.Builder(DummyWork.class).build())
                .then(addSettingsWorkRequest())
                .then(addCodeBooksWorkRequest())
                .then(addCustomersWorkRequest())
                .then(addContactsWorkRequest())
                .then(addItemsWorkRequest())
                .then(addNotesWorkRequest());

        enqueueAndObserveWork(mWorkContinuation);
    }

    private OneTimeWorkRequest addSettingsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.SETTINGS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncSettingsWork.class).addTag(Constants.SETTINGS_WR_TAG).build();
    }

    private OneTimeWorkRequest addCodeBooksWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.CODEBOOKS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncCodeBooksWork.class).addTag(Constants.CODEBOOKS_WR_TAG).build();
    }

    private OneTimeWorkRequest addCustomersWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.CUSTOMERS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncCustomersWork.class).addTag(Constants.CUSTOMERS_WR_TAG).build();
    }

    private OneTimeWorkRequest addContactsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.CONTACTS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncContactsWork.class).addTag(Constants.CONTACTS_WR_TAG).build();
    }

    private OneTimeWorkRequest addItemsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.ITEMS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncItemsWork.class).addTag(Constants.ITEMS_WR_TAG).build();
    }

    private OneTimeWorkRequest addNotesWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.NOTES_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncNotesWork.class).addTag(Constants.NOTES_WR_TAG).build();
    }

    private void enqueueAndObserveWork(WorkContinuation workContinuation) {

        mWorkManager.getWorkInfosByTagLiveData(Constants.SETTINGS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.SETTINGS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.CODEBOOKS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.CODEBOOKS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.CUSTOMERS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.CUSTOMERS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.CONTACTS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.CONTACTS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.ITEMS_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.ITEMS, infoList);
            }
        });
        mWorkManager.getWorkInfosByTagLiveData(Constants.NOTES_WR_TAG).observeForever(new Observer<List<WorkInfo>>() {
            @Override
            public void onChanged(List<WorkInfo> infoList) {
                updateSyncStatusAndTrackSuccess(TableNames.NOTES, infoList);
            }
        });

        mWorkManager.pruneWork();
        workContinuation.enqueue();
    }

    private void updateSyncStatusAndTrackSuccess(String tableName, List<WorkInfo> infoList) {

        if (infoList.size() == 0) return;

        WorkInfo.State state = infoList.get(infoList.size() - 1).getState();
        if (state == WorkInfo.State.SUCCEEDED || state == WorkInfo.State.FAILED) {
            mSyncStatusRepository.updateStatusCompleted(tableName, state.name());
        } else {
            mSyncStatusRepository.updateStatus(tableName, state.name());
        }

        successTracker.put(tableName, state.name());
        if (Collections.frequency(successTracker.values(), WorkInfo.State.SUCCEEDED.name()) == 6) {

            mToastManager.displayCenteredToast("SYNC HAS COMPLETED SUCCESSFULLY");
            successTracker.clear();
        }
    }
}