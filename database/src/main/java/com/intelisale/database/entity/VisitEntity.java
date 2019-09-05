package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Visits")
public class VisitEntity extends BaseAuditColumns {

    private Integer visitType;
    private Integer visitResult;
    private Integer visitSubResultId;
    private Integer visitStatus;
    private String visitDate;
    private String visitArrivalTime;
    private String visitDepartureTime;
    private Integer customerId;
    private Integer employeeId;
    private Integer odometerValue;
    private Integer customerShipToAddressId;
    private String description;
    private String gpsLatitude;
    private String gpsLongitude;
    private String gpsAccuracy;
    private String gpsLatitudeEnd;
    private String gpsLongitudeEnd;
    private String gpsAccuracyEnd;
    private String telephoneRealizationDuration;
    private Integer plannedVisitId;
    private Integer documentHeaderId;
    private Integer commentId;
    private Boolean onCustomerLocation;
    private Boolean sent;
    private Boolean deleted;

    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    public Integer getVisitResult() {
        return visitResult;
    }

    public void setVisitResult(Integer visitResult) {
        this.visitResult = visitResult;
    }

    public Integer getVisitSubResultId() {
        return visitSubResultId;
    }

    public void setVisitSubResultId(Integer visitSubResultId) {
        this.visitSubResultId = visitSubResultId;
    }

    public Integer getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(Integer visitStatus) {
        this.visitStatus = visitStatus;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitArrivalTime() {
        return visitArrivalTime;
    }

    public void setVisitArrivalTime(String visitArrivalTime) {
        this.visitArrivalTime = visitArrivalTime;
    }

    public String getVisitDepartureTime() {
        return visitDepartureTime;
    }

    public void setVisitDepartureTime(String visitDepartureTime) {
        this.visitDepartureTime = visitDepartureTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getOdometerValue() {
        return odometerValue;
    }

    public void setOdometerValue(Integer odometerValue) {
        this.odometerValue = odometerValue;
    }

    public Integer getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(Integer customerShipToAddressId) {
        this.customerShipToAddressId = customerShipToAddressId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    public void setGpsAccuracy(String gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
    }

    public String getGpsLatitudeEnd() {
        return gpsLatitudeEnd;
    }

    public void setGpsLatitudeEnd(String gpsLatitudeEnd) {
        this.gpsLatitudeEnd = gpsLatitudeEnd;
    }

    public String getGpsLongitudeEnd() {
        return gpsLongitudeEnd;
    }

    public void setGpsLongitudeEnd(String gpsLongitudeEnd) {
        this.gpsLongitudeEnd = gpsLongitudeEnd;
    }

    public String getGpsAccuracyEnd() {
        return gpsAccuracyEnd;
    }

    public void setGpsAccuracyEnd(String gpsAccuracyEnd) {
        this.gpsAccuracyEnd = gpsAccuracyEnd;
    }

    public String getTelephoneRealizationDuration() {
        return telephoneRealizationDuration;
    }

    public void setTelephoneRealizationDuration(String telephoneRealizationDuration) {
        this.telephoneRealizationDuration = telephoneRealizationDuration;
    }

    public Integer getPlannedVisitId() {
        return plannedVisitId;
    }

    public void setPlannedVisitId(Integer plannedVisitId) {
        this.plannedVisitId = plannedVisitId;
    }

    public Integer getDocumentHeaderId() {
        return documentHeaderId;
    }

    public void setDocumentHeaderId(Integer documentHeaderId) {
        this.documentHeaderId = documentHeaderId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Boolean isOnCustomerLocation() {
        return onCustomerLocation;
    }

    public void setOnCustomerLocation(Boolean onCustomerLocation) {
        this.onCustomerLocation = onCustomerLocation;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
