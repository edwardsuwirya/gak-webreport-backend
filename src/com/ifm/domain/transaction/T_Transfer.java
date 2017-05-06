package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_Warehouse;
import com.ifm.domain.transaction.T_Transfer;

public class T_Transfer {
    private String s_transferNo;
    private M_Company company;
    private M_Warehouse warehouse;
    private M_Warehouse warehouseref;
    private M_Employee sender;
    private M_Employee receiver;
    private String s_transferRefNo;
    private T_Transfer transferrefno;
    private String s_transferRealNo;
    private Date d_transferDate;
    private String s_transferInOut;
    private String s_transferStatus;
    private int i_transferPrinted;
    private String s_transferNote1;
    private String s_transferNote2;
    private String s_transferNote3;
    private int i_transferCreateID;
    private Date d_transferCreateDate;
    private int i_transferApproveID;
    private Date d_transferApproveDate;
    private int i_transferCancelID;
    private Date d_transferCancelDate;
    private String s_transferCancelReason;
    private int i_transferUpdateID;
    private Date d_transferUpdateDate;
    private String s_transferActive;
    private Set transfers;
    private Set details;

    public T_Transfer() {
    }

    public T_Transfer(String s_transferNo) {
        this.s_transferNo = s_transferNo;
    }

    public String getS_transferNo() {
        return s_transferNo;
    }

    public void setS_transferNo(String s_transferNo) {
        this.s_transferNo = s_transferNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(M_Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public M_Warehouse getWarehouseref() {
        return warehouseref;
    }

    public void setWarehouseref(M_Warehouse warehouseref) {
        this.warehouseref = warehouseref;
    }

    public M_Employee getSender() {
        return sender;
    }

    public void setSender(M_Employee sender) {
        this.sender = sender;
    }

    public M_Employee getReceiver() {
        return receiver;
    }

    public void setReceiver(M_Employee receiver) {
        this.receiver = receiver;
    }

    public String getS_transferRefNo() {
        return s_transferRefNo;
    }

    public void setS_transferRefNo(String s_transferRefNo) {
        this.s_transferRefNo = s_transferRefNo;
    }

    public T_Transfer getTransferrefno() {
        return transferrefno;
    }

    public void setTransferrefno(T_Transfer transferrefno) {
        this.transferrefno = transferrefno;
    }

    public String getS_transferRealNo() {
        return s_transferRealNo;
    }

    public void setS_transferRealNo(String s_transferRealNo) {
        this.s_transferRealNo = s_transferRealNo;
    }

    public Date getD_transferDate() {
        return d_transferDate;
    }

    public void setD_transferDate(Date d_transferDate) {
        this.d_transferDate = d_transferDate;
    }

    public String getS_transferInOut() {
        return s_transferInOut;
    }

    public void setS_transferInOut(String s_transferInOut) {
        this.s_transferInOut = s_transferInOut;
    }

    public String getS_transferStatus() {
        return s_transferStatus;
    }

    public void setS_transferStatus(String s_transferStatus) {
        this.s_transferStatus = s_transferStatus;
    }

    public int getI_transferPrinted() {
        return i_transferPrinted;
    }

    public void setI_transferPrinted(int i_transferPrinted) {
        this.i_transferPrinted = i_transferPrinted;
    }

    public String getS_transferNote1() {
        return s_transferNote1;
    }

    public void setS_transferNote1(String s_transferNote1) {
        this.s_transferNote1 = s_transferNote1;
    }

    public String getS_transferNote2() {
        return s_transferNote2;
    }

    public void setS_transferNote2(String s_transferNote2) {
        this.s_transferNote2 = s_transferNote2;
    }

    public String getS_transferNote3() {
        return s_transferNote3;
    }

    public void setS_transferNote3(String s_transferNote3) {
        this.s_transferNote3 = s_transferNote3;
    }

    public int getI_transferCreateID() {
        return i_transferCreateID;
    }

    public void setI_transferCreateID(int i_transferCreateID) {
        this.i_transferCreateID = i_transferCreateID;
    }

    public Date getD_transferCreateDate() {
        return d_transferCreateDate;
    }

    public void setD_transferCreateDate(Date d_transferCreateDate) {
        this.d_transferCreateDate = d_transferCreateDate;
    }

    public int getI_transferApproveID() {
        return i_transferApproveID;
    }

    public void setI_transferApproveID(int i_transferApproveID) {
        this.i_transferApproveID = i_transferApproveID;
    }

    public Date getD_transferApproveDate() {
        return d_transferApproveDate;
    }

    public void setD_transferApproveDate(Date d_transferApproveDate) {
        this.d_transferApproveDate = d_transferApproveDate;
    }

    public int getI_transferCancelID() {
        return i_transferCancelID;
    }

    public void setI_transferCancelID(int i_transferCancelID) {
        this.i_transferCancelID = i_transferCancelID;
    }

    public Date getD_transferCancelDate() {
        return d_transferCancelDate;
    }

    public void setD_transferCancelDate(Date d_transferCancelDate) {
        this.d_transferCancelDate = d_transferCancelDate;
    }

    public String getS_transferCancelReason() {
        return s_transferCancelReason;
    }

    public void setS_transferCancelReason(String s_transferCancelReason) {
        this.s_transferCancelReason = s_transferCancelReason;
    }

    public int getI_transferUpdateID() {
        return i_transferUpdateID;
    }

    public void setI_transferUpdateID(int i_transferUpdateID) {
        this.i_transferUpdateID = i_transferUpdateID;
    }

    public Date getD_transferUpdateDate() {
        return d_transferUpdateDate;
    }

    public void setD_transferUpdateDate(Date d_transferUpdateDate) {
        this.d_transferUpdateDate = d_transferUpdateDate;
    }

    public String getS_transferActive() {
        return s_transferActive;
    }

    public void setS_transferActive(String s_transferActive) {
        this.s_transferActive = s_transferActive;
    }

    public Set getTransfers() {
        return transfers;
    }

    public void setTransfers(Set transfers) {
        this.transfers = transfers;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }
}
