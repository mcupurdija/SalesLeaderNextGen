package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.SettingsMapper;
import com.intelisale.database.entity.SettingEntity;
import com.intelisale.database.repository.SyncSettingsRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.settings.UserSettingsSchema;
import com.intelisale.salesleader.di.DaggerWorkComponent;
import com.intelisale.salesleader.ui.common.base.BaseWorker;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncSettingsWork extends BaseWorker {

    private SettingsMapper settingsManager = SettingsMapper.INSTANCE;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncSettingsRepository syncSettingsRepository;

    public SyncSettingsWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public Result doWork() {

        Call<BaseSchema<List<UserSettingsSchema>>> call = syncApi.syncSettings();

        syncSettingsRepository.updateProgress(1);

        try {
            Response<BaseSchema<List<UserSettingsSchema>>> response = call.execute();
            if (response.isSuccessful()) {

                BaseSchema<List<UserSettingsSchema>> responseSchema = response.body();
                if (responseSchema != null && responseSchema.getSuccess()) {

                    List<UserSettingsSchema> userSettingsSchema = responseSchema.getData();
                    if (userSettingsSchema != null) {

                        List<SettingEntity> settingEntities = settingsManager.settingEntities(userSettingsSchema);
                        syncSettingsRepository.syncSettings(settingEntities);

                        // TODO
                    }
                } else {

                    return Result.failure();
                }
            } else {

                return Result.failure();
            }
        } catch (Exception e) {

            return Result.failure();
        }

        return Result.success();
    }

    private void inject() {
        DaggerWorkComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncSettingsWork(this);
    }
}
