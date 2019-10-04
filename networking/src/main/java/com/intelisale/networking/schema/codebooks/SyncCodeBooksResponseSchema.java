package com.intelisale.networking.schema.codebooks;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelisale.networking.schema.BaseRecordSchema;

import java.util.HashMap;
import java.util.Map;

public class SyncCodeBooksResponseSchema {

    @JsonProperty("ApprovalStatuses")
    private BaseRecordSchema<ApprovalStatusSchema> approvalStatuses = null;
    @JsonProperty("StockAvailbilityStatus")
    private BaseRecordSchema<StockAvailabilityStatusSchema> stockAvailabilityStatuses = null;
    @JsonProperty("CommentsSources")
    private BaseRecordSchema<CommentsSourceSchema> commentsSources = null;
    @JsonProperty("ContactsPositions")
    private BaseRecordSchema<ContactsPositionSchema> contactsPositions = null;
    @JsonProperty("GroupsOfCustomers")
    private BaseRecordSchema<GroupsOfCustomersSchema> groupsOfCustomers = null;
    @JsonProperty("SalesPriceTypes")
    private BaseRecordSchema<SalesPriceTypeSchema> salesPriceTypes = null;
    @JsonProperty("ContactsDepartments")
    private BaseRecordSchema<ContactsDepartmentSchema> contactsDepartments = null;
    @JsonProperty("SLSalesLevelTypes")
    private BaseRecordSchema<SLSalesLevelTypeSchema> sLSalesLevelTypes = null;
    @JsonProperty("Tags")
    private BaseRecordSchema<TagSchema> tags = null;
    @JsonProperty("BackOrderShipmentStatuses")
    private BaseRecordSchema<BackOrderShipmentStatusSchema> backOrderShipmentStatuses = null;
    @JsonProperty("SalesDocumentTypes")
    private BaseRecordSchema<SalesDocumentTypeSchema> salesDocumentTypes = null;
    @JsonProperty("CustShipmentMethods")
    private BaseRecordSchema<CustShipmentMethodSchema> custShipmentMethods = null;
    @JsonProperty("SalesTypes")
    private BaseRecordSchema<SalesTypeSchema> salesTypes = null;
    @JsonProperty("Municipalities")
    private BaseRecordSchema<MunicipalitySchema> municipalities = null;
    @JsonProperty("SLDirections")
    private BaseRecordSchema<SLDirectionSchema> sLDirections = null;
    @JsonProperty("VisitResults")
    private BaseRecordSchema<VisitResultSchema> visitResults = null;
    @JsonProperty("CustPaymentMethods")
    private BaseRecordSchema<CustPaymentMethodSchema> custPaymentMethods = null;
    @JsonProperty("DocumentVerificationStatuses")
    private BaseRecordSchema<DocumentVerificationStatusSchema> documentVerificationStatuses = null;
    @JsonProperty("PostalCodesAndCities")
    private BaseRecordSchema<PostalCodesAndCitySchema> postalCodesAndCities = null;
    @JsonProperty("ItemUnitOfMeasures")
    private BaseRecordSchema<ItemUnitOfMeasuresSchema> itemUnitOfMeasures = null;
    @JsonProperty("Warehouses")
    private BaseRecordSchema<WarehouseSchema> warehouses = null;
    @JsonProperty("CommentsTargets")
    private BaseRecordSchema<CommentsTargetSchema> commentsTargets = null;
    @JsonProperty("DocumentTypes")
    private BaseRecordSchema<DocumentTypeSchema> documentTypes = null;
    @JsonProperty("SalesDocumentConditions")
    private BaseRecordSchema<SalesDocumentConditionSchema> salesDocumentConditions = null;
    @JsonProperty("CustomLists")
    private BaseRecordSchema<CustomListSchema> customLists = null;
    @JsonProperty("SLCustomerCardColors")
    private BaseRecordSchema<SLCustomerCardColorSchema> sLCustomerCardColors = null;
    @JsonProperty("CategoriesOfItems")
    private BaseRecordSchema<CategoriesOfItemSchema> categoriesOfItems = null;
    @JsonProperty("CustPaymentConditions")
    private BaseRecordSchema<CustPaymentConditionSchema> custPaymentConditions = null;
    @JsonProperty("ItemStatuses")
    private BaseRecordSchema<ItemStatusSchema> itemStatuses = null;
    @JsonProperty("CreatedDocumentStatuses")
    private BaseRecordSchema<CreatedDocumentStatusSchema> createdDocumentStatuses = null;
    @JsonProperty("TransactionTypes")
    private BaseRecordSchema<TransactionTypeSchema> transactionTypes = null;
    @JsonProperty("ServiceOrdersStatuses")
    private BaseRecordSchema<ServiceOrderStatusSchema> serviceOrderStatuses = null;
    @JsonProperty("ServiceClassificationTypes")
    private BaseRecordSchema<ServiceClassificationTypesSchema> serviceClassificationTypes = null;
    @JsonProperty("ServiceClassification")
    private BaseRecordSchema<ServiceClassificationSchema> serviceClassification = null;
    @JsonProperty("Users")
    private BaseRecordSchema<UserSchema> usersSchema = null;
    @JsonProperty("GroupOfCustomersCategoryItems")
    private BaseRecordSchema<GroupOfCustomersCategoryItemSchema> groupOfCustomersCategoryItemsSchema = null;
    @JsonProperty("CustomListsHeaders")
    private BaseRecordSchema<CustomListsHeaderSchema> customListsHeaderSchema = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ApprovalStatuses")
    public BaseRecordSchema<ApprovalStatusSchema> getApprovalStatuses() {
        return approvalStatuses;
    }

