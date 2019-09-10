package com.intelisale.core.mapper;

import com.intelisale.database.entity.ItemAllowedToCustomerEntity;
import com.intelisale.database.entity.ItemConnectionsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemPackagesEntity;
import com.intelisale.networking.schema.items.ItemAllowedToCustomerSchema;
import com.intelisale.networking.schema.items.ItemConnectionsSchema;
import com.intelisale.networking.schema.items.ItemPackagesSchema;
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
    public abstract ItemEntity itemMapper(ItemSchema itemSchema);
    public abstract List<ItemEntity> itemListMapper(List<ItemSchema> itemSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "slDirectionID", target = "salesLeaderDirectionID"),
            @Mapping(target = "code", ignore = true),
            @Mapping(target = "description", ignore = true)
    })
    public abstract ItemConnectionsEntity itemConnectionsMapper(ItemConnectionsSchema itemConnectionsSchema);
    public abstract List<ItemConnectionsEntity> itemConnectionsListMapper(List<ItemConnectionsSchema> itemConnectionsSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "code", ignore = true),
            @Mapping(target = "description", ignore = true)
    })
    public abstract ItemPackagesEntity itemPackagesMapper(ItemPackagesSchema itemPackagesSchema);
    public abstract List<ItemPackagesEntity> itemPackagesListMapper(List<ItemPackagesSchema> itemPackagesSchemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "slSalesLevelTypeID", target = "salesLeaderSalesLevelTypeID")
    })
    public abstract ItemAllowedToCustomerEntity itemAllowedToCustomerMapper(ItemAllowedToCustomerSchema itemAllowedToCustomerSchema);
    public abstract List<ItemAllowedToCustomerEntity> itemAllowedToCustomerListMapper(List<ItemAllowedToCustomerSchema> itemAllowedToCustomerSchemas);
}
