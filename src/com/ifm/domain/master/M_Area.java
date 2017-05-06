package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Area implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_areaCode;
    private M_Company company;
    private String s_areaRealCode;
    private String s_areaName;
    private int i_areaCreateID;
    private Date d_areaCreateDate;
    private int i_areaDeleteID;
    private Date d_areaDeleteDate;
    private int i_areaUpdateID;
    private Date d_areaUpdateDate;
    private String s_areaActive;

    public M_Area() {
    }

    public String getS_areaCode() {
        return s_areaCode;
    }

    public void setS_areaCode(String s_areaCode) {
        this.s_areaCode = s_areaCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_areaRealCode() {
        return s_areaRealCode;
    }

    public void setS_areaRealCode(String s_areaRealCode) {
        this.s_areaRealCode = s_areaRealCode;
    }

    public String getS_areaName() {
        return s_areaName;
    }

    public void setS_areaName(String s_areaName) {
        this.s_areaName = s_areaName;
    }

    public int getI_areaCreateID() {
        return i_areaCreateID;
    }

    public void setI_areaCreateID(int i_areaCreateID) {
        this.i_areaCreateID = i_areaCreateID;
    }

    public Date getD_areaCreateDate() {
        return d_areaCreateDate;
    }

    public void setD_areaCreateDate(Date d_areaCreateDate) {
        this.d_areaCreateDate = d_areaCreateDate;
    }

    public int getI_areaDeleteID() {
        return i_areaDeleteID;
    }

    public void setI_areaDeleteID(int i_areaDeleteID) {
        this.i_areaDeleteID = i_areaDeleteID;
    }

    public Date getD_areaDeleteDate() {
        return d_areaDeleteDate;
    }

    public void setD_areaDeleteDate(Date d_areaDeleteDate) {
        this.d_areaDeleteDate = d_areaDeleteDate;
    }

    public int getI_areaUpdateID() {
        return i_areaUpdateID;
    }

    public void setI_areaUpdateID(int i_areaUpdateID) {
        this.i_areaUpdateID = i_areaUpdateID;
    }

    public Date getD_areaUpdateDate() {
        return d_areaUpdateDate;
    }

    public void setD_areaUpdateDate(Date d_areaUpdateDate) {
        this.d_areaUpdateDate = d_areaUpdateDate;
    }

    public String getS_areaActive() {
        return s_areaActive;
    }

    public void setS_areaActive(String s_areaActive) {
        this.s_areaActive = s_areaActive;
    }
}
