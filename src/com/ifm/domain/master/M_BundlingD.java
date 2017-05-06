package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_BundlingD {
    private String s_bundlingDCode;
    private M_Article article;
    private M_Uom uom;
    private BigDecimal d_bundlingDQty;
    private int i_bundlingDUpdateID;
    private Date d_bundlingDUpdateDate;

    public M_BundlingD(String s_bundlingDCode,
                       M_Article article,
                       M_Uom uom,
                       BigDecimal d_bundlingDQty,
                       int i_bundlingDUpdateID,
                       Date d_bundlingDUpdateDate) {
        this.s_bundlingDCode = s_bundlingDCode;
        this.article = article;
        this.uom = uom;
        this.d_bundlingDQty = d_bundlingDQty;
        this.i_bundlingDUpdateID = i_bundlingDUpdateID;
        this.d_bundlingDUpdateDate = d_bundlingDUpdateDate;
    }

    public String getS_bundlingDCode() {
        return s_bundlingDCode;
    }

    public void setS_bundlingDCode(String s_bundlingDCode) {
        this.s_bundlingDCode = s_bundlingDCode;
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

    public BigDecimal getD_bundlingDQty() {
        return d_bundlingDQty;
    }

    public void setD_bundlingDQty(BigDecimal d_bundlingDQty) {
        this.d_bundlingDQty = d_bundlingDQty;
    }

    public int getI_bundlingDUpdateID() {
        return i_bundlingDUpdateID;
    }

    public void setI_bundlingDUpdateID(int i_bundlingDUpdateID) {
        this.i_bundlingDUpdateID = i_bundlingDUpdateID;
    }

    public Date getD_bundlingDUpdateDate() {
        return d_bundlingDUpdateDate;
    }

    public void setD_bundlingDUpdateDate(Date d_bundlingDUpdateDate) {
        this.d_bundlingDUpdateDate = d_bundlingDUpdateDate;
    }
}
