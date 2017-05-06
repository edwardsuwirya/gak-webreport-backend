package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Section implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_sectionCode;
    private M_Company company;
    private M_Department department;
    private String s_sectionRealCode;
    private String s_sectionName;
    private int i_sectionCreateID;
    private Date d_sectionCreateDate;
    private int i_sectionDeleteID;
    private Date d_sectionDeleteDate;
    private int i_sectionUpdateID;
    private Date d_sectionUpdateDate;
    private String s_sectionActive;

    public M_Section() {
    }

    public String getS_sectionCode() {
        return s_sectionCode;
    }

    public void setS_sectionCode(String s_sectionCode) {
        this.s_sectionCode = s_sectionCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Department getDepartment() {
        return department;
    }

    public void setDepartment(M_Department department) {
        this.department = department;
    }

    public String getS_sectionRealCode() {
        return s_sectionRealCode;
    }

    public void setS_sectionRealCode(String s_sectionRealCode) {
        this.s_sectionRealCode = s_sectionRealCode;
    }

    public String getS_sectionName() {
        return s_sectionName;
    }

    public void setS_sectionName(String s_sectionName) {
        this.s_sectionName = s_sectionName;
    }

    public int getI_sectionCreateID() {
        return i_sectionCreateID;
    }

    public void setI_sectionCreateID(int i_sectionCreateID) {
        this.i_sectionCreateID = i_sectionCreateID;
    }

    public Date getD_sectionCreateDate() {
        return d_sectionCreateDate;
    }

    public void setD_sectionCreateDate(Date d_sectionCreateDate) {
        this.d_sectionCreateDate = d_sectionCreateDate;
    }

    public int getI_sectionDeleteID() {
        return i_sectionDeleteID;
    }

    public void setI_sectionDeleteID(int i_sectionDeleteID) {
        this.i_sectionDeleteID = i_sectionDeleteID;
    }

    public Date getD_sectionDeleteDate() {
        return d_sectionDeleteDate;
    }

    public void setD_sectionDeleteDate(Date d_sectionDeleteDate) {
        this.d_sectionDeleteDate = d_sectionDeleteDate;
    }

    public int getI_sectionUpdateID() {
        return i_sectionUpdateID;
    }

    public void setI_sectionUpdateID(int i_sectionUpdateID) {
        this.i_sectionUpdateID = i_sectionUpdateID;
    }

    public Date getD_sectionUpdateDate() {
        return d_sectionUpdateDate;
    }

    public void setD_sectionUpdateDate(Date d_sectionUpdateDate) {
        this.d_sectionUpdateDate = d_sectionUpdateDate;
    }

    public String getS_sectionActive() {
        return s_sectionActive;
    }

    public void setS_sectionActive(String s_sectionActive) {
        this.s_sectionActive = s_sectionActive;
    }
}
