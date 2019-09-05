package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "SaleOrderHeaders")
public class SaleOrderHeaderEntity extends BaseAuditColumns {

    private Integer documentTypeId;
    private String salesDocumentDeviceNo;
    private String salesDocumentNo;
    private Integer customerId;
    private String documentDate;
    private Integer warehouseId;
    private Integer visitId;
    private String externalDocumentNo;
    private Integer createdByUserId;
    private Integer employeeId;
    private Integer customerShipToAddressId;
    private Integer paymentMethodId;
    private Integer customerPaymentConditionId;
    private Integer shipmentMethodId;
    private Integer contactId;
    private String sellToContact;
    private String sellToContactPhone;
    private String quoteNo;
    private Integer backOrderShipmentStatusId;
    private Boolean hideDiscountOnInvoice;
    private String emailForSendingDocument;
    private Double totalLinesAmount;
    private Double totalDiscount;
    private Double invoiceDiscountPercent;
    private Double invoiceDiscAmountWithoutVAT;
    private Double invoiceDiscAmountWithVAT;
    private Double totalAmountWithoutVAT;
    private Double totalAmountWithVAT;
    private String requestedDeliveryDate;
    private String documentValidUntil;
    private Integer salesDocumentConditionId;
    private Integer salesDocumentTypeId;
    private Integer pricesIncludedVAT;
    private String noteInternal;
    private String noteForCustomer;
    private Integer documentVerificationStatusId;
    private Integer selectedFromAllItemsCounter;
    private Integer timeOnThePhone;
    private Double currMaxDiscountTotalAmountDifference;
    private String documentSentDate;
    private Boolean declaration;
    private Boolean discountUsed;
    private Boolean verified;
    private Boolean sent;

    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getSalesDocumentDeviceNo() {
        return salesDocumentDeviceNo;
    }

    public void setSalesDocumentDeviceNo(String salesDocumentDeviceNo) {
        this.salesDocumentDeviceNo = salesDocumentDeviceNo;
    }

    public String getSalesDocumentNo() {
        return salesDocumentNo;
    }

