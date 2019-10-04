package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.ApprovalStatusDao;
import com.intelisale.database.dao.BackOrderShipmentDao;
import com.intelisale.database.dao.CategoryOfItemsDao;
import com.intelisale.database.dao.CommentSourcesDao;
import com.intelisale.database.dao.CommentTargetsDao;
import com.intelisale.database.dao.ContactDepartmentDao;
import com.intelisale.database.dao.ContactPositionDao;
import com.intelisale.database.dao.CreatedDocumentStatusDao;
import com.intelisale.database.dao.CustomListsHeaderDao;
import com.intelisale.database.dao.CustomerPaymentConditionDao;
import com.intelisale.database.dao.CustomerPaymentMethodDao;
import com.intelisale.database.dao.CustomerShipmentMethodDao;
import com.intelisale.database.dao.DocumentTypeDao;
import com.intelisale.database.dao.DocumentVerificationStatusDao;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.GroupOfCustomersCategoryItemsDao;
import com.intelisale.database.dao.GroupOfCustomersDao;
import com.intelisale.database.dao.ItemStatusDao;
import com.intelisale.database.dao.ItemUnitOfMeasureDao;
import com.intelisale.database.dao.MunicipalityDao;
import com.intelisale.database.dao.PostalCodesAndCitiesDao;
import com.intelisale.database.dao.SalesDocumentConditionDao;
import com.intelisale.database.dao.SalesDocumentTypeDao;
import com.intelisale.database.dao.SalesLeaderCustomerCardColorDao;
import com.intelisale.database.dao.SalesLeaderDirectionDao;
import com.intelisale.database.dao.SalesLeaderSalesLevelTypeDao;
import com.intelisale.database.dao.SalesPriceTypeDao;
import com.intelisale.database.dao.SalesTypeDao;
import com.intelisale.database.dao.ServiceClassificationDao;
import com.intelisale.database.dao.ServiceClassificationTypeDao;
import com.intelisale.database.dao.ServiceOrdersStatusDao;
import com.intelisale.database.dao.StockAvailabilityStatusDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.dao.TransactionTypeDao;
import com.intelisale.database.dao.UserDao;
import com.intelisale.database.dao.UserDefinedListDao;
import com.intelisale.database.dao.VisitSubResultDao;
import com.intelisale.database.dao.WarehouseDao;
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

import java.util.List;

public class SyncCodeBooksRepository extends SyncRepository {

    private final ApprovalStatusDao approvalStatusDao;
    private final StockAvailabilityStatusDao stockAvailabilityStatusDao;
    private final BackOrderShipmentDao backOrderShipmentDao;
    private final CategoryOfItemsDao categoryOfItemsDao;
    private final ContactDepartmentDao contactDepartmentDao;
    private final ContactPositionDao contactPositionDao;
    private final CustomerPaymentMethodDao customerPaymentMethodDao;
    private final CustomerPaymentConditionDao customerPaymentConditionDao;
    private final CustomerShipmentMethodDao customerShipmentMethodDao;
    private final DocumentTypeDao documentTypeDao;
    private final GroupOfCustomersDao groupOfCustomersDao;
    private final ItemUnitOfMeasureDao itemUnitOfMeasureDao;
    private final PostalCodesAndCitiesDao postalCodesAndCitiesDao;
    private final SalesDocumentConditionDao salesDocumentConditionDao;
    private final SalesDocumentTypeDao salesDocumentTypeDao;
    private final SalesPriceTypeDao salesPriceTypeDao;
    private final SalesTypeDao salesTypeDao;
    private final VisitSubResultDao visitSubResultDao;
    private final WarehouseDao warehouseDao;
    private final SalesLeaderDirectionDao salesLeaderDirectionDao;
    private final SalesLeaderSalesLevelTypeDao salesLeaderSalesLevelTypeDao;
    private final SalesLeaderCustomerCardColorDao salesLeaderCustomerCardColorDao;
    private final DocumentVerificationStatusDao documentVerificationStatusDao;
    private final ItemStatusDao itemStatusDao;
    private final UserDefinedListDao userDefinedListDao;
    private final CreatedDocumentStatusDao createdDocumentStatusDao;
    private final TransactionTypeDao transactionTypeDao;
    private final ServiceOrdersStatusDao serviceOrdersStatusDao;
    private final ServiceClassificationDao serviceClassificationDao;
    private final ServiceClassificationTypeDao serviceClassificationTypeDao;
    private final UserDao userDao;
    private final GroupOfCustomersCategoryItemsDao groupOfCustomersCategoryItemsDao;
    private final CustomListsHeaderDao customListsHeaderDao;
    private final MunicipalityDao municipalityDao;
    private final CommentSourcesDao commentSourcesDao;
    private final CommentTargetsDao commentTargetsDao;

