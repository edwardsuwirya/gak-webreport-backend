package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_CardType implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_cardTypeCode;
    private M_Company company;
    private String s_cardTypeRealCode;
    private String s_cardTypeName;
    private int i_cardTypeCreateID;
    private Date d_cardTypeCreateDate;
    private int i_cardTypeDeleteID;
    private Date d_cardTypeDeleteDate;
    private int i_cardTypeUpdateID;
    private Date d_cardTypeUpdateDate;
    private String s_cardTypeActive;

    public M_CardType() {
    }

    public String getS_cardTypeCode() {
        return s_cardTypeCode;
    }

    public void setS_cardTypeCode(String s_cardTypeCode) {
        this.s_cardTypeCode = s_cardTypeCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_cardTypeRealCode() {
        return s_cardTypeRealCode;
    }

    public void setS_cardTypeRealCode(String s_cardTypeRealCode) {
        this.s_cardTypeRealCode = s_cardTypeRealCode;
    }

    public String getS_cardTypeName() {
        return s_cardTypeName;
    }

    public void setS_cardTypeName(String s_cardTypeName) {
        this.s_cardTypeName = s_cardTypeName;
    }

    public int getI_cardTypeCreateID() {
        return i_cardTypeCreateID;
    }

    public void setI_cardTypeCreateID(int i_cardTypeCreateID) {
        this.i_cardTypeCreateID = i_cardTypeCreateID;
    }

    public Date getD_cardTypeCreateDate() {
        return d_cardTypeCreateDate;
    }

    public void setD_cardTypeCreateDate(Date d_cardTypeCreateDate) {
        this.d_cardTypeCreateDate = d_cardTypeCreateDate;
    }

    public int getI_cardTypeDeleteID() {
        return i_cardTypeDeleteID;
    }

    public void setI_cardTypeDeleteID(int i_cardTypeDeleteID) {
        this.i_cardTypeDeleteID = i_cardTypeDeleteID;
    }

    public Date getD_cardTypeDeleteDate() {
        return d_cardTypeDeleteDate;
    }

    public void setD_cardTypeDeleteDate(Date d_cardTypeDeleteDate) {
        this.d_cardTypeDeleteDate = d_cardTypeDeleteDate;
    }

    public int getI_cardTypeUpdateID() {
        return i_cardTypeUpdateID;
    }

    public void setI_cardTypeUpdateID(int i_cardTypeUpdateID) {
        this.i_cardTypeUpdateID = i_cardTypeUpdateID;
    }

    public Date getD_cardTypeUpdateDate() {
        return d_cardTypeUpdateDate;
    }

    public void setD_cardTypeUpdateDate(Date d_cardTypeUpdateDate) {
        this.d_cardTypeUpdateDate = d_cardTypeUpdateDate;
    }

    public String getS_cardTypeActive() {
        return s_cardTypeActive;
    }

    public void setS_cardTypeActive(String s_cardTypeActive) {
        this.s_cardTypeActive = s_cardTypeActive;
    }
}
