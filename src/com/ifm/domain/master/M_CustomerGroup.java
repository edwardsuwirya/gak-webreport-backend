package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

public class M_CustomerGroup implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_customerGroupCode;
    private M_Company company;
    private M_Coa coaar;
    private M_Coa coasales;
    private String s_customerGroupRealCode;
    private String s_customerGroupName;
    private int i_customerGroupCreateID;
    private Date d_customerGroupCreateDate;
    private int i_customerGroupDeleteID;
    private Date d_customerGroupDeleteDate;
    private int i_customerGroupUpdateID;
    private Date d_customerGroupUpdateDate;
    private String s_customerGroupActive;
    private Set responsibilitycentercoas;

    public M_CustomerGroup() {
    }

    public String getS_customerGroupCode() {
        return s_customerGroupCode;
    }

    public void setS_customerGroupCode(String s_customerGroupCode) {
        this.s_customerGroupCode = s_customerGroupCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
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

    public String getS_customerGroupRealCode() {
        return s_customerGroupRealCode;
    }

    public void setS_customerGroupRealCode(String s_customerGroupRealCode) {
        this.s_customerGroupRealCode = s_customerGroupRealCode;
    }

    public String getS_customerGroupName() {
        return s_customerGroupName;
    }

    public void setS_customerGroupName(String s_customerGroupName) {
        this.s_customerGroupName = s_customerGroupName;
    }

    public int getI_customerGroupCreateID() {
        return i_customerGroupCreateID;
    }

    public void setI_customerGroupCreateID(int i_customerGroupCreateID) {
        this.i_customerGroupCreateID = i_customerGroupCreateID;
    }

    public Date getD_customerGroupCreateDate() {
        return d_customerGroupCreateDate;
    }

    public void setD_customerGroupCreateDate(Date d_customerGroupCreateDate) {
        this.d_customerGroupCreateDate = d_customerGroupCreateDate;
    }

    public int getI_customerGroupDeleteID() {
        return i_customerGroupDeleteID;
    }

    public void setI_customerGroupDeleteID(int i_customerGroupDeleteID) {
        this.i_customerGroupDeleteID = i_customerGroupDeleteID;
    }

    public Date getD_customerGroupDeleteDate() {
        return d_customerGroupDeleteDate;
    }

    public void setD_customerGroupDeleteDate(Date d_customerGroupDeleteDate) {
        this.d_customerGroupDeleteDate = d_customerGroupDeleteDate;
    }

    public int getI_customerGroupUpdateID() {
        return i_customerGroupUpdateID;
    }

    public void setI_customerGroupUpdateID(int i_customerGroupUpdateID) {
        this.i_customerGroupUpdateID = i_customerGroupUpdateID;
    }

    public Date getD_customerGroupUpdateDate() {
        return d_customerGroupUpdateDate;
    }

    public void setD_customerGroupUpdateDate(Date d_customerGroupUpdateDate) {
        this.d_customerGroupUpdateDate = d_customerGroupUpdateDate;
    }

    public String getS_customerGroupActive() {
        return s_customerGroupActive;
    }

    public void setS_customerGroupActive(String s_customerGroupActive) {
        this.s_customerGroupActive = s_customerGroupActive;
    }

    public Set getResponsibilitycentercoas() {
        return responsibilitycentercoas;
    }

    public void setResponsibilitycentercoas(Set responsibilitycentercoas) {
        this.responsibilitycentercoas = responsibilitycentercoas;
    }
}
