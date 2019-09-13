package com.intelisale.core.mapper;

import com.intelisale.database.entity.ContactEntity;
import com.intelisale.networking.schema.contacts.ContactSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ContactMapper {

    public static ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sent", constant = "true")
    })
    public abstract ContactEntity contactEntity(ContactSchema contactSchema);
    public abstract List<ContactEntity> contactEntities(List<ContactSchema> contactSchemas);
}
