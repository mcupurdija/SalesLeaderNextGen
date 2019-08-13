package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "SaleOrderLines")
public class SaleOrderLineEntity extends BaseAuditColumns {

    private int saleOrderHeaderId;
    private int lineNo;
    private int itemId;
    private String itemDescription;
    private int warehouseId;
    private double quantity;
    private double quantityAvailable;
    private double ovsQuantityAvailable;
    private double unitPriceWithoutVAT;
    private double unitPriceWithVAT;
    private double lineDiscountPr;
    private double vatPercent;
    private double lineDiscountPercent;
    private double lineDiscAmountWithoutVAT;
    private double lineDiscAmountWithVAT;
    private double lineAmountWithoutVAT;
    private double lineAmountWithVAT;
    private double maxDiscount;
    private double taPrice;
    private double taDiscount;
    private double ovsPrice;
    private double ovsDiscount;
    private double campaignPrice;
    private double campaignDiscount;
    private double regularPrice;
    private double regularDiscount;
    private double minSalesPrice;
    private int itemUnitOfMeasureId;
    private DateTime requestedDeliveryDate;
    private int backOrderShipmentStatusId;
    private int salesPriceTypeId;
    private boolean requestedTradeAgreement;
    private boolean orsyItem;
    private int documentVerificationStatusId;
    private String documentVerificationMessage;
    private double bonusEarnings;
    private double lastPrice;
    private double minimumPrice;
    private double basePrice;
    private double sellingPrice;
    private boolean ta;
    private String itemImportance;
    private boolean discountSetAsZero;
    private boolean priceSetAsZero;
    private boolean priceLoaded;
    private double priceUnit;
    private double quantityAvailableAdd;
    private int stockAvailabilityStatusId;

    public int getSaleOrderHeaderId() {
        return saleOrderHeaderId;
    }

