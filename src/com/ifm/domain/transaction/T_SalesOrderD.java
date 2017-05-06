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

public class T_SalesOrderD {
    private String s_salesOrderDNo;
    private M_Article article;
    private M_Brand brand;
    private M_Coating coating;
    private M_Uom uom;
    private M_Discount discount1;
    private M_Discount discount2;
    private int i_salesOrderDSequence;
    private BigDecimal d_salesOrderDQty;
    private BigDecimal d_salesOrderDQtyDo;
    private BigDecimal d_salesOrderDQtyInvoice;
    private BigDecimal d_salesOrderDPrice;
    private String s_salesOrderDOp1;
    private BigDecimal d_salesOrderDFactor1;
    private String s_salesOrderDOp2;
    private BigDecimal d_salesOrderDFactor2;
    private BigDecimal d_salesOrderDPriceAfterFactor;
    private BigDecimal d_salesOrderDDiscountPct1;
    private BigDecimal d_salesOrderDDiscountPrice1;
    private BigDecimal d_salesOrderDDiscountPct2;
    private BigDecimal d_salesOrderDDiscountPrice2;
    private BigDecimal d_salesOrderDDiscountAmount;
    private BigDecimal d_salesOrderDChargePct;
    private BigDecimal d_salesOrderDChargeAmount;
    private BigDecimal d_salesOrderDTaxPct;
    private BigDecimal d_salesOrderDTaxAmount;
    private BigDecimal d_salesOrderDPphPct;
    private BigDecimal d_salesOrderDPphAmount;
    private BigDecimal d_salesOrderDTotal;
    private BigDecimal d_salesOrderDLengthDefault;
    private String s_salesOrderDDescription1;
    private String s_salesOrderDDescription2;
    private String s_salesOrderDQuotationNo;
    private String s_salesOrderDQuotationDNo;
    private int i_salesOrderDPage;
    private int i_salesOrderDUpdateID;
    private Date d_salesOrderDUpdateDate;

