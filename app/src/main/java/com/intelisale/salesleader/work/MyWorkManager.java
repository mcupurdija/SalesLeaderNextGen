package com.intelisale.salesleader.work;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;

import com.intelisale.core.Constants;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.database.TableNames;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

@FeatureScope
public class MyWorkManager {

    private final WorkManager mWorkManager;

    @Inject
    public MyWorkManager(WorkManager mWorkManager) {
        this.mWorkManager = mWorkManager;
    }

    public void enqueueSelected(@NotNull List<String> checkedItems) {

        if (checkedItems.size() == 0) return;

        WorkContinuation mWorkContinuation = mWorkManager.beginWith(new OneTimeWorkRequest.Builder(DummyWork.class).build());

        for (String item : checkedItems) {
            switch (item) {
                case TableNames.CUSTOMERS:
                    mWorkContinuation = mWorkContinuation.then(addCustomersWorkRequest());
                    break;
                case TableNames.ITEMS:
                    mWorkContinuation = mWorkContinuation.then(addItemsWorkRequest());
                    break;
                case TableNames.CONTACTS:
                    mWorkContinuation = mWorkContinuation.then(addContactsWorkRequest());
                    break;
                case TableNames.NOTES:
                    mWorkContinuation = mWorkContinuation.then(addNotesWorkRequest());
                    break;
                case TableNames.SETTINGS:
                    mWorkContinuation = mWorkContinuation.then(addSettingsWorkRequest());
                    break;
            }
        }

        mWorkManager.pruneWork();
        mWorkContinuation.enqueue();
    }

    public void enqueueAll() {

        WorkContinuation mWorkContinuation = mWorkManager.beginWith(new OneTimeWorkRequest.Builder(DummyWork.class).build())
                .then(addCustomersWorkRequest())
                .then(addItemsWorkRequest())
                .then(addContactsWorkRequest())
                .then(addNotesWorkRequest())
                .then(addSettingsWorkRequest());

        mWorkManager.pruneWork();
        mWorkContinuation.enqueue();
    }

    private OneTimeWorkRequest addCustomersWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.CUSTOMERS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncCustomersWork.class).addTag(Constants.CUSTOMERS_WR_TAG).build();
    }

    private OneTimeWorkRequest addItemsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.ITEMS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncItemsWork.class).addTag(Constants.ITEMS_WR_TAG).build();
    }

    private OneTimeWorkRequest addContactsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.CONTACTS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncContactsWork.class).addTag(Constants.CONTACTS_WR_TAG).build();
    }

    private OneTimeWorkRequest addNotesWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.NOTES_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncNotesWork.class).addTag(Constants.NOTES_WR_TAG).build();
    }

    private OneTimeWorkRequest addSettingsWorkRequest() {
        mWorkManager.cancelAllWorkByTag(Constants.SETTINGS_WR_TAG);
        return new OneTimeWorkRequest.Builder(SyncSettingsWork.class).addTag(Constants.SETTINGS_WR_TAG).build();
    }
}