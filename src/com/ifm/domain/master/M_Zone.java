package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Zone implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_zoneCode;
    private M_Company company;
    private String s_zoneRealCode;
    private String s_zoneName;
    private int i_zoneCreateID;
    private Date d_zoneCreateDate;
    private int i_zoneDeleteID;
    private Date d_zoneDeleteDate;
    private int i_zoneUpdateID;
    private Date d_zoneUpdateDate;
    private String s_zoneActive;

    public M_Zone() {
    }

    public String getS_zoneCode() {
        return s_zoneCode;
    }

    public void setS_zoneCode(String s_zoneCode) {
        this.s_zoneCode = s_zoneCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_zoneRealCode() {
        return s_zoneRealCode;
    }

    public void setS_zoneRealCode(String s_zoneRealCode) {
        this.s_zoneRealCode = s_zoneRealCode;
    }

    public String getS_zoneName() {
        return s_zoneName;
    }

    public void setS_zoneName(String s_zoneName) {
        this.s_zoneName = s_zoneName;
    }

    public int getI_zoneCreateID() {
        return i_zoneCreateID;
    }

    public void setI_zoneCreateID(int i_zoneCreateID) {
        this.i_zoneCreateID = i_zoneCreateID;
    }

    public Date getD_zoneCreateDate() {
        return d_zoneCreateDate;
    }

    public void setD_zoneCreateDate(Date d_zoneCreateDate) {
        this.d_zoneCreateDate = d_zoneCreateDate;
    }

    public int getI_zoneDeleteID() {
        return i_zoneDeleteID;
    }

    public void setI_zoneDeleteID(int i_zoneDeleteID) {
        this.i_zoneDeleteID = i_zoneDeleteID;
    }

    public Date getD_zoneDeleteDate() {
        return d_zoneDeleteDate;
    }

    public void setD_zoneDeleteDate(Date d_zoneDeleteDate) {
        this.d_zoneDeleteDate = d_zoneDeleteDate;
    }

    public int getI_zoneUpdateID() {
        return i_zoneUpdateID;
    }

    public void setI_zoneUpdateID(int i_zoneUpdateID) {
        this.i_zoneUpdateID = i_zoneUpdateID;
    }

    public Date getD_zoneUpdateDate() {
        return d_zoneUpdateDate;
    }

    public void setD_zoneUpdateDate(Date d_zoneUpdateDate) {
        this.d_zoneUpdateDate = d_zoneUpdateDate;
    }

    public String getS_zoneActive() {
        return s_zoneActive;
    }

    public void setS_zoneActive(String s_zoneActive) {
        this.s_zoneActive = s_zoneActive;
    }
}
