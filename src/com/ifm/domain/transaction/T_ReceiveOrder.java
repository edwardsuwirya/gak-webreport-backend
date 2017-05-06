package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Currency;
import com.ifm.domain.master.M_Customer;
import com.ifm.domain.master.M_ResponsibilityCenter;
import com.ifm.domain.master.M_Warehouse;

public class T_ReceiveOrder implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_receiveOrderNo;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_Currency currency;
    private M_Customer customer;
    private M_Warehouse warehouse;
    private String s_receiveOrderRealNo;
    private Date d_receiveOrderDate;
    private BigDecimal d_receiveOrderExRate;
    private String s_receiveOrderAddress;
    private String s_receiveOrderSpecialInstruction;
    private BigDecimal d_receiveOrderSubTotal;
    private BigDecimal d_receiveOrderDiscount;
    private BigDecimal d_receiveOrderVoucher;
    private BigDecimal d_receiveOrderTax;
    private BigDecimal d_receiveOrderPph;
    private BigDecimal d_receiveOrderServiceCharge;
    private BigDecimal d_receiveOrderBonus;
    private BigDecimal d_receiveOrderGrandTotal;
    private String s_receiveOrderStatus;
    private int i_receiveOrderPrinted;
    private String s_receiveOrderNote1;
    private String s_receiveOrderNote2;
    private String s_receiveOrderNote3;
    private int i_receiveOrderCreateID;
    private Date d_receiveOrderCreateDate;
    private int i_receiveOrderApproveID;
    private Date d_receiveOrderApproveDate;
    private int i_receiveOrderCancelID;
    private Date d_receiveOrderCancelDate;
    private String s_receiveOrderCancelReason;
    private int i_receiveOrderUpdateID;
    private Date d_receiveOrderUpdateDate;
    private String s_receiveOrderActive;
    private Set details;
    private Set payments;

    public T_ReceiveOrder() {
    }

    public String getS_receiveOrderNo() {
        return s_receiveOrderNo;
    }

    public void setS_receiveOrderNo(String s_receiveOrderNo) {
        this.s_receiveOrderNo = s_receiveOrderNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public M_Currency getCurrency() {
        return currency;
    }

    public void setCurrency(M_Currency currency) {
        this.currency = currency;
    }

    public M_Customer getCustomer() {
        return customer;
    }

    public void setCustomer(M_Customer customer) {
        this.customer = customer;
    }

    public M_Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(M_Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getS_receiveOrderRealNo() {
        return s_receiveOrderRealNo;
    }

    public void setS_receiveOrderRealNo(String s_receiveOrderRealNo) {
        this.s_receiveOrderRealNo = s_receiveOrderRealNo;
    }

    public Date getD_receiveOrderDate() {
        return d_receiveOrderDate;
    }

    public void setD_receiveOrderDate(Date d_receiveOrderDate) {
        this.d_receiveOrderDate = d_receiveOrderDate;
    }

    public BigDecimal getD_receiveOrderExRate() {
        return d_receiveOrderExRate;
    }

    public void setD_receiveOrderExRate(BigDecimal d_receiveOrderExRate) {
        this.d_receiveOrderExRate = d_receiveOrderExRate;
    }

    public String getS_receiveOrderAddress() {
        return s_receiveOrderAddress;
    }

    public void setS_receiveOrderAddress(String s_receiveOrderAddress) {
        this.s_receiveOrderAddress = s_receiveOrderAddress;
    }

    public String getS_receiveOrderSpecialInstruction() {
        return s_receiveOrderSpecialInstruction;
    }

    public void setS_receiveOrderSpecialInstruction(
            String s_receiveOrderSpecialInstruction) {
        this.s_receiveOrderSpecialInstruction = s_receiveOrderSpecialInstruction;
    }

    public BigDecimal getD_receiveOrderSubTotal() {
        return d_receiveOrderSubTotal;
    }

    public void setD_receiveOrderSubTotal(BigDecimal d_receiveOrderSubTotal) {
        this.d_receiveOrderSubTotal = d_receiveOrderSubTotal;
    }

    public BigDecimal getD_receiveOrderDiscount() {
        return d_receiveOrderDiscount;
    }

    public void setD_receiveOrderDiscount(BigDecimal d_receiveOrderDiscount) {
        this.d_receiveOrderDiscount = d_receiveOrderDiscount;
    }

    public BigDecimal getD_receiveOrderVoucher() {
        return d_receiveOrderVoucher;
    }

    public void setD_receiveOrderVoucher(BigDecimal d_receiveOrderVoucher) {
        this.d_receiveOrderVoucher = d_receiveOrderVoucher;
    }

    public BigDecimal getD_receiveOrderTax() {
        return d_receiveOrderTax;
    }

    public void setD_receiveOrderTax(BigDecimal d_receiveOrderTax) {
        this.d_receiveOrderTax = d_receiveOrderTax;
    }

    public BigDecimal getD_receiveOrderPph() {
        return d_receiveOrderPph;
    }

    public void setD_receiveOrderPph(BigDecimal d_receiveOrderPph) {
        this.d_receiveOrderPph = d_receiveOrderPph;
    }

    public BigDecimal getD_receiveOrderServiceCharge() {
        return d_receiveOrderServiceCharge;
    }

    public void setD_receiveOrderServiceCharge(
            BigDecimal d_receiveOrderServiceCharge) {
        this.d_receiveOrderServiceCharge = d_receiveOrderServiceCharge;
    }

    public BigDecimal getD_receiveOrderBonus() {
        return d_receiveOrderBonus;
    }

    public void setD_receiveOrderBonus(BigDecimal d_receiveOrderBonus) {
        this.d_receiveOrderBonus = d_receiveOrderBonus;
    }

    public BigDecimal getD_receiveOrderGrandTotal() {
        return d_receiveOrderGrandTotal;
    }

    public void setD_receiveOrderGrandTotal(BigDecimal d_receiveOrderGrandTotal) {
        this.d_receiveOrderGrandTotal = d_receiveOrderGrandTotal;
    }

    public String getS_receiveOrderStatus() {
        return s_receiveOrderStatus;
    }

    public void setS_receiveOrderStatus(String s_receiveOrderStatus) {
        this.s_receiveOrderStatus = s_receiveOrderStatus;
    }

    public int getI_receiveOrderPrinted() {
        return i_receiveOrderPrinted;
    }

    public void setI_receiveOrderPrinted(int i_receiveOrderPrinted) {
        this.i_receiveOrderPrinted = i_receiveOrderPrinted;
    }

    public String getS_receiveOrderNote1() {
        return s_receiveOrderNote1;
    }

    public void setS_receiveOrderNote1(String s_receiveOrderNote1) {
        this.s_receiveOrderNote1 = s_receiveOrderNote1;
    }

    public String getS_receiveOrderNote2() {
        return s_receiveOrderNote2;
    }

    public void setS_receiveOrderNote2(String s_receiveOrderNote2) {
        this.s_receiveOrderNote2 = s_receiveOrderNote2;
    }

    public String getS_receiveOrderNote3() {
        return s_receiveOrderNote3;
    }

    public void setS_receiveOrderNote3(String s_receiveOrderNote3) {
        this.s_receiveOrderNote3 = s_receiveOrderNote3;
    }

    public int getI_receiveOrderCreateID() {
        return i_receiveOrderCreateID;
    }

    public void setI_receiveOrderCreateID(int i_receiveOrderCreateID) {
        this.i_receiveOrderCreateID = i_receiveOrderCreateID;
    }

    public Date getD_receiveOrderCreateDate() {
        return d_receiveOrderCreateDate;
    }

    public void setD_receiveOrderCreateDate(Date d_receiveOrderCreateDate) {
        this.d_receiveOrderCreateDate = d_receiveOrderCreateDate;
    }

    public int getI_receiveOrderApproveID() {
        return i_receiveOrderApproveID;
    }

    public void setI_receiveOrderApproveID(int i_receiveOrderApproveID) {
        this.i_receiveOrderApproveID = i_receiveOrderApproveID;
    }

    public Date getD_receiveOrderApproveDate() {
        return d_receiveOrderApproveDate;
    }

    public void setD_receiveOrderApproveDate(Date d_receiveOrderApproveDate) {
        this.d_receiveOrderApproveDate = d_receiveOrderApproveDate;
    }

    public int getI_receiveOrderCancelID() {
        return i_receiveOrderCancelID;
    }

    public void setI_receiveOrderCancelID(int i_receiveOrderCancelID) {
        this.i_receiveOrderCancelID = i_receiveOrderCancelID;
    }

    public Date getD_receiveOrderCancelDate() {
        return d_receiveOrderCancelDate;
    }

    public void setD_receiveOrderCancelDate(Date d_receiveOrderCancelDate) {
        this.d_receiveOrderCancelDate = d_receiveOrderCancelDate;
    }

    public String getS_receiveOrderCancelReason() {
        return s_receiveOrderCancelReason;
    }

    public void setS_receiveOrderCancelReason(String s_receiveOrderCancelReason) {
        this.s_receiveOrderCancelReason = s_receiveOrderCancelReason;
    }

    public int getI_receiveOrderUpdateID() {
        return i_receiveOrderUpdateID;
    }

    public void setI_receiveOrderUpdateID(int i_receiveOrderUpdateID) {
        this.i_receiveOrderUpdateID = i_receiveOrderUpdateID;
    }

    public Date getD_receiveOrderUpdateDate() {
        return d_receiveOrderUpdateDate;
    }

    public void setD_receiveOrderUpdateDate(Date d_receiveOrderUpdateDate) {
        this.d_receiveOrderUpdateDate = d_receiveOrderUpdateDate;
    }

    public String getS_receiveOrderActive() {
        return s_receiveOrderActive;
    }

    public void setS_receiveOrderActive(String s_receiveOrderActive) {
        this.s_receiveOrderActive = s_receiveOrderActive;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }

    public Set getPayments() {
        return payments;
    }

    public void setPayments(Set payments) {
        this.payments = payments;
    }
}
