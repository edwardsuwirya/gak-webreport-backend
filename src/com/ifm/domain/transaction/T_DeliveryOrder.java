package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Customer;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_Warehouse;

public class T_DeliveryOrder implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_deliveryOrderNo;
    private M_Company company;
    private M_Customer customer;
    private M_Warehouse warehouse;
    private T_ReceiveOrder receiveorder;
    private T_SalesOrder salesorder;
    private M_Employee driver;
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
    private Set details;

    public T_DeliveryOrder() {
    }

    public String getS_deliveryOrderNo() {
        return s_deliveryOrderNo;
    }

    public void setS_deliveryOrderNo(String s_deliveryOrderNo) {
        this.s_deliveryOrderNo = s_deliveryOrderNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
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

    public T_ReceiveOrder getReceiveorder() {
        return receiveorder;
    }

    public void setReceiveorder(T_ReceiveOrder receiveorder) {
        this.receiveorder = receiveorder;
    }

    public T_SalesOrder getSalesorder() {
        return salesorder;
    }

    public void setSalesorder(T_SalesOrder salesorder) {
        this.salesorder = salesorder;
    }

    public M_Employee getDriver() {
        return driver;
    }

    public void setDriver(M_Employee driver) {
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

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }
}
