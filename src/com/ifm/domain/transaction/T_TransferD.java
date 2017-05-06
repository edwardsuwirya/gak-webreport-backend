package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.master.M_Rack;
import com.ifm.domain.master.M_RackLevel;
import com.ifm.domain.master.M_RackSection;
import com.ifm.domain.master.M_Room;

public class T_TransferD {
    private String s_transferDNo;
    private M_Article article;
    private M_Uom uom;
    private M_Room room;
    private M_Rack rack;
    private M_RackLevel racklevel;
    private M_RackSection racksection;
    private int i_transferDSequence;
    private int i_transferDRefSequence;
    private String s_transferDSerialNo;
    private BigDecimal d_transferDQty;
    private BigDecimal d_transferDQtyReceive;
    private String s_transferDDescription;
    private int i_transferDUpdateID;
    private Date d_transferDUpdateDate;

    public T_TransferD() {
    }

    public T_TransferD(String s_transferDNo,
                       M_Article article,
                       M_Uom uom,
                       M_Room room,
                       M_Rack rack,
                       M_RackLevel racklevel,
                       M_RackSection racksection,
                       int i_transferDSequence,
                       int i_transferDRefSequence,
                       String s_transferDSerialNo,
                       BigDecimal d_transferDQty,
                       BigDecimal d_transferDQtyReceive,
                       String s_transferDDescription,
                       int i_transferDUpdateID,
                       Date d_transferDUpdateDate) {
        this.s_transferDNo = s_transferDNo;
        this.article = article;
        this.uom = uom;
        this.room = room;
        this.rack = rack;
        this.racklevel = racklevel;
        this.racksection = racksection;
        this.i_transferDSequence = i_transferDSequence;
        this.i_transferDRefSequence = i_transferDRefSequence;
        this.s_transferDSerialNo = s_transferDSerialNo;
        this.d_transferDQty = d_transferDQty;
        this.d_transferDQtyReceive = d_transferDQtyReceive;
        this.s_transferDDescription = s_transferDDescription;
        this.i_transferDUpdateID = i_transferDUpdateID;
        this.d_transferDUpdateDate = d_transferDUpdateDate;
    }

    public String getS_transferDNo() {
        return s_transferDNo;
    }

    public void setS_transferDNo(String s_transferDNo) {
        this.s_transferDNo = s_transferDNo;
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

    public M_Room getRoom() {
        return room;
    }

    public void setRoom(M_Room room) {
        this.room = room;
    }

    public M_Rack getRack() {
        return rack;
    }

    public void setRack(M_Rack rack) {
        this.rack = rack;
    }

    public M_RackLevel getRacklevel() {
        return racklevel;
    }

    public void setRacklevel(M_RackLevel racklevel) {
        this.racklevel = racklevel;
    }

    public M_RackSection getRacksection() {
        return racksection;
    }

    public void setRacksection(M_RackSection racksection) {
        this.racksection = racksection;
    }

    public int getI_transferDSequence() {
        return i_transferDSequence;
    }

    public void setI_transferDSequence(int i_transferDSequence) {
        this.i_transferDSequence = i_transferDSequence;
    }

    public int getI_transferDRefSequence() {
        return i_transferDRefSequence;
    }

    public void setI_transferDRefSequence(int i_transferDRefSequence) {
        this.i_transferDRefSequence = i_transferDRefSequence;
    }

    public String getS_transferDSerialNo() {
        return s_transferDSerialNo;
    }

    public void setS_transferDSerialNo(String s_transferDSerialNo) {
        this.s_transferDSerialNo = s_transferDSerialNo;
    }

    public BigDecimal getD_transferDQty() {
        return d_transferDQty;
    }

    public void setD_transferDQty(BigDecimal d_transferDQty) {
        this.d_transferDQty = d_transferDQty;
    }

    public BigDecimal getD_transferDQtyReceive() {
        return d_transferDQtyReceive;
    }

    public void setD_transferDQtyReceive(BigDecimal d_transferDQtyReceive) {
        this.d_transferDQtyReceive = d_transferDQtyReceive;
    }

    public String getS_transferDDescription() {
        return s_transferDDescription;
    }

    public void setS_transferDDescription(String s_transferDDescription) {
        this.s_transferDDescription = s_transferDDescription;
    }

    public int getI_transferDUpdateID() {
        return i_transferDUpdateID;
    }

    public void setI_transferDUpdateID(int i_transferDUpdateID) {
        this.i_transferDUpdateID = i_transferDUpdateID;
    }

    public Date getD_transferDUpdateDate() {
        return d_transferDUpdateDate;
    }

    public void setD_transferDUpdateDate(Date d_transferDUpdateDate) {
        this.d_transferDUpdateDate = d_transferDUpdateDate;
    }
}