    @JsonProperty("ApprovalStatuses")
    public void setApprovalStatuses(BaseRecordSchema<ApprovalStatusSchema> approvalStatuses) {
        this.approvalStatuses = approvalStatuses;
    }

    @JsonProperty("StockAvailbilityStatus")
    public BaseRecordSchema<StockAvailabilityStatusSchema> getStockAvailabilityStatuses() {
        return stockAvailabilityStatuses;
    }

    @JsonProperty("StockAvailbilityStatus")
    public void setStockAvailabilityStatuses(BaseRecordSchema<StockAvailabilityStatusSchema> stockAvailabilityStatuses) {
        this.stockAvailabilityStatuses = stockAvailabilityStatuses;
    }

    @JsonProperty("CommentsSources")
    public BaseRecordSchema<CommentsSourceSchema> getCommentsSources() {
        return commentsSources;
    }

    @JsonProperty("CommentsSources")
    public void setCommentsSources(BaseRecordSchema<CommentsSourceSchema> commentsSources) {
        this.commentsSources = commentsSources;
    }

    @JsonProperty("ContactsPositions")
    public BaseRecordSchema<ContactsPositionSchema> getContactsPositions() {
        return contactsPositions;
    }

    @JsonProperty("ContactsPositions")
    public void setContactsPositions(BaseRecordSchema<ContactsPositionSchema> contactsPositions) {
        this.contactsPositions = contactsPositions;
    }

    @JsonProperty("GroupsOfCustomers")
    public BaseRecordSchema<GroupsOfCustomersSchema> getGroupsOfCustomers() {
        return groupsOfCustomers;
    }

    @JsonProperty("GroupsOfCustomers")
    public void setGroupsOfCustomers(BaseRecordSchema<GroupsOfCustomersSchema> groupsOfCustomers) {
        this.groupsOfCustomers = groupsOfCustomers;
    }

    @JsonProperty("SalesPriceTypes")
    public BaseRecordSchema<SalesPriceTypeSchema> getSalesPriceTypes() {
        return salesPriceTypes;
    }

    @JsonProperty("SalesPriceTypes")
    public void setSalesPriceTypes(BaseRecordSchema<SalesPriceTypeSchema> salesPriceTypes) {
        this.salesPriceTypes = salesPriceTypes;
    }

    @JsonProperty("ContactsDepartments")
    public BaseRecordSchema<ContactsDepartmentSchema> getContactsDepartments() {
        return contactsDepartments;
    }