    public void setSalesDocumentNo(String salesDocumentNo) {
        this.salesDocumentNo = salesDocumentNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public String getExternalDocumentNo() {
        return externalDocumentNo;
    }

    public void setExternalDocumentNo(String externalDocumentNo) {
        this.externalDocumentNo = externalDocumentNo;
    }

    public Integer getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(Integer createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(Integer customerShipToAddressId) {
        this.customerShipToAddressId = customerShipToAddressId;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getCustomerPaymentConditionId() {
        return customerPaymentConditionId;
    }

    public void setCustomerPaymentConditionId(Integer customerPaymentConditionId) {
        this.customerPaymentConditionId = customerPaymentConditionId;
    }

    public Integer getShipmentMethodId() {
        return shipmentMethodId;
    }

    public void setShipmentMethodId(Integer shipmentMethodId) {
        this.shipmentMethodId = shipmentMethodId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getSellToContact() {
        return sellToContact;
    }

    public void setSellToContact(String sellToContact) {
        this.sellToContact = sellToContact;
    }

    public String getSellToContactPhone() {
        return sellToContactPhone;
    }

    public void setSellToContactPhone(String sellToContactPhone) {
        this.sellToContactPhone = sellToContactPhone;
    }

    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    public Integer getBackOrderShipmentStatusId() {
        return backOrderShipmentStatusId;
    }

    public void setBackOrderShipmentStatusId(Integer backOrderShipmentStatusId) {
        this.backOrderShipmentStatusId = backOrderShipmentStatusId;
    }

    public Boolean isHideDiscountOnInvoice() {
        return hideDiscountOnInvoice;
    }

    public void setHideDiscountOnInvoice(Boolean hideDiscountOnInvoice) {
        this.hideDiscountOnInvoice = hideDiscountOnInvoice;
    }

    public String getEmailForSendingDocument() {
        return emailForSendingDocument;
    }

    public void setEmailForSendingDocument(String emailForSendingDocument) {
        this.emailForSendingDocument = emailForSendingDocument;
    }

    public Double getTotalLinesAmount() {
        return totalLinesAmount;
    }

    public void setTotalLinesAmount(Double totalLinesAmount) {
        this.totalLinesAmount = totalLinesAmount;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getInvoiceDiscountPercent() {
        return invoiceDiscountPercent;
    }

    public void setInvoiceDiscountPercent(Double invoiceDiscountPercent) {
        this.invoiceDiscountPercent = invoiceDiscountPercent;
    }

    public Double getInvoiceDiscAmountWithoutVAT() {
        return invoiceDiscAmountWithoutVAT;
    }

    public void setInvoiceDiscAmountWithoutVAT(Double invoiceDiscAmountWithoutVAT) {
        this.invoiceDiscAmountWithoutVAT = invoiceDiscAmountWithoutVAT;
    }

    public Double getInvoiceDiscAmountWithVAT() {
        return invoiceDiscAmountWithVAT;
    }

    public void setInvoiceDiscAmountWithVAT(Double invoiceDiscAmountWithVAT) {
        this.invoiceDiscAmountWithVAT = invoiceDiscAmountWithVAT;
    }

    public Double getTotalAmountWithoutVAT() {
        return totalAmountWithoutVAT;
    }

    public void setTotalAmountWithoutVAT(Double totalAmountWithoutVAT) {
        this.totalAmountWithoutVAT = totalAmountWithoutVAT;
    }

    public Double getTotalAmountWithVAT() {
        return totalAmountWithVAT;
    }

    public void setTotalAmountWithVAT(Double totalAmountWithVAT) {
        this.totalAmountWithVAT = totalAmountWithVAT;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getDocumentValidUntil() {
        return documentValidUntil;
    }

    public void setDocumentValidUntil(String documentValidUntil) {
        this.documentValidUntil = documentValidUntil;
    }

    public Integer getSalesDocumentConditionId() {
        return salesDocumentConditionId;
    }

    public void setSalesDocumentConditionId(Integer salesDocumentConditionId) {
        this.salesDocumentConditionId = salesDocumentConditionId;
    }

    public Integer getSalesDocumentTypeId() {
        return salesDocumentTypeId;
    }

    public void setSalesDocumentTypeId(Integer salesDocumentTypeId) {
        this.salesDocumentTypeId = salesDocumentTypeId;
    }

    public Integer getPricesIncludedVAT() {
        return pricesIncludedVAT;
    }

    public void setPricesIncludedVAT(Integer pricesIncludedVAT) {
        this.pricesIncludedVAT = pricesIncludedVAT;
    }

    public String getNoteInternal() {
        return noteInternal;
    }

    public void setNoteInternal(String noteInternal) {
        this.noteInternal = noteInternal;
    }

    public String getNoteForCustomer() {
        return noteForCustomer;
    }

    public void setNoteForCustomer(String noteForCustomer) {
        this.noteForCustomer = noteForCustomer;
    }

    public Integer getDocumentVerificationStatusId() {
        return documentVerificationStatusId;
    }

    public void setDocumentVerificationStatusId(Integer documentVerificationStatusId) {
        this.documentVerificationStatusId = documentVerificationStatusId;
    }

    public Integer getSelectedFromAllItemsCounter() {
        return selectedFromAllItemsCounter;
    }

    public void setSelectedFromAllItemsCounter(Integer selectedFromAllItemsCounter) {
        this.selectedFromAllItemsCounter = selectedFromAllItemsCounter;
    }

    public Integer getTimeOnThePhone() {
        return timeOnThePhone;
    }

    public void setTimeOnThePhone(Integer timeOnThePhone) {
        this.timeOnThePhone = timeOnThePhone;
    }

    public Double getCurrMaxDiscountTotalAmountDifference() {
        return currMaxDiscountTotalAmountDifference;
    }

    public void setCurrMaxDiscountTotalAmountDifference(Double currMaxDiscountTotalAmountDifference) {
        this.currMaxDiscountTotalAmountDifference = currMaxDiscountTotalAmountDifference;
    }

    public String getDocumentSentDate() {
        return documentSentDate;
    }

    public void setDocumentSentDate(String documentSentDate) {
        this.documentSentDate = documentSentDate;
    }

    public Boolean isDeclaration() {
        return declaration;
    }

    public void setDeclaration(Boolean declaration) {
        this.declaration = declaration;
    }

    public Boolean isDiscountUsed() {
        return discountUsed;
    }

    public void setDiscountUsed(Boolean discountUsed) {
        this.discountUsed = discountUsed;
    }

    public Boolean isVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
