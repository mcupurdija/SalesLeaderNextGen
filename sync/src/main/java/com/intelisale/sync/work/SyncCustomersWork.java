package com.intelisale.sync.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;

import com.intelisale.database.TableNames;
import com.intelisale.database.entity.CustomerEntity;
import com.intelisale.database.repository.SyncCustomersRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.customers.CustomerSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
import com.intelisale.networking.schema.sync.SyncSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.sync.di.DaggerSyncComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncCustomersWork extends BaseWorker {

    private static final int CUSTOMERS_PAGE_SIZE = 500;

    private int customersCounter = 0, customersResultsCounter;
    private int percentageCompleted;

    private Map<String, SyncSchema> syncRequest;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncCustomersRepository syncCustomersRepository;

    public SyncCustomersWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public Result doWork() {

        while (setSyncRequest()) {

            Call<BaseSchema<SyncCustomersResponseSchema>> call = syncApi.syncCustomers(1, new ArrayList<>(syncRequest.values()));
            try {
                Response<BaseSchema<SyncCustomersResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncCustomersResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncCustomersResponseSchema syncCustomersResponseSchema = responseSchema.getData();
                        if (syncCustomersResponseSchema != null) {

                            BaseRecordSchema<CustomerSchema> customerRecordSchema = syncCustomersResponseSchema.getCustomers();
                            if (customerRecordSchema != null) {

                                if (customerRecordSchema.getRecords() != null && customerRecordSchema.getRecords().size() > 0) {

                                    List<CustomerEntity> customerEntityList = new ArrayList<>();
                                    for (CustomerSchema customerSchema : customerRecordSchema.getRecords()) {

                                        CustomerEntity customerEntity = new CustomerEntity();

                                        customerEntity.setServerId(customerSchema.getId());
                                        customerEntity.setCustomerCode(customerSchema.getCode());
                                        customerEntity.setRealCustomer(customerSchema.getRealCustomer());
                                        customerEntity.setPotentialCustomerCode(customerSchema.getPotentialCustomerCode());
                                        customerEntity.setCustomerIdForCustomerBusinessUnit(customerSchema.getCustomerIDForCustBusinessUnit());
                                        customerEntity.setCustomerBusinessUnitCode(customerSchema.getCustBusinessUnitCode());
                                        customerEntity.setEmployeeId(customerSchema.getEmployeeID());
                                        customerEntity.setName(customerSchema.getName());
                                        customerEntity.setName2(customerSchema.getName2());
                                        customerEntity.setAddress(customerSchema.getAddress());
                                        customerEntity.setPostalCodeAndCityId(customerSchema.getPostalCodeAndCityID());
                                        customerEntity.setPhone(customerSchema.getPhone());
                                        customerEntity.setMobile(customerSchema.getMobile());
                                        customerEntity.setEmail(customerSchema.getEmail());
                                        customerEntity.setMb(customerSchema.getMb());
                                        customerEntity.setVatNo(customerSchema.getVatNo());
                                        customerEntity.setCreditLimit(customerSchema.getCreditLimit());
                                        customerEntity.setBalanceLcy(customerSchema.getBalanceLcy());
                                        customerEntity.setBalanceDueLcy(customerSchema.getBalanceDueLcy());
                                        customerEntity.setSmlTurnover(customerSchema.getSmlTurnover());
                                        customerEntity.setSean(customerSchema.getSean());
                                        customerEntity.setChannel(customerSchema.getChannel());
                                        customerEntity.setColor(customerSchema.getColor());
                                        customerEntity.setCoefficient(customerSchema.getCoeficient());
                                        customerEntity.setCustomerPersonalTurnover(customerSchema.getCustomerPersonalTurnover());
                                        customerEntity.setTurnover3m(customerSchema.getTurnover3m());
                                        customerEntity.setTurnover6m(customerSchema.getTurnover6m());
                                        customerEntity.setTurnover12m(customerSchema.getTurnover12m());
                                        customerEntity.setTurnoverLastYear(customerSchema.getTurnoverLastYear());
                                        customerEntity.setTurnoverYear2(customerSchema.getTurnoverYear2());
                                        customerEntity.setTurnoverYear3(customerSchema.getTurnoverYear3());
                                        customerEntity.setPlanFulfillment(customerSchema.getPlanFullfilment());
                                        customerEntity.setExistContractAgreement(customerSchema.getExistContractAgreement());
                                        customerEntity.setExistTradeAgreement(customerSchema.getExistTradeAgreement());
                                        customerEntity.setExistOrsy(customerSchema.getExistOrsy());
                                        customerEntity.setExistOrsy100(customerSchema.getExistOrsy100());
                                        customerEntity.setPriority(customerSchema.getPriority());
                                        customerEntity.setReminderLevel(customerSchema.getReminderLevel());
                                        customerEntity.setDateLastPayment(customerSchema.getDateLastPayment());
                                        customerEntity.setDateLastInvoice(customerSchema.getDateLastInvoice());
                                        customerEntity.setDateOldestOpenInvoice(customerSchema.getDateOldestOpenInvoice());
                                        customerEntity.setGp(customerSchema.getGP());
                                        customerEntity.setInvoiceDiscountPercent(customerSchema.getInvoiceDiscountPercent());
                                        customerEntity.setBlueCoatsNo(customerSchema.getBlueCoatsNo());
                                        customerEntity.setGrayCoatsNo(customerSchema.getGrayCoatsNo());
                                        customerEntity.setPotential(customerSchema.getPotential());

                                        String latitude = customerSchema.getGpsLatitude();
                                        String longitude = customerSchema.getGpsLongitude();
                                        customerEntity.setGpsLatitude(latitude);
                                        customerEntity.setGpsLongitude(longitude);
                                        customerEntity.setGpsAccuracy(customerSchema.getGpsAccuracy());
                                        try {
                                            customerEntity.setSinRadLat(Math.sin(Math.toRadians(Double.valueOf(latitude))));
                                            customerEntity.setCosRadLat(Math.cos(Math.toRadians(Double.valueOf(latitude))));
                                            customerEntity.setSinRadLong(Math.sin(Math.toRadians(Double.valueOf(longitude))));
                                            customerEntity.setCosRadLong(Math.cos(Math.toRadians(Double.valueOf(longitude))));
                                        } catch (Exception ignored) {
                                        }

                                        customerEntity.setCustomerPaymentMethodId(customerSchema.getCustPaymentMethodID());
                                        customerEntity.setCustomerVATGroupId(customerSchema.getCustomerVATGroupID());
                                        customerEntity.setCustomerPaymentConditionId(customerSchema.getCustPaymentConditionID());
                                        customerEntity.setCustomerDiscGroupId(customerSchema.getCustomerDiscGroupID());
                                        customerEntity.setCustomerPriceGroupId(customerSchema.getCustomerPriceGroupID());
                                        customerEntity.setGroupOfCustomerId(customerSchema.getGroupOfCustomerID());
                                        customerEntity.setSecondaryGroupOfCustomerId(customerSchema.getSecondaryGroupOfCustomerID());
                                        customerEntity.setDefaultCustomerShipToAddressId(customerSchema.getDefaultCustShipToAddressID());

                                        customerEntity.setPrimaryContactName(customerSchema.getPrimContactName());
                                        customerEntity.setFirstInvoiceDate(customerSchema.getFirstInvDate());
                                        customerEntity.setOldestOpenInvoiceDate(customerSchema.getOldestOpenInvDate());
                                        customerEntity.setLatestInvoiceDate(customerSchema.getLatestInvDate());
                                        customerEntity.setLatestPaymentDate(customerSchema.getLatestInvDate());
                                        customerEntity.setWriteOff(customerSchema.getWriteOff());
                                        customerEntity.setCustomer12MonthsPlan(customerSchema.getCustomer12MonthsPlan());
                                        customerEntity.setBalance1to30(customerSchema.getBalance1to30());
                                        customerEntity.setBalance31to60(customerSchema.getBalance31to60());
                                        customerEntity.setBalance61to90(customerSchema.getBalance61to90());
                                        customerEntity.setBalance91toXyz(customerSchema.getBalance91toXyz());
                                        customerEntity.setBalanceCritical(customerSchema.getBalanceCritical());
                                        customerEntity.setTreasuryBill(customerSchema.getTreasuryBill());
                                        customerEntity.setPaymentAvgDays(customerSchema.getPaymentAvgDays());
                                        customerEntity.setCalculatedNumberOfVisits(customerSchema.getCalculatedNumberOfVisits());
                                        customerEntity.setCalculatedTimeAtCustomer(customerSchema.getCalculatedTimeAtCustomer());
                                        customerEntity.setVisitProductivity6m(customerSchema.getVisitProductivity6M());

                                        customerEntity.setFax(customerSchema.getFax());
                                        customerEntity.setEmailInvoices(customerSchema.getEmailInvoice());
                                        customerEntity.setEmailReminders(customerSchema.getEmailReminders());
                                        customerEntity.setDateOfLastVisit(customerSchema.getDateOfLastVisit());
                                        customerEntity.setContractType(customerSchema.getContractType());
                                        customerEntity.setPricingClass(customerSchema.getPricingClass());
                                        customerEntity.setCentralOffice(customerSchema.getCentralOffice());
                                        customerEntity.setFullCustomerCode(customerSchema.getFullCustomerCode());
                                        customerEntity.setAssignedUserCode(customerSchema.getUserCode());
                                        customerEntity.setAssignedUserName(customerSchema.getUserFullName());
                                        customerEntity.setFocusCustomer(customerSchema.getFocusCustomer());
                                        customerEntity.setCustomerActive(customerSchema.getCustomerActive());
                                        customerEntity.setTradeLicenseNum(customerSchema.getTradeLicenseNum());
                                        customerEntity.setTradeLicenseExp(customerSchema.getTradeLicenseExp());
                                        customerEntity.setTradeLicenseType(customerSchema.getTradeLicenseType());
                                        customerEntity.setTargetContractTurnover(customerSchema.getTargetContractTurnover());
                                        customerEntity.setContractRealizationPct(customerSchema.getContractRealizationPct());
                                        customerEntity.setPrimaryContactId(customerSchema.getPrimaryContactID());

                                        customerEntity.setModifiedDate(customerSchema.getModifiedDate());
                                        customerEntity.setAuditId(customerSchema.getAuditID());
                                        customerEntity.setModifiedByUserId(customerSchema.getModifiedByUserID());
                                        customerEntity.setActive(customerSchema.getActive());
                                        customerEntity.setSent(true);

                                        customerEntityList.add(customerEntity);
                                    }
                                    syncCustomersRepository.syncCustomers(customerEntityList);
                                    customersCounter += CUSTOMERS_PAGE_SIZE;
                                }
                                customersResultsCounter = customerRecordSchema.getNumOfRecords();
                            }
                        }
                    } else {

                    }
                } else {

                    return Result.failure();
                }
            } catch (Exception e) {

                return Result.failure();
            }
        }

        return Result.success();
    }

    private boolean setSyncRequest() {

        if (syncRequest == null) {
            percentageCompleted = 1;

            syncRequest = new HashMap<>();
            // CUSTOMERS
            syncRequest.put(TableNames.CUSTOMERS, new SyncSchema(SyncTableNames.Customers, syncCustomersRepository.getCustomersModifiedDate(), customersCounter, CUSTOMERS_PAGE_SIZE));

        } else {
            percentageCompleted = 0;

            if (customersCounter < customersResultsCounter) {
                Objects.requireNonNull(syncRequest.get(TableNames.CUSTOMERS)).setPageNumber(customersCounter);
                addPercentageCompleted(customersCounter);
            } else {
                syncRequest.remove(TableNames.CUSTOMERS);
                addPercentageCompleted(customersResultsCounter);
            }

            if (syncRequest.size() > 0) {

                if (syncRequest.containsKey(TableNames.CUSTOMERS))
                    Objects.requireNonNull(syncRequest.get(TableNames.CUSTOMERS)).setPageSize(CUSTOMERS_PAGE_SIZE);

            }
        }

//        updateSyncProgress

        return syncRequest.size() > 0;
    }

    private void addPercentageCompleted(int value) {

        int resultSum = customersResultsCounter;
        if (resultSum != 0) percentageCompleted += value * 100 / resultSum;
    }


    private void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncCustomersWork(this);
    }
}
