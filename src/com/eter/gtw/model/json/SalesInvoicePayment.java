package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class SalesInvoicePayment {
    private String s_salesInvoicePaymentNo;
    private String paymenttype;
    private String cardtype;
    private String bank;
    private String edc;
    private Date d_salesInvoicePaymentDate;
    private String s_salesInvoicePaymentCardNo;
    private BigDecimal d_salesInvoicePaymentAmount;
    private BigDecimal d_salesInvoicePaymentCharge;
    private BigDecimal d_salesInvoicePaymentPay;
    private BigDecimal d_salesInvoicePaymentChange;
    private int i_salesInvoicePaymentUpdateID;
    private Date d_salesInvoicePaymentUpdateDate;

    public String getS_salesInvoicePaymentNo() {
        return s_salesInvoicePaymentNo;
    }

    public void setS_salesInvoicePaymentNo(String s_salesInvoicePaymentNo) {
        this.s_salesInvoicePaymentNo = s_salesInvoicePaymentNo;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getEdc() {
        return edc;
    }

    public void setEdc(String edc) {
        this.edc = edc;
    }

    public Date getD_salesInvoicePaymentDate() {
        return d_salesInvoicePaymentDate;
    }

    public void setD_salesInvoicePaymentDate(Date d_salesInvoicePaymentDate) {
        this.d_salesInvoicePaymentDate = d_salesInvoicePaymentDate;
    }

    public String getS_salesInvoicePaymentCardNo() {
        return s_salesInvoicePaymentCardNo;
    }

    public void setS_salesInvoicePaymentCardNo(String s_salesInvoicePaymentCardNo) {
        this.s_salesInvoicePaymentCardNo = s_salesInvoicePaymentCardNo;
    }

    public BigDecimal getD_salesInvoicePaymentAmount() {
        return d_salesInvoicePaymentAmount;
    }

    public void setD_salesInvoicePaymentAmount(
            BigDecimal d_salesInvoicePaymentAmount) {
        this.d_salesInvoicePaymentAmount = d_salesInvoicePaymentAmount;
    }

    public BigDecimal getD_salesInvoicePaymentCharge() {
        return d_salesInvoicePaymentCharge;
    }

    public void setD_salesInvoicePaymentCharge(
            BigDecimal d_salesInvoicePaymentCharge) {
        this.d_salesInvoicePaymentCharge = d_salesInvoicePaymentCharge;
    }

    public BigDecimal getD_salesInvoicePaymentPay() {
        return d_salesInvoicePaymentPay;
    }

    public void setD_salesInvoicePaymentPay(BigDecimal d_salesInvoicePaymentPay) {
        this.d_salesInvoicePaymentPay = d_salesInvoicePaymentPay;
    }

    public BigDecimal getD_salesInvoicePaymentChange() {
        return d_salesInvoicePaymentChange;
    }

    public void setD_salesInvoicePaymentChange(
            BigDecimal d_salesInvoicePaymentChange) {
        this.d_salesInvoicePaymentChange = d_salesInvoicePaymentChange;
    }

    public int getI_salesInvoicePaymentUpdateID() {
        return i_salesInvoicePaymentUpdateID;
    }

    public void setI_salesInvoicePaymentUpdateID(int i_salesInvoicePaymentUpdateID) {
        this.i_salesInvoicePaymentUpdateID = i_salesInvoicePaymentUpdateID;
    }

    public Date getD_salesInvoicePaymentUpdateDate() {
        return d_salesInvoicePaymentUpdateDate;
    }

    public void setD_salesInvoicePaymentUpdateDate(
            Date d_salesInvoicePaymentUpdateDate) {
        this.d_salesInvoicePaymentUpdateDate = d_salesInvoicePaymentUpdateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_salesInvoicePaymentNo: " + String.valueOf(s_salesInvoicePaymentNo) + "\n");
        sb.append("paymenttype: " + String.valueOf(paymenttype) + "\n");
        sb.append("cardtype: " + String.valueOf(cardtype) + "\n");
        sb.append("bank: " + String.valueOf(bank) + "\n");
        sb.append("edc: " + String.valueOf(edc) + "\n");
        sb.append("d_salesInvoicePaymentDate: " + String.valueOf(d_salesInvoicePaymentDate) + "\n");
        sb.append("s_salesInvoicePaymentCardNo: " + String.valueOf(s_salesInvoicePaymentCardNo) + "\n");
        sb.append("d_salesInvoicePaymentAmount: " + String.valueOf(d_salesInvoicePaymentAmount) + "\n");
        sb.append("d_salesInvoicePaymentCharge: " + String.valueOf(d_salesInvoicePaymentCharge) + "\n");
        sb.append("d_salesInvoicePaymentPay: " + String.valueOf(d_salesInvoicePaymentPay) + "\n");
        sb.append("d_salesInvoicePaymentChange: " + String.valueOf(d_salesInvoicePaymentChange) + "\n");
        sb.append("i_salesInvoicePaymentUpdateID: " + String.valueOf(i_salesInvoicePaymentUpdateID) + "\n");
        sb.append("d_salesInvoicePaymentUpdateDate: " + String.valueOf(d_salesInvoicePaymentUpdateDate) + "\n");

        return sb.toString();
    }
}
