package com.intelisale.core.mapper;

import com.intelisale.database.entity.SettingEntity;
import com.intelisale.networking.schema.settings.UserSettingsSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class SettingsMapper {

    public static SettingsMapper INSTANCE = Mappers.getMapper(SettingsMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SettingEntity settingEntity(UserSettingsSchema userSettingsSchema);
    public abstract List<SettingEntity> settingEntities(List<UserSettingsSchema> userSettingsSchemas);
}
