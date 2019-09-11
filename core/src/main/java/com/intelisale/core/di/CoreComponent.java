package com.intelisale.core.di;

import android.app.Application;

import androidx.work.WorkManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intelisale.core.di.settings.SettingsModule;
import com.intelisale.core.eventbus.EventBusPoster;
import com.intelisale.core.eventbus.EventBusSubscriber;
import com.intelisale.core.logging.MyLogger;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.useCase.LoginUseCase;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.di.DatabaseModule;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.database.repository.SyncItemsRepository;
import com.intelisale.database.repository.UserRepository;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.di.NetworkingModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {CoreModule.class, DatabaseModule.class, NetworkingModule.class, SettingsModule.class})
public interface CoreComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        Builder coreModule(CoreModule coreModule);

        Builder databaseModule(DatabaseModule databaseModule);

        Builder networkingModule(NetworkingModule networkingModule);

        Builder settingsModule(SettingsModule settingsModule);

        CoreComponent build();
    }

    WorkManager workManager();

    SessionManager sessionManager();

    SettingsManager settingsManager();

    MyLogger logger();

    ObjectMapper objectMapper();

    EventBusPoster eventBusPoster();

    EventBusSubscriber eventBusSubscriber();

    LoginUseCase loginUseCase();

    UserRepository userRepository();

    SyncCustomersRepository syncCustomersRepository();

    SyncItemsRepository syncItemsRepository();

    SyncStatusDao syncStatusDao();

    SyncApi syncApi();
}
