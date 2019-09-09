package com.intelisale.core.mapper;

import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.networking.schema.customers.CustomerSchema;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class CustomerMapper {

    public static CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "code", target = "customerCode"),
            @Mapping(source = "customerIDForCustBusinessUnit", target = "customerIDForCustomerBusinessUnit"),
            @Mapping(source = "custBusinessUnitCode", target = "customerBusinessUnitCode"),
            @Mapping(source = "custPaymentConditionID", target = "customerPaymentConditionID"),
            @Mapping(source = "defaultCustShipToAddressID", target = "defaultCustomerShipToAddressID"),
            @Mapping(source = "custPaymentMethodID", target = "customerPaymentMethodID"),
            @Mapping(source = "primContactName", target = "primaryContactName"),
            @Mapping(source = "firstInvDate", target = "firstInvoiceDate"),
            @Mapping(source = "oldestOpenInvDate", target = "oldestOpenInvoiceDate"),
            @Mapping(source = "latestInvDate", target = "latestInvoiceDate"),
            @Mapping(source = "latestPayDate", target = "latestPaymentDate"),
            @Mapping(source = "visitProductivity6M", target = "visitProductivity6m"),
            @Mapping(source = "emailInvoice", target = "emailInvoices"),
            @Mapping(source = "userCode", target = "assignedUserCode"),
            @Mapping(source = "userFullName", target = "assignedUserName"),
            @Mapping(target = "sinRadLat", ignore = true),
            @Mapping(target = "cosRadLat", ignore = true),
            @Mapping(target = "sinRadLong", ignore = true),
            @Mapping(target = "cosRadLong", ignore = true),
            @Mapping(target = "customerTaskCount", ignore = true),
            @Mapping(target = "gallerySyncDate", ignore = true),
            @Mapping(target = "parentData", ignore = true),
            @Mapping(target = "customerHierarchyData", ignore = true),
            @Mapping(target = "sent", constant = "true")
    })
    public abstract CustomerEntity customerSchemaToEntity(CustomerSchema customerSchema);

    @AfterMapping
    void calculations(CustomerSchema customerSchema, @MappingTarget CustomerEntity customerEntity) {

        String latitude = customerSchema.getGpsLatitude();
        String longitude = customerSchema.getGpsLongitude();
        try {
            customerEntity.setSinRadLat(Math.sin(Math.toRadians(Double.valueOf(latitude))));
            customerEntity.setCosRadLat(Math.cos(Math.toRadians(Double.valueOf(latitude))));
            customerEntity.setSinRadLong(Math.sin(Math.toRadians(Double.valueOf(longitude))));
            customerEntity.setCosRadLong(Math.cos(Math.toRadians(Double.valueOf(longitude))));
        } catch (Exception ignored) {
        }
    }

    public abstract List<CustomerEntity> customerSchemaToEntityList(List<CustomerSchema> customerSchema);
}