    @JsonProperty("ContactsDepartments")
    public void setContactsDepartments(BaseRecordSchema<ContactsDepartmentSchema> contactsDepartments) {
        this.contactsDepartments = contactsDepartments;
    }

    @JsonProperty("SLSalesLevelTypes")
    public BaseRecordSchema<SLSalesLevelTypeSchema> getsLSalesLevelTypes() {
        return sLSalesLevelTypes;
    }

    @JsonProperty("SLSalesLevelTypes")
    public void setsLSalesLevelTypes(BaseRecordSchema<SLSalesLevelTypeSchema> sLSalesLevelTypes) {
        this.sLSalesLevelTypes = sLSalesLevelTypes;
    }

    @JsonProperty("Tags")
    public BaseRecordSchema<TagSchema> getTags() {
        return tags;
    }

    @JsonProperty("Tags")
    public void setTags(BaseRecordSchema<TagSchema> tags) {
        this.tags = tags;
    }

    @JsonProperty("BackOrderShipmentStatuses")
    public BaseRecordSchema<BackOrderShipmentStatusSchema> getBackOrderShipmentStatuses() {
        return backOrderShipmentStatuses;
    }

    @JsonProperty("BackOrderShipmentStatuses")
    public void setBackOrderShipmentStatuses(BaseRecordSchema<BackOrderShipmentStatusSchema> backOrderShipmentStatuses) {
        this.backOrderShipmentStatuses = backOrderShipmentStatuses;
    }

    @JsonProperty("SalesDocumentTypes")
    public BaseRecordSchema<SalesDocumentTypeSchema> getSalesDocumentTypes() {
        return salesDocumentTypes;
    }

    @JsonProperty("SalesDocumentTypes")
    public void setSalesDocumentTypes(BaseRecordSchema<SalesDocumentTypeSchema> salesDocumentTypes) {
        this.salesDocumentTypes = salesDocumentTypes;
    }

    @JsonProperty("CustShipmentMethods")
    public BaseRecordSchema<CustShipmentMethodSchema> getCustShipmentMethods() {
        return custShipmentMethods;
    }

    @JsonProperty("CustShipmentMethods")
    public void setCustShipmentMethods(BaseRecordSchema<CustShipmentMethodSchema> custShipmentMethods) {
        this.custShipmentMethods = custShipmentMethods;
    }

    @JsonProperty("SalesTypes")
    public BaseRecordSchema<SalesTypeSchema> getSalesTypes() {
        return salesTypes;
    }

    @JsonProperty("SalesTypes")
    public void setSalesTypes(BaseRecordSchema<SalesTypeSchema> salesTypes) {
        this.salesTypes = salesTypes;
    }

    @JsonProperty("Municipalities")
    public BaseRecordSchema<MunicipalitySchema> getMunicipalities() {
        return municipalities;
    }

    @JsonProperty("Municipalities")
    public void setMunicipalities(BaseRecordSchema<MunicipalitySchema> municipalities) {
        this.municipalities = municipalities;
    }

    @JsonProperty("SLDirections")
    public BaseRecordSchema<SLDirectionSchema> getsLDirections() {
        return sLDirections;
    }

    @JsonProperty("SLDirections")
    public void setsLDirections(BaseRecordSchema<SLDirectionSchema> sLDirections) {
        this.sLDirections = sLDirections;
    }

    @JsonProperty("VisitResults")
    public BaseRecordSchema<VisitResultSchema> getVisitResults() {
        return visitResults;
    }

    @JsonProperty("VisitResults")
    public void setVisitResults(BaseRecordSchema<VisitResultSchema> visitResults) {
        this.visitResults = visitResults;
    }

    @JsonProperty("CustPaymentMethods")
    public BaseRecordSchema<CustPaymentMethodSchema> getCustPaymentMethods() {
        return custPaymentMethods;
    }

    @JsonProperty("CustPaymentMethods")
    public void setCustPaymentMethods(BaseRecordSchema<CustPaymentMethodSchema> custPaymentMethods) {
        this.custPaymentMethods = custPaymentMethods;
    }

