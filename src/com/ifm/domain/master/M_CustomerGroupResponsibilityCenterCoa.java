package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;


public class M_CustomerGroupResponsibilityCenterCoa {
    private String s_customerGroupResponsibilityCenterCoaCode;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_Coa coaar;
    private M_Coa coasales;
    private int i_customerGroupResponsibilityCenterCoaCreateID;
    private Date d_customerGroupResponsibilityCenterCoaCreateDate;
    private int i_customerGroupResponsibilityCenterCoaUpdateID;
    private Date d_customerGroupResponsibilityCenterCoaUpdateDate;

    public M_CustomerGroupResponsibilityCenterCoa() {
    }

    public M_CustomerGroupResponsibilityCenterCoa(String s_customerGroupResponsibilityCenterCoaCode,
                                                  M_Company company,
                                                  M_ResponsibilityCenter responsibilitycenter,
                                                  M_Coa coaar,
                                                  M_Coa coasales,
                                                  int i_customerGroupResponsibilityCenterCoaCreateID,
                                                  Date d_customerGroupResponsibilityCenterCoaCreateDate,
                                                  int i_customerGroupResponsibilityCenterCoaUpdateID,
                                                  Date d_customerGroupResponsibilityCenterCoaUpdateDate) {
        this.s_customerGroupResponsibilityCenterCoaCode = s_customerGroupResponsibilityCenterCoaCode;
        this.company = company;
        this.responsibilitycenter = responsibilitycenter;
        this.coaar = coaar;
        this.coasales = coasales;
        this.i_customerGroupResponsibilityCenterCoaCreateID = i_customerGroupResponsibilityCenterCoaCreateID;
        this.d_customerGroupResponsibilityCenterCoaCreateDate = d_customerGroupResponsibilityCenterCoaCreateDate;
        this.i_customerGroupResponsibilityCenterCoaUpdateID = i_customerGroupResponsibilityCenterCoaUpdateID;
        this.d_customerGroupResponsibilityCenterCoaUpdateDate = d_customerGroupResponsibilityCenterCoaUpdateDate;
    }

    public String getS_customerGroupResponsibilityCenterCoaCode() {
        return s_customerGroupResponsibilityCenterCoaCode;
    }

    public void setS_customerGroupResponsibilityCenterCoaCode(
            String s_customerGroupResponsibilityCenterCoaCode) {
        this.s_customerGroupResponsibilityCenterCoaCode = s_customerGroupResponsibilityCenterCoaCode;
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

    public M_Coa getCoaar() {
        return coaar;
    }

    public void setCoaar(M_Coa coaar) {
        this.coaar = coaar;
    }

    public M_Coa getCoasales() {
        return coasales;
    }

    public void setCoasales(M_Coa coasales) {
        this.coasales = coasales;
    }

    public int getI_customerGroupResponsibilityCenterCoaCreateID() {
        return i_customerGroupResponsibilityCenterCoaCreateID;
    }

    public void setI_customerGroupResponsibilityCenterCoaCreateID(
            int i_customerGroupResponsibilityCenterCoaCreateID) {
        this.i_customerGroupResponsibilityCenterCoaCreateID = i_customerGroupResponsibilityCenterCoaCreateID;
    }

    public Date getD_customerGroupResponsibilityCenterCoaCreateDate() {
        return d_customerGroupResponsibilityCenterCoaCreateDate;
    }

    public void setD_customerGroupResponsibilityCenterCoaCreateDate(
            Date d_customerGroupResponsibilityCenterCoaCreateDate) {
        this.d_customerGroupResponsibilityCenterCoaCreateDate = d_customerGroupResponsibilityCenterCoaCreateDate;
    }

    public int getI_customerGroupResponsibilityCenterCoaUpdateID() {
        return i_customerGroupResponsibilityCenterCoaUpdateID;
    }

    public void setI_customerGroupResponsibilityCenterCoaUpdateID(
            int i_customerGroupResponsibilityCenterCoaUpdateID) {
        this.i_customerGroupResponsibilityCenterCoaUpdateID = i_customerGroupResponsibilityCenterCoaUpdateID;
    }

    public Date getD_customerGroupResponsibilityCenterCoaUpdateDate() {
        return d_customerGroupResponsibilityCenterCoaUpdateDate;
    }

    public void setD_customerGroupResponsibilityCenterCoaUpdateDate(
            Date d_customerGroupResponsibilityCenterCoaUpdateDate) {
        this.d_customerGroupResponsibilityCenterCoaUpdateDate = d_customerGroupResponsibilityCenterCoaUpdateDate;
    }
}
