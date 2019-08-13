package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "Visits")
public class VisitEntity extends BaseAuditColumns {

    private int visitType;
    private int visitResult;
    private int visitSubResultId;
    private int visitStatus;
    private DateTime visitDate;
    private DateTime visitArrivalTime;
    private DateTime visitDepartureTime;
    private int customerId;
    private int employeeId;
    private int odometerValue;
    private int customerShipToAddressId;
    private String description;
    private String gpsLatitude;
    private String gpsLongitude;
    private String gpsAccuracy;
    private String gpsLatitudeEnd;
    private String gpsLongitudeEnd;
    private String gpsAccuracyEnd;
    private String telephoneRealizationDuration;
    private int plannedVisitId;
    private int documentHeaderId;
    private int commentId;
    private boolean onCustomerLocation;
    private boolean sent;
    private boolean deleted;

    public int getVisitType() {
        return visitType;
    }

    public void setVisitType(int visitType) {
        this.visitType = visitType;
    }

    public int getVisitResult() {
        return visitResult;
    }

    public void setVisitResult(int visitResult) {
        this.visitResult = visitResult;
    }

    public int getVisitSubResultId() {
        return visitSubResultId;
    }

    public void setVisitSubResultId(int visitSubResultId) {
        this.visitSubResultId = visitSubResultId;
    }

    public int getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(int visitStatus) {
        this.visitStatus = visitStatus;
    }

    public DateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(DateTime visitDate) {
        this.visitDate = visitDate;
    }

    public DateTime getVisitArrivalTime() {
        return visitArrivalTime;
    }

    public void setVisitArrivalTime(DateTime visitArrivalTime) {
        this.visitArrivalTime = visitArrivalTime;
    }

    public DateTime getVisitDepartureTime() {
        return visitDepartureTime;
    }

    public void setVisitDepartureTime(DateTime visitDepartureTime) {
        this.visitDepartureTime = visitDepartureTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getOdometerValue() {
        return odometerValue;
    }

    public void setOdometerValue(int odometerValue) {
        this.odometerValue = odometerValue;
    }

    public int getCustomerShipToAddressId() {
        return customerShipToAddressId;
    }

    public void setCustomerShipToAddressId(int customerShipToAddressId) {
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

    public int getPlannedVisitId() {
        return plannedVisitId;
    }

    public void setPlannedVisitId(int plannedVisitId) {
        this.plannedVisitId = plannedVisitId;
    }

    public int getDocumentHeaderId() {
        return documentHeaderId;
    }

    public void setDocumentHeaderId(int documentHeaderId) {
        this.documentHeaderId = documentHeaderId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public boolean isOnCustomerLocation() {
        return onCustomerLocation;
    }

    public void setOnCustomerLocation(boolean onCustomerLocation) {
        this.onCustomerLocation = onCustomerLocation;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
