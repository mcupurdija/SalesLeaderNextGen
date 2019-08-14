package com.intelisale.core.di;

import com.intelisale.core.di.settings.SettingsModule;
import com.intelisale.core.eventbus.EventBusPoster;
import com.intelisale.core.eventbus.EventBusSubscriber;
import com.intelisale.core.logging.MyLogger;
import com.intelisale.core.useCase.LoginUseCase;
import com.intelisale.database.di.DatabaseModule;
import com.intelisale.database.repository.UserRepository;
import com.intelisale.networking.di.NetworkingModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CoreModule.class, DatabaseModule.class, NetworkingModule.class, SettingsModule.class})
public interface CoreComponent {

    @Component.Builder
    interface Builder {

        Builder coreModule(CoreModule coreModule);

        Builder databaseModule(DatabaseModule databaseModule);

        Builder networkingModule(NetworkingModule networkingModule);

        Builder settingsModule(SettingsModule settingsModule);

        CoreComponent build();
    }

    MyLogger logger();

    EventBusPoster eventBusPoster();

    EventBusSubscriber eventBusSubscriber();

    LoginUseCase loginUseCase();

    UserRepository userRepository();
}
