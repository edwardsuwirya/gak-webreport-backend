package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SalesInvoice {
    private String s_salesInvoiceNo;
    private String company;
    private String responsibilitycenter;
    private String currency;
    private String customer;
    private String receiveorder;
    private String deliveryorder;
    private String salesorder;
    private String division;
    private String s_salesInvoiceRealNo;
    private String s_salesInvoiceTaxNo;
    private Date d_salesInvoiceDate;
    private BigDecimal d_salesInvoiceExRate;
    private String s_salesInvoiceAddress;
    private BigDecimal d_salesInvoiceSubTotal;
    private BigDecimal d_salesInvoiceDiscount;
    private BigDecimal d_salesInvoiceVoucher;
    private BigDecimal d_salesInvoiceTax;
    private BigDecimal d_salesInvoicePph;
    private BigDecimal d_salesInvoiceServiceCharge;
    private BigDecimal d_salesInvoiceBonus;
    private BigDecimal d_salesInvoiceAdditionalCharge1;
    private BigDecimal d_salesInvoiceAdditionalCharge2;
    private BigDecimal d_salesInvoiceGrandTotal;
    private String s_salesInvoiceStatus;
    private int i_salesInvoicePrinted;
    private String s_salesInvoiceNote1;
    private String s_salesInvoiceNote2;
    private String s_salesInvoiceNote3;
    private int i_salesInvoiceCreateID;
    private Date d_salesInvoiceCreateDate;
    private int i_salesInvoiceApproveID;
    private Date d_salesInvoiceApproveDate;
    private int i_salesInvoiceCancelID;
    private Date d_salesInvoiceCancelDate;
    private String s_salesInvoiceCancelReason;
    private int i_salesInvoiceUpdateID;
    private Date d_salesInvoiceUpdateDate;
    private String s_salesInvoiceActive;

    private List<SalesInvoiceDetail> details;
    private List<SalesInvoicePayment> payments;

    public String getS_salesInvoiceNo() {
        return s_salesInvoiceNo;
    }

    public void setS_salesInvoiceNo(String s_salesInvoiceNo) {
        this.s_salesInvoiceNo = s_salesInvoiceNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(String responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getReceiveorder() {
        return receiveorder;
    }

    public void setReceiveorder(String receiveorder) {
        this.receiveorder = receiveorder;
    }

    public String getDeliveryorder() {
        return deliveryorder;
    }

    public void setDeliveryorder(String deliveryorder) {
        this.deliveryorder = deliveryorder;
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getS_salesInvoiceRealNo() {
        return s_salesInvoiceRealNo;
    }

    public void setS_salesInvoiceRealNo(String s_salesInvoiceRealNo) {
        this.s_salesInvoiceRealNo = s_salesInvoiceRealNo;
    }

    public String getS_salesInvoiceTaxNo() {
        return s_salesInvoiceTaxNo;
    }

    public void setS_salesInvoiceTaxNo(String s_salesInvoiceTaxNo) {
        this.s_salesInvoiceTaxNo = s_salesInvoiceTaxNo;
    }

    public Date getD_salesInvoiceDate() {
        return d_salesInvoiceDate;
    }

    public void setD_salesInvoiceDate(Date d_salesInvoiceDate) {
        this.d_salesInvoiceDate = d_salesInvoiceDate;
    }

    public BigDecimal getD_salesInvoiceExRate() {
        return d_salesInvoiceExRate;
    }

    public void setD_salesInvoiceExRate(BigDecimal d_salesInvoiceExRate) {
        this.d_salesInvoiceExRate = d_salesInvoiceExRate;
    }

    public String getS_salesInvoiceAddress() {
        return s_salesInvoiceAddress;
    }

    public void setS_salesInvoiceAddress(String s_salesInvoiceAddress) {
        this.s_salesInvoiceAddress = s_salesInvoiceAddress;
    }

    public BigDecimal getD_salesInvoiceSubTotal() {
        return d_salesInvoiceSubTotal;
    }

    public void setD_salesInvoiceSubTotal(BigDecimal d_salesInvoiceSubTotal) {
        this.d_salesInvoiceSubTotal = d_salesInvoiceSubTotal;
    }

    public BigDecimal getD_salesInvoiceDiscount() {
        return d_salesInvoiceDiscount;
    }

    public void setD_salesInvoiceDiscount(BigDecimal d_salesInvoiceDiscount) {
        this.d_salesInvoiceDiscount = d_salesInvoiceDiscount;
    }

    public BigDecimal getD_salesInvoiceVoucher() {
        return d_salesInvoiceVoucher;
    }

    public void setD_salesInvoiceVoucher(BigDecimal d_salesInvoiceVoucher) {
        this.d_salesInvoiceVoucher = d_salesInvoiceVoucher;
    }

    public BigDecimal getD_salesInvoiceTax() {
        return d_salesInvoiceTax;
    }

    public void setD_salesInvoiceTax(BigDecimal d_salesInvoiceTax) {
        this.d_salesInvoiceTax = d_salesInvoiceTax;
    }

    public BigDecimal getD_salesInvoicePph() {
        return d_salesInvoicePph;
    }

    public void setD_salesInvoicePph(BigDecimal d_salesInvoicePph) {
        this.d_salesInvoicePph = d_salesInvoicePph;
    }

    public BigDecimal getD_salesInvoiceServiceCharge() {
        return d_salesInvoiceServiceCharge;
    }

    public void setD_salesInvoiceServiceCharge(
            BigDecimal d_salesInvoiceServiceCharge) {
        this.d_salesInvoiceServiceCharge = d_salesInvoiceServiceCharge;
    }

    public BigDecimal getD_salesInvoiceBonus() {
        return d_salesInvoiceBonus;
    }

    public void setD_salesInvoiceBonus(BigDecimal d_salesInvoiceBonus) {
        this.d_salesInvoiceBonus = d_salesInvoiceBonus;
    }

    public BigDecimal getD_salesInvoiceAdditionalCharge1() {
        return d_salesInvoiceAdditionalCharge1;
    }

    public void setD_salesInvoiceAdditionalCharge1(
            BigDecimal d_salesInvoiceAdditionalCharge1) {
        this.d_salesInvoiceAdditionalCharge1 = d_salesInvoiceAdditionalCharge1;
    }

    public BigDecimal getD_salesInvoiceAdditionalCharge2() {
        return d_salesInvoiceAdditionalCharge2;
    }

    public void setD_salesInvoiceAdditionalCharge2(
            BigDecimal d_salesInvoiceAdditionalCharge2) {
        this.d_salesInvoiceAdditionalCharge2 = d_salesInvoiceAdditionalCharge2;
    }

    public BigDecimal getD_salesInvoiceGrandTotal() {
        return d_salesInvoiceGrandTotal;
    }

    public void setD_salesInvoiceGrandTotal(BigDecimal d_salesInvoiceGrandTotal) {
        this.d_salesInvoiceGrandTotal = d_salesInvoiceGrandTotal;
    }

    public String getS_salesInvoiceStatus() {
        return s_salesInvoiceStatus;
    }

    public void setS_salesInvoiceStatus(String s_salesInvoiceStatus) {
        this.s_salesInvoiceStatus = s_salesInvoiceStatus;
    }

    public int getI_salesInvoicePrinted() {
        return i_salesInvoicePrinted;
    }

    public void setI_salesInvoicePrinted(int i_salesInvoicePrinted) {
        this.i_salesInvoicePrinted = i_salesInvoicePrinted;
    }

    public String getS_salesInvoiceNote1() {
        return s_salesInvoiceNote1;
    }

    public void setS_salesInvoiceNote1(String s_salesInvoiceNote1) {
        this.s_salesInvoiceNote1 = s_salesInvoiceNote1;
    }

    public String getS_salesInvoiceNote2() {
        return s_salesInvoiceNote2;
    }

    public void setS_salesInvoiceNote2(String s_salesInvoiceNote2) {
        this.s_salesInvoiceNote2 = s_salesInvoiceNote2;
    }

    public String getS_salesInvoiceNote3() {
        return s_salesInvoiceNote3;
    }

    public void setS_salesInvoiceNote3(String s_salesInvoiceNote3) {
        this.s_salesInvoiceNote3 = s_salesInvoiceNote3;
    }

    public int getI_salesInvoiceCreateID() {
        return i_salesInvoiceCreateID;
    }

    public void setI_salesInvoiceCreateID(int i_salesInvoiceCreateID) {
        this.i_salesInvoiceCreateID = i_salesInvoiceCreateID;
    }

    public Date getD_salesInvoiceCreateDate() {
        return d_salesInvoiceCreateDate;
    }

    public void setD_salesInvoiceCreateDate(Date d_salesInvoiceCreateDate) {
        this.d_salesInvoiceCreateDate = d_salesInvoiceCreateDate;
    }

    public int getI_salesInvoiceApproveID() {
        return i_salesInvoiceApproveID;
    }

    public void setI_salesInvoiceApproveID(int i_salesInvoiceApproveID) {
        this.i_salesInvoiceApproveID = i_salesInvoiceApproveID;
    }

    public Date getD_salesInvoiceApproveDate() {
        return d_salesInvoiceApproveDate;
    }

    public void setD_salesInvoiceApproveDate(Date d_salesInvoiceApproveDate) {
        this.d_salesInvoiceApproveDate = d_salesInvoiceApproveDate;
    }

    public int getI_salesInvoiceCancelID() {
        return i_salesInvoiceCancelID;
    }

    public void setI_salesInvoiceCancelID(int i_salesInvoiceCancelID) {
        this.i_salesInvoiceCancelID = i_salesInvoiceCancelID;
    }

    public Date getD_salesInvoiceCancelDate() {
        return d_salesInvoiceCancelDate;
    }

    public void setD_salesInvoiceCancelDate(Date d_salesInvoiceCancelDate) {
        this.d_salesInvoiceCancelDate = d_salesInvoiceCancelDate;
    }

    public String getS_salesInvoiceCancelReason() {
        return s_salesInvoiceCancelReason;
    }

    public void setS_salesInvoiceCancelReason(String s_salesInvoiceCancelReason) {
        this.s_salesInvoiceCancelReason = s_salesInvoiceCancelReason;
    }

    public int getI_salesInvoiceUpdateID() {
        return i_salesInvoiceUpdateID;
    }

    public void setI_salesInvoiceUpdateID(int i_salesInvoiceUpdateID) {
        this.i_salesInvoiceUpdateID = i_salesInvoiceUpdateID;
    }

    public Date getD_salesInvoiceUpdateDate() {
        return d_salesInvoiceUpdateDate;
    }

    public void setD_salesInvoiceUpdateDate(Date d_salesInvoiceUpdateDate) {
        this.d_salesInvoiceUpdateDate = d_salesInvoiceUpdateDate;
    }

    public String getS_salesInvoiceActive() {
        return s_salesInvoiceActive;
    }

    public void setS_salesInvoiceActive(String s_salesInvoiceActive) {
        this.s_salesInvoiceActive = s_salesInvoiceActive;
    }

    public List<SalesInvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(List<SalesInvoiceDetail> details) {
        this.details = details;
    }

    public List<SalesInvoicePayment> getPayments() {
        return payments;
    }

    public void setPayments(List<SalesInvoicePayment> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_salesInvoiceNo: " + String.valueOf(s_salesInvoiceNo) + "\n");
        sb.append("company: " + String.valueOf(company) + "\n");
        sb.append("responsibilitycenter: " + String.valueOf(responsibilitycenter) + "\n");
        sb.append("currency: " + String.valueOf(currency) + "\n");
        sb.append("customer: " + String.valueOf(customer) + "\n");
        sb.append("receiveorder: " + String.valueOf(receiveorder) + "\n");
        sb.append("deliveryorder: " + String.valueOf(deliveryorder) + "\n");
        sb.append("salesorder: " + String.valueOf(salesorder) + "\n");
        sb.append("division: " + String.valueOf(division) + "\n");
        sb.append("s_salesInvoiceRealNo: " + String.valueOf(s_salesInvoiceRealNo) + "\n");
        sb.append("s_salesInvoiceTaxNo: " + String.valueOf(s_salesInvoiceTaxNo) + "\n");
        sb.append("d_salesInvoiceDate: " + String.valueOf(d_salesInvoiceDate) + "\n");
        sb.append("d_salesInvoiceExRate: " + String.valueOf(d_salesInvoiceExRate) + "\n");
        sb.append("s_salesInvoiceAddress: " + String.valueOf(s_salesInvoiceAddress) + "\n");
        sb.append("d_salesInvoiceSubTotal: " + String.valueOf(d_salesInvoiceSubTotal) + "\n");
        sb.append("d_salesInvoiceDiscount: " + String.valueOf(d_salesInvoiceDiscount) + "\n");
        sb.append("d_salesInvoiceVoucher: " + String.valueOf(d_salesInvoiceVoucher) + "\n");
        sb.append("d_salesInvoiceTax: " + String.valueOf(d_salesInvoiceTax) + "\n");
        sb.append("d_salesInvoicePph: " + String.valueOf(d_salesInvoicePph) + "\n");
        sb.append("d_salesInvoiceServiceCharge: " + String.valueOf(d_salesInvoiceServiceCharge) + "\n");
        sb.append("d_salesInvoiceBonus: " + String.valueOf(d_salesInvoiceBonus) + "\n");
        sb.append("d_salesInvoiceAdditionalCharge1: " + String.valueOf(d_salesInvoiceAdditionalCharge1) + "\n");
        sb.append("d_salesInvoiceAdditionalCharge2: " + String.valueOf(d_salesInvoiceAdditionalCharge2) + "\n");
        sb.append("d_salesInvoiceGrandTotal: " + String.valueOf(d_salesInvoiceGrandTotal) + "\n");
        sb.append("s_salesInvoiceStatus: " + String.valueOf(s_salesInvoiceStatus) + "\n");
        sb.append("i_salesInvoicePrinted: " + String.valueOf(i_salesInvoicePrinted) + "\n");
        sb.append("s_salesInvoiceNote1: " + String.valueOf(s_salesInvoiceNote1) + "\n");
        sb.append("s_salesInvoiceNote2: " + String.valueOf(s_salesInvoiceNote2) + "\n");
        sb.append("s_salesInvoiceNote3: " + String.valueOf(s_salesInvoiceNote3) + "\n");
        sb.append("i_salesInvoiceCreateID: " + String.valueOf(i_salesInvoiceCreateID) + "\n");
        sb.append("d_salesInvoiceCreateDate: " + String.valueOf(d_salesInvoiceCreateDate) + "\n");
        sb.append("i_salesInvoiceApproveID: " + String.valueOf(i_salesInvoiceApproveID) + "\n");
        sb.append("d_salesInvoiceApproveDate: " + String.valueOf(d_salesInvoiceApproveDate) + "\n");
        sb.append("i_salesInvoiceCancelID: " + String.valueOf(i_salesInvoiceCancelID) + "\n");
        sb.append("d_salesInvoiceCancelDate: " + String.valueOf(d_salesInvoiceCancelDate) + "\n");
        sb.append("s_salesInvoiceCancelReason: " + String.valueOf(s_salesInvoiceCancelReason) + "\n");
        sb.append("i_salesInvoiceUpdateID: " + String.valueOf(i_salesInvoiceUpdateID) + "\n");
        sb.append("d_salesInvoiceUpdateDate: " + String.valueOf(d_salesInvoiceUpdateDate) + "\n");
        sb.append("s_salesInvoiceActive: " + String.valueOf(s_salesInvoiceActive) + "\n");

        if (details != null && details.size() > 0) {
            sb.append("details:\n");

            int i = 1;
            for (SalesInvoiceDetail d : details) {
                sb.append("===" + (i++) + "\n");
                sb.append(d.toString());
            }
        }

        if (payments != null && payments.size() > 0) {
            sb.append("payments:\n");

            int i = 1;
            for (SalesInvoicePayment p : payments) {
                sb.append("===" + (i++) + "\n");
                sb.append(p.toString());
            }
        }

        return sb.toString();
    }
}
