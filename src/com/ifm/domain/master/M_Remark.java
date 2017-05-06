package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Remark implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_remarkCode;
    private M_Company company;
    private String s_remarkRealCode;
    private String s_remarkName;
    private int i_remarkCreateID;
    private Date d_remarkCreateDate;
    private int i_remarkDeleteID;
    private Date d_remarkDeleteDate;
    private int i_remarkUpdateID;
    private Date d_remarkUpdateDate;
    private String s_remarkActive;

    public M_Remark() {
    }

    public String getS_remarkCode() {
        return s_remarkCode;
    }

    public void setS_remarkCode(String s_remarkCode) {
        this.s_remarkCode = s_remarkCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_remarkRealCode() {
        return s_remarkRealCode;
    }

    public void setS_remarkRealCode(String s_remarkRealCode) {
        this.s_remarkRealCode = s_remarkRealCode;
    }

    public String getS_remarkName() {
        return s_remarkName;
    }

    public void setS_remarkName(String s_remarkName) {
        this.s_remarkName = s_remarkName;
    }

    public int getI_remarkCreateID() {
        return i_remarkCreateID;
    }

    public void setI_remarkCreateID(int i_remarkCreateID) {
        this.i_remarkCreateID = i_remarkCreateID;
    }

    public Date getD_remarkCreateDate() {
        return d_remarkCreateDate;
    }

    public void setD_remarkCreateDate(Date d_remarkCreateDate) {
        this.d_remarkCreateDate = d_remarkCreateDate;
    }

    public int getI_remarkDeleteID() {
        return i_remarkDeleteID;
    }

    public void setI_remarkDeleteID(int i_remarkDeleteID) {
        this.i_remarkDeleteID = i_remarkDeleteID;
    }

    public Date getD_remarkDeleteDate() {
        return d_remarkDeleteDate;
    }

    public void setD_remarkDeleteDate(Date d_remarkDeleteDate) {
        this.d_remarkDeleteDate = d_remarkDeleteDate;
    }

    public int getI_remarkUpdateID() {
        return i_remarkUpdateID;
    }

    public void setI_remarkUpdateID(int i_remarkUpdateID) {
        this.i_remarkUpdateID = i_remarkUpdateID;
    }

    public Date getD_remarkUpdateDate() {
        return d_remarkUpdateDate;
    }

    public void setD_remarkUpdateDate(Date d_remarkUpdateDate) {
        this.d_remarkUpdateDate = d_remarkUpdateDate;
    }

    public String getS_remarkActive() {
        return s_remarkActive;
    }

    public void setS_remarkActive(String s_remarkActive) {
        this.s_remarkActive = s_remarkActive;
    }
}
