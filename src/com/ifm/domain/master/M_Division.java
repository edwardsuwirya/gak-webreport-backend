package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Division implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_divisionCode;
    private String s_divisionRealCode;
    private M_Company company;
    private String s_divisionName;
    private int i_divisionCreateID;
    private Date d_divisionCreateDate;
    private int i_divisionDeleteID;
    private Date d_divisionDeleteDate;
    private int i_divisionUpdateID;
    private Date d_divisionUpdateDate;
    private String s_divisionActive;

    public M_Division() {
    }

    public M_Division(String s_divisionCode, String s_divisionRealCode, M_Company company,
                      String s_divisionName, int i_divisionCreateID, Date d_divisionCreateDate,
                      int i_divisionDeleteID, Date d_divisionDeleteDate,
                      int i_divisionUpdateID, Date d_divisionUpdateDate,
                      String s_divisionActive) {
        this.s_divisionCode = s_divisionCode;
        this.s_divisionRealCode = s_divisionRealCode;
        this.company = company;
        this.s_divisionName = s_divisionName;
        this.i_divisionCreateID = i_divisionCreateID;
        this.d_divisionCreateDate = d_divisionCreateDate;
        this.i_divisionDeleteID = i_divisionDeleteID;
        this.d_divisionDeleteDate = d_divisionDeleteDate;
        this.i_divisionUpdateID = i_divisionUpdateID;
        this.d_divisionUpdateDate = d_divisionUpdateDate;
        this.s_divisionActive = s_divisionActive;
    }

    public String getS_divisionCode() {
        return s_divisionCode;
    }

    public void setS_divisionCode(String s_divisionCode) {
        this.s_divisionCode = s_divisionCode;
    }

    public String getS_divisionRealCode() {
        return s_divisionRealCode;
    }

    public void setS_divisionRealCode(String s_divisionRealCode) {
        this.s_divisionRealCode = s_divisionRealCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_divisionName() {
        return s_divisionName;
    }

    public void setS_divisionName(String s_divisionName) {
        this.s_divisionName = s_divisionName;
    }

    public int getI_divisionCreateID() {
        return i_divisionCreateID;
    }

    public void setI_divisionCreateID(int i_divisionCreateID) {
        this.i_divisionCreateID = i_divisionCreateID;
    }

    public Date getD_divisionCreateDate() {
        return d_divisionCreateDate;
    }

    public void setD_divisionCreateDate(Date d_divisionCreateDate) {
        this.d_divisionCreateDate = d_divisionCreateDate;
    }

    public int getI_divisionDeleteID() {
        return i_divisionDeleteID;
    }

    public void setI_divisionDeleteID(int i_divisionDeleteID) {
        this.i_divisionDeleteID = i_divisionDeleteID;
    }

    public Date getD_divisionDeleteDate() {
        return d_divisionDeleteDate;
    }

    public void setD_divisionDeleteDate(Date d_divisionDeleteDate) {
        this.d_divisionDeleteDate = d_divisionDeleteDate;
    }

    public int getI_divisionUpdateID() {
        return i_divisionUpdateID;
    }

    public void setI_divisionUpdateID(int i_divisionUpdateID) {
        this.i_divisionUpdateID = i_divisionUpdateID;
    }

    public Date getD_divisionUpdateDate() {
        return d_divisionUpdateDate;
    }

    public void setD_divisionUpdateDate(Date d_divisionUpdateDate) {
        this.d_divisionUpdateDate = d_divisionUpdateDate;
    }

    public String getS_divisionActive() {
        return s_divisionActive;
    }

    public void setS_divisionActive(String s_divisionActive) {
        this.s_divisionActive = s_divisionActive;
    }
}
