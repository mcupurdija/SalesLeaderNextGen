package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = TableNames.CUSTOMERS)
public class CustomerEntity extends BaseAuditColumns {

    private String customerCode;
    private String potentialCustomerCode;
    private int customerIdForCustomerBusinessUnit;
    private String customerBusinessUnitCode;
    private int realCustomer;
    private String name;
    private String name2;
    private String address;
    private int postalCodeAndCityId;
    private String phone;
    private String mobile;
    private String email;
    private String mb;
    private String vatNo;
    private double creditLimit;
    private double balanceLcy;
    private double balanceDueLcy;
    private int customerPaymentConditionId;
    private int customerDiscGroupId;
    private int customerPriceGroupId;
    private int groupOfCustomerId;
    private int secondaryGroupOfCustomerId;
    private String smlTurnover;
    private String sean;
    private int channel;
    private String blueCoatsNo;
    private String grayCoatsNo;
    private String potential;
    private String color;
    private String coefficient;
    private double customerPersonalTurnover;
    private double turnover3m;
    private double turnover6m;
    private double turnover12m;
    private double turnoverYTM;
    private double turnoverLastYear;
    private double turnoverYear2;
    private double turnoverYear3;
    private double planCurrentYear;
    private double planFulfillment;
    private boolean existContractAgreement;
    private boolean existTradeAgreement;
    private boolean existOrsy;
    private boolean existOrsy100;
    private int buttonNo6;
    private String priority;
    private String reminderLevel;
    private DateTime dateLastPayment;
    private DateTime dateLastInvoice;
    private DateTime dateOldestOpenInvoice;
    private double gp;
    private int defaultCustomerShipToAddressId;
    private int employeeId;
    private int customerPaymentMethodId;
    private String gpsLatitude;
    private String gpsLongitude;
    private String gpsAccuracy;
    private int customerVATGroupId;
    private double invoiceDiscountPercent;
    private String parentData;
    private String customerHierarchyData;
    private int customerTaskCount;
    private boolean createFromPotential;
    private String primaryContactName;
    private DateTime firstInvoiceDate;
    private DateTime oldestOpenInvoiceDate;
    private DateTime latestInvoiceDate;
    private DateTime latestPaymentDate;
    private double writeOff;
    private double customer12MonthsPlan;
    private double sinRadLat;
    private double cosRadLat;
    private double sinRadLong;
    private double cosRadLong;
    private double calculatedNumberOfVisits;
    private double calculatedTimeAtCustomer;
    private double visitProductivity6m;
    private double balance1to30;
    private double balance31to60;
    private double balance61to90;
    private double balance91toXyz;
    private double balanceCritical;
    private boolean treasuryBill;
    private double paymentAvgDays;
    private String fax;
    private String emailInvoices;
    private String emailReminders;
    private String dateOfLastVisit;
    private String contractType;
    private String pricingClass;
    private String fullCustomerCode;
    private boolean centralOffice;
    private int primaryContactId;
    private String assignedUserCode;
    private String assignedUserName;
    private boolean focusCustomer;
    private boolean customerActive;
    private String tradeLicenseNum;
    private String tradeLicenseExp;
    private String tradeLicenseType;
    private double targetContractTurnover;
    private double contractRealizationPct;
    private DateTime gallerySyncDate;
    private boolean sent;

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

    public int getCustomerIdForCustomerBusinessUnit() {
        return customerIdForCustomerBusinessUnit;
    }

    public void setCustomerIdForCustomerBusinessUnit(int customerIdForCustomerBusinessUnit) {
        this.customerIdForCustomerBusinessUnit = customerIdForCustomerBusinessUnit;
    }

    public String getCustomerBusinessUnitCode() {
        return customerBusinessUnitCode;
    }

    public void setCustomerBusinessUnitCode(String customerBusinessUnitCode) {
        this.customerBusinessUnitCode = customerBusinessUnitCode;
    }

    public int getRealCustomer() {
        return realCustomer;
    }

