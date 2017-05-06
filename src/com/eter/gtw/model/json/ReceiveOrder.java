package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ReceiveOrder {
    private String s_receiveOrderNo;
    private String company;
    private String responsibilitycenter;
    private String currency;
    private String customer;
    private String warehouse;
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

    private List<ReceiveOrderDetail> details;

    public String getS_receiveOrderNo() {
        return s_receiveOrderNo;
    }

    public void setS_receiveOrderNo(String s_receiveOrderNo) {
        this.s_receiveOrderNo = s_receiveOrderNo;
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

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
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


    public List<ReceiveOrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ReceiveOrderDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_receiveOrderNo: " + String.valueOf(s_receiveOrderNo) + "\n");
        sb.append("company: " + String.valueOf(company) + "\n");
        sb.append("responsibilitycenter: " + String.valueOf(responsibilitycenter) + "\n");
        sb.append("currency: " + String.valueOf(currency) + "\n");
        sb.append("customer: " + String.valueOf(customer) + "\n");
        sb.append("warehouse: " + String.valueOf(warehouse) + "\n");
        sb.append("s_receiveOrderRealNo: " + String.valueOf(s_receiveOrderRealNo) + "\n");
        sb.append("d_receiveOrderDate: " + String.valueOf(d_receiveOrderDate) + "\n");
        sb.append("d_receiveOrderExRate: " + String.valueOf(d_receiveOrderExRate) + "\n");
        sb.append("s_receiveOrderAddress: " + String.valueOf(s_receiveOrderAddress) + "\n");
        sb.append("s_receiveOrderSpecialInstruction: " + String.valueOf(s_receiveOrderSpecialInstruction) + "\n");
        sb.append("d_receiveOrderSubTotal: " + String.valueOf(d_receiveOrderSubTotal) + "\n");
        sb.append("d_receiveOrderDiscount: " + String.valueOf(d_receiveOrderDiscount) + "\n");
        sb.append("d_receiveOrderVoucher: " + String.valueOf(d_receiveOrderVoucher) + "\n");
        sb.append("d_receiveOrderTax: " + String.valueOf(d_receiveOrderTax) + "\n");
        sb.append("d_receiveOrderPph: " + String.valueOf(d_receiveOrderPph) + "\n");
        sb.append("d_receiveOrderServiceCharge: " + String.valueOf(d_receiveOrderServiceCharge) + "\n");
        sb.append("d_receiveOrderBonus: " + String.valueOf(d_receiveOrderBonus) + "\n");
        sb.append("d_receiveOrderGrandTotal: " + String.valueOf(d_receiveOrderGrandTotal) + "\n");
        sb.append("s_receiveOrderStatus: " + String.valueOf(s_receiveOrderStatus) + "\n");
        sb.append("i_receiveOrderPrinted: " + String.valueOf(i_receiveOrderPrinted) + "\n");
        sb.append("s_receiveOrderNote1: " + String.valueOf(s_receiveOrderNote1) + "\n");
        sb.append("s_receiveOrderNote2: " + String.valueOf(s_receiveOrderNote2) + "\n");
        sb.append("s_receiveOrderNote3: " + String.valueOf(s_receiveOrderNote3) + "\n");
        sb.append("i_receiveOrderCreateID: " + String.valueOf(i_receiveOrderCreateID) + "\n");
        sb.append("d_receiveOrderCreateDate: " + String.valueOf(d_receiveOrderCreateDate) + "\n");
        sb.append("i_receiveOrderApproveID: " + String.valueOf(i_receiveOrderApproveID) + "\n");
        sb.append("d_receiveOrderApproveDate: " + String.valueOf(d_receiveOrderApproveDate) + "\n");
        sb.append("i_receiveOrderCancelID: " + String.valueOf(i_receiveOrderCancelID) + "\n");
        sb.append("d_receiveOrderCancelDate: " + String.valueOf(d_receiveOrderCancelDate) + "\n");
        sb.append("s_receiveOrderCancelReason: " + String.valueOf(s_receiveOrderCancelReason) + "\n");
        sb.append("i_receiveOrderUpdateID: " + String.valueOf(i_receiveOrderUpdateID) + "\n");
        sb.append("d_receiveOrderUpdateDate: " + String.valueOf(d_receiveOrderUpdateDate) + "\n");
        sb.append("s_receiveOrderActive: " + String.valueOf(s_receiveOrderActive) + "\n");

        if (details != null && details.size() > 0) {
            sb.append("details:\n");

            int i = 1;
            for (ReceiveOrderDetail d : details) {
                sb.append("===" + (i++) + "\n");
                sb.append(d.toString());
            }
        }

        return sb.toString();
    }

}
