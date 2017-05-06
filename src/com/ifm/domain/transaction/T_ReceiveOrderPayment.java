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

public class T_ReceiveOrderPayment implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_receiveOrderPaymentNo;
    private M_PaymentType paymenttype;
    private M_CardType cardtype;
    private M_Bank bank;
    private M_Edc edc;
    private Date d_receiveOrderPaymentDate;
    private String s_receiveOrderPaymentCardNo;
    private BigDecimal d_receiveOrderPaymentAmount;
    private BigDecimal d_receiveOrderPaymentCharge;
    private BigDecimal d_receiveOrderPaymentPay;
    private BigDecimal d_receiveOrderPaymentChange;
    private int i_receiveOrderPaymentUpdateID;
    private Date d_receiveOrderPaymentUpdateDate;

    public T_ReceiveOrderPayment(String s_receiveOrderPaymentNo,
                                 M_PaymentType paymenttype,
                                 M_CardType cardtype,
                                 M_Bank bank,
                                 M_Edc edc,
                                 Date d_receiveOrderPaymentDate,
                                 String s_receiveOrderPaymentCardNo,
                                 BigDecimal d_receiveOrderPaymentAmount,
                                 BigDecimal d_receiveOrderPaymentCharge,
                                 BigDecimal d_receiveOrderPaymentPay,
                                 BigDecimal d_receiveOrderPaymentChange,
                                 int i_receiveOrderPaymentUpdateID,
                                 Date d_receiveOrderPaymentUpdateDate) {
        this.s_receiveOrderPaymentNo = s_receiveOrderPaymentNo;
        this.paymenttype = paymenttype;
        this.cardtype = cardtype;
        this.bank = bank;
        this.edc = edc;
        this.d_receiveOrderPaymentDate = d_receiveOrderPaymentDate;
        this.s_receiveOrderPaymentCardNo = s_receiveOrderPaymentCardNo;
        this.d_receiveOrderPaymentAmount = d_receiveOrderPaymentAmount;
        this.d_receiveOrderPaymentCharge = d_receiveOrderPaymentCharge;
        this.d_receiveOrderPaymentPay = d_receiveOrderPaymentPay;
        this.d_receiveOrderPaymentChange = d_receiveOrderPaymentChange;
        this.i_receiveOrderPaymentUpdateID = i_receiveOrderPaymentUpdateID;
        this.d_receiveOrderPaymentUpdateDate = d_receiveOrderPaymentUpdateDate;
    }

    public T_ReceiveOrderPayment() {
    }

    public String getS_receiveOrderPaymentNo() {
        return s_receiveOrderPaymentNo;
    }

    public void setS_receiveOrderPaymentNo(String s_receiveOrderPaymentNo) {
        this.s_receiveOrderPaymentNo = s_receiveOrderPaymentNo;
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

    public Date getD_receiveOrderPaymentDate() {
        return d_receiveOrderPaymentDate;
    }

    public void setD_receiveOrderPaymentDate(Date d_receiveOrderPaymentDate) {
        this.d_receiveOrderPaymentDate = d_receiveOrderPaymentDate;
    }

    public String getS_receiveOrderPaymentCardNo() {
        return s_receiveOrderPaymentCardNo;
    }

    public void setS_receiveOrderPaymentCardNo(String s_receiveOrderPaymentCardNo) {
        this.s_receiveOrderPaymentCardNo = s_receiveOrderPaymentCardNo;
    }

    public BigDecimal getD_receiveOrderPaymentAmount() {
        return d_receiveOrderPaymentAmount;
    }

    public void setD_receiveOrderPaymentAmount(
            BigDecimal d_receiveOrderPaymentAmount) {
        this.d_receiveOrderPaymentAmount = d_receiveOrderPaymentAmount;
    }

    public BigDecimal getD_receiveOrderPaymentCharge() {
        return d_receiveOrderPaymentCharge;
    }

    public void setD_receiveOrderPaymentCharge(
            BigDecimal d_receiveOrderPaymentCharge) {
        this.d_receiveOrderPaymentCharge = d_receiveOrderPaymentCharge;
    }

    public BigDecimal getD_receiveOrderPaymentPay() {
        return d_receiveOrderPaymentPay;
    }

    public void setD_receiveOrderPaymentPay(BigDecimal d_receiveOrderPaymentPay) {
        this.d_receiveOrderPaymentPay = d_receiveOrderPaymentPay;
    }

    public BigDecimal getD_receiveOrderPaymentChange() {
        return d_receiveOrderPaymentChange;
    }

    public void setD_receiveOrderPaymentChange(
            BigDecimal d_receiveOrderPaymentChange) {
        this.d_receiveOrderPaymentChange = d_receiveOrderPaymentChange;
    }

    public int getI_receiveOrderPaymentUpdateID() {
        return i_receiveOrderPaymentUpdateID;
    }

    public void setI_receiveOrderPaymentUpdateID(int i_receiveOrderPaymentUpdateID) {
        this.i_receiveOrderPaymentUpdateID = i_receiveOrderPaymentUpdateID;
    }

    public Date getD_receiveOrderPaymentUpdateDate() {
        return d_receiveOrderPaymentUpdateDate;
    }

    public void setD_receiveOrderPaymentUpdateDate(
            Date d_receiveOrderPaymentUpdateDate) {
        this.d_receiveOrderPaymentUpdateDate = d_receiveOrderPaymentUpdateDate;
    }
}
