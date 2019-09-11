package com.intelisale.database.entity;

import androidx.room.Entity;
import androidx.room.Index;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = TableNames.CUSTOMERS, indices = {@Index(value = "serverID", unique = true)})
public class CustomerEntity extends BaseAuditColumns {

    private String customerCode;
    private String potentialCustomerCode;
    private Integer customerIDForCustomerBusinessUnit;
    private String customerBusinessUnitCode;
    private Boolean realCustomer;
    private String name;
    private String name2;
    private String address;
    private Integer postalCodeAndCityID;
    private String phone;
    private String mobile;
    private String email;
    private String mb;
    private String vatNo;
    private Double creditLimit;
    private Double balanceLcy;
    private Double balanceDueLcy;
    private Integer customerPaymentConditionID;
    private Integer customerDiscGroupID;
    private Integer customerPriceGroupID;
    private Integer groupOfCustomerID;
    private Integer secondaryGroupOfCustomerID;
    private String smlTurnover;
    private String sean;
    private Integer channel;
    private String blueCoatsNo;
    private String grayCoatsNo;
    private String potential;
    private String color;
    private String coefficient;
    private Double customerPersonalTurnover;
    private Double turnover3m;
    private Double turnover6m;
    private Double turnover12m;
    private Double turnoverYTM;
    private Double turnoverLastYear;
    private Double turnoverYear2;
    private Double turnoverYear3;
    private Double planCurrentYear;
    private Double planFulfillment;
    private Boolean existContractAgreement;
    private Boolean existTradeAgreement;
    private Boolean existOrsy;
    private Boolean existOrsy100;
    private Boolean buttonNo6;
    private String priority;
    private String reminderLevel;
    private String dateLastPayment;
    private String dateLastInvoice;
    private String dateOldestOpenInvoice;
    private Double gp;
    private Integer defaultCustomerShipToAddressID;
    private Integer employeeID;
    private Integer customerPaymentMethodID;
    private String gpsLatitude;
    private String gpsLongitude;
    private String gpsAccuracy;
    private Integer customerVATGroupID;
    private Double invoiceDiscountPercent;
    private String parentData;
    private String customerHierarchyData;
    private Integer customerTaskCount;
    private Boolean createFromPotential;
    private String primaryContactName;
    private String firstInvoiceDate;
    private String oldestOpenInvoiceDate;
    private String latestInvoiceDate;
    private String latestPaymentDate;
    private Double writeOff;
    private Double customer12MonthsPlan;
    private Double sinRadLat;
    private Double cosRadLat;
    private Double sinRadLong;
    private Double cosRadLong;
    private Double calculatedNumberOfVisits;
    private Double calculatedTimeAtCustomer;
    private Double visitProductivity6m;
    private Double balance1to30;
    private Double balance31to60;
    private Double balance61to90;
    private Double balance91toXyz;
    private Double balanceCritical;
    private Integer treasuryBill;
    private Double paymentAvgDays;
    private String fax;
    private String emailInvoices;
    private String emailReminders;
    private String dateOfLastVisit;
    private String contractType;
    private String pricingClass;
    private String fullCustomerCode;
    private Boolean centralOffice;
    private Integer primaryContactID;
    private String assignedUserCode;
    private String assignedUserName;
    private Boolean focusCustomer;
    private Boolean customerActive;
    private String tradeLicenseNum;
    private String tradeLicenseExp;
    private String tradeLicenseType;
    private Double targetContractTurnover;
    private Double contractRealizationPct;
    private String gallerySyncDate;
    private Boolean sent;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPotentialCustomerCode() {
        return potentialCustomerCode;
    }

    public void setPotentialCustomerCode(String potentialCustomerCode) {
        this.potentialCustomerCode = potentialCustomerCode;
    }

    public Integer getCustomerIDForCustomerBusinessUnit() {
        return customerIDForCustomerBusinessUnit;
    }

    public void setCustomerIDForCustomerBusinessUnit(Integer customerIDForCustomerBusinessUnit) {
        this.customerIDForCustomerBusinessUnit = customerIDForCustomerBusinessUnit;
    }

