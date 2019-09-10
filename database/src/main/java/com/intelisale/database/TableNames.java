package com.intelisale.database;

public interface TableNames {

    String COMPANIES = "Companies";
    String FINANCIAL_ENTITIES = "FinancialEntities";
    String USERS = "Users";

    String ITEMS = "Items";
    String ITEMS_WITH_STATUSES = "Items " +
            "LEFT JOIN ItemStatuses ON Items.ItemStatusID = ItemStatuses.ServerID";
    String ITEMS_WITH_CATEGORIES = "Items " +
            "LEFT JOIN CategoriesOfItems ON Items.CategoryOfItemsID = CategoriesOfItems.ServerID " +
            "LEFT JOIN ItemStatuses ON Items.ItemStatusID = ItemStatuses.ServerID " +
            "LEFT JOIN ItemUnitOfMeasures ON Items.BaseSales_ItemUnitOfMeasureID = ItemUnitOfMeasures.ServerID";
    String CATEGORIES_OF_ITEMS = "CategoriesOfItems";

    String ITEMS_SALES_LEADER = "Items x " +
            "LEFT JOIN (SELECT * FROM SLItemsCustomersCard LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID WHERE SLItemsCustomersCard.CustomerID=%s) y ON x.ServerID = y.ItemID " +
            "LEFT JOIN SLItemsAllowedToCustTmp z ON x.ServerID = z.ItemID " +
            "LEFT JOIN SalesPriceTypes w ON z.SalesPriceTypeID = w.ServerID " +
            "LEFT JOIN ApprovalStatuses e ON z.ApprovalStatusID = e.ServerID";
    String SL_ITEMS_CONNECTIONS_SALES_LEADER = "SLItemsConnections x " +
            "LEFT JOIN Items y ON x.ItemID = y.ServerID " +
            "LEFT JOIN SLDirection z ON x.SLDirectionID = z.ServerID " +
            "LEFT JOIN SLItemsAllowedToCustTmp q ON x.ItemID = q.ItemID " +
            "LEFT JOIN SalesPriceTypes w ON q.SalesPriceTypeID = w.ServerID";
    String SL_ITEMS_CONNECTIONS_CATALOGUE = "SLItemsConnections x " +
            "LEFT JOIN Items y ON x.ItemID = y.ServerID " +
            "LEFT JOIN SLDirection z ON x.SLDirectionID = z.ServerID " +
            "LEFT JOIN (SELECT * FROM SLItemsCustomersCard LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID WHERE SLItemsCustomersCard.CustomerID=%s) q ON y.ServerID = q.ItemID " +
            "LEFT JOIN SLItemsAllowedToCustTmp w ON q.ServerID = w.ItemID " +
            "LEFT JOIN SalesPriceTypes e ON w.SalesPriceTypeID = e.ServerID";
    String ITEM_QUANTITY_DISCOUNT_TMP_WITH_ITEMS_ALLOWED = "ItemQuantityDiscountTmp x " +
            "LEFT JOIN Items y ON x.ItemID = y.ServerID " +
            "LEFT JOIN SLItemsAllowedToCustTmp z ON x.ItemID = z.ItemID " +
            "LEFT JOIN SalesPriceTypes w ON z.SalesPriceTypeID = w.ServerID";
    String ITEMS_CATALOGUE_NO_CUSTOMER = "Items " +
            "LEFT JOIN SLItemsAllowedToCust ON Items.ServerID = SLItemsAllowedToCust.ItemID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCust.SalesPriceTypeID = SalesPriceTypes.ServerID";
    String ITEMS_CATALOGUE_WITH_CUSTOMER = "Items x " +
            "LEFT JOIN (SELECT * FROM SLItemsCustomersCard LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID WHERE SLItemsCustomersCard.CustomerID=%s) y ON x.ServerID = y.ItemID " +
            "LEFT JOIN SLItemsAllowedToCustTmp z ON x.ServerID = z.ItemID " +
            "LEFT JOIN SalesPriceTypes w ON z.SalesPriceTypeID = w.ServerID";

