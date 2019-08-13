package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "SaleOrderHeaders")
public class SaleOrderHeaderEntity extends BaseAuditColumns {

    private int documentTypeId;
    private String salesDocumentDeviceNo;
    private String salesDocumentNo;
    private int customerId;
    private DateTime documentDate;
    private int warehouseId;
    private int visitId;
    private String externalDocumentNo;
    private int createdByUserId;
    private int employeeId;
    private int customerShipToAddressId;
    private int paymentMethodId;
    private int customerPaymentConditionId;
    private int shipmentMethodId;
    private int contactId;
    private String sellToContact;
    private String sellToContactPhone;
    private String quoteNo;
    private int backOrderShipmentStatusId;
    private boolean hideDiscountOnInvoice;
    private String emailForSendingDocument;
    private double totalLinesAmount;
    private double totalDiscount;
    private double invoiceDiscountPercent;
    private double invoiceDiscAmountWithoutVAT;
    private double invoiceDiscAmountWithVAT;
    private double totalAmountWithoutVAT;
    private double totalAmountWithVAT;
    private DateTime requestedDeliveryDate;
    private String documentValidUntil;
    private int salesDocumentConditionId;
    private int salesDocumentTypeId;
    private int pricesIncludedVAT;
    private String noteInternal;
    private String noteForCustomer;
    private int documentVerificationStatusId;
    private int selectedFromAllItemsCounter;
    private int timeOnThePhone;
    private double currMaxDiscountTotalAmountDifference;
    private DateTime documentSentDate;
    private boolean declaration;
    private boolean discountUsed;
    private boolean verified;
    private boolean sent;

    public int getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(int documentTypeId) {
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public DateTime getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(DateTime documentDate) {
        this.documentDate = documentDate;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public String getExternalDocumentNo() {
        return externalDocumentNo;
    }

    public void setExternalDocumentNo(String externalDocumentNo) {
        this.externalDocumentNo = externalDocumentNo;
    }

    public int getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(int createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(int customerShipToAddressId) {
        this.customerShipToAddressId = customerShipToAddressId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public int getCustomerPaymentConditionId() {
        return customerPaymentConditionId;
    }

    public void setCustomerPaymentConditionId(int customerPaymentConditionId) {
        this.customerPaymentConditionId = customerPaymentConditionId;
    }

    public int getShipmentMethodId() {
        return shipmentMethodId;
    }

    public void setShipmentMethodId(int shipmentMethodId) {
        this.shipmentMethodId = shipmentMethodId;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
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

    public int getBackOrderShipmentStatusId() {
        return backOrderShipmentStatusId;
    }

    public void setBackOrderShipmentStatusId(int backOrderShipmentStatusId) {
        this.backOrderShipmentStatusId = backOrderShipmentStatusId;
    }

    public boolean isHideDiscountOnInvoice() {
        return hideDiscountOnInvoice;
    }

    public void setHideDiscountOnInvoice(boolean hideDiscountOnInvoice) {
        this.hideDiscountOnInvoice = hideDiscountOnInvoice;
    }

    public String getEmailForSendingDocument() {
        return emailForSendingDocument;
    }

    public void setEmailForSendingDocument(String emailForSendingDocument) {
        this.emailForSendingDocument = emailForSendingDocument;
    }

    public double getTotalLinesAmount() {
        return totalLinesAmount;
    }

    public void setTotalLinesAmount(double totalLinesAmount) {
        this.totalLinesAmount = totalLinesAmount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getInvoiceDiscountPercent() {
        return invoiceDiscountPercent;
    }

    public void setInvoiceDiscountPercent(double invoiceDiscountPercent) {
        this.invoiceDiscountPercent = invoiceDiscountPercent;
    }

    public double getInvoiceDiscAmountWithoutVAT() {
        return invoiceDiscAmountWithoutVAT;
    }

    public void setInvoiceDiscAmountWithoutVAT(double invoiceDiscAmountWithoutVAT) {
        this.invoiceDiscAmountWithoutVAT = invoiceDiscAmountWithoutVAT;
    }

    public double getInvoiceDiscAmountWithVAT() {
        return invoiceDiscAmountWithVAT;
    }

    public void setInvoiceDiscAmountWithVAT(double invoiceDiscAmountWithVAT) {
        this.invoiceDiscAmountWithVAT = invoiceDiscAmountWithVAT;
    }

    public double getTotalAmountWithoutVAT() {
        return totalAmountWithoutVAT;
    }

    public void setTotalAmountWithoutVAT(double totalAmountWithoutVAT) {
        this.totalAmountWithoutVAT = totalAmountWithoutVAT;
    }

    public double getTotalAmountWithVAT() {
        return totalAmountWithVAT;
    }

    public void setTotalAmountWithVAT(double totalAmountWithVAT) {
        this.totalAmountWithVAT = totalAmountWithVAT;
    }

    public DateTime getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(DateTime requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getDocumentValidUntil() {
        return documentValidUntil;
    }

    public void setDocumentValidUntil(String documentValidUntil) {
        this.documentValidUntil = documentValidUntil;
    }

    public int getSalesDocumentConditionId() {
        return salesDocumentConditionId;
    }

    public void setSalesDocumentConditionId(int salesDocumentConditionId) {
        this.salesDocumentConditionId = salesDocumentConditionId;
    }

    public int getSalesDocumentTypeId() {
        return salesDocumentTypeId;
    }

    public void setSalesDocumentTypeId(int salesDocumentTypeId) {
        this.salesDocumentTypeId = salesDocumentTypeId;
    }

    public int getPricesIncludedVAT() {
        return pricesIncludedVAT;
    }

    public void setPricesIncludedVAT(int pricesIncludedVAT) {
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

    public int getDocumentVerificationStatusId() {
        return documentVerificationStatusId;
    }

    public void setDocumentVerificationStatusId(int documentVerificationStatusId) {
        this.documentVerificationStatusId = documentVerificationStatusId;
    }

    public int getSelectedFromAllItemsCounter() {
        return selectedFromAllItemsCounter;
    }

    public void setSelectedFromAllItemsCounter(int selectedFromAllItemsCounter) {
        this.selectedFromAllItemsCounter = selectedFromAllItemsCounter;
    }

    public int getTimeOnThePhone() {
        return timeOnThePhone;
    }

    public void setTimeOnThePhone(int timeOnThePhone) {
        this.timeOnThePhone = timeOnThePhone;
    }

    public double getCurrMaxDiscountTotalAmountDifference() {
        return currMaxDiscountTotalAmountDifference;
    }

    public void setCurrMaxDiscountTotalAmountDifference(double currMaxDiscountTotalAmountDifference) {
        this.currMaxDiscountTotalAmountDifference = currMaxDiscountTotalAmountDifference;
    }

    public DateTime getDocumentSentDate() {
        return documentSentDate;
    }

    public void setDocumentSentDate(DateTime documentSentDate) {
        this.documentSentDate = documentSentDate;
    }

    public boolean isDeclaration() {
        return declaration;
    }

    public void setDeclaration(boolean declaration) {
        this.declaration = declaration;
    }

    public boolean isDiscountUsed() {
        return discountUsed;
    }

    public void setDiscountUsed(boolean discountUsed) {
        this.discountUsed = discountUsed;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