    public String getCustomerBusinessUnitCode() {
        return customerBusinessUnitCode;
    }

    public void setCustomerBusinessUnitCode(String customerBusinessUnitCode) {
        this.customerBusinessUnitCode = customerBusinessUnitCode;
    }

    public Boolean isRealCustomer() {
        return realCustomer;
    }

    public void setRealCustomer(Boolean realCustomer) {
        this.realCustomer = realCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalCodeAndCityID() {
        return postalCodeAndCityID;
    }

    public void setPostalCodeAndCityID(Integer postalCodeAndCityID) {
        this.postalCodeAndCityID = postalCodeAndCityID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMb() {
        return mb;
    }

    public void setMb(String mb) {
        this.mb = mb;
    }

    public String getVatNo() {
        return vatNo;
    }

    public void setVatNo(String vatNo) {
        this.vatNo = vatNo;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getBalanceLcy() {
        return balanceLcy;
    }

    public void setBalanceLcy(Double balanceLcy) {
        this.balanceLcy = balanceLcy;
    }

    public Double getBalanceDueLcy() {
        return balanceDueLcy;
    }

    public void setBalanceDueLcy(Double balanceDueLcy) {
        this.balanceDueLcy = balanceDueLcy;
    }

    public Integer getCustomerPaymentConditionID() {
        return customerPaymentConditionID;
    }

    public void setCustomerPaymentConditionID(Integer customerPaymentConditionID) {
        this.customerPaymentConditionID = customerPaymentConditionID;
    }

    public Integer getCustomerDiscGroupID() {
        return customerDiscGroupID;
    }

    public void setCustomerDiscGroupID(Integer customerDiscGroupID) {
        this.customerDiscGroupID = customerDiscGroupID;
    }

    public Integer getCustomerPriceGroupID() {
        return customerPriceGroupID;
    }

    public void setCustomerPriceGroupID(Integer customerPriceGroupID) {
        this.customerPriceGroupID = customerPriceGroupID;
    }

    public Integer getGroupOfCustomerID() {
        return groupOfCustomerID;
    }

    public void setGroupOfCustomerID(Integer groupOfCustomerID) {
        this.groupOfCustomerID = groupOfCustomerID;
    }

    public Integer getSecondaryGroupOfCustomerID() {
        return secondaryGroupOfCustomerID;
    }

    public void setSecondaryGroupOfCustomerID(Integer secondaryGroupOfCustomerID) {
        this.secondaryGroupOfCustomerID = secondaryGroupOfCustomerID;
    }

    public String getSmlTurnover() {
        return smlTurnover;
    }

    public void setSmlTurnover(String smlTurnover) {
        this.smlTurnover = smlTurnover;
    }

    public String getSean() {
        return sean;
    }

    public void setSean(String sean) {
        this.sean = sean;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getBlueCoatsNo() {
        return blueCoatsNo;
    }

    public void setBlueCoatsNo(String blueCoatsNo) {
        this.blueCoatsNo = blueCoatsNo;
    }

    public String getGrayCoatsNo() {
        return grayCoatsNo;
    }

    public void setGrayCoatsNo(String grayCoatsNo) {
        this.grayCoatsNo = grayCoatsNo;
    }

    public String getPotential() {
        return potential;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public Double getCustomerPersonalTurnover() {
        return customerPersonalTurnover;
    }

    public void setCustomerPersonalTurnover(Double customerPersonalTurnover) {
        this.customerPersonalTurnover = customerPersonalTurnover;
    }

    public Double getTurnover3m() {
        return turnover3m;
    }

    public void setTurnover3m(Double turnover3m) {
        this.turnover3m = turnover3m;
    }

    public Double getTurnover6m() {
        return turnover6m;
    }

    public void setTurnover6m(Double turnover6m) {
        this.turnover6m = turnover6m;
    }

    public Double getTurnover12m() {
        return turnover12m;
    }

    public void setTurnover12m(Double turnover12m) {
        this.turnover12m = turnover12m;
    }

    public Double getTurnoverYTM() {
        return turnoverYTM;
    }

    public void setTurnoverYTM(Double turnoverYTM) {
        this.turnoverYTM = turnoverYTM;
    }

    public Double getTurnoverLastYear() {
        return turnoverLastYear;
    }

    public void setTurnoverLastYear(Double turnoverLastYear) {
        this.turnoverLastYear = turnoverLastYear;
    }

    public Double getTurnoverYear2() {
        return turnoverYear2;
    }

    public void setTurnoverYear2(Double turnoverYear2) {
        this.turnoverYear2 = turnoverYear2;
    }

    public Double getTurnoverYear3() {
        return turnoverYear3;
    }

    public void setTurnoverYear3(Double turnoverYear3) {
        this.turnoverYear3 = turnoverYear3;
    }

    public Double getPlanCurrentYear() {
        return planCurrentYear;
    }

    public void setPlanCurrentYear(Double planCurrentYear) {
        this.planCurrentYear = planCurrentYear;
    }

    public Double getPlanFulfillment() {
        return planFulfillment;
    }

    public void setPlanFulfillment(Double planFulfillment) {
        this.planFulfillment = planFulfillment;
    }

    public Boolean isExistContractAgreement() {
        return existContractAgreement;
    }

    public void setExistContractAgreement(Boolean existContractAgreement) {
        this.existContractAgreement = existContractAgreement;
    }

    public Boolean isExistTradeAgreement() {
        return existTradeAgreement;
    }

    public void setExistTradeAgreement(Boolean existTradeAgreement) {
        this.existTradeAgreement = existTradeAgreement;
    }

    public Boolean isExistOrsy() {
        return existOrsy;
    }

    public void setExistOrsy(Boolean existOrsy) {
        this.existOrsy = existOrsy;
    }

    public Boolean isExistOrsy100() {
        return existOrsy100;
    }

    public void setExistOrsy100(Boolean existOrsy100) {
        this.existOrsy100 = existOrsy100;
    }

    public Boolean getButtonNo6() {
        return buttonNo6;
    }

    public void setButtonNo6(Boolean buttonNo6) {
        this.buttonNo6 = buttonNo6;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getReminderLevel() {
        return reminderLevel;
    }

    public void setReminderLevel(String reminderLevel) {
        this.reminderLevel = reminderLevel;
    }

    public String getDateLastPayment() {
        return dateLastPayment;
    }

    public void setDateLastPayment(String dateLastPayment) {
        this.dateLastPayment = dateLastPayment;
    }

    public String getDateLastInvoice() {
        return dateLastInvoice;
    }

    public void setDateLastInvoice(String dateLastInvoice) {
        this.dateLastInvoice = dateLastInvoice;
    }

    public String getDateOldestOpenInvoice() {
        return dateOldestOpenInvoice;
    }

    public void setDateOldestOpenInvoice(String dateOldestOpenInvoice) {
        this.dateOldestOpenInvoice = dateOldestOpenInvoice;
    }

    public Double getGp() {
        return gp;
    }

    public void setGp(Double gp) {
        this.gp = gp;
    }

    public Integer getDefaultCustomerShipToAddressID() {
        return defaultCustomerShipToAddressID;
    }

    public void setDefaultCustomerShipToAddressID(Integer defaultCustomerShipToAddressID) {
        this.defaultCustomerShipToAddressID = defaultCustomerShipToAddressID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getCustomerPaymentMethodID() {
        return customerPaymentMethodID;
    }

    public void setCustomerPaymentMethodID(Integer customerPaymentMethodID) {
        this.customerPaymentMethodID = customerPaymentMethodID;
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

    public Integer getCustomerVATGroupID() {
        return customerVATGroupID;
    }

    public void setCustomerVATGroupID(Integer customerVATGroupID) {
        this.customerVATGroupID = customerVATGroupID;
    }

    public Double getInvoiceDiscountPercent() {
        return invoiceDiscountPercent;
    }

    public void setInvoiceDiscountPercent(Double invoiceDiscountPercent) {
        this.invoiceDiscountPercent = invoiceDiscountPercent;
    }

    public String getParentData() {
        return parentData;
    }

    public void setParentData(String parentData) {
        this.parentData = parentData;
    }

    public String getCustomerHierarchyData() {
        return customerHierarchyData;
    }

    public void setCustomerHierarchyData(String customerHierarchyData) {
        this.customerHierarchyData = customerHierarchyData;
    }

    public Integer getCustomerTaskCount() {
        return customerTaskCount;
    }

    public void setCustomerTaskCount(Integer customerTaskCount) {
        this.customerTaskCount = customerTaskCount;
    }

    public Boolean isCreateFromPotential() {
        return createFromPotential;
    }

    public void setCreateFromPotential(Boolean createFromPotential) {
        this.createFromPotential = createFromPotential;
    }

    public String getPrimaryContactName() {
        return primaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        this.primaryContactName = primaryContactName;
    }

    public String getFirstInvoiceDate() {
        return firstInvoiceDate;
    }

    public void setFirstInvoiceDate(String firstInvoiceDate) {
        this.firstInvoiceDate = firstInvoiceDate;
    }

    public String getOldestOpenInvoiceDate() {
        return oldestOpenInvoiceDate;
    }

    public void setOldestOpenInvoiceDate(String oldestOpenInvoiceDate) {
        this.oldestOpenInvoiceDate = oldestOpenInvoiceDate;
    }

    public String getLatestInvoiceDate() {
        return latestInvoiceDate;
    }

    public void setLatestInvoiceDate(String latestInvoiceDate) {
        this.latestInvoiceDate = latestInvoiceDate;
    }

    public String getLatestPaymentDate() {
        return latestPaymentDate;
    }

    public void setLatestPaymentDate(String latestPaymentDate) {
        this.latestPaymentDate = latestPaymentDate;
    }

    public Double getWriteOff() {
        return writeOff;
    }

    public void setWriteOff(Double writeOff) {
        this.writeOff = writeOff;
    }

    public Double getCustomer12MonthsPlan() {
        return customer12MonthsPlan;
    }

    public void setCustomer12MonthsPlan(Double customer12MonthsPlan) {
        this.customer12MonthsPlan = customer12MonthsPlan;
    }

    public Double getSinRadLat() {
        return sinRadLat;
    }

    public void setSinRadLat(Double sinRadLat) {
        this.sinRadLat = sinRadLat;
    }

    public Double getCosRadLat() {
        return cosRadLat;
    }

    public void setCosRadLat(Double cosRadLat) {
        this.cosRadLat = cosRadLat;
    }

    public Double getSinRadLong() {
        return sinRadLong;
    }

    public void setSinRadLong(Double sinRadLong) {
        this.sinRadLong = sinRadLong;
    }

    public Double getCosRadLong() {
        return cosRadLong;
    }

    public void setCosRadLong(Double cosRadLong) {
        this.cosRadLong = cosRadLong;
    }

    public Double getCalculatedNumberOfVisits() {
        return calculatedNumberOfVisits;
    }

    public void setCalculatedNumberOfVisits(Double calculatedNumberOfVisits) {
        this.calculatedNumberOfVisits = calculatedNumberOfVisits;
    }

    public Double getCalculatedTimeAtCustomer() {
        return calculatedTimeAtCustomer;
    }

    public void setCalculatedTimeAtCustomer(Double calculatedTimeAtCustomer) {
        this.calculatedTimeAtCustomer = calculatedTimeAtCustomer;
    }

    public Double getVisitProductivity6m() {
        return visitProductivity6m;
    }

    public void setVisitProductivity6m(Double visitProductivity6m) {
        this.visitProductivity6m = visitProductivity6m;
    }

    public Double getBalance1to30() {
        return balance1to30;
    }

    public void setBalance1to30(Double balance1to30) {
        this.balance1to30 = balance1to30;
    }

    public Double getBalance31to60() {
        return balance31to60;
    }

    public void setBalance31to60(Double balance31to60) {
        this.balance31to60 = balance31to60;
    }

    public Double getBalance61to90() {
        return balance61to90;
    }

    public void setBalance61to90(Double balance61to90) {
        this.balance61to90 = balance61to90;
    }

    public Double getBalance91toXyz() {
        return balance91toXyz;
    }

    public void setBalance91toXyz(Double balance91toXyz) {
        this.balance91toXyz = balance91toXyz;
    }

    public Double getBalanceCritical() {
        return balanceCritical;
    }

    public void setBalanceCritical(Double balanceCritical) {
        this.balanceCritical = balanceCritical;
    }

    public Integer getTreasuryBill() {
        return treasuryBill;
    }

    public void setTreasuryBill(Integer treasuryBill) {
        this.treasuryBill = treasuryBill;
    }

    public Double getPaymentAvgDays() {
        return paymentAvgDays;
    }

    public void setPaymentAvgDays(Double paymentAvgDays) {
        this.paymentAvgDays = paymentAvgDays;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmailInvoices() {
        return emailInvoices;
    }

    public void setEmailInvoices(String emailInvoices) {
        this.emailInvoices = emailInvoices;
    }

    public String getEmailReminders() {
        return emailReminders;
    }

    public void setEmailReminders(String emailReminders) {
        this.emailReminders = emailReminders;
    }

    public String getDateOfLastVisit() {
        return dateOfLastVisit;
    }

    public void setDateOfLastVisit(String dateOfLastVisit) {
        this.dateOfLastVisit = dateOfLastVisit;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getPricingClass() {
        return pricingClass;
    }

    public void setPricingClass(String pricingClass) {
        this.pricingClass = pricingClass;
    }

    public String getFullCustomerCode() {
        return fullCustomerCode;
    }

    public void setFullCustomerCode(String fullCustomerCode) {
        this.fullCustomerCode = fullCustomerCode;
    }

    public Boolean isCentralOffice() {
        return centralOffice;
    }

    public void setCentralOffice(Boolean centralOffice) {
        this.centralOffice = centralOffice;
    }

    public Integer getPrimaryContactID() {
        return primaryContactID;
    }

    public void setPrimaryContactID(Integer primaryContactID) {
        this.primaryContactID = primaryContactID;
    }

    public String getAssignedUserCode() {
        return assignedUserCode;
    }

    public void setAssignedUserCode(String assignedUserCode) {
        this.assignedUserCode = assignedUserCode;
    }

    public String getAssignedUserName() {
        return assignedUserName;
    }

    public void setAssignedUserName(String assignedUserName) {
        this.assignedUserName = assignedUserName;
    }

    public Boolean isFocusCustomer() {
        return focusCustomer;
    }

    public void setFocusCustomer(Boolean focusCustomer) {
        this.focusCustomer = focusCustomer;
    }

    public Boolean isCustomerActive() {
        return customerActive;
    }

    public void setCustomerActive(Boolean customerActive) {
        this.customerActive = customerActive;
    }

    public String getTradeLicenseNum() {
        return tradeLicenseNum;
    }

    public void setTradeLicenseNum(String tradeLicenseNum) {
        this.tradeLicenseNum = tradeLicenseNum;
    }

    public String getTradeLicenseExp() {
        return tradeLicenseExp;
    }

    public void setTradeLicenseExp(String tradeLicenseExp) {
        this.tradeLicenseExp = tradeLicenseExp;
    }

    public String getTradeLicenseType() {
        return tradeLicenseType;
    }

    public void setTradeLicenseType(String tradeLicenseType) {
        this.tradeLicenseType = tradeLicenseType;
    }

    public Double getTargetContractTurnover() {
        return targetContractTurnover;
    }

    public void setTargetContractTurnover(Double targetContractTurnover) {
        this.targetContractTurnover = targetContractTurnover;
    }

    public Double getContractRealizationPct() {
        return contractRealizationPct;
    }

    public void setContractRealizationPct(Double contractRealizationPct) {
        this.contractRealizationPct = contractRealizationPct;
    }

    public String getGallerySyncDate() {
        return gallerySyncDate;
    }

    public void setGallerySyncDate(String gallerySyncDate) {
        this.gallerySyncDate = gallerySyncDate;
    }

    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }
}