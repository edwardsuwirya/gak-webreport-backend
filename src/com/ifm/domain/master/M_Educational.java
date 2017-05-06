package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Educational implements java.io.Serializable {
    private String s_educationalCode;
    private String s_educationalName;
    private int i_educationalCreateID;
    private Date d_educationalCreateDate;
    private int i_educationalDeleteID;
    private Date d_educationalDeleteDate;
    private int i_educationalUpdateID;
    private Date d_educationalUpdateDate;
    private String s_educationalActive;


    public M_Educational() {
        // TODO Auto-generated constructor stub
    }

    public M_Educational(String s_educationalCode, String s_educationalName,
                         int i_educationalCreateID, Date d_educationalCreateDate,
                         int i_educationalDeleteID, Date d_educationalDeleteDate,
                         int i_educationalUpdateID, Date d_educationalUpdateDate,
                         String s_educationalActive) {
        this.s_educationalCode = s_educationalCode;
        this.s_educationalName = s_educationalName;
        this.i_educationalCreateID = i_educationalCreateID;
        this.d_educationalCreateDate = d_educationalCreateDate;
        this.i_educationalDeleteID = i_educationalDeleteID;
        this.d_educationalDeleteDate = d_educationalDeleteDate;
        this.i_educationalUpdateID = i_educationalUpdateID;
        this.d_educationalUpdateDate = d_educationalUpdateDate;
        this.s_educationalActive = s_educationalActive;

    }


    public String getS_educationalCode() {
        return s_educationalCode;
    }

    public void setS_educationalCode(String s_educationalCode) {
        this.s_educationalCode = s_educationalCode;
    }

    public String getS_educationalName() {
        return s_educationalName;
    }

    public void setS_educationalName(String s_educationalName) {
        this.s_educationalName = s_educationalName;
    }

    public int getI_educationalCreateID() {
        return i_educationalCreateID;
    }

    public void setI_educationalCreateID(int i_educationalCreateID) {
        this.i_educationalCreateID = i_educationalCreateID;
    }

    public Date getD_educationalCreateDate() {
        return d_educationalCreateDate;
    }

    public void setD_educationalCreateDate(Date d_educationalCreateDate) {
        this.d_educationalCreateDate = d_educationalCreateDate;
    }

    public int getI_educationalDeleteID() {
        return i_educationalDeleteID;
    }

    public void setI_educationalDeleteID(int i_educationalDeleteID) {
        this.i_educationalDeleteID = i_educationalDeleteID;
    }

    public Date getD_educationalDeleteDate() {
        return d_educationalDeleteDate;
    }

    public void setD_educationalDeleteDate(Date d_educationalDeleteDate) {
        this.d_educationalDeleteDate = d_educationalDeleteDate;
    }

    public int getI_educationalUpdateID() {
        return i_educationalUpdateID;
    }

    public void setI_educationalUpdateID(int i_educationalUpdateID) {
        this.i_educationalUpdateID = i_educationalUpdateID;
    }

    public Date getD_educationalUpdateDate() {
        return d_educationalUpdateDate;
    }

    public void setD_educationalUpdateDate(Date d_educationalUpdateDate) {
        this.d_educationalUpdateDate = d_educationalUpdateDate;
    }

    public String getS_educationalActive() {
        return s_educationalActive;
    }

    public void setS_educationalActive(String s_educationalActive) {
        this.s_educationalActive = s_educationalActive;
    }
}
