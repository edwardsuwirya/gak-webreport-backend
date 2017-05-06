package com.eter.gtw.model.json;

import java.util.Date;
import java.util.List;

public class DeliveryOrder {
    private String s_deliveryOrderNo;
    private String company;
    private String customer;
    private String warehouse;
    private String receiveorder;
    private String salesorder;
    private String driver;
    private String s_deliveryOrderRealNo;
    private Date d_deliveryOrderDate;
    private String s_deliveryOrderAddress;
    private String s_deliveryOrderSpecialInstruction;
    private String s_deliveryOrderReceiver;
    private String s_deliveryOrderStatus;
    private int i_deliveryOrderPrinted;
    private String s_deliveryOrderNote1;
    private String s_deliveryOrderNote2;
    private String s_deliveryOrderNote3;
    private int i_deliveryOrderCreateID;
    private Date d_deliveryOrderCreateDate;
    private int i_deliveryOrderApproveID;
    private Date d_deliveryOrderApproveDate;
    private int i_deliveryOrderCancelID;
    private Date d_deliveryOrderCancelDate;
    private String s_deliveryOrderCancelReason;
    private int i_deliveryOrderUpdateID;
    private Date d_deliveryOrderUpdateDate;
    private String s_deliveryOrderActive;

    private List<DeliveryOrderDetail> details;

    public String getS_deliveryOrderNo() {
        return s_deliveryOrderNo;
    }

