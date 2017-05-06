package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_Rack implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_rackCode;
    private M_Company company;
    private String s_rackRealCode;
    private String s_rackName;
    private int i_rackCreateID;
    private Date d_rackCreateDate;
    private int i_rackDeleteID;
    private Date d_rackDeleteDate;
    private int i_rackUpdateID;
    private Date d_rackUpdateDate;
    private String s_rackActive;

    public M_Rack() {
    }

    public String getS_rackCode() {
        return s_rackCode;
    }

    public void setS_rackCode(String s_rackCode) {
        this.s_rackCode = s_rackCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_rackRealCode() {
        return s_rackRealCode;
    }

    public void setS_rackRealCode(String s_rackRealCode) {
        this.s_rackRealCode = s_rackRealCode;
    }

    public String getS_rackName() {
        return s_rackName;
    }

    public void setS_rackName(String s_rackName) {
        this.s_rackName = s_rackName;
    }

    public int getI_rackCreateID() {
        return i_rackCreateID;
    }

    public void setI_rackCreateID(int i_rackCreateID) {
        this.i_rackCreateID = i_rackCreateID;
    }

    public Date getD_rackCreateDate() {
        return d_rackCreateDate;
    }

    public void setD_rackCreateDate(Date d_rackCreateDate) {
        this.d_rackCreateDate = d_rackCreateDate;
    }

    public int getI_rackDeleteID() {
        return i_rackDeleteID;
    }

    public void setI_rackDeleteID(int i_rackDeleteID) {
        this.i_rackDeleteID = i_rackDeleteID;
    }

    public Date getD_rackDeleteDate() {
        return d_rackDeleteDate;
    }

    public void setD_rackDeleteDate(Date d_rackDeleteDate) {
        this.d_rackDeleteDate = d_rackDeleteDate;
    }

    public int getI_rackUpdateID() {
        return i_rackUpdateID;
    }

    public void setI_rackUpdateID(int i_rackUpdateID) {
        this.i_rackUpdateID = i_rackUpdateID;
    }

    public Date getD_rackUpdateDate() {
        return d_rackUpdateDate;
    }

    public void setD_rackUpdateDate(Date d_rackUpdateDate) {
        this.d_rackUpdateDate = d_rackUpdateDate;
    }

    public String getS_rackActive() {
        return s_rackActive;
    }

    public void setS_rackActive(String s_rackActive) {
        this.s_rackActive = s_rackActive;
    }
}

