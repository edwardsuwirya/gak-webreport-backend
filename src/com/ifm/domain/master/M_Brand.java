package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Brand implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_brandCode;
    private M_Company company;
    private M_Country country;
    private String s_brandRealCode;
    private String s_brandName;
    private int i_brandCreateID;
    private Date d_brandCreateDate;
    private int i_brandDeleteID;
    private Date d_brandDeleteDate;
    private int i_brandUpdateID;
    private Date d_brandUpdateDate;
    private String s_brandActive;

    public M_Brand() {
    }

    public String getS_brandCode() {
        return s_brandCode;
    }

    public void setS_brandCode(String s_brandCode) {
        this.s_brandCode = s_brandCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Country getCountry() {
        return country;
    }

    public void setCountry(M_Country country) {
        this.country = country;
    }

    public String getS_brandRealCode() {
        return s_brandRealCode;
    }

    public void setS_brandRealCode(String s_brandRealCode) {
        this.s_brandRealCode = s_brandRealCode;
    }

    public String getS_brandName() {
        return s_brandName;
    }

    public void setS_brandName(String s_brandName) {
        this.s_brandName = s_brandName;
    }

    public int getI_brandCreateID() {
        return i_brandCreateID;
    }

    public void setI_brandCreateID(int i_brandCreateID) {
        this.i_brandCreateID = i_brandCreateID;
    }

    public Date getD_brandCreateDate() {
        return d_brandCreateDate;
    }

    public void setD_brandCreateDate(Date d_brandCreateDate) {
        this.d_brandCreateDate = d_brandCreateDate;
    }

    public int getI_brandDeleteID() {
        return i_brandDeleteID;
    }

    public void setI_brandDeleteID(int i_brandDeleteID) {
        this.i_brandDeleteID = i_brandDeleteID;
    }

    public Date getD_brandDeleteDate() {
        return d_brandDeleteDate;
    }

    public void setD_brandDeleteDate(Date d_brandDeleteDate) {
        this.d_brandDeleteDate = d_brandDeleteDate;
    }

    public int getI_brandUpdateID() {
        return i_brandUpdateID;
    }

    public void setI_brandUpdateID(int i_brandUpdateID) {
        this.i_brandUpdateID = i_brandUpdateID;
    }

    public Date getD_brandUpdateDate() {
        return d_brandUpdateDate;
    }

    public void setD_brandUpdateDate(Date d_brandUpdateDate) {
        this.d_brandUpdateDate = d_brandUpdateDate;
    }

    public String getS_brandActive() {
        return s_brandActive;
    }

    public void setS_brandActive(String s_brandActive) {
        this.s_brandActive = s_brandActive;
    }
}
