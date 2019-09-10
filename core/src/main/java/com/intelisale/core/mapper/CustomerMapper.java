package com.intelisale.core.mapper;

import com.intelisale.database.entity.CustomListsLineEntity;
import com.intelisale.database.entity.CustomerCustomListEntity;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.entity.CustomerFrequenciesEntity;
import com.intelisale.database.entity.CustomerPlanTurnoverEntity;
import com.intelisale.database.entity.CustomerProcessEntity;
import com.intelisale.database.entity.CustomerProductGroupPotentialEntity;
import com.intelisale.database.entity.CustomerShipToAddressesEntity;
import com.intelisale.database.entity.CustomerStatisticsEntity;
import com.intelisale.database.entity.CustomerVisitsEntity;
import com.intelisale.database.entity.SalesLeaderCategoryAllowedToCustomerEntity;
import com.intelisale.database.entity.SalesLeaderShelvePerCustomersEntity;
import com.intelisale.networking.schema.customers.CustomListLineSchema;
import com.intelisale.networking.schema.customers.CustomerCustomListSchema;
import com.intelisale.networking.schema.customers.CustomerFrequenciesSchema;
import com.intelisale.networking.schema.customers.CustomerPlanTurnoverSchema;
import com.intelisale.networking.schema.customers.CustomerProductGroupPotentialSchema;
import com.intelisale.networking.schema.customers.CustomerSchema;
import com.intelisale.networking.schema.customers.CustomerShipToAddressSchema;
import com.intelisale.networking.schema.customers.CustomerStatisticSchema;
import com.intelisale.networking.schema.customers.CustomerVisitSchema;
import com.intelisale.networking.schema.customers.SLCategoriesAllowedToCustomerSchema;
import com.intelisale.networking.schema.customers.SLProcessesPerCustomerSchema;
import com.intelisale.networking.schema.customers.SLShelvesPerCustomerSchema;

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
    public abstract CustomerEntity customerEntity(CustomerSchema customerSchema);
    public abstract List<CustomerEntity> customerEntities(List<CustomerSchema> customerSchema);

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

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "slProcessID", target = "processID"),
            @Mapping(target = "id", ignore = true)
    })
    public abstract CustomerProcessEntity customerProcessEntity(SLProcessesPerCustomerSchema slProcessesPerCustomerSchema);
    public abstract List<CustomerProcessEntity> customerProcessEntities(List<SLProcessesPerCustomerSchema> slProcessesPerCustomerSchema);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true)
    })
    public abstract CustomerShipToAddressesEntity customerShipToAddressesEntity(CustomerShipToAddressSchema customerShipToAddressSchema);
    public abstract List<CustomerShipToAddressesEntity> customerShipToAddressesEntities(List<CustomerShipToAddressSchema> customerShipToAddressSchema);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "isORSY100", target = "shelfIsORSY100")
    })
    public abstract SalesLeaderShelvePerCustomersEntity salesLeaderShelvePerCustomersEntity(SLShelvesPerCustomerSchema slShelvesPerCustomerSchema);
    public abstract List<SalesLeaderShelvePerCustomersEntity> salesLeaderShelvePerCustomersEntities(List<SLShelvesPerCustomerSchema> slShelvesPerCustomerSchema);

    @Mappings({
            @Mapping(source = "slCategoriesAllowedToCust", target = "serverID"),
            @Mapping(source = "slSalesLevelTypeID", target = "salesLeaderSalesLevelTypeID"),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "code", ignore = true),
            @Mapping(target = "description", ignore = true)
    })
    public abstract SalesLeaderCategoryAllowedToCustomerEntity salesLeaderCategoryAllowedToCustomerEntity(SLCategoriesAllowedToCustomerSchema slCategoriesAllowedToCustomerSchema);
    public abstract List<SalesLeaderCategoryAllowedToCustomerEntity> salesLeaderCategoryAllowedToCustomerEntities(List<SLCategoriesAllowedToCustomerSchema> slCategoriesAllowedToCustomerSchema);

    @Mappings({
            @Mapping(source = "customerVisitsStatID", target = "serverID"),
            @Mapping(source = "date", target = "visitDate"),
            @Mapping(target = "id", ignore = true)
    })
    public abstract CustomerVisitsEntity customerVisitsEntity(CustomerVisitSchema customerVisitSchema);
    public abstract List<CustomerVisitsEntity> customerVisitsEntities(List<CustomerVisitSchema> customerVisitSchema);

    @Mappings({
            @Mapping(source = "customerStatisticsID", target = "serverID"),
            @Mapping(source = "diffItems", target = "items"),
            @Mapping(source = "salesLines", target = "lines"),
            @Mapping(target = "id", ignore = true)
    })
    public abstract CustomerStatisticsEntity customerStatisticsEntity(CustomerStatisticSchema customerStatisticSchema);
    public abstract List<CustomerStatisticsEntity> customerStatisticsEntities(List<CustomerStatisticSchema> customerStatisticSchema);

    @Mappings({
            @Mapping(source = "planVsPrometID", target = "serverID"),
            @Mapping(source = "value", target = "planTurnoverValue"),
            @Mapping(target = "id", ignore = true),
    })
    public abstract CustomerPlanTurnoverEntity customerPlanTurnoverEntity(CustomerPlanTurnoverSchema customerPlanTurnoverSchema);
    public abstract List<CustomerPlanTurnoverEntity> customerPlanTurnoverEntities(List<CustomerPlanTurnoverSchema> customerPlanTurnoverSchema);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "serverID", ignore = true)
    })
    public abstract CustomerProductGroupPotentialEntity customerProductGroupPotentialEntity(CustomerProductGroupPotentialSchema customerProductGroupPotentialSchema);
    public abstract List<CustomerProductGroupPotentialEntity> customerProductGroupPotentialEntities(List<CustomerProductGroupPotentialSchema> customerProductGroupPotentialSchema);

    @Mappings({
            @Mapping(source = "dateFrom", target = "fromDate"),
            @Mapping(source = "dateTo", target = "toDate"),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "serverID", ignore = true),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract CustomerCustomListEntity customerCustomListEntity(CustomerCustomListSchema customerCustomListSchema);
    public abstract List<CustomerCustomListEntity> customerCustomListEntities(List<CustomerCustomListSchema> customerCustomListSchema);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "modifiedByUserID", ignore = true),
            @Mapping(target = "auditID", ignore = true),
            @Mapping(target = "active", constant = "true")
    })
    public abstract CustomListsLineEntity customListsLineEntity(CustomListLineSchema customListLineSchema);
    public abstract List<CustomListsLineEntity> customListsLineEntities(List<CustomListLineSchema> customListLineSchema);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(source = "day", target = "dayOfWeek"),
            @Mapping(target = "auditID", ignore = true),
            @Mapping(target = "userID", ignore = true)
    })
    public abstract CustomerFrequenciesEntity customerFrequenciesEntity(CustomerFrequenciesSchema customerFrequenciesSchema);
    public abstract List<CustomerFrequenciesEntity> customerFrequenciesEntities(List<CustomerFrequenciesSchema> customerFrequenciesSchema);
}
