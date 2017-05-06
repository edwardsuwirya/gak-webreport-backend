package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Uom;

public class T_SalesInvoiceD implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_salesInvoiceDNo;
    private M_Article article;
    private M_Uom uom;
    private int i_salesInvoiceDSequence;
    private int i_salesInvoiceDRefSequence;
    private String s_salesinvoiceDSerialNo;
    private BigDecimal d_salesInvoiceDQty;
    private BigDecimal d_salesInvoiceDQtyRetur;
    private BigDecimal d_salesInvoiceDQtyTax;
    private BigDecimal d_salesInvoiceDSubTotal;
    private BigDecimal d_salesInvoiceDDiscount;
    private BigDecimal d_salesInvoiceDVoucher;
    private BigDecimal d_salesInvoiceDTax;
    private BigDecimal d_salesInvoiceDPph;
    private BigDecimal d_salesInvoiceDServiceCharge;
    private BigDecimal d_salesInvoiceDBonus;
    private BigDecimal d_salesInvoiceDGrandTotal;
    private BigDecimal d_salesInvoiceDLengthDefault;
    private String s_salesinvoiceDTaxNo;
    private int i_salesInvoiceDUpdateID;
    private Date d_salesInvoiceDUpdateDate;

    public T_SalesInvoiceD(String s_salesInvoiceDNo,
                           M_Article article,
                           M_Uom uom,
                           int i_salesInvoiceDSequence,
                           int i_salesInvoiceDRefSequence,
                           String s_salesinvoiceDSerialNo,
                           BigDecimal d_salesInvoiceDQty,
                           BigDecimal d_salesInvoiceDQtyRetur,
                           BigDecimal d_salesInvoiceDQtyTax,
                           BigDecimal d_salesInvoiceDSubTotal,
                           BigDecimal d_salesInvoiceDDiscount,
                           BigDecimal d_salesInvoiceDVoucher,
                           BigDecimal d_salesInvoiceDTax,
                           BigDecimal d_salesInvoiceDPph,
                           BigDecimal d_salesInvoiceDServiceCharge,
                           BigDecimal d_salesInvoiceDBonus,
                           BigDecimal d_salesInvoiceDGrandTotal,
                           BigDecimal d_salesInvoiceDLengthDefault,
                           String s_salesinvoiceDTaxNo,
                           int i_salesInvoiceDUpdateID,
                           Date d_salesInvoiceDUpdateDate) {
        this.s_salesInvoiceDNo = s_salesInvoiceDNo;
        this.article = article;
        this.uom = uom;
        this.i_salesInvoiceDSequence = i_salesInvoiceDSequence;
        this.i_salesInvoiceDRefSequence = i_salesInvoiceDRefSequence;
        this.s_salesinvoiceDSerialNo = s_salesinvoiceDSerialNo;
        this.d_salesInvoiceDQty = d_salesInvoiceDQty;
        this.d_salesInvoiceDQtyRetur = d_salesInvoiceDQtyRetur;
        this.d_salesInvoiceDQtyTax = d_salesInvoiceDQtyTax;
        this.d_salesInvoiceDSubTotal = d_salesInvoiceDSubTotal;
        this.d_salesInvoiceDDiscount = d_salesInvoiceDDiscount;
        this.d_salesInvoiceDVoucher = d_salesInvoiceDVoucher;
        this.d_salesInvoiceDTax = d_salesInvoiceDTax;
        this.d_salesInvoiceDPph = d_salesInvoiceDPph;
        this.d_salesInvoiceDServiceCharge = d_salesInvoiceDServiceCharge;
        this.d_salesInvoiceDBonus = d_salesInvoiceDBonus;
        this.d_salesInvoiceDGrandTotal = d_salesInvoiceDGrandTotal;
        this.d_salesInvoiceDLengthDefault = d_salesInvoiceDLengthDefault;
        this.s_salesinvoiceDTaxNo = s_salesinvoiceDTaxNo;
        this.i_salesInvoiceDUpdateID = i_salesInvoiceDUpdateID;
        this.d_salesInvoiceDUpdateDate = d_salesInvoiceDUpdateDate;
    }

    public T_SalesInvoiceD() {
    }

    public String getS_salesInvoiceDNo() {
        return s_salesInvoiceDNo;
    }

    public void setS_salesInvoiceDNo(String s_salesInvoiceDNo) {
        this.s_salesInvoiceDNo = s_salesInvoiceDNo;
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

    public int getI_salesInvoiceDSequence() {
        return i_salesInvoiceDSequence;
    }

    public void setI_salesInvoiceDSequence(int i_salesInvoiceDSequence) {
        this.i_salesInvoiceDSequence = i_salesInvoiceDSequence;
    }

    public int getI_salesInvoiceDRefSequence() {
        return i_salesInvoiceDRefSequence;
    }

    public void setI_salesInvoiceDRefSequence(int i_salesInvoiceDRefSequence) {
        this.i_salesInvoiceDRefSequence = i_salesInvoiceDRefSequence;
    }

    public String getS_salesinvoiceDSerialNo() {
        return s_salesinvoiceDSerialNo;
    }

    public void setS_salesinvoiceDSerialNo(String s_salesinvoiceDSerialNo) {
        this.s_salesinvoiceDSerialNo = s_salesinvoiceDSerialNo;
    }

    public BigDecimal getD_salesInvoiceDQty() {
        return d_salesInvoiceDQty;
    }

    public void setD_salesInvoiceDQty(BigDecimal d_salesInvoiceDQty) {
        this.d_salesInvoiceDQty = d_salesInvoiceDQty;
    }

    public BigDecimal getD_salesInvoiceDQtyRetur() {
        return d_salesInvoiceDQtyRetur;
    }

    public void setD_salesInvoiceDQtyRetur(BigDecimal d_salesInvoiceDQtyRetur) {
        this.d_salesInvoiceDQtyRetur = d_salesInvoiceDQtyRetur;
    }

    public BigDecimal getD_salesInvoiceDQtyTax() {
        return d_salesInvoiceDQtyTax;
    }

    public void setD_salesInvoiceDQtyTax(BigDecimal d_salesInvoiceDQtyTax) {
        this.d_salesInvoiceDQtyTax = d_salesInvoiceDQtyTax;
    }

    public BigDecimal getD_salesInvoiceDSubTotal() {
        return d_salesInvoiceDSubTotal;
    }

    public void setD_salesInvoiceDSubTotal(BigDecimal d_salesInvoiceDSubTotal) {
        this.d_salesInvoiceDSubTotal = d_salesInvoiceDSubTotal;
    }

    public BigDecimal getD_salesInvoiceDDiscount() {
        return d_salesInvoiceDDiscount;
    }

    public void setD_salesInvoiceDDiscount(BigDecimal d_salesInvoiceDDiscount) {
        this.d_salesInvoiceDDiscount = d_salesInvoiceDDiscount;
    }

    public BigDecimal getD_salesInvoiceDVoucher() {
        return d_salesInvoiceDVoucher;
    }

    public void setD_salesInvoiceDVoucher(BigDecimal d_salesInvoiceDVoucher) {
        this.d_salesInvoiceDVoucher = d_salesInvoiceDVoucher;
    }

    public BigDecimal getD_salesInvoiceDTax() {
        return d_salesInvoiceDTax;
    }

    public void setD_salesInvoiceDTax(BigDecimal d_salesInvoiceDTax) {
        this.d_salesInvoiceDTax = d_salesInvoiceDTax;
    }

    public BigDecimal getD_salesInvoiceDPph() {
        return d_salesInvoiceDPph;
    }

    public void setD_salesInvoiceDPph(BigDecimal d_salesInvoiceDPph) {
        this.d_salesInvoiceDPph = d_salesInvoiceDPph;
    }

    public BigDecimal getD_salesInvoiceDServiceCharge() {
        return d_salesInvoiceDServiceCharge;
    }

    public void setD_salesInvoiceDServiceCharge(
            BigDecimal d_salesInvoiceDServiceCharge) {
        this.d_salesInvoiceDServiceCharge = d_salesInvoiceDServiceCharge;
    }

    public BigDecimal getD_salesInvoiceDBonus() {
        return d_salesInvoiceDBonus;
    }

    public void setD_salesInvoiceDBonus(BigDecimal d_salesInvoiceDBonus) {
        this.d_salesInvoiceDBonus = d_salesInvoiceDBonus;
    }

    public BigDecimal getD_salesInvoiceDGrandTotal() {
        return d_salesInvoiceDGrandTotal;
    }

    public void setD_salesInvoiceDGrandTotal(BigDecimal d_salesInvoiceDGrandTotal) {
        this.d_salesInvoiceDGrandTotal = d_salesInvoiceDGrandTotal;
    }

    public BigDecimal getD_salesInvoiceDLengthDefault() {
        return d_salesInvoiceDLengthDefault;
    }

    public void setD_salesInvoiceDLengthDefault(
            BigDecimal d_salesInvoiceDLengthDefault) {
        this.d_salesInvoiceDLengthDefault = d_salesInvoiceDLengthDefault;
    }

    public String getS_salesinvoiceDTaxNo() {
        return s_salesinvoiceDTaxNo;
    }

    public void setS_salesinvoiceDTaxNo(String s_salesinvoiceDTaxNo) {
        this.s_salesinvoiceDTaxNo = s_salesinvoiceDTaxNo;
    }

    public int getI_salesInvoiceDUpdateID() {
        return i_salesInvoiceDUpdateID;
    }

    public void setI_salesInvoiceDUpdateID(int i_salesInvoiceDUpdateID) {
        this.i_salesInvoiceDUpdateID = i_salesInvoiceDUpdateID;
    }

    public Date getD_salesInvoiceDUpdateDate() {
        return d_salesInvoiceDUpdateDate;
    }

    public void setD_salesInvoiceDUpdateDate(Date d_salesInvoiceDUpdateDate) {
        this.d_salesInvoiceDUpdateDate = d_salesInvoiceDUpdateDate;
    }
}
