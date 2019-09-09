package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerSchema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("businessKey")
    private String businessKey;
    @JsonProperty("potentialCustomerBusinessKey")
    private String potentialCustomerBusinessKey;
    @JsonProperty("financialEntityID")
    private Integer financialEntityID;
    @JsonProperty("code")
    private String code;
    @JsonProperty("potentialCustomerCode")
    private String potentialCustomerCode;
    @JsonProperty("customerIDForCustBusinessUnit")
    private Integer customerIDForCustBusinessUnit;
    @JsonProperty("custBusinessUnitCode")
    private String custBusinessUnitCode;
    @JsonProperty("realCustomer")
    private Boolean realCustomer;
    @JsonProperty("name")
    private String name;
    @JsonProperty("name2")
    private String name2;
    @JsonProperty("address")
    private String address;
    @JsonProperty("postalCodeAndCityID")
    private Integer postalCodeAndCityID;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mb")
    private String mb;
    @JsonProperty("vatNo")
    private String vatNo;
    @JsonProperty("creditLimit")
    private Double creditLimit;
    @JsonProperty("balanceLcy")
    private Double balanceLcy;
    @JsonProperty("balanceDueLcy")
    private Double balanceDueLcy;
    @JsonProperty("custPaymentConditionID")
    private Integer custPaymentConditionID;
    @JsonProperty("customerDiscGroupID")
    private Integer customerDiscGroupID;
    @JsonProperty("customerPriceGroupID")
    private Integer customerPriceGroupID;
    @JsonProperty("groupOfCustomerID")
    private Integer groupOfCustomerID;
    @JsonProperty("secondaryGroupOfCustomerID")
    private Integer secondaryGroupOfCustomerID;
    @JsonProperty("smlTurnover")
    private String smlTurnover;
    @JsonProperty("sean")
    private String sean;
    @JsonProperty("blueCoatsNo")
    private String blueCoatsNo;
    @JsonProperty("grayCoatsNo")
    private String grayCoatsNo;
    @JsonProperty("potential")
    private String potential;
    @JsonProperty("color")
    private String color;
    @JsonProperty("coeficient")
    private String coefficient;
    @JsonProperty("customerPersonalTurnover")
    private Double customerPersonalTurnover;
    @JsonProperty("turnover3m")
    private Double turnover3m;
    @JsonProperty("turnover6m")
    private Double turnover6m;
    @JsonProperty("turnover12m")
    private Double turnover12m;
    @JsonProperty("turnoverYTM")
    private Double turnoverYTM;
    @JsonProperty("turnoverLastYear")
    private Double turnoverLastYear;
    @JsonProperty("turnoverYear_2")
    private Double turnoverYear2;
    @JsonProperty("turnoverYear_3")
    private Double turnoverYear3;
    @JsonProperty("planCurrentYear")
    private Double planCurrentYear;
    @JsonProperty("planFullfilment")
    private Double planFulfillment;
    @JsonProperty("existContract_Agreement")
    private Boolean existContractAgreement;
    @JsonProperty("existTradeAgreement")
    private Boolean existTradeAgreement;
    @JsonProperty("existOrsy")
    private Boolean existOrsy;
    @JsonProperty("existOrsy100")
    private Boolean existOrsy100;
    @JsonProperty("buttonNo6")
    private Boolean buttonNo6;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("reminderLevel")
    private String reminderLevel;
    @JsonProperty("gP_")
    private Double gp;
    @JsonProperty("defaultCustShipToAddressID")
    private Integer defaultCustShipToAddressID;
    @JsonProperty("custPaymentMethodID")
    private Integer custPaymentMethodID;
    @JsonProperty("gpsLatitude")
    private String gpsLatitude;
    @JsonProperty("gpsLongitude")
    private String gpsLongitude;
    @JsonProperty("gpsAccuracy")
    private String gpsAccuracy;
    @JsonProperty("customerVATGroupID")
    private Integer customerVATGroupID;
    @JsonProperty("invoiceDiscountPercent")
    private Double invoiceDiscountPercent;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("auditID")
    private Integer auditID;
    @JsonProperty("modifiedByUserID")
    private Integer modifiedByUserID;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("employeeID")
    private Integer employeeID;
    @JsonProperty("primContactName")
    private String primContactName;
    @JsonProperty("oldestOpenInvDate")
    private String oldestOpenInvDate;
    @JsonProperty("latestInvDate")
    private String latestInvDate;
    @JsonProperty("latestPayDate")
    private String latestPayDate;
    @JsonProperty("writeOff")
    private Double writeOff;
    @JsonProperty("calculatedNumberOfVisits")
    private Double calculatedNumberOfVisits;
    @JsonProperty("calculatedTimeAtCustomer")
    private Double calculatedTimeAtCustomer;
    @JsonProperty("visitProductivity6M")
    private Double visitProductivity6M;
    @JsonProperty("totalPlannedDuringVisitsInAMonth")
    private Double totalPlannedDuringVisitsInAMonth;
    @JsonProperty("firstInvDate")
    private String firstInvDate;
    @JsonProperty("customer12MonthsPlan")
    private Double customer12MonthsPlan;
    @JsonProperty("balance1to30")
    private Double balance1to30;
    @JsonProperty("balance31to60")
    private Double balance31to60;
    @JsonProperty("balance61to90")
    private Double balance61to90;
    @JsonProperty("balance91toXyz")
    private Double balance91toXyz;
    @JsonProperty("treasuryBill")
    private Integer treasuryBill;
    @JsonProperty("paymentAvgDays")
    private Double paymentAvgDays;
    @JsonProperty("balanceCritical")
    private Double balanceCritical;
    @JsonProperty("smlTurnoverTMP")
    private String smlTurnoverTMP;
    @JsonProperty("dateLastPayment")
    private String dateLastPayment;
    @JsonProperty("dateLastInvoice")
    private String dateLastInvoice;
    @JsonProperty("dateOldestOpenInvoice")
    private String dateOldestOpenInvoice;
    @JsonProperty("primaryContactID")
    private Integer primaryContactID;
    @JsonProperty("createFromPotential")
    private Boolean createFromPotential;
    @JsonProperty("channel")
    private Integer channel;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("emailInvoice")
    private String emailInvoice;
    @JsonProperty("emailReminders")
    private String emailReminders;
    @JsonProperty("dateOfLastVisit")
    private String dateOfLastVisit;
    @JsonProperty("contractType")
    private String contractType;
    @JsonProperty("pricingClass")
    private String pricingClass;
    @JsonProperty("centralOffice")
    private Boolean centralOffice;
    @JsonProperty("fullCustomerCode")
    private String fullCustomerCode;
    @JsonProperty("userCode")
    private String userCode;
    @JsonProperty("userFullName")
    private String userFullName;
    @JsonProperty("focusCustomer")
    private Boolean focusCustomer;
    @JsonProperty("customerIsActive")
    private Boolean customerActive;
    @JsonProperty("tradeLicenseNum")
    private String tradeLicenseNum;
    @JsonProperty("tradeLicenseExp")
    private String tradeLicenseExp;
    @JsonProperty("tradeLicenseType")
    private String tradeLicenseType;
    @JsonProperty("targetContractTurnover")
    private Double targetContractTurnover;
    @JsonProperty("contractRealizationPct")
    private Double contractRealizationPct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("businessKey")
    public String getBusinessKey() {
        return businessKey;
    }

    @JsonProperty("businessKey")
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    @JsonProperty("potentialCustomerBusinessKey")
    public String getPotentialCustomerBusinessKey() {
        return potentialCustomerBusinessKey;
    }

    @JsonProperty("potentialCustomerBusinessKey")
    public void setPotentialCustomerBusinessKey(String potentialCustomerBusinessKey) {
        this.potentialCustomerBusinessKey = potentialCustomerBusinessKey;
    }

    @JsonProperty("financialEntityID")
    public Integer getFinancialEntityID() {
        return financialEntityID;
    }

    @JsonProperty("financialEntityID")
    public void setFinancialEntityID(Integer financialEntityID) {
        this.financialEntityID = financialEntityID;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("potentialCustomerCode")
    public String getPotentialCustomerCode() {
        return potentialCustomerCode;
    }

    @JsonProperty("potentialCustomerCode")
    public void setPotentialCustomerCode(String potentialCustomerCode) {
        this.potentialCustomerCode = potentialCustomerCode;
    }

    @JsonProperty("customerIDForCustBusinessUnit")
    public Integer getCustomerIDForCustBusinessUnit() {
        return customerIDForCustBusinessUnit;
    }

    @JsonProperty("customerIDForCustBusinessUnit")
    public void setCustomerIDForCustBusinessUnit(Integer customerIDForCustBusinessUnit) {
        this.customerIDForCustBusinessUnit = customerIDForCustBusinessUnit;
    }

    @JsonProperty("custBusinessUnitCode")
    public String getCustBusinessUnitCode() {
        return custBusinessUnitCode;
    }

    @JsonProperty("custBusinessUnitCode")
    public void setCustBusinessUnitCode(String custBusinessUnitCode) {
        this.custBusinessUnitCode = custBusinessUnitCode;
    }

    @JsonProperty("realCustomer")
    public Boolean getRealCustomer() {
        return realCustomer;
    }

    @JsonProperty("realCustomer")
    public void setRealCustomer(Boolean realCustomer) {
        this.realCustomer = realCustomer;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name2")
    public String getName2() {
        return name2;
    }

    @JsonProperty("name2")
    public void setName2(String name2) {
        this.name2 = name2;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("postalCodeAndCityID")
    public Integer getPostalCodeAndCityID() {
        return postalCodeAndCityID;
    }

    @JsonProperty("postalCodeAndCityID")
    public void setPostalCodeAndCityID(Integer postalCodeAndCityID) {
        this.postalCodeAndCityID = postalCodeAndCityID;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("mb")
    public String getMb() {
        return mb;
    }

    @JsonProperty("mb")
    public void setMb(String mb) {
        this.mb = mb;
    }

    @JsonProperty("vatNo")
    public String getVatNo() {
        return vatNo;
    }

    @JsonProperty("vatNo")
    public void setVatNo(String vatNo) {
        this.vatNo = vatNo;
    }

    @JsonProperty("creditLimit")
    public Double getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("creditLimit")
    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("balanceLcy")
    public Double getBalanceLcy() {
        return balanceLcy;
    }

    @JsonProperty("balanceLcy")
    public void setBalanceLcy(Double balanceLcy) {
        this.balanceLcy = balanceLcy;
    }

    @JsonProperty("balanceDueLcy")
    public Double getBalanceDueLcy() {
        return balanceDueLcy;
    }

    @JsonProperty("balanceDueLcy")
    public void setBalanceDueLcy(Double balanceDueLcy) {
        this.balanceDueLcy = balanceDueLcy;
    }

    @JsonProperty("custPaymentConditionID")
    public Integer getCustPaymentConditionID() {
        return custPaymentConditionID;
    }

    @JsonProperty("custPaymentConditionID")
    public void setCustPaymentConditionID(Integer custPaymentConditionID) {
        this.custPaymentConditionID = custPaymentConditionID;
    }

    @JsonProperty("customerDiscGroupID")
    public Integer getCustomerDiscGroupID() {
        return customerDiscGroupID;
    }

    @JsonProperty("customerDiscGroupID")
    public void setCustomerDiscGroupID(Integer customerDiscGroupID) {
        this.customerDiscGroupID = customerDiscGroupID;
    }

    @JsonProperty("customerPriceGroupID")
    public Integer getCustomerPriceGroupID() {
        return customerPriceGroupID;
    }

    @JsonProperty("customerPriceGroupID")
    public void setCustomerPriceGroupID(Integer customerPriceGroupID) {
        this.customerPriceGroupID = customerPriceGroupID;
    }

    @JsonProperty("groupOfCustomerID")
    public Integer getGroupOfCustomerID() {
        return groupOfCustomerID;
    }

    @JsonProperty("groupOfCustomerID")
    public void setGroupOfCustomerID(Integer groupOfCustomerID) {
        this.groupOfCustomerID = groupOfCustomerID;
    }

    @JsonProperty("secondaryGroupOfCustomerID")
    public Integer getSecondaryGroupOfCustomerID() {
        return secondaryGroupOfCustomerID;
    }

    @JsonProperty("secondaryGroupOfCustomerID")
    public void setSecondaryGroupOfCustomerID(Integer secondaryGroupOfCustomerID) {
        this.secondaryGroupOfCustomerID = secondaryGroupOfCustomerID;
    }

    @JsonProperty("smlTurnover")
    public String getSmlTurnover() {
        return smlTurnover;
    }

    @JsonProperty("smlTurnover")
    public void setSmlTurnover(String smlTurnover) {
        this.smlTurnover = smlTurnover;
    }

    @JsonProperty("sean")
    public String getSean() {
        return sean;
    }

    @JsonProperty("sean")
    public void setSean(String sean) {
        this.sean = sean;
    }

    @JsonProperty("blueCoatsNo")
    public String getBlueCoatsNo() {
        return blueCoatsNo;
    }

    @JsonProperty("blueCoatsNo")
    public void setBlueCoatsNo(String blueCoatsNo) {
        this.blueCoatsNo = blueCoatsNo;
    }

    @JsonProperty("grayCoatsNo")
    public String getGrayCoatsNo() {
        return grayCoatsNo;
    }

    @JsonProperty("grayCoatsNo")
    public void setGrayCoatsNo(String grayCoatsNo) {
        this.grayCoatsNo = grayCoatsNo;
    }

    @JsonProperty("potential")
    public String getPotential() {
        return potential;
    }

    @JsonProperty("potential")
    public void setPotential(String potential) {
        this.potential = potential;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("coeficient")
    public String getCoefficient() {
        return coefficient;
    }

    @JsonProperty("coeficient")
    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    @JsonProperty("customerPersonalTurnover")
    public Double getCustomerPersonalTurnover() {
        return customerPersonalTurnover;
    }

    @JsonProperty("customerPersonalTurnover")
    public void setCustomerPersonalTurnover(Double customerPersonalTurnover) {
        this.customerPersonalTurnover = customerPersonalTurnover;
    }

    @JsonProperty("turnover3m")
    public Double getTurnover3m() {
        return turnover3m;
    }

    @JsonProperty("turnover3m")
    public void setTurnover3m(Double turnover3m) {
        this.turnover3m = turnover3m;
    }

    @JsonProperty("turnover6m")
    public Double getTurnover6m() {
        return turnover6m;
    }

    @JsonProperty("turnover6m")
    public void setTurnover6m(Double turnover6m) {
        this.turnover6m = turnover6m;
    }

    @JsonProperty("turnover12m")
    public Double getTurnover12m() {
        return turnover12m;
    }

    @JsonProperty("turnover12m")
    public void setTurnover12m(Double turnover12m) {
        this.turnover12m = turnover12m;
    }

    @JsonProperty("turnoverYTM")
    public Double getTurnoverYTM() {
        return turnoverYTM;
    }

    @JsonProperty("turnoverYTM")
    public void setTurnoverYTM(Double turnoverYTM) {
        this.turnoverYTM = turnoverYTM;
    }

    @JsonProperty("turnoverLastYear")
    public Double getTurnoverLastYear() {
        return turnoverLastYear;
    }

    @JsonProperty("turnoverLastYear")
    public void setTurnoverLastYear(Double turnoverLastYear) {
        this.turnoverLastYear = turnoverLastYear;
    }

    @JsonProperty("turnoverYear_2")
    public Double getTurnoverYear2() {
        return turnoverYear2;
    }

    @JsonProperty("turnoverYear_2")
    public void setTurnoverYear2(Double turnoverYear2) {
        this.turnoverYear2 = turnoverYear2;
    }

    @JsonProperty("turnoverYear_3")
    public Double getTurnoverYear3() {
        return turnoverYear3;
    }

    @JsonProperty("turnoverYear_3")
    public void setTurnoverYear3(Double turnoverYear3) {
        this.turnoverYear3 = turnoverYear3;
    }

    @JsonProperty("planCurrentYear")
    public Double getPlanCurrentYear() {
        return planCurrentYear;
    }

    @JsonProperty("planCurrentYear")
    public void setPlanCurrentYear(Double planCurrentYear) {
        this.planCurrentYear = planCurrentYear;
    }

    @JsonProperty("planFullfilment")
    public Double getPlanFulfillment() {
        return planFulfillment;
    }

    @JsonProperty("planFullfilment")
    public void setPlanFulfillment(Double planFulfillment) {
        this.planFulfillment = planFulfillment;
    }

    @JsonProperty("existContract_Agreement")
    public Boolean getExistContractAgreement() {
        return existContractAgreement;
    }

    @JsonProperty("existContract_Agreement")
    public void setExistContractAgreement(Boolean existContractAgreement) {
        this.existContractAgreement = existContractAgreement;
    }

    @JsonProperty("existTradeAgreement")
    public Boolean getExistTradeAgreement() {
        return existTradeAgreement;
    }

    @JsonProperty("existTradeAgreement")
    public void setExistTradeAgreement(Boolean existTradeAgreement) {
        this.existTradeAgreement = existTradeAgreement;
    }

    @JsonProperty("existOrsy")
    public Boolean getExistOrsy() {
        return existOrsy;
    }

    @JsonProperty("existOrsy")
    public void setExistOrsy(Boolean existOrsy) {
        this.existOrsy = existOrsy;
    }

    @JsonProperty("existOrsy100")
    public Boolean getExistOrsy100() {
        return existOrsy100;
    }

    @JsonProperty("existOrsy100")
    public void setExistOrsy100(Boolean existOrsy100) {
        this.existOrsy100 = existOrsy100;
    }

    @JsonProperty("buttonNo6")
    public Boolean getButtonNo6() {
        return buttonNo6;
    }

    @JsonProperty("buttonNo6")
    public void setButtonNo6(Boolean buttonNo6) {
        this.buttonNo6 = buttonNo6;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("reminderLevel")
    public String getReminderLevel() {
        return reminderLevel;
    }

    @JsonProperty("reminderLevel")
    public void setReminderLevel(String reminderLevel) {
        this.reminderLevel = reminderLevel;
    }

    @JsonProperty("gP_")
    public Double getGp() {
        return gp;
    }

    @JsonProperty("gP_")
    public void setGp(Double gp) {
        this.gp = gp;
    }

    @JsonProperty("defaultCustShipToAddressID")
    public Integer getDefaultCustShipToAddressID() {
        return defaultCustShipToAddressID;
    }

    @JsonProperty("defaultCustShipToAddressID")
    public void setDefaultCustShipToAddressID(Integer defaultCustShipToAddressID) {
        this.defaultCustShipToAddressID = defaultCustShipToAddressID;
    }

    @JsonProperty("custPaymentMethodID")
    public Integer getCustPaymentMethodID() {
        return custPaymentMethodID;
    }

    @JsonProperty("custPaymentMethodID")
    public void setCustPaymentMethodID(Integer custPaymentMethodID) {
        this.custPaymentMethodID = custPaymentMethodID;
    }

    @JsonProperty("gpsLatitude")
    public String getGpsLatitude() {
        return gpsLatitude;
    }

    @JsonProperty("gpsLatitude")
    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    @JsonProperty("gpsLongitude")
    public String getGpsLongitude() {
        return gpsLongitude;
    }

    @JsonProperty("gpsLongitude")
    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    @JsonProperty("gpsAccuracy")
    public String getGpsAccuracy() {
        return gpsAccuracy;
    }

    @JsonProperty("gpsAccuracy")
    public void setGpsAccuracy(String gpsAccuracy) {
        this.gpsAccuracy = gpsAccuracy;
    }

    @JsonProperty("customerVATGroupID")
    public Integer getCustomerVATGroupID() {
        return customerVATGroupID;
    }

    @JsonProperty("customerVATGroupID")
    public void setCustomerVATGroupID(Integer customerVATGroupID) {
        this.customerVATGroupID = customerVATGroupID;
    }

    @JsonProperty("invoiceDiscountPercent")
    public Double getInvoiceDiscountPercent() {
        return invoiceDiscountPercent;
    }

    @JsonProperty("invoiceDiscountPercent")
    public void setInvoiceDiscountPercent(Double invoiceDiscountPercent) {
        this.invoiceDiscountPercent = invoiceDiscountPercent;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("auditID")
    public Integer getAuditID() {
        return auditID;
    }

    @JsonProperty("auditID")
    public void setAuditID(Integer auditID) {
        this.auditID = auditID;
    }

    @JsonProperty("modifiedByUserID")
    public Integer getModifiedByUserID() {
        return modifiedByUserID;
    }

    @JsonProperty("modifiedByUserID")
    public void setModifiedByUserID(Integer modifiedByUserID) {
        this.modifiedByUserID = modifiedByUserID;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("employeeID")
    public Integer getEmployeeID() {
        return employeeID;
    }

    @JsonProperty("employeeID")
    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    @JsonProperty("primContactName")
    public String getPrimContactName() {
        return primContactName;
    }

    @JsonProperty("primContactName")
    public void setPrimContactName(String primContactName) {
        this.primContactName = primContactName;
    }

    @JsonProperty("oldestOpenInvDate")
    public String getOldestOpenInvDate() {
        return oldestOpenInvDate;
    }

    @JsonProperty("oldestOpenInvDate")
    public void setOldestOpenInvDate(String oldestOpenInvDate) {
        this.oldestOpenInvDate = oldestOpenInvDate;
    }

    @JsonProperty("latestInvDate")
    public String getLatestInvDate() {
        return latestInvDate;
    }

    @JsonProperty("latestInvDate")
    public void setLatestInvDate(String latestInvDate) {
        this.latestInvDate = latestInvDate;
    }

    @JsonProperty("latestPayDate")
    public String getLatestPayDate() {
        return latestPayDate;
    }

    @JsonProperty("latestPayDate")
    public void setLatestPayDate(String latestPayDate) {
        this.latestPayDate = latestPayDate;
    }

    @JsonProperty("writeOff")
    public Double getWriteOff() {
        return writeOff;
    }

    @JsonProperty("writeOff")
    public void setWriteOff(Double writeOff) {
        this.writeOff = writeOff;
    }

    @JsonProperty("calculatedNumberOfVisits")
    public Double getCalculatedNumberOfVisits() {
        return calculatedNumberOfVisits;
    }

    @JsonProperty("calculatedNumberOfVisits")
    public void setCalculatedNumberOfVisits(Double calculatedNumberOfVisits) {
        this.calculatedNumberOfVisits = calculatedNumberOfVisits;
    }

    @JsonProperty("calculatedTimeAtCustomer")
    public Double getCalculatedTimeAtCustomer() {
        return calculatedTimeAtCustomer;
    }

    @JsonProperty("calculatedTimeAtCustomer")
    public void setCalculatedTimeAtCustomer(Double calculatedTimeAtCustomer) {
        this.calculatedTimeAtCustomer = calculatedTimeAtCustomer;
    }

    @JsonProperty("visitProductivity6M")
    public Double getVisitProductivity6M() {
        return visitProductivity6M;
    }

    @JsonProperty("visitProductivity6M")
    public void setVisitProductivity6M(Double visitProductivity6M) {
        this.visitProductivity6M = visitProductivity6M;
    }

    @JsonProperty("totalPlannedDuringVisitsInAMonth")
    public Double getTotalPlannedDuringVisitsInAMonth() {
        return totalPlannedDuringVisitsInAMonth;
    }

    @JsonProperty("totalPlannedDuringVisitsInAMonth")
    public void setTotalPlannedDuringVisitsInAMonth(Double totalPlannedDuringVisitsInAMonth) {
        this.totalPlannedDuringVisitsInAMonth = totalPlannedDuringVisitsInAMonth;
    }

    @JsonProperty("firstInvDate")
    public String getFirstInvDate() {
        return firstInvDate;
    }

    @JsonProperty("firstInvDate")
    public void setFirstInvDate(String firstInvDate) {
        this.firstInvDate = firstInvDate;
    }

    @JsonProperty("customer12MonthsPlan")
    public Double getCustomer12MonthsPlan() {
        return customer12MonthsPlan;
    }

    @JsonProperty("customer12MonthsPlan")
    public void setCustomer12MonthsPlan(Double customer12MonthsPlan) {
        this.customer12MonthsPlan = customer12MonthsPlan;
    }

    @JsonProperty("balance1to30")
    public Double getBalance1to30() {
        return balance1to30;
    }

    @JsonProperty("balance1to30")
    public void setBalance1to30(Double balance1to30) {
        this.balance1to30 = balance1to30;
    }

    @JsonProperty("balance31to60")
    public Double getBalance31to60() {
        return balance31to60;
    }

    @JsonProperty("balance31to60")
    public void setBalance31to60(Double balance31to60) {
        this.balance31to60 = balance31to60;
    }

    @JsonProperty("balance61to90")
    public Double getBalance61to90() {
        return balance61to90;
    }

    @JsonProperty("balance61to90")
    public void setBalance61to90(Double balance61to90) {
        this.balance61to90 = balance61to90;
    }

    @JsonProperty("balance91toXyz")
    public Double getBalance91toXyz() {
        return balance91toXyz;
    }

    @JsonProperty("balance91toXyz")
    public void setBalance91toXyz(Double balance91toXyz) {
        this.balance91toXyz = balance91toXyz;
    }

    @JsonProperty("treasuryBill")
    public Integer getTreasuryBill() {
        return treasuryBill;
    }

    @JsonProperty("treasuryBill")
    public void setTreasuryBill(Integer treasuryBill) {
        this.treasuryBill = treasuryBill;
    }

    @JsonProperty("paymentAvgDays")
    public Double getPaymentAvgDays() {
        return paymentAvgDays;
    }

    @JsonProperty("paymentAvgDays")
    public void setPaymentAvgDays(Double paymentAvgDays) {
        this.paymentAvgDays = paymentAvgDays;
    }

    @JsonProperty("balanceCritical")
    public Double getBalanceCritical() {
        return balanceCritical;
    }

    @JsonProperty("balanceCritical")
    public void setBalanceCritical(Double balanceCritical) {
        this.balanceCritical = balanceCritical;
    }

    @JsonProperty("smlTurnoverTMP")
    public String getSmlTurnoverTMP() {
        return smlTurnoverTMP;
    }

    @JsonProperty("smlTurnoverTMP")
    public void setSmlTurnoverTMP(String smlTurnoverTMP) {
        this.smlTurnoverTMP = smlTurnoverTMP;
    }

    @JsonProperty("dateLastPayment")
    public String getDateLastPayment() {
        return dateLastPayment;
    }

    @JsonProperty("dateLastPayment")
    public void setDateLastPayment(String dateLastPayment) {
        this.dateLastPayment = dateLastPayment;
    }

    @JsonProperty("dateLastInvoice")
    public String getDateLastInvoice() {
        return dateLastInvoice;
    }

    @JsonProperty("dateLastInvoice")
    public void setDateLastInvoice(String dateLastInvoice) {
        this.dateLastInvoice = dateLastInvoice;
    }

    @JsonProperty("dateOldestOpenInvoice")
    public String getDateOldestOpenInvoice() {
        return dateOldestOpenInvoice;
    }

    @JsonProperty("dateOldestOpenInvoice")
    public void setDateOldestOpenInvoice(String dateOldestOpenInvoice) {
        this.dateOldestOpenInvoice = dateOldestOpenInvoice;
    }

    @JsonProperty("primaryContactID")
    public Integer getPrimaryContactID() {
        return primaryContactID;
    }

    @JsonProperty("primaryContactID")
    public void setPrimaryContactID(Integer primaryContactID) {
        this.primaryContactID = primaryContactID;
    }

    @JsonProperty("createFromPotential")
    public Boolean getCreateFromPotential() {
        return createFromPotential;
    }

    @JsonProperty("createFromPotential")
    public void setCreateFromPotential(Boolean createFromPotential) {
        this.createFromPotential = createFromPotential;
    }

    @JsonProperty("channel")
    public Integer getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("emailInvoice")
    public String getEmailInvoice() {
        return emailInvoice;
    }

    @JsonProperty("emailInvoice")
    public void setEmailInvoice(String emailInvoice) {
        this.emailInvoice = emailInvoice;
    }

    @JsonProperty("emailReminders")
    public String getEmailReminders() {
        return emailReminders;
    }

    @JsonProperty("emailReminders")
    public void setEmailReminders(String emailReminders) {
        this.emailReminders = emailReminders;
    }

    @JsonProperty("dateOfLastVisit")
    public String getDateOfLastVisit() {
        return dateOfLastVisit;
    }

    @JsonProperty("dateOfLastVisit")
    public void setDateOfLastVisit(String dateOfLastVisit) {
        this.dateOfLastVisit = dateOfLastVisit;
    }

    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @JsonProperty("pricingClass")
    public String getPricingClass() {
        return pricingClass;
    }

    @JsonProperty("pricingClass")
    public void setPricingClass(String pricingClass) {
        this.pricingClass = pricingClass;
    }

    @JsonProperty("centralOffice")
    public Boolean getCentralOffice() {
        return centralOffice;
    }

    @JsonProperty("centralOffice")
    public void setCentralOffice(Boolean centralOffice) {
        this.centralOffice = centralOffice;
    }

    @JsonProperty("fullCustomerCode")
    public String getFullCustomerCode() {
        return fullCustomerCode;
    }

    @JsonProperty("fullCustomerCode")
    public void setFullCustomerCode(String fullCustomerCode) {
        this.fullCustomerCode = fullCustomerCode;
    }

    @JsonProperty("userCode")
    public String getUserCode() {
        return userCode;
    }

    @JsonProperty("userCode")
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @JsonProperty("userFullName")
    public String getUserFullName() {
        return userFullName;
    }

    @JsonProperty("userFullName")
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    @JsonProperty("focusCustomer")
    public Boolean getFocusCustomer() {
        return focusCustomer;
    }

    @JsonProperty("focusCustomer")
    public void setFocusCustomer(Boolean focusCustomer) {
        this.focusCustomer = focusCustomer;
    }

    @JsonProperty("customerIsActive")
    public Boolean getCustomerActive() {
        return customerActive;
    }

    @JsonProperty("customerIsActive")
    public void setCustomerActive(Boolean customerActive) {
        this.customerActive = customerActive;
    }

    @JsonProperty("tradeLicenseNum")
    public String getTradeLicenseNum() {
        return tradeLicenseNum;
    }

    @JsonProperty("tradeLicenseNum")
    public void setTradeLicenseNum(String tradeLicenseNum) {
        this.tradeLicenseNum = tradeLicenseNum;
    }

    @JsonProperty("tradeLicenseExp")
    public String getTradeLicenseExp() {
        return tradeLicenseExp;
    }

    @JsonProperty("tradeLicenseExp")
    public void setTradeLicenseExp(String tradeLicenseExp) {
        this.tradeLicenseExp = tradeLicenseExp;
    }

    @JsonProperty("tradeLicenseType")
    public String getTradeLicenseType() {
        return tradeLicenseType;
    }

    @JsonProperty("tradeLicenseType")
    public void setTradeLicenseType(String tradeLicenseType) {
        this.tradeLicenseType = tradeLicenseType;
    }

    @JsonProperty("targetContractTurnover")
    public Double getTargetContractTurnover() {
        return targetContractTurnover;
    }

    @JsonProperty("targetContractTurnover")
    public void setTargetContractTurnover(Double targetContractTurnover) {
        this.targetContractTurnover = targetContractTurnover;
    }

    @JsonProperty("contractRealizationPct")
    public Double getContractRealizationPct() {
        return contractRealizationPct;
    }

    @JsonProperty("contractRealizationPct")
    public void setContractRealizationPct(Double contractRealizationPct) {
        this.contractRealizationPct = contractRealizationPct;
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