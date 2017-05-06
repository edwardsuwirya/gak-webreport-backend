package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Coating implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_coatingCode;
    private M_Company company;
    private String s_coatingRealCode;
    private String s_coatingName;
    private int i_coatingCreateID;
    private Date d_coatingCreateDate;
    private int i_coatingDeleteID;
    private Date d_coatingDeleteDate;
    private int i_coatingUpdateID;
    private Date d_coatingUpdateDate;
    private String s_coatingActive;

    public M_Coating() {
    }

    public String getS_coatingCode() {
        return s_coatingCode;
    }

    public void setS_coatingCode(String s_coatingCode) {
        this.s_coatingCode = s_coatingCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_coatingRealCode() {
        return s_coatingRealCode;
    }

    public void setS_coatingRealCode(String s_coatingRealCode) {
        this.s_coatingRealCode = s_coatingRealCode;
    }

    public String getS_coatingName() {
        return s_coatingName;
    }

    public void setS_coatingName(String s_coatingName) {
        this.s_coatingName = s_coatingName;
    }

    public int getI_coatingCreateID() {
        return i_coatingCreateID;
    }

    public void setI_coatingCreateID(int i_coatingCreateID) {
        this.i_coatingCreateID = i_coatingCreateID;
    }

    public Date getD_coatingCreateDate() {
        return d_coatingCreateDate;
    }

    public void setD_coatingCreateDate(Date d_coatingCreateDate) {
        this.d_coatingCreateDate = d_coatingCreateDate;
    }

    public int getI_coatingDeleteID() {
        return i_coatingDeleteID;
    }

    public void setI_coatingDeleteID(int i_coatingDeleteID) {
        this.i_coatingDeleteID = i_coatingDeleteID;
    }

    public Date getD_coatingDeleteDate() {
        return d_coatingDeleteDate;
    }

    public void setD_coatingDeleteDate(Date d_coatingDeleteDate) {
        this.d_coatingDeleteDate = d_coatingDeleteDate;
    }

    public int getI_coatingUpdateID() {
        return i_coatingUpdateID;
    }

    public void setI_coatingUpdateID(int i_coatingUpdateID) {
        this.i_coatingUpdateID = i_coatingUpdateID;
    }

    public Date getD_coatingUpdateDate() {
        return d_coatingUpdateDate;
    }

    public void setD_coatingUpdateDate(Date d_coatingUpdateDate) {
        this.d_coatingUpdateDate = d_coatingUpdateDate;
    }

    public String getS_coatingActive() {
        return s_coatingActive;
    }

    public void setS_coatingActive(String s_coatingActive) {
        this.s_coatingActive = s_coatingActive;
    }
}
