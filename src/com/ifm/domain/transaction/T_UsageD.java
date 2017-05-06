package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Uom;

public class T_UsageD {
    private String s_usageDNo;
    private M_Article article;
    private M_Uom uom;
    private int i_usageDSequence;
    private String s_usageDSerialNo;
    private BigDecimal d_usageDQty;
    private String s_usageDDescription;
    private int i_usageDUpdateID;
    private Date d_usageDUpdateDate;

    public T_UsageD() {
    }

    public T_UsageD(String s_usageDNo,
                    M_Article article,
                    M_Uom uom,
                    int i_usageDSequence,
                    String s_usageDSerialNo,
                    BigDecimal d_usageDQty,
                    String s_usageDDescription,
                    int i_usageDUpdateID,
                    Date d_usageDUpdateDate) {
        this.s_usageDNo = s_usageDNo;
        this.article = article;
        this.uom = uom;
        this.i_usageDSequence = i_usageDSequence;
        this.s_usageDSerialNo = s_usageDSerialNo;
        this.d_usageDQty = d_usageDQty;
        this.s_usageDDescription = s_usageDDescription;
        this.i_usageDUpdateID = i_usageDUpdateID;
        this.d_usageDUpdateDate = d_usageDUpdateDate;
    }

    public String getS_usageDNo() {
        return s_usageDNo;
    }

    public void setS_usageDNo(String s_usageDNo) {
        this.s_usageDNo = s_usageDNo;
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

    public int getI_usageDSequence() {
        return i_usageDSequence;
    }

    public void setI_usageDSequence(int i_usageDSequence) {
        this.i_usageDSequence = i_usageDSequence;
    }

    public String getS_usageDSerialNo() {
        return s_usageDSerialNo;
    }

    public void setS_usageDSerialNo(String s_usageDSerialNo) {
        this.s_usageDSerialNo = s_usageDSerialNo;
    }

    public BigDecimal getD_usageDQty() {
        return d_usageDQty;
    }

    public void setD_usageDQty(BigDecimal d_usageDQty) {
        this.d_usageDQty = d_usageDQty;
    }

    public String getS_usageDDescription() {
        return s_usageDDescription;
    }

    public void setS_usageDDescription(String s_usageDDescription) {
        this.s_usageDDescription = s_usageDDescription;
    }

    public int getI_usageDUpdateID() {
        return i_usageDUpdateID;
    }

    public void setI_usageDUpdateID(int i_usageDUpdateID) {
        this.i_usageDUpdateID = i_usageDUpdateID;
    }

    public Date getD_usageDUpdateDate() {
        return d_usageDUpdateDate;
    }

    public void setD_usageDUpdateDate(Date d_usageDUpdateDate) {
        this.d_usageDUpdateDate = d_usageDUpdateDate;
    }
}