    public void setSaleOrderHeaderId(int saleOrderHeaderId) {
        this.saleOrderHeaderId = saleOrderHeaderId;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getOvsQuantityAvailable() {
        return ovsQuantityAvailable;
    }

    public void setOvsQuantityAvailable(double ovsQuantityAvailable) {
        this.ovsQuantityAvailable = ovsQuantityAvailable;
    }

    public double getUnitPriceWithoutVAT() {
        return unitPriceWithoutVAT;
    }

    public void setUnitPriceWithoutVAT(double unitPriceWithoutVAT) {
        this.unitPriceWithoutVAT = unitPriceWithoutVAT;
    }

    public double getUnitPriceWithVAT() {
        return unitPriceWithVAT;
    }

    public void setUnitPriceWithVAT(double unitPriceWithVAT) {
        this.unitPriceWithVAT = unitPriceWithVAT;
    }

    public double getLineDiscountPr() {
        return lineDiscountPr;
    }

    public void setLineDiscountPr(double lineDiscountPr) {
        this.lineDiscountPr = lineDiscountPr;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public double getLineDiscountPercent() {
        return lineDiscountPercent;
    }

    public void setLineDiscountPercent(double lineDiscountPercent) {
        this.lineDiscountPercent = lineDiscountPercent;
    }

    public double getLineDiscAmountWithoutVAT() {
        return lineDiscAmountWithoutVAT;
    }

    public void setLineDiscAmountWithoutVAT(double lineDiscAmountWithoutVAT) {
        this.lineDiscAmountWithoutVAT = lineDiscAmountWithoutVAT;
    }

    public double getLineDiscAmountWithVAT() {
        return lineDiscAmountWithVAT;
    }

    public void setLineDiscAmountWithVAT(double lineDiscAmountWithVAT) {
        this.lineDiscAmountWithVAT = lineDiscAmountWithVAT;
    }

    public double getLineAmountWithoutVAT() {
        return lineAmountWithoutVAT;
    }

    public void setLineAmountWithoutVAT(double lineAmountWithoutVAT) {
        this.lineAmountWithoutVAT = lineAmountWithoutVAT;
    }

    public double getLineAmountWithVAT() {
        return lineAmountWithVAT;
    }

    public void setLineAmountWithVAT(double lineAmountWithVAT) {
        this.lineAmountWithVAT = lineAmountWithVAT;
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public double getTaPrice() {
        return taPrice;
    }

    public void setTaPrice(double taPrice) {
        this.taPrice = taPrice;
    }

    public double getTaDiscount() {
        return taDiscount;
    }

    public void setTaDiscount(double taDiscount) {
        this.taDiscount = taDiscount;
    }

    public double getOvsPrice() {
        return ovsPrice;
    }

    public void setOvsPrice(double ovsPrice) {
        this.ovsPrice = ovsPrice;
    }

    public double getOvsDiscount() {
        return ovsDiscount;
    }

    public void setOvsDiscount(double ovsDiscount) {
        this.ovsDiscount = ovsDiscount;
    }

    public double getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(double campaignPrice) {
        this.campaignPrice = campaignPrice;
    }

    public double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularDiscount() {
        return regularDiscount;
    }

    public void setRegularDiscount(double regularDiscount) {
        this.regularDiscount = regularDiscount;
    }

    public double getMinSalesPrice() {
        return minSalesPrice;
    }

    public void setMinSalesPrice(double minSalesPrice) {
        this.minSalesPrice = minSalesPrice;
    }

    public int getItemUnitOfMeasureId() {
        return itemUnitOfMeasureId;
    }

    public void setItemUnitOfMeasureId(int itemUnitOfMeasureId) {
        this.itemUnitOfMeasureId = itemUnitOfMeasureId;
    }

    public DateTime getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(DateTime requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public int getBackOrderShipmentStatusId() {
        return backOrderShipmentStatusId;
    }

    public void setBackOrderShipmentStatusId(int backOrderShipmentStatusId) {
        this.backOrderShipmentStatusId = backOrderShipmentStatusId;
    }

    public int getSalesPriceTypeId() {
        return salesPriceTypeId;
    }

    public void setSalesPriceTypeId(int salesPriceTypeId) {
        this.salesPriceTypeId = salesPriceTypeId;
    }

    public boolean isRequestedTradeAgreement() {
        return requestedTradeAgreement;
    }

    public void setRequestedTradeAgreement(boolean requestedTradeAgreement) {
        this.requestedTradeAgreement = requestedTradeAgreement;
    }

    public boolean isOrsyItem() {
        return orsyItem;
    }

    public void setOrsyItem(boolean orsyItem) {
        this.orsyItem = orsyItem;
    }

    public int getDocumentVerificationStatusId() {
        return documentVerificationStatusId;
    }

    public void setDocumentVerificationStatusId(int documentVerificationStatusId) {
        this.documentVerificationStatusId = documentVerificationStatusId;
    }

    public String getDocumentVerificationMessage() {
        return documentVerificationMessage;
    }

    public void setDocumentVerificationMessage(String documentVerificationMessage) {
        this.documentVerificationMessage = documentVerificationMessage;
    }

    public double getBonusEarnings() {
        return bonusEarnings;
    }

    public void setBonusEarnings(double bonusEarnings) {
        this.bonusEarnings = bonusEarnings;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public boolean isTa() {
        return ta;
    }

    public void setTa(boolean ta) {
        this.ta = ta;
    }

    public String getItemImportance() {
        return itemImportance;
    }

    public void setItemImportance(String itemImportance) {
        this.itemImportance = itemImportance;
    }

    public boolean isDiscountSetAsZero() {
        return discountSetAsZero;
    }

    public void setDiscountSetAsZero(boolean discountSetAsZero) {
        this.discountSetAsZero = discountSetAsZero;
    }

    public boolean isPriceSetAsZero() {
        return priceSetAsZero;
    }

    public void setPriceSetAsZero(boolean priceSetAsZero) {
        this.priceSetAsZero = priceSetAsZero;
    }

    public boolean isPriceLoaded() {
        return priceLoaded;
    }

    public void setPriceLoaded(boolean priceLoaded) {
        this.priceLoaded = priceLoaded;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public double getQuantityAvailableAdd() {
        return quantityAvailableAdd;
    }

    public void setQuantityAvailableAdd(double quantityAvailableAdd) {
        this.quantityAvailableAdd = quantityAvailableAdd;
    }

    public int getStockAvailabilityStatusId() {
        return stockAvailabilityStatusId;
    }

    public void setStockAvailabilityStatusId(int stockAvailabilityStatusId) {
        this.stockAvailabilityStatusId = stockAvailabilityStatusId;
    }
}
