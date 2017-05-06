package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Edc implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_edcCode;
    private M_Company company;
    private String s_edcRealCode;
    private String s_edcName;
    private int i_edcCreateID;
    private Date d_edcCreateDate;
    private int i_edcDeleteID;
    private Date d_edcDeleteDate;
    private int i_edcUpdateID;
    private Date d_edcUpdateDate;
    private String s_edcActive;

    public M_Edc() {
    }

    public String getS_edcCode() {
        return s_edcCode;
    }

    public void setS_edcCode(String s_edcCode) {
        this.s_edcCode = s_edcCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_edcRealCode() {
        return s_edcRealCode;
    }

    public void setS_edcRealCode(String s_edcRealCode) {
        this.s_edcRealCode = s_edcRealCode;
    }

    public String getS_edcName() {
        return s_edcName;
    }

    public void setS_edcName(String s_edcName) {
        this.s_edcName = s_edcName;
    }

    public int getI_edcCreateID() {
        return i_edcCreateID;
    }

    public void setI_edcCreateID(int i_edcCreateID) {
        this.i_edcCreateID = i_edcCreateID;
    }

    public Date getD_edcCreateDate() {
        return d_edcCreateDate;
    }

    public void setD_edcCreateDate(Date d_edcCreateDate) {
        this.d_edcCreateDate = d_edcCreateDate;
    }

    public int getI_edcDeleteID() {
        return i_edcDeleteID;
    }

    public void setI_edcDeleteID(int i_edcDeleteID) {
        this.i_edcDeleteID = i_edcDeleteID;
    }

    public Date getD_edcDeleteDate() {
        return d_edcDeleteDate;
    }

    public void setD_edcDeleteDate(Date d_edcDeleteDate) {
        this.d_edcDeleteDate = d_edcDeleteDate;
    }

    public int getI_edcUpdateID() {
        return i_edcUpdateID;
    }

    public void setI_edcUpdateID(int i_edcUpdateID) {
        this.i_edcUpdateID = i_edcUpdateID;
    }

    public Date getD_edcUpdateDate() {
        return d_edcUpdateDate;
    }

    public void setD_edcUpdateDate(Date d_edcUpdateDate) {
        this.d_edcUpdateDate = d_edcUpdateDate;
    }

    public String getS_edcActive() {
        return s_edcActive;
    }

    public void setS_edcActive(String s_edcActive) {
        this.s_edcActive = s_edcActive;
    }
}
