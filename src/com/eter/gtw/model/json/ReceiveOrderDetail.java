package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class ReceiveOrderDetail {
    private String s_receiveOrderDNo;
    private String uom;
    private int i_receiveOrderDSequence;
    private int i_receiveOrderDItemType;
    private String s_receiveOrderDItemCode;
    private String s_receiveOrderDItemRealCode;
    private String s_receiveOrderDItemName;
    private String s_receiveOrderDSerialNo;
    private BigDecimal d_receiveOrderDQtyFactor1;
    private BigDecimal d_receiveOrderDQtyFactor2;
    private BigDecimal d_receiveOrderDQty;
    private BigDecimal d_receiveOrderDQtyDelivered;
    private BigDecimal d_receiveOrderDQtyPaid;
    private BigDecimal d_receiveOrderDPrice;
    private BigDecimal d_receiveOrderDTotal;
    private String s_receiveOrderDComment;
    private byte[] b_receiveOrderDPictureFile;
    private int i_receiveOrderDUpdateID;
    private Date d_receiveOrderDUpdateDate;

    public String getS_receiveOrderDNo() {
        return s_receiveOrderDNo;
    }

    public void setS_receiveOrderDNo(String s_receiveOrderDNo) {
        this.s_receiveOrderDNo = s_receiveOrderDNo;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public int getI_receiveOrderDSequence() {
        return i_receiveOrderDSequence;
    }

    public void setI_receiveOrderDSequence(int i_receiveOrderDSequence) {
        this.i_receiveOrderDSequence = i_receiveOrderDSequence;
    }

    public int getI_receiveOrderDItemType() {
        return i_receiveOrderDItemType;
    }

    public void setI_receiveOrderDItemType(int i_receiveOrderDItemType) {
        this.i_receiveOrderDItemType = i_receiveOrderDItemType;
    }

    public String getS_receiveOrderDItemCode() {
        return s_receiveOrderDItemCode;
    }

    public void setS_receiveOrderDItemCode(String s_receiveOrderDItemCode) {
        this.s_receiveOrderDItemCode = s_receiveOrderDItemCode;
    }

    public String getS_receiveOrderDItemRealCode() {
        return s_receiveOrderDItemRealCode;
    }

    public void setS_receiveOrderDItemRealCode(String s_receiveOrderDItemRealCode) {
        this.s_receiveOrderDItemRealCode = s_receiveOrderDItemRealCode;
    }

    public String getS_receiveOrderDItemName() {
        return s_receiveOrderDItemName;
    }

    public void setS_receiveOrderDItemName(String s_receiveOrderDItemName) {
        this.s_receiveOrderDItemName = s_receiveOrderDItemName;
    }

    public String getS_receiveOrderDSerialNo() {
        return s_receiveOrderDSerialNo;
    }

    public void setS_receiveOrderDSerialNo(String s_receiveOrderDSerialNo) {
        this.s_receiveOrderDSerialNo = s_receiveOrderDSerialNo;
    }

    public BigDecimal getD_receiveOrderDQtyFactor1() {
        return d_receiveOrderDQtyFactor1;
    }

    public void setD_receiveOrderDQtyFactor1(BigDecimal d_receiveOrderDQtyFactor1) {
        this.d_receiveOrderDQtyFactor1 = d_receiveOrderDQtyFactor1;
    }

    public BigDecimal getD_receiveOrderDQtyFactor2() {
        return d_receiveOrderDQtyFactor2;
    }

    public void setD_receiveOrderDQtyFactor2(BigDecimal d_receiveOrderDQtyFactor2) {
        this.d_receiveOrderDQtyFactor2 = d_receiveOrderDQtyFactor2;
    }

    public BigDecimal getD_receiveOrderDQty() {
        return d_receiveOrderDQty;
    }

    public void setD_receiveOrderDQty(BigDecimal d_receiveOrderDQty) {
        this.d_receiveOrderDQty = d_receiveOrderDQty;
    }

    public BigDecimal getD_receiveOrderDQtyDelivered() {
        return d_receiveOrderDQtyDelivered;
    }

    public void setD_receiveOrderDQtyDelivered(
            BigDecimal d_receiveOrderDQtyDelivered) {
        this.d_receiveOrderDQtyDelivered = d_receiveOrderDQtyDelivered;
    }

    public BigDecimal getD_receiveOrderDQtyPaid() {
        return d_receiveOrderDQtyPaid;
    }

    public void setD_receiveOrderDQtyPaid(BigDecimal d_receiveOrderDQtyPaid) {
        this.d_receiveOrderDQtyPaid = d_receiveOrderDQtyPaid;
    }

    public BigDecimal getD_receiveOrderDPrice() {
        return d_receiveOrderDPrice;
    }

    public void setD_receiveOrderDPrice(BigDecimal d_receiveOrderDPrice) {
        this.d_receiveOrderDPrice = d_receiveOrderDPrice;
    }

    public BigDecimal getD_receiveOrderDTotal() {
        return d_receiveOrderDTotal;
    }

    public void setD_receiveOrderDTotal(BigDecimal d_receiveOrderDTotal) {
        this.d_receiveOrderDTotal = d_receiveOrderDTotal;
    }

    public String getS_receiveOrderDComment() {
        return s_receiveOrderDComment;
    }

    public void setS_receiveOrderDComment(String s_receiveOrderDComment) {
        this.s_receiveOrderDComment = s_receiveOrderDComment;
    }

    public byte[] getB_receiveOrderDPictureFile() {
        return b_receiveOrderDPictureFile;
    }

    public void setB_receiveOrderDPictureFile(byte[] b_receiveOrderDPictureFile) {
        this.b_receiveOrderDPictureFile = b_receiveOrderDPictureFile;
    }

    public int getI_receiveOrderDUpdateID() {
        return i_receiveOrderDUpdateID;
    }

    public void setI_receiveOrderDUpdateID(int i_receiveOrderDUpdateID) {
        this.i_receiveOrderDUpdateID = i_receiveOrderDUpdateID;
    }

    public Date getD_receiveOrderDUpdateDate() {
        return d_receiveOrderDUpdateDate;
    }

    public void setD_receiveOrderDUpdateDate(Date d_receiveOrderDUpdateDate) {
        this.d_receiveOrderDUpdateDate = d_receiveOrderDUpdateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("s_receiveOrderDNo: " + String.valueOf(getS_receiveOrderDNo()) + "\n");
        sb.append("uom: " + String.valueOf(getUom()) + "\n");
        sb.append("i_receiveOrderDSequence: " + String.valueOf(getI_receiveOrderDSequence()) + "\n");
        sb.append("i_receiveOrderDItemType: " + String.valueOf(getI_receiveOrderDItemType()) + "\n");
        sb.append("s_receiveOrderDItemCode: " + String.valueOf(getS_receiveOrderDItemCode()) + "\n");
        sb.append("s_receiveOrderDItemRealCode: " + String.valueOf(getS_receiveOrderDItemRealCode()) + "\n");
        sb.append("s_receiveOrderDItemName: " + String.valueOf(getS_receiveOrderDItemName()) + "\n");
        sb.append("s_receiveOrderDSerialNo: " + String.valueOf(getS_receiveOrderDSerialNo()) + "\n");
        sb.append("d_receiveOrderDQtyFactor1: " + String.valueOf(getD_receiveOrderDQtyFactor1()) + "\n");
        sb.append("d_receiveOrderDQtyFactor2: " + String.valueOf(getD_receiveOrderDQtyFactor2()) + "\n");
        sb.append("d_receiveOrderDQty: " + String.valueOf(getD_receiveOrderDQty()) + "\n");
        sb.append("d_receiveOrderDQtyDelivered: " + String.valueOf(getD_receiveOrderDQtyDelivered()) + "\n");
        sb.append("d_receiveOrderDQtyPaid: " + String.valueOf(getD_receiveOrderDQtyPaid()) + "\n");
        sb.append("d_receiveOrderDPrice: " + String.valueOf(getD_receiveOrderDPrice()) + "\n");
        sb.append("d_receiveOrderDTotal: " + String.valueOf(getD_receiveOrderDTotal()) + "\n");
        sb.append("s_receiveOrderDComment: " + String.valueOf(getS_receiveOrderDComment()) + "\n");
        sb.append("b_receiveOrderDPictureFile: " + String.valueOf(getB_receiveOrderDPictureFile()) + "\n");
        sb.append("i_receiveOrderDUpdateID: " + String.valueOf(getI_receiveOrderDUpdateID()) + "\n");
        sb.append("d_receiveOrderDUpdateDate: " + String.valueOf(getD_receiveOrderDUpdateDate()) + "\n");

        return sb.toString();
    }
}
