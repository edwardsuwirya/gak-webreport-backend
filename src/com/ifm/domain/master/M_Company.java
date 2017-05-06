package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

public class M_Company implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_companyCode;
    private M_Currency currency;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_PaymentType cashpaymenttype;
    private M_PaymentType voucherpaymenttype;
    private String s_companyName;
    private String s_companyNPWP;
    private String s_companySIUP;
    private String s_companyTDP;
    private String s_companyPKP;
    private int i_companyCreateID;
    private Date d_companyCreateDate;
    private int i_companyDeleteID;
    private Date d_companyDeleteDate;
    private int i_companyUpdateID;
    private Date d_companyUpdateDate;
    private String s_companyActive;
    private Set projects;
    //private M_SalesCounter company_salescountercode;

    public M_Company() {
    }

    public M_Company(String s_companyCode,
                     M_Currency currency,
                     M_ResponsibilityCenter responsibilitycenter,
                     M_PaymentType cashpaymenttype,
                     M_PaymentType voucherpaymenttype,
                     String s_companyName, String s_companyNPWP,
                     String s_companySIUP, String s_companyTDP,
                     String s_companyPKP,
                     int i_companyCreateID, Date d_companyCreateDate,
                     int i_companyDeleteID, Date d_companyDeleteDate,
                     int i_companyUpdateID, Date d_companyUpdateDate,
                     String s_companyActive) {
        this.s_companyCode = s_companyCode;
        this.currency = currency;
        this.responsibilitycenter = responsibilitycenter;
        this.cashpaymenttype = cashpaymenttype;
        this.voucherpaymenttype = voucherpaymenttype;
        this.s_companyName = s_companyName;
        this.s_companyNPWP = s_companyNPWP;
        this.s_companySIUP = s_companySIUP;
        this.s_companyTDP = s_companyTDP;
        this.s_companyPKP = s_companyPKP;
        this.i_companyCreateID = i_companyCreateID;
        this.d_companyCreateDate = d_companyCreateDate;
        this.i_companyDeleteID = i_companyDeleteID;
        this.d_companyDeleteDate = d_companyDeleteDate;
        this.i_companyUpdateID = i_companyUpdateID;
        this.d_companyUpdateDate = d_companyUpdateDate;
        this.s_companyActive = s_companyActive;
    }

    public String getS_companyCode() {
        return s_companyCode;
    }

    public void setS_companyCode(String s_companyCode) {
        this.s_companyCode = s_companyCode;
    }

    public M_Currency getCurrency() {
        return currency;
    }

    public void setCurrency(M_Currency currency) {
        this.currency = currency;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public M_PaymentType getCashpaymenttype() {
        return cashpaymenttype;
    }

    public void setCashpaymenttype(M_PaymentType cashpaymenttype) {
        this.cashpaymenttype = cashpaymenttype;
    }

    public M_PaymentType getVoucherpaymenttype() {
        return voucherpaymenttype;
    }

    public void setVoucherpaymenttype(M_PaymentType voucherpaymenttype) {
        this.voucherpaymenttype = voucherpaymenttype;
    }

    public String getS_companyName() {
        return s_companyName;
    }

    public void setS_companyName(String s_companyName) {
        this.s_companyName = s_companyName;
    }

    public String getS_companyNPWP() {
        return s_companyNPWP;
    }

    public void setS_companyNPWP(String s_companyNPWP) {
        this.s_companyNPWP = s_companyNPWP;
    }

    public String getS_companySIUP() {
        return s_companySIUP;
    }

    public void setS_companySIUP(String s_companySIUP) {
        this.s_companySIUP = s_companySIUP;
    }

    public String getS_companyTDP() {
        return s_companyTDP;
    }

    public void setS_companyTDP(String s_companyTDP) {
        this.s_companyTDP = s_companyTDP;
    }

    public String getS_companyPKP() {
        return s_companyPKP;
    }

    public void setS_companyPKP(String s_companyPKP) {
        this.s_companyPKP = s_companyPKP;
    }

    public int getI_companyCreateID() {
        return i_companyCreateID;
    }

    public void setI_companyCreateID(int i_companyCreateID) {
        this.i_companyCreateID = i_companyCreateID;
    }

    public Date getD_companyCreateDate() {
        return d_companyCreateDate;
    }

    public void setD_companyCreateDate(Date d_companyCreateDate) {
        this.d_companyCreateDate = d_companyCreateDate;
    }

    public int getI_companyDeleteID() {
        return i_companyDeleteID;
    }

    public void setI_companyDeleteID(int i_companyDeleteID) {
        this.i_companyDeleteID = i_companyDeleteID;
    }

    public Date getD_companyDeleteDate() {
        return d_companyDeleteDate;
    }

    public void setD_companyDeleteDate(Date d_companyDeleteDate) {
        this.d_companyDeleteDate = d_companyDeleteDate;
    }

    public int getI_companyUpdateID() {
        return i_companyUpdateID;
    }

    public void setI_companyUpdateID(int i_companyUpdateID) {
        this.i_companyUpdateID = i_companyUpdateID;
    }

    public Date getD_companyUpdateDate() {
        return d_companyUpdateDate;
    }

    public void setD_companyUpdateDate(Date d_companyUpdateDate) {
        this.d_companyUpdateDate = d_companyUpdateDate;
    }

    public String getS_companyActive() {
        return s_companyActive;
    }

    public void setS_companyActive(String s_companyActive) {
        this.s_companyActive = s_companyActive;
    }

    public Set getProjects() {
        return projects;
    }

    public void setProjects(Set projects) {
        this.projects = projects;
    }

	/*
    public M_SalesCounter getCompany_salescountercode() {
		return company_salescountercode;
	}
	public void setCompany_salescountercode(M_SalesCounter company_salescountercode) {
		this.company_salescountercode = company_salescountercode;
	}
	*/
}
