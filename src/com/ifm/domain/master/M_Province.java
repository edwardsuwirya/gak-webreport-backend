package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Province implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_provinceCode;
    private M_Country country;
    private String s_provinceName;
    private String s_provinceAreaCode;
    private int i_provinceCreateID;
    private Date d_provinceCreateDate;
    private int i_provinceDeleteID;
    private Date d_provinceDeleteDate;
    private int i_provinceUpdateID;
    private Date d_provinceUpdateDate;
    private String s_provinceActive;

    public M_Province() {
    }

    public M_Province(String s_provinceCode, M_Country country,
                      String s_provinceName, String s_provinceAreaCode,
                      int i_provinceCreateID, Date d_provinceCreateDate,
                      int i_provinceDeleteID, Date d_provinceDeleteDate,
                      int i_provinceUpdateID, Date d_provinceUpdateDate,
                      String s_provinceActive) {
        this.s_provinceCode = s_provinceCode;
        this.country = country;
        this.s_provinceName = s_provinceName;
        this.s_provinceAreaCode = s_provinceAreaCode;
        this.i_provinceCreateID = i_provinceCreateID;
        this.d_provinceCreateDate = d_provinceCreateDate;
        this.i_provinceDeleteID = i_provinceDeleteID;
        this.d_provinceDeleteDate = d_provinceDeleteDate;
        this.i_provinceUpdateID = i_provinceUpdateID;
        this.d_provinceUpdateDate = d_provinceUpdateDate;
        this.s_provinceActive = s_provinceActive;
    }

    //getter and setter
    public String getS_provinceCode() {
        return s_provinceCode;
    }

    public void setS_provinceCode(String s_provinceCode) {
        this.s_provinceCode = s_provinceCode;
    }

    public M_Country getCountry() {
        return country;
    }

    public void setCountry(M_Country country) {
        this.country = country;
    }

    public String getS_provinceName() {
        return s_provinceName;
    }

    public void setS_provinceName(String s_provinceName) {
        this.s_provinceName = s_provinceName;
    }

    public String getS_provinceAreaCode() {
        return s_provinceAreaCode;
    }

    public void setS_provinceAreaCode(String s_provinceAreaCode) {
        this.s_provinceAreaCode = s_provinceAreaCode;
    }

    public int getI_provinceCreateID() {
        return i_provinceCreateID;
    }

    public void setI_provinceCreateID(int i_provinceCreateID) {
        this.i_provinceCreateID = i_provinceCreateID;
    }

    public Date getD_provinceCreateDate() {
        return d_provinceCreateDate;
    }

    public void setD_provinceCreateDate(Date d_provinceCreateDate) {
        this.d_provinceCreateDate = d_provinceCreateDate;
    }

    public int getI_provinceDeleteID() {
        return i_provinceDeleteID;
    }

    public void setI_provinceDeleteID(int i_provinceDeleteID) {
        this.i_provinceDeleteID = i_provinceDeleteID;
    }

    public Date getD_provinceDeleteDate() {
        return d_provinceDeleteDate;
    }

    public void setD_provinceDeleteDate(Date d_provinceDeleteDate) {
        this.d_provinceDeleteDate = d_provinceDeleteDate;
    }

    public int getI_provinceUpdateID() {
        return i_provinceUpdateID;
    }

    public void setI_provinceUpdateID(int i_provinceUpdateID) {
        this.i_provinceUpdateID = i_provinceUpdateID;
    }

    public Date getD_provinceUpdateDate() {
        return d_provinceUpdateDate;
    }

    public void setD_provinceUpdateDate(Date d_provinceUpdateDate) {
        this.d_provinceUpdateDate = d_provinceUpdateDate;
    }

    public String getS_provinceActive() {
        return s_provinceActive;
    }

    public void setS_provinceActive(String s_provinceActive) {
        this.s_provinceActive = s_provinceActive;
    }
}
