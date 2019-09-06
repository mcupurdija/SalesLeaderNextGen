package com.intelisale.core.mapper;

import com.intelisale.database.entity.ItemEntity;
import com.intelisale.networking.schema.items.ItemSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverId"),
            @Mapping(source = "modifiedByUserID", target = "modifiedByUserId"),
            @Mapping(source = "auditID", target = "auditId"),
            @Mapping(source = "categoryOfItemsID", target = "categoryOfItemsId"),
            @Mapping(source = "baseSalesItemUnitOfMeasureID", target = "itemUnitOfMeasureId"),
            @Mapping(source = "statusID", target = "itemStatusId"),
            @Mapping(source = "itemSuccessorID", target = "itemSuccessorId"),
            @Mapping(source = "itemSuccessorStatusID", target = "itemSuccessorStatusId"),
            @Mapping(source = "itemVATGroupID", target = "itemVATGroupId"),
            @Mapping(target = "sent", constant = "true")
    })
    ItemEntity itemSchemaToEntity(ItemSchema itemSchema);

    List<ItemEntity> itemSchemaToEntityList(List<ItemSchema> itemSchema);
}
