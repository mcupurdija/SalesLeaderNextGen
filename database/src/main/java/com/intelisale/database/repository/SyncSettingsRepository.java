package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.SettingDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.SettingEntity;

import java.util.List;

public class SyncSettingsRepository extends SyncRepository {

    private final SettingDao settingDao;

    public SyncSettingsRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, SettingDao settingDao) {
        super(globalDao, syncStatusDao, TableNames.SETTINGS);

        this.settingDao = settingDao;
    }

    public void syncSettings(List<SettingEntity> entityList) {
        settingDao.insertOrUpdate(entityList, TableNames.SETTINGS);
    }
}