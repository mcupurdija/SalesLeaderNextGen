package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

import org.joda.time.DateTime;

@Entity(tableName = "ServiceOrders")
public class ServiceOrderEntity extends BaseColumns {

    private int serverId;
    private String serviceOrderNo;
    private DateTime serviceOrderDate;
    private int customerId;
    private int customerShipToAddressId;
    private int itemId;
    private String reclamationText;
    private String phoneNo;
    private String note;
    private int quantityForReclamation;
    private String service;
    private boolean notifyCourier;
    private String serviceClassificationCallCode;
    private int serviceClassificationCallId;
    private String serviceClassificationProblemCode;
    private int serviceClassificationProblemId;
    private String contactPersonCode;
    private String invoiceNo;
    private String shipmentMethodCode;
    private String remarksNote;
    private String serialNo;
    private boolean sent;

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public DateTime getServiceOrderDate() {
        return serviceOrderDate;
    }

    public void setServiceOrderDate(DateTime serviceOrderDate) {
        this.serviceOrderDate = serviceOrderDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(int customerShipToAddressId) {
        this.customerShipToAddressId = customerShipToAddressId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getReclamationText() {
        return reclamationText;
    }

    public void setReclamationText(String reclamationText) {
        this.reclamationText = reclamationText;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getQuantityForReclamation() {
        return quantityForReclamation;
    }

    public void setQuantityForReclamation(int quantityForReclamation) {
        this.quantityForReclamation = quantityForReclamation;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public boolean isNotifyCourier() {
        return notifyCourier;
    }

    public void setNotifyCourier(boolean notifyCourier) {
        this.notifyCourier = notifyCourier;
    }

    public String getServiceClassificationCallCode() {
        return serviceClassificationCallCode;
    }

    public void setServiceClassificationCallCode(String serviceClassificationCallCode) {
        this.serviceClassificationCallCode = serviceClassificationCallCode;
    }

    public int getServiceClassificationCallId() {
        return serviceClassificationCallId;
    }

    public void setServiceClassificationCallId(int serviceClassificationCallId) {
        this.serviceClassificationCallId = serviceClassificationCallId;
    }

    public String getServiceClassificationProblemCode() {
        return serviceClassificationProblemCode;
    }

    public void setServiceClassificationProblemCode(String serviceClassificationProblemCode) {
        this.serviceClassificationProblemCode = serviceClassificationProblemCode;
    }

    public int getServiceClassificationProblemId() {
        return serviceClassificationProblemId;
    }

    public void setServiceClassificationProblemId(int serviceClassificationProblemId) {
        this.serviceClassificationProblemId = serviceClassificationProblemId;
    }

    public String getContactPersonCode() {
        return contactPersonCode;
    }

    public void setContactPersonCode(String contactPersonCode) {
        this.contactPersonCode = contactPersonCode;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getShipmentMethodCode() {
        return shipmentMethodCode;
    }

    public void setShipmentMethodCode(String shipmentMethodCode) {
        this.shipmentMethodCode = shipmentMethodCode;
    }

    public String getRemarksNote() {
        return remarksNote;
    }

    public void setRemarksNote(String remarksNote) {
        this.remarksNote = remarksNote;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}
