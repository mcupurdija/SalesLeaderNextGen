package com.intelisale.salesleader.di;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.salesleader.work.SyncCodeBooksWork;
import com.intelisale.salesleader.work.SyncContactsWork;
import com.intelisale.salesleader.work.SyncCustomersWork;
import com.intelisale.salesleader.work.SyncItemsWork;
import com.intelisale.salesleader.work.SyncNotesWork;
import com.intelisale.salesleader.work.SyncSettingsWork;

import dagger.Component;

@FeatureScope
@Component(dependencies = {CoreComponent.class})
public interface WorkComponent {

    void injectSyncSettingsWork(SyncSettingsWork syncSettingsWork);

    void injectSyncCodeBooksWork(SyncCodeBooksWork syncCodeBooksWork);

    void injectSyncCustomersWork(SyncCustomersWork syncCustomersWork);

    void injectSyncContactsWork(SyncContactsWork syncContactsWork);

    void injectSyncItemsWork(SyncItemsWork syncItemsWork);

    void injectSyncNotesWork(SyncNotesWork syncNotesWork);
}
