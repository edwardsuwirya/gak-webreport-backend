package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Transaction;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.master.M_Warehouse;
import com.ifm.domain.master.M_Rack;
import com.ifm.domain.master.M_RackLevel;
import com.ifm.domain.master.M_RackSection;
import com.ifm.domain.master.M_Room;

public class T_StockCard implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_tscTransNo;
    private M_Company company;
    private M_Transaction transaction;
    private int i_tscItemSequence;
    private M_Article article;
    private String s_tscTransSerialNo;
    private String s_tscTransRealNo;
    private String s_tscTransRefNo;
    private String s_tscTransRefRealNo;
    private M_Warehouse warehouse;
    private M_Room room;
    private M_Rack rack;
    private M_RackLevel racklevel;
    private M_RackSection racksection;
    private Date d_tscTransDate;
    private BigDecimal d_tscTransQty;
    private M_Uom qtyuom;
    private BigDecimal d_tscTransUomMultiplier;
    private BigDecimal d_tscTransQtyInventory;
    private M_Uom qtyuominventory;
    private String s_tscTransCOGS;
    private BigDecimal d_tscTransQtyUnitCost;
    private BigDecimal d_tscTransQtyInventoryUnitCost;
    private BigDecimal d_tscTransQtyInventoryAvgCost;
    private int i_tscTransCreateID;
    private Date d_tscTransCreateDate;

    public T_StockCard(String s_tscTransNo,
                       M_Company company,
                       M_Transaction transaction,
                       int i_tscItemSequence,
                       M_Article article,
                       String s_tscTransSerialNo,
                       String s_tscTransRealNo,
                       String s_tscTransRefNo,
                       String s_tscTransRefRealNo,
                       M_Warehouse warehouse,
                       M_Room room,
                       M_Rack rack,
                       M_RackLevel racklevel,
                       M_RackSection racksection,
                       Date d_tscTransDate,
                       BigDecimal d_tscTransQty,
                       M_Uom qtyuom,
                       BigDecimal d_tscTransUomMultiplier,
                       BigDecimal d_tscTransQtyInventory,
                       M_Uom qtyuominventory,
                       String s_tscTransCOGS,
                       BigDecimal d_tscTransQtyUnitCost,
                       BigDecimal d_tscTransQtyInventoryUnitCost,
                       BigDecimal d_tscTransQtyInventoryAvgCost,
                       int i_tscTransCreateID,
                       Date d_tscTransCreateDate) {
        this.s_tscTransNo = s_tscTransNo;
        this.company = company;
        this.transaction = transaction;
        this.i_tscItemSequence = i_tscItemSequence;
        this.article = article;
        this.s_tscTransSerialNo = s_tscTransSerialNo;
        this.s_tscTransRealNo = s_tscTransRealNo;
        this.s_tscTransRefNo = s_tscTransRefNo;
        this.s_tscTransRefRealNo = s_tscTransRefRealNo;
        this.warehouse = warehouse;
        this.room = room;
        this.rack = rack;
        this.racklevel = racklevel;
        this.racksection = racksection;
        this.d_tscTransDate = d_tscTransDate;
        this.d_tscTransQty = d_tscTransQty;
        this.qtyuom = qtyuom;
        this.d_tscTransUomMultiplier = d_tscTransUomMultiplier;
        this.d_tscTransQtyInventory = d_tscTransQtyInventory;
        this.qtyuominventory = qtyuominventory;
        this.s_tscTransCOGS = s_tscTransCOGS;
        this.d_tscTransQtyUnitCost = d_tscTransQtyUnitCost;
        this.d_tscTransQtyInventoryUnitCost = d_tscTransQtyInventoryUnitCost;
        this.d_tscTransQtyInventoryAvgCost = d_tscTransQtyInventoryAvgCost;
        this.i_tscTransCreateID = i_tscTransCreateID;
        this.d_tscTransCreateDate = d_tscTransCreateDate;
    }

    public T_StockCard() {
    }

    public String getS_tscTransNo() {
        return s_tscTransNo;
    }

    public void setS_tscTransNo(String s_tscTransNo) {
        this.s_tscTransNo = s_tscTransNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(M_Transaction transaction) {
        this.transaction = transaction;
    }

    public int getI_tscItemSequence() {
        return i_tscItemSequence;
    }

    public void setI_tscItemSequence(int i_tscItemSequence) {
        this.i_tscItemSequence = i_tscItemSequence;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public String getS_tscTransSerialNo() {
        return s_tscTransSerialNo;
    }

    public void setS_tscTransSerialNo(String s_tscTransSerialNo) {
        this.s_tscTransSerialNo = s_tscTransSerialNo;
    }

    public String getS_tscTransRealNo() {
        return s_tscTransRealNo;
    }

    public void setS_tscTransRealNo(String s_tscTransRealNo) {
        this.s_tscTransRealNo = s_tscTransRealNo;
    }

    public String getS_tscTransRefNo() {
        return s_tscTransRefNo;
    }

    public void setS_tscTransRefNo(String s_tscTransRefNo) {
        this.s_tscTransRefNo = s_tscTransRefNo;
    }

    public String getS_tscTransRefRealNo() {
        return s_tscTransRefRealNo;
    }

    public void setS_tscTransRefRealNo(String s_tscTransRefRealNo) {
        this.s_tscTransRefRealNo = s_tscTransRefRealNo;
    }

    public M_Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(M_Warehouse warehouse) {
        this.warehouse = warehouse;
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

    public Date getD_tscTransDate() {
        return d_tscTransDate;
    }

    public void setD_tscTransDate(Date d_tscTransDate) {
        this.d_tscTransDate = d_tscTransDate;
    }

    public BigDecimal getD_tscTransQty() {
        return d_tscTransQty;
    }

    public void setD_tscTransQty(BigDecimal d_tscTransQty) {
        this.d_tscTransQty = d_tscTransQty;
    }

    public M_Uom getQtyuom() {
        return qtyuom;
    }

    public void setQtyuom(M_Uom qtyuom) {
        this.qtyuom = qtyuom;
    }

    public BigDecimal getD_tscTransUomMultiplier() {
        return d_tscTransUomMultiplier;
    }

    public void setD_tscTransUomMultiplier(BigDecimal d_tscTransUomMultiplier) {
        this.d_tscTransUomMultiplier = d_tscTransUomMultiplier;
    }

    public BigDecimal getD_tscTransQtyInventory() {
        return d_tscTransQtyInventory;
    }

    public void setD_tscTransQtyInventory(BigDecimal d_tscTransQtyInventory) {
        this.d_tscTransQtyInventory = d_tscTransQtyInventory;
    }

    public M_Uom getQtyuominventory() {
        return qtyuominventory;
    }

    public void setQtyuominventory(M_Uom qtyuominventory) {
        this.qtyuominventory = qtyuominventory;
    }

    public String getS_tscTransCOGS() {
        return s_tscTransCOGS;
    }

    public void setS_tscTransCOGS(String s_tscTransCOGS) {
        this.s_tscTransCOGS = s_tscTransCOGS;
    }

    public BigDecimal getD_tscTransQtyUnitCost() {
        return d_tscTransQtyUnitCost;
    }

    public void setD_tscTransQtyUnitCost(BigDecimal d_tscTransQtyUnitCost) {
        this.d_tscTransQtyUnitCost = d_tscTransQtyUnitCost;
    }

    public BigDecimal getD_tscTransQtyInventoryUnitCost() {
        return d_tscTransQtyInventoryUnitCost;
    }

    public void setD_tscTransQtyInventoryUnitCost(
            BigDecimal d_tscTransQtyInventoryUnitCost) {
        this.d_tscTransQtyInventoryUnitCost = d_tscTransQtyInventoryUnitCost;
    }

    public BigDecimal getD_tscTransQtyInventoryAvgCost() {
        return d_tscTransQtyInventoryAvgCost;
    }

    public void setD_tscTransQtyInventoryAvgCost(
            BigDecimal d_tscTransQtyInventoryAvgCost) {
        this.d_tscTransQtyInventoryAvgCost = d_tscTransQtyInventoryAvgCost;
    }

    public int getI_tscTransCreateID() {
        return i_tscTransCreateID;
    }

    public void setI_tscTransCreateID(int i_tscTransCreateID) {
        this.i_tscTransCreateID = i_tscTransCreateID;
    }

    public Date getD_tscTransCreateDate() {
        return d_tscTransCreateDate;
    }

    public void setD_tscTransCreateDate(Date d_tscTransCreateDate) {
        this.d_tscTransCreateDate = d_tscTransCreateDate;
    }
}
