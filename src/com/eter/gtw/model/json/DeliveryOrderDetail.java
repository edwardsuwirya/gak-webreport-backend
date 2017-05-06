package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryOrderDetail {
    private String s_deliveryOrderDNo;
    private String article;
    private String uom;
    private String coating;
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

    public String getS_deliveryOrderDNo() {
        return s_deliveryOrderDNo;
    }

    public void setS_deliveryOrderDNo(String s_deliveryOrderDNo) {
        this.s_deliveryOrderDNo = s_deliveryOrderDNo;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getCoating() {
        return coating;
    }

    public void setCoating(String coating) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_deliveryOrderDNo: " + String.valueOf(s_deliveryOrderDNo) + "\n");
        sb.append("article: " + String.valueOf(article) + "\n");
        sb.append("uom: " + String.valueOf(uom) + "\n");
        sb.append("coating: " + String.valueOf(coating) + "\n");
        sb.append("i_deliveryorderDSequence: " + String.valueOf(i_deliveryorderDSequence) + "\n");
        sb.append("i_deliveryorderDRefSequence: " + String.valueOf(i_deliveryorderDRefSequence) + "\n");
        sb.append("s_deliveryorderDSerialNo: " + String.valueOf(s_deliveryorderDSerialNo) + "\n");
        sb.append("d_deliveryorderDQty: " + String.valueOf(d_deliveryorderDQty) + "\n");
        sb.append("d_deliveryorderDQtyRetur: " + String.valueOf(d_deliveryorderDQtyRetur) + "\n");
        sb.append("d_deliveryorderDLengthDefault: " + String.valueOf(d_deliveryorderDLengthDefault) + "\n");
        sb.append("s_deliveryOrderDDescription1: " + String.valueOf(s_deliveryOrderDDescription1) + "\n");
        sb.append("s_deliveryOrderDDescription2: " + String.valueOf(s_deliveryOrderDDescription2) + "\n");
        sb.append("i_deliveryorderDUpdateID: " + String.valueOf(i_deliveryorderDUpdateID) + "\n");
        sb.append("d_deliveryorderDUpdateDate: " + String.valueOf(d_deliveryorderDUpdateDate) + "\n");

        return sb.toString();
    }
}
