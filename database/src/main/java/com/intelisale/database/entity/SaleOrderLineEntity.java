package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "SaleOrderLines")
public class SaleOrderLineEntity extends BaseAuditColumns {

    private Integer saleOrderHeaderID;
    private Integer lineNo;
    private Integer itemID;
    private String itemDescription;
    private Integer warehouseID;
    private Double quantity;
    private Double quantityAvailable;
    private Double ovsQuantityAvailable;
    private Double unitPriceWithoutVAT;
    private Double unitPriceWithVAT;
    private Double lineDiscountPr;
    private Double vatPercent;
    private Double lineDiscountPercent;
    private Double lineDiscAmountWithoutVAT;
    private Double lineDiscAmountWithVAT;
    private Double lineAmountWithoutVAT;
    private Double lineAmountWithVAT;
    private Double maxDiscount;
    private Double taPrice;
    private Double taDiscount;
    private Double ovsPrice;
    private Double ovsDiscount;
    private Double campaignPrice;
    private Double campaignDiscount;
    private Double regularPrice;
    private Double regularDiscount;
    private Double minSalesPrice;
    private Integer itemUnitOfMeasureID;
    private String requestedDeliveryDate;
    private Integer backOrderShipmentStatusID;
    private Integer salesPriceTypeID;
    private Boolean requestedTradeAgreement;
    private Boolean orsyItem;
    private Integer documentVerificationStatusID;
    private String documentVerificationMessage;
    private Double bonusEarnings;
    private Double lastPrice;
    private Double minimumPrice;
    private Double basePrice;
    private Double sellingPrice;
    private Boolean ta;
    private String itemImportance;
    private Boolean discountSetAsZero;
    private Boolean priceSetAsZero;
    private Boolean priceLoaded;
    private Double priceUnit;
    private Double quantityAvailableAdd;
    private Integer stockAvailabilityStatusID;

    public Integer getSaleOrderHeaderID() {
        return saleOrderHeaderID;
    }

    public void setSaleOrderHeaderID(Integer saleOrderHeaderID) {
        this.saleOrderHeaderID = saleOrderHeaderID;
    }

