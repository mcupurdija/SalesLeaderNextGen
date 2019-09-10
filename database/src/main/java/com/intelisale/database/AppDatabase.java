package com.intelisale.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.intelisale.database.dao.ApprovalStatusDao;
import com.intelisale.database.dao.BackOrderShipmentDao;
import com.intelisale.database.dao.CategoryOfItemsDao;
import com.intelisale.database.dao.CommentDao;
import com.intelisale.database.dao.CommentGalleryDao;
import com.intelisale.database.dao.CommentSourcesDao;
import com.intelisale.database.dao.CommentTargetsDao;
import com.intelisale.database.dao.CompanyDao;
import com.intelisale.database.dao.ContactDao;
import com.intelisale.database.dao.ContactDepartmentDao;
import com.intelisale.database.dao.ContactPositionDao;
import com.intelisale.database.dao.CreatedDocumentStatusDao;
import com.intelisale.database.dao.CustomListsHeaderDao;
import com.intelisale.database.dao.CustomListsLineDao;
import com.intelisale.database.dao.CustomerCustomListDao;
import com.intelisale.database.dao.CustomerDao;
import com.intelisale.database.dao.CustomerFrequenciesDao;
import com.intelisale.database.dao.CustomerPaymentConditionDao;
import com.intelisale.database.dao.CustomerPaymentMethodDao;
import com.intelisale.database.dao.CustomerPlanTurnoverDao;
import com.intelisale.database.dao.CustomerProcessDao;
import com.intelisale.database.dao.CustomerProductGroupPotentialDao;
import com.intelisale.database.dao.CustomerShipToAddressesDao;
import com.intelisale.database.dao.CustomerShipmentMethodDao;
import com.intelisale.database.dao.CustomerStatisticsDao;
import com.intelisale.database.dao.CustomerVisitsDao;
import com.intelisale.database.dao.DocumentTypeDao;
import com.intelisale.database.dao.DocumentVerificationStatusDao;
import com.intelisale.database.dao.FinancialEntityDao;
import com.intelisale.database.dao.GalleryDao;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.GroupOfCustomersCategoryItemsDao;
import com.intelisale.database.dao.GroupOfCustomersDao;
import com.intelisale.database.dao.ItemAllowedToCustomerDao;
import com.intelisale.database.dao.ItemAllowedToCustomerTmpDao;
import com.intelisale.database.dao.ItemConnectionsDao;
import com.intelisale.database.dao.ItemDao;
import com.intelisale.database.dao.ItemPackagesDao;
import com.intelisale.database.dao.ItemQuantitativeElaborationDao;
import com.intelisale.database.dao.ItemSaleHistoryDao;
import com.intelisale.database.dao.ItemStatusDao;
import com.intelisale.database.dao.ItemUnitOfMeasureDao;
import com.intelisale.database.dao.MunicipalityDao;
import com.intelisale.database.dao.NoteAttachmentsDao;
import com.intelisale.database.dao.NoteDao;
import com.intelisale.database.dao.NoteTargetGroupsDao;
import com.intelisale.database.dao.NoteTargetTypesDao;
import com.intelisale.database.dao.PostalCodesAndCitiesDao;
import com.intelisale.database.dao.SaleOrderHeaderDao;
import com.intelisale.database.dao.SaleOrderLineDao;
import com.intelisale.database.dao.SalesDocumentConditionDao;
import com.intelisale.database.dao.SalesDocumentTypeDao;
import com.intelisale.database.dao.SalesLeaderCategoryAllowedToCustomerDao;
import com.intelisale.database.dao.SalesLeaderCategoryAllowedToCustomerTmpDao;
import com.intelisale.database.dao.SalesLeaderCustomerCardColorDao;
import com.intelisale.database.dao.SalesLeaderDirectionDao;
import com.intelisale.database.dao.SalesLeaderItemCustomersCardDao;
import com.intelisale.database.dao.SalesLeaderItemCustomersCardIcoDao;
import com.intelisale.database.dao.SalesLeaderItemPerProcessesPerCustomersDao;
import com.intelisale.database.dao.SalesLeaderItemPerShelvesPerCustomersDao;
import com.intelisale.database.dao.SalesLeaderItemSoldToCustomerMonthlyDao;
import com.intelisale.database.dao.SalesLeaderItemSoldToCustomerMonthlyTmpDao;
import com.intelisale.database.dao.SalesLeaderItemToBringDao;
import com.intelisale.database.dao.SalesLeaderNewItemCustomersCardDao;
import com.intelisale.database.dao.SalesLeaderSalesLevelTypeDao;
import com.intelisale.database.dao.SalesLeaderShelvePerCustomersDao;
import com.intelisale.database.dao.SalesPriceTypeDao;
import com.intelisale.database.dao.SalesTypeDao;
import com.intelisale.database.dao.ServiceClassificationDao;
import com.intelisale.database.dao.ServiceClassificationTypeDao;
import com.intelisale.database.dao.ServiceOrderDao;
import com.intelisale.database.dao.ServiceOrdersStatusDao;
import com.intelisale.database.dao.SettingDao;
import com.intelisale.database.dao.StockAvailabilityStatusDao;
import com.intelisale.database.dao.StockInventoryHeaderDao;
import com.intelisale.database.dao.StockInventoryLineDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.dao.TagDao;
import com.intelisale.database.dao.TransactionTypeDao;
import com.intelisale.database.dao.UserDao;
import com.intelisale.database.dao.UserDefinedListDao;
import com.intelisale.database.dao.VATGroupDao;
import com.intelisale.database.dao.VisitDao;
import com.intelisale.database.dao.VisitSubResultDao;
import com.intelisale.database.dao.WarehouseDao;
import com.intelisale.database.entity.ApprovalStatusEntity;
import com.intelisale.database.entity.BackOrderShipmentEntity;
import com.intelisale.database.entity.CategoryOfItemsEntity;
import com.intelisale.database.entity.CommentEntity;
import com.intelisale.database.entity.CommentGalleryEntity;
import com.intelisale.database.entity.CommentSourcesEntity;
import com.intelisale.database.entity.CommentTargetsEntity;
import com.intelisale.database.entity.CompanyEntity;
import com.intelisale.database.entity.ContactDepartmentEntity;
import com.intelisale.database.entity.ContactEntity;
import com.intelisale.database.entity.ContactPositionEntity;
import com.intelisale.database.entity.CreatedDocumentStatusEntity;
import com.intelisale.database.entity.CustomListsHeaderEntity;
import com.intelisale.database.entity.CustomListsLineEntity;
import com.intelisale.database.entity.CustomerCustomListEntity;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.entity.CustomerFrequenciesEntity;
import com.intelisale.database.entity.CustomerPaymentConditionEntity;
import com.intelisale.database.entity.CustomerPaymentMethodEntity;
import com.intelisale.database.entity.CustomerPlanTurnoverEntity;
import com.intelisale.database.entity.CustomerProcessEntity;
import com.intelisale.database.entity.CustomerProductGroupPotentialEntity;
import com.intelisale.database.entity.CustomerShipToAddressesEntity;
import com.intelisale.database.entity.CustomerShipmentMethodEntity;
import com.intelisale.database.entity.CustomerStatisticsEntity;
import com.intelisale.database.entity.CustomerVisitsEntity;
import com.intelisale.database.entity.DocumentTypeEntity;
import com.intelisale.database.entity.DocumentVerificationStatusEntity;
import com.intelisale.database.entity.FinancialEntityEntity;
import com.intelisale.database.entity.GalleryEntity;
import com.intelisale.database.entity.GroupOfCustomersCategoryItemsEntity;
import com.intelisale.database.entity.GroupOfCustomersEntity;
import com.intelisale.database.entity.ItemAllowedToCustomerEntity;
import com.intelisale.database.entity.ItemAllowedToCustomerTmpEntity;
import com.intelisale.database.entity.ItemConnectionsEntity;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.entity.ItemPackagesEntity;
import com.intelisale.database.entity.ItemQuantitativeElaborationEntity;
import com.intelisale.database.entity.ItemSaleHistoryEntity;
import com.intelisale.database.entity.ItemStatusEntity;
import com.intelisale.database.entity.ItemUnitOfMeasureEntity;
import com.intelisale.database.entity.MunicipalityEntity;
import com.intelisale.database.entity.NoteAttachmentsEntity;
import com.intelisale.database.entity.NoteEntity;
import com.intelisale.database.entity.NoteTargetGroupsEntity;
import com.intelisale.database.entity.NoteTargetTypesEntity;
import com.intelisale.database.entity.PostalCodesAndCitiesEntity;
import com.intelisale.database.entity.SaleOrderHeaderEntity;
import com.intelisale.database.entity.SaleOrderLineEntity;
import com.intelisale.database.entity.SalesDocumentConditionEntity;
import com.intelisale.database.entity.SalesDocumentTypeEntity;
import com.intelisale.database.entity.SalesLeaderCategoryAllowedToCustomerEntity;
import com.intelisale.database.entity.SalesLeaderCategoryAllowedToCustomerTmpEntity;
import com.intelisale.database.entity.SalesLeaderCustomerCardColorEntity;
import com.intelisale.database.entity.SalesLeaderDirectionEntity;
import com.intelisale.database.entity.SalesLeaderItemCustomersCardEntity;
import com.intelisale.database.entity.SalesLeaderItemCustomersCardIcoEntity;
import com.intelisale.database.entity.SalesLeaderItemPerProcessesPerCustomersEntity;
import com.intelisale.database.entity.SalesLeaderItemPerShelvesPerCustomersEntity;
import com.intelisale.database.entity.SalesLeaderItemSoldToCustomerMonthlyEntity;
import com.intelisale.database.entity.SalesLeaderItemSoldToCustomerMonthlyTmpEntity;
import com.intelisale.database.entity.SalesLeaderItemToBringEntity;
import com.intelisale.database.entity.SalesLeaderNewItemCustomersCardEntity;
import com.intelisale.database.entity.SalesLeaderSalesLevelTypeEntity;
import com.intelisale.database.entity.SalesLeaderShelvePerCustomersEntity;
import com.intelisale.database.entity.SalesPriceTypeEntity;
import com.intelisale.database.entity.SalesTypeEntity;
import com.intelisale.database.entity.ServiceClassificationEntity;
import com.intelisale.database.entity.ServiceClassificationTypeEntity;
import com.intelisale.database.entity.ServiceOrderEntity;
import com.intelisale.database.entity.ServiceOrdersStatusEntity;
import com.intelisale.database.entity.SettingEntity;
import com.intelisale.database.entity.StockAvailabilityStatusEntity;
import com.intelisale.database.entity.StockInventoryHeaderEntity;
import com.intelisale.database.entity.StockInventoryLineEntity;
import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.database.entity.TagEntity;
import com.intelisale.database.entity.TransactionTypeEntity;
import com.intelisale.database.entity.UserDefinedListEntity;
import com.intelisale.database.entity.UserEntity;
import com.intelisale.database.entity.VATGroupEntity;
import com.intelisale.database.entity.VisitEntity;
import com.intelisale.database.entity.VisitSubResultEntity;
import com.intelisale.database.entity.WarehouseEntity;

