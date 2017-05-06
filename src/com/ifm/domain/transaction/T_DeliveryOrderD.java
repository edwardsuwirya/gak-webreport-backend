package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Coating;
import com.ifm.domain.master.M_Uom;

public class T_DeliveryOrderD implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_deliveryOrderDNo;
    private M_Article article;
    private M_Uom uom;
    private M_Coating coating;
    private int i_deliveryorderDSequence;
    private int i_deliveryorderDRefSequence;
    private String s_deliveryorderDSerialNo;
    private BigDecimal d_deliveryorderDQty;
    private BigDecimal d_deliveryorderDQtyRetur;
    private BigDecimal d_deliveryorderDLengthDefault;
    private String s_deliveryOrderDDescription1;
    private String s_deliveryOrderDDescription2;
    private int i_deliveryorderDUpdateID;
    private Date d_deliveryorderDUpdateDate;

    public T_DeliveryOrderD(String s_deliveryOrderDNo,
                            M_Article article,
                            M_Uom uom,
                            M_Coating coating,
                            int i_deliveryorderDSequence,
                            int i_deliveryorderDRefSequence,
                            String s_deliveryorderDSerialNo,
                            BigDecimal d_deliveryorderDQty,
                            BigDecimal d_deliveryorderDQtyRetur,
                            BigDecimal d_deliveryorderDLengthDefault,
                            String s_deliveryOrderDDescription1,
                            String s_deliveryOrderDDescription2,
                            int i_deliveryorderDUpdateID,
                            Date d_deliveryorderDUpdateDate) {
        this.s_deliveryOrderDNo = s_deliveryOrderDNo;
        this.article = article;
        this.uom = uom;
        this.coating = coating;
        this.i_deliveryorderDSequence = i_deliveryorderDSequence;
        this.i_deliveryorderDRefSequence = i_deliveryorderDRefSequence;
        this.s_deliveryorderDSerialNo = s_deliveryorderDSerialNo;
        this.d_deliveryorderDQty = d_deliveryorderDQty;
        this.d_deliveryorderDQtyRetur = d_deliveryorderDQtyRetur;
        this.d_deliveryorderDLengthDefault = d_deliveryorderDLengthDefault;
        this.s_deliveryOrderDDescription1 = s_deliveryOrderDDescription1;
        this.s_deliveryOrderDDescription2 = s_deliveryOrderDDescription2;
        this.i_deliveryorderDUpdateID = i_deliveryorderDUpdateID;
        this.d_deliveryorderDUpdateDate = d_deliveryorderDUpdateDate;
    }

    public T_DeliveryOrderD() {
    }

    public String getS_deliveryOrderDNo() {
        return s_deliveryOrderDNo;
    }

    public void setS_deliveryOrderDNo(String s_deliveryOrderDNo) {
        this.s_deliveryOrderDNo = s_deliveryOrderDNo;
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

    public M_Coating getCoating() {
        return coating;
    }

    public void setCoating(M_Coating coating) {
        this.coating = coating;
    }

    public int getI_deliveryorderDSequence() {
        return i_deliveryorderDSequence;
    }

    public void setI_deliveryorderDSequence(int i_deliveryorderDSequence) {
        this.i_deliveryorderDSequence = i_deliveryorderDSequence;
    }

    public int getI_deliveryorderDRefSequence() {
        return i_deliveryorderDRefSequence;
    }

    public void setI_deliveryorderDRefSequence(int i_deliveryorderDRefSequence) {
        this.i_deliveryorderDRefSequence = i_deliveryorderDRefSequence;
    }

    public String getS_deliveryorderDSerialNo() {
        return s_deliveryorderDSerialNo;
    }

    public void setS_deliveryorderDSerialNo(String s_deliveryorderDSerialNo) {
        this.s_deliveryorderDSerialNo = s_deliveryorderDSerialNo;
    }

    public BigDecimal getD_deliveryorderDQty() {
        return d_deliveryorderDQty;
    }

    public void setD_deliveryorderDQty(BigDecimal d_deliveryorderDQty) {
        this.d_deliveryorderDQty = d_deliveryorderDQty;
    }

    public BigDecimal getD_deliveryorderDQtyRetur() {
        return d_deliveryorderDQtyRetur;
    }

    public void setD_deliveryorderDQtyRetur(BigDecimal d_deliveryorderDQtyRetur) {
        this.d_deliveryorderDQtyRetur = d_deliveryorderDQtyRetur;
    }

    public BigDecimal getD_deliveryorderDLengthDefault() {
        return d_deliveryorderDLengthDefault;
    }

    public void setD_deliveryorderDLengthDefault(
            BigDecimal d_deliveryorderDLengthDefault) {
        this.d_deliveryorderDLengthDefault = d_deliveryorderDLengthDefault;
    }

    public String getS_deliveryOrderDDescription1() {
        return s_deliveryOrderDDescription1;
    }

    public void setS_deliveryOrderDDescription1(String s_deliveryOrderDDescription1) {
        this.s_deliveryOrderDDescription1 = s_deliveryOrderDDescription1;
    }

    public String getS_deliveryOrderDDescription2() {
        return s_deliveryOrderDDescription2;
    }

    public void setS_deliveryOrderDDescription2(String s_deliveryOrderDDescription2) {
        this.s_deliveryOrderDDescription2 = s_deliveryOrderDDescription2;
    }

    public int getI_deliveryorderDUpdateID() {
        return i_deliveryorderDUpdateID;
    }

    public void setI_deliveryorderDUpdateID(int i_deliveryorderDUpdateID) {
        this.i_deliveryorderDUpdateID = i_deliveryorderDUpdateID;
    }

    public Date getD_deliveryorderDUpdateDate() {
        return d_deliveryorderDUpdateDate;
    }

    public void setD_deliveryorderDUpdateDate(Date d_deliveryorderDUpdateDate) {
        this.d_deliveryorderDUpdateDate = d_deliveryorderDUpdateDate;
    }
}
