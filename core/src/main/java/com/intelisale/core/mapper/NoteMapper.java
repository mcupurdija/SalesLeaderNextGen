package com.intelisale.core.mapper;

import com.intelisale.database.entity.NoteAttachmentsEntity;
import com.intelisale.database.entity.NoteEntity;
import com.intelisale.database.entity.NoteTargetGroupsEntity;
import com.intelisale.database.entity.NoteTargetTypesEntity;
import com.intelisale.networking.schema.notes.NoteAttachmentsSchema;
import com.intelisale.networking.schema.notes.NoteSchema;
import com.intelisale.networking.schema.notes.NoteTargetGroupsSchema;
import com.intelisale.networking.schema.notes.NoteTargetTypesSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class NoteMapper {

    public static NoteMapper INSTANCE = Mappers.getMapper(NoteMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sent", constant = "true"),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract NoteEntity noteEntity(NoteSchema noteSchema);
    public abstract List<NoteEntity> noteEntities(List<NoteSchema> noteSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "code", ignore = true),
            @Mapping(target = "sortIndex", ignore = true),
            @Mapping(target = "auditID", ignore = true),
    })
    public abstract NoteTargetGroupsEntity noteTargetGroupsEntity(NoteTargetGroupsSchema noteTargetGroupsSchema);
    public abstract List<NoteTargetGroupsEntity> noteTargetGroupsEntities(List<NoteTargetGroupsSchema> noteTargetGroupsSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "targetTypeCode", target = "code"),
            @Mapping(target = "sortIndex", ignore = true),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract NoteTargetTypesEntity noteTargetTypesEntity(NoteTargetTypesSchema noteTargetTypesSchema);
    public abstract List<NoteTargetTypesEntity> noteTargetTypesEntities(List<NoteTargetTypesSchema> noteTargetTypesSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sent", constant = "true"),
            @Mapping(target = "auditID", ignore = true),
            @Mapping(target = "deletedFromDevice", ignore = true)
    })
    public abstract NoteAttachmentsEntity noteAttachmentsEntity(NoteAttachmentsSchema noteAttachmentsSchema);
    public abstract List<NoteAttachmentsEntity> noteAttachmentsEntities(List<NoteAttachmentsSchema> noteAttachmentsSchemas);
}
