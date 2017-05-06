package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Bank implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_bankCode;
    private M_Company company;
    private String s_bankRealCode;
    private String s_bankName;
    private int i_bankCreateID;
    private Date d_bankCreateDate;
    private int i_bankDeleteID;
    private Date d_bankDeleteDate;
    private int i_bankUpdateID;
    private Date d_bankUpdateDate;
    private String s_bankActive;

    public M_Bank() {
    }

    public String getS_bankCode() {
        return s_bankCode;
    }

    public void setS_bankCode(String s_bankCode) {
        this.s_bankCode = s_bankCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_bankRealCode() {
        return s_bankRealCode;
    }

    public void setS_bankRealCode(String s_bankRealCode) {
        this.s_bankRealCode = s_bankRealCode;
    }

    public String getS_bankName() {
        return s_bankName;
    }

    public void setS_bankName(String s_bankName) {
        this.s_bankName = s_bankName;
    }

    public int getI_bankCreateID() {
        return i_bankCreateID;
    }

    public void setI_bankCreateID(int i_bankCreateID) {
        this.i_bankCreateID = i_bankCreateID;
    }

    public Date getD_bankCreateDate() {
        return d_bankCreateDate;
    }

    public void setD_bankCreateDate(Date d_bankCreateDate) {
        this.d_bankCreateDate = d_bankCreateDate;
    }

    public int getI_bankDeleteID() {
        return i_bankDeleteID;
    }

    public void setI_bankDeleteID(int i_bankDeleteID) {
        this.i_bankDeleteID = i_bankDeleteID;
    }

    public Date getD_bankDeleteDate() {
        return d_bankDeleteDate;
    }

    public void setD_bankDeleteDate(Date d_bankDeleteDate) {
        this.d_bankDeleteDate = d_bankDeleteDate;
    }

    public int getI_bankUpdateID() {
        return i_bankUpdateID;
    }

    public void setI_bankUpdateID(int i_bankUpdateID) {
        this.i_bankUpdateID = i_bankUpdateID;
    }

    public Date getD_bankUpdateDate() {
        return d_bankUpdateDate;
    }

    public void setD_bankUpdateDate(Date d_bankUpdateDate) {
        this.d_bankUpdateDate = d_bankUpdateDate;
    }

    public String getS_bankActive() {
        return s_bankActive;
    }

    public void setS_bankActive(String s_bankActive) {
        this.s_bankActive = s_bankActive;
    }
}
