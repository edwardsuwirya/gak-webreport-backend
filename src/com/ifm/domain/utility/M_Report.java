package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.security.M_Project;

public class M_Report implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_reportCode;
    private M_Company company;
    private M_Project project;
    private String s_reportRealCode;
    private String s_reportName;
    private String s_reportPath;
    private int i_reportCreateID;
    private Date d_reportCreateDate;
    private int i_reportDeleteID;
    private Date d_reportDeleteDate;
    private int i_reportUpdateID;
    private Date d_reportUpdateDate;
    private String s_reportActive;

    public M_Report() {
    }

    public M_Report(String s_reportCode,
                    M_Company company,
                    M_Project project,
                    String s_reportRealCode,
                    String s_reportName,
                    String s_reportPath,
                    int i_reportCreateID,
                    Date d_reportCreateDate,
                    int i_reportDeleteID,
                    Date d_reportDeleteDate,
                    int i_reportUpdateID,
                    Date d_reportUpdateDate,
                    String s_reportActive) {
        this.s_reportCode = s_reportCode;
        this.company = company;
        this.project = project;
        this.s_reportRealCode = s_reportRealCode;
        this.s_reportName = s_reportName;
        this.s_reportPath = s_reportPath;
        this.i_reportCreateID = i_reportCreateID;
        this.d_reportCreateDate = d_reportCreateDate;
        this.i_reportDeleteID = i_reportDeleteID;
        this.d_reportDeleteDate = d_reportDeleteDate;
        this.i_reportUpdateID = i_reportUpdateID;
        this.d_reportUpdateDate = d_reportUpdateDate;
        this.s_reportActive = s_reportActive;
    }

    public String getS_reportCode() {
        return s_reportCode;
    }

    public void setS_reportCode(String s_reportCode) {
        this.s_reportCode = s_reportCode;
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

    public String getS_reportRealCode() {
        return s_reportRealCode;
    }

    public void setS_reportRealCode(String s_reportRealCode) {
        this.s_reportRealCode = s_reportRealCode;
    }

    public String getS_reportName() {
        return s_reportName;
    }

    public void setS_reportName(String s_reportName) {
        this.s_reportName = s_reportName;
    }

    public String getS_reportPath() {
        return s_reportPath;
    }

    public void setS_reportPath(String s_reportPath) {
        this.s_reportPath = s_reportPath;
    }

    public int getI_reportCreateID() {
        return i_reportCreateID;
    }

    public void setI_reportCreateID(int i_reportCreateID) {
        this.i_reportCreateID = i_reportCreateID;
    }

    public Date getD_reportCreateDate() {
        return d_reportCreateDate;
    }

    public void setD_reportCreateDate(Date d_reportCreateDate) {
        this.d_reportCreateDate = d_reportCreateDate;
    }

    public int getI_reportDeleteID() {
        return i_reportDeleteID;
    }

    public void setI_reportDeleteID(int i_reportDeleteID) {
        this.i_reportDeleteID = i_reportDeleteID;
    }

    public Date getD_reportDeleteDate() {
        return d_reportDeleteDate;
    }

    public void setD_reportDeleteDate(Date d_reportDeleteDate) {
        this.d_reportDeleteDate = d_reportDeleteDate;
    }

    public int getI_reportUpdateID() {
        return i_reportUpdateID;
    }

    public void setI_reportUpdateID(int i_reportUpdateID) {
        this.i_reportUpdateID = i_reportUpdateID;
    }

    public Date getD_reportUpdateDate() {
        return d_reportUpdateDate;
    }

    public void setD_reportUpdateDate(Date d_reportUpdateDate) {
        this.d_reportUpdateDate = d_reportUpdateDate;
    }

    public String getS_reportActive() {
        return s_reportActive;
    }

    public void setS_reportActive(String s_reportActive) {
        this.s_reportActive = s_reportActive;
    }
}
