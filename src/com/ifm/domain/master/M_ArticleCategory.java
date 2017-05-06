package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;


public class M_ArticleCategory implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_articleCategoryCode;
    private M_Company company;
    private M_ArticleDepartment articleDepartment;
    private String s_articleCategoryRealCode;
    private String s_articleCategoryName;
    private int i_articleCategoryCreateID;
    private Date d_articleCategoryCreateDate;
    private int i_articleCategoryDeleteID;
    private Date d_articleCategoryDeleteDate;
    private int i_articleCategoryUpdateID;
    private Date d_articleCategoryUpdateDate;
    private String s_articleCategoryActive;

    public M_ArticleCategory() {
    }

    public String getS_articleCategoryCode() {
        return s_articleCategoryCode;
    }

    public void setS_articleCategoryCode(String s_articleCategoryCode) {
        this.s_articleCategoryCode = s_articleCategoryCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ArticleDepartment getArticleDepartment() {
        return articleDepartment;
    }

    public void setArticleDepartment(M_ArticleDepartment articleDepartment) {
        this.articleDepartment = articleDepartment;
    }

    public String getS_articleCategoryRealCode() {
        return s_articleCategoryRealCode;
    }

    public void setS_articleCategoryRealCode(String s_articleCategoryRealCode) {
        this.s_articleCategoryRealCode = s_articleCategoryRealCode;
    }

    public String getS_articleCategoryName() {
        return s_articleCategoryName;
    }

    public void setS_articleCategoryName(String s_articleCategoryName) {
        this.s_articleCategoryName = s_articleCategoryName;
    }

    public int getI_articleCategoryCreateID() {
        return i_articleCategoryCreateID;
    }

    public void setI_articleCategoryCreateID(int i_articleCategoryCreateID) {
        this.i_articleCategoryCreateID = i_articleCategoryCreateID;
    }

    public Date getD_articleCategoryCreateDate() {
        return d_articleCategoryCreateDate;
    }

    public void setD_articleCategoryCreateDate(Date d_articleCategoryCreateDate) {
        this.d_articleCategoryCreateDate = d_articleCategoryCreateDate;
    }

    public int getI_articleCategoryDeleteID() {
        return i_articleCategoryDeleteID;
    }

    public void setI_articleCategoryDeleteID(int i_articleCategoryDeleteID) {
        this.i_articleCategoryDeleteID = i_articleCategoryDeleteID;
    }

    public Date getD_articleCategoryDeleteDate() {
        return d_articleCategoryDeleteDate;
    }

    public void setD_articleCategoryDeleteDate(Date d_articleCategoryDeleteDate) {
        this.d_articleCategoryDeleteDate = d_articleCategoryDeleteDate;
    }

    public int getI_articleCategoryUpdateID() {
        return i_articleCategoryUpdateID;
    }

    public void setI_articleCategoryUpdateID(int i_articleCategoryUpdateID) {
        this.i_articleCategoryUpdateID = i_articleCategoryUpdateID;
    }

    public Date getD_articleCategoryUpdateDate() {
        return d_articleCategoryUpdateDate;
    }

    public void setD_articleCategoryUpdateDate(Date d_articleCategoryUpdateDate) {
        this.d_articleCategoryUpdateDate = d_articleCategoryUpdateDate;
    }

    public String getS_articleCategoryActive() {
        return s_articleCategoryActive;
    }

    public void setS_articleCategoryActive(String s_articleCategoryActive) {
        this.s_articleCategoryActive = s_articleCategoryActive;
    }
}
