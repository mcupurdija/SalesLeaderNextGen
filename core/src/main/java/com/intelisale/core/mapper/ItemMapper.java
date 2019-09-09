package com.intelisale.core.mapper;

import com.intelisale.database.entity.ItemEntity;
import com.intelisale.networking.schema.items.ItemSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ItemMapper {

    public static ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "baseSalesItemUnitOfMeasureID", target = "itemUnitOfMeasureID"),
            @Mapping(source = "statusID", target = "itemStatusID"),
            @Mapping(target = "statusOfItem", ignore = true),
            @Mapping(target = "sent", constant = "true")
    })
    public abstract ItemEntity itemSchemaToEntity(ItemSchema itemSchema);

    public abstract List<ItemEntity> itemSchemaToEntityList(List<ItemSchema> itemSchema);
}
