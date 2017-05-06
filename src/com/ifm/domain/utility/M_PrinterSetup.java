package com.ifm.domain.utility;
/**
 * @author febriantoro
 */


import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_ResponsibilityCenter;


public class M_PrinterSetup implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_mpsHostName;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private String s_mpsItem;
    private String s_mpsPrinter;
    private int i_mpsCreateID;
    private Date d_mpsCreateDate;
    private int i_mpsDeleteID;
    private Date d_mpsDeleteDate;
    private int i_mpsUpdateID;
    private Date d_mpsUpdateDate;
    private String s_mpsActive;

    public M_PrinterSetup() {
    }

    public String getS_mpsHostName() {
        return s_mpsHostName;
    }

    public void setS_mpsHostName(String s_mpsHostName) {
        this.s_mpsHostName = s_mpsHostName;
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

    public String getS_mpsItem() {
        return s_mpsItem;
    }

    public void setS_mpsItem(String s_mpsItem) {
        this.s_mpsItem = s_mpsItem;
    }

    public String getS_mpsPrinter() {
        return s_mpsPrinter;
    }

    public void setS_mpsPrinter(String s_mpsPrinter) {
        this.s_mpsPrinter = s_mpsPrinter;
    }

    public int getI_mpsCreateID() {
        return i_mpsCreateID;
    }

    public void setI_mpsCreateID(int i_mpsCreateID) {
        this.i_mpsCreateID = i_mpsCreateID;
    }

    public Date getD_mpsCreateDate() {
        return d_mpsCreateDate;
    }

    public void setD_mpsCreateDate(Date d_mpsCreateDate) {
        this.d_mpsCreateDate = d_mpsCreateDate;
    }

    public int getI_mpsDeleteID() {
        return i_mpsDeleteID;
    }

    public void setI_mpsDeleteID(int i_mpsDeleteID) {
        this.i_mpsDeleteID = i_mpsDeleteID;
    }

    public Date getD_mpsDeleteDate() {
        return d_mpsDeleteDate;
    }

    public void setD_mpsDeleteDate(Date d_mpsDeleteDate) {
        this.d_mpsDeleteDate = d_mpsDeleteDate;
    }

    public int getI_mpsUpdateID() {
        return i_mpsUpdateID;
    }

    public void setI_mpsUpdateID(int i_mpsUpdateID) {
        this.i_mpsUpdateID = i_mpsUpdateID;
    }

    public Date getD_mpsUpdateDate() {
        return d_mpsUpdateDate;
    }

    public void setD_mpsUpdateDate(Date d_mpsUpdateDate) {
        this.d_mpsUpdateDate = d_mpsUpdateDate;
    }

    public String getS_mpsActive() {
        return s_mpsActive;
    }

    public void setS_mpsActive(String s_mpsActive) {
        this.s_mpsActive = s_mpsActive;
    }
}
