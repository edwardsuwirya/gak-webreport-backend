package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Bank;
import com.ifm.domain.master.M_CardType;
import com.ifm.domain.master.M_Edc;
import com.ifm.domain.master.M_PaymentType;

public class T_SalesInvoicePayment implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_salesInvoicePaymentNo;
    private M_PaymentType paymenttype;
    private M_CardType cardtype;
    private M_Bank bank;
    private M_Edc edc;
    private Date d_salesInvoicePaymentDate;
    private String s_salesInvoicePaymentCardNo;
    private BigDecimal d_salesInvoicePaymentAmount;
    private BigDecimal d_salesInvoicePaymentCharge;
    private BigDecimal d_salesInvoicePaymentPay;
    private BigDecimal d_salesInvoicePaymentChange;
    private int i_salesInvoicePaymentUpdateID;
    private Date d_salesInvoicePaymentUpdateDate;

    public T_SalesInvoicePayment(String s_salesInvoicePaymentNo,
                                 M_PaymentType paymenttype,
                                 M_CardType cardtype,
                                 M_Bank bank,
                                 M_Edc edc,
                                 Date d_salesInvoicePaymentDate,
                                 String s_salesInvoicePaymentCardNo,
                                 BigDecimal d_salesInvoicePaymentAmount,
                                 BigDecimal d_salesInvoicePaymentCharge,
                                 BigDecimal d_salesInvoicePaymentPay,
                                 BigDecimal d_salesInvoicePaymentChange,
                                 int i_salesInvoicePaymentUpdateID,
                                 Date d_salesInvoicePaymentUpdateDate) {
        this.s_salesInvoicePaymentNo = s_salesInvoicePaymentNo;
        this.paymenttype = paymenttype;
        this.cardtype = cardtype;
        this.bank = bank;
        this.edc = edc;
        this.d_salesInvoicePaymentDate = d_salesInvoicePaymentDate;
        this.s_salesInvoicePaymentCardNo = s_salesInvoicePaymentCardNo;
        this.d_salesInvoicePaymentAmount = d_salesInvoicePaymentAmount;
        this.d_salesInvoicePaymentCharge = d_salesInvoicePaymentCharge;
        this.d_salesInvoicePaymentPay = d_salesInvoicePaymentPay;
        this.d_salesInvoicePaymentChange = d_salesInvoicePaymentChange;
        this.i_salesInvoicePaymentUpdateID = i_salesInvoicePaymentUpdateID;
        this.d_salesInvoicePaymentUpdateDate = d_salesInvoicePaymentUpdateDate;
    }

    public T_SalesInvoicePayment() {
    }

    public String getS_salesInvoicePaymentNo() {
        return s_salesInvoicePaymentNo;
    }

    public void setS_salesInvoicePaymentNo(String s_salesInvoicePaymentNo) {
        this.s_salesInvoicePaymentNo = s_salesInvoicePaymentNo;
    }

    public M_PaymentType getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(M_PaymentType paymenttype) {
        this.paymenttype = paymenttype;
    }

    public M_CardType getCardtype() {
        return cardtype;
    }

    public void setCardtype(M_CardType cardtype) {
        this.cardtype = cardtype;
    }

    public M_Bank getBank() {
        return bank;
    }

    public void setBank(M_Bank bank) {
        this.bank = bank;
    }

    public M_Edc getEdc() {
        return edc;
    }

    public void setEdc(M_Edc edc) {
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
}
