package com.intelisale.core.di;

import android.app.Application;

import androidx.work.WorkManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intelisale.core.eventbus.EventBusPoster;
import com.intelisale.core.eventbus.EventBusSubscriber;
import com.intelisale.core.logging.MyLogger;
import com.intelisale.core.notifications.ToastManager;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.useCase.LoginUseCase;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.api.LoginApi;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoreModule {

    @Singleton
    @Provides
    WorkManager workManager(Application application) {
        return WorkManager.getInstance(application);
    }

    @Singleton
    @Provides
    MyLogger logger() {
        return new MyLogger();
    }

    @Singleton
    @Provides
    ObjectMapper objectMapper() {
        return new ObjectMapper();
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
    static ToastManager toastManager(Application application) {
        return new ToastManager(application.getApplicationContext());
    }

    @Singleton
    @Provides
    LoginUseCase loginUseCase(ObjectMapper objectMapper, LoginApi loginApi, SettingsManager settingsManager, SessionManager sessionManager) {
        return new LoginUseCase(objectMapper, loginApi, settingsManager, sessionManager);
    }
}
