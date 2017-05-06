package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_CustomerArticle implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_customerArticleCode;
    private M_Article article;
    private BigDecimal d_customerArticleFactor1;
    private String s_customerArticleOperator1;
    private BigDecimal d_customerArticleFactor2;
    private String s_customerArticleOperator2;
    private int i_customerArticleCreateID;
    private Date d_customerArticleCreateDate;
    private int i_customerArticleDeleteID;
    private Date d_customerArticleDeleteDate;
    private int i_customerArticleUpdateID;
    private Date d_customerArticleUpdateDate;
    private String s_customerArticleActive;

    public M_CustomerArticle(String s_customerArticleCode,
                             M_Article article,
                             BigDecimal d_customerArticleFactor1,
                             String s_customerArticleOperator1,
                             BigDecimal d_customerArticleFactor2,
                             String s_customerArticleOperator2,
                             int i_customerArticleCreateID, Date d_customerArticleCreateDate,
                             int i_customerArticleDeleteID, Date d_customerArticleDeleteDate,
                             int i_customerArticleUpdateID, Date d_customerArticleUpdateDate,
                             String s_customerArticleActive) {
        this.s_customerArticleCode = s_customerArticleCode;
        this.article = article;
        this.d_customerArticleFactor1 = d_customerArticleFactor1;
        this.s_customerArticleOperator1 = s_customerArticleOperator1;
        this.d_customerArticleFactor2 = d_customerArticleFactor2;
        this.s_customerArticleOperator2 = s_customerArticleOperator2;
        this.i_customerArticleCreateID = i_customerArticleCreateID;
        this.d_customerArticleCreateDate = d_customerArticleCreateDate;
        this.i_customerArticleDeleteID = i_customerArticleDeleteID;
        this.d_customerArticleDeleteDate = d_customerArticleDeleteDate;
        this.i_customerArticleUpdateID = i_customerArticleUpdateID;
        this.d_customerArticleUpdateDate = d_customerArticleUpdateDate;
        this.s_customerArticleActive = s_customerArticleActive;
    }

    public M_CustomerArticle() {
    }

    public String getS_customerArticleCode() {
        return s_customerArticleCode;
    }

    public void setS_customerArticleCode(String s_customerArticleCode) {
        this.s_customerArticleCode = s_customerArticleCode;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public BigDecimal getD_customerArticleFactor1() {
        return d_customerArticleFactor1;
    }

    public void setD_customerArticleFactor1(BigDecimal d_customerArticleFactor1) {
        this.d_customerArticleFactor1 = d_customerArticleFactor1;
    }

    public String getS_customerArticleOperator1() {
        return s_customerArticleOperator1;
    }

    public void setS_customerArticleOperator1(String s_customerArticleOperator1) {
        this.s_customerArticleOperator1 = s_customerArticleOperator1;
    }

    public BigDecimal getD_customerArticleFactor2() {
        return d_customerArticleFactor2;
    }

    public void setD_customerArticleFactor2(BigDecimal d_customerArticleFactor2) {
        this.d_customerArticleFactor2 = d_customerArticleFactor2;
    }

    public String getS_customerArticleOperator2() {
        return s_customerArticleOperator2;
    }

    public void setS_customerArticleOperator2(String s_customerArticleOperator2) {
        this.s_customerArticleOperator2 = s_customerArticleOperator2;
    }

    public int getI_customerArticleCreateID() {
        return i_customerArticleCreateID;
    }

    public void setI_customerArticleCreateID(int i_customerArticleCreateID) {
        this.i_customerArticleCreateID = i_customerArticleCreateID;
    }

    public Date getD_customerArticleCreateDate() {
        return d_customerArticleCreateDate;
    }

    public void setD_customerArticleCreateDate(Date d_customerArticleCreateDate) {
        this.d_customerArticleCreateDate = d_customerArticleCreateDate;
    }

    public int getI_customerArticleDeleteID() {
        return i_customerArticleDeleteID;
    }

    public void setI_customerArticleDeleteID(int i_customerArticleDeleteID) {
        this.i_customerArticleDeleteID = i_customerArticleDeleteID;
    }

    public Date getD_customerArticleDeleteDate() {
        return d_customerArticleDeleteDate;
    }

    public void setD_customerArticleDeleteDate(Date d_customerArticleDeleteDate) {
        this.d_customerArticleDeleteDate = d_customerArticleDeleteDate;
    }

    public int getI_customerArticleUpdateID() {
        return i_customerArticleUpdateID;
    }

    public void setI_customerArticleUpdateID(int i_customerArticleUpdateID) {
        this.i_customerArticleUpdateID = i_customerArticleUpdateID;
    }

    public Date getD_customerArticleUpdateDate() {
        return d_customerArticleUpdateDate;
    }

    public void setD_customerArticleUpdateDate(Date d_customerArticleUpdateDate) {
        this.d_customerArticleUpdateDate = d_customerArticleUpdateDate;
    }

    public String getS_customerArticleActive() {
        return s_customerArticleActive;
    }

    public void setS_customerArticleActive(String s_customerArticleActive) {
        this.s_customerArticleActive = s_customerArticleActive;
    }
}
