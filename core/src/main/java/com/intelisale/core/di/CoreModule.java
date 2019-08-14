package com.intelisale.core.di;

import android.app.Application;

import com.intelisale.core.eventbus.EventBusPoster;
import com.intelisale.core.eventbus.EventBusSubscriber;
import com.intelisale.core.logging.MyLogger;
import com.intelisale.core.useCase.LoginUseCase;
import com.intelisale.networking.api.LoginApi;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoreModule {

    private final Application mApplication;

    public CoreModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    MyLogger logger() {
        return new MyLogger();
    }

    @Singleton
    @Provides
    EventBusPoster eventBusPoster() {
        return new EventBusPoster(EventBus.getDefault());
    }

    @Singleton
    @Provides
    EventBusSubscriber eventBusSubscriber() {
        return new EventBusSubscriber(EventBus.getDefault());
    }

    @Singleton
    @Provides
    LoginUseCase loginUseCase(LoginApi loginApi) {
        return new LoginUseCase(loginApi);
    }
}
