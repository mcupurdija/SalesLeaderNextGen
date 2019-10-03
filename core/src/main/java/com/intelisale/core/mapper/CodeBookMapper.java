package com.intelisale.core.mapper;

import com.intelisale.database.entity.ApprovalStatusEntity;
import com.intelisale.database.entity.BackOrderShipmentEntity;
import com.intelisale.database.entity.CategoryOfItemsEntity;
import com.intelisale.database.entity.CommentSourcesEntity;
import com.intelisale.database.entity.CommentTargetsEntity;
import com.intelisale.database.entity.ContactDepartmentEntity;
import com.intelisale.database.entity.ContactPositionEntity;
import com.intelisale.database.entity.CreatedDocumentStatusEntity;
import com.intelisale.database.entity.CustomListsHeaderEntity;
import com.intelisale.database.entity.CustomerPaymentConditionEntity;
import com.intelisale.database.entity.CustomerPaymentMethodEntity;
import com.intelisale.database.entity.CustomerShipmentMethodEntity;
import com.intelisale.database.entity.DocumentTypeEntity;
import com.intelisale.database.entity.GroupOfCustomersCategoryItemsEntity;
import com.intelisale.database.entity.GroupOfCustomersEntity;
import com.intelisale.database.entity.ItemStatusEntity;
import com.intelisale.database.entity.ItemUnitOfMeasureEntity;
import com.intelisale.database.entity.MunicipalityEntity;
import com.intelisale.database.entity.PostalCodesAndCitiesEntity;
import com.intelisale.database.entity.SalesDocumentConditionEntity;
import com.intelisale.database.entity.SalesDocumentTypeEntity;
import com.intelisale.database.entity.SalesLeaderCustomerCardColorEntity;
import com.intelisale.database.entity.SalesLeaderDirectionEntity;
import com.intelisale.database.entity.SalesLeaderSalesLevelTypeEntity;
import com.intelisale.database.entity.SalesPriceTypeEntity;
import com.intelisale.database.entity.SalesTypeEntity;
import com.intelisale.database.entity.ServiceClassificationEntity;
import com.intelisale.database.entity.ServiceClassificationTypeEntity;
import com.intelisale.database.entity.ServiceOrdersStatusEntity;
import com.intelisale.database.entity.StockAvailabilityStatusEntity;
import com.intelisale.database.entity.TagEntity;
import com.intelisale.database.entity.TransactionTypeEntity;
import com.intelisale.database.entity.UserDefinedListEntity;
import com.intelisale.database.entity.UserEntity;
import com.intelisale.database.entity.VisitSubResultEntity;
import com.intelisale.database.entity.WarehouseEntity;
import com.intelisale.networking.schema.codebooks.ApprovalStatusSchema;
import com.intelisale.networking.schema.codebooks.BackOrderShipmentStatusSchema;
import com.intelisale.networking.schema.codebooks.CategoriesOfItemSchema;
import com.intelisale.networking.schema.codebooks.CommentsSourceSchema;
import com.intelisale.networking.schema.codebooks.CommentsTargetSchema;
import com.intelisale.networking.schema.codebooks.ContactsDepartmentSchema;
import com.intelisale.networking.schema.codebooks.ContactsPositionSchema;
import com.intelisale.networking.schema.codebooks.CreatedDocumentStatusSchema;
import com.intelisale.networking.schema.codebooks.CustPaymentConditionSchema;
import com.intelisale.networking.schema.codebooks.CustPaymentMethodSchema;
import com.intelisale.networking.schema.codebooks.CustShipmentMethodSchema;
import com.intelisale.networking.schema.codebooks.CustomListSchema;
import com.intelisale.networking.schema.codebooks.CustomListsHeaderSchema;
import com.intelisale.networking.schema.codebooks.DocumentTypeSchema;
import com.intelisale.networking.schema.codebooks.GroupOfCustomersCategoryItemSchema;
import com.intelisale.networking.schema.codebooks.GroupsOfCustomersSchema;
import com.intelisale.networking.schema.codebooks.ItemStatusSchema;
import com.intelisale.networking.schema.codebooks.ItemUnitOfMeasuresSchema;
import com.intelisale.networking.schema.codebooks.MunicipalitySchema;
import com.intelisale.networking.schema.codebooks.PostalCodesAndCitySchema;
import com.intelisale.networking.schema.codebooks.SLCustomerCardColorSchema;
import com.intelisale.networking.schema.codebooks.SLDirectionSchema;
import com.intelisale.networking.schema.codebooks.SLSalesLevelTypeSchema;
import com.intelisale.networking.schema.codebooks.SalesDocumentConditionSchema;
import com.intelisale.networking.schema.codebooks.SalesDocumentTypeSchema;
import com.intelisale.networking.schema.codebooks.SalesPriceTypeSchema;
import com.intelisale.networking.schema.codebooks.SalesTypeSchema;
import com.intelisale.networking.schema.codebooks.ServiceClassificationSchema;
import com.intelisale.networking.schema.codebooks.ServiceClassificationTypesSchema;
import com.intelisale.networking.schema.codebooks.ServiceOrderStatusSchema;
import com.intelisale.networking.schema.codebooks.StockAvailabilityStatusSchema;
import com.intelisale.networking.schema.codebooks.TagSchema;
import com.intelisale.networking.schema.codebooks.TransactionTypeSchema;
import com.intelisale.networking.schema.codebooks.UserSchema;
import com.intelisale.networking.schema.codebooks.VisitResultSchema;
import com.intelisale.networking.schema.codebooks.WarehouseSchema;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class CodeBookMapper {

    public static CodeBookMapper INSTANCE = Mappers.getMapper(CodeBookMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ApprovalStatusEntity approvalStatusEntity(ApprovalStatusSchema schema);
    public abstract List<ApprovalStatusEntity> approvalStatusEntities(List<ApprovalStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract StockAvailabilityStatusEntity stockAvailabilityStatusEntity(StockAvailabilityStatusSchema schema);
    public abstract List<StockAvailabilityStatusEntity> stockAvailabilityStatusEntities(List<StockAvailabilityStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "commentsSourceID", target = "serverID")
    })
    public abstract CommentSourcesEntity commentSourcesEntity(CommentsSourceSchema schema);
    public abstract List<CommentSourcesEntity> commentSourcesEntities(List<CommentsSourceSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ContactPositionEntity contactPositionEntity(ContactsPositionSchema schema);
    public abstract List<ContactPositionEntity> contactPositionEntities(List<ContactsPositionSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true)
    })
    public abstract GroupOfCustomersEntity groupOfCustomersEntity(GroupsOfCustomersSchema schema);
    public abstract List<GroupOfCustomersEntity> groupOfCustomersEntities(List<GroupsOfCustomersSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesPriceTypeEntity salesPriceTypeEntity(SalesPriceTypeSchema schema);
    public abstract List<SalesPriceTypeEntity> salesPriceTypeEntities(List<SalesPriceTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ContactDepartmentEntity contactDepartmentEntity(ContactsDepartmentSchema schema);
    public abstract List<ContactDepartmentEntity> contactDepartmentEntities(List<ContactsDepartmentSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesLeaderSalesLevelTypeEntity salesLeaderSalesLevelTypeEntity(SLSalesLevelTypeSchema schema);
    public abstract List<SalesLeaderSalesLevelTypeEntity> salesLeaderSalesLevelTypeEntities(List<SLSalesLevelTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "tagID", target = "serverID")
    })
    public abstract TagEntity tagEntity(TagSchema schema);
    public abstract List<TagEntity> tagEntities(List<TagSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract BackOrderShipmentEntity backOrderShipmentEntity(BackOrderShipmentStatusSchema schema);
    public abstract List<BackOrderShipmentEntity> backOrderShipmentEntities(List<BackOrderShipmentStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesDocumentTypeEntity salesDocumentTypeEntity(SalesDocumentTypeSchema schema);
    public abstract List<SalesDocumentTypeEntity> salesDocumentTypeEntities(List<SalesDocumentTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract CustomerShipmentMethodEntity customerShipmentMethodEntity(CustShipmentMethodSchema schema);
    public abstract List<CustomerShipmentMethodEntity> customerShipmentMethodEntities(List<CustShipmentMethodSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesTypeEntity salesTypeEntity(SalesTypeSchema schema);
    public abstract List<SalesTypeEntity> salesTypeEntities(List<SalesTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "municipalityID", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true)
    })
    public abstract MunicipalityEntity municipalityEntity(MunicipalitySchema schema);
    public abstract List<MunicipalityEntity> municipalityEntities(List<MunicipalitySchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesLeaderDirectionEntity salesLeaderDirectionEntity(SLDirectionSchema schema);
    public abstract List<SalesLeaderDirectionEntity> salesLeaderDirectionEntities(List<SLDirectionSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract VisitSubResultEntity visitSubResultEntity(VisitResultSchema schema);
    public abstract List<VisitSubResultEntity> visitSubResultEntities(List<VisitResultSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract CustomerPaymentMethodEntity customerPaymentMethodEntity(CustPaymentMethodSchema schema);
    public abstract List<CustomerPaymentMethodEntity> customerPaymentMethodEntities(List<CustPaymentMethodSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract PostalCodesAndCitiesEntity postalCodesAndCitiesEntity(PostalCodesAndCitySchema schema);
    public abstract List<PostalCodesAndCitiesEntity> postalCodesAndCitiesEntities(List<PostalCodesAndCitySchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ItemUnitOfMeasureEntity itemUnitOfMeasureEntity(ItemUnitOfMeasuresSchema schema);
    public abstract List<ItemUnitOfMeasureEntity> itemUnitOfMeasureEntity(List<ItemUnitOfMeasuresSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract WarehouseEntity warehouseEntity(WarehouseSchema schema);
    public abstract List<WarehouseEntity> warehouseEntities(List<WarehouseSchema> schemas);

    @Mappings({
            @Mapping(source = "commentsTargetID", target = "serverID")
    })
    public abstract CommentTargetsEntity commentTargetsEntity(CommentsTargetSchema schema);
    public abstract List<CommentTargetsEntity> commentTargetsEntities(List<CommentsTargetSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract DocumentTypeEntity documentTypeEntity(DocumentTypeSchema schema);
    public abstract List<DocumentTypeEntity> documentTypeEntities(List<DocumentTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesDocumentConditionEntity salesDocumentConditionEntity(SalesDocumentConditionSchema schema);
    public abstract List<SalesDocumentConditionEntity> salesDocumentConditionEntities(List<SalesDocumentConditionSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract UserDefinedListEntity userDefinedListEntity(CustomListSchema schema);
    public abstract List<UserDefinedListEntity> userDefinedListEntities(List<CustomListSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract SalesLeaderCustomerCardColorEntity salesLeaderCustomerCardColorEntity(SLCustomerCardColorSchema schema);
    public abstract List<SalesLeaderCustomerCardColorEntity> salesLeaderCustomerCardColorEntities(List<SLCustomerCardColorSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true)
    })
    public abstract CategoryOfItemsEntity categoryOfItemsEntity(CategoriesOfItemSchema schema);
    public abstract List<CategoryOfItemsEntity> categoryOfItemsEntities(List<CategoriesOfItemSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract CustomerPaymentConditionEntity customerPaymentConditionEntity(CustPaymentConditionSchema schema);
    public abstract List<CustomerPaymentConditionEntity> customerPaymentConditionEntities(List<CustPaymentConditionSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ItemStatusEntity itemStatusEntity(ItemStatusSchema schema);
    public abstract List<ItemStatusEntity> itemStatusEntities(List<ItemStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract CreatedDocumentStatusEntity createdDocumentStatusEntity(CreatedDocumentStatusSchema schema);
    public abstract List<CreatedDocumentStatusEntity> createdDocumentStatusEntities(List<CreatedDocumentStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract TransactionTypeEntity transactionTypeEntity(TransactionTypeSchema schema);
    public abstract List<TransactionTypeEntity> transactionTypeEntities(List<TransactionTypeSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract ServiceOrdersStatusEntity serviceOrdersStatusEntity(ServiceOrderStatusSchema schema);
    public abstract List<ServiceOrdersStatusEntity> serviceOrdersStatusEntities(List<ServiceOrderStatusSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ServiceClassificationTypeEntity serviceClassificationTypeEntity(ServiceClassificationTypesSchema schema);
    public abstract List<ServiceClassificationTypeEntity> serviceClassificationTypeEntities(List<ServiceClassificationTypesSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract ServiceClassificationEntity serviceClassificationEntity(ServiceClassificationSchema schema);
    public abstract List<ServiceClassificationEntity> serviceClassificationEntities(List<ServiceClassificationSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract UserEntity userEntity(UserSchema schema);
    public abstract List<UserEntity> userEntities(List<UserSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID"),
            @Mapping(target = "sortIndex", ignore = true),
            @Mapping(target = "auditID", ignore = true)
    })
    public abstract GroupOfCustomersCategoryItemsEntity groupOfCustomersCategoryItemsEntity(GroupOfCustomersCategoryItemSchema schema);
    public abstract List<GroupOfCustomersCategoryItemsEntity> groupOfCustomersCategoryItemsEntities(List<GroupOfCustomersCategoryItemSchema> schemas);

    @Mappings({
            @Mapping(source = "id", target = "serverID")
    })
    public abstract CustomListsHeaderEntity customListsHeaderEntity(CustomListsHeaderSchema schema);
    public abstract List<CustomListsHeaderEntity> customListsHeaderEntities(List<CustomListsHeaderSchema> schemas);
}
