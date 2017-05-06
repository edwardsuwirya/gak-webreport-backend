package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_UsageType implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_usageTypeCode;
    private M_Company company;
    private String s_usageTypeRealCode;
    private String s_usageTypeName;
    private int i_usageTypeCreateID;
    private Date d_usageTypeCreateDate;
    private int i_usageTypeDeleteID;
    private Date d_usageTypeDeleteDate;
    private int i_usageTypeUpdateID;
    private Date d_usageTypeUpdateDate;
    private String s_usageTypeActive;

    public M_UsageType() {
    }

    public String getS_usageTypeCode() {
        return s_usageTypeCode;
    }

    public void setS_usageTypeCode(String s_usageTypeCode) {
        this.s_usageTypeCode = s_usageTypeCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_usageTypeRealCode() {
        return s_usageTypeRealCode;
    }

    public void setS_usageTypeRealCode(String s_usageTypeRealCode) {
        this.s_usageTypeRealCode = s_usageTypeRealCode;
    }

    public String getS_usageTypeName() {
        return s_usageTypeName;
    }

    public void setS_usageTypeName(String s_usageTypeName) {
        this.s_usageTypeName = s_usageTypeName;
    }

    public int getI_usageTypeCreateID() {
        return i_usageTypeCreateID;
    }

    public void setI_usageTypeCreateID(int i_usageTypeCreateID) {
        this.i_usageTypeCreateID = i_usageTypeCreateID;
    }

    public Date getD_usageTypeCreateDate() {
        return d_usageTypeCreateDate;
    }

    public void setD_usageTypeCreateDate(Date d_usageTypeCreateDate) {
        this.d_usageTypeCreateDate = d_usageTypeCreateDate;
    }

    public int getI_usageTypeDeleteID() {
        return i_usageTypeDeleteID;
    }

    public void setI_usageTypeDeleteID(int i_usageTypeDeleteID) {
        this.i_usageTypeDeleteID = i_usageTypeDeleteID;
    }

    public Date getD_usageTypeDeleteDate() {
        return d_usageTypeDeleteDate;
    }

    public void setD_usageTypeDeleteDate(Date d_usageTypeDeleteDate) {
        this.d_usageTypeDeleteDate = d_usageTypeDeleteDate;
    }

    public int getI_usageTypeUpdateID() {
        return i_usageTypeUpdateID;
    }

    public void setI_usageTypeUpdateID(int i_usageTypeUpdateID) {
        this.i_usageTypeUpdateID = i_usageTypeUpdateID;
    }

    public Date getD_usageTypeUpdateDate() {
        return d_usageTypeUpdateDate;
    }

    public void setD_usageTypeUpdateDate(Date d_usageTypeUpdateDate) {
        this.d_usageTypeUpdateDate = d_usageTypeUpdateDate;
    }

    public String getS_usageTypeActive() {
        return s_usageTypeActive;
    }

    public void setS_usageTypeActive(String s_usageTypeActive) {
        this.s_usageTypeActive = s_usageTypeActive;
    }
}
