package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Coa implements java.io.Serializable {
    private String s_coaCode;
    private M_Company company;
    private M_CoaType coatype;
    private M_Currency currency;
    private String s_coaRealCode;
    private String s_coaName;
    private String s_coa_CoaParent;
    private int i_coaLevel;
    private String s_coaEditable;
    private int i_coaCreateID;
    private Date d_coaCreateDate;
    private int i_coaDeleteID;
    private Date d_coaDeleteDate;
    private int i_coaUpdateID;
    private Date d_coaUpdateDate;
    private String s_coaActive;

    public M_Coa() {
    }

    public String getS_coaCode() {
        return s_coaCode;
    }

    public void setS_coaCode(String s_coaCode) {
        this.s_coaCode = s_coaCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_CoaType getCoatype() {
        return coatype;
    }

    public void setCoatype(M_CoaType coatype) {
        this.coatype = coatype;
    }

    public M_Currency getCurrency() {
        return currency;
    }

    public void setCurrency(M_Currency currency) {
        this.currency = currency;
    }

    public String getS_coaRealCode() {
        return s_coaRealCode;
    }

    public void setS_coaRealCode(String s_coaRealCode) {
        this.s_coaRealCode = s_coaRealCode;
    }

    public String getS_coaName() {
        return s_coaName;
    }

    public void setS_coaName(String s_coaName) {
        this.s_coaName = s_coaName;
    }

    public String getS_coa_CoaParent() {
        return s_coa_CoaParent;
    }

    public void setS_coa_CoaParent(String s_coa_CoaParent) {
        this.s_coa_CoaParent = s_coa_CoaParent;
    }

    public int getI_coaLevel() {
        return i_coaLevel;
    }

    public void setI_coaLevel(int i_coaLevel) {
        this.i_coaLevel = i_coaLevel;
    }

    public String getS_coaEditable() {
        return s_coaEditable;
    }

    public void setS_coaEditable(String s_coaEditable) {
        this.s_coaEditable = s_coaEditable;
    }

    public int getI_coaCreateID() {
        return i_coaCreateID;
    }

    public void setI_coaCreateID(int i_coaCreateID) {
        this.i_coaCreateID = i_coaCreateID;
    }

    public Date getD_coaCreateDate() {
        return d_coaCreateDate;
    }

    public void setD_coaCreateDate(Date d_coaCreateDate) {
        this.d_coaCreateDate = d_coaCreateDate;
    }

    public int getI_coaDeleteID() {
        return i_coaDeleteID;
    }

    public void setI_coaDeleteID(int i_coaDeleteID) {
        this.i_coaDeleteID = i_coaDeleteID;
    }

    public Date getD_coaDeleteDate() {
        return d_coaDeleteDate;
    }

    public void setD_coaDeleteDate(Date d_coaDeleteDate) {
        this.d_coaDeleteDate = d_coaDeleteDate;
    }

    public int getI_coaUpdateID() {
        return i_coaUpdateID;
    }

    public void setI_coaUpdateID(int i_coaUpdateID) {
        this.i_coaUpdateID = i_coaUpdateID;
    }

    public Date getD_coaUpdateDate() {
        return d_coaUpdateDate;
    }

    public void setD_coaUpdateDate(Date d_coaUpdateDate) {
        this.d_coaUpdateDate = d_coaUpdateDate;
    }

    public String getS_coaActive() {
        return s_coaActive;
    }

    public void setS_coaActive(String s_coaActive) {
        this.s_coaActive = s_coaActive;
    }
}
