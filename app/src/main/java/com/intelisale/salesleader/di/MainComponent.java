package com.intelisale.salesleader.di;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.PresentationModule;
import com.intelisale.core.di.base.BaseActivityComponent;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.salesleader.ui.MainActivity;
import com.intelisale.salesleader.ui.SecondActivity;

import dagger.BindsInstance;
import dagger.Component;

@FeatureScope
@Component(modules = {MainModule.class, PresentationModule.class}, dependencies = {CoreComponent.class})
public interface MainComponent extends BaseActivityComponent<MainActivity> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder activity(MainActivity loginActivity);

        Builder presentationModule(PresentationModule presentationModule);

        Builder coreComponent(CoreComponent coreComponent);

        MainComponent build();
    }
}
