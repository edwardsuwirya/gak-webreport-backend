package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_ArticleZonePrice {
    private String s_articleZonePriceCode;
    private M_Zone zone;
    private BigDecimal d_articleZonePrice;
    private int i_articleZonePriceCreateID;
    private Date d_articleZonePriceCreateDate;
    private int i_articleZonePriceUpdateID;
    private Date d_articleZonePriceUpdateDate;

    public M_ArticleZonePrice(String s_articleZonePriceCode,
                              M_Zone zone,
                              BigDecimal d_articleZonePrice,
                              int i_articleZonePriceCreateID,
                              Date d_articleZonePriceCreateDate,
                              int i_articleZonePriceUpdateID,
                              Date d_articleZonePriceUpdateDate) {
        this.s_articleZonePriceCode = s_articleZonePriceCode;
        this.zone = zone;
        this.d_articleZonePrice = d_articleZonePrice;
        this.i_articleZonePriceCreateID = i_articleZonePriceCreateID;
        this.d_articleZonePriceCreateDate = d_articleZonePriceCreateDate;
        this.i_articleZonePriceUpdateID = i_articleZonePriceUpdateID;
        this.d_articleZonePriceUpdateDate = d_articleZonePriceUpdateDate;
    }

    public M_ArticleZonePrice() {
    }

    public String getS_articleZonePriceCode() {
        return s_articleZonePriceCode;
    }

    public void setS_articleZonePriceCode(String s_articleZonePriceCode) {
        this.s_articleZonePriceCode = s_articleZonePriceCode;
    }

    public M_Zone getZone() {
        return zone;
    }

    public void setZone(M_Zone zone) {
        this.zone = zone;
    }

    public BigDecimal getD_articleZonePrice() {
        return d_articleZonePrice;
    }

    public void setD_articleZonePrice(BigDecimal d_articleZonePrice) {
        this.d_articleZonePrice = d_articleZonePrice;
    }

    public int getI_articleZonePriceCreateID() {
        return i_articleZonePriceCreateID;
    }

    public void setI_articleZonePriceCreateID(int i_articleZonePriceCreateID) {
        this.i_articleZonePriceCreateID = i_articleZonePriceCreateID;
    }

    public Date getD_articleZonePriceCreateDate() {
        return d_articleZonePriceCreateDate;
    }

    public void setD_articleZonePriceCreateDate(Date d_articleZonePriceCreateDate) {
        this.d_articleZonePriceCreateDate = d_articleZonePriceCreateDate;
    }

    public int getI_articleZonePriceUpdateID() {
        return i_articleZonePriceUpdateID;
    }

    public void setI_articleZonePriceUpdateID(int i_articleZonePriceUpdateID) {
        this.i_articleZonePriceUpdateID = i_articleZonePriceUpdateID;
    }

    public Date getD_articleZonePriceUpdateDate() {
        return d_articleZonePriceUpdateDate;
    }

    public void setD_articleZonePriceUpdateDate(Date d_articleZonePriceUpdateDate) {
        this.d_articleZonePriceUpdateDate = d_articleZonePriceUpdateDate;
    }
}
