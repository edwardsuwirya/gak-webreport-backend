package com.ifm.domain.master;
/**
 * @author Oncom
 */

import java.util.Date;

public class M_City implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_cityCode;
    private M_Province province;
    private String s_cityName;
    private String s_cityAreaCode;
    private int i_cityCreateID;
    private Date d_cityCreateDate;
    private int i_cityDeleteID;
    private Date d_cityDeleteDate;
    private int i_cityUpdateID;
    private Date d_cityUpdateDate;
    private String s_cityActive;

    public M_City() {
    }

    public M_City(String s_cityCode, M_Country country,
                  String s_cityName, String s_cityAreaCode,
                  int i_cityCreateID, Date d_cityCreateDate,
                  int i_cityDeleteID, Date d_cityDeleteDate,
                  int i_cityUpdateID, Date d_cityUpdateDate,
                  String s_cityActive) {
        this.s_cityCode = s_cityCode;
        this.province = province;
        this.s_cityName = s_cityName;
        this.s_cityAreaCode = s_cityAreaCode;
        this.i_cityCreateID = i_cityCreateID;
        this.d_cityCreateDate = d_cityCreateDate;
        this.i_cityDeleteID = i_cityDeleteID;
        this.d_cityDeleteDate = d_cityDeleteDate;
        this.i_cityUpdateID = i_cityUpdateID;
        this.d_cityUpdateDate = d_cityUpdateDate;
        this.s_cityActive = s_cityActive;
    }

    public String getS_cityCode() {
        return s_cityCode;
    }

    public void setS_cityCode(String s_cityCode) {
        this.s_cityCode = s_cityCode;
    }

    public M_Province getProvince() {
        return province;
    }

    public void setProvince(M_Province province) {
        this.province = province;
    }

    public String getS_cityName() {
        return s_cityName;
    }

    public void setS_cityName(String s_cityName) {
        this.s_cityName = s_cityName;
    }

    public String getS_cityAreaCode() {
        return s_cityAreaCode;
    }

    public void setS_cityAreaCode(String s_cityAreaCode) {
        this.s_cityAreaCode = s_cityAreaCode;
    }

    public int getI_cityCreateID() {
        return i_cityCreateID;
    }

    public void setI_cityCreateID(int i_cityCreateID) {
        this.i_cityCreateID = i_cityCreateID;
    }

    public Date getD_cityCreateDate() {
        return d_cityCreateDate;
    }

    public void setD_cityCreateDate(Date d_cityCreateDate) {
        this.d_cityCreateDate = d_cityCreateDate;
    }

    public int getI_cityDeleteID() {
        return i_cityDeleteID;
    }

    public void setI_cityDeleteID(int i_cityDeleteID) {
        this.i_cityDeleteID = i_cityDeleteID;
    }

    public Date getD_cityDeleteDate() {
        return d_cityDeleteDate;
    }

    public void setD_cityDeleteDate(Date d_cityDeleteDate) {
        this.d_cityDeleteDate = d_cityDeleteDate;
    }

    public int getI_cityUpdateID() {
        return i_cityUpdateID;
    }

    public void setI_cityUpdateID(int i_cityUpdateID) {
        this.i_cityUpdateID = i_cityUpdateID;
    }

    public Date getD_cityUpdateDate() {
        return d_cityUpdateDate;
    }

    public void setD_cityUpdateDate(Date d_cityUpdateDate) {
        this.d_cityUpdateDate = d_cityUpdateDate;
    }

    public String getS_cityActive() {
        return s_cityActive;
    }

    public void setS_cityActive(String s_cityActive) {
        this.s_cityActive = s_cityActive;
    }
}
