package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_RackSection implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_rackSectionCode;
    private M_Company company;
    private String s_rackSectionRealCode;
    private String s_rackSectionName;
    private int i_rackSectionCreateID;
    private Date d_rackSectionCreateDate;
    private int i_rackSectionDeleteID;
    private Date d_rackSectionDeleteDate;
    private int i_rackSectionUpdateID;
    private Date d_rackSectionUpdateDate;
    private String s_rackSectionActive;

    public M_RackSection() {
    }

    public String getS_rackSectionCode() {
        return s_rackSectionCode;
    }

    public void setS_rackSectionCode(String s_rackSectionCode) {
        this.s_rackSectionCode = s_rackSectionCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_rackSectionRealCode() {
        return s_rackSectionRealCode;
    }

    public void setS_rackSectionRealCode(String s_rackSectionRealCode) {
        this.s_rackSectionRealCode = s_rackSectionRealCode;
    }

    public String getS_rackSectionName() {
        return s_rackSectionName;
    }

    public void setS_rackSectionName(String s_rackSectionName) {
        this.s_rackSectionName = s_rackSectionName;
    }

    public int getI_rackSectionCreateID() {
        return i_rackSectionCreateID;
    }

    public void setI_rackSectionCreateID(int i_rackSectionCreateID) {
        this.i_rackSectionCreateID = i_rackSectionCreateID;
    }

    public Date getD_rackSectionCreateDate() {
        return d_rackSectionCreateDate;
    }

    public void setD_rackSectionCreateDate(Date d_rackSectionCreateDate) {
        this.d_rackSectionCreateDate = d_rackSectionCreateDate;
    }

    public int getI_rackSectionDeleteID() {
        return i_rackSectionDeleteID;
    }

    public void setI_rackSectionDeleteID(int i_rackSectionDeleteID) {
        this.i_rackSectionDeleteID = i_rackSectionDeleteID;
    }

    public Date getD_rackSectionDeleteDate() {
        return d_rackSectionDeleteDate;
    }

    public void setD_rackSectionDeleteDate(Date d_rackSectionDeleteDate) {
        this.d_rackSectionDeleteDate = d_rackSectionDeleteDate;
    }

    public int getI_rackSectionUpdateID() {
        return i_rackSectionUpdateID;
    }

    public void setI_rackSectionUpdateID(int i_rackSectionUpdateID) {
        this.i_rackSectionUpdateID = i_rackSectionUpdateID;
    }

    public Date getD_rackSectionUpdateDate() {
        return d_rackSectionUpdateDate;
    }

    public void setD_rackSectionUpdateDate(Date d_rackSectionUpdateDate) {
        this.d_rackSectionUpdateDate = d_rackSectionUpdateDate;
    }

    public String getS_rackSectionActive() {
        return s_rackSectionActive;
    }

    public void setS_rackSectionActive(String s_rackSectionActive) {
        this.s_rackSectionActive = s_rackSectionActive;
    }
}
