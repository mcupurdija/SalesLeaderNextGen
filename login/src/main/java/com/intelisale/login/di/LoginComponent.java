package com.intelisale.login.di;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.core.di.base.BaseActivityComponent;
import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.core.di.scope.FeatureScope;
import com.intelisale.login.LoginActivity;

import dagger.BindsInstance;
import dagger.Component;

@FeatureScope
@Component(modules = {LoginModule.class, PresentationModule.class}, dependencies = {CoreComponent.class})
public interface LoginComponent extends BaseActivityComponent<LoginActivity> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder activity(LoginActivity loginActivity);

        Builder coreComponent(CoreComponent coreComponent);

        Builder presentationModule(PresentationModule presentationModule);

        LoginComponent build();
    }
}