    public Integer getLineNo() {
        return lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getOvsQuantityAvailable() {
        return ovsQuantityAvailable;
    }

    public void setOvsQuantityAvailable(Double ovsQuantityAvailable) {
        this.ovsQuantityAvailable = ovsQuantityAvailable;
    }

    public Double getUnitPriceWithoutVAT() {
        return unitPriceWithoutVAT;
    }

    public void setUnitPriceWithoutVAT(Double unitPriceWithoutVAT) {
        this.unitPriceWithoutVAT = unitPriceWithoutVAT;
    }

    public Double getUnitPriceWithVAT() {
        return unitPriceWithVAT;
    }

    public void setUnitPriceWithVAT(Double unitPriceWithVAT) {
        this.unitPriceWithVAT = unitPriceWithVAT;
    }

    public Double getLineDiscountPr() {
        return lineDiscountPr;
    }

    public void setLineDiscountPr(Double lineDiscountPr) {
        this.lineDiscountPr = lineDiscountPr;
    }

    public Double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(Double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public Double getLineDiscountPercent() {
        return lineDiscountPercent;
    }

    public void setLineDiscountPercent(Double lineDiscountPercent) {
        this.lineDiscountPercent = lineDiscountPercent;
    }

    public Double getLineDiscAmountWithoutVAT() {
        return lineDiscAmountWithoutVAT;
    }

    public void setLineDiscAmountWithoutVAT(Double lineDiscAmountWithoutVAT) {
        this.lineDiscAmountWithoutVAT = lineDiscAmountWithoutVAT;
    }

    public Double getLineDiscAmountWithVAT() {
        return lineDiscAmountWithVAT;
    }

    public void setLineDiscAmountWithVAT(Double lineDiscAmountWithVAT) {
        this.lineDiscAmountWithVAT = lineDiscAmountWithVAT;
    }

    public Double getLineAmountWithoutVAT() {
        return lineAmountWithoutVAT;
    }

    public void setLineAmountWithoutVAT(Double lineAmountWithoutVAT) {
        this.lineAmountWithoutVAT = lineAmountWithoutVAT;
    }

    public Double getLineAmountWithVAT() {
        return lineAmountWithVAT;
    }

    public void setLineAmountWithVAT(Double lineAmountWithVAT) {
        this.lineAmountWithVAT = lineAmountWithVAT;
    }

    public Double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(Double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public Double getTaPrice() {
        return taPrice;
    }

    public void setTaPrice(Double taPrice) {
        this.taPrice = taPrice;
    }

    public Double getTaDiscount() {
        return taDiscount;
    }

    public void setTaDiscount(Double taDiscount) {
        this.taDiscount = taDiscount;
    }

    public Double getOvsPrice() {
        return ovsPrice;
    }

    public void setOvsPrice(Double ovsPrice) {
        this.ovsPrice = ovsPrice;
    }

    public Double getOvsDiscount() {
        return ovsDiscount;
    }

    public void setOvsDiscount(Double ovsDiscount) {
        this.ovsDiscount = ovsDiscount;
    }

    public Double getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(Double campaignPrice) {
        this.campaignPrice = campaignPrice;
    }

    public Double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(Double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    public Double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Double getRegularDiscount() {
        return regularDiscount;
    }

    public void setRegularDiscount(Double regularDiscount) {
        this.regularDiscount = regularDiscount;
    }

    public Double getMinSalesPrice() {
        return minSalesPrice;
    }

    public void setMinSalesPrice(Double minSalesPrice) {
        this.minSalesPrice = minSalesPrice;
    }

    public Integer getItemUnitOfMeasureID() {
        return itemUnitOfMeasureID;
    }

    public void setItemUnitOfMeasureID(Integer itemUnitOfMeasureID) {
        this.itemUnitOfMeasureID = itemUnitOfMeasureID;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public Integer getBackOrderShipmentStatusID() {
        return backOrderShipmentStatusID;
    }

    public void setBackOrderShipmentStatusID(Integer backOrderShipmentStatusID) {
        this.backOrderShipmentStatusID = backOrderShipmentStatusID;
    }

    public Integer getSalesPriceTypeID() {
        return salesPriceTypeID;
    }

    public void setSalesPriceTypeID(Integer salesPriceTypeID) {
        this.salesPriceTypeID = salesPriceTypeID;
    }

    public Boolean getRequestedTradeAgreement() {
        return requestedTradeAgreement;
    }

    public void setRequestedTradeAgreement(Boolean requestedTradeAgreement) {
        this.requestedTradeAgreement = requestedTradeAgreement;
    }

    public Boolean getOrsyItem() {
        return orsyItem;
    }

    public void setOrsyItem(Boolean orsyItem) {
        this.orsyItem = orsyItem;
    }

    public Integer getDocumentVerificationStatusID() {
        return documentVerificationStatusID;
    }

    public void setDocumentVerificationStatusID(Integer documentVerificationStatusID) {
        this.documentVerificationStatusID = documentVerificationStatusID;
    }

    public String getDocumentVerificationMessage() {
        return documentVerificationMessage;
    }

    public void setDocumentVerificationMessage(String documentVerificationMessage) {
        this.documentVerificationMessage = documentVerificationMessage;
    }

    public Double getBonusEarnings() {
        return bonusEarnings;
    }

    public void setBonusEarnings(Double bonusEarnings) {
        this.bonusEarnings = bonusEarnings;
    }

    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(Double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Boolean getTa() {
        return ta;
    }

    public void setTa(Boolean ta) {
        this.ta = ta;
    }

    public String getItemImportance() {
        return itemImportance;
    }

    public void setItemImportance(String itemImportance) {
        this.itemImportance = itemImportance;
    }

    public Boolean getDiscountSetAsZero() {
        return discountSetAsZero;
    }

    public void setDiscountSetAsZero(Boolean discountSetAsZero) {
        this.discountSetAsZero = discountSetAsZero;
    }

    public Boolean getPriceSetAsZero() {
        return priceSetAsZero;
    }

    public void setPriceSetAsZero(Boolean priceSetAsZero) {
        this.priceSetAsZero = priceSetAsZero;
    }

    public Boolean getPriceLoaded() {
        return priceLoaded;
    }

    public void setPriceLoaded(Boolean priceLoaded) {
        this.priceLoaded = priceLoaded;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Double getQuantityAvailableAdd() {
        return quantityAvailableAdd;
    }

    public void setQuantityAvailableAdd(Double quantityAvailableAdd) {
        this.quantityAvailableAdd = quantityAvailableAdd;
    }

    public Integer getStockAvailabilityStatusID() {
        return stockAvailabilityStatusID;
    }

    public void setStockAvailabilityStatusID(Integer stockAvailabilityStatusID) {
        this.stockAvailabilityStatusID = stockAvailabilityStatusID;
    }
}