    String CUSTOMERS = "Customers";
    String CUSTOMERS_WITH_POSTAL_CODES_AND_CITIES = "Customers " +
            "LEFT JOIN PostalCodesAndCities ON Customers.PostalCodeAndCityID = PostalCodesAndCities.ServerID " +
            "LEFT JOIN CustPaymentConditions ON Customers.CustPaymentConditionID = CustPaymentConditions.ServerID " +
            "LEFT JOIN CustPaymentMethods ON Customers.CustPaymentMethodID = CustPaymentMethods.ServerID";

    String CUSTOMERS_WITH_POSTAL_CODES_AND_CITIES_AND_MUNICIPALITY = "Customers " +
            "LEFT JOIN PostalCodesAndCities ON Customers.PostalCodeAndCityID = PostalCodesAndCities.ServerID " +
            "LEFT JOIN CustPaymentConditions ON Customers.CustPaymentConditionID = CustPaymentConditions.ServerID " +
            "LEFT JOIN Municipalities ON PostalCodesAndCities.MunicipalityID = Municipalities.ServerID";
    String GROUPS_OF_CUSTOMERS = "GroupsOfCustomers";

    String CONTACTS = "Contacts";
    String CONTACTS_WITH_CUSTOMERS_DEPARTMENTS_POSITIONS = "Contacts " +
            "LEFT JOIN Customers ON Contacts.CustomerID = Customers.ServerID " +
            "LEFT JOIN ContactsDepartments ON Contacts.ContactDepartmentID = ContactsDepartments.ServerID " +
            "LEFT JOIN ContactsPositions ON Contacts.ContactPositionID = ContactsPositions.ServerID";

    String CONTACTS_DEPARTMENTS = "ContactsDepartments";
    String CONTACTS_POSITIONS = "ContactsPositions";
    String POSTAL_CODES_AND_CITIES = "PostalCodesAndCities";
    String POSTAL_CODES_AND_CITIES_WITH_MUNICIPALITIES = "PostalCodesAndCities " +
            "LEFT JOIN Municipalities ON PostalCodesAndCities.MunicipalityID = Municipalities.ServerID";

    String VISITS = "Visits";
    String VISITS_WITH_CUSTOMERS = "Visits " +
            "LEFT JOIN Customers ON Visits.CustomerID = Customers.ServerID " +
            "LEFT JOIN PostalCodesAndCities ON Customers.PostalCodeAndCityID = PostalCodesAndCities.ServerID " +
            "LEFT JOIN VisitSubResults ON Visits.VisitSubResultID = VisitSubResults.ServerID";
    String VISIT_SUB_RESULTS = "VisitSubResults";

    String BACK_ORDER_SHIPMENT_STATUSES = "BackOrderShipmentStatuses";
    String CUSTOMER_PAYMENT_CONDITIONS = "CustPaymentConditions";

    String CUSTOMER_SHIP_TO_ADDRESSES = "CustShipToAddresses";
    String CUSTOMER_SHIP_TO_ADDRESSES_WITH_POSTAL_CODES_AND_CITIES = "CustShipToAddresses " +
            "LEFT JOIN PostalCodesAndCities ON CustShipToAddresses.PostalCodeAndCityID = PostalCodesAndCities.ServerID";

    String CUSTOMER_SHIPMENT_METHODS = "CustShipmentMethods";
    String DOCUMENT_TYPES = "DocumentTypes";
    String ITEM_UNIT_OF_MEASURES = "ItemUnitOfMeasures";
    String CUSTOMER_PAYMENT_METHODS = "CustPaymentMethods";
    String SALES_DOCUMENT_CONDITIONS = "SalesDocumentConditions";
    String SALES_DOCUMENT_TYPES = "SalesDocumentTypes";
    String SALES_PRICE_TYPES = "SalesPriceTypes";
    String SALES_TYPES = "SalesTypes";
    String VAT_GROUPS = "VATGroups";
    String WAREHOUSES = "Warehouses";

    String SALE_ORDER_HEADERS = "SaleOrderHeaders";
    String SALE_ORDER_HEADERS_WITH_CUSTOMERS = "SaleOrderHeaders " +
            "LEFT JOIN Customers ON SaleOrderHeaders.CustomerID = Customers.ServerID " +
            "LEFT JOIN DocumentTypes ON SaleOrderHeaders.DocumentTypeID = DocumentTypes.ServerID " +
            "LEFT JOIN DocumentVerificationStatuses ON SaleOrderHeaders.DocumentVerificationStatusID = DocumentVerificationStatuses.ServerID";
    String SALE_ORDER_LINES = "SaleOrderLines";
    String SALE_ORDER_LINES_WITH_ITEMS = "SaleOrderLines " +
            "LEFT JOIN Items ON SaleOrderLines.ItemID = Items.ServerID " +
            "LEFT JOIN ItemStatuses ON Items.ItemStatusID = ItemStatuses.ServerID " +
            "LEFT JOIN DocumentVerificationStatuses ON SaleOrderLines.DocumentVerificationStatusID = DocumentVerificationStatuses.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SaleOrderLines.SalesPriceTypeID = SalesPriceTypes.ServerID";