    public T_SalesOrderD(String s_salesOrderDNo,
                         M_Article article,
                         M_Brand brand,
                         M_Coating coating,
                         M_Uom uom,
                         M_Discount discount1,
                         M_Discount discount2,
                         int i_salesOrderDSequence,
                         BigDecimal d_salesOrderDQty,
                         BigDecimal d_salesOrderDQtyDo,
                         BigDecimal d_salesOrderDQtyInvoice,
                         BigDecimal d_salesOrderDPrice,
                         String s_salesOrderDOp1,
                         BigDecimal d_salesOrderDFactor1,
                         String s_salesOrderDOp2,
                         BigDecimal d_salesOrderDFactor2,
                         BigDecimal d_salesOrderDPriceAfterFactor,
                         BigDecimal d_salesOrderDDiscountPct1,
                         BigDecimal d_salesOrderDDiscountPrice1,
                         BigDecimal d_salesOrderDDiscountPct2,
                         BigDecimal d_salesOrderDDiscountPrice2,
                         BigDecimal d_salesOrderDDiscountAmount,
                         BigDecimal d_salesOrderDChargePct,
                         BigDecimal d_salesOrderDChargeAmount,
                         BigDecimal d_salesOrderDTaxPct,
                         BigDecimal d_salesOrderDTaxAmount,
                         BigDecimal d_salesOrderDPphPct,
                         BigDecimal d_salesOrderDPphAmount,
                         BigDecimal d_salesOrderDTotal,
                         BigDecimal d_salesOrderDLengthDefault,
                         String s_salesOrderDDescription1,
                         String s_salesOrderDDescription2,
                         String s_salesOrderDQuotationNo,
                         String s_salesOrderDQuotationDNo,
                         int i_salesOrderDPage,
                         int i_salesOrderDUpdateID,
                         Date d_salesOrderDUpdateDate) {
        this.s_salesOrderDNo = s_salesOrderDNo;
        this.article = article;
        this.brand = brand;
        this.coating = coating;
        this.uom = uom;
        this.discount1 = discount1;
        this.discount2 = discount2;
        this.i_salesOrderDSequence = i_salesOrderDSequence;
        this.d_salesOrderDQty = d_salesOrderDQty;
        this.d_salesOrderDQtyDo = d_salesOrderDQtyDo;
        this.d_salesOrderDQtyInvoice = d_salesOrderDQtyInvoice;
        this.d_salesOrderDPrice = d_salesOrderDPrice;
        this.s_salesOrderDOp1 = s_salesOrderDOp1;
        this.d_salesOrderDFactor1 = d_salesOrderDFactor1;
        this.s_salesOrderDOp2 = s_salesOrderDOp2;
        this.d_salesOrderDFactor2 = d_salesOrderDFactor2;
        this.d_salesOrderDPriceAfterFactor = d_salesOrderDPriceAfterFactor;
        this.d_salesOrderDDiscountPct1 = d_salesOrderDDiscountPct1;
        this.d_salesOrderDDiscountPrice1 = d_salesOrderDDiscountPrice1;
        this.d_salesOrderDDiscountPct2 = d_salesOrderDDiscountPct2;
        this.d_salesOrderDDiscountPrice2 = d_salesOrderDDiscountPrice2;
        this.d_salesOrderDDiscountAmount = d_salesOrderDDiscountAmount;
        this.d_salesOrderDChargePct = d_salesOrderDChargePct;
        this.d_salesOrderDChargeAmount = d_salesOrderDChargeAmount;
        this.d_salesOrderDTaxPct = d_salesOrderDTaxPct;
        this.d_salesOrderDTaxAmount = d_salesOrderDTaxAmount;
        this.d_salesOrderDPphPct = d_salesOrderDPphPct;
        this.d_salesOrderDPphAmount = d_salesOrderDPphAmount;
        this.d_salesOrderDTotal = d_salesOrderDTotal;
        this.d_salesOrderDLengthDefault = d_salesOrderDLengthDefault;
        this.s_salesOrderDDescription1 = s_salesOrderDDescription1;
        this.s_salesOrderDDescription2 = s_salesOrderDDescription2;
        this.s_salesOrderDQuotationNo = s_salesOrderDQuotationNo;
        this.s_salesOrderDQuotationDNo = s_salesOrderDQuotationDNo;
        this.i_salesOrderDPage = i_salesOrderDPage;
        this.i_salesOrderDUpdateID = i_salesOrderDUpdateID;
        this.d_salesOrderDUpdateDate = d_salesOrderDUpdateDate;
    }

    public String getS_salesOrderDNo() {
        return s_salesOrderDNo;
    }