    public void setS_deliveryOrderNo(String s_deliveryOrderNo) {
        this.s_deliveryOrderNo = s_deliveryOrderNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getReceiveorder() {
        return receiveorder;
    }

    public void setReceiveorder(String receiveorder) {
        this.receiveorder = receiveorder;
    }

    public String getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(String salesorder) {
        this.salesorder = salesorder;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getS_deliveryOrderRealNo() {
        return s_deliveryOrderRealNo;
    }

    public void setS_deliveryOrderRealNo(String s_deliveryOrderRealNo) {
        this.s_deliveryOrderRealNo = s_deliveryOrderRealNo;
    }

    public Date getD_deliveryOrderDate() {
        return d_deliveryOrderDate;
    }

    public void setD_deliveryOrderDate(Date d_deliveryOrderDate) {
        this.d_deliveryOrderDate = d_deliveryOrderDate;
    }

    public String getS_deliveryOrderAddress() {
        return s_deliveryOrderAddress;
    }

    public void setS_deliveryOrderAddress(String s_deliveryOrderAddress) {
        this.s_deliveryOrderAddress = s_deliveryOrderAddress;
    }

    public String getS_deliveryOrderSpecialInstruction() {
        return s_deliveryOrderSpecialInstruction;
    }

    public void setS_deliveryOrderSpecialInstruction(
            String s_deliveryOrderSpecialInstruction) {
        this.s_deliveryOrderSpecialInstruction = s_deliveryOrderSpecialInstruction;
    }

    public String getS_deliveryOrderReceiver() {
        return s_deliveryOrderReceiver;
    }

    public void setS_deliveryOrderReceiver(String s_deliveryOrderReceiver) {
        this.s_deliveryOrderReceiver = s_deliveryOrderReceiver;
    }

    public String getS_deliveryOrderStatus() {
        return s_deliveryOrderStatus;
    }

    public void setS_deliveryOrderStatus(String s_deliveryOrderStatus) {
        this.s_deliveryOrderStatus = s_deliveryOrderStatus;
    }

    public int getI_deliveryOrderPrinted() {
        return i_deliveryOrderPrinted;
    }

    public void setI_deliveryOrderPrinted(int i_deliveryOrderPrinted) {
        this.i_deliveryOrderPrinted = i_deliveryOrderPrinted;
    }

    public String getS_deliveryOrderNote1() {
        return s_deliveryOrderNote1;
    }

    public void setS_deliveryOrderNote1(String s_deliveryOrderNote1) {
        this.s_deliveryOrderNote1 = s_deliveryOrderNote1;
    }

    public String getS_deliveryOrderNote2() {
        return s_deliveryOrderNote2;
    }

    public void setS_deliveryOrderNote2(String s_deliveryOrderNote2) {
        this.s_deliveryOrderNote2 = s_deliveryOrderNote2;
    }

    public String getS_deliveryOrderNote3() {
        return s_deliveryOrderNote3;
    }

    public void setS_deliveryOrderNote3(String s_deliveryOrderNote3) {
        this.s_deliveryOrderNote3 = s_deliveryOrderNote3;
    }

    public int getI_deliveryOrderCreateID() {
        return i_deliveryOrderCreateID;
    }

    public void setI_deliveryOrderCreateID(int i_deliveryOrderCreateID) {
        this.i_deliveryOrderCreateID = i_deliveryOrderCreateID;
    }

    public Date getD_deliveryOrderCreateDate() {
        return d_deliveryOrderCreateDate;
    }

    public void setD_deliveryOrderCreateDate(Date d_deliveryOrderCreateDate) {
        this.d_deliveryOrderCreateDate = d_deliveryOrderCreateDate;
    }

    public int getI_deliveryOrderApproveID() {
        return i_deliveryOrderApproveID;
    }

    public void setI_deliveryOrderApproveID(int i_deliveryOrderApproveID) {
        this.i_deliveryOrderApproveID = i_deliveryOrderApproveID;
    }

    public Date getD_deliveryOrderApproveDate() {
        return d_deliveryOrderApproveDate;
    }

    public void setD_deliveryOrderApproveDate(Date d_deliveryOrderApproveDate) {
        this.d_deliveryOrderApproveDate = d_deliveryOrderApproveDate;
    }

    public int getI_deliveryOrderCancelID() {
        return i_deliveryOrderCancelID;
    }

    public void setI_deliveryOrderCancelID(int i_deliveryOrderCancelID) {
        this.i_deliveryOrderCancelID = i_deliveryOrderCancelID;
    }

    public Date getD_deliveryOrderCancelDate() {
        return d_deliveryOrderCancelDate;
    }

    public void setD_deliveryOrderCancelDate(Date d_deliveryOrderCancelDate) {
        this.d_deliveryOrderCancelDate = d_deliveryOrderCancelDate;
    }

    public String getS_deliveryOrderCancelReason() {
        return s_deliveryOrderCancelReason;
    }

    public void setS_deliveryOrderCancelReason(String s_deliveryOrderCancelReason) {
        this.s_deliveryOrderCancelReason = s_deliveryOrderCancelReason;
    }

    public int getI_deliveryOrderUpdateID() {
        return i_deliveryOrderUpdateID;
    }

    public void setI_deliveryOrderUpdateID(int i_deliveryOrderUpdateID) {
        this.i_deliveryOrderUpdateID = i_deliveryOrderUpdateID;
    }

    public Date getD_deliveryOrderUpdateDate() {
        return d_deliveryOrderUpdateDate;
    }

    public void setD_deliveryOrderUpdateDate(Date d_deliveryOrderUpdateDate) {
        this.d_deliveryOrderUpdateDate = d_deliveryOrderUpdateDate;
    }

    public String getS_deliveryOrderActive() {
        return s_deliveryOrderActive;
    }

    public void setS_deliveryOrderActive(String s_deliveryOrderActive) {
        this.s_deliveryOrderActive = s_deliveryOrderActive;
    }

    public List<DeliveryOrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<DeliveryOrderDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_deliveryOrderNo: " + String.valueOf(s_deliveryOrderNo) + "\n");
        sb.append("company: " + String.valueOf(company) + "\n");
        sb.append("customer: " + String.valueOf(customer) + "\n");
        sb.append("warehouse: " + String.valueOf(warehouse) + "\n");
        sb.append("receiveorder: " + String.valueOf(receiveorder) + "\n");
        sb.append("salesorder: " + String.valueOf(salesorder) + "\n");
        sb.append("driver: " + String.valueOf(driver) + "\n");
        sb.append("s_deliveryOrderRealNo: " + String.valueOf(s_deliveryOrderRealNo) + "\n");
        sb.append("d_deliveryOrderDate: " + String.valueOf(d_deliveryOrderDate) + "\n");
        sb.append("s_deliveryOrderAddress: " + String.valueOf(s_deliveryOrderAddress) + "\n");
        sb.append("s_deliveryOrderSpecialInstruction: " + String.valueOf(s_deliveryOrderSpecialInstruction) + "\n");
        sb.append("s_deliveryOrderReceiver: " + String.valueOf(s_deliveryOrderReceiver) + "\n");
        sb.append("s_deliveryOrderStatus: " + String.valueOf(s_deliveryOrderStatus) + "\n");
        sb.append("i_deliveryOrderPrinted: " + String.valueOf(i_deliveryOrderPrinted) + "\n");
        sb.append("s_deliveryOrderNote1: " + String.valueOf(s_deliveryOrderNote1) + "\n");
        sb.append("s_deliveryOrderNote2: " + String.valueOf(s_deliveryOrderNote2) + "\n");
        sb.append("s_deliveryOrderNote3: " + String.valueOf(s_deliveryOrderNote3) + "\n");
        sb.append("i_deliveryOrderCreateID: " + String.valueOf(i_deliveryOrderCreateID) + "\n");
        sb.append("d_deliveryOrderCreateDate: " + String.valueOf(d_deliveryOrderCreateDate) + "\n");
        sb.append("i_deliveryOrderApproveID: " + String.valueOf(i_deliveryOrderApproveID) + "\n");
        sb.append("d_deliveryOrderApproveDate: " + String.valueOf(d_deliveryOrderApproveDate) + "\n");
        sb.append("i_deliveryOrderCancelID: " + String.valueOf(i_deliveryOrderCancelID) + "\n");
        sb.append("d_deliveryOrderCancelDate: " + String.valueOf(d_deliveryOrderCancelDate) + "\n");
        sb.append("s_deliveryOrderCancelReason: " + String.valueOf(s_deliveryOrderCancelReason) + "\n");
        sb.append("i_deliveryOrderUpdateID: " + String.valueOf(i_deliveryOrderUpdateID) + "\n");
        sb.append("d_deliveryOrderUpdateDate: " + String.valueOf(d_deliveryOrderUpdateDate) + "\n");
        sb.append("s_deliveryOrderActive: " + String.valueOf(s_deliveryOrderActive) + "\n");

        if (details != null && details.size() > 0) {
            sb.append("details : \n");

            int i = 1;
            for (DeliveryOrderDetail d : details) {
                sb.append("===" + (i++) + "\n");
                sb.append(d.toString());
            }
        }

        return sb.toString();
    }
}
