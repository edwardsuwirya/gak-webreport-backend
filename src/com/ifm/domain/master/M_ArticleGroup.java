package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

public class M_ArticleGroup implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_articleGroupCode;
    private M_Company company;
    private M_Coa coasales;
    private M_Coa coapurchase;
    private M_Coa coavatout;
    private M_Coa coavatin;
    private M_Coa coainventory;
    private M_Coa coacogs;
    private String s_articleGroupRealCode;
    private String s_articleGroupName;
    private String s_articleGroupDisplayName;
    private String s_articleGroupOneBill;
    private int i_articleGroupCreateID;
    private Date d_articleGroupCreateDate;
    private int i_articleGroupDeleteID;
    private Date d_articleGroupDeleteDate;
    private int i_articleGroupUpdateID;
    private Date d_articleGroupUpdateDate;
    private String s_articleGroupActive;
    private Set transactions;

    public M_ArticleGroup() {
    }

    public String getS_articleGroupCode() {
        return s_articleGroupCode;
    }

    public void setS_articleGroupCode(String s_articleGroupCode) {
        this.s_articleGroupCode = s_articleGroupCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Coa getCoasales() {
        return coasales;
    }

    public void setCoasales(M_Coa coasales) {
        this.coasales = coasales;
    }

    public M_Coa getCoapurchase() {
        return coapurchase;
    }

    public void setCoapurchase(M_Coa coapurchase) {
        this.coapurchase = coapurchase;
    }

    public M_Coa getCoavatout() {
        return coavatout;
    }

    public void setCoavatout(M_Coa coavatout) {
        this.coavatout = coavatout;
    }

    public M_Coa getCoavatin() {
        return coavatin;
    }

    public void setCoavatin(M_Coa coavatin) {
        this.coavatin = coavatin;
    }

    public M_Coa getCoainventory() {
        return coainventory;
    }

    public void setCoainventory(M_Coa coainventory) {
        this.coainventory = coainventory;
    }

    public M_Coa getCoacogs() {
        return coacogs;
    }

    public void setCoacogs(M_Coa coacogs) {
        this.coacogs = coacogs;
    }

    public String getS_articleGroupRealCode() {
        return s_articleGroupRealCode;
    }

    public void setS_articleGroupRealCode(String s_articleGroupRealCode) {
        this.s_articleGroupRealCode = s_articleGroupRealCode;
    }

    public String getS_articleGroupName() {
        return s_articleGroupName;
    }

    public void setS_articleGroupName(String s_articleGroupName) {
        this.s_articleGroupName = s_articleGroupName;
    }

    public String getS_articleGroupDisplayName() {
        return s_articleGroupDisplayName;
    }

    public void setS_articleGroupDisplayName(String s_articleGroupDisplayName) {
        this.s_articleGroupDisplayName = s_articleGroupDisplayName;
    }

    public String getS_articleGroupOneBill() {
        return s_articleGroupOneBill;
    }

    public void setS_articleGroupOneBill(String s_articleGroupOneBill) {
        this.s_articleGroupOneBill = s_articleGroupOneBill;
    }

    public int getI_articleGroupCreateID() {
        return i_articleGroupCreateID;
    }

    public void setI_articleGroupCreateID(int i_articleGroupCreateID) {
        this.i_articleGroupCreateID = i_articleGroupCreateID;
    }

    public Date getD_articleGroupCreateDate() {
        return d_articleGroupCreateDate;
    }

    public void setD_articleGroupCreateDate(Date d_articleGroupCreateDate) {
        this.d_articleGroupCreateDate = d_articleGroupCreateDate;
    }

    public int getI_articleGroupDeleteID() {
        return i_articleGroupDeleteID;
    }

    public void setI_articleGroupDeleteID(int i_articleGroupDeleteID) {
        this.i_articleGroupDeleteID = i_articleGroupDeleteID;
    }

    public Date getD_articleGroupDeleteDate() {
        return d_articleGroupDeleteDate;
    }

    public void setD_articleGroupDeleteDate(Date d_articleGroupDeleteDate) {
        this.d_articleGroupDeleteDate = d_articleGroupDeleteDate;
    }

    public int getI_articleGroupUpdateID() {
        return i_articleGroupUpdateID;
    }

    public void setI_articleGroupUpdateID(int i_articleGroupUpdateID) {
        this.i_articleGroupUpdateID = i_articleGroupUpdateID;
    }

    public Date getD_articleGroupUpdateDate() {
        return d_articleGroupUpdateDate;
    }

    public void setD_articleGroupUpdateDate(Date d_articleGroupUpdateDate) {
        this.d_articleGroupUpdateDate = d_articleGroupUpdateDate;
    }

    public String getS_articleGroupActive() {
        return s_articleGroupActive;
    }

    public void setS_articleGroupActive(String s_articleGroupActive) {
        this.s_articleGroupActive = s_articleGroupActive;
    }

    public Set getTransactions() {
        return transactions;
    }

    public void setTransactions(Set transactions) {
        this.transactions = transactions;
    }
}
