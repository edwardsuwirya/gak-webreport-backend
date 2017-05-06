package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_ArticleDepartment implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_articleDepartmentCode;
    private M_Company company;
    private String s_articleDepartmentRealCode;
    private String s_articleDepartmentName;
    private int i_articleDepartmentCreateID;
    private Date d_articleDepartmentCreateDate;
    private int i_articleDepartmentDeleteID;
    private Date d_articleDepartmentDeleteDate;
    private int i_articleDepartmentUpdateID;
    private Date d_articleDepartmentUpdateDate;
    private String s_articleDepartmentActive;

    public M_ArticleDepartment() {
    }

    public String getS_articleDepartmentCode() {
        return s_articleDepartmentCode;
    }

    public void setS_articleDepartmentCode(String s_articleDepartmentCode) {
        this.s_articleDepartmentCode = s_articleDepartmentCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_articleDepartmentRealCode() {
        return s_articleDepartmentRealCode;
    }

    public void setS_articleDepartmentRealCode(String s_articleDepartmentRealCode) {
        this.s_articleDepartmentRealCode = s_articleDepartmentRealCode;
    }

    public String getS_articleDepartmentName() {
        return s_articleDepartmentName;
    }

    public void setS_articleDepartmentName(String s_articleDepartmentName) {
        this.s_articleDepartmentName = s_articleDepartmentName;
    }

    public int getI_articleDepartmentCreateID() {
        return i_articleDepartmentCreateID;
    }

    public void setI_articleDepartmentCreateID(int i_articleDepartmentCreateID) {
        this.i_articleDepartmentCreateID = i_articleDepartmentCreateID;
    }

    public Date getD_articleDepartmentCreateDate() {
        return d_articleDepartmentCreateDate;
    }

    public void setD_articleDepartmentCreateDate(Date d_articleDepartmentCreateDate) {
        this.d_articleDepartmentCreateDate = d_articleDepartmentCreateDate;
    }

    public int getI_articleDepartmentDeleteID() {
        return i_articleDepartmentDeleteID;
    }

    public void setI_articleDepartmentDeleteID(int i_articleDepartmentDeleteID) {
        this.i_articleDepartmentDeleteID = i_articleDepartmentDeleteID;
    }

    public Date getD_articleDepartmentDeleteDate() {
        return d_articleDepartmentDeleteDate;
    }

    public void setD_articleDepartmentDeleteDate(Date d_articleDepartmentDeleteDate) {
        this.d_articleDepartmentDeleteDate = d_articleDepartmentDeleteDate;
    }

    public int getI_articleDepartmentUpdateID() {
        return i_articleDepartmentUpdateID;
    }

    public void setI_articleDepartmentUpdateID(int i_articleDepartmentUpdateID) {
        this.i_articleDepartmentUpdateID = i_articleDepartmentUpdateID;
    }

    public Date getD_articleDepartmentUpdateDate() {
        return d_articleDepartmentUpdateDate;
    }

    public void setD_articleDepartmentUpdateDate(Date d_articleDepartmentUpdateDate) {
        this.d_articleDepartmentUpdateDate = d_articleDepartmentUpdateDate;
    }

    public String getS_articleDepartmentActive() {
        return s_articleDepartmentActive;
    }

    public void setS_articleDepartmentActive(String s_articleDepartmentActive) {
        this.s_articleDepartmentActive = s_articleDepartmentActive;
    }
}
