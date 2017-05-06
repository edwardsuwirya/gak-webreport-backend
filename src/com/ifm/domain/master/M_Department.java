package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Department implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_departmentCode;
    private String s_departmentRealCode;
    private M_Company company;
    private M_Division division;
    private String s_departmentName;
    private int i_departmentCreateID;
    private Date d_departmentCreateDate;
    private int i_departmentDeleteID;
    private Date d_departmentDeleteDate;
    private int i_departmentUpdateID;
    private Date d_departmentUpdateDate;
    private String s_departmentActive;

    public M_Department() {
    }

    public M_Department(String s_departmentCode, String s_departmentRealCode,
                        M_Company company, M_Division division, String s_departmentName,
                        int i_departmentCreateID, Date d_departmentCreateDate,
                        int i_departmentDeleteID, Date d_departmentDeleteDate,
                        int i_departmentUpdateID, Date d_departmentUpdateDate,
                        String s_departmentActive) {
        this.s_departmentCode = s_departmentCode;
        this.s_departmentRealCode = s_departmentRealCode;
        this.company = company;
        this.division = division;
        this.s_departmentName = s_departmentName;
        this.i_departmentCreateID = i_departmentCreateID;
        this.d_departmentCreateDate = d_departmentCreateDate;
        this.i_departmentDeleteID = i_departmentDeleteID;
        this.d_departmentDeleteDate = d_departmentDeleteDate;
        this.i_departmentUpdateID = i_departmentUpdateID;
        this.d_departmentUpdateDate = d_departmentUpdateDate;
        this.s_departmentActive = s_departmentActive;
    }

    public String getS_departmentCode() {
        return s_departmentCode;
    }

    public void setS_departmentCode(String s_departmentCode) {
        this.s_departmentCode = s_departmentCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Division getDivision() {
        return division;
    }

    public void setDivision(M_Division division) {
        this.division = division;
    }

    public String getS_departmentRealCode() {
        return s_departmentRealCode;
    }

    public void setS_departmentRealCode(String s_departmentRealCode) {
        this.s_departmentRealCode = s_departmentRealCode;
    }

    public String getS_departmentName() {
        return s_departmentName;
    }

    public void setS_departmentName(String s_departmentName) {
        this.s_departmentName = s_departmentName;
    }

    public int getI_departmentCreateID() {
        return i_departmentCreateID;
    }

    public void setI_departmentCreateID(int i_departmentCreateID) {
        this.i_departmentCreateID = i_departmentCreateID;
    }

    public Date getD_departmentCreateDate() {
        return d_departmentCreateDate;
    }

    public void setD_departmentCreateDate(Date d_departmentCreateDate) {
        this.d_departmentCreateDate = d_departmentCreateDate;
    }

    public int getI_departmentDeleteID() {
        return i_departmentDeleteID;
    }

    public void setI_departmentDeleteID(int i_departmentDeleteID) {
        this.i_departmentDeleteID = i_departmentDeleteID;
    }

    public Date getD_departmentDeleteDate() {
        return d_departmentDeleteDate;
    }

    public void setD_departmentDeleteDate(Date d_departmentDeleteDate) {
        this.d_departmentDeleteDate = d_departmentDeleteDate;
    }

    public int getI_departmentUpdateID() {
        return i_departmentUpdateID;
    }

    public void setI_departmentUpdateID(int i_departmentUpdateID) {
        this.i_departmentUpdateID = i_departmentUpdateID;
    }

    public Date getD_departmentUpdateDate() {
        return d_departmentUpdateDate;
    }

    public void setD_departmentUpdateDate(Date d_departmentUpdateDate) {
        this.d_departmentUpdateDate = d_departmentUpdateDate;
    }

    public String getS_departmentActive() {
        return s_departmentActive;
    }

    public void setS_departmentActive(String s_departmentActive) {
        this.s_departmentActive = s_departmentActive;
    }
}
