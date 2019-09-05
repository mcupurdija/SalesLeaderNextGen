package com.intelisale.networking.schema.customers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelisale.networking.schema.BaseRecordSchema;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncCustomersResponseSchema {

    @JsonProperty("CustShipToAddresses")
    private BaseRecordSchema<CustomerShipToAddressSchema> customerShipToAddresses = null;
    @JsonProperty("CustomerPlanTurnover")
    private BaseRecordSchema<CustomerPlanTurnoverSchema> customerPlanTurnover = null;
    @JsonProperty("CustomerProductGroupPotential")
    private BaseRecordSchema<CustomerProductGroupPotentialSchema> customerProductGroupPotential = null;
    @JsonProperty("SLCategoriesAllowedToCustomer")
    private BaseRecordSchema<SLCategoriesAllowedToCustomerSchema> slCategoriesAllowedToCustomer = null;
    @JsonProperty("SLProcessesPerCustomers")
    private BaseRecordSchema<SLProcessesPerCustomerSchema> slProcessesPerCustomers = null;
    @JsonProperty("CustomerVisits")
    private BaseRecordSchema<CustomerVisitSchema> customerVisits = null;
    @JsonProperty("CustomerStatistics")
    private BaseRecordSchema<CustomerStatisticSchema> customerStatistics = null;
    @JsonProperty("SLShelvesPerCustomers")
    private BaseRecordSchema<SLShelvesPerCustomerSchema> slShelvesPerCustomers = null;
    @JsonProperty("Customers")
    private BaseRecordSchema<CustomerSchema> customers = null;
    @JsonProperty("CustomersUsers")
    private BaseRecordSchema<Integer> customersUsers = null;
    @JsonProperty("CustomersCustomLists")
    private BaseRecordSchema<CustomerCustomListSchema> customerCustomLists = null;
    @JsonProperty("CustomListsLines")
    private BaseRecordSchema<CustomListLineSchema> customListLines = null;
    @JsonProperty("VisitsFrequencies")
    private BaseRecordSchema<CustomerFrequenciesSchema> customerFrequencies = null;

    @JsonProperty("CustShipToAddresses")
    public BaseRecordSchema<CustomerShipToAddressSchema> getCustomerShipToAddresses() {
        return customerShipToAddresses;
    }

    @JsonProperty("CustShipToAddresses")
    public void setCustomerShipToAddresses(BaseRecordSchema<CustomerShipToAddressSchema> customerShipToAddresses) {
        this.customerShipToAddresses = customerShipToAddresses;
    }

    @JsonProperty("CustomerPlanTurnover")
    public BaseRecordSchema<CustomerPlanTurnoverSchema> getCustomerPlanTurnover() {
        return customerPlanTurnover;
    }

    @JsonProperty("CustomerPlanTurnover")
    public void setCustomerPlanTurnover(BaseRecordSchema<CustomerPlanTurnoverSchema> customerPlanTurnover) {
        this.customerPlanTurnover = customerPlanTurnover;
    }

    @JsonProperty("CustomerProductGroupPotential")
    public BaseRecordSchema<CustomerProductGroupPotentialSchema> getCustomerProductGroupPotential() {
        return customerProductGroupPotential;
    }

    @JsonProperty("CustomerProductGroupPotential")
    public void setCustomerProductGroupPotential(BaseRecordSchema<CustomerProductGroupPotentialSchema> customerProductGroupPotential) {
        this.customerProductGroupPotential = customerProductGroupPotential;
    }

    @JsonProperty("SLCategoriesAllowedToCustomer")
    public BaseRecordSchema<SLCategoriesAllowedToCustomerSchema> getSlCategoriesAllowedToCustomer() {
        return slCategoriesAllowedToCustomer;
    }

    @JsonProperty("SLCategoriesAllowedToCustomer")
    public void setSlCategoriesAllowedToCustomer(BaseRecordSchema<SLCategoriesAllowedToCustomerSchema> slCategoriesAllowedToCustomer) {
        this.slCategoriesAllowedToCustomer = slCategoriesAllowedToCustomer;
    }

    @JsonProperty("SLProcessesPerCustomers")
    public BaseRecordSchema<SLProcessesPerCustomerSchema> getSlProcessesPerCustomers() {
        return slProcessesPerCustomers;
    }

    @JsonProperty("SLProcessesPerCustomers")
    public void setSlProcessesPerCustomers(BaseRecordSchema<SLProcessesPerCustomerSchema> slProcessesPerCustomers) {
        this.slProcessesPerCustomers = slProcessesPerCustomers;
    }

    @JsonProperty("CustomerVisits")
    public BaseRecordSchema<CustomerVisitSchema> getCustomerVisits() {
        return customerVisits;
    }

    @JsonProperty("CustomerVisits")
    public void setCustomerVisits(BaseRecordSchema<CustomerVisitSchema> customerVisits) {
        this.customerVisits = customerVisits;
    }

    @JsonProperty("CustomerStatistics")
    public BaseRecordSchema<CustomerStatisticSchema> getCustomerStatistics() {
        return customerStatistics;
    }

    @JsonProperty("CustomerStatistics")
    public void setCustomerStatistics(BaseRecordSchema<CustomerStatisticSchema> customerStatistics) {
        this.customerStatistics = customerStatistics;
    }

    @JsonProperty("SLShelvesPerCustomers")
    public BaseRecordSchema<SLShelvesPerCustomerSchema> getSlShelvesPerCustomers() {
        return slShelvesPerCustomers;
    }

    @JsonProperty("SLShelvesPerCustomers")
    public void setSlShelvesPerCustomers(BaseRecordSchema<SLShelvesPerCustomerSchema> slShelvesPerCustomers) {
        this.slShelvesPerCustomers = slShelvesPerCustomers;
    }

    @JsonProperty("Customers")
    public BaseRecordSchema<CustomerSchema> getCustomers() {
        return customers;
    }

    @JsonProperty("Customers")
    public void setCustomers(BaseRecordSchema<CustomerSchema> customers) {
        this.customers = customers;
    }

    @JsonProperty("CustomersUsers")
    public BaseRecordSchema<Integer> getCustomersUsers() {
        return customersUsers;
    }

    @JsonProperty("CustomersUsers")
    public void setCustomersUsers(BaseRecordSchema<Integer> customersUsers) {
        this.customersUsers = customersUsers;
    }

    @JsonProperty("CustomersCustomLists")
    public BaseRecordSchema<CustomerCustomListSchema> getCustomerCustomLists() {
        return customerCustomLists;
    }

    @JsonProperty("CustomersCustomLists")
    public void setCustomerCustomLists(BaseRecordSchema<CustomerCustomListSchema> customerCustomLists) {
        this.customerCustomLists = customerCustomLists;
    }

    @JsonProperty("CustomListsLines")
    public BaseRecordSchema<CustomListLineSchema> getCustomListLines() {
        return customListLines;
    }

    @JsonProperty("CustomListsLines")
    public void setCustomListLines(BaseRecordSchema<CustomListLineSchema> customListLines) {
        this.customListLines = customListLines;
    }

    @JsonProperty("VisitsFrequencies")
    public BaseRecordSchema<CustomerFrequenciesSchema> getCustomerFrequencies() {
        return customerFrequencies;
    }

    @JsonProperty("VisitsFrequencies")
    public void setCustomerFrequencies(BaseRecordSchema<CustomerFrequenciesSchema> customerFrequencies) {
        this.customerFrequencies = customerFrequencies;
    }

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}