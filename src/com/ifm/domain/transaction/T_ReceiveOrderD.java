package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Uom;

public class T_ReceiveOrderD implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_receiveOrderDNo;
    private M_Uom uom;
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

    public T_ReceiveOrderD(String s_receiveOrderDNo,
                           M_Uom uom,
                           int i_receiveOrderDSequence,
                           int i_receiveOrderDItemType,
                           String s_receiveOrderDItemCode,
                           String s_receiveOrderDItemRealCode,
                           String s_receiveOrderDItemName,
                           String s_receiveOrderDSerialNo,
                           BigDecimal d_receiveOrderDQtyFactor1,
                           BigDecimal d_receiveOrderDQtyFactor2,
                           BigDecimal d_receiveOrderDQty,
                           BigDecimal d_receiveOrderDQtyDelivered,
                           BigDecimal d_receiveOrderDQtyPaid,
                           BigDecimal d_receiveOrderDPrice,
                           BigDecimal d_receiveOrderDTotal,
                           String s_receiveOrderDComment,
                           byte[] b_receiveOrderDPictureFile,
                           int i_receiveOrderDUpdateID,
                           Date d_receiveOrderDUpdateDate) {
        this.s_receiveOrderDNo = s_receiveOrderDNo;
        this.uom = uom;
        this.i_receiveOrderDSequence = i_receiveOrderDSequence;
        this.i_receiveOrderDItemType = i_receiveOrderDItemType;
        this.s_receiveOrderDItemCode = s_receiveOrderDItemCode;
        this.s_receiveOrderDItemRealCode = s_receiveOrderDItemRealCode;
        this.s_receiveOrderDItemName = s_receiveOrderDItemName;
        this.s_receiveOrderDSerialNo = s_receiveOrderDSerialNo;
        this.d_receiveOrderDQtyFactor1 = d_receiveOrderDQtyFactor1;
        this.d_receiveOrderDQtyFactor2 = d_receiveOrderDQtyFactor2;
        this.d_receiveOrderDQty = d_receiveOrderDQty;
        this.d_receiveOrderDQtyDelivered = d_receiveOrderDQtyDelivered;
        this.d_receiveOrderDQtyPaid = d_receiveOrderDQtyPaid;
        this.d_receiveOrderDPrice = d_receiveOrderDPrice;
        this.d_receiveOrderDTotal = d_receiveOrderDTotal;
        this.s_receiveOrderDComment = s_receiveOrderDComment;
        this.b_receiveOrderDPictureFile = b_receiveOrderDPictureFile;
        this.i_receiveOrderDUpdateID = i_receiveOrderDUpdateID;
        this.d_receiveOrderDUpdateDate = d_receiveOrderDUpdateDate;
    }

    public T_ReceiveOrderD() {
    }

    public String getS_receiveOrderDNo() {
        return s_receiveOrderDNo;
    }

    public void setS_receiveOrderDNo(String s_receiveOrderDNo) {
        this.s_receiveOrderDNo = s_receiveOrderDNo;
    }

    public M_Uom getUom() {
        return uom;
    }

    public void setUom(M_Uom uom) {
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
}
