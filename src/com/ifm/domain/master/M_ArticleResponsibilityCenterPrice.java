package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_ArticleResponsibilityCenterPrice {
    private String s_articleResponsibilityCenterPriceCode;
    private M_ResponsibilityCenter responsibilitycenter;
    private BigDecimal d_articleResponsibilityCenterPrice;
    private int i_articleResponsibilityCenterPriceCreateID;
    private Date d_articleResponsibilityCenterPriceCreateDate;
    private int i_articleResponsibilityCenterPriceUpdateID;
    private Date d_articleResponsibilityCenterPriceUpdateDate;

    public M_ArticleResponsibilityCenterPrice(String s_articleResponsibilityCenterPriceCode,
                                              M_ResponsibilityCenter responsibilitycenter,
                                              BigDecimal d_articleResponsibilityCenterPrice,
                                              int i_articleResponsibilityCenterPriceCreateID,
                                              Date d_articleResponsibilityCenterPriceCreateDate,
                                              int i_articleResponsibilityCenterPriceUpdateID,
                                              Date d_articleResponsibilityCenterPriceUpdateDate) {
        this.s_articleResponsibilityCenterPriceCode = s_articleResponsibilityCenterPriceCode;
        this.responsibilitycenter = responsibilitycenter;
        this.d_articleResponsibilityCenterPrice = d_articleResponsibilityCenterPrice;
        this.i_articleResponsibilityCenterPriceCreateID = i_articleResponsibilityCenterPriceCreateID;
        this.d_articleResponsibilityCenterPriceCreateDate = d_articleResponsibilityCenterPriceCreateDate;
        this.i_articleResponsibilityCenterPriceUpdateID = i_articleResponsibilityCenterPriceUpdateID;
        this.d_articleResponsibilityCenterPriceUpdateDate = d_articleResponsibilityCenterPriceUpdateDate;
    }

    public M_ArticleResponsibilityCenterPrice() {
    }

    public String getS_articleResponsibilityCenterPriceCode() {
        return s_articleResponsibilityCenterPriceCode;
    }

    public void setS_articleResponsibilityCenterPriceCode(
            String s_articleResponsibilityCenterPriceCode) {
        this.s_articleResponsibilityCenterPriceCode = s_articleResponsibilityCenterPriceCode;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public BigDecimal getD_articleResponsibilityCenterPrice() {
        return d_articleResponsibilityCenterPrice;
    }

    public void setD_articleResponsibilityCenterPrice(
            BigDecimal d_articleResponsibilityCenterPrice) {
        this.d_articleResponsibilityCenterPrice = d_articleResponsibilityCenterPrice;
    }

    public int getI_articleResponsibilityCenterPriceCreateID() {
        return i_articleResponsibilityCenterPriceCreateID;
    }

    public void setI_articleResponsibilityCenterPriceCreateID(
            int i_articleResponsibilityCenterPriceCreateID) {
        this.i_articleResponsibilityCenterPriceCreateID = i_articleResponsibilityCenterPriceCreateID;
    }

    public Date getD_articleResponsibilityCenterPriceCreateDate() {
        return d_articleResponsibilityCenterPriceCreateDate;
    }

    public void setD_articleResponsibilityCenterPriceCreateDate(
            Date d_articleResponsibilityCenterPriceCreateDate) {
        this.d_articleResponsibilityCenterPriceCreateDate = d_articleResponsibilityCenterPriceCreateDate;
    }

    public int getI_articleResponsibilityCenterPriceUpdateID() {
        return i_articleResponsibilityCenterPriceUpdateID;
    }

    public void setI_articleResponsibilityCenterPriceUpdateID(
            int i_articleResponsibilityCenterPriceUpdateID) {
        this.i_articleResponsibilityCenterPriceUpdateID = i_articleResponsibilityCenterPriceUpdateID;
    }

    public Date getD_articleResponsibilityCenterPriceUpdateDate() {
        return d_articleResponsibilityCenterPriceUpdateDate;
    }

    public void setD_articleResponsibilityCenterPriceUpdateDate(
            Date d_articleResponsibilityCenterPriceUpdateDate) {
        this.d_articleResponsibilityCenterPriceUpdateDate = d_articleResponsibilityCenterPriceUpdateDate;
    }
}
