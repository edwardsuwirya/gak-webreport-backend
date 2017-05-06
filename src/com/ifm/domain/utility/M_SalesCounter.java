package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_SalesCounter {
    private String s_companyCode;
    private String s_mscCustomerAutoNumber;
    private String s_mscCustomerPrefix;
    private String s_mscCustomerArea;
    private String s_mscCustomerRC;
    private String s_mscCustomerYear;
    private String s_mscCustomerMonth;
    private String s_mscCustomerSeparator;
    private int i_mscCustomerDigit;
    private String s_mscQuotationAutoNumber;
    private String s_mscQuotationPrefix;
    private String s_mscQuotationRC;
    private String s_mscQuotationYear;
    private String s_mscQuotationMonth;
    private String s_mscQuotationSeparator;
    private int i_mscQuotationDigit;
    private String s_mscQuotationDeliveryTime;
    private String s_mscQuotationDeliveryPoint;
    private String s_mscQuotationDeliveryValidity;
    private String s_mscQuotationShipping;
    private int i_mscQuotationMaxArticle;
    private String s_mscReceiveOrderAutoNumber;
    private String s_mscReceiveOrderPrefix;
    private String s_mscReceiveOrderRC;
    private String s_mscReceiveOrderYear;
    private String s_mscReceiveOrderMonth;
    private String s_mscReceiveOrderSeparator;
    private int i_mscReceiveOrderDigit;
    private String s_mscReceiveOrderNote1;
    private String s_mscReceiveOrderNote2;
    private String s_mscReceiveOrderNote3;
    private int i_mscReceiveOrderMaxArticle;
    private String s_mscSalesOrderAutoNumber;
    private String s_mscSalesOrderPrefix;
    private String s_mscSalesOrderRC;
    private String s_mscSalesOrderYear;
    private String s_mscSalesOrderMonth;
    private String s_mscSalesOrderSeparator;
    private int i_mscSalesOrderDigit;
    private String s_mscSalesOrderNote1;
    private String s_mscSalesOrderNote2;
    private String s_mscSalesOrderNote3;
    private int i_mscSalesOrderMaxArticle;
    private String s_mscDeliveryOrderAutoNumber;
    private String s_mscDeliveryOrderPrefix;
    private String s_mscDeliveryOrderWarehouse;
    private String s_mscDeliveryOrderYear;
    private String s_mscDeliveryOrderMonth;
    private String s_mscDeliveryOrderSeparator;
    private int i_mscDeliveryOrderDigit;
    private String s_mscDeliveryOrderTaxAutoNumber;
    private String s_mscDeliveryOrderTaxPrefix;
    private String s_mscDeliveryOrderTaxWarehouse;
    private String s_mscDeliveryOrderTaxYear;
    private String s_mscDeliveryOrderTaxMonth;
    private String s_mscDeliveryOrderTaxSeparator;
    private int i_mscDeliveryOrderTaxDigit;
    private String s_mscDeliveryOrderNote1;
    private String s_mscDeliveryOrderNote2;
    private String s_mscDeliveryOrderNote3;
    private int i_mscDeliveryOrderMaxArticle;
    private String s_mscPackingListAutoNumber;
    private String s_mscPackingListPrefix;
    private String s_mscPackingListWarehouse;
    private String s_mscPackingListYear;
    private String s_mscPackingListMonth;
    private String s_mscPackingListSeparator;
    private int i_mscPackingListDigit;
    private String s_mscPackingListNote1;
    private String s_mscPackingListNote2;
    private String s_mscPackingListNote3;
    private int i_mscPackingListMaxArticle;
    private String s_mscSalesInvoiceAutoNumber;
    private String s_mscSalesInvoicePrefix;
    private String s_mscSalesInvoiceDivision;
    private String s_mscSalesInvoiceRC;
    private String s_mscSalesInvoiceYear;
    private String s_mscSalesInvoiceMonth;
    private String s_mscSalesInvoiceSeparator;
    private int i_mscSalesInvoiceDigit;
    private String s_mscSalesInvoiceCharge1Desc;
    private String s_mscSalesInvoiceCharge2Desc;
    private String s_mscSalesInvoiceTaxAutoNumber;
    private String s_mscSalesInvoiceTaxPrefix;
    private String s_mscSalesInvoiceTaxDivision;
    private String s_mscSalesInvoiceTaxRC;
    private String s_mscSalesInvoiceTaxYear;
    private String s_mscSalesInvoiceTaxMonth;
    private String s_mscSalesInvoiceTaxSeparator;
    private int i_mscSalesInvoiceTaxDigit;
    private String s_mscSalesInvoiceNote1;
    private String s_mscSalesInvoiceNote2;
    private String s_mscSalesInvoiceNote3;
    private int i_mscSalesInvoiceMaxArticle;
    private String s_mscSalesReturAutoNumber;
    private String s_mscSalesReturPrefix;
    private String s_mscSalesReturRC;
    private String s_mscSalesReturYear;
    private String s_mscSalesReturMonth;
    private String s_mscSalesReturSeparator;
    private int i_mscSalesReturDigit;
    private String s_mscSalesReturNote1;
    private String s_mscSalesReturNote2;
    private String s_mscSalesReturNote3;
    private int i_mscSalesReturMaxArticle;
    private String s_mscSalesWorkOrderAutoNumber;
    private String s_mscSalesWorkOrderPrefix;
    private String s_mscSalesWorkOrderRC;
    private String s_mscSalesWorkOrderYear;
    private String s_mscSalesWorkOrderMonth;
    private String s_mscSalesWorkOrderSeparator;
    private int i_mscSalesWorkOrderDigit;
    private String s_mscSalesWorkOrderNote1;
    private String s_mscSalesWorkOrderNote2;
    private String s_mscSalesWorkOrderNote3;
    private int i_mscSalesWorkOrderMaxArticle;
    private int i_mscCreateID;
    private Date d_mscCreateDate;
    private int i_mscUpdateID;
    private Date d_mscUpdateDate;

    public M_SalesCounter() {
    }

	/*
    public M_SalesCounter(String s_companyCode,
			String s_mscCustomerAutoNumber,
			String s_mscCustomerPrefix,
			String s_mscCustomerArea,
			String s_mscCustomerRC,
			String s_mscCustomerYear,
			String s_mscCustomerMonth,
			String s_mscCustomerSeparator,
			int i_mscCustomerDigit,
			String s_mscQuotationAutoNumber,
			String s_mscQuotationPrefix,
			String s_mscQuotationRC,
			String s_mscQuotationYear,
			String s_mscQuotationMonth,
			String s_mscQuotationSeparator,
			int i_mscQuotationDigit,
			String s_mscQuotationDeliveryTime,
			String s_mscQuotationDeliveryPoint,
			String s_mscQuotationDeliveryValidity,
			String s_mscQuotationShipping,
			int i_mscQuotationMaxArticle,
			String s_mscReceiveOrderAutoNumber,
			String s_mscReceiveOrderPrefix,
			String s_mscReceiveOrderRC,
			String s_mscReceiveOrderYear,
			String s_mscReceiveOrderMonth,
			String s_mscReceiveOrderSeparator,
			int i_mscReceiveOrderDigit,
			String s_mscReceiveOrderNote1,
			String s_mscReceiveOrderNote2,
			String s_mscReceiveOrderNote3,
			int i_mscReceiveOrderMaxArticle,
			String s_mscSalesOrderAutoNumber,
			String s_mscSalesOrderPrefix,
			String s_mscSalesOrderRC,
			String s_mscSalesOrderYear,
			String s_mscSalesOrderMonth,
			String s_mscSalesOrderSeparator,
			int i_mscSalesOrderDigit,
			String s_mscSalesOrderNote1,
			String s_mscSalesOrderNote2,
			String s_mscSalesOrderNote3,
			int i_mscSalesOrderMaxArticle,
			String s_mscDeliveryOrderAutoNumber,
			String s_mscDeliveryOrderPrefix,
			String s_mscDeliveryOrderWarehouse,
			String s_mscDeliveryOrderYear,
			String s_mscDeliveryOrderMonth,
			String s_mscDeliveryOrderSeparator,
			int i_mscDeliveryOrderDigit,
			String s_mscDeliveryOrderTaxAutoNumber,
			String s_mscDeliveryOrderTaxPrefix,
			String s_mscDeliveryOrderTaxWarehouse,
			String s_mscDeliveryOrderTaxYear,
			String s_mscDeliveryOrderTaxMonth,
			String s_mscDeliveryOrderTaxSeparator,
			int i_mscDeliveryOrderTaxDigit,
			String s_mscDeliveryOrderNote1,
			String s_mscDeliveryOrderNote2,
			String s_mscDeliveryOrderNote3,
			int i_mscDeliveryOrderMaxArticle,
			String s_mscPackingListAutoNumber,
			String s_mscPackingListPrefix,
			String s_mscPackingListWarehouse,
			String s_mscPackingListYear,
			String s_mscPackingListMonth,
			String s_mscPackingListSeparator,
			int i_mscPackingListDigit,
			String s_mscPackingListNote1,
			String s_mscPackingListNote2,
			String s_mscPackingListNote3,
			int i_mscPackingListMaxArticle,	
			String s_mscSalesInvoiceAutoNumber,
			String s_mscSalesInvoicePrefix,
			String s_mscSalesInvoiceRC,
			String s_mscSalesInvoiceYear,
			String s_mscSalesInvoiceMonth,
			String s_mscSalesInvoiceSeparator,
			int i_mscSalesInvoiceDigit,
			String s_mscSalesInvoiceTaxAutoNumber,
			String s_mscSalesInvoiceTaxPrefix,
			String s_mscSalesInvoiceTaxDivision;
			String s_mscSalesInvoiceDivision;
			String s_mscSalesInvoiceTaxRC,
			String s_mscSalesInvoiceTaxYear,
			String s_mscSalesInvoiceTaxMonth,
			String s_mscSalesInvoiceTaxSeparator,
			int i_mscSalesInvoiceTaxDigit,
			String s_mscSalesInvoiceNote1,
			String s_mscSalesInvoiceNote2,
			String s_mscSalesInvoiceNote3,
			int i_mscSalesInvoiceMaxArticle,
			String s_mscSalesReturAutoNumber,
			String s_mscSalesReturPrefix,
			String s_mscSalesReturRC,
			String s_mscSalesReturYear,
			String s_mscSalesReturMonth,
			String s_mscSalesReturSeparator,
			int i_mscSalesReturDigit,
			String s_mscSalesReturNote1,
			String s_mscSalesReturNote2,
			String s_mscSalesReturNote3,
			int i_mscSalesReturMaxArticle,		
			String s_mscSalesWorkOrderAutoNumber,
			String s_mscSalesWorkOrderPrefix,
			String s_mscSalesWorkOrderRC,
			String s_mscSalesWorkOrderYear,
			String s_mscSalesWorkOrderMonth,
			String s_mscSalesWorkOrderSeparator,
			int i_mscSalesWorkOrderDigit,
			String s_mscSalesWorkOrderNote1,
			String s_mscSalesWorkOrderNote2,
			String s_mscSalesWorkOrderNote3,
			int i_mscSalesWorkOrderMaxArticle,		
			int i_msccreateid,
			Date d_msccreatedate,
			int i_mscupdateid,
			Date d_mscupdatedate) {
		this.s_companyCode = s_companyCode;
		this.s_mscCustomerAutoNumber = s_mscCustomerAutoNumber;
		this.s_mscCustomerPrefix = s_mscCustomerPrefix;
		this.s_mscCustomerArea = s_mscCustomerArea;
		this.s_mscCustomerRC = s_mscCustomerRC;
		this.s_mscCustomerYear = s_mscCustomerYear;
		this.s_mscCustomerMonth = s_mscCustomerMonth;
		this.s_mscCustomerSeparator = s_mscCustomerSeparator;
		this.i_mscCustomerDigit = i_mscCustomerDigit;
		this.s_mscQuotationAutoNumber = s_mscQuotationAutoNumber;
		this.s_mscQuotationPrefix = s_mscQuotationPrefix;
		this.s_mscQuotationRC = s_mscQuotationRC;
		this.s_mscQuotationYear = s_mscQuotationYear;
		this.s_mscQuotationMonth = s_mscQuotationMonth;
		this.s_mscQuotationSeparator = s_mscQuotationSeparator;
		this.i_mscQuotationDigit = i_mscQuotationDigit;
		this.s_mscQuotationDeliveryTime = s_mscQuotationDeliveryTime;
		this.s_mscQuotationDeliveryPoint = s_mscQuotationDeliveryPoint;
		this.s_mscQuotationDeliveryValidity = s_mscQuotationDeliveryValidity;
		this.s_mscQuotationShipping = s_mscQuotationShipping;
		this.i_mscQuotationMaxArticle =i_mscQuotationMaxArticle;
		this.s_mscReceiveOrderAutoNumber = s_mscReceiveOrderAutoNumber;
		this.s_mscReceiveOrderPrefix = s_mscReceiveOrderPrefix;
		this.s_mscReceiveOrderRC = s_mscReceiveOrderRC;
		this.s_mscReceiveOrderYear = s_mscReceiveOrderYear;
		this.s_mscReceiveOrderMonth = s_mscReceiveOrderMonth;
		this.s_mscReceiveOrderSeparator = s_mscReceiveOrderSeparator;
		this.i_mscReceiveOrderDigit = i_mscReceiveOrderDigit;
		this.s_mscReceiveOrderNote1 = s_mscReceiveOrderNote1;
		this.s_mscReceiveOrderNote2 = s_mscReceiveOrderNote2;
		this.s_mscReceiveOrderNote3 = s_mscReceiveOrderNote3;
		this.i_mscreceiveOrderMaxArticle =i_mscReceiveOrderMaxArticle;
		this.s_mscSalesOrderAutoNumber = s_mscSalesOrderAutoNumber;
		this.s_mscSalesOrderPrefix = s_mscSalesOrderPrefix;
		this.s_mscSalesOrderRC = s_mscSalesOrderRC;
		this.s_mscSalesOrderYear = s_mscSalesOrderYear;
		this.s_mscSalesOrderMonth = s_mscSalesOrderMonth;
		this.s_mscSalesOrderSeparator = s_mscSalesOrderSeparator;
		this.i_mscSalesOrderDigit = i_mscSalesOrderDigit;
		this.s_mscSalesOrderNote1 = s_mscSalesOrderNote1;
		this.s_mscSalesOrderNote2 = s_mscSalesOrderNote2;
		this.s_mscSalesOrderNote3 = s_mscSalesOrderNote3;
		this.i_mscSalesOrderMaxArticle =i_mscSalesOrderMaxArticle;
		this.s_mscDeliveryOrderAutoNumber = s_mscDeliveryOrderAutoNumber;
		this.s_mscDeliveryOrderPrefix = s_mscDeliveryOrderPrefix;
		this.s_mscDeliveryOrderWarehouse = s_mscDeliveryOrderWarehouse;
		this.s_mscDeliveryOrderYear = s_mscDeliveryOrderYear;
		this.s_mscDeliveryOrderMonth = s_mscDeliveryOrderMonth;
		this.s_mscDeliveryOrderSeparator = s_mscDeliveryOrderSeparator;
		this.i_mscDeliveryOrderDigit = i_mscDeliveryOrderDigit;
		this.s_mscDeliveryOrderTaxAutoNumber = s_mscDeliveryOrderTaxAutoNumber;
		this.s_mscDeliveryOrderTaxPrefix = s_mscDeliveryOrderTaxPrefix;
		this.s_mscDeliveryOrderTaxWarehouse = s_mscDeliveryOrderTaxWarehouse;
		this.s_mscDeliveryOrderTaxYear = s_mscDeliveryOrderTaxYear;
		this.s_mscDeliveryOrderTaxMonth = s_mscDeliveryOrderTaxMonth;
		this.s_mscDeliveryOrderTaxSeparator = s_mscDeliveryOrderTaxSeparator;
		this.i_mscDeliveryOrderTaxDigit = i_mscDeliveryOrderTaxDigit;
		this.s_mscDeliveryOrderNote1 = s_mscDeliveryOrderNote1;
		this.s_mscDeliveryOrderNote2 = s_mscDeliveryOrderNote2;
		this.s_mscDeliveryOrderNote3 = s_mscDeliveryOrderNote3;
		this.i_mscDeliveryOrderMaxArticle =i_mscDeliveryOrderMaxArticle;
		this.s_mscPackingListAutoNumber = s_mscPackingListAutoNumber;
		this.s_mscPackingListPrefix = s_mscPackingListPrefix;
		this.s_mscPackingListWarehouse = s_mscPackingListWarehouse;
		this.s_mscPackingListYear = s_mscPackingListYear;
		this.s_mscPackingListMonth = s_mscPackingListMonth;
		this.s_mscPackingListSeparator = s_mscPackingListSeparator;
		this.i_mscPackingListDigit = i_mscPackingListDigit;
		this.s_mscPackingListNote1 = s_mscPackingListNote1;
		this.s_mscPackingListNote2 = s_mscPackingListNote2;
		this.s_mscPackingListNote3 = s_mscPackingListNote3;	
		this.i_mscPackingListMaxArticle =i_mscPackingListMaxArticle;
		this.s_mscSalesInvoiceAutoNumber = s_mscSalesInvoiceAutoNumber;
		this.s_mscSalesInvoicePrefix = s_mscSalesInvoicePrefix;
		this.s_mscSalesInvoiceDivision = s_mscSalesInvoiceDivision; 
		this.s_mscSalesInvoiceRC = s_mscSalesInvoiceRC;
		this.s_mscSalesInvoiceYear = s_mscSalesInvoiceYear;
		this.s_mscSalesInvoiceMonth = s_mscSalesInvoiceMonth;
		this.s_mscSalesInvoiceSeparator = s_mscSalesInvoiceSeparator;
		this.i_mscSalesInvoiceDigit = i_mscSalesInvoiceDigit;
		this.s_mscSalesInvoiceTaxAutoNumber = s_mscSalesInvoiceTaxAutoNumber;
		this.s_mscSalesInvoiceTaxPrefix = s_mscSalesInvoiceTaxPrefix;
		this.s_mscSalesInvoiceTaxDivision = s_mscSalesInvoiceTaxDivision;
		this.s_mscSalesInvoiceTaxRC = s_mscSalesInvoiceTaxRC;
		this.s_mscSalesInvoiceTaxYear = s_mscSalesInvoiceTaxYear;
		this.s_mscSalesInvoiceTaxMonth = s_mscSalesInvoiceTaxMonth;
		this.s_mscSalesInvoiceTaxSeparator = s_mscSalesInvoiceTaxSeparator;
		this.i_mscSalesInvoiceTaxDigit = i_mscSalesInvoiceTaxDigit;
		this.s_mscSalesInvoiceNote1 = s_mscSalesInvoiceNote1;
		this.s_mscSalesInvoiceNote2 = s_mscSalesInvoiceNote2;
		this.s_mscSalesInvoiceNote3 = s_mscSalesInvoiceNote3;
		this.i_mscSalesInvoiceMaxArticle =i_mscSalesInvoiceMaxArticle;
		this.s_mscSalesReturAutoNumber = s_mscSalesReturAutoNumber;
		this.s_mscSalesReturPrefix = s_mscSalesReturPrefix;
		this.s_mscSalesReturRC = s_mscSalesReturRC;
		this.s_mscSalesReturYear = s_mscSalesReturYear;
		this.s_mscSalesReturMonth = s_mscSalesReturMonth;
		this.s_mscSalesReturSeparator = s_mscSalesReturSeparator;
		this.i_mscSalesReturDigit = i_mscSalesReturDigit;
		this.s_mscSalesReturNote1 = s_mscSalesReturNote1;
		this.s_mscSalesReturNote2 = s_mscSalesReturNote2;
		this.s_mscSalesReturNote3 = s_mscSalesReturNote3;	
		this.i_mscSalesReturMaxArticle =i_mscSalesReturMaxArticle;	
		this.s_mscSalesWorkOrderAutoNumber = s_mscSalesWorkOrderAutoNumber;
		this.s_mscSalesWorkOrderPrefix = s_mscSalesWorkOrderPrefix;
		this.s_mscSalesWorkOrderRC = s_mscSalesWorkOrderRC;
		this.s_mscSalesWorkOrderYear = s_mscSalesWorkOrderYear;
		this.s_mscSalesWorkOrderMonth = s_mscSalesWorkOrderMonth;
		this.s_mscSalesWorkOrderSeparator = s_mscSalesWorkOrderSeparator;
		this.i_mscSalesWorkOrderDigit = i_mscSalesWorkOrderDigit;
		this.s_mscSalesWorkOrderNote1 = s_mscSalesWorkOrderNote1;
		this.s_mscSalesWorkOrderNote2 = s_mscSalesWorkOrderNote2;
		this.s_mscSalesWorkOrderNote3 = s_mscSalesWorkOrderNote3;	
		this.i_mscSalesWorkOrderMaxArticle =i_mscSalesWorkOrderMaxArticle;	
		this.i_msccreateid = i_msccreateid;
		this.d_msccreatedate = d_msccreatedate;
		this.i_mscupdateid = i_mscupdateid;
		this.d_mscupdatedate = d_mscupdatedate;
	}
	*/

    public String getS_companyCode() {
        return s_companyCode;
    }

    public void setS_companyCode(String s_companyCode) {
        this.s_companyCode = s_companyCode;
    }

    public String getS_mscCustomerAutoNumber() {
        return s_mscCustomerAutoNumber;
    }

    public void setS_mscCustomerAutoNumber(String s_mscCustomerAutoNumber) {
        this.s_mscCustomerAutoNumber = s_mscCustomerAutoNumber;
    }

    public String getS_mscCustomerPrefix() {
        return s_mscCustomerPrefix;
    }

    public void setS_mscCustomerPrefix(String s_mscCustomerPrefix) {
        this.s_mscCustomerPrefix = s_mscCustomerPrefix;
    }

    public String getS_mscCustomerArea() {
        return s_mscCustomerArea;
    }

    public void setS_mscCustomerArea(String s_mscCustomerArea) {
        this.s_mscCustomerArea = s_mscCustomerArea;
    }

    public String getS_mscCustomerRC() {
        return s_mscCustomerRC;
    }

    public void setS_mscCustomerRC(String s_mscCustomerRC) {
        this.s_mscCustomerRC = s_mscCustomerRC;
    }

    public String getS_mscCustomerYear() {
        return s_mscCustomerYear;
    }

    public void setS_mscCustomerYear(String s_mscCustomerYear) {
        this.s_mscCustomerYear = s_mscCustomerYear;
    }

    public String getS_mscCustomerMonth() {
        return s_mscCustomerMonth;
    }

    public void setS_mscCustomerMonth(String s_mscCustomerMonth) {
        this.s_mscCustomerMonth = s_mscCustomerMonth;
    }

    public String getS_mscCustomerSeparator() {
        return s_mscCustomerSeparator;
    }

    public void setS_mscCustomerSeparator(String s_mscCustomerSeparator) {
        this.s_mscCustomerSeparator = s_mscCustomerSeparator;
    }

    public int getI_mscCustomerDigit() {
        return i_mscCustomerDigit;
    }

    public void setI_mscCustomerDigit(int i_mscCustomerDigit) {
        this.i_mscCustomerDigit = i_mscCustomerDigit;
    }

    public String getS_mscQuotationAutoNumber() {
        return s_mscQuotationAutoNumber;
    }

    public void setS_mscQuotationAutoNumber(String s_mscQuotationAutoNumber) {
        this.s_mscQuotationAutoNumber = s_mscQuotationAutoNumber;
    }

    public String getS_mscQuotationPrefix() {
        return s_mscQuotationPrefix;
    }

    public void setS_mscQuotationPrefix(String s_mscQuotationPrefix) {
        this.s_mscQuotationPrefix = s_mscQuotationPrefix;
    }

    public String getS_mscQuotationRC() {
        return s_mscQuotationRC;
    }

    public void setS_mscQuotationRC(String s_mscQuotationRC) {
        this.s_mscQuotationRC = s_mscQuotationRC;
    }

    public String getS_mscQuotationYear() {
        return s_mscQuotationYear;
    }

    public void setS_mscQuotationYear(String s_mscQuotationYear) {
        this.s_mscQuotationYear = s_mscQuotationYear;
    }

    public String getS_mscQuotationMonth() {
        return s_mscQuotationMonth;
    }

    public void setS_mscQuotationMonth(String s_mscQuotationMonth) {
        this.s_mscQuotationMonth = s_mscQuotationMonth;
    }

    public String getS_mscQuotationSeparator() {
        return s_mscQuotationSeparator;
    }

    public void setS_mscQuotationSeparator(String s_mscQuotationSeparator) {
        this.s_mscQuotationSeparator = s_mscQuotationSeparator;
    }

    public int getI_mscQuotationDigit() {
        return i_mscQuotationDigit;
    }

    public void setI_mscQuotationDigit(int i_mscQuotationDigit) {
        this.i_mscQuotationDigit = i_mscQuotationDigit;
    }

    public String getS_mscQuotationDeliveryTime() {
        return s_mscQuotationDeliveryTime;
    }

    public void setS_mscQuotationDeliveryTime(String s_mscQuotationDeliveryTime) {
        this.s_mscQuotationDeliveryTime = s_mscQuotationDeliveryTime;
    }

    public String getS_mscQuotationDeliveryPoint() {
        return s_mscQuotationDeliveryPoint;
    }

    public void setS_mscQuotationDeliveryPoint(String s_mscQuotationDeliveryPoint) {
        this.s_mscQuotationDeliveryPoint = s_mscQuotationDeliveryPoint;
    }

    public String getS_mscQuotationDeliveryValidity() {
        return s_mscQuotationDeliveryValidity;
    }

    public void setS_mscQuotationDeliveryValidity(
            String s_mscQuotationDeliveryValidity) {
        this.s_mscQuotationDeliveryValidity = s_mscQuotationDeliveryValidity;
    }

    public String getS_mscQuotationShipping() {
        return s_mscQuotationShipping;
    }

    public void setS_mscQuotationShipping(String s_mscQuotationShipping) {
        this.s_mscQuotationShipping = s_mscQuotationShipping;
    }

    public int getI_mscQuotationMaxArticle() {
        return i_mscQuotationMaxArticle;
    }

    public void setI_mscQuotationMaxArticle(int i_mscQuotationMaxArticle) {
        this.i_mscQuotationMaxArticle = i_mscQuotationMaxArticle;
    }

    public String getS_mscReceiveOrderAutoNumber() {
        return s_mscReceiveOrderAutoNumber;
    }

    public void setS_mscReceiveOrderAutoNumber(String s_mscReceiveOrderAutoNumber) {
        this.s_mscReceiveOrderAutoNumber = s_mscReceiveOrderAutoNumber;
    }

    public String getS_mscReceiveOrderPrefix() {
        return s_mscReceiveOrderPrefix;
    }

    public void setS_mscReceiveOrderPrefix(String s_mscReceiveOrderPrefix) {
        this.s_mscReceiveOrderPrefix = s_mscReceiveOrderPrefix;
    }

    public String getS_mscReceiveOrderRC() {
        return s_mscReceiveOrderRC;
    }

    public void setS_mscReceiveOrderRC(String s_mscReceiveOrderRC) {
        this.s_mscReceiveOrderRC = s_mscReceiveOrderRC;
    }

    public String getS_mscReceiveOrderYear() {
        return s_mscReceiveOrderYear;
    }

    public void setS_mscReceiveOrderYear(String s_mscReceiveOrderYear) {
        this.s_mscReceiveOrderYear = s_mscReceiveOrderYear;
    }

    public String getS_mscReceiveOrderMonth() {
        return s_mscReceiveOrderMonth;
    }

    public void setS_mscReceiveOrderMonth(String s_mscReceiveOrderMonth) {
        this.s_mscReceiveOrderMonth = s_mscReceiveOrderMonth;
    }

    public String getS_mscReceiveOrderSeparator() {
        return s_mscReceiveOrderSeparator;
    }

    public void setS_mscReceiveOrderSeparator(String s_mscReceiveOrderSeparator) {
        this.s_mscReceiveOrderSeparator = s_mscReceiveOrderSeparator;
    }

    public int getI_mscReceiveOrderDigit() {
        return i_mscReceiveOrderDigit;
    }

    public void setI_mscReceiveOrderDigit(int i_mscReceiveOrderDigit) {
        this.i_mscReceiveOrderDigit = i_mscReceiveOrderDigit;
    }

    public String getS_mscReceiveOrderNote1() {
        return s_mscReceiveOrderNote1;
    }

    public void setS_mscReceiveOrderNote1(String s_mscReceiveOrderNote1) {
        this.s_mscReceiveOrderNote1 = s_mscReceiveOrderNote1;
    }

    public String getS_mscReceiveOrderNote2() {
        return s_mscReceiveOrderNote2;
    }

    public void setS_mscReceiveOrderNote2(String s_mscReceiveOrderNote2) {
        this.s_mscReceiveOrderNote2 = s_mscReceiveOrderNote2;
    }

    public String getS_mscReceiveOrderNote3() {
        return s_mscReceiveOrderNote3;
    }

    public void setS_mscReceiveOrderNote3(String s_mscReceiveOrderNote3) {
        this.s_mscReceiveOrderNote3 = s_mscReceiveOrderNote3;
    }

    public int getI_mscReceiveOrderMaxArticle() {
        return i_mscReceiveOrderMaxArticle;
    }

    public void setI_mscReceiveOrderMaxArticle(int i_mscReceiveOrderMaxArticle) {
        this.i_mscReceiveOrderMaxArticle = i_mscReceiveOrderMaxArticle;
    }

    public String getS_mscSalesOrderAutoNumber() {
        return s_mscSalesOrderAutoNumber;
    }

    public void setS_mscSalesOrderAutoNumber(String s_mscSalesOrderAutoNumber) {
        this.s_mscSalesOrderAutoNumber = s_mscSalesOrderAutoNumber;
    }

    public String getS_mscSalesOrderPrefix() {
        return s_mscSalesOrderPrefix;
    }

    public void setS_mscSalesOrderPrefix(String s_mscSalesOrderPrefix) {
        this.s_mscSalesOrderPrefix = s_mscSalesOrderPrefix;
    }

    public String getS_mscSalesOrderRC() {
        return s_mscSalesOrderRC;
    }

    public void setS_mscSalesOrderRC(String s_mscSalesOrderRC) {
        this.s_mscSalesOrderRC = s_mscSalesOrderRC;
    }

    public String getS_mscSalesOrderYear() {
        return s_mscSalesOrderYear;
    }

    public void setS_mscSalesOrderYear(String s_mscSalesOrderYear) {
        this.s_mscSalesOrderYear = s_mscSalesOrderYear;
    }

    public String getS_mscSalesOrderMonth() {
        return s_mscSalesOrderMonth;
    }

    public void setS_mscSalesOrderMonth(String s_mscSalesOrderMonth) {
        this.s_mscSalesOrderMonth = s_mscSalesOrderMonth;
    }

    public String getS_mscSalesOrderSeparator() {
        return s_mscSalesOrderSeparator;
    }

    public void setS_mscSalesOrderSeparator(String s_mscSalesOrderSeparator) {
        this.s_mscSalesOrderSeparator = s_mscSalesOrderSeparator;
    }

    public int getI_mscSalesOrderDigit() {
        return i_mscSalesOrderDigit;
    }

    public void setI_mscSalesOrderDigit(int i_mscSalesOrderDigit) {
        this.i_mscSalesOrderDigit = i_mscSalesOrderDigit;
    }

    public String getS_mscSalesOrderNote1() {
        return s_mscSalesOrderNote1;
    }

    public void setS_mscSalesOrderNote1(String s_mscSalesOrderNote1) {
        this.s_mscSalesOrderNote1 = s_mscSalesOrderNote1;
    }

    public String getS_mscSalesOrderNote2() {
        return s_mscSalesOrderNote2;
    }

    public void setS_mscSalesOrderNote2(String s_mscSalesOrderNote2) {
        this.s_mscSalesOrderNote2 = s_mscSalesOrderNote2;
    }

    public String getS_mscSalesOrderNote3() {
        return s_mscSalesOrderNote3;
    }

    public void setS_mscSalesOrderNote3(String s_mscSalesOrderNote3) {
        this.s_mscSalesOrderNote3 = s_mscSalesOrderNote3;
    }

    public int getI_mscSalesOrderMaxArticle() {
        return i_mscSalesOrderMaxArticle;
    }

    public void setI_mscSalesOrderMaxArticle(int i_mscSalesOrderMaxArticle) {
        this.i_mscSalesOrderMaxArticle = i_mscSalesOrderMaxArticle;
    }

    public String getS_mscDeliveryOrderAutoNumber() {
        return s_mscDeliveryOrderAutoNumber;
    }

    public void setS_mscDeliveryOrderAutoNumber(String s_mscDeliveryOrderAutoNumber) {
        this.s_mscDeliveryOrderAutoNumber = s_mscDeliveryOrderAutoNumber;
    }

    public String getS_mscDeliveryOrderPrefix() {
        return s_mscDeliveryOrderPrefix;
    }

    public void setS_mscDeliveryOrderPrefix(String s_mscDeliveryOrderPrefix) {
        this.s_mscDeliveryOrderPrefix = s_mscDeliveryOrderPrefix;
    }

    public String getS_mscDeliveryOrderWarehouse() {
        return s_mscDeliveryOrderWarehouse;
    }

    public void setS_mscDeliveryOrderWarehouse(String s_mscDeliveryOrderWarehouse) {
        this.s_mscDeliveryOrderWarehouse = s_mscDeliveryOrderWarehouse;
    }

    public String getS_mscDeliveryOrderYear() {
        return s_mscDeliveryOrderYear;
    }

    public void setS_mscDeliveryOrderYear(String s_mscDeliveryOrderYear) {
        this.s_mscDeliveryOrderYear = s_mscDeliveryOrderYear;
    }

    public String getS_mscDeliveryOrderMonth() {
        return s_mscDeliveryOrderMonth;
    }

    public void setS_mscDeliveryOrderMonth(String s_mscDeliveryOrderMonth) {
        this.s_mscDeliveryOrderMonth = s_mscDeliveryOrderMonth;
    }

    public String getS_mscDeliveryOrderSeparator() {
        return s_mscDeliveryOrderSeparator;
    }

    public void setS_mscDeliveryOrderSeparator(String s_mscDeliveryOrderSeparator) {
        this.s_mscDeliveryOrderSeparator = s_mscDeliveryOrderSeparator;
    }

    public int getI_mscDeliveryOrderDigit() {
        return i_mscDeliveryOrderDigit;
    }

    public void setI_mscDeliveryOrderDigit(int i_mscDeliveryOrderDigit) {
        this.i_mscDeliveryOrderDigit = i_mscDeliveryOrderDigit;
    }

    public String getS_mscDeliveryOrderNote1() {
        return s_mscDeliveryOrderNote1;
    }

    public void setS_mscDeliveryOrderNote1(String s_mscDeliveryOrderNote1) {
        this.s_mscDeliveryOrderNote1 = s_mscDeliveryOrderNote1;
    }

    public String getS_mscDeliveryOrderNote2() {
        return s_mscDeliveryOrderNote2;
    }

    public void setS_mscDeliveryOrderNote2(String s_mscDeliveryOrderNote2) {
        this.s_mscDeliveryOrderNote2 = s_mscDeliveryOrderNote2;
    }

    public String getS_mscDeliveryOrderNote3() {
        return s_mscDeliveryOrderNote3;
    }

    public void setS_mscDeliveryOrderNote3(String s_mscDeliveryOrderNote3) {
        this.s_mscDeliveryOrderNote3 = s_mscDeliveryOrderNote3;
    }

    public String getS_mscDeliveryOrderTaxAutoNumber() {
        return s_mscDeliveryOrderTaxAutoNumber;
    }

    public void setS_mscDeliveryOrderTaxAutoNumber(
            String s_mscDeliveryOrderTaxAutoNumber) {
        this.s_mscDeliveryOrderTaxAutoNumber = s_mscDeliveryOrderTaxAutoNumber;
    }

    public String getS_mscDeliveryOrderTaxPrefix() {
        return s_mscDeliveryOrderTaxPrefix;
    }

    public void setS_mscDeliveryOrderTaxPrefix(String s_mscDeliveryOrderTaxPrefix) {
        this.s_mscDeliveryOrderTaxPrefix = s_mscDeliveryOrderTaxPrefix;
    }

    public String getS_mscDeliveryOrderTaxWarehouse() {
        return s_mscDeliveryOrderTaxWarehouse;
    }

    public void setS_mscDeliveryOrderTaxWarehouse(
            String s_mscDeliveryOrderTaxWarehouse) {
        this.s_mscDeliveryOrderTaxWarehouse = s_mscDeliveryOrderTaxWarehouse;
    }

    public String getS_mscDeliveryOrderTaxYear() {
        return s_mscDeliveryOrderTaxYear;
    }

    public void setS_mscDeliveryOrderTaxYear(String s_mscDeliveryOrderTaxYear) {
        this.s_mscDeliveryOrderTaxYear = s_mscDeliveryOrderTaxYear;
    }

    public String getS_mscDeliveryOrderTaxMonth() {
        return s_mscDeliveryOrderTaxMonth;
    }

    public void setS_mscDeliveryOrderTaxMonth(String s_mscDeliveryOrderTaxMonth) {
        this.s_mscDeliveryOrderTaxMonth = s_mscDeliveryOrderTaxMonth;
    }

    public String getS_mscDeliveryOrderTaxSeparator() {
        return s_mscDeliveryOrderTaxSeparator;
    }

    public void setS_mscDeliveryOrderTaxSeparator(
            String s_mscDeliveryOrderTaxSeparator) {
        this.s_mscDeliveryOrderTaxSeparator = s_mscDeliveryOrderTaxSeparator;
    }

    public int getI_mscDeliveryOrderTaxDigit() {
        return i_mscDeliveryOrderTaxDigit;
    }

    public void setI_mscDeliveryOrderTaxDigit(int i_mscDeliveryOrderTaxDigit) {
        this.i_mscDeliveryOrderTaxDigit = i_mscDeliveryOrderTaxDigit;
    }

    public int getI_mscDeliveryOrderMaxArticle() {
        return i_mscDeliveryOrderMaxArticle;
    }

    public void setI_mscDeliveryOrderMaxArticle(int i_mscDeliveryOrderMaxArticle) {
        this.i_mscDeliveryOrderMaxArticle = i_mscDeliveryOrderMaxArticle;
    }

    public String getS_mscPackingListAutoNumber() {
        return s_mscPackingListAutoNumber;
    }

    public void setS_mscPackingListAutoNumber(String s_mscPackingListAutoNumber) {
        this.s_mscPackingListAutoNumber = s_mscPackingListAutoNumber;
    }

    public String getS_mscPackingListPrefix() {
        return s_mscPackingListPrefix;
    }

    public void setS_mscPackingListPrefix(String s_mscPackingListPrefix) {
        this.s_mscPackingListPrefix = s_mscPackingListPrefix;
    }

    public String getS_mscPackingListWarehouse() {
        return s_mscPackingListWarehouse;
    }

    public void setS_mscPackingListWarehouse(String s_mscPackingListWarehouse) {
        this.s_mscPackingListWarehouse = s_mscPackingListWarehouse;
    }

    public String getS_mscPackingListYear() {
        return s_mscPackingListYear;
    }

    public void setS_mscPackingListYear(String s_mscPackingListYear) {
        this.s_mscPackingListYear = s_mscPackingListYear;
    }

    public String getS_mscPackingListMonth() {
        return s_mscPackingListMonth;
    }

    public void setS_mscPackingListMonth(String s_mscPackingListMonth) {
        this.s_mscPackingListMonth = s_mscPackingListMonth;
    }

    public String getS_mscPackingListSeparator() {
        return s_mscPackingListSeparator;
    }

    public void setS_mscPackingListSeparator(String s_mscPackingListSeparator) {
        this.s_mscPackingListSeparator = s_mscPackingListSeparator;
    }

    public int getI_mscPackingListDigit() {
        return i_mscPackingListDigit;
    }

    public void setI_mscPackingListDigit(int i_mscPackingListDigit) {
        this.i_mscPackingListDigit = i_mscPackingListDigit;
    }

    public String getS_mscPackingListNote1() {
        return s_mscPackingListNote1;
    }

    public void setS_mscPackingListNote1(String s_mscPackingListNote1) {
        this.s_mscPackingListNote1 = s_mscPackingListNote1;
    }

    public String getS_mscPackingListNote2() {
        return s_mscPackingListNote2;
    }

    public void setS_mscPackingListNote2(String s_mscPackingListNote2) {
        this.s_mscPackingListNote2 = s_mscPackingListNote2;
    }

    public String getS_mscPackingListNote3() {
        return s_mscPackingListNote3;
    }

    public void setS_mscPackingListNote3(String s_mscPackingListNote3) {
        this.s_mscPackingListNote3 = s_mscPackingListNote3;
    }

    public int getI_mscPackingListMaxArticle() {
        return i_mscPackingListMaxArticle;
    }

    public void setI_mscPackingListMaxArticle(int i_mscPackingListMaxArticle) {
        this.i_mscPackingListMaxArticle = i_mscPackingListMaxArticle;
    }

    public String getS_mscSalesInvoiceAutoNumber() {
        return s_mscSalesInvoiceAutoNumber;
    }

    public void setS_mscSalesInvoiceAutoNumber(String s_mscSalesInvoiceAutoNumber) {
        this.s_mscSalesInvoiceAutoNumber = s_mscSalesInvoiceAutoNumber;
    }

    public String getS_mscSalesInvoicePrefix() {
        return s_mscSalesInvoicePrefix;
    }

    public void setS_mscSalesInvoicePrefix(String s_mscSalesInvoicePrefix) {
        this.s_mscSalesInvoicePrefix = s_mscSalesInvoicePrefix;
    }

    public String getS_mscSalesInvoiceDivision() {
        return s_mscSalesInvoiceDivision;
    }

    public void setS_mscSalesInvoiceDivision(String s_mscSalesInvoiceDivision) {
        this.s_mscSalesInvoiceDivision = s_mscSalesInvoiceDivision;
    }

    public String getS_mscSalesInvoiceRC() {
        return s_mscSalesInvoiceRC;
    }

    public void setS_mscSalesInvoiceRC(String s_mscSalesInvoiceRC) {
        this.s_mscSalesInvoiceRC = s_mscSalesInvoiceRC;
    }

    public String getS_mscSalesInvoiceYear() {
        return s_mscSalesInvoiceYear;
    }

    public void setS_mscSalesInvoiceYear(String s_mscSalesInvoiceYear) {
        this.s_mscSalesInvoiceYear = s_mscSalesInvoiceYear;
    }

    public String getS_mscSalesInvoiceMonth() {
        return s_mscSalesInvoiceMonth;
    }

    public void setS_mscSalesInvoiceMonth(String s_mscSalesInvoiceMonth) {
        this.s_mscSalesInvoiceMonth = s_mscSalesInvoiceMonth;
    }

    public String getS_mscSalesInvoiceSeparator() {
        return s_mscSalesInvoiceSeparator;
    }

    public void setS_mscSalesInvoiceSeparator(String s_mscSalesInvoiceSeparator) {
        this.s_mscSalesInvoiceSeparator = s_mscSalesInvoiceSeparator;
    }

    public int getI_mscSalesInvoiceDigit() {
        return i_mscSalesInvoiceDigit;
    }

    public void setI_mscSalesInvoiceDigit(int i_mscSalesInvoiceDigit) {
        this.i_mscSalesInvoiceDigit = i_mscSalesInvoiceDigit;
    }

    public String getS_mscSalesInvoiceCharge1Desc() {
        return s_mscSalesInvoiceCharge1Desc;
    }

    public void setS_mscSalesInvoiceCharge1Desc(String s_mscSalesInvoiceCharge1Desc) {
        this.s_mscSalesInvoiceCharge1Desc = s_mscSalesInvoiceCharge1Desc;
    }

    public String getS_mscSalesInvoiceCharge2Desc() {
        return s_mscSalesInvoiceCharge2Desc;
    }

    public void setS_mscSalesInvoiceCharge2Desc(String s_mscSalesInvoiceCharge2Desc) {
        this.s_mscSalesInvoiceCharge2Desc = s_mscSalesInvoiceCharge2Desc;
    }

    public String getS_mscSalesInvoiceNote1() {
        return s_mscSalesInvoiceNote1;
    }

    public void setS_mscSalesInvoiceNote1(String s_mscSalesInvoiceNote1) {
        this.s_mscSalesInvoiceNote1 = s_mscSalesInvoiceNote1;
    }

    public String getS_mscSalesInvoiceNote2() {
        return s_mscSalesInvoiceNote2;
    }

    public void setS_mscSalesInvoiceNote2(String s_mscSalesInvoiceNote2) {
        this.s_mscSalesInvoiceNote2 = s_mscSalesInvoiceNote2;
    }

    public String getS_mscSalesInvoiceNote3() {
        return s_mscSalesInvoiceNote3;
    }

    public void setS_mscSalesInvoiceNote3(String s_mscSalesInvoiceNote3) {
        this.s_mscSalesInvoiceNote3 = s_mscSalesInvoiceNote3;
    }

    public String getS_mscSalesInvoiceTaxAutoNumber() {
        return s_mscSalesInvoiceTaxAutoNumber;
    }

    public void setS_mscSalesInvoiceTaxAutoNumber(
            String s_mscSalesInvoiceTaxAutoNumber) {
        this.s_mscSalesInvoiceTaxAutoNumber = s_mscSalesInvoiceTaxAutoNumber;
    }

    public String getS_mscSalesInvoiceTaxPrefix() {
        return s_mscSalesInvoiceTaxPrefix;
    }

    public void setS_mscSalesInvoiceTaxPrefix(String s_mscSalesInvoiceTaxPrefix) {
        this.s_mscSalesInvoiceTaxPrefix = s_mscSalesInvoiceTaxPrefix;
    }

    public String getS_mscSalesInvoiceTaxRC() {
        return s_mscSalesInvoiceTaxRC;
    }

    public void setS_mscSalesInvoiceTaxRC(String s_mscSalesInvoiceTaxRC) {
        this.s_mscSalesInvoiceTaxRC = s_mscSalesInvoiceTaxRC;
    }

    public String getS_mscSalesInvoiceTaxDivision() {
        return s_mscSalesInvoiceTaxDivision;
    }

    public void setS_mscSalesInvoiceTaxDivision(String s_mscSalesInvoiceTaxDivision) {
        this.s_mscSalesInvoiceTaxDivision = s_mscSalesInvoiceTaxDivision;
    }

    public String getS_mscSalesInvoiceTaxYear() {
        return s_mscSalesInvoiceTaxYear;
    }

    public void setS_mscSalesInvoiceTaxYear(String s_mscSalesInvoiceTaxYear) {
        this.s_mscSalesInvoiceTaxYear = s_mscSalesInvoiceTaxYear;
    }

    public String getS_mscSalesInvoiceTaxMonth() {
        return s_mscSalesInvoiceTaxMonth;
    }

    public void setS_mscSalesInvoiceTaxMonth(String s_mscSalesInvoiceTaxMonth) {
        this.s_mscSalesInvoiceTaxMonth = s_mscSalesInvoiceTaxMonth;
    }

    public String getS_mscSalesInvoiceTaxSeparator() {
        return s_mscSalesInvoiceTaxSeparator;
    }

    public void setS_mscSalesInvoiceTaxSeparator(
            String s_mscSalesInvoiceTaxSeparator) {
        this.s_mscSalesInvoiceTaxSeparator = s_mscSalesInvoiceTaxSeparator;
    }

    public int getI_mscSalesInvoiceTaxDigit() {
        return i_mscSalesInvoiceTaxDigit;
    }

    public void setI_mscSalesInvoiceTaxDigit(int i_mscSalesInvoiceTaxDigit) {
        this.i_mscSalesInvoiceTaxDigit = i_mscSalesInvoiceTaxDigit;
    }

    public int getI_mscSalesInvoiceMaxArticle() {
        return i_mscSalesInvoiceMaxArticle;
    }

    public void setI_mscSalesInvoiceMaxArticle(int i_mscSalesInvoiceMaxArticle) {
        this.i_mscSalesInvoiceMaxArticle = i_mscSalesInvoiceMaxArticle;
    }

    public String getS_mscSalesReturAutoNumber() {
        return s_mscSalesReturAutoNumber;
    }

    public void setS_mscSalesReturAutoNumber(String s_mscSalesReturAutoNumber) {
        this.s_mscSalesReturAutoNumber = s_mscSalesReturAutoNumber;
    }

    public String getS_mscSalesReturPrefix() {
        return s_mscSalesReturPrefix;
    }

    public void setS_mscSalesReturPrefix(String s_mscSalesReturPrefix) {
        this.s_mscSalesReturPrefix = s_mscSalesReturPrefix;
    }

    public String getS_mscSalesReturRC() {
        return s_mscSalesReturRC;
    }

    public void setS_mscSalesReturRC(String s_mscSalesReturRC) {
        this.s_mscSalesReturRC = s_mscSalesReturRC;
    }

    public String getS_mscSalesReturYear() {
        return s_mscSalesReturYear;
    }

    public void setS_mscSalesReturYear(String s_mscSalesReturYear) {
        this.s_mscSalesReturYear = s_mscSalesReturYear;
    }

    public String getS_mscSalesReturMonth() {
        return s_mscSalesReturMonth;
    }

    public void setS_mscSalesReturMonth(String s_mscSalesReturMonth) {
        this.s_mscSalesReturMonth = s_mscSalesReturMonth;
    }

    public String getS_mscSalesReturSeparator() {
        return s_mscSalesReturSeparator;
    }

    public void setS_mscSalesReturSeparator(String s_mscSalesReturSeparator) {
        this.s_mscSalesReturSeparator = s_mscSalesReturSeparator;
    }

    public int getI_mscSalesReturDigit() {
        return i_mscSalesReturDigit;
    }

    public void setI_mscSalesReturDigit(int i_mscSalesReturDigit) {
        this.i_mscSalesReturDigit = i_mscSalesReturDigit;
    }

    public String getS_mscSalesReturNote1() {
        return s_mscSalesReturNote1;
    }

    public void setS_mscSalesReturNote1(String s_mscSalesReturNote1) {
        this.s_mscSalesReturNote1 = s_mscSalesReturNote1;
    }

    public String getS_mscSalesReturNote2() {
        return s_mscSalesReturNote2;
    }

    public void setS_mscSalesReturNote2(String s_mscSalesReturNote2) {
        this.s_mscSalesReturNote2 = s_mscSalesReturNote2;
    }

    public String getS_mscSalesReturNote3() {
        return s_mscSalesReturNote3;
    }

    public void setS_mscSalesReturNote3(String s_mscSalesReturNote3) {
        this.s_mscSalesReturNote3 = s_mscSalesReturNote3;
    }

    public int getI_mscSalesReturMaxArticle() {
        return i_mscSalesReturMaxArticle;
    }

    public void setI_mscSalesReturMaxArticle(int i_mscSalesReturMaxArticle) {
        this.i_mscSalesReturMaxArticle = i_mscSalesReturMaxArticle;
    }

    public String getS_mscSalesWorkOrderAutoNumber() {
        return s_mscSalesWorkOrderAutoNumber;
    }

    public void setS_mscSalesWorkOrderAutoNumber(
            String s_mscSalesWorkOrderAutoNumber) {
        this.s_mscSalesWorkOrderAutoNumber = s_mscSalesWorkOrderAutoNumber;
    }

    public String getS_mscSalesWorkOrderPrefix() {
        return s_mscSalesWorkOrderPrefix;
    }

    public void setS_mscSalesWorkOrderPrefix(String s_mscSalesWorkOrderPrefix) {
        this.s_mscSalesWorkOrderPrefix = s_mscSalesWorkOrderPrefix;
    }

    public String getS_mscSalesWorkOrderRC() {
        return s_mscSalesWorkOrderRC;
    }

    public void setS_mscSalesWorkOrderRC(String s_mscSalesWorkOrderRC) {
        this.s_mscSalesWorkOrderRC = s_mscSalesWorkOrderRC;
    }

    public String getS_mscSalesWorkOrderYear() {
        return s_mscSalesWorkOrderYear;
    }

    public void setS_mscSalesWorkOrderYear(String s_mscSalesWorkOrderYear) {
        this.s_mscSalesWorkOrderYear = s_mscSalesWorkOrderYear;
    }

    public String getS_mscSalesWorkOrderMonth() {
        return s_mscSalesWorkOrderMonth;
    }

    public void setS_mscSalesWorkOrderMonth(String s_mscSalesWorkOrderMonth) {
        this.s_mscSalesWorkOrderMonth = s_mscSalesWorkOrderMonth;
    }

    public String getS_mscSalesWorkOrderSeparator() {
        return s_mscSalesWorkOrderSeparator;
    }

    public void setS_mscSalesWorkOrderSeparator(String s_mscSalesWorkOrderSeparator) {
        this.s_mscSalesWorkOrderSeparator = s_mscSalesWorkOrderSeparator;
    }

    public int getI_mscSalesWorkOrderDigit() {
        return i_mscSalesWorkOrderDigit;
    }

    public void setI_mscSalesWorkOrderDigit(int i_mscSalesWorkOrderDigit) {
        this.i_mscSalesWorkOrderDigit = i_mscSalesWorkOrderDigit;
    }

    public String getS_mscSalesWorkOrderNote1() {
        return s_mscSalesWorkOrderNote1;
    }

    public void setS_mscSalesWorkOrderNote1(String s_mscSalesWorkOrderNote1) {
        this.s_mscSalesWorkOrderNote1 = s_mscSalesWorkOrderNote1;
    }

    public String getS_mscSalesWorkOrderNote2() {
        return s_mscSalesWorkOrderNote2;
    }

    public void setS_mscSalesWorkOrderNote2(String s_mscSalesWorkOrderNote2) {
        this.s_mscSalesWorkOrderNote2 = s_mscSalesWorkOrderNote2;
    }

    public String getS_mscSalesWorkOrderNote3() {
        return s_mscSalesWorkOrderNote3;
    }

    public void setS_mscSalesWorkOrderNote3(String s_mscSalesWorkOrderNote3) {
        this.s_mscSalesWorkOrderNote3 = s_mscSalesWorkOrderNote3;
    }

    public int getI_mscSalesWorkOrderMaxArticle() {
        return i_mscSalesWorkOrderMaxArticle;
    }

    public void setI_mscSalesWorkOrderMaxArticle(int i_mscSalesWorkOrderMaxArticle) {
        this.i_mscSalesWorkOrderMaxArticle = i_mscSalesWorkOrderMaxArticle;
    }

    public int getI_mscCreateID() {
        return i_mscCreateID;
    }

    public void setI_mscCreateID(int i_mscCreateID) {
        this.i_mscCreateID = i_mscCreateID;
    }

    public Date getD_mscCreateDate() {
        return d_mscCreateDate;
    }

    public void setD_mscCreateDate(Date d_mscCreateDate) {
        this.d_mscCreateDate = d_mscCreateDate;
    }

    public int getI_mscUpdateID() {
        return i_mscUpdateID;
    }

    public void setI_mscUpdateID(int i_mscUpdateID) {
        this.i_mscUpdateID = i_mscUpdateID;
    }

    public Date getD_mscUpdateDate() {
        return d_mscUpdateDate;
    }

    public void setD_mscUpdateDate(Date d_mscUpdateDate) {
        this.d_mscUpdateDate = d_mscUpdateDate;
    }
}