package com.ifm.domain.security;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Company;

import java.util.Date;
import java.util.Set;

public class M_UserLevel implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_userLevelID;
    private M_Company company;
    private String s_userLevelName;
    private int i_userLevelCreateID;
    private Date d_userLevelCreateDate;
    private int i_userLevelDeleteID;
    private Date d_userLevelDeleteDate;
    private int i_userLevelUpdateID;
    private Date d_userLevelUpdateDate;
    private String s_userLevelActive;
    private Set moduls;

    public M_UserLevel() {
    }

    public M_UserLevel(int i_userLevelID, M_Company company,
                       String s_userLevelName,
                       int i_userLevelCreateID, Date d_userLevelCreateDate,
                       int i_userLevelDeleteID, Date d_userLevelDeleteDate,
                       int i_userLevelUpdateID, Date d_userLevelUpdateDate,
                       String s_userLevelActive) {
        this.i_userLevelID = i_userLevelID;
        this.company = company;
        this.s_userLevelName = s_userLevelName;
        this.i_userLevelCreateID = i_userLevelCreateID;
        this.d_userLevelCreateDate = d_userLevelCreateDate;
        this.i_userLevelDeleteID = i_userLevelDeleteID;
        this.d_userLevelDeleteDate = d_userLevelDeleteDate;
        this.i_userLevelUpdateID = i_userLevelUpdateID;
        this.d_userLevelUpdateDate = d_userLevelUpdateDate;
        this.s_userLevelActive = s_userLevelActive;
    }

    //Getter and Setter
    public int getI_userLevelID() {
        return i_userLevelID;
    }

    public void setI_userLevelID(int i_userLevelID) {
        this.i_userLevelID = i_userLevelID;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_userLevelName() {
        return s_userLevelName;
    }

    public void setS_userLevelName(String s_userLevelName) {
        this.s_userLevelName = s_userLevelName;
    }

    public int getI_userLevelCreateID() {
        return i_userLevelCreateID;
    }

    public void setI_userLevelCreateID(int i_userLevelCreateID) {
        this.i_userLevelCreateID = i_userLevelCreateID;
    }

    public Date getD_userLevelCreateDate() {
        return d_userLevelCreateDate;
    }

    public void setD_userLevelCreateDate(Date d_userLevelCreateDate) {
        this.d_userLevelCreateDate = d_userLevelCreateDate;
    }

    public int getI_userLevelDeleteID() {
        return i_userLevelDeleteID;
    }

    public void setI_userLevelDeleteID(int i_userLevelDeleteID) {
        this.i_userLevelDeleteID = i_userLevelDeleteID;
    }

    public Date getD_userLevelDeleteDate() {
        return d_userLevelDeleteDate;
    }

    public void setD_userLevelDeleteDate(Date d_userLevelDeleteDate) {
        this.d_userLevelDeleteDate = d_userLevelDeleteDate;
    }

    public int getI_userLevelUpdateID() {
        return i_userLevelUpdateID;
    }

    public void setI_userLevelUpdateID(int i_userLevelUpdateID) {
        this.i_userLevelUpdateID = i_userLevelUpdateID;
    }

    public Date getD_userLevelUpdateDate() {
        return d_userLevelUpdateDate;
    }

    public void setD_userLevelUpdateDate(Date d_userLevelUpdateDate) {
        this.d_userLevelUpdateDate = d_userLevelUpdateDate;
    }

    public String getS_userLevelActive() {
        return s_userLevelActive;
    }

    public void setS_userLevelActive(String s_userLevelActive) {
        this.s_userLevelActive = s_userLevelActive;
    }

    public Set getModuls() {
        return moduls;
    }

    public void setModuls(Set moduls) {
        this.moduls = moduls;
    }
}