    String SL_ITEMS_CUSTOMERS_CARD = "SLItemsCustomersCard";
    String SL_ITEMS_CUSTOMERS_CARD_WITH_ITEMS = "SLItemsCustomersCard " +
            "LEFT JOIN Items ON SLItemsCustomersCard.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID";
    String SL_CUSTOMERS_PROCESSES = "CustomersProcesses";
    String SL_ITEMS_PER_PROCESSES = "SLItemsPerProcessesPerCust";
    String SL_ITEMS_PER_PROCESSES_WITH_ITEMS = "SLItemsPerProcessesPerCust " +
            "LEFT JOIN Items ON SLItemsPerProcessesPerCust.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsPerProcessesPerCust.SquareColor = SLCustomerCardColors.ServerID";
    String SL_DIRECTIONS = "SLDirection";
    String SL_ITEMS_PACKAGES = "SLItemsPackages";
    String SL_ITEMS_PACKAGES_WITH_SL_ITEMS_ALLOWED = "SLItemsPackages " +
            "INNER JOIN SLItemsAllowedToCustTmp ON SLItemsPackages.ItemPackageID = SLItemsAllowedToCustTmp.ItemID";
    String SL_ITEMS_PACKAGES_WITH_ITEMS_SL_ITEMS_ALLOWED = "SLItemsPackages " +
            "INNER JOIN SLItemsAllowedToCustTmp ON SLItemsPackages.ItemPackageID = SLItemsAllowedToCustTmp.ItemID " +
            "LEFT JOIN Items ON SLItemsPackages.ItemPackageID = Items.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCustTmp.SalesPriceTypeID = SalesPriceTypes.ServerID " +
            "LEFT JOIN ApprovalStatuses ON SLItemsAllowedToCustTmp.ApprovalStatusID = ApprovalStatuses.ServerID";
    String SL_ITEMS_PACKAGES_CATALOGUE = "SLItemsPackages " +
            "INNER JOIN SLItemsAllowedToCust ON SLItemsPackages.ItemPackageID = SLItemsAllowedToCust.ItemID " +
            "LEFT JOIN Items ON SLItemsPackages.ItemPackageID = Items.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCust.SalesPriceTypeID = SalesPriceTypes.ServerID " +
            "LEFT JOIN ApprovalStatuses ON SLItemsAllowedToCust.ApprovalStatusID = ApprovalStatuses.ServerID";
    String SL_ITEMS_PACKAGES_WITH_ITEMS_COMPONENTS = "SLItemsPackages " +
            "LEFT JOIN Items ON SLItemsPackages.ItemComponentID = Items.ServerID";
    String SL_ITEMS_CONNECTIONS = "SLItemsConnections";
    String SL_ITEMS_CONNECTIONS_WITH_ITEMS = "SLItemsConnections " +
            "LEFT JOIN Items ON SLItemsConnections.ItemID = Items.ServerID " +
            "LEFT JOIN SLDirection ON SLItemsConnections.SLDirectionID = SLDirection.ServerID";
    String SL_ITEMS_ALLOWED_TO_CUSTOMER = "SLItemsAllowedToCust";
    String SL_ITEMS_ALLOWED_TO_CUSTOMER_WITH_ITEMS_SALES_PRICE_TYPES = "SLItemsAllowedToCust " +
            "LEFT JOIN Items ON SLItemsAllowedToCust.ItemID = Items.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCust.SalesPriceTypeID = SalesPriceTypes.ServerID";
    String SL_ITEMS_ALLOWED_TO_CUSTOMER_WITH_CODEBOOKS = "SLItemsAllowedToCust " +
//            "LEFT JOIN Items ON SLItemsAllowedToCust.ItemID = Items.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCust.SalesPriceTypeID = SalesPriceTypes.ServerID " +
            "LEFT JOIN SLSalesLevelTypes ON SLItemsAllowedToCust.SLSalesLevelTypeID = SLSalesLevelTypes.ServerID " +
            "LEFT JOIN ApprovalStatuses ON SLItemsAllowedToCust.ApprovalStatusID = ApprovalStatuses.ServerID";
    String SL_ITEMS_ALLOWED_TO_CUSTOMER_TMP = "SLItemsAllowedToCustTmp";
    String SL_ITEMS_ALLOWED_TO_CUSTOMER_TMP_WITH_ITEMS_SALES_PRICE_TYPES = "SLItemsAllowedToCustTmp " +
            "LEFT JOIN Items ON SLItemsAllowedToCustTmp.ItemID = Items.ServerID " +
            "LEFT JOIN SalesPriceTypes ON SLItemsAllowedToCustTmp.SalesPriceTypeID = SalesPriceTypes.ServerID";
    String SL_SALES_LEVEL_TYPES = "SLSalesLevelTypes";
    String SL_SHELVES_PER_CUSTOMERS = "SLShelvesPerCustomers";
    String SL_SHELVES_PER_CUSTOMERS_WITH_ITEMS = "SLShelvesPerCustomers " +
            "LEFT JOIN Items ON SLShelvesPerCustomers.ShelfItemID = Items.ServerID";
    String SL_ITEMS_PER_SHELVES_PER_CUSTOMERS = "SLItemsPerShelvesPerCust";
    String SL_ITEMS_PER_SHELVES_PER_CUSTOMERS_WITH_ITEMS = "SLItemsPerShelvesPerCust " +
            "LEFT JOIN Items ON SLItemsPerShelvesPerCust.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsPerShelvesPerCust.SquareColor = SLCustomerCardColors.ServerID";
    String SL_CUSTOMER_CARD_COLORS = "SLCustomerCardColors";

