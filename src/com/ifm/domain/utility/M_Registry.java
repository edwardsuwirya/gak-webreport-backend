package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Company;
import com.ifm.domain.security.M_Project;

import java.util.Date;

public class M_Registry implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_registryCode;
    private M_Company company;
    private M_Project project;
    private String s_registryRealCode;
    private String s_registryName;
    private String s_registryValue;
    private int i_registryCreateID;
    private Date d_registryCreateDate;
    private int i_registryDeleteID;
    private Date d_registryDeleteDate;
    private int i_registryUpdateID;
    private Date d_registryUpdateDate;
    private String s_registryActive;

    public M_Registry() {
    }

    public M_Registry(String s_registryCode, M_Company company, M_Project project,
                      String s_registryRealCode, String s_registryName, String s_registryValue,
                      int i_registryCreateID, Date d_registryCreateDate,
                      int i_registryDeleteID, Date d_registryDeleteDate,
                      int i_registryUpdateID, Date d_registryUpdateDate,
                      String s_registryActive) {
        this.s_registryCode = s_registryCode;
        this.company = company;
        this.project = project;
        this.s_registryRealCode = s_registryRealCode;
        this.s_registryName = s_registryName;
        this.s_registryValue = s_registryValue;
        this.i_registryCreateID = i_registryCreateID;
        this.d_registryCreateDate = d_registryCreateDate;
        this.i_registryDeleteID = i_registryDeleteID;
        this.d_registryDeleteDate = d_registryDeleteDate;
        this.i_registryUpdateID = i_registryUpdateID;
        this.d_registryUpdateDate = d_registryUpdateDate;
        this.s_registryActive = s_registryActive;
    }

    public String getS_registryCode() {
        return s_registryCode;
    }

    public void setS_registryCode(String s_registryCode) {
        this.s_registryCode = s_registryCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Project getProject() {
        return project;
    }

    public void setProject(M_Project project) {
        this.project = project;
    }

    public String getS_registryRealCode() {
        return s_registryRealCode;
    }

    public void setS_registryRealCode(String s_registryRealCode) {
        this.s_registryRealCode = s_registryRealCode;
    }

    public String getS_registryName() {
        return s_registryName;
    }

    public void setS_registryName(String s_registryName) {
        this.s_registryName = s_registryName;
    }

    public String getS_registryValue() {
        return s_registryValue;
    }

    public void setS_registryValue(String s_registryValue) {
        this.s_registryValue = s_registryValue;
    }

    public int getI_registryCreateID() {
        return i_registryCreateID;
    }

    public void setI_registryCreateID(int i_registryCreateID) {
        this.i_registryCreateID = i_registryCreateID;
    }

    public Date getD_registryCreateDate() {
        return d_registryCreateDate;
    }

    public void setD_registryCreateDate(Date d_registryCreateDate) {
        this.d_registryCreateDate = d_registryCreateDate;
    }

    public int getI_registryDeleteID() {
        return i_registryDeleteID;
    }

    public void setI_registryDeleteID(int i_registryDeleteID) {
        this.i_registryDeleteID = i_registryDeleteID;
    }

    public Date getD_registryDeleteDate() {
        return d_registryDeleteDate;
    }

    public void setD_registryDeleteDate(Date d_registryDeleteDate) {
        this.d_registryDeleteDate = d_registryDeleteDate;
    }

    public int getI_registryUpdateID() {
        return i_registryUpdateID;
    }

    public void setI_registryUpdateID(int i_registryUpdateID) {
        this.i_registryUpdateID = i_registryUpdateID;
    }

    public Date getD_registryUpdateDate() {
        return d_registryUpdateDate;
    }

    public void setD_registryUpdateDate(Date d_registryUpdateDate) {
        this.d_registryUpdateDate = d_registryUpdateDate;
    }

    public String getS_registryActive() {
        return s_registryActive;
    }

    public void setS_registryActive(String s_registryActive) {
        this.s_registryActive = s_registryActive;
    }
}
