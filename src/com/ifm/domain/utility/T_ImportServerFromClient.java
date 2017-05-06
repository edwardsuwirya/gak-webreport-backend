package com.ifm.domain.utility;
/**
 * @author febriantoro
 */


import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_ResponsibilityCenter;

public class T_ImportServerFromClient implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_tisfcID;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private String s_tisfcLocalServerName;
    private String s_tisfcLocalDBName;
    private Date d_tisfcDate;
    private String s_tisfcTable;
    private String s_tisfcStatus;
    private String s_tisfcDescription;

    public T_ImportServerFromClient() {
    }

    public int getI_tisfcID() {
        return i_tisfcID;
    }

    public void setI_tisfcID(int i_tisfcID) {
        this.i_tisfcID = i_tisfcID;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public String getS_tisfcLocalServerName() {
        return s_tisfcLocalServerName;
    }

    public void setS_tisfcLocalServerName(String s_tisfcLocalServerName) {
        this.s_tisfcLocalServerName = s_tisfcLocalServerName;
    }

    public String getS_tisfcLocalDBName() {
        return s_tisfcLocalDBName;
    }

    public void setS_tisfcLocalDBName(String s_tisfcLocalDBName) {
        this.s_tisfcLocalDBName = s_tisfcLocalDBName;
    }

    public Date getD_tisfcDate() {
        return d_tisfcDate;
    }

    public void setD_tisfcDate(Date d_tisfcDate) {
        this.d_tisfcDate = d_tisfcDate;
    }

    public String getS_tisfcTable() {
        return s_tisfcTable;
    }

    public void setS_tisfcTable(String s_tisfcTable) {
        this.s_tisfcTable = s_tisfcTable;
    }

    public String getS_tisfcStatus() {
        return s_tisfcStatus;
    }

    public void setS_tisfcStatus(String s_tisfcStatus) {
        this.s_tisfcStatus = s_tisfcStatus;
    }

    public String getS_tisfcDescription() {
        return s_tisfcDescription;
    }

    public void setS_tisfcDescription(String s_tisfcDescription) {
        this.s_tisfcDescription = s_tisfcDescription;
    }
}
