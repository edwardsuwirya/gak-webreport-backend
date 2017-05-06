package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Brand;
import com.ifm.domain.master.M_Coating;
import com.ifm.domain.master.M_Discount;
import com.ifm.domain.master.M_Uom;

public class T_QuotationD {
    private String s_quotationDNo;
    private M_Article article;
    private M_Brand brand;
    private M_Coating coating;
    private M_Uom uom;
    private M_Discount discount1;
    private M_Discount discount2;
    private int i_quotationDSequence;
    private BigDecimal d_quotationDQty;
    private BigDecimal d_quotationDQtyOrder;
    private BigDecimal d_quotationDPrice;
    private String s_quotationDOp1;
    private BigDecimal d_quotationDFactor1;
    private String s_quotationDOp2;
    private BigDecimal d_quotationDFactor2;
    private BigDecimal d_quotationDPriceAfterFactor;
    private BigDecimal d_quotationDDiscountPct1;
    private BigDecimal d_quotationDDiscountPrice1;
    private BigDecimal d_quotationDDiscountPct2;
    private BigDecimal d_quotationDDiscountPrice2;
    private BigDecimal d_quotationDDiscountAmount;
    private BigDecimal d_quotationDChargePct;
    private BigDecimal d_quotationDChargeAmount;
    private BigDecimal d_quotationDTaxPct;
    private BigDecimal d_quotationDTaxAmount;
    private BigDecimal d_quotationDPphPct;
    private BigDecimal d_quotationDPphAmount;
    private BigDecimal d_quotationDTotal;
    private BigDecimal d_quotationDLengthDefault;
    private String s_quotationDDescription1;
    private String s_quotationDDescription2;
    private int i_quotationDUpdateID;
    private Date d_quotationDUpdateDate;

    public T_QuotationD(String s_quotationDNo,
                        M_Article article,
                        M_Brand brand,
                        M_Coating coating,
                        M_Uom uom,
                        M_Discount discount1,
                        M_Discount discount2,
                        int i_quotationDSequence,
                        BigDecimal d_quotationDQty,
                        BigDecimal d_quotationDQtyOrder,
                        BigDecimal d_quotationDPrice,
                        String s_quotationDOp1,
                        BigDecimal d_quotationDFactor1,
                        String s_quotationDOp2,
                        BigDecimal d_quotationDFactor2,
                        BigDecimal d_quotationDPriceAfterFactor,
                        BigDecimal d_quotationDDiscountPct1,
                        BigDecimal d_quotationDDiscountPrice1,
                        BigDecimal d_quotationDDiscountPct2,
                        BigDecimal d_quotationDDiscountPrice2,
                        BigDecimal d_quotationDDiscountAmount,
                        BigDecimal d_quotationDChargePct,
                        BigDecimal d_quotationDChargeAmount,
                        BigDecimal d_quotationDTaxPct,
                        BigDecimal d_quotationDTaxAmount,
                        BigDecimal d_quotationDPphPct,
                        BigDecimal d_quotationDPphAmount,
                        BigDecimal d_quotationDTotal,
                        BigDecimal d_quotationDLengthDefault,
                        String s_quotationDDescription1,
                        String s_quotationDDescription2,
                        int i_quotationDUpdateID,
                        Date d_quotationDUpdateDate) {
        this.s_quotationDNo = s_quotationDNo;
        this.article = article;
        this.brand = brand;
        this.coating = coating;
        this.uom = uom;
        this.discount1 = discount1;
        this.discount2 = discount2;
        this.i_quotationDSequence = i_quotationDSequence;
        this.d_quotationDQty = d_quotationDQty;
        this.d_quotationDQtyOrder = d_quotationDQtyOrder;
        this.d_quotationDPrice = d_quotationDPrice;
        this.s_quotationDOp1 = s_quotationDOp1;
        this.d_quotationDFactor1 = d_quotationDFactor1;
        this.s_quotationDOp2 = s_quotationDOp2;
        this.d_quotationDFactor2 = d_quotationDFactor2;
        this.d_quotationDPriceAfterFactor = d_quotationDPriceAfterFactor;
        this.d_quotationDDiscountPct1 = d_quotationDDiscountPct1;
        this.d_quotationDDiscountPrice1 = d_quotationDDiscountPrice1;
        this.d_quotationDDiscountPct2 = d_quotationDDiscountPct2;
        this.d_quotationDDiscountPrice2 = d_quotationDDiscountPrice2;
        this.d_quotationDDiscountAmount = d_quotationDDiscountAmount;
        this.d_quotationDChargePct = d_quotationDChargePct;
        this.d_quotationDChargeAmount = d_quotationDChargeAmount;
        this.d_quotationDTaxPct = d_quotationDTaxPct;
        this.d_quotationDTaxAmount = d_quotationDTaxAmount;
        this.d_quotationDPphPct = d_quotationDPphPct;
        this.d_quotationDPphAmount = d_quotationDPphAmount;
        this.d_quotationDTotal = d_quotationDTotal;
        this.d_quotationDLengthDefault = d_quotationDLengthDefault;
        this.s_quotationDDescription1 = s_quotationDDescription1;
        this.s_quotationDDescription2 = s_quotationDDescription2;
        this.i_quotationDUpdateID = i_quotationDUpdateID;
        this.d_quotationDUpdateDate = d_quotationDUpdateDate;
    }