    @JsonProperty("DocumentVerificationStatuses")
    public BaseRecordSchema<DocumentVerificationStatusSchema> getDocumentVerificationStatuses() {
        return documentVerificationStatuses;
    }

    @JsonProperty("DocumentVerificationStatuses")
    public void setDocumentVerificationStatuses(BaseRecordSchema<DocumentVerificationStatusSchema> documentVerificationStatuses) {
        this.documentVerificationStatuses = documentVerificationStatuses;
    }

    @JsonProperty("PostalCodesAndCities")
    public BaseRecordSchema<PostalCodesAndCitySchema> getPostalCodesAndCities() {
        return postalCodesAndCities;
    }

    @JsonProperty("PostalCodesAndCities")
    public void setPostalCodesAndCities(BaseRecordSchema<PostalCodesAndCitySchema> postalCodesAndCities) {
        this.postalCodesAndCities = postalCodesAndCities;
    }

    @JsonProperty("ItemUnitOfMeasures")
    public BaseRecordSchema<ItemUnitOfMeasuresSchema> getItemUnitOfMeasures() {
        return itemUnitOfMeasures;
    }

    @JsonProperty("ItemUnitOfMeasures")
    public void setItemUnitOfMeasures(BaseRecordSchema<ItemUnitOfMeasuresSchema> itemUnitOfMeasures) {
        this.itemUnitOfMeasures = itemUnitOfMeasures;
    }

    @JsonProperty("Warehouses")
    public BaseRecordSchema<WarehouseSchema> getWarehouses() {
        return warehouses;
    }

    @JsonProperty("Warehouses")
    public void setWarehouses(BaseRecordSchema<WarehouseSchema> warehouses) {
        this.warehouses = warehouses;
    }

    @JsonProperty("CommentsTargets")
    public BaseRecordSchema<CommentsTargetSchema> getCommentsTargets() {
        return commentsTargets;
    }

    @JsonProperty("CommentsTargets")
    public void setCommentsTargets(BaseRecordSchema<CommentsTargetSchema> commentsTargets) {
        this.commentsTargets = commentsTargets;
    }

    @JsonProperty("DocumentTypes")
    public BaseRecordSchema<DocumentTypeSchema> getDocumentTypes() {
        return documentTypes;
    }

    @JsonProperty("DocumentTypes")
    public void setDocumentTypes(BaseRecordSchema<DocumentTypeSchema> documentTypes) {
        this.documentTypes = documentTypes;
    }

    @JsonProperty("SalesDocumentConditions")
    public BaseRecordSchema<SalesDocumentConditionSchema> getSalesDocumentConditions() {
        return salesDocumentConditions;
    }

    @JsonProperty("SalesDocumentConditions")
    public void setSalesDocumentConditions(BaseRecordSchema<SalesDocumentConditionSchema> salesDocumentConditions) {
        this.salesDocumentConditions = salesDocumentConditions;
    }

    @JsonProperty("CustomLists")
    public BaseRecordSchema<CustomListSchema> getCustomLists() {
        return customLists;
    }

    @JsonProperty("CustomLists")
    public void setCustomLists(BaseRecordSchema<CustomListSchema> customLists) {
        this.customLists = customLists;
    }

    @JsonProperty("SLCustomerCardColors")
    public BaseRecordSchema<SLCustomerCardColorSchema> getsLCustomerCardColors() {
        return sLCustomerCardColors;
    }

    @JsonProperty("SLCustomerCardColors")
    public void setsLCustomerCardColors(BaseRecordSchema<SLCustomerCardColorSchema> sLCustomerCardColors) {
        this.sLCustomerCardColors = sLCustomerCardColors;
    }

    @JsonProperty("CategoriesOfItems")
    public BaseRecordSchema<CategoriesOfItemSchema> getCategoriesOfItems() {
        return categoriesOfItems;
    }

    @JsonProperty("CategoriesOfItems")
    public void setCategoriesOfItems(BaseRecordSchema<CategoriesOfItemSchema> categoriesOfItems) {
        this.categoriesOfItems = categoriesOfItems;
    }

    @JsonProperty("CustPaymentConditions")
    public BaseRecordSchema<CustPaymentConditionSchema> getCustPaymentConditions() {
        return custPaymentConditions;
    }