    public SyncCodeBooksRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, ApprovalStatusDao approvalStatusDao, StockAvailabilityStatusDao stockAvailabilityStatusDao, BackOrderShipmentDao backOrderShipmentDao, CategoryOfItemsDao categoryOfItemsDao, ContactDepartmentDao contactDepartmentDao, ContactPositionDao contactPositionDao, CustomerPaymentMethodDao customerPaymentMethodDao, CustomerPaymentConditionDao customerPaymentConditionDao, CustomerShipmentMethodDao customerShipmentMethodDao, DocumentTypeDao documentTypeDao, GroupOfCustomersDao groupOfCustomersDao, ItemUnitOfMeasureDao itemUnitOfMeasureDao, PostalCodesAndCitiesDao postalCodesAndCitiesDao, SalesDocumentConditionDao salesDocumentConditionDao, SalesDocumentTypeDao salesDocumentTypeDao, SalesPriceTypeDao salesPriceTypeDao, SalesTypeDao salesTypeDao, VisitSubResultDao visitSubResultDao, WarehouseDao warehouseDao, SalesLeaderDirectionDao salesLeaderDirectionDao, SalesLeaderSalesLevelTypeDao salesLeaderSalesLevelTypeDao, SalesLeaderCustomerCardColorDao salesLeaderCustomerCardColorDao, DocumentVerificationStatusDao documentVerificationStatusDao, ItemStatusDao itemStatusDao, UserDefinedListDao userDefinedListDao, CreatedDocumentStatusDao createdDocumentStatusDao, TransactionTypeDao transactionTypeDao, ServiceOrdersStatusDao serviceOrdersStatusDao, ServiceClassificationDao serviceClassificationDao, ServiceClassificationTypeDao serviceClassificationTypeDao, UserDao userDao, GroupOfCustomersCategoryItemsDao groupOfCustomersCategoryItemsDao, CustomListsHeaderDao customListsHeaderDao, MunicipalityDao municipalityDao, CommentSourcesDao commentSourcesDao, CommentTargetsDao commentTargetsDao) {
        super(globalDao, syncStatusDao, TableNames.CODEBOOKS);

        this.approvalStatusDao = approvalStatusDao;
        this.stockAvailabilityStatusDao = stockAvailabilityStatusDao;
        this.backOrderShipmentDao = backOrderShipmentDao;
        this.categoryOfItemsDao = categoryOfItemsDao;
        this.contactDepartmentDao = contactDepartmentDao;
        this.contactPositionDao = contactPositionDao;
        this.customerPaymentMethodDao = customerPaymentMethodDao;
        this.customerPaymentConditionDao = customerPaymentConditionDao;
        this.customerShipmentMethodDao = customerShipmentMethodDao;
        this.documentTypeDao = documentTypeDao;
        this.groupOfCustomersDao = groupOfCustomersDao;
        this.itemUnitOfMeasureDao = itemUnitOfMeasureDao;
        this.postalCodesAndCitiesDao = postalCodesAndCitiesDao;
        this.salesDocumentConditionDao = salesDocumentConditionDao;
        this.salesDocumentTypeDao = salesDocumentTypeDao;
        this.salesPriceTypeDao = salesPriceTypeDao;
        this.salesTypeDao = salesTypeDao;
        this.visitSubResultDao = visitSubResultDao;
        this.warehouseDao = warehouseDao;
        this.salesLeaderDirectionDao = salesLeaderDirectionDao;
        this.salesLeaderSalesLevelTypeDao = salesLeaderSalesLevelTypeDao;
        this.salesLeaderCustomerCardColorDao = salesLeaderCustomerCardColorDao;
        this.documentVerificationStatusDao = documentVerificationStatusDao;
        this.itemStatusDao = itemStatusDao;
        this.userDefinedListDao = userDefinedListDao;
        this.createdDocumentStatusDao = createdDocumentStatusDao;
        this.transactionTypeDao = transactionTypeDao;
        this.serviceOrdersStatusDao = serviceOrdersStatusDao;
        this.serviceClassificationDao = serviceClassificationDao;
        this.serviceClassificationTypeDao = serviceClassificationTypeDao;
        this.userDao = userDao;
        this.groupOfCustomersCategoryItemsDao = groupOfCustomersCategoryItemsDao;
        this.customListsHeaderDao = customListsHeaderDao;
        this.municipalityDao = municipalityDao;
        this.commentSourcesDao = commentSourcesDao;
        this.commentTargetsDao = commentTargetsDao;
    }

    public void syncApprovalStatus(List<ApprovalStatusEntity> entityList) {
        approvalStatusDao.insertOrUpdate(entityList, TableNames.APPROVAL_STATUSES);
    }

    public void syncStockAvailabilityStatus(List<StockAvailabilityStatusEntity> entityList) {
        stockAvailabilityStatusDao.insertOrUpdate(entityList, TableNames.STOCK_AVAILABILITY_STATUSES);
    }

    public void syncBackOrderShipment(List<BackOrderShipmentEntity> entityList) {
        backOrderShipmentDao.insertOrUpdate(entityList, TableNames.BACK_ORDER_SHIPMENT_STATUSES);
    }

    public void syncCategoryOfItems(List<CategoryOfItemsEntity> entityList) {
        categoryOfItemsDao.insertOrUpdate(entityList, TableNames.CATEGORIES_OF_ITEMS);
    }

    public void syncContactDepartment(List<ContactDepartmentEntity> entityList) {
        contactDepartmentDao.insertOrUpdate(entityList, TableNames.CONTACTS_DEPARTMENTS);
    }

    public void syncContactPosition(List<ContactPositionEntity> entityList) {
        contactPositionDao.insertOrUpdate(entityList, TableNames.CONTACTS_POSITIONS);
    }

    public void syncCustomerPaymentMethod(List<CustomerPaymentMethodEntity> entityList) {
        customerPaymentMethodDao.insertOrUpdate(entityList, TableNames.CUSTOMER_PAYMENT_METHODS);
    }

    public void syncCustomerPaymentCondition(List<CustomerPaymentConditionEntity> entityList) {
        customerPaymentConditionDao.insertOrUpdate(entityList, TableNames.CUSTOMER_PAYMENT_CONDITIONS);
    }

    public void syncCustomerShipmentMethod(List<CustomerShipmentMethodEntity> entityList) {
        customerShipmentMethodDao.insertOrUpdate(entityList, TableNames.CUSTOMER_SHIPMENT_METHODS);
    }

    public void syncDocumentType(List<DocumentTypeEntity> entityList) {
        documentTypeDao.insertOrUpdate(entityList, TableNames.DOCUMENT_TYPES);
    }

    public void syncGroupOfCustomers(List<GroupOfCustomersEntity> entityList) {
        groupOfCustomersDao.insertOrUpdate(entityList, TableNames.GROUPS_OF_CUSTOMERS);
    }

    public void syncItemUnitOfMeasure(List<ItemUnitOfMeasureEntity> entityList) {
        itemUnitOfMeasureDao.insertOrUpdate(entityList, TableNames.ITEM_UNIT_OF_MEASURES);
    }

    public void syncPostalCodesAndCities(List<PostalCodesAndCitiesEntity> entityList) {
        postalCodesAndCitiesDao.insertOrUpdate(entityList, TableNames.POSTAL_CODES_AND_CITIES);
    }

    public void syncSalesDocumentCondition(List<SalesDocumentConditionEntity> entityList) {
        salesDocumentConditionDao.insertOrUpdate(entityList, TableNames.SALES_DOCUMENT_CONDITIONS);
    }

    public void syncSalesDocumentType(List<SalesDocumentTypeEntity> entityList) {
        salesDocumentTypeDao.insertOrUpdate(entityList, TableNames.SALES_DOCUMENT_TYPES);
    }

    public void syncSalesPriceType(List<SalesPriceTypeEntity> entityList) {
        salesPriceTypeDao.insertOrUpdate(entityList, TableNames.SALES_PRICE_TYPES);
    }

    public void syncSalesType(List<SalesTypeEntity> entityList) {
        salesTypeDao.insertOrUpdate(entityList, TableNames.SALES_TYPES);
    }

    public void syncVisitSubResult(List<VisitSubResultEntity> entityList) {
        visitSubResultDao.insertOrUpdate(entityList, TableNames.VISIT_SUB_RESULTS);
    }

    public void syncWarehouse(List<WarehouseEntity> entityList) {
        warehouseDao.insertOrUpdate(entityList, TableNames.WAREHOUSES);
    }

    public void syncSalesLeaderDirection(List<SalesLeaderDirectionEntity> entityList) {
        salesLeaderDirectionDao.insertOrUpdate(entityList, TableNames.SL_DIRECTIONS);
    }

    public void syncSalesLeaderSalesLevelType(List<SalesLeaderSalesLevelTypeEntity> entityList) {
        salesLeaderSalesLevelTypeDao.insertOrUpdate(entityList, TableNames.SL_SALES_LEVEL_TYPES);
    }

    public void syncSalesLeaderCustomerCardColor(List<SalesLeaderCustomerCardColorEntity> entityList) {
        salesLeaderCustomerCardColorDao.insertOrUpdate(entityList, TableNames.SL_CUSTOMER_CARD_COLORS);
    }

    public void syncDocumentVerificationStatus(List<DocumentVerificationStatusEntity> entityList) {
        documentVerificationStatusDao.insertOrUpdate(entityList, TableNames.DOCUMENT_VERIFICATION_STATUSES);
    }

    public void syncItemStatus(List<ItemStatusEntity> entityList) {
        itemStatusDao.insertOrUpdate(entityList, TableNames.ITEM_STATUSES);
    }

    public void syncUserDefinedList(List<UserDefinedListEntity> entityList) {
        userDefinedListDao.insertOrUpdate(entityList, TableNames.USER_DEFINED_LISTS);
    }

    public void syncCreatedDocumentStatus(List<CreatedDocumentStatusEntity> entityList) {
        createdDocumentStatusDao.insertOrUpdate(entityList, TableNames.CREATED_DOCUMENT_STATUS);
    }

    public void syncTransactionType(List<TransactionTypeEntity> entityList) {
        transactionTypeDao.insertOrUpdate(entityList, TableNames.TRANSACTION_TYPES);
    }

    public void syncServiceOrderStatus(List<ServiceOrdersStatusEntity> entityList) {
        serviceOrdersStatusDao.insertOrUpdate(entityList, TableNames.SERVICE_ORDERS_STATUS);
    }

    public void syncServiceClassification(List<ServiceClassificationEntity> entityList) {
        serviceClassificationDao.insertOrUpdate(entityList, TableNames.SERVICE_CLASSIFICATION);
    }

    public void syncServiceClassificationType(List<ServiceClassificationTypeEntity> entityList) {
        serviceClassificationTypeDao.insertOrUpdate(entityList, TableNames.SERVICE_CLASSIFICATION_TYPES);
    }

    public void syncUser(List<UserEntity> entityList) {
        userDao.insertOrUpdate(entityList, TableNames.USERS);
    }

    public void syncGroupOfCustomersCategoryItems(List<GroupOfCustomersCategoryItemsEntity> entityList) {
        groupOfCustomersCategoryItemsDao.insertOrUpdate(entityList, TableNames.GROUP_OF_CUSTOMERS_CATEGORY_ITEMS);
    }

    public void syncCustomListsHeader(List<CustomListsHeaderEntity> entityList) {
        customListsHeaderDao.insertOrUpdate(entityList, TableNames.CUSTOM_LISTS_HEADERS);
    }

    public void syncMunicipality(List<MunicipalityEntity> entityList) {
        municipalityDao.insertOrUpdate(entityList, TableNames.MUNICIPALITIES);
    }

    public void syncCommentSources(List<CommentSourcesEntity> entityList) {
        commentSourcesDao.insertOrUpdate(entityList, TableNames.COMMENTS_SOURCES);
    }

    public void syncCommentTargets(List<CommentTargetsEntity> entityList) {
        commentTargetsDao.insertOrUpdate(entityList, TableNames.COMMENTS_TARGETS);
    }
}
