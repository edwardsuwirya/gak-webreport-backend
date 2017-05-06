package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Country implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    //column declaration
    private String s_countryCode;
    private String s_countryName;
    private String s_countryAreaCode;
    private int i_countryCreateID;
    private Date d_countryCreateDate;
    private int i_countryDeleteID;
    private Date d_countryDeleteDate;
    private int i_countryUpdateID;
    private Date d_countryUpdateDate;
    private String s_countryActive;

    public M_Country() {
    }

    public M_Country(String s_countryCode, String s_countryName,
                     String s_countryAreaCode,
                     int i_countryCreateID, Date d_countryCreateDate,
                     int i_countryDeleteID, Date d_countryDeleteDate,
                     int i_countryUpdateID, Date d_countryUpdateDate,
                     String s_countryActive) {
        this.s_countryCode = s_countryCode;
        this.s_countryName = s_countryName;
        this.s_countryAreaCode = s_countryAreaCode;
        this.i_countryCreateID = i_countryCreateID;
        this.d_countryCreateDate = d_countryCreateDate;
        this.i_countryDeleteID = i_countryDeleteID;
        this.d_countryDeleteDate = d_countryDeleteDate;
        this.i_countryUpdateID = i_countryUpdateID;
        this.d_countryUpdateDate = d_countryUpdateDate;
        this.s_countryActive = s_countryActive;
    }

    //getter and setter
    public String getS_countryCode() {
        return s_countryCode;
    }

    public void setS_countryCode(String s_countryCode) {
        this.s_countryCode = s_countryCode;
    }

    public String getS_countryName() {
        return s_countryName;
    }

    public void setS_countryName(String s_countryName) {
        this.s_countryName = s_countryName;
    }

    public String getS_countryAreaCode() {
        return s_countryAreaCode;
    }

    public void setS_countryAreaCode(String s_countryAreaCode) {
        this.s_countryAreaCode = s_countryAreaCode;
    }

    public int getI_countryCreateID() {
        return i_countryCreateID;
    }

    public void setI_countryCreateID(int i_countryCreateID) {
        this.i_countryCreateID = i_countryCreateID;
    }

    public Date getD_countryCreateDate() {
        return d_countryCreateDate;
    }

    public void setD_countryCreateDate(Date d_countryCreateDate) {
        this.d_countryCreateDate = d_countryCreateDate;
    }

    public int getI_countryDeleteID() {
        return i_countryDeleteID;
    }

    public void setI_countryDeleteID(int i_countryDeleteID) {
        this.i_countryDeleteID = i_countryDeleteID;
    }

    public Date getD_countryDeleteDate() {
        return d_countryDeleteDate;
    }

    public void setD_countryDeleteDate(Date d_countryDeleteDate) {
        this.d_countryDeleteDate = d_countryDeleteDate;
    }

    public int getI_countryUpdateID() {
        return i_countryUpdateID;
    }

    public void setI_countryUpdateID(int i_countryUpdateID) {
        this.i_countryUpdateID = i_countryUpdateID;
    }

    public Date getD_countryUpdateDate() {
        return d_countryUpdateDate;
    }

    public void setD_countryUpdateDate(Date d_countryUpdateDate) {
        this.d_countryUpdateDate = d_countryUpdateDate;
    }

    public String getS_countryActive() {
        return s_countryActive;
    }

    public void setS_countryActive(String s_countryActive) {
        this.s_countryActive = s_countryActive;
    }
}