    @JsonProperty("CustPaymentConditions")
    public void setCustPaymentConditions(BaseRecordSchema<CustPaymentConditionSchema> custPaymentConditions) {
        this.custPaymentConditions = custPaymentConditions;
    }

    @JsonProperty("ItemStatuses")
    public BaseRecordSchema<ItemStatusSchema> getItemStatuses() {
        return itemStatuses;
    }

    @JsonProperty("ItemStatuses")
    public void setItemStatuses(BaseRecordSchema<ItemStatusSchema> itemStatuses) {
        this.itemStatuses = itemStatuses;
    }

    @JsonProperty("CreatedDocumentStatuses")
    public BaseRecordSchema<CreatedDocumentStatusSchema> getCreatedDocumentStatuses() {
        return createdDocumentStatuses;
    }

    @JsonProperty("CreatedDocumentStatuses")
    public void setCreatedDocumentStatuses(BaseRecordSchema<CreatedDocumentStatusSchema> createdDocumentStatuses) {
        this.createdDocumentStatuses = createdDocumentStatuses;
    }

    @JsonProperty("TransactionTypes")
    public BaseRecordSchema<TransactionTypeSchema> getTransactionTypes() {
        return transactionTypes;
    }

    @JsonProperty("TransactionTypes")
    public void setTransactionTypes(BaseRecordSchema<TransactionTypeSchema> transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    @JsonProperty("ServiceOrdersStatuses")
    public BaseRecordSchema<ServiceOrderStatusSchema> getServiceOrderStatuses() {
        return serviceOrderStatuses;
    }

    @JsonProperty("ServiceOrdersStatuses")
    public void setServiceOrderStatuses(BaseRecordSchema<ServiceOrderStatusSchema> serviceOrderStatuses) {
        this.serviceOrderStatuses = serviceOrderStatuses;
    }

    @JsonProperty("ServiceClassificationTypes")
    public BaseRecordSchema<ServiceClassificationTypesSchema> getServiceClassificationTypes() {
        return serviceClassificationTypes;
    }

    @JsonProperty("ServiceClassificationTypes")
    public void setServiceClassificationTypes(BaseRecordSchema<ServiceClassificationTypesSchema> serviceClassificationTypes) {
        this.serviceClassificationTypes = serviceClassificationTypes;
    }

    @JsonProperty("ServiceClassification")
    public BaseRecordSchema<ServiceClassificationSchema> getServiceClassification() {
        return serviceClassification;
    }

    @JsonProperty("ServiceClassification")
    public void setServiceClassification(BaseRecordSchema<ServiceClassificationSchema> serviceClassification) {
        this.serviceClassification = serviceClassification;
    }

    @JsonProperty("Users")
    public BaseRecordSchema<UserSchema> getUsersSchema() {
        return usersSchema;
    }

    @JsonProperty("Users")
    public void setUsersSchema(BaseRecordSchema<UserSchema> usersSchema) {
        this.usersSchema = usersSchema;
    }

    @JsonProperty("GroupOfCustomersCategoryItems")
    public BaseRecordSchema<GroupOfCustomersCategoryItemSchema> getGroupOfCustomersCategoryItemsSchema() {
        return groupOfCustomersCategoryItemsSchema;
    }

    @JsonProperty("GroupOfCustomersCategoryItems")
    public void setGroupOfCustomersCategoryItemsSchema(BaseRecordSchema<GroupOfCustomersCategoryItemSchema> groupOfCustomersCategoryItemsSchema) {
        this.groupOfCustomersCategoryItemsSchema = groupOfCustomersCategoryItemsSchema;
    }

    @JsonProperty("CustomListsHeaders")
    public BaseRecordSchema<CustomListsHeaderSchema> getCustomListsHeaderSchema() {
        return customListsHeaderSchema;
    }

    @JsonProperty("CustomListsHeaders")
    public void setCustomListsHeaderSchema(BaseRecordSchema<CustomListsHeaderSchema> customListsHeaderSchema) {
        this.customListsHeaderSchema = customListsHeaderSchema;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}