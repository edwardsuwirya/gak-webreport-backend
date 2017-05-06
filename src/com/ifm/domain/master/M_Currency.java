package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Currency implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_currencyCode;
    private M_Country country;
    private String s_currencyName;
    private String s_currencySymbol;
    private int i_currencyCreateID;
    private Date d_currencyCreateDate;
    private int i_currencyDeleteID;
    private Date d_currencyDeleteDate;
    private int i_currencyUpdateID;
    private Date d_currencyUpdateDate;
    private String s_currencyActive;

    public M_Currency() {
    }

    public String getS_currencyCode() {
        return s_currencyCode;
    }

    public void setS_currencyCode(String s_currencyCode) {
        this.s_currencyCode = s_currencyCode;
    }

    public M_Country getCountry() {
        return country;
    }

    public void setCountry(M_Country country) {
        this.country = country;
    }

    public String getS_currencyName() {
        return s_currencyName;
    }

    public void setS_currencyName(String s_currencyName) {
        this.s_currencyName = s_currencyName;
    }

    public String getS_currencySymbol() {
        return s_currencySymbol;
    }

    public void setS_currencySymbol(String s_currencySymbol) {
        this.s_currencySymbol = s_currencySymbol;
    }

    public int getI_currencyCreateID() {
        return i_currencyCreateID;
    }

    public void setI_currencyCreateID(int i_currencyCreateID) {
        this.i_currencyCreateID = i_currencyCreateID;
    }

    public Date getD_currencyCreateDate() {
        return d_currencyCreateDate;
    }

    public void setD_currencyCreateDate(Date d_currencyCreateDate) {
        this.d_currencyCreateDate = d_currencyCreateDate;
    }

    public int getI_currencyDeleteID() {
        return i_currencyDeleteID;
    }

    public void setI_currencyDeleteID(int i_currencyDeleteID) {
        this.i_currencyDeleteID = i_currencyDeleteID;
    }

    public Date getD_currencyDeleteDate() {
        return d_currencyDeleteDate;
    }

    public void setD_currencyDeleteDate(Date d_currencyDeleteDate) {
        this.d_currencyDeleteDate = d_currencyDeleteDate;
    }

    public int getI_currencyUpdateID() {
        return i_currencyUpdateID;
    }

    public void setI_currencyUpdateID(int i_currencyUpdateID) {
        this.i_currencyUpdateID = i_currencyUpdateID;
    }

    public Date getD_currencyUpdateDate() {
        return d_currencyUpdateDate;
    }

    public void setD_currencyUpdateDate(Date d_currencyUpdateDate) {
        this.d_currencyUpdateDate = d_currencyUpdateDate;
    }

    public String getS_currencyActive() {
        return s_currencyActive;
    }

    public void setS_currencyActive(String s_currencyActive) {
        this.s_currencyActive = s_currencyActive;
    }
}
