package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_ResponsibilityCenter;

public class T_ExportServerToClient implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_testcID;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private String s_testcLocalServerName;
    private String s_testcLocalDBName;
    private Date d_testcDate;
    private String s_testcTable;
    private String s_testcStatus;
    private String s_testcDescription;

    public T_ExportServerToClient() {
    }

    public int getI_testcID() {
        return i_testcID;
    }

    public void setI_testcID(int i_testcID) {
        this.i_testcID = i_testcID;
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

    public String getS_testcLocalServerName() {
        return s_testcLocalServerName;
    }

    public void setS_testcLocalServerName(String s_testcLocalServerName) {
        this.s_testcLocalServerName = s_testcLocalServerName;
    }

    public String getS_testcLocalDBName() {
        return s_testcLocalDBName;
    }

    public void setS_testcLocalDBName(String s_testcLocalDBName) {
        this.s_testcLocalDBName = s_testcLocalDBName;
    }

    public Date getD_testcDate() {
        return d_testcDate;
    }

    public void setD_testcDate(Date d_testcDate) {
        this.d_testcDate = d_testcDate;
    }

    public String getS_testcTable() {
        return s_testcTable;
    }

    public void setS_testcTable(String s_testcTable) {
        this.s_testcTable = s_testcTable;
    }

    public String getS_testcStatus() {
        return s_testcStatus;
    }

    public void setS_testcStatus(String s_testcStatus) {
        this.s_testcStatus = s_testcStatus;
    }

    public String getS_testcDescription() {
        return s_testcDescription;
    }

    public void setS_testcDescription(String s_testcDescription) {
        this.s_testcDescription = s_testcDescription;
    }
}