    public String getS_quotationDNo() {
        return s_quotationDNo;
    }

    public void setS_quotationDNo(String s_quotationDNo) {
        this.s_quotationDNo = s_quotationDNo;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public M_Brand getBrand() {
        return brand;
    }

    public void setBrand(M_Brand brand) {
        this.brand = brand;
    }

    public M_Coating getCoating() {
        return coating;
    }

    public void setCoating(M_Coating coating) {
        this.coating = coating;
    }

    public M_Uom getUom() {
        return uom;
    }

    public void setUom(M_Uom uom) {
        this.uom = uom;
    }


    public M_Discount getDiscount1() {
        return discount1;
    }

    public void setDiscount1(M_Discount discount1) {
        this.discount1 = discount1;
    }

    public M_Discount getDiscount2() {
        return discount2;
    }

    public void setDiscount2(M_Discount discount2) {
        this.discount2 = discount2;
    }

    public int getI_quotationDSequence() {
        return i_quotationDSequence;
    }

    public void setI_quotationDSequence(int i_quotationDSequence) {
        this.i_quotationDSequence = i_quotationDSequence;
    }

    public BigDecimal getD_quotationDQty() {
        return d_quotationDQty;
    }

    public void setD_quotationDQty(BigDecimal d_quotationDQty) {
        this.d_quotationDQty = d_quotationDQty;
    }

    public BigDecimal getD_quotationDQtyOrder() {
        return d_quotationDQtyOrder;
    }

    public void setD_quotationDQtyOrder(BigDecimal d_quotationDQtyOrder) {
        this.d_quotationDQtyOrder = d_quotationDQtyOrder;
    }

    public BigDecimal getD_quotationDPrice() {
        return d_quotationDPrice;
    }

    public void setD_quotationDPrice(BigDecimal d_quotationDPrice) {
        this.d_quotationDPrice = d_quotationDPrice;
    }

    public String getS_quotationDOp1() {
        return s_quotationDOp1;
    }

    public void setS_quotationDOp1(String s_quotationDOp1) {
        this.s_quotationDOp1 = s_quotationDOp1;
    }

    public BigDecimal getD_quotationDFactor1() {
        return d_quotationDFactor1;
    }

    public void setD_quotationDFactor1(BigDecimal d_quotationDFactor1) {
        this.d_quotationDFactor1 = d_quotationDFactor1;
    }

    public String getS_quotationDOp2() {
        return s_quotationDOp2;
    }

    public void setS_quotationDOp2(String s_quotationDOp2) {
        this.s_quotationDOp2 = s_quotationDOp2;
    }

    public BigDecimal getD_quotationDFactor2() {
        return d_quotationDFactor2;
    }

    public void setD_quotationDFactor2(BigDecimal d_quotationDFactor2) {
        this.d_quotationDFactor2 = d_quotationDFactor2;
    }

    public BigDecimal getD_quotationDPriceAfterFactor() {
        return d_quotationDPriceAfterFactor;
    }

    public void setD_quotationDPriceAfterFactor(
            BigDecimal d_quotationDPriceAfterFactor) {
        this.d_quotationDPriceAfterFactor = d_quotationDPriceAfterFactor;
    }

    public BigDecimal getD_quotationDDiscountPct1() {
        return d_quotationDDiscountPct1;
    }

    public void setD_quotationDDiscountPct1(BigDecimal d_quotationDDiscountPct1) {
        this.d_quotationDDiscountPct1 = d_quotationDDiscountPct1;
    }

    public BigDecimal getD_quotationDDiscountPrice1() {
        return d_quotationDDiscountPrice1;
    }

    public void setD_quotationDDiscountPrice1(BigDecimal d_quotationDDiscountPrice1) {
        this.d_quotationDDiscountPrice1 = d_quotationDDiscountPrice1;
    }

    public BigDecimal getD_quotationDDiscountPct2() {
        return d_quotationDDiscountPct2;
    }

    public void setD_quotationDDiscountPct2(BigDecimal d_quotationDDiscountPct2) {
        this.d_quotationDDiscountPct2 = d_quotationDDiscountPct2;
    }

    public BigDecimal getD_quotationDDiscountPrice2() {
        return d_quotationDDiscountPrice2;
    }

    public void setD_quotationDDiscountPrice2(BigDecimal d_quotationDDiscountPrice2) {
        this.d_quotationDDiscountPrice2 = d_quotationDDiscountPrice2;
    }

    public BigDecimal getD_quotationDDiscountAmount() {
        return d_quotationDDiscountAmount;
    }

    public void setD_quotationDDiscountAmount(BigDecimal d_quotationDDiscountAmount) {
        this.d_quotationDDiscountAmount = d_quotationDDiscountAmount;
    }

    public BigDecimal getD_quotationDChargePct() {
        return d_quotationDChargePct;
    }

    public void setD_quotationDChargePct(BigDecimal d_quotationDChargePct) {
        this.d_quotationDChargePct = d_quotationDChargePct;
    }

    public BigDecimal getD_quotationDChargeAmount() {
        return d_quotationDChargeAmount;
    }

    public void setD_quotationDChargeAmount(BigDecimal d_quotationDChargeAmount) {
        this.d_quotationDChargeAmount = d_quotationDChargeAmount;
    }

    public BigDecimal getD_quotationDTaxPct() {
        return d_quotationDTaxPct;
    }

    public void setD_quotationDTaxPct(BigDecimal d_quotationDTaxPct) {
        this.d_quotationDTaxPct = d_quotationDTaxPct;
    }

    public BigDecimal getD_quotationDTaxAmount() {
        return d_quotationDTaxAmount;
    }

    public void setD_quotationDTaxAmount(BigDecimal d_quotationDTaxAmount) {
        this.d_quotationDTaxAmount = d_quotationDTaxAmount;
    }

    public BigDecimal getD_quotationDPphPct() {
        return d_quotationDPphPct;
    }

    public void setD_quotationDPphPct(BigDecimal d_quotationDPphPct) {
        this.d_quotationDPphPct = d_quotationDPphPct;
    }

    public BigDecimal getD_quotationDPphAmount() {
        return d_quotationDPphAmount;
    }

    public void setD_quotationDPphAmount(BigDecimal d_quotationDPphAmount) {
        this.d_quotationDPphAmount = d_quotationDPphAmount;
    }

    public BigDecimal getD_quotationDTotal() {
        return d_quotationDTotal;
    }

    public void setD_quotationDTotal(BigDecimal d_quotationDTotal) {
        this.d_quotationDTotal = d_quotationDTotal;
    }

    public BigDecimal getD_quotationDLengthDefault() {
        return d_quotationDLengthDefault;
    }

    public void setD_quotationDLengthDefault(BigDecimal d_quotationDLengthDefault) {
        this.d_quotationDLengthDefault = d_quotationDLengthDefault;
    }

    public String getS_quotationDDescription1() {
        return s_quotationDDescription1;
    }

    public void setS_quotationDDescription1(String s_quotationDDescription1) {
        this.s_quotationDDescription1 = s_quotationDDescription1;
    }

    public String getS_quotationDDescription2() {
        return s_quotationDDescription2;
    }

    public void setS_quotationDDescription2(String s_quotationDDescription2) {
        this.s_quotationDDescription2 = s_quotationDDescription2;
    }

    public int getI_quotationDUpdateID() {
        return i_quotationDUpdateID;
    }

    public void setI_quotationDUpdateID(int i_quotationDUpdateID) {
        this.i_quotationDUpdateID = i_quotationDUpdateID;
    }

    public Date getD_quotationDUpdateDate() {
        return d_quotationDUpdateDate;
    }

    public void setD_quotationDUpdateDate(Date d_quotationDUpdateDate) {
        this.d_quotationDUpdateDate = d_quotationDUpdateDate;
    }
}
