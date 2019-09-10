package com.intelisale.database.di;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.intelisale.database.AppDatabase;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.database.repository.SyncItemsRepository;
import com.intelisale.database.repository.UserRepository;
import com.intelisale.database.utils.DateUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    private AppDatabase appDatabase;

    public DatabaseModule(Application mApplication) {
        appDatabase = Room.databaseBuilder(mApplication, AppDatabase.class, "SalesLeader-db")
//                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .addCallback(new RoomDatabase.Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                            @Override
                            public void run() {

                                String date = DateUtils.getDefaultDate();
                                SyncStatusEntity obj0 = new SyncStatusEntity(TableNames.CUSTOMERS, date, 0, SyncStatusEntity.STATUS_FAIL);
                                SyncStatusEntity obj1 = new SyncStatusEntity(TableNames.CONTACTS, date, 0, SyncStatusEntity.STATUS_FAIL);
                                SyncStatusEntity obj2 = new SyncStatusEntity(TableNames.ITEMS, date, 0, SyncStatusEntity.STATUS_FAIL);
                                SyncStatusEntity obj3 = new SyncStatusEntity(TableNames.CODEBOOKS, date, 0, SyncStatusEntity.STATUS_FAIL);
                                SyncStatusEntity obj4 = new SyncStatusEntity(TableNames.SETTINGS, date, 0, SyncStatusEntity.STATUS_FAIL);
                                SyncStatusEntity obj5 = new SyncStatusEntity(TableNames.NOTES, date, 0, SyncStatusEntity.STATUS_FAIL);
                                getDatabase().getSyncStatusDao().insert(new ArrayList<>(Arrays.asList(obj0, obj1, obj2, obj3, obj4, obj5)));

                                // Pre-populate
//                                getDatabase().dataDao().insertAll(DataEntity.populateData());
                            }
                        });
                    }
                })
//                .addMigrations(Migrations.MIGRATION_1_2, Migrations.MIGRATION_2_3)
                .build();
    }

    @Singleton
    @Provides
    AppDatabase getDatabase() {
        return appDatabase;
    }

    @Singleton
    @Provides
    static UserRepository userRepository(AppDatabase appDatabase) {
        return new UserRepository(appDatabase.getUserDao());
    }

    @Singleton
    @Provides
    static SyncCustomersRepository syncCustomersRepository(AppDatabase appDatabase) {
        return new SyncCustomersRepository(
                appDatabase.getGlobalDao(),
                appDatabase.getSyncStatusDao(),
                appDatabase.getCustomerDao(),
                appDatabase.getCustomerProcessDao(),
                appDatabase.getCustomerShipToAddressesDao(),
                appDatabase.getCustomerVisitsDao(),
                appDatabase.getCustomerStatisticsDao(),
                appDatabase.getCustomerPlanTurnoverDao(),
                appDatabase.getCustomerProductGroupPotentialDao(),
                appDatabase.getCustomerCustomListDao(),
                appDatabase.getCustomListsLineDao(),
                appDatabase.getSalesLeaderShelvePerCustomersDao(),
                appDatabase.getSalesLeaderCategoryAllowedToCustomerDao());
    }

    @Singleton
    @Provides
    static SyncItemsRepository syncItemsRepository(AppDatabase appDatabase) {
        return new SyncItemsRepository(
                appDatabase.getGlobalDao(),
                appDatabase.getSyncStatusDao(),
                appDatabase.getItemDao(),
                appDatabase.getItemConnectionsDao(),
                appDatabase.getItemPackagesDao(),
                appDatabase.getItemAllowedToCustomerDao()
        );
    }

