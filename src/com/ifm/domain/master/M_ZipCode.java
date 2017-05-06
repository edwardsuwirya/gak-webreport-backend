package com.ifm.domain.master;
/**
 * @author Oncom
 */


import java.util.Date;


public class M_ZipCode implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_zipCodeCode;
    private M_City city;
    private String s_zipCodeDistrict;
    private String s_zipCodeSubDistrict;
    private int i_zipCodeCreateID;
    private Date d_zipCodeCreateDate;
    private int i_zipCodeDeleteID;
    private Date d_zipCodeDeleteDate;
    private int i_zipCodeUpdateID;
    private Date d_zipCodeUpdateDate;
    private String s_zipCodeActive;

    public M_ZipCode() {
    }

    public M_ZipCode(String s_zipCodeCode, M_City city,
                     String s_zipCodeDistrict, String s_zipCodeSubDistrict,
                     int i_zipCodeCreateID, Date d_zipCodeCreateDate,
                     int i_zipCodeDeleteID, Date d_zipCodeDeleteDate,
                     int i_zipCodeUpdateID, Date d_zipCodeUpdateDate,
                     String s_zipCodeActive) {
        this.s_zipCodeCode = s_zipCodeCode;
        this.city = city;
        this.s_zipCodeDistrict = s_zipCodeDistrict;
        this.s_zipCodeSubDistrict = s_zipCodeSubDistrict;
        this.i_zipCodeCreateID = i_zipCodeCreateID;
        this.d_zipCodeCreateDate = d_zipCodeCreateDate;
        this.i_zipCodeDeleteID = i_zipCodeDeleteID;
        this.d_zipCodeDeleteDate = d_zipCodeDeleteDate;
        this.i_zipCodeUpdateID = i_zipCodeUpdateID;
        this.d_zipCodeUpdateDate = d_zipCodeUpdateDate;
        this.s_zipCodeActive = s_zipCodeActive;
    }

    public String getS_zipCodeCode() {
        return s_zipCodeCode;
    }

    public void setS_zipCodeCode(String s_zipCodeCode) {
        this.s_zipCodeCode = s_zipCodeCode;
    }

    public M_City getCity() {
        return city;
    }

    public void setCity(M_City city) {
        this.city = city;
    }

    public String getS_zipCodeDistrict() {
        return s_zipCodeDistrict;
    }

    public void setS_zipCodeDistrict(String s_zipCodeDistrict) {
        this.s_zipCodeDistrict = s_zipCodeDistrict;
    }

    public String getS_zipCodeSubDistrict() {
        return s_zipCodeSubDistrict;
    }

    public void setS_zipCodeSubDistrict(String s_zipCodeSubDistrict) {
        this.s_zipCodeSubDistrict = s_zipCodeSubDistrict;
    }

    public int getI_zipCodeCreateID() {
        return i_zipCodeCreateID;
    }

    public void setI_zipCodeCreateID(int i_zipCodeCreateID) {
        this.i_zipCodeCreateID = i_zipCodeCreateID;
    }

    public Date getD_zipCodeCreateDate() {
        return d_zipCodeCreateDate;
    }

    public void setD_zipCodeCreateDate(Date d_zipCodeCreateDate) {
        this.d_zipCodeCreateDate = d_zipCodeCreateDate;
    }

    public int getI_zipCodeDeleteID() {
        return i_zipCodeDeleteID;
    }

    public void setI_zipCodeDeleteID(int i_zipCodeDeleteID) {
        this.i_zipCodeDeleteID = i_zipCodeDeleteID;
    }

    public Date getD_zipCodeDeleteDate() {
        return d_zipCodeDeleteDate;
    }

    public void setD_zipCodeDeleteDate(Date d_zipCodeDeleteDate) {
        this.d_zipCodeDeleteDate = d_zipCodeDeleteDate;
    }

    public int getI_zipCodeUpdateID() {
        return i_zipCodeUpdateID;
    }

    public void setI_zipCodeUpdateID(int i_zipCodeUpdateID) {
        this.i_zipCodeUpdateID = i_zipCodeUpdateID;
    }

    public Date getD_zipCodeUpdateDate() {
        return d_zipCodeUpdateDate;
    }

    public void setD_zipCodeUpdateDate(Date d_zipCodeUpdateDate) {
        this.d_zipCodeUpdateDate = d_zipCodeUpdateDate;
    }

    public String getS_zipCodeActive() {
        return s_zipCodeActive;
    }

    public void setS_zipCodeActive(String s_zipCodeActive) {
        this.s_zipCodeActive = s_zipCodeActive;
    }
}