@Database(entities = {ApprovalStatusEntity.class,
        BackOrderShipmentEntity.class,
        CategoryOfItemsEntity.class,
        CommentEntity.class,
        CommentGalleryEntity.class,
        CommentSourcesEntity.class,
        CommentTargetsEntity.class,
        CompanyEntity.class,
        ContactDepartmentEntity.class,
        ContactEntity.class,
        ContactPositionEntity.class,
        CreatedDocumentStatusEntity.class,
        CustomerCustomListEntity.class,
        CustomerEntity.class,
        CustomerPaymentConditionEntity.class,
        CustomerPaymentMethodEntity.class,
        CustomerPlanTurnoverEntity.class,
        CustomerProcessEntity.class,
        CustomerProductGroupPotentialEntity.class,
        CustomerShipmentMethodEntity.class,
        CustomerShipToAddressesEntity.class,
        CustomerStatisticsEntity.class,
        CustomerFrequenciesEntity.class,
        CustomerVisitsEntity.class,
        CustomListsHeaderEntity.class,
        CustomListsLineEntity.class,
        DocumentTypeEntity.class,
        DocumentVerificationStatusEntity.class,
        FinancialEntityEntity.class,
        GalleryEntity.class,
        GroupOfCustomersCategoryItemsEntity.class,
        GroupOfCustomersEntity.class,
        ItemEntity.class,
        ItemQuantitativeElaborationEntity.class,
        ItemSaleHistoryEntity.class,
        ItemStatusEntity.class,
        ItemUnitOfMeasureEntity.class,
        MunicipalityEntity.class,
        NoteAttachmentsEntity.class,
        NoteEntity.class,
        NoteTargetGroupsEntity.class,
        NoteTargetTypesEntity.class,
        PostalCodesAndCitiesEntity.class,
        SaleOrderHeaderEntity.class,
        SaleOrderLineEntity.class,
        SalesDocumentConditionEntity.class,
        SalesDocumentTypeEntity.class,
        SalesLeaderCategoryAllowedToCustomerEntity.class,
        SalesLeaderCategoryAllowedToCustomerTmpEntity.class,
        SalesLeaderCustomerCardColorEntity.class,
        SalesLeaderDirectionEntity.class,
        ItemAllowedToCustomerEntity.class,
        ItemAllowedToCustomerTmpEntity.class,
        ItemConnectionsEntity.class,
        SalesLeaderItemCustomersCardEntity.class,
        SalesLeaderItemCustomersCardIcoEntity.class,
        ItemPackagesEntity.class,
        SalesLeaderItemPerProcessesPerCustomersEntity.class,
        SalesLeaderItemPerShelvesPerCustomersEntity.class,
        SalesLeaderItemSoldToCustomerMonthlyEntity.class,
        SalesLeaderItemSoldToCustomerMonthlyTmpEntity.class,
        SalesLeaderItemToBringEntity.class,
        SalesLeaderNewItemCustomersCardEntity.class,
        SalesLeaderSalesLevelTypeEntity.class,
        SalesLeaderShelvePerCustomersEntity.class,
        SalesPriceTypeEntity.class,
        SalesTypeEntity.class,
        ServiceClassificationEntity.class,
        ServiceClassificationTypeEntity.class,
        ServiceOrderEntity.class,
        ServiceOrdersStatusEntity.class,
        SettingEntity.class,
        StockAvailabilityStatusEntity.class,
        StockInventoryHeaderEntity.class,
        StockInventoryLineEntity.class,
        SyncStatusEntity.class,
        TagEntity.class,
        TransactionTypeEntity.class,
        UserDefinedListEntity.class,
        UserEntity.class,
        VATGroupEntity.class,
        VisitEntity.class,
        VisitSubResultEntity.class,
        WarehouseEntity.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract ApprovalStatusDao getApprovalStatusDao();

    public abstract BackOrderShipmentDao getBackOrderShipmentDao();

    public abstract CategoryOfItemsDao getCategoryOfItemsDao();

    public abstract CommentDao getCommentDao();

    public abstract CommentGalleryDao getCommentGalleryDao();

    public abstract CommentSourcesDao getCommentSourcesDao();

    public abstract CommentTargetsDao getCommentTargetsDao();

    public abstract CompanyDao getCompanyDao();

    public abstract ContactDao getContactDao();

    public abstract ContactDepartmentDao getContactDepartmentDao();

    public abstract ContactPositionDao getPositionDao();

    public abstract CreatedDocumentStatusDao getCreatedDocumentStatusDao();

    public abstract CustomerCustomListDao getCustomerCustomListDao();

    public abstract CustomerDao getCustomerDao();

    public abstract CustomerPaymentConditionDao getCustomerPaymentConditionDao();

    public abstract CustomerPaymentMethodDao getCustomerPaymentMethodDao();

    public abstract CustomerPlanTurnoverDao getCustomerPlanTurnoverDao();

    public abstract CustomerProcessDao getCustomerProcessDao();

    public abstract CustomerProductGroupPotentialDao getCustomerProductGroupPotentialDao();

    public abstract CustomerShipmentMethodDao getCustomerShipmentMethodDao();

    public abstract CustomerShipToAddressesDao getCustomerShipToAddressesDao();

    public abstract CustomerStatisticsDao getCustomerStatisticsDao();

    public abstract CustomerFrequenciesDao getCustomerFrequenciesDao();

    public abstract CustomerVisitsDao getCustomerVisitsDao();

    public abstract CustomListsHeaderDao getCustomListsHeaderDao();

    public abstract CustomListsLineDao getCustomListsLineDao();

    public abstract DocumentTypeDao getDocumentTypeDao();

    public abstract DocumentVerificationStatusDao getDocumentVerificationStatusDao();

    public abstract FinancialEntityDao getFinancialEntityDao();

    public abstract GalleryDao getGalleryDao();

    public abstract GroupOfCustomersCategoryItemsDao getGroupOfCustomersCategoryItemsDao();

    public abstract GroupOfCustomersDao getGroupOfCustomersDao();

    public abstract ItemDao getItemDao();

    public abstract ItemQuantitativeElaborationDao getItemQuantitativeElaborationDao();

    public abstract ItemSaleHistoryDao getItemSaleHistoryDao();

    public abstract ItemStatusDao getItemStatusDao();

    public abstract ItemUnitOfMeasureDao getItemUnitOfMeasureDao();

    public abstract MunicipalityDao getMunicipalityDao();

    public abstract NoteAttachmentsDao getNoteAttachmentsDao();

    public abstract NoteDao getNoteDao();

    public abstract NoteTargetGroupsDao getNoteTargetGroupsDao();

    public abstract NoteTargetTypesDao getNoteTargetTypesDao();

    public abstract PostalCodesAndCitiesDao getPostalCodesAndCitiesDao();

    public abstract SaleOrderHeaderDao getSaleOrderHeaderDao();

    public abstract SaleOrderLineDao getSaleOrderLineDao();

    public abstract SalesDocumentConditionDao getSalesDocumentConditionDao();

    public abstract SalesDocumentTypeDao getSalesDocumentTypeDao();

    public abstract SalesLeaderCategoryAllowedToCustomerDao getSalesLeaderCategoryAllowedToCustomerDao();

    public abstract SalesLeaderCategoryAllowedToCustomerTmpDao getSalesLeaderCategoryAllowedToCustomerTmpDao();

    public abstract SalesLeaderCustomerCardColorDao getSalesLeaderCustomerCardColorDao();

    public abstract SalesLeaderDirectionDao getSalesLeaderDirectionDao();

    public abstract ItemAllowedToCustomerDao getItemAllowedToCustomerDao();

    public abstract ItemAllowedToCustomerTmpDao getItemAllowedToCustomerTmpDao();

    public abstract ItemConnectionsDao getItemConnectionsDao();

    public abstract SalesLeaderItemCustomersCardDao getSalesLeaderItemCustomersCardDao();

    public abstract SalesLeaderItemCustomersCardIcoDao getSalesLeaderItemCustomersCardIcoDao();

    public abstract ItemPackagesDao getItemPackagesDao();

    public abstract SalesLeaderItemPerProcessesPerCustomersDao getSalesLeaderItemPerProcessesPerCustomersDao();

    public abstract SalesLeaderItemPerShelvesPerCustomersDao getSalesLeaderItemPerShelvesPerCustomersDao();

    public abstract SalesLeaderItemSoldToCustomerMonthlyDao getSalesLeaderItemSoldToCustomerMonthlyDao();

    public abstract SalesLeaderItemSoldToCustomerMonthlyTmpDao getSalesLeaderItemSoldToCustomerMonthlyTmpDao();

    public abstract SalesLeaderItemToBringDao getSalesLeaderItemToBringDao();

    public abstract SalesLeaderNewItemCustomersCardDao getSalesLeaderNewItemCustomersCardDao();

    public abstract SalesLeaderSalesLevelTypeDao getSalesLeaderSalesLevelTypeDao();

    public abstract SalesLeaderShelvePerCustomersDao getSalesLeaderShelvePerCustomersDao();

    public abstract SalesPriceTypeDao getSalesPriceTypeDao();

    public abstract SalesTypeDao getSalesTypeDao();

    public abstract ServiceClassificationDao getServiceClassificationDao();

    public abstract ServiceClassificationTypeDao getServiceClassificationTypeDao();

    public abstract ServiceOrderDao getServiceOrderDao();

    public abstract ServiceOrdersStatusDao getServiceOrdersStatusDao();

    public abstract SettingDao getSettingDao();

    public abstract StockAvailabilityStatusDao getStockAvailabilityStatusDao();

    public abstract StockInventoryHeaderDao getStockInventoryHeaderDao();

    public abstract StockInventoryLineDao getStockInventoryLineDao();

    public abstract SyncStatusDao getSyncStatusDao();

    public abstract TagDao getTagDao();

    public abstract TransactionTypeDao getTransactionTypeDao();

    public abstract UserDao getUserDao();

    public abstract UserDefinedListDao getUserDefinedListDao();

    public abstract VATGroupDao getVatGroupDao();

    public abstract VisitDao getVisitDao();

    public abstract VisitSubResultDao getVisitSubResultDao();

    public abstract WarehouseDao getWarehouseDao();

    public abstract GlobalDao getGlobalDao();
}