    String SERVICE_ORDERS = "ServiceOrders";
    String SERVICE_ORDERS_WITH_CUSTOMERS_ITEMS = "ServiceOrders " +
            "LEFT JOIN Customers ON ServiceOrders.CustomerID = Customers.ServerID " +
            "LEFT JOIN Items ON ServiceOrders.ItemID = Items.ServerID";
    String DOCUMENT_VERIFICATION_STATUSES = "DocumentVerificationStatuses";
    String SETTINGS = "Settings";
    String SYNC_STATUS = "SyncStatus";

    String ITEM_SALE_HISTORY_TMP = "ItemSaleHistoryTmp";
    String ITEM_SALE_HISTORY_TMP_WITH_UNITS_PRICE_TYPES = "ItemSaleHistoryTmp " +
            "LEFT JOIN ItemUnitOfMeasures ON ItemSaleHistoryTmp.ItemUnitOfMeasureID = ItemUnitOfMeasures.ServerID " +
            "LEFT JOIN SalesPriceTypes ON ItemSaleHistoryTmp.SalesPriceTypeID = SalesPriceTypes.ServerID";
    String ITEM_QUANTITY_DISCOUNT_TMP = "ItemQuantityDiscountTmp";

    String GALLERY = "Gallery";
    String TAGS = "Tags";

    String SL_CATEGORIES_ALLOWED_TO_CUSTOMER = "SLCategoriesAllowedToCustomer";
    String SL_CATEGORIES_ALLOWED_TO_CUSTOMER_WITH_CATEGORIES_SL_SALES_LEVEL_TYPES = "SLCategoriesAllowedToCustomer " +
            "LEFT JOIN CategoriesOfItems ON SLCategoriesAllowedToCustomer.CategoryOfItemsID = CategoriesOfItems.ServerID " +
            "LEFT JOIN SLSalesLevelTypes ON SLCategoriesAllowedToCustomer.SLSalesLevelTypeID = SLSalesLevelTypes.ServerID";
    String SL_CATEGORIES_ALLOWED_TO_CUSTOMER_TMP = "SLCategoriesAllowedToCustomerTmp";

