package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.CodeBookMapper;
import com.intelisale.database.TableNames;
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
import com.intelisale.database.entity.DocumentVerificationStatusEntity;
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
import com.intelisale.database.entity.TransactionTypeEntity;
import com.intelisale.database.entity.UserDefinedListEntity;
import com.intelisale.database.entity.UserEntity;
import com.intelisale.database.entity.VisitSubResultEntity;
import com.intelisale.database.entity.WarehouseEntity;
import com.intelisale.database.repository.SyncCodeBooksRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
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
import com.intelisale.networking.schema.codebooks.DocumentVerificationStatusSchema;
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
import com.intelisale.networking.schema.codebooks.SyncCodeBooksResponseSchema;
import com.intelisale.networking.schema.codebooks.TransactionTypeSchema;
import com.intelisale.networking.schema.codebooks.UserSchema;
import com.intelisale.networking.schema.codebooks.VisitResultSchema;
import com.intelisale.networking.schema.codebooks.WarehouseSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.di.DaggerWorkComponent;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.salesleader.work.helper.PaginationHelper;
import com.intelisale.salesleader.work.helper.SyncObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncCodeBooksWork extends BaseWorker {

    private CodeBookMapper codeBookMapper = CodeBookMapper.INSTANCE;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncCodeBooksRepository syncCodeBooksRepository;

    public SyncCodeBooksWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public ListenableWorker.Result doWork() {

        // 0. APPROVAL_STATUSES
        SyncObject obj0 = new SyncObject(SyncTableNames.ApprovalStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.APPROVAL_STATUSES), 100);
        // 1. STOCK_AVAILABILITY_STATUSES
        SyncObject obj1 = new SyncObject(SyncTableNames.StockAvailabilityStatus, syncCodeBooksRepository.getModifiedDate(TableNames.STOCK_AVAILABILITY_STATUSES), 100);
        // 2. BACK_ORDER_SHIPMENT_STATUSES
        SyncObject obj2 = new SyncObject(SyncTableNames.BackOrderShipmentStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.BACK_ORDER_SHIPMENT_STATUSES), 100);
        // 3. CATEGORIES_OF_ITEMS
        SyncObject obj3 = new SyncObject(SyncTableNames.CategoriesOfItems, syncCodeBooksRepository.getModifiedDate(TableNames.CATEGORIES_OF_ITEMS), 100);
        // 4. CONTACTS_DEPARTMENTS
        SyncObject obj4 = new SyncObject(SyncTableNames.ContactsDepartments, syncCodeBooksRepository.getModifiedDate(TableNames.CONTACTS_DEPARTMENTS), 100);
        // 5. CONTACTS_POSITIONS
        SyncObject obj5 = new SyncObject(SyncTableNames.ContactsPositions, syncCodeBooksRepository.getModifiedDate(TableNames.CONTACTS_POSITIONS), 100);
        // 6. CUSTOMER_PAYMENT_METHODS
        SyncObject obj6 = new SyncObject(SyncTableNames.CustomerPaymentMethods, syncCodeBooksRepository.getModifiedDate(TableNames.CUSTOMER_PAYMENT_METHODS), 100);
        // 7. CUSTOMER_PAYMENT_CONDITIONS
        SyncObject obj7 = new SyncObject(SyncTableNames.CustomerPaymentConditions, syncCodeBooksRepository.getModifiedDate(TableNames.CUSTOMER_PAYMENT_CONDITIONS), 100);
        // 8. CUSTOMER_SHIPMENT_METHODS
        SyncObject obj8 = new SyncObject(SyncTableNames.CustomerShipmentMethods, syncCodeBooksRepository.getModifiedDate(TableNames.CUSTOMER_SHIPMENT_METHODS), 100);
        // 9. DOCUMENT_TYPES
        SyncObject obj9 = new SyncObject(SyncTableNames.DocumentTypes, syncCodeBooksRepository.getModifiedDate(TableNames.DOCUMENT_TYPES), 100);
        // 10. GROUPS_OF_CUSTOMERS
        SyncObject obj10 = new SyncObject(SyncTableNames.GroupsOfCustomers, syncCodeBooksRepository.getModifiedDate(TableNames.GROUPS_OF_CUSTOMERS), 100);
        // 11. ITEM_UNIT_OF_MEASURES
        SyncObject obj11 = new SyncObject(SyncTableNames.ItemUnitOfMeasures, syncCodeBooksRepository.getModifiedDate(TableNames.ITEM_UNIT_OF_MEASURES), 100);
        // 12. POSTAL_CODES_AND_CITIES
        SyncObject obj12 = new SyncObject(SyncTableNames.PostalCodesAndCities, syncCodeBooksRepository.getModifiedDate(TableNames.POSTAL_CODES_AND_CITIES), 100);
        // 13. SALES_DOCUMENT_CONDITIONS
        SyncObject obj13 = new SyncObject(SyncTableNames.SalesDocumentConditions, syncCodeBooksRepository.getModifiedDate(TableNames.SALES_DOCUMENT_CONDITIONS), 100);
        // 14. SALES_DOCUMENT_TYPES
        SyncObject obj14 = new SyncObject(SyncTableNames.SalesDocumentTypes, syncCodeBooksRepository.getModifiedDate(TableNames.SALES_DOCUMENT_TYPES), 100);
        // 15. SALES_PRICE_TYPES
        SyncObject obj15 = new SyncObject(SyncTableNames.SalesPriceTypes, syncCodeBooksRepository.getModifiedDate(TableNames.SALES_PRICE_TYPES), 100);
        // 16. SALES_TYPES
        SyncObject obj16 = new SyncObject(SyncTableNames.SalesTypes, syncCodeBooksRepository.getModifiedDate(TableNames.SALES_TYPES), 100);
        // 17. VISIT_SUB_RESULTS
        SyncObject obj17 = new SyncObject(SyncTableNames.VisitResults, syncCodeBooksRepository.getModifiedDate(TableNames.VISIT_SUB_RESULTS), 100);
        // 18. WAREHOUSES
        SyncObject obj18 = new SyncObject(SyncTableNames.Warehouses, syncCodeBooksRepository.getModifiedDate(TableNames.WAREHOUSES), 100);
        // 19. SL_DIRECTIONS
        SyncObject obj19 = new SyncObject(SyncTableNames.SLDirections, syncCodeBooksRepository.getModifiedDate(TableNames.SL_DIRECTIONS), 100);
        // 20. SL_SALES_LEVEL_TYPES
        SyncObject obj20 = new SyncObject(SyncTableNames.SLSalesLevelTypes, syncCodeBooksRepository.getModifiedDate(TableNames.SL_SALES_LEVEL_TYPES), 100);
        // 21. SL_CUSTOMER_CARD_COLORS
        SyncObject obj21 = new SyncObject(SyncTableNames.SLCustomerCardColors, syncCodeBooksRepository.getModifiedDate(TableNames.SL_CUSTOMER_CARD_COLORS), 100);
        // 22. DOCUMENT_VERIFICATION_STATUSES
        SyncObject obj22 = new SyncObject(SyncTableNames.DocumentVerificationStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.DOCUMENT_VERIFICATION_STATUSES), 100);
        // 23. ITEM_STATUSES
        SyncObject obj23 = new SyncObject(SyncTableNames.ItemStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.ITEM_STATUSES), 100);
        // 24. USER_DEFINED_LISTS
        SyncObject obj24 = new SyncObject(SyncTableNames.CustomLists, syncCodeBooksRepository.getModifiedDate(TableNames.USER_DEFINED_LISTS), 100);
        // 25. CREATED_DOCUMENT_STATUS
        SyncObject obj25 = new SyncObject(SyncTableNames.CreatedDocumentStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.CREATED_DOCUMENT_STATUS), 100);
        // 26. TRANSACTION_TYPES
        SyncObject obj26 = new SyncObject(SyncTableNames.TransactionTypes, syncCodeBooksRepository.getModifiedDate(TableNames.TRANSACTION_TYPES), 100);
        // 27. SERVICE_ORDERS_STATUS
        SyncObject obj27 = new SyncObject(SyncTableNames.ServiceOrdersStatuses, syncCodeBooksRepository.getModifiedDate(TableNames.SERVICE_ORDERS_STATUS), 100);
        // 28. SERVICE_CLASSIFICATION
        SyncObject obj28 = new SyncObject(SyncTableNames.ServiceClassification, syncCodeBooksRepository.getModifiedDate(TableNames.SERVICE_CLASSIFICATION), 100);
        // 29. SERVICE_CLASSIFICATION_TYPES
        SyncObject obj29 = new SyncObject(SyncTableNames.ServiceClassificationTypes, syncCodeBooksRepository.getModifiedDate(TableNames.SERVICE_CLASSIFICATION_TYPES), 100);
        // 30. USERS
        SyncObject obj30 = new SyncObject(SyncTableNames.Users, syncCodeBooksRepository.getModifiedDate(TableNames.USERS), 100);
        // 31. GROUP_OF_CUSTOMERS_CATEGORY_ITEMS
        SyncObject obj31 = new SyncObject(SyncTableNames.GroupOfCustomersCategoryItems, syncCodeBooksRepository.getModifiedDate(TableNames.GROUP_OF_CUSTOMERS_CATEGORY_ITEMS), 100);
        // 32. CUSTOM_LISTS_HEADERS
        SyncObject obj32 = new SyncObject(SyncTableNames.CustomListsHeaders, syncCodeBooksRepository.getModifiedDate(TableNames.CUSTOM_LISTS_HEADERS), 100);
        // 33. MUNICIPALITIES
        SyncObject obj33 = new SyncObject(SyncTableNames.Municipalities, syncCodeBooksRepository.getModifiedDate(TableNames.MUNICIPALITIES), 100);
        // 34. COMMENTS_SOURCES
        SyncObject obj34 = new SyncObject(SyncTableNames.CommentsSources, syncCodeBooksRepository.getModifiedDate(TableNames.COMMENTS_SOURCES), 100);
        // 35. COMMENTS_TARGETS
        SyncObject obj35 = new SyncObject(SyncTableNames.CommentsTargets, syncCodeBooksRepository.getModifiedDate(TableNames.COMMENTS_TARGETS), 100);

        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, obj30, obj31, obj32, obj33, obj34, obj35});

        while (paginationHelper.setSyncRequest()) {

            syncCodeBooksRepository.updateProgress(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncCodeBooksResponseSchema>> call = syncApi.syncCodeBooks(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncCodeBooksResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncCodeBooksResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncCodeBooksResponseSchema syncCodeBooksResponseSchema = responseSchema.getData();
                        if (syncCodeBooksResponseSchema != null) {

                            // 0. APPROVAL_STATUSES
                            BaseRecordSchema<ApprovalStatusSchema> schemaApprovalStatuses = syncCodeBooksResponseSchema.getApprovalStatuses();
                            if (schemaApprovalStatuses != null && schemaApprovalStatuses.getRecords() != null) {
                                List<ApprovalStatusEntity> approvalStatusEntities = codeBookMapper.approvalStatusEntities(schemaApprovalStatuses.getRecords());
                                syncCodeBooksRepository.syncApprovalStatus(approvalStatusEntities);
                                paginationHelper.updateCounters(0, schemaApprovalStatuses.getNumOfRecords());
                            }

                            // 1. STOCK_AVAILABILITY_STATUSES
                            BaseRecordSchema<StockAvailabilityStatusSchema> schemaStockAvailabilityStatuses = syncCodeBooksResponseSchema.getStockAvailabilityStatuses();
                            if (schemaStockAvailabilityStatuses != null && schemaStockAvailabilityStatuses.getRecords() != null) {
                                List<StockAvailabilityStatusEntity> stockAvailabilityStatusEntities = codeBookMapper.stockAvailabilityStatusEntities(schemaStockAvailabilityStatuses.getRecords());
                                syncCodeBooksRepository.syncStockAvailabilityStatus(stockAvailabilityStatusEntities);
                                paginationHelper.updateCounters(1, schemaStockAvailabilityStatuses.getNumOfRecords());
                            }

                            // 2. BACK_ORDER_SHIPMENT_STATUSES
                            BaseRecordSchema<BackOrderShipmentStatusSchema> schemaBackOrderShipmentStatuses = syncCodeBooksResponseSchema.getBackOrderShipmentStatuses();
                            if (schemaBackOrderShipmentStatuses != null && schemaBackOrderShipmentStatuses.getRecords() != null) {
                                List<BackOrderShipmentEntity> backOrderShipmentEntities = codeBookMapper.backOrderShipmentEntities(schemaBackOrderShipmentStatuses.getRecords());
                                syncCodeBooksRepository.syncBackOrderShipment(backOrderShipmentEntities);
                                paginationHelper.updateCounters(2, schemaBackOrderShipmentStatuses.getNumOfRecords());
                            }

                            // 3. CATEGORIES_OF_ITEMS
                            BaseRecordSchema<CategoriesOfItemSchema> schemaCategoriesOfItems = syncCodeBooksResponseSchema.getCategoriesOfItems();
                            if (schemaCategoriesOfItems != null && schemaCategoriesOfItems.getRecords() != null) {
                                List<CategoryOfItemsEntity> categoryOfItemsEntities = codeBookMapper.categoryOfItemsEntities(schemaCategoriesOfItems.getRecords());
                                syncCodeBooksRepository.syncCategoryOfItems(categoryOfItemsEntities);
                                paginationHelper.updateCounters(3, schemaCategoriesOfItems.getNumOfRecords());
                            }

                            // 4. CONTACTS_DEPARTMENTS
                            BaseRecordSchema<ContactsDepartmentSchema> schemaContactsDepartments = syncCodeBooksResponseSchema.getContactsDepartments();
                            if (schemaContactsDepartments != null && schemaContactsDepartments.getRecords() != null) {
                                List<ContactDepartmentEntity> xxx_Entities = codeBookMapper.contactDepartmentEntities(schemaContactsDepartments.getRecords());
                                syncCodeBooksRepository.syncContactDepartment(xxx_Entities);
                                paginationHelper.updateCounters(4, schemaContactsDepartments.getNumOfRecords());
                            }

                            // 5. CONTACTS_POSITIONS
                            BaseRecordSchema<ContactsPositionSchema> schemaContactsPositions = syncCodeBooksResponseSchema.getContactsPositions();
                            if (schemaContactsPositions != null && schemaContactsPositions.getRecords() != null) {
                                List<ContactPositionEntity> contactPositionEntities = codeBookMapper.contactPositionEntities(schemaContactsPositions.getRecords());
                                syncCodeBooksRepository.syncContactPosition(contactPositionEntities);
                                paginationHelper.updateCounters(5, schemaContactsPositions.getNumOfRecords());
                            }

                            // 6. CUSTOMER_PAYMENT_METHODS
                            BaseRecordSchema<CustPaymentMethodSchema> schemaCustPaymentMethods = syncCodeBooksResponseSchema.getCustPaymentMethods();
                            if (schemaCustPaymentMethods != null && schemaCustPaymentMethods.getRecords() != null) {
                                List<CustomerPaymentMethodEntity> customerPaymentMethodEntities = codeBookMapper.customerPaymentMethodEntities(schemaCustPaymentMethods.getRecords());
                                syncCodeBooksRepository.syncCustomerPaymentMethod(customerPaymentMethodEntities);
                                paginationHelper.updateCounters(6, schemaCustPaymentMethods.getNumOfRecords());
                            }

                            // 7. CUSTOMER_PAYMENT_CONDITIONS
                            BaseRecordSchema<CustPaymentConditionSchema> schemaCustPaymentConditions = syncCodeBooksResponseSchema.getCustPaymentConditions();
                            if (schemaCustPaymentConditions != null && schemaCustPaymentConditions.getRecords() != null) {
                                List<CustomerPaymentConditionEntity> customerPaymentConditionEntities = codeBookMapper.customerPaymentConditionEntities(schemaCustPaymentConditions.getRecords());
                                syncCodeBooksRepository.syncCustomerPaymentCondition(customerPaymentConditionEntities);
                                paginationHelper.updateCounters(7, schemaCustPaymentConditions.getNumOfRecords());
                            }

                            // 8. CUSTOMER_SHIPMENT_METHODS
                            BaseRecordSchema<CustShipmentMethodSchema> schemaCustShipmentMethods = syncCodeBooksResponseSchema.getCustShipmentMethods();
                            if (schemaCustShipmentMethods != null && schemaCustShipmentMethods.getRecords() != null) {
                                List<CustomerShipmentMethodEntity> customerShipmentMethodEntities = codeBookMapper.customerShipmentMethodEntities(schemaCustShipmentMethods.getRecords());
                                syncCodeBooksRepository.syncCustomerShipmentMethod(customerShipmentMethodEntities);
                                paginationHelper.updateCounters(8, schemaCustShipmentMethods.getNumOfRecords());
                            }

                            // 9. DOCUMENT_TYPES
                            BaseRecordSchema<DocumentTypeSchema> schemaDocumentTypes = syncCodeBooksResponseSchema.getDocumentTypes();
                            if (schemaDocumentTypes != null && schemaDocumentTypes.getRecords() != null) {
                                List<DocumentTypeEntity> documentTypeEntities = codeBookMapper.documentTypeEntities(schemaDocumentTypes.getRecords());
                                syncCodeBooksRepository.syncDocumentType(documentTypeEntities);
                                paginationHelper.updateCounters(9, schemaDocumentTypes.getNumOfRecords());
                            }

                            // 10. GROUPS_OF_CUSTOMERS
                            BaseRecordSchema<GroupsOfCustomersSchema> schemaGroupsOfCustomers = syncCodeBooksResponseSchema.getGroupsOfCustomers();
                            if (schemaGroupsOfCustomers != null && schemaGroupsOfCustomers.getRecords() != null) {
                                List<GroupOfCustomersEntity> groupOfCustomersEntities = codeBookMapper.groupOfCustomersEntities(schemaGroupsOfCustomers.getRecords());
                                syncCodeBooksRepository.syncGroupOfCustomers(groupOfCustomersEntities);
                                paginationHelper.updateCounters(10, schemaGroupsOfCustomers.getNumOfRecords());
                            }

                            // 11. ITEM_UNIT_OF_MEASURES
                            BaseRecordSchema<ItemUnitOfMeasuresSchema> schemaItemUnitOfMeasures = syncCodeBooksResponseSchema.getItemUnitOfMeasures();
                            if (schemaItemUnitOfMeasures != null && schemaItemUnitOfMeasures.getRecords() != null) {
                                List<ItemUnitOfMeasureEntity> itemUnitOfMeasureEntities = codeBookMapper.itemUnitOfMeasureEntities(schemaItemUnitOfMeasures.getRecords());
                                syncCodeBooksRepository.syncItemUnitOfMeasure(itemUnitOfMeasureEntities);
                                paginationHelper.updateCounters(11, schemaItemUnitOfMeasures.getNumOfRecords());
                            }

                            // 12. POSTAL_CODES_AND_CITIES
                            BaseRecordSchema<PostalCodesAndCitySchema> schemaPostalCodesAndCities = syncCodeBooksResponseSchema.getPostalCodesAndCities();
                            if (schemaPostalCodesAndCities != null && schemaPostalCodesAndCities.getRecords() != null) {
                                List<PostalCodesAndCitiesEntity> postalCodesAndCitiesEntities = codeBookMapper.postalCodesAndCitiesEntities(schemaPostalCodesAndCities.getRecords());
                                syncCodeBooksRepository.syncPostalCodesAndCities(postalCodesAndCitiesEntities);
                                paginationHelper.updateCounters(12, schemaPostalCodesAndCities.getNumOfRecords());
                            }

                            // 13. SALES_DOCUMENT_CONDITIONS
                            BaseRecordSchema<SalesDocumentConditionSchema> schemaSalesDocumentConditions = syncCodeBooksResponseSchema.getSalesDocumentConditions();
                            if (schemaSalesDocumentConditions != null && schemaSalesDocumentConditions.getRecords() != null) {
                                List<SalesDocumentConditionEntity> salesDocumentConditionEntities = codeBookMapper.salesDocumentConditionEntities(schemaSalesDocumentConditions.getRecords());
                                syncCodeBooksRepository.syncSalesDocumentCondition(salesDocumentConditionEntities);
                                paginationHelper.updateCounters(13, schemaSalesDocumentConditions.getNumOfRecords());
                            }

                            // 14. SALES_DOCUMENT_TYPES
                            BaseRecordSchema<SalesDocumentTypeSchema> schemaSalesDocumentTypes = syncCodeBooksResponseSchema.getSalesDocumentTypes();
                            if (schemaSalesDocumentTypes != null && schemaSalesDocumentTypes.getRecords() != null) {
                                List<SalesDocumentTypeEntity> salesDocumentTypeEntities = codeBookMapper.salesDocumentTypeEntities(schemaSalesDocumentTypes.getRecords());
                                syncCodeBooksRepository.syncSalesDocumentType(salesDocumentTypeEntities);
                                paginationHelper.updateCounters(14, schemaSalesDocumentTypes.getNumOfRecords());
                            }

                            // 15. SALES_PRICE_TYPES
                            BaseRecordSchema<SalesPriceTypeSchema> schemaSalesPriceTypes = syncCodeBooksResponseSchema.getSalesPriceTypes();
                            if (schemaSalesPriceTypes != null && schemaSalesPriceTypes.getRecords() != null) {
                                List<SalesPriceTypeEntity> salesPriceTypeEntities = codeBookMapper.salesPriceTypeEntities(schemaSalesPriceTypes.getRecords());
                                syncCodeBooksRepository.syncSalesPriceType(salesPriceTypeEntities);
                                paginationHelper.updateCounters(15, schemaSalesPriceTypes.getNumOfRecords());
                            }

                            // 16. SALES_TYPES
                            BaseRecordSchema<SalesTypeSchema> schemaSalesTypes = syncCodeBooksResponseSchema.getSalesTypes();
                            if (schemaSalesTypes != null && schemaSalesTypes.getRecords() != null) {
                                List<SalesTypeEntity> salesTypeEntities = codeBookMapper.salesTypeEntities(schemaSalesTypes.getRecords());
                                syncCodeBooksRepository.syncSalesType(salesTypeEntities);
                                paginationHelper.updateCounters(16, schemaSalesTypes.getNumOfRecords());
                            }

                            // 17. VISIT_SUB_RESULTS
                            BaseRecordSchema<VisitResultSchema> schemaVisitResults = syncCodeBooksResponseSchema.getVisitResults();
                            if (schemaVisitResults != null && schemaVisitResults.getRecords() != null) {
                                List<VisitSubResultEntity> visitSubResultEntities = codeBookMapper.visitSubResultEntities(schemaVisitResults.getRecords());
                                syncCodeBooksRepository.syncVisitSubResult(visitSubResultEntities);
                                paginationHelper.updateCounters(17, schemaVisitResults.getNumOfRecords());
                            }

                            // 18. WAREHOUSES
                            BaseRecordSchema<WarehouseSchema> schemaWarehouses = syncCodeBooksResponseSchema.getWarehouses();
                            if (schemaWarehouses != null && schemaWarehouses.getRecords() != null) {
                                List<WarehouseEntity> warehouseEntities = codeBookMapper.warehouseEntities(schemaWarehouses.getRecords());
                                syncCodeBooksRepository.syncWarehouse(warehouseEntities);
                                paginationHelper.updateCounters(18, schemaWarehouses.getNumOfRecords());
                            }

                            // 19. SL_DIRECTIONS
                            BaseRecordSchema<SLDirectionSchema> schemaSlDirections = syncCodeBooksResponseSchema.getsLDirections();
                            if (schemaSlDirections != null && schemaSlDirections.getRecords() != null) {
                                List<SalesLeaderDirectionEntity> salesLeaderDirectionEntities = codeBookMapper.salesLeaderDirectionEntities(schemaSlDirections.getRecords());
                                syncCodeBooksRepository.syncSalesLeaderDirection(salesLeaderDirectionEntities);
                                paginationHelper.updateCounters(19, schemaSlDirections.getNumOfRecords());
                            }

                            // 20. SL_SALES_LEVEL_TYPES
                            BaseRecordSchema<SLSalesLevelTypeSchema> schemaSlSalesLevelTypes = syncCodeBooksResponseSchema.getsLSalesLevelTypes();
                            if (schemaSlSalesLevelTypes != null && schemaSlSalesLevelTypes.getRecords() != null) {
                                List<SalesLeaderSalesLevelTypeEntity> salesLeaderSalesLevelTypeEntities = codeBookMapper.salesLeaderSalesLevelTypeEntities(schemaSlSalesLevelTypes.getRecords());
                                syncCodeBooksRepository.syncSalesLeaderSalesLevelType(salesLeaderSalesLevelTypeEntities);
                                paginationHelper.updateCounters(20, schemaSlSalesLevelTypes.getNumOfRecords());
                            }

                            // 21. SL_CUSTOMER_CARD_COLORS
                            BaseRecordSchema<SLCustomerCardColorSchema> schemaSlCustomerCardColors = syncCodeBooksResponseSchema.getsLCustomerCardColors();
                            if (schemaSlCustomerCardColors != null && schemaSlCustomerCardColors.getRecords() != null) {
                                List<SalesLeaderCustomerCardColorEntity> salesLeaderCustomerCardColorEntities = codeBookMapper.salesLeaderCustomerCardColorEntities(schemaSlCustomerCardColors.getRecords());
                                syncCodeBooksRepository.syncSalesLeaderCustomerCardColor(salesLeaderCustomerCardColorEntities);
                                paginationHelper.updateCounters(21, schemaSlCustomerCardColors.getNumOfRecords());
                            }

                            // 22. DOCUMENT_VERIFICATION_STATUSES
                            BaseRecordSchema<DocumentVerificationStatusSchema> schemaDocumentVerificationStatuses = syncCodeBooksResponseSchema.getDocumentVerificationStatuses();
                            if (schemaDocumentVerificationStatuses != null && schemaDocumentVerificationStatuses.getRecords() != null) {
                                List<DocumentVerificationStatusEntity> documentVerificationStatusEntities = codeBookMapper.documentVerificationStatusEntities(schemaDocumentVerificationStatuses.getRecords());
                                syncCodeBooksRepository.syncDocumentVerificationStatus(documentVerificationStatusEntities);
                                paginationHelper.updateCounters(22, schemaDocumentVerificationStatuses.getNumOfRecords());
                            }

                            // 23. ITEM_STATUSES
                            BaseRecordSchema<ItemStatusSchema> schemaItemStatuses = syncCodeBooksResponseSchema.getItemStatuses();
                            if (schemaItemStatuses != null && schemaItemStatuses.getRecords() != null) {
                                List<ItemStatusEntity> itemStatusEntities = codeBookMapper.itemStatusEntities(schemaItemStatuses.getRecords());
                                syncCodeBooksRepository.syncItemStatus(itemStatusEntities);
                                paginationHelper.updateCounters(23, schemaItemStatuses.getNumOfRecords());
                            }

                            // 24. USER_DEFINED_LISTS
                            BaseRecordSchema<CustomListSchema> schemaCustomLists = syncCodeBooksResponseSchema.getCustomLists();
                            if (schemaCustomLists != null && schemaCustomLists.getRecords() != null) {
                                List<UserDefinedListEntity> userDefinedListEntities = codeBookMapper.userDefinedListEntities(schemaCustomLists.getRecords());
                                syncCodeBooksRepository.syncUserDefinedList(userDefinedListEntities);
                                paginationHelper.updateCounters(24, schemaCustomLists.getNumOfRecords());
                            }

                            // 25. CREATED_DOCUMENT_STATUS
                            BaseRecordSchema<CreatedDocumentStatusSchema> schemaCreatedDocumentStatuses = syncCodeBooksResponseSchema.getCreatedDocumentStatuses();
                            if (schemaCreatedDocumentStatuses != null && schemaCreatedDocumentStatuses.getRecords() != null) {
                                List<CreatedDocumentStatusEntity> createdDocumentStatusEntities = codeBookMapper.createdDocumentStatusEntities(schemaCreatedDocumentStatuses.getRecords());
                                syncCodeBooksRepository.syncCreatedDocumentStatus(createdDocumentStatusEntities);
                                paginationHelper.updateCounters(25, schemaCreatedDocumentStatuses.getNumOfRecords());
                            }

                            // 26. TRANSACTION_TYPES
                            BaseRecordSchema<TransactionTypeSchema> schemaTransactionTypes = syncCodeBooksResponseSchema.getTransactionTypes();
                            if (schemaTransactionTypes != null && schemaTransactionTypes.getRecords() != null) {
                                List<TransactionTypeEntity> transactionTypeEntities = codeBookMapper.transactionTypeEntities(schemaTransactionTypes.getRecords());
                                syncCodeBooksRepository.syncTransactionType(transactionTypeEntities);
                                paginationHelper.updateCounters(26, schemaTransactionTypes.getNumOfRecords());
                            }

                            // 27. SERVICE_ORDERS_STATUS
                            BaseRecordSchema<ServiceOrderStatusSchema> schemaServiceOrderStatuses = syncCodeBooksResponseSchema.getServiceOrderStatuses();
                            if (schemaServiceOrderStatuses != null && schemaServiceOrderStatuses.getRecords() != null) {
                                List<ServiceOrdersStatusEntity> serviceOrdersStatusEntities = codeBookMapper.serviceOrdersStatusEntities(schemaServiceOrderStatuses.getRecords());
                                syncCodeBooksRepository.syncServiceOrderStatus(serviceOrdersStatusEntities);
                                paginationHelper.updateCounters(27, schemaServiceOrderStatuses.getNumOfRecords());
                            }

                            // 28. SERVICE_CLASSIFICATION
                            BaseRecordSchema<ServiceClassificationSchema> schemaServiceClassification = syncCodeBooksResponseSchema.getServiceClassification();
                            if (schemaServiceClassification != null && schemaServiceClassification.getRecords() != null) {
                                List<ServiceClassificationEntity> serviceClassificationEntities = codeBookMapper.serviceClassificationEntities(schemaServiceClassification.getRecords());
                                syncCodeBooksRepository.syncServiceClassification(serviceClassificationEntities);
                                paginationHelper.updateCounters(28, schemaServiceClassification.getNumOfRecords());
                            }

                            // 29. SERVICE_CLASSIFICATION_TYPES
                            BaseRecordSchema<ServiceClassificationTypesSchema> schemaServiceClassificationTypes = syncCodeBooksResponseSchema.getServiceClassificationTypes();
                            if (schemaServiceClassificationTypes != null && schemaServiceClassificationTypes.getRecords() != null) {
                                List<ServiceClassificationTypeEntity> serviceClassificationTypeEntities = codeBookMapper.serviceClassificationTypeEntities(schemaServiceClassificationTypes.getRecords());
                                syncCodeBooksRepository.syncServiceClassificationType(serviceClassificationTypeEntities);
                                paginationHelper.updateCounters(29, schemaServiceClassificationTypes.getNumOfRecords());
                            }

                            // 30. USERS
                            BaseRecordSchema<UserSchema> schemaUsers = syncCodeBooksResponseSchema.getUsersSchema();
                            if (schemaUsers != null && schemaUsers.getRecords() != null) {
                                List<UserEntity> userEntities = codeBookMapper.userEntities(schemaUsers.getRecords());
                                syncCodeBooksRepository.syncUser(userEntities);
                                paginationHelper.updateCounters(30, schemaUsers.getNumOfRecords());
                            }

                            // 31. GROUP_OF_CUSTOMERS_CATEGORY_ITEMS
                            BaseRecordSchema<GroupOfCustomersCategoryItemSchema> schemaGroupOfCustomersCategoryItemsSchema = syncCodeBooksResponseSchema.getGroupOfCustomersCategoryItemsSchema();
                            if (schemaGroupOfCustomersCategoryItemsSchema != null && schemaGroupOfCustomersCategoryItemsSchema.getRecords() != null) {
                                List<GroupOfCustomersCategoryItemsEntity> groupOfCustomersCategoryItemsEntities = codeBookMapper.groupOfCustomersCategoryItemsEntities(schemaGroupOfCustomersCategoryItemsSchema.getRecords());
                                syncCodeBooksRepository.syncGroupOfCustomersCategoryItems(groupOfCustomersCategoryItemsEntities);
                                paginationHelper.updateCounters(31, schemaGroupOfCustomersCategoryItemsSchema.getNumOfRecords());
                            }

                            // 32. CUSTOM_LISTS_HEADERS
                            BaseRecordSchema<CustomListsHeaderSchema> schemaCustomListsHeaders = syncCodeBooksResponseSchema.getCustomListsHeaderSchema();
                            if (schemaCustomListsHeaders != null && schemaCustomListsHeaders.getRecords() != null) {
                                List<CustomListsHeaderEntity> customListsHeaderEntities = codeBookMapper.customListsHeaderEntities(schemaCustomListsHeaders.getRecords());
                                syncCodeBooksRepository.syncCustomListsHeader(customListsHeaderEntities);
                                paginationHelper.updateCounters(32, schemaCustomListsHeaders.getNumOfRecords());
                            }

                            // 33. MUNICIPALITIES
                            BaseRecordSchema<MunicipalitySchema> schemaMunicipalities = syncCodeBooksResponseSchema.getMunicipalities();
                            if (schemaMunicipalities != null && schemaMunicipalities.getRecords() != null) {
                                List<MunicipalityEntity> municipalityEntities = codeBookMapper.municipalityEntities(schemaMunicipalities.getRecords());
                                syncCodeBooksRepository.syncMunicipality(municipalityEntities);
                                paginationHelper.updateCounters(33, schemaMunicipalities.getNumOfRecords());
                            }

                            // 34. COMMENTS_SOURCES
                            BaseRecordSchema<CommentsSourceSchema> schemaCommentsSources = syncCodeBooksResponseSchema.getCommentsSources();
                            if (schemaCommentsSources != null && schemaCommentsSources.getRecords() != null) {
                                List<CommentSourcesEntity> commentSourcesEntities = codeBookMapper.commentSourcesEntities(schemaCommentsSources.getRecords());
                                syncCodeBooksRepository.syncCommentSources(commentSourcesEntities);
                                paginationHelper.updateCounters(34, schemaCommentsSources.getNumOfRecords());
                            }

                            // 35. COMMENTS_TARGETS
                            BaseRecordSchema<CommentsTargetSchema> schemaCommentsTargets = syncCodeBooksResponseSchema.getCommentsTargets();
                            if (schemaCommentsTargets != null && schemaCommentsTargets.getRecords() != null) {
                                List<CommentTargetsEntity> commentTargetsEntities = codeBookMapper.commentTargetsEntities(schemaCommentsTargets.getRecords());
                                syncCodeBooksRepository.syncCommentTargets(commentTargetsEntities);
                                paginationHelper.updateCounters(35, schemaCommentsTargets.getNumOfRecords());
                            }
                        }
                    } else {

                        return Result.failure();
                    }
                } else {

                    return Result.failure();
                }
            } catch (Exception e) {

                return Result.failure();
            }
        }

        return Result.success();
    }

    private void inject() {
        DaggerWorkComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncCodeBooksWork(this);
    }
}
