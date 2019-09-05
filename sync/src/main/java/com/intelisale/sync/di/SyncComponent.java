package com.intelisale.sync.di;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.sync.SyncFragment;
import com.intelisale.sync.work.SyncCustomersWork;

import dagger.Component;

@FeatureScope
@Component(modules = {SyncModule.class, PresentationModule.class}, dependencies = {CoreComponent.class})
public interface SyncComponent {

    void injectSyncFragment(SyncFragment syncFragment);

    void injectSyncCustomersWork(SyncCustomersWork syncCustomersWork);
}
