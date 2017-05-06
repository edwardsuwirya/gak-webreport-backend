package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_RackLevel implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_rackLevelCode;
    private M_Company company;
    private String s_rackLevelRealCode;
    private String s_rackLevelName;
    private int i_rackLevelCreateID;
    private Date d_rackLevelCreateDate;
    private int i_rackLevelDeleteID;
    private Date d_rackLevelDeleteDate;
    private int i_rackLevelUpdateID;
    private Date d_rackLevelUpdateDate;
    private String s_rackLevelActive;

    public M_RackLevel() {
    }

    public String getS_rackLevelCode() {
        return s_rackLevelCode;
    }

    public void setS_rackLevelCode(String s_rackLevelCode) {
        this.s_rackLevelCode = s_rackLevelCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_rackLevelRealCode() {
        return s_rackLevelRealCode;
    }

    public void setS_rackLevelRealCode(String s_rackLevelRealCode) {
        this.s_rackLevelRealCode = s_rackLevelRealCode;
    }

    public String getS_rackLevelName() {
        return s_rackLevelName;
    }

    public void setS_rackLevelName(String s_rackLevelName) {
        this.s_rackLevelName = s_rackLevelName;
    }

    public int getI_rackLevelCreateID() {
        return i_rackLevelCreateID;
    }

    public void setI_rackLevelCreateID(int i_rackLevelCreateID) {
        this.i_rackLevelCreateID = i_rackLevelCreateID;
    }

    public Date getD_rackLevelCreateDate() {
        return d_rackLevelCreateDate;
    }

    public void setD_rackLevelCreateDate(Date d_rackLevelCreateDate) {
        this.d_rackLevelCreateDate = d_rackLevelCreateDate;
    }

    public int getI_rackLevelDeleteID() {
        return i_rackLevelDeleteID;
    }

    public void setI_rackLevelDeleteID(int i_rackLevelDeleteID) {
        this.i_rackLevelDeleteID = i_rackLevelDeleteID;
    }

    public Date getD_rackLevelDeleteDate() {
        return d_rackLevelDeleteDate;
    }

    public void setD_rackLevelDeleteDate(Date d_rackLevelDeleteDate) {
        this.d_rackLevelDeleteDate = d_rackLevelDeleteDate;
    }

    public int getI_rackLevelUpdateID() {
        return i_rackLevelUpdateID;
    }

    public void setI_rackLevelUpdateID(int i_rackLevelUpdateID) {
        this.i_rackLevelUpdateID = i_rackLevelUpdateID;
    }

    public Date getD_rackLevelUpdateDate() {
        return d_rackLevelUpdateDate;
    }

    public void setD_rackLevelUpdateDate(Date d_rackLevelUpdateDate) {
        this.d_rackLevelUpdateDate = d_rackLevelUpdateDate;
    }

    public String getS_rackLevelActive() {
        return s_rackLevelActive;
    }

    public void setS_rackLevelActive(String s_rackLevelActive) {
        this.s_rackLevelActive = s_rackLevelActive;
    }
}
