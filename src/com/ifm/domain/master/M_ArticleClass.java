package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;


public class M_ArticleClass implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_articleClassCode;
    private M_Company company;
    private M_ArticleCategory articleCategory;
    private String s_articleClassRealCode;
    private String s_articleClassName;
    private int i_articleClassCreateID;
    private Date d_articleClassCreateDate;
    private int i_articleClassDeleteID;
    private Date d_articleClassDeleteDate;
    private int i_articleClassUpdateID;
    private Date d_articleClassUpdateDate;
    private String s_articleClassActive;

    public M_ArticleClass() {
    }

    public String getS_articleClassCode() {
        return s_articleClassCode;
    }

    public void setS_articleClassCode(String s_articleClassCode) {
        this.s_articleClassCode = s_articleClassCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ArticleCategory getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(M_ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getS_articleClassRealCode() {
        return s_articleClassRealCode;
    }

    public void setS_articleClassRealCode(String s_articleClassRealCode) {
        this.s_articleClassRealCode = s_articleClassRealCode;
    }

    public String getS_articleClassName() {
        return s_articleClassName;
    }

    public void setS_articleClassName(String s_articleClassName) {
        this.s_articleClassName = s_articleClassName;
    }

    public int getI_articleClassCreateID() {
        return i_articleClassCreateID;
    }

    public void setI_articleClassCreateID(int i_articleClassCreateID) {
        this.i_articleClassCreateID = i_articleClassCreateID;
    }

    public Date getD_articleClassCreateDate() {
        return d_articleClassCreateDate;
    }

    public void setD_articleClassCreateDate(Date d_articleClassCreateDate) {
        this.d_articleClassCreateDate = d_articleClassCreateDate;
    }

    public int getI_articleClassDeleteID() {
        return i_articleClassDeleteID;
    }

    public void setI_articleClassDeleteID(int i_articleClassDeleteID) {
        this.i_articleClassDeleteID = i_articleClassDeleteID;
    }

    public Date getD_articleClassDeleteDate() {
        return d_articleClassDeleteDate;
    }

    public void setD_articleClassDeleteDate(Date d_articleClassDeleteDate) {
        this.d_articleClassDeleteDate = d_articleClassDeleteDate;
    }

    public int getI_articleClassUpdateID() {
        return i_articleClassUpdateID;
    }

    public void setI_articleClassUpdateID(int i_articleClassUpdateID) {
        this.i_articleClassUpdateID = i_articleClassUpdateID;
    }

    public Date getD_articleClassUpdateDate() {
        return d_articleClassUpdateDate;
    }

    public void setD_articleClassUpdateDate(Date d_articleClassUpdateDate) {
        this.d_articleClassUpdateDate = d_articleClassUpdateDate;
    }

    public String getS_articleClassActive() {
        return s_articleClassActive;
    }

    public void setS_articleClassActive(String s_articleClassActive) {
        this.s_articleClassActive = s_articleClassActive;
    }
}
