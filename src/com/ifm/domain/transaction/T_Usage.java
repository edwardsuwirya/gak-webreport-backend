package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_UsageType;
import com.ifm.domain.master.M_Warehouse;

public class T_Usage {
    private String s_usageNo;
    private M_Company company;
    private M_UsageType usageType;
    private M_Warehouse warehouse;
    private M_Employee users;
    private String s_usageRealNo;
    private Date d_usageDate;
    private String s_usageStatus;
    private int i_usagePrinted;
    private String s_usageNote1;
    private String s_usageNote2;
    private String s_usageNote3;
    private int i_usageCreateID;
    private Date d_usageCreateDate;
    private int i_usageApproveID;
    private Date d_usageApproveDate;
    private int i_usageCancelID;
    private Date d_usageCancelDate;
    private String s_usageCancelReason;
    private int i_usageUpdateID;
    private Date d_usageUpdateDate;
    private String s_usageActive;
    private Set details;

    public T_Usage() {
    }

    public String getS_usageNo() {
        return s_usageNo;
    }

    public void setS_usageNo(String s_usageNo) {
        this.s_usageNo = s_usageNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_UsageType getUsageType() {
        return usageType;
    }

    public void setUsageType(M_UsageType usageType) {
        this.usageType = usageType;
    }

    public M_Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(M_Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public M_Employee getUsers() {
        return users;
    }

    public void setUsers(M_Employee users) {
        this.users = users;
    }

    public String getS_usageRealNo() {
        return s_usageRealNo;
    }

    public void setS_usageRealNo(String s_usageRealNo) {
        this.s_usageRealNo = s_usageRealNo;
    }

    public Date getD_usageDate() {
        return d_usageDate;
    }

    public void setD_usageDate(Date d_usageDate) {
        this.d_usageDate = d_usageDate;
    }

    public String getS_usageStatus() {
        return s_usageStatus;
    }

    public void setS_usageStatus(String s_usageStatus) {
        this.s_usageStatus = s_usageStatus;
    }

    public int getI_usagePrinted() {
        return i_usagePrinted;
    }

    public void setI_usagePrinted(int i_usagePrinted) {
        this.i_usagePrinted = i_usagePrinted;
    }

    public String getS_usageNote1() {
        return s_usageNote1;
    }

    public void setS_usageNote1(String s_usageNote1) {
        this.s_usageNote1 = s_usageNote1;
    }

    public String getS_usageNote2() {
        return s_usageNote2;
    }

    public void setS_usageNote2(String s_usageNote2) {
        this.s_usageNote2 = s_usageNote2;
    }

    public String getS_usageNote3() {
        return s_usageNote3;
    }

    public void setS_usageNote3(String s_usageNote3) {
        this.s_usageNote3 = s_usageNote3;
    }

    public int getI_usageCreateID() {
        return i_usageCreateID;
    }

    public void setI_usageCreateID(int i_usageCreateID) {
        this.i_usageCreateID = i_usageCreateID;
    }

    public Date getD_usageCreateDate() {
        return d_usageCreateDate;
    }

    public void setD_usageCreateDate(Date d_usageCreateDate) {
        this.d_usageCreateDate = d_usageCreateDate;
    }

    public int getI_usageApproveID() {
        return i_usageApproveID;
    }

    public void setI_usageApproveID(int i_usageApproveID) {
        this.i_usageApproveID = i_usageApproveID;
    }

    public Date getD_usageApproveDate() {
        return d_usageApproveDate;
    }

    public void setD_usageApproveDate(Date d_usageApproveDate) {
        this.d_usageApproveDate = d_usageApproveDate;
    }

    public int getI_usageCancelID() {
        return i_usageCancelID;
    }

    public void setI_usageCancelID(int i_usageCancelID) {
        this.i_usageCancelID = i_usageCancelID;
    }

    public Date getD_usageCancelDate() {
        return d_usageCancelDate;
    }

    public void setD_usageCancelDate(Date d_usageCancelDate) {
        this.d_usageCancelDate = d_usageCancelDate;
    }

    public String getS_usageCancelReason() {
        return s_usageCancelReason;
    }

    public void setS_usageCancelReason(String s_usageCancelReason) {
        this.s_usageCancelReason = s_usageCancelReason;
    }

    public int getI_usageUpdateID() {
        return i_usageUpdateID;
    }

    public void setI_usageUpdateID(int i_usageUpdateID) {
        this.i_usageUpdateID = i_usageUpdateID;
    }

    public Date getD_usageUpdateDate() {
        return d_usageUpdateDate;
    }

    public void setD_usageUpdateDate(Date d_usageUpdateDate) {
        this.d_usageUpdateDate = d_usageUpdateDate;
    }

    public String getS_usageActive() {
        return s_usageActive;
    }

    public void setS_usageActive(String s_usageActive) {
        this.s_usageActive = s_usageActive;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }
}