    public void setRealCustomer(int realCustomer) {
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

    public int getPostalCodeAndCityId() {
        return postalCodeAndCityId;
    }

    public void setPostalCodeAndCityId(int postalCodeAndCityId) {
        this.postalCodeAndCityId = postalCodeAndCityId;
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

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalanceLcy() {
        return balanceLcy;
    }

    public void setBalanceLcy(double balanceLcy) {
        this.balanceLcy = balanceLcy;
    }

    public double getBalanceDueLcy() {
        return balanceDueLcy;
    }

    public void setBalanceDueLcy(double balanceDueLcy) {
        this.balanceDueLcy = balanceDueLcy;
    }

    public int getCustomerPaymentConditionId() {
        return customerPaymentConditionId;
    }

    public void setCustomerPaymentConditionId(int customerPaymentConditionId) {
        this.customerPaymentConditionId = customerPaymentConditionId;
    }

    public int getCustomerDiscGroupId() {
        return customerDiscGroupId;
    }

    public void setCustomerDiscGroupId(int customerDiscGroupId) {
        this.customerDiscGroupId = customerDiscGroupId;
    }

    public int getCustomerPriceGroupId() {
        return customerPriceGroupId;
    }

    public void setCustomerPriceGroupId(int customerPriceGroupId) {
        this.customerPriceGroupId = customerPriceGroupId;
    }

    public int getGroupOfCustomerId() {
        return groupOfCustomerId;
    }

    public void setGroupOfCustomerId(int groupOfCustomerId) {
        this.groupOfCustomerId = groupOfCustomerId;
    }

    public int getSecondaryGroupOfCustomerId() {
        return secondaryGroupOfCustomerId;
    }

    public void setSecondaryGroupOfCustomerId(int secondaryGroupOfCustomerId) {
        this.secondaryGroupOfCustomerId = secondaryGroupOfCustomerId;
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

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
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

    public double getCustomerPersonalTurnover() {
        return customerPersonalTurnover;
    }

    public void setCustomerPersonalTurnover(double customerPersonalTurnover) {
        this.customerPersonalTurnover = customerPersonalTurnover;
    }

    public double getTurnover3m() {
        return turnover3m;
    }

    public void setTurnover3m(double turnover3m) {
        this.turnover3m = turnover3m;
    }

    public double getTurnover6m() {
        return turnover6m;
    }

    public void setTurnover6m(double turnover6m) {
        this.turnover6m = turnover6m;
    }

    public double getTurnover12m() {
        return turnover12m;
    }

    public void setTurnover12m(double turnover12m) {
        this.turnover12m = turnover12m;
    }

    public double getTurnoverYTM() {
        return turnoverYTM;
    }

    public void setTurnoverYTM(double turnoverYTM) {
        this.turnoverYTM = turnoverYTM;
    }

    public double getTurnoverLastYear() {
        return turnoverLastYear;
    }

    public void setTurnoverLastYear(double turnoverLastYear) {
        this.turnoverLastYear = turnoverLastYear;
    }

    public double getTurnoverYear2() {
        return turnoverYear2;
    }

    public void setTurnoverYear2(double turnoverYear2) {
        this.turnoverYear2 = turnoverYear2;
    }

    public double getTurnoverYear3() {
        return turnoverYear3;
    }

    public void setTurnoverYear3(double turnoverYear3) {
        this.turnoverYear3 = turnoverYear3;
    }

    public double getPlanCurrentYear() {
        return planCurrentYear;
    }

    public void setPlanCurrentYear(double planCurrentYear) {
        this.planCurrentYear = planCurrentYear;
    }

    public double getPlanFulfillment() {
        return planFulfillment;
    }

    public void setPlanFulfillment(double planFulfillment) {
        this.planFulfillment = planFulfillment;
    }

    public boolean isExistContractAgreement() {
        return existContractAgreement;
    }

    public void setExistContractAgreement(boolean existContractAgreement) {
        this.existContractAgreement = existContractAgreement;
    }

    public boolean isExistTradeAgreement() {
        return existTradeAgreement;
    }

    public void setExistTradeAgreement(boolean existTradeAgreement) {
        this.existTradeAgreement = existTradeAgreement;
    }

    public boolean isExistOrsy() {
        return existOrsy;
    }

    public void setExistOrsy(boolean existOrsy) {
        this.existOrsy = existOrsy;
    }

    public boolean isExistOrsy100() {
        return existOrsy100;
    }

    public void setExistOrsy100(boolean existOrsy100) {
        this.existOrsy100 = existOrsy100;
    }

    public int getButtonNo6() {
        return buttonNo6;
    }

    public void setButtonNo6(int buttonNo6) {
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

    public DateTime getDateLastPayment() {
        return dateLastPayment;
    }

    public void setDateLastPayment(DateTime dateLastPayment) {
        this.dateLastPayment = dateLastPayment;
    }

    public DateTime getDateLastInvoice() {
        return dateLastInvoice;
    }

    public void setDateLastInvoice(DateTime dateLastInvoice) {
        this.dateLastInvoice = dateLastInvoice;
    }

    public DateTime getDateOldestOpenInvoice() {
        return dateOldestOpenInvoice;
    }

    public void setDateOldestOpenInvoice(DateTime dateOldestOpenInvoice) {
        this.dateOldestOpenInvoice = dateOldestOpenInvoice;
    }

    public double getGp() {
        return gp;
    }

    public void setGp(double gp) {
        this.gp = gp;
    }

    public int getDefaultCustomerShipToAddressId() {
        return defaultCustomerShipToAddressId;
    }

    public void setDefaultCustomerShipToAddressId(int defaultCustomerShipToAddressId) {
        this.defaultCustomerShipToAddressId = defaultCustomerShipToAddressId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerPaymentMethodId() {
        return customerPaymentMethodId;
    }

    public void setCustomerPaymentMethodId(int customerPaymentMethodId) {
        this.customerPaymentMethodId = customerPaymentMethodId;
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

    public int getCustomerVATGroupId() {
        return customerVATGroupId;
    }

    public void setCustomerVATGroupId(int customerVATGroupId) {
        this.customerVATGroupId = customerVATGroupId;
    }

    public double getInvoiceDiscountPercent() {
        return invoiceDiscountPercent;
    }

    public void setInvoiceDiscountPercent(double invoiceDiscountPercent) {
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

    public int getCustomerTaskCount() {
        return customerTaskCount;
    }

    public void setCustomerTaskCount(int customerTaskCount) {
        this.customerTaskCount = customerTaskCount;
    }

    public boolean isCreateFromPotential() {
        return createFromPotential;
    }

    public void setCreateFromPotential(boolean createFromPotential) {
        this.createFromPotential = createFromPotential;
    }

    public String getPrimaryContactName() {
        return primaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        this.primaryContactName = primaryContactName;
    }

    public DateTime getFirstInvoiceDate() {
        return firstInvoiceDate;
    }

    public void setFirstInvoiceDate(DateTime firstInvoiceDate) {
        this.firstInvoiceDate = firstInvoiceDate;
    }

    public DateTime getOldestOpenInvoiceDate() {
        return oldestOpenInvoiceDate;
    }

    public void setOldestOpenInvoiceDate(DateTime oldestOpenInvoiceDate) {
        this.oldestOpenInvoiceDate = oldestOpenInvoiceDate;
    }

    public DateTime getLatestInvoiceDate() {
        return latestInvoiceDate;
    }

    public void setLatestInvoiceDate(DateTime latestInvoiceDate) {
        this.latestInvoiceDate = latestInvoiceDate;
    }

    public DateTime getLatestPaymentDate() {
        return latestPaymentDate;
    }

    public void setLatestPaymentDate(DateTime latestPaymentDate) {
        this.latestPaymentDate = latestPaymentDate;
    }

    public double getWriteOff() {
        return writeOff;
    }

    public void setWriteOff(double writeOff) {
        this.writeOff = writeOff;
    }

    public double getCustomer12MonthsPlan() {
        return customer12MonthsPlan;
    }

    public void setCustomer12MonthsPlan(double customer12MonthsPlan) {
        this.customer12MonthsPlan = customer12MonthsPlan;
    }

    public double getSinRadLat() {
        return sinRadLat;
    }

    public void setSinRadLat(double sinRadLat) {
        this.sinRadLat = sinRadLat;
    }

    public double getCosRadLat() {
        return cosRadLat;
    }

    public void setCosRadLat(double cosRadLat) {
        this.cosRadLat = cosRadLat;
    }

    public double getSinRadLong() {
        return sinRadLong;
    }

    public void setSinRadLong(double sinRadLong) {
        this.sinRadLong = sinRadLong;
    }

    public double getCosRadLong() {
        return cosRadLong;
    }

    public void setCosRadLong(double cosRadLong) {
        this.cosRadLong = cosRadLong;
    }

    public double getCalculatedNumberOfVisits() {
        return calculatedNumberOfVisits;
    }

    public void setCalculatedNumberOfVisits(double calculatedNumberOfVisits) {
        this.calculatedNumberOfVisits = calculatedNumberOfVisits;
    }

    public double getCalculatedTimeAtCustomer() {
        return calculatedTimeAtCustomer;
    }

    public void setCalculatedTimeAtCustomer(double calculatedTimeAtCustomer) {
        this.calculatedTimeAtCustomer = calculatedTimeAtCustomer;
    }

    public double getVisitProductivity6m() {
        return visitProductivity6m;
    }

    public void setVisitProductivity6m(double visitProductivity6m) {
        this.visitProductivity6m = visitProductivity6m;
    }

    public double getBalance1to30() {
        return balance1to30;
    }

    public void setBalance1to30(double balance1to30) {
        this.balance1to30 = balance1to30;
    }

    public double getBalance31to60() {
        return balance31to60;
    }

    public void setBalance31to60(double balance31to60) {
        this.balance31to60 = balance31to60;
    }

    public double getBalance61to90() {
        return balance61to90;
    }

    public void setBalance61to90(double balance61to90) {
        this.balance61to90 = balance61to90;
    }

    public double getBalance91toXyz() {
        return balance91toXyz;
    }

    public void setBalance91toXyz(double balance91toXyz) {
        this.balance91toXyz = balance91toXyz;
    }

    public double getBalanceCritical() {
        return balanceCritical;
    }

    public void setBalanceCritical(double balanceCritical) {
        this.balanceCritical = balanceCritical;
    }

    public boolean isTreasuryBill() {
        return treasuryBill;
    }

    public void setTreasuryBill(boolean treasuryBill) {
        this.treasuryBill = treasuryBill;
    }

    public double getPaymentAvgDays() {
        return paymentAvgDays;
    }

    public void setPaymentAvgDays(double paymentAvgDays) {
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

    public boolean isCentralOffice() {
        return centralOffice;
    }

    public void setCentralOffice(boolean centralOffice) {
        this.centralOffice = centralOffice;
    }

    public int getPrimaryContactId() {
        return primaryContactId;
    }

    public void setPrimaryContactId(int primaryContactId) {
        this.primaryContactId = primaryContactId;
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

    public boolean isFocusCustomer() {
        return focusCustomer;
    }

    public void setFocusCustomer(boolean focusCustomer) {
        this.focusCustomer = focusCustomer;
    }

    public boolean isCustomerActive() {
        return customerActive;
    }

    public void setCustomerActive(boolean customerActive) {
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

    public double getTargetContractTurnover() {
        return targetContractTurnover;
    }

    public void setTargetContractTurnover(double targetContractTurnover) {
        this.targetContractTurnover = targetContractTurnover;
    }

    public double getContractRealizationPct() {
        return contractRealizationPct;
    }

    public void setContractRealizationPct(double contractRealizationPct) {
        this.contractRealizationPct = contractRealizationPct;
    }

    public DateTime getGallerySyncDate() {
        return gallerySyncDate;
    }

    public void setGallerySyncDate(DateTime gallerySyncDate) {
        this.gallerySyncDate = gallerySyncDate;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }
}