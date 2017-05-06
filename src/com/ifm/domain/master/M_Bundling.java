package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class M_Bundling {
    private String s_bundlingCode;
    private M_Company company;
    private M_Article article;
    private M_Uom uom;
    private String s_bundlingRealCode;
    private BigDecimal d_bundlingQty;
    private Date d_bundlingDate;
    private int i_bundlingCreateID;
    private Date d_bundlingCreateDate;
    private int i_bundlingDeleteID;
    private Date d_bundlingDeleteDate;
    private int i_bundlingUpdateID;
    private Date d_bundlingUpdateDate;
    private String s_bundlingActive;
    private Set details;

    public M_Bundling() {
    }

    public String getS_bundlingCode() {
        return s_bundlingCode;
    }

    public void setS_bundlingCode(String s_bundlingCode) {
        this.s_bundlingCode = s_bundlingCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public M_Uom getUom() {
        return uom;
    }

    public void setUom(M_Uom uom) {
        this.uom = uom;
    }

    public String getS_bundlingRealCode() {
        return s_bundlingRealCode;
    }

    public void setS_bundlingRealCode(String s_bundlingRealCode) {
        this.s_bundlingRealCode = s_bundlingRealCode;
    }

    public BigDecimal getD_bundlingQty() {
        return d_bundlingQty;
    }

    public void setD_bundlingQty(BigDecimal d_bundlingQty) {
        this.d_bundlingQty = d_bundlingQty;
    }

    public Date getD_bundlingDate() {
        return d_bundlingDate;
    }

    public void setD_bundlingDate(Date d_bundlingDate) {
        this.d_bundlingDate = d_bundlingDate;
    }

    public int getI_bundlingCreateID() {
        return i_bundlingCreateID;
    }

    public void setI_bundlingCreateID(int i_bundlingCreateID) {
        this.i_bundlingCreateID = i_bundlingCreateID;
    }

    public Date getD_bundlingCreateDate() {
        return d_bundlingCreateDate;
    }

    public void setD_bundlingCreateDate(Date d_bundlingCreateDate) {
        this.d_bundlingCreateDate = d_bundlingCreateDate;
    }

    public int getI_bundlingDeleteID() {
        return i_bundlingDeleteID;
    }

    public void setI_bundlingDeleteID(int i_bundlingDeleteID) {
        this.i_bundlingDeleteID = i_bundlingDeleteID;
    }

    public Date getD_bundlingDeleteDate() {
        return d_bundlingDeleteDate;
    }

    public void setD_bundlingDeleteDate(Date d_bundlingDeleteDate) {
        this.d_bundlingDeleteDate = d_bundlingDeleteDate;
    }

    public int getI_bundlingUpdateID() {
        return i_bundlingUpdateID;
    }

    public void setI_bundlingUpdateID(int i_bundlingUpdateID) {
        this.i_bundlingUpdateID = i_bundlingUpdateID;
    }

    public Date getD_bundlingUpdateDate() {
        return d_bundlingUpdateDate;
    }

    public void setD_bundlingUpdateDate(Date d_bundlingUpdateDate) {
        this.d_bundlingUpdateDate = d_bundlingUpdateDate;
    }

    public String getS_bundlingActive() {
        return s_bundlingActive;
    }

    public void setS_bundlingActive(String s_bundlingActive) {
        this.s_bundlingActive = s_bundlingActive;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }
}