    public void setS_salesOrderDNo(String s_salesOrderDNo) {
        this.s_salesOrderDNo = s_salesOrderDNo;
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

    public int getI_salesOrderDSequence() {
        return i_salesOrderDSequence;
    }

    public void setI_salesOrderDSequence(int i_salesOrderDSequence) {
        this.i_salesOrderDSequence = i_salesOrderDSequence;
    }

    public BigDecimal getD_salesOrderDQty() {
        return d_salesOrderDQty;
    }

    public void setD_salesOrderDQty(BigDecimal d_salesOrderDQty) {
        this.d_salesOrderDQty = d_salesOrderDQty;
    }

    public BigDecimal getD_salesOrderDQtyDo() {
        return d_salesOrderDQtyDo;
    }

    public void setD_salesOrderDQtyDo(BigDecimal d_salesOrderDQtyDo) {
        this.d_salesOrderDQtyDo = d_salesOrderDQtyDo;
    }

    public BigDecimal getD_salesOrderDQtyInvoice() {
        return d_salesOrderDQtyInvoice;
    }

    public void setD_salesOrderDQtyInvoice(BigDecimal d_salesOrderDQtyInvoice) {
        this.d_salesOrderDQtyInvoice = d_salesOrderDQtyInvoice;
    }

    public BigDecimal getD_salesOrderDPrice() {
        return d_salesOrderDPrice;
    }

    public void setD_salesOrderDPrice(BigDecimal d_salesOrderDPrice) {
        this.d_salesOrderDPrice = d_salesOrderDPrice;
    }

    public String getS_salesOrderDOp1() {
        return s_salesOrderDOp1;
    }

    public void setS_salesOrderDOp1(String s_salesOrderDOp1) {
        this.s_salesOrderDOp1 = s_salesOrderDOp1;
    }

    public BigDecimal getD_salesOrderDFactor1() {
        return d_salesOrderDFactor1;
    }

    public void setD_salesOrderDFactor1(BigDecimal d_salesOrderDFactor1) {
        this.d_salesOrderDFactor1 = d_salesOrderDFactor1;
    }

    public String getS_salesOrderDOp2() {
        return s_salesOrderDOp2;
    }

    public void setS_salesOrderDOp2(String s_salesOrderDOp2) {
        this.s_salesOrderDOp2 = s_salesOrderDOp2;
    }

    public BigDecimal getD_salesOrderDFactor2() {
        return d_salesOrderDFactor2;
    }

    public void setD_salesOrderDFactor2(BigDecimal d_salesOrderDFactor2) {
        this.d_salesOrderDFactor2 = d_salesOrderDFactor2;
    }

    public BigDecimal getD_salesOrderDPriceAfterFactor() {
        return d_salesOrderDPriceAfterFactor;
    }

    public void setD_salesOrderDPriceAfterFactor(
            BigDecimal d_salesOrderDPriceAfterFactor) {
        this.d_salesOrderDPriceAfterFactor = d_salesOrderDPriceAfterFactor;
    }

    public BigDecimal getD_salesOrderDDiscountPct1() {
        return d_salesOrderDDiscountPct1;
    }

    public void setD_salesOrderDDiscountPct1(BigDecimal d_salesOrderDDiscountPct1) {
        this.d_salesOrderDDiscountPct1 = d_salesOrderDDiscountPct1;
    }

    public BigDecimal getD_salesOrderDDiscountPrice1() {
        return d_salesOrderDDiscountPrice1;
    }

    public void setD_salesOrderDDiscountPrice1(
            BigDecimal d_salesOrderDDiscountPrice1) {
        this.d_salesOrderDDiscountPrice1 = d_salesOrderDDiscountPrice1;
    }

    public BigDecimal getD_salesOrderDDiscountPct2() {
        return d_salesOrderDDiscountPct2;
    }

    public void setD_salesOrderDDiscountPct2(BigDecimal d_salesOrderDDiscountPct2) {
        this.d_salesOrderDDiscountPct2 = d_salesOrderDDiscountPct2;
    }

    public BigDecimal getD_salesOrderDDiscountPrice2() {
        return d_salesOrderDDiscountPrice2;
    }

    public void setD_salesOrderDDiscountPrice2(
            BigDecimal d_salesOrderDDiscountPrice2) {
        this.d_salesOrderDDiscountPrice2 = d_salesOrderDDiscountPrice2;
    }

    public BigDecimal getD_salesOrderDDiscountAmount() {
        return d_salesOrderDDiscountAmount;
    }

    public void setD_salesOrderDDiscountAmount(
            BigDecimal d_salesOrderDDiscountAmount) {
        this.d_salesOrderDDiscountAmount = d_salesOrderDDiscountAmount;
    }

    public BigDecimal getD_salesOrderDChargePct() {
        return d_salesOrderDChargePct;
    }

    public void setD_salesOrderDChargePct(BigDecimal d_salesOrderDChargePct) {
        this.d_salesOrderDChargePct = d_salesOrderDChargePct;
    }

    public BigDecimal getD_salesOrderDChargeAmount() {
        return d_salesOrderDChargeAmount;
    }

    public void setD_salesOrderDChargeAmount(BigDecimal d_salesOrderDChargeAmount) {
        this.d_salesOrderDChargeAmount = d_salesOrderDChargeAmount;
    }

    public BigDecimal getD_salesOrderDTaxPct() {
        return d_salesOrderDTaxPct;
    }

    public void setD_salesOrderDTaxPct(BigDecimal d_salesOrderDTaxPct) {
        this.d_salesOrderDTaxPct = d_salesOrderDTaxPct;
    }

    public BigDecimal getD_salesOrderDTaxAmount() {
        return d_salesOrderDTaxAmount;
    }

    public void setD_salesOrderDTaxAmount(BigDecimal d_salesOrderDTaxAmount) {
        this.d_salesOrderDTaxAmount = d_salesOrderDTaxAmount;
    }

    public BigDecimal getD_salesOrderDPphPct() {
        return d_salesOrderDPphPct;
    }

    public void setD_salesOrderDPphPct(BigDecimal d_salesOrderDPphPct) {
        this.d_salesOrderDPphPct = d_salesOrderDPphPct;
    }

    public BigDecimal getD_salesOrderDPphAmount() {
        return d_salesOrderDPphAmount;
    }

    public void setD_salesOrderDPphAmount(BigDecimal d_salesOrderDPphAmount) {
        this.d_salesOrderDPphAmount = d_salesOrderDPphAmount;
    }

    public BigDecimal getD_salesOrderDTotal() {
        return d_salesOrderDTotal;
    }

    public void setD_salesOrderDTotal(BigDecimal d_salesOrderDTotal) {
        this.d_salesOrderDTotal = d_salesOrderDTotal;
    }

    public BigDecimal getD_salesOrderDLengthDefault() {
        return d_salesOrderDLengthDefault;
    }

    public void setD_salesOrderDLengthDefault(BigDecimal d_salesOrderDLengthDefault) {
        this.d_salesOrderDLengthDefault = d_salesOrderDLengthDefault;
    }

    public String getS_salesOrderDDescription1() {
        return s_salesOrderDDescription1;
    }

    public void setS_salesOrderDDescription1(String s_salesOrderDDescription1) {
        this.s_salesOrderDDescription1 = s_salesOrderDDescription1;
    }

    public String getS_salesOrderDDescription2() {
        return s_salesOrderDDescription2;
    }

    public void setS_salesOrderDDescription2(String s_salesOrderDDescription2) {
        this.s_salesOrderDDescription2 = s_salesOrderDDescription2;
    }

    public String getS_salesOrderDQuotationNo() {
        return s_salesOrderDQuotationNo;
    }

    public void setS_salesOrderDQuotationNo(String s_salesOrderDQuotationNo) {
        this.s_salesOrderDQuotationNo = s_salesOrderDQuotationNo;
    }

    public String getS_salesOrderDQuotationDNo() {
        return s_salesOrderDQuotationDNo;
    }

    public void setS_salesOrderDQuotationDNo(String s_salesOrderDQuotationDNo) {
        this.s_salesOrderDQuotationDNo = s_salesOrderDQuotationDNo;
    }

    public int getI_salesOrderDPage() {
        return i_salesOrderDPage;
    }

    public void setI_salesOrderDPage(int i_salesOrderDPage) {
        this.i_salesOrderDPage = i_salesOrderDPage;
    }

    public int getI_salesOrderDUpdateID() {
        return i_salesOrderDUpdateID;
    }

    public void setI_salesOrderDUpdateID(int i_salesOrderDUpdateID) {
        this.i_salesOrderDUpdateID = i_salesOrderDUpdateID;
    }

    public Date getD_salesOrderDUpdateDate() {
        return d_salesOrderDUpdateDate;
    }

    public void setD_salesOrderDUpdateDate(Date d_salesOrderDUpdateDate) {
        this.d_salesOrderDUpdateDate = d_salesOrderDUpdateDate;
    }
}
