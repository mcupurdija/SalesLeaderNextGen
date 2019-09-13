package com.intelisale.salesleader.di;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.salesleader.work.SyncContactsWork;
import com.intelisale.salesleader.work.SyncCustomersWork;
import com.intelisale.salesleader.work.SyncItemsWork;
import com.intelisale.salesleader.work.SyncNotesWork;
import com.intelisale.salesleader.work.SyncSettingsWork;

import dagger.Component;

@FeatureScope
@Component(dependencies = {CoreComponent.class})
public interface WorkComponent {

    void injectSyncCustomersWork(SyncCustomersWork syncCustomersWork);

    void injectSyncItemsWork(SyncItemsWork syncItemsWork);

    void injectSyncContactsWork(SyncContactsWork syncContactsWork);

    void injectSyncNotesWork(SyncNotesWork syncNotesWork);

    void injectSyncSettingsWork(SyncSettingsWork syncSettingsWork);
}