    // TODO srediti
    String SL_CATEGORIES_ALLOWED_TO_CUSTOMER_ITEMS_COUNT = "SLCategoriesAllowedToCustomerTmp " +
            "LEFT JOIN CategoriesOfItems ON CategoriesOfItems.ServerID = SLCategoriesAllowedToCustomerTmp.CategoryOfItemsID " +
            "INNER JOIN (SELECT DISTINCT Items.CategoryOfItemsID AS coi FROM SLNewItemsCustomersCard LEFT JOIN Items ON Items.ServerID = SLNewItemsCustomersCard.ItemID) AS wtf ON wtf.coi = SLCategoriesAllowedToCustomerTmp.CategoryOfItemsID";

    String SL_CATEGORIES_ALLOWED_TO_CUSTOMER_TMP_WITH_CATEGORIES_SL_SALES_LEVEL_TYPES = "SLCategoriesAllowedToCustomerTmp " +
            "LEFT JOIN CategoriesOfItems ON SLCategoriesAllowedToCustomerTmp.CategoryOfItemsID = CategoriesOfItems.ServerID " +
            "LEFT JOIN SLSalesLevelTypes ON SLCategoriesAllowedToCustomerTmp.SLSalesLevelTypeID = SLSalesLevelTypes.ServerID";
    String SL_NEW_ITEMS_CUSTOMERS_CARD = "SLNewItemsCustomersCard";
    String SL_NEW_ITEMS_CUSTOMERS_CARD_WITH_ITEMS = "SLNewItemsCustomersCard " +
            "LEFT JOIN Items ON SLNewItemsCustomersCard.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLNewItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID";
    String SL_ITEMS_TO_BRING = "SLItemsToBring";
    String SL_ITEMS_TO_BRING_WITH_ITEMS = "SLItemsToBring " +
            "LEFT JOIN Items ON SLItemsToBring.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsToBring.SquareColor = SLCustomerCardColors.ServerID";

    String COMMENTS = "Comments";
    String COMMENTS_WITH_SOURCES_TARGETS = "Comments " +
            "LEFT JOIN CommentsSources ON Comments.CommentsSourceID = CommentsSources.ServerID " +
            "LEFT JOIN CommentsTargets ON Comments.CommentsTargetID = CommentsTargets.ServerID " +
            "LEFT JOIN Contacts ON Comments.UserID = Contacts.ServerID";
    String COMMENTS_GALLERY = "CommentsGallery";
    String COMMENTS_SOURCES = "CommentsSources";
    String COMMENTS_TARGETS = "CommentsTargets";

    String ITEM_STATUSES = "ItemStatuses";

    String USER_DEFINED_LISTS = "UserDefinedLists";

    String MUNICIPALITIES = "Municipalities";
    String CUSTOMER_VISITS = "CustomerVisits";
    String CUSTOMER_VISITS_SORTED = "(SELECT * FROM CustomerVisits WHERE CustomerVisits.CustomerID = %s AND CustomerVisits.Active = 1 ORDER BY DATE(CustomerVisits.VisitDate) DESC LIMIT 12) AS CustomerVisits";
    String CUSTOMER_STATISTICS = "CustomerStatistics";
    String CUSTOMER_PLAN_TURNOVER = "CustomerPlanTurnover";

    String CUSTOMER_PRODUCT_GROUP = "CustomerProductGroupPotential";
    String CUSTOMER_PRODUCT_GROUP_WITH_CATEGORIES = "CustomerProductGroupPotential " +
            "LEFT JOIN CategoriesOfItems ON CustomerProductGroupPotential.CategoryOfItemsID = CategoriesOfItems.ServerID";

    String VISIT_DESCRIPTION_WITH_USERS = "Visits LEFT JOIN Contacts ON Visits.EmployeeID = Contacts.ServerID ";

    String CREATED_DOCUMENT_STATUS = "CreatedDocumentStatus";
    String TRANSACTION_TYPES = "TransactionTypes";
    String SERVICE_ORDERS_STATUS = "ServiceOrdersStatus";

    String NOTES = "Notes";
    String NOTES_WITH_TARGET_TYPES = "Notes " +
            "LEFT JOIN NotesTargetTypes ON Notes.NoteTargetTypeID = NotesTargetTypes.ServerID " +
            "LEFT JOIN Users ON Notes.CreatedByUserID = Users.ServerID";
    String NOTES_TARGET_TYPES = "NotesTargetTypes";
    String NOTES_TARGET_GROUPS = "NotesTargetGroups";
    String NOTES_ATTACHMENTS = "NotesAttachments";

