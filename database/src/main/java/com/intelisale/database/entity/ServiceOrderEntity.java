package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseColumns;

@Entity(tableName = "ServiceOrders")
public class ServiceOrderEntity extends BaseColumns {

    private Integer serverId;
    private String serviceOrderNo;
    private String serviceOrderDate;
    private Integer customerId;
    private Integer customerShipToAddressId;
    private Integer itemId;
    private String reclamationText;
    private String phoneNo;
    private String note;
    private Integer quantityForReclamation;
    private String service;
    private Boolean notifyCourier;
    private String serviceClassificationCallCode;
    private Integer serviceClassificationCallId;
    private String serviceClassificationProblemCode;
    private Integer serviceClassificationProblemId;
    private String contactPersonCode;
    private String invoiceNo;
    private String shipmentMethodCode;
    private String remarksNote;
    private String serialNo;
    private Boolean sent;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getServiceOrderDate() {
        return serviceOrderDate;
    }

    public void setServiceOrderDate(String serviceOrderDate) {
        this.serviceOrderDate = serviceOrderDate;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(Integer customerShipToAddressId) {
        this.customerShipToAddressId = customerShipToAddressId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
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

    public Integer getQuantityForReclamation() {
        return quantityForReclamation;
    }

    public void setQuantityForReclamation(Integer quantityForReclamation) {
        this.quantityForReclamation = quantityForReclamation;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Boolean isNotifyCourier() {
        return notifyCourier;
    }

    public void setNotifyCourier(Boolean notifyCourier) {
        this.notifyCourier = notifyCourier;
    }

    public String getServiceClassificationCallCode() {
        return serviceClassificationCallCode;
    }

    public void setServiceClassificationCallCode(String serviceClassificationCallCode) {
        this.serviceClassificationCallCode = serviceClassificationCallCode;
    }

    public Integer getServiceClassificationCallId() {
        return serviceClassificationCallId;
    }

    public void setServiceClassificationCallId(Integer serviceClassificationCallId) {
        this.serviceClassificationCallId = serviceClassificationCallId;
    }

    public String getServiceClassificationProblemCode() {
        return serviceClassificationProblemCode;
    }

    public void setServiceClassificationProblemCode(String serviceClassificationProblemCode) {
        this.serviceClassificationProblemCode = serviceClassificationProblemCode;
    }

    public Integer getServiceClassificationProblemId() {
        return serviceClassificationProblemId;
    }

    public void setServiceClassificationProblemId(Integer serviceClassificationProblemId) {
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

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}
