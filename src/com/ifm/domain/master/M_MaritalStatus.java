package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_MaritalStatus implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_maritalStatusCode;
    private String s_maritalStatusName;
    private int i_maritalStatusCreateID;
    private Date d_maritalStatusCreateDate;
    private int i_maritalStatusDeleteID;
    private Date d_maritalStatusDeleteDate;
    private int i_maritalStatusUpdateID;
    private Date d_maritalStatusUpdateDate;
    private String s_maritalStatusActive;

    public M_MaritalStatus(String s_maritalStatusCode, String s_maritalStatusName,
                           int i_maritalStatusCreateID, Date d_maritalStatusCreateDate,
                           int i_maritalStatusDeleteID, Date d_maritalStatusDeleteDate,
                           int i_maritalStatusUpdateID, Date d_maritalStatusUpdateDate,
                           String s_maritalStatusActive) {
        this.s_maritalStatusCode = s_maritalStatusCode;
        this.s_maritalStatusName = s_maritalStatusName;
        this.i_maritalStatusCreateID = i_maritalStatusCreateID;
        this.d_maritalStatusCreateDate = d_maritalStatusCreateDate;
        this.i_maritalStatusDeleteID = i_maritalStatusDeleteID;
        this.d_maritalStatusDeleteDate = d_maritalStatusDeleteDate;
        this.i_maritalStatusUpdateID = i_maritalStatusUpdateID;
        this.d_maritalStatusUpdateDate = d_maritalStatusUpdateDate;
        this.s_maritalStatusActive = s_maritalStatusActive;
    }

    public M_MaritalStatus() {
    }

    public String getS_maritalStatusCode() {
        return s_maritalStatusCode;
    }

    public void setS_maritalStatusCode(String s_maritalStatusCode) {
        this.s_maritalStatusCode = s_maritalStatusCode;
    }

    public String getS_maritalStatusName() {
        return s_maritalStatusName;
    }

    public void setS_maritalStatusName(String s_maritalStatusName) {
        this.s_maritalStatusName = s_maritalStatusName;
    }

    public int getI_maritalStatusCreateID() {
        return i_maritalStatusCreateID;
    }

    public void setI_maritalStatusCreateID(int i_maritalStatusCreateID) {
        this.i_maritalStatusCreateID = i_maritalStatusCreateID;
    }

    public Date getD_maritalStatusCreateDate() {
        return d_maritalStatusCreateDate;
    }

    public void setD_maritalStatusCreateDate(Date d_maritalStatusCreateDate) {
        this.d_maritalStatusCreateDate = d_maritalStatusCreateDate;
    }

    public int getI_maritalStatusDeleteID() {
        return i_maritalStatusDeleteID;
    }

    public void setI_maritalStatusDeleteID(int i_maritalStatusDeleteID) {
        this.i_maritalStatusDeleteID = i_maritalStatusDeleteID;
    }

    public Date getD_maritalStatusDeleteDate() {
        return d_maritalStatusDeleteDate;
    }

    public void setD_maritalStatusDeleteDate(Date d_maritalStatusDeleteDate) {
        this.d_maritalStatusDeleteDate = d_maritalStatusDeleteDate;
    }

    public int getI_maritalStatusUpdateID() {
        return i_maritalStatusUpdateID;
    }

    public void setI_maritalStatusUpdateID(int i_maritalStatusUpdateID) {
        this.i_maritalStatusUpdateID = i_maritalStatusUpdateID;
    }

    public Date getD_maritalStatusUpdateDate() {
        return d_maritalStatusUpdateDate;
    }

    public void setD_maritalStatusUpdateDate(Date d_maritalStatusUpdateDate) {
        this.d_maritalStatusUpdateDate = d_maritalStatusUpdateDate;
    }

    public String getS_maritalStatusActive() {
        return s_maritalStatusActive;
    }

    public void setS_maritalStatusActive(String s_maritalStatusActive) {
        this.s_maritalStatusActive = s_maritalStatusActive;
    }
}