//
//    @Singleton
//    @Provides
//    ApprovalStatusDao getApprovalStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getApprovalStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    BackOrderShipmentDao getBackOrderShipmentDao(AppDatabase appDatabase) {
//        return appDatabase.getBackOrderShipmentDao();
//    }
//
//    @Singleton
//    @Provides
//    CategoryOfItemsDao getCategoryOfItemsDao(AppDatabase appDatabase) {
//        return appDatabase.getCategoryOfItemsDao();
//    }
//
//    @Singleton
//    @Provides
//    CommentDao getCommentDao(AppDatabase appDatabase) {
//        return appDatabase.getCommentDao();
//    }
//
//    @Singleton
//    @Provides
//    CommentGalleryDao getCommentGalleryDao(AppDatabase appDatabase) {
//        return appDatabase.getCommentGalleryDao();
//    }
//
//    @Singleton
//    @Provides
//    CommentSourcesDao getCommentSourcesDao(AppDatabase appDatabase) {
//        return appDatabase.getCommentSourcesDao();
//    }
//
//    @Singleton
//    @Provides
//    CommentTargetsDao getCommentTargetsDao(AppDatabase appDatabase) {
//        return appDatabase.getCommentTargetsDao();
//    }
//
//    @Singleton
//    @Provides
//    CompanyDao getCompanyDao(AppDatabase appDatabase) {
//        return appDatabase.getCompanyDao();
//    }
//
//    @Singleton
//    @Provides
//    ContactDao getContactDao(AppDatabase appDatabase) {
//        return appDatabase.getContactDao();
//    }
//
//    @Singleton
//    @Provides
//    ContactDepartmentDao getContactDepartmentDao(AppDatabase appDatabase) {
//        return appDatabase.getContactDepartmentDao();
//    }
//
//    @Singleton
//    @Provides
//    ContactPositionDao getPositionDao(AppDatabase appDatabase) {
//        return appDatabase.getPositionDao();
//    }
//
//    @Singleton
//    @Provides
//    CreatedDocumentStatusDao getCreatedDocumentStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getCreatedDocumentStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerCustomListDao getCustomerCustomListDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerCustomListDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerDao getCustomerDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerPaymentConditionDao getCustomerPaymentConditionDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerPaymentConditionDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerPaymentMethodDao getCustomerPaymentMethodDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerPaymentMethodDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerPlanTurnoverDao getCustomerPlanTurnoverDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerPlanTurnoverDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerProcessDao getCustomerProcessDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerProcessDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerProductGroupPotentialDao getCustomerProductGroupPotentialDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerProductGroupPotentialDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerShipmentMethodDao getCustomerShipmentMethodDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerShipmentMethodDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerShipToAddressesDao getCustomerShipToAddressesDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerShipToAddressesDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerStatisticsDao getCustomerStatisticsDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerStatisticsDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomerVisitsDao getCustomerVisitsDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomerVisitsDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomListsHeaderDao getCustomListsHeaderDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomListsHeaderDao();
//    }
//
//    @Singleton
//    @Provides
//    CustomListsLineDao getCustomListsLineDao(AppDatabase appDatabase) {
//        return appDatabase.getCustomListsLineDao();
//    }
//
//    @Singleton
//    @Provides
//    DocumentTypeDao getDocumentTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getDocumentTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    DocumentVerificationStatusDao getDocumentVerificationStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getDocumentVerificationStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    FinancialEntityDao getFinancialEntityDao(AppDatabase appDatabase) {
//        return appDatabase.getFinancialEntityDao();
//    }
//
//    @Singleton
//    @Provides
//    GalleryDao getGalleryDao(AppDatabase appDatabase) {
//        return appDatabase.getGalleryDao();
//    }
//
//    @Singleton
//    @Provides
//    GroupOfCustomersCategoryItemsDao getGroupOfCustomersCategoryItemsDao(AppDatabase appDatabase) {
//        return appDatabase.getGroupOfCustomersCategoryItemsDao();
//    }
//
//    @Singleton
//    @Provides
//    GroupOfCustomersDao getGroupOfCustomersDao(AppDatabase appDatabase) {
//        return appDatabase.getGroupOfCustomersDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemDao getItemDao(AppDatabase appDatabase) {
//        return appDatabase.getItemDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemQuantitativeElaborationDao getItemQuantitativeElaborationDao(AppDatabase appDatabase) {
//        return appDatabase.getItemQuantitativeElaborationDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemSaleHistoryDao getItemSaleHistoryDao(AppDatabase appDatabase) {
//        return appDatabase.getItemSaleHistoryDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemStatusDao getItemStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getItemStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemUnitOfMeasureDao getItemUnitOfMeasureDao(AppDatabase appDatabase) {
//        return appDatabase.getItemUnitOfMeasureDao();
//    }
//
//    @Singleton
//    @Provides
//    MunicipalityDao getMunicipalityDao(AppDatabase appDatabase) {
//        return appDatabase.getMunicipalityDao();
//    }
//
//    @Singleton
//    @Provides
//    NoteAttachmentsDao getNoteAttachmentsDao(AppDatabase appDatabase) {
//        return appDatabase.getNoteAttachmentsDao();
//    }
//
//    @Singleton
//    @Provides
//    NoteDao getNoteDao(AppDatabase appDatabase) {
//        return appDatabase.getNoteDao();
//    }
//
//    @Singleton
//    @Provides
//    NoteTargetGroupsDao getNoteTargetGroupsDao(AppDatabase appDatabase) {
//        return appDatabase.getNoteTargetGroupsDao();
//    }
//
//    @Singleton
//    @Provides
//    NoteTargetTypesDao getNoteTargetTypesDao(AppDatabase appDatabase) {
//        return appDatabase.getNoteTargetTypesDao();
//    }
//
//    @Singleton
//    @Provides
//    PostalCodesAndCitiesDao getPostalCodesAndCitiesDao(AppDatabase appDatabase) {
//        return appDatabase.getPostalCodesAndCitiesDao();
//    }
//
//    @Singleton
//    @Provides
//    SaleOrderHeaderDao getSaleOrderHeaderDao(AppDatabase appDatabase) {
//        return appDatabase.getSaleOrderHeaderDao();
//    }
//
//    @Singleton
//    @Provides
//    SaleOrderLineDao getSaleOrderLineDao(AppDatabase appDatabase) {
//        return appDatabase.getSaleOrderLineDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesDocumentConditionDao getSalesDocumentConditionDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesDocumentConditionDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesDocumentTypeDao getSalesDocumentTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesDocumentTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderCategoryAllowedToCustomerDao getSalesLeaderCategoryAllowedToCustomerDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderCategoryAllowedToCustomerDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderCategoryAllowedToCustomerTmpDao getSalesLeaderCategoryAllowedToCustomerTmpDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderCategoryAllowedToCustomerTmpDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderCustomerCardColorDao getSalesLeaderCustomerCardColorDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderCustomerCardColorDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderDirectionDao getSalesLeaderDirectionDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderDirectionDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemAllowedToCustomerDao getSalesLeaderItemAllowedToCustomerDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemAllowedToCustomerDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemAllowedToCustomerTmpDao getSalesLeaderItemAllowedToCustomerTmpDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemAllowedToCustomerTmpDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemConnectionsDao getSalesLeaderItemConnectionsDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemConnectionsDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemCustomersCardDao getSalesLeaderItemCustomersCardDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemCustomersCardDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemCustomersCardIcoDao getSalesLeaderItemCustomersCardIcoDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemCustomersCardIcoDao();
//    }
//
//    @Singleton
//    @Provides
//    ItemPackagesDao getSalesLeaderItemPackagesDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemPackagesDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemPerProcessesPerCustomersDao getSalesLeaderItemPerProcessesPerCustomersDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemPerProcessesPerCustomersDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemPerShelvesPerCustomersDao getSalesLeaderItemPerShelvesPerCustomersDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemPerShelvesPerCustomersDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemSoldToCustomerMonthlyDao getSalesLeaderItemSoldToCustomerMonthlyDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemSoldToCustomerMonthlyDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemSoldToCustomerMonthlyTmpDao getSalesLeaderItemSoldToCustomerMonthlyTmpDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemSoldToCustomerMonthlyTmpDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderItemToBringDao getSalesLeaderItemToBringDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderItemToBringDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderNewItemCustomersCardDao getSalesLeaderNewItemCustomersCardDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderNewItemCustomersCardDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderSalesLevelTypeDao getSalesLeaderSalesLevelTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderSalesLevelTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesLeaderShelvePerCustomersDao getSalesLeaderShelvePerCustomersDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesLeaderShelvePerCustomersDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesPriceTypeDao getSalesPriceTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesPriceTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    SalesTypeDao getSalesTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getSalesTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    ServiceClassificationDao getServiceClassificationDao(AppDatabase appDatabase) {
//        return appDatabase.getServiceClassificationDao();
//    }
//
//    @Singleton
//    @Provides
//    ServiceClassificationTypeDao getServiceClassificationTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getServiceClassificationTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    ServiceOrderDao getServiceOrderDao(AppDatabase appDatabase) {
//        return appDatabase.getServiceOrderDao();
//    }
//
//    @Singleton
//    @Provides
//    ServiceOrdersStatusDao getServiceOrdersStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getServiceOrdersStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    SettingDao getSettingDao(AppDatabase appDatabase) {
//        return appDatabase.getSettingDao();
//    }
//
//    @Singleton
//    @Provides
//    StockAvailabilityStatusDao getStockAvailabilityStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getStockAvailabilityStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    StockInventoryHeaderDao getStockInventoryHeaderDao(AppDatabase appDatabase) {
//        return appDatabase.getStockInventoryHeaderDao();
//    }
//
//    @Singleton
//    @Provides
//    StockInventoryLineDao getStockInventoryLineDao(AppDatabase appDatabase) {
//        return appDatabase.getStockInventoryLineDao();
//    }
//
//    @Singleton
//    @Provides
//    SyncStatusDao getSyncStatusDao(AppDatabase appDatabase) {
//        return appDatabase.getSyncStatusDao();
//    }
//
//    @Singleton
//    @Provides
//    TagDao getTagDao(AppDatabase appDatabase) {
//        return appDatabase.getTagDao();
//    }
//
//    @Singleton
//    @Provides
//    TransactionTypeDao getTransactionTypeDao(AppDatabase appDatabase) {
//        return appDatabase.getTransactionTypeDao();
//    }
//
//    @Singleton
//    @Provides
//    UserDao getUserDao(AppDatabase appDatabase) {
//        return appDatabase.getUserDao();
//    }
//
//    @Singleton
//    @Provides
//    UserDefinedListDao getUserDefinedListDao(AppDatabase appDatabase) {
//        return appDatabase.getUserDefinedListDao();
//    }
//
//    @Singleton
//    @Provides
//    VATGroupDao getVatGroupDao(AppDatabase appDatabase) {
//        return appDatabase.getVatGroupDao();
//    }
//
//    @Singleton
//    @Provides
//    VisitDao getVisitDao(AppDatabase appDatabase) {
//        return appDatabase.getVisitDao();
//    }
//
//    @Singleton
//    @Provides
//    VisitSubResultDao getVisitSubResultDao(AppDatabase appDatabase) {
//        return appDatabase.getVisitSubResultDao();
//    }
//
//    @Singleton
//    @Provides
//    WarehouseDao getWarehouseDao(AppDatabase appDatabase) {
//        return appDatabase.getWarehouseDao();
//    }
}