    String APPROVAL_STATUSES = "ApprovalStatuses";

    String SL_ITEMS_CUSTOMERS_CARD_ICO = "SLItemsCustomersCardIco";
    String SL_ITEMS_CUSTOMERS_CARD_ICO_WITH_ITEMS = "SLItemsCustomersCardIco " +
            "LEFT JOIN Items ON SLItemsCustomersCardIco.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCardIco.SquareColor = SLCustomerCardColors.ServerID";
    String ITEMS_SALES_LEADER_ICO = "Items x " +
            "LEFT JOIN (SELECT * FROM SLItemsCustomersCardIco LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCardIco.SquareColor = SLCustomerCardColors.ServerID WHERE SLItemsCustomersCardIco.CustomerID = %s) y ON x.ServerID = y.ItemID " +
            "LEFT JOIN SLItemsAllowedToCustTmp z ON x.ServerID = z.ItemID " +
            "LEFT JOIN SalesPriceTypes w ON z.SalesPriceTypeID = w.ServerID " +
            "LEFT JOIN ApprovalStatuses e ON z.ApprovalStatusID = e.ServerID";

    String SERVICE_CLASSIFICATION = "ServiceClassification";
    String SERVICE_CLASSIFICATION_TYPES = "ServiceClassificationTypes";

    String STOCK_AVAILABILITY_STATUSES = "StockAvailabilityStatuses";

    String SL_ITEMS_SOLD_TO_CUSTOMER_MONTHLY = "SLItemsSoldToCustomerMonthly";
    String SL_ITEMS_SOLD_TO_CUSTOMER_MONTHLY_TMP = "SLItemsSoldToCustomerMonthlyTmp";
    String SL_ITEMS_SOLD_TO_CUSTOMER_MONTHLY_TMP_WITH_ITEMS = "SLItemsSoldToCustomerMonthlyTmp " +
            "LEFT JOIN SLItemsCustomersCard ON SLItemsSoldToCustomerMonthlyTmp.ItemID = SLItemsCustomersCard.ItemID " +
            "LEFT JOIN Items ON SLItemsCustomersCard.ItemID = Items.ServerID " +
            "LEFT JOIN SLCustomerCardColors ON SLItemsCustomersCard.SquareColor = SLCustomerCardColors.ServerID " +
            "LEFT JOIN ItemStatuses ON Items.ItemStatusID = ItemStatuses.ServerID";

    String GROUP_OF_CUSTOMERS_CATEGORY_ITEMS = "GroupOfCustomersCategoryItems";
    String GROUP_OF_CUSTOMERS_CATEGORY_ITEMS_WITH_CATEGORIES = "GroupOfCustomersCategoryItems " +
            "LEFT JOIN CategoriesOfItems ON GroupOfCustomersCategoryItems.CategoryOfItemsID = CategoriesOfItems.ServerID " +
            "LEFT JOIN CustomerProductGroupPotential ON GroupOfCustomersCategoryItems.CategoryOfItemsID = CustomerProductGroupPotential.CategoryOfItemsID AND CustomerProductGroupPotential.CustomerID = %d";

    String CUSTOMER_CUSTOM_LISTS = "CustomersCustomLists";
    String CUSTOMER_CUSTOM_LISTS_WITH_HEADERS = "CustomersCustomLists " +
            "LEFT JOIN CustomListsHeaders ON CustomersCustomLists.CustomListHeaderID = CustomListsHeaders.ServerID";
    String CUSTOM_LISTS_HEADERS = "CustomListsHeaders";
    String CUSTOM_LISTS_LINES = "CustomListsLines";

    String STOCK_INVENTORY_HEADERS = "StockInventoryHeaders";
    String STOCK_INVENTORY_HEADERS_WITH_CUSTOMERS = "StockInventoryHeaders " +
            "LEFT JOIN Customers ON StockInventoryHeaders.CustomerID = Customers.ServerID";
    String STOCK_INVENTORY_LINES = "StockInventoryLines";
    String STOCK_INVENTORY_LINES_WITH_ITEMS = "StockInventoryLines " +
            "LEFT JOIN Items ON StockInventoryLines.ItemID = Items.ServerID";

    String CUSTOMER_FREQUENCIES = "VisitsFrequencies";

    String CODEBOOKS = "CodeBooks";
}