package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Transaction implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_transactionCode;
    private String s_transactionName;
    private String s_transactionStockType;
    private int i_transactionCreateID;
    private Date d_transactionCreateDate;
    private int i_transactionDeleteID;
    private Date d_transactionDeleteDate;
    private int i_transactionUpdateID;
    private Date d_transactionUpdateDate;
    private String s_transactionActive;

    public M_Transaction(String s_transactionCode,
                         String s_transactionName,
                         String s_transactionStockType,
                         int i_transactionCreateID, Date d_transactionCreateDate,
                         int i_transactionDeleteID, Date d_transactionDeleteDate,
                         int i_transactionUpdateID, Date d_transactionUpdateDate,
                         String s_transactionActive) {
        this.s_transactionCode = s_transactionCode;
        this.s_transactionName = s_transactionName;
        this.i_transactionCreateID = i_transactionCreateID;
        this.d_transactionCreateDate = d_transactionCreateDate;
        this.i_transactionDeleteID = i_transactionDeleteID;
        this.d_transactionDeleteDate = d_transactionDeleteDate;
        this.i_transactionUpdateID = i_transactionUpdateID;
        this.d_transactionUpdateDate = d_transactionUpdateDate;
        this.s_transactionActive = s_transactionActive;
    }

    public M_Transaction() {
    }

    public String getS_transactionCode() {
        return s_transactionCode;
    }

    public void setS_transactionCode(String s_transactionCode) {
        this.s_transactionCode = s_transactionCode;
    }

    public String getS_transactionName() {
        return s_transactionName;
    }

    public void setS_transactionName(String s_transactionName) {
        this.s_transactionName = s_transactionName;
    }

    public String getS_transactionStockType() {
        return s_transactionStockType;
    }

    public void setS_transactionStockType(String s_transactionStockType) {
        this.s_transactionStockType = s_transactionStockType;
    }

    public int getI_transactionCreateID() {
        return i_transactionCreateID;
    }

    public void setI_transactionCreateID(int i_transactionCreateID) {
        this.i_transactionCreateID = i_transactionCreateID;
    }

    public Date getD_transactionCreateDate() {
        return d_transactionCreateDate;
    }

    public void setD_transactionCreateDate(Date d_transactionCreateDate) {
        this.d_transactionCreateDate = d_transactionCreateDate;
    }

    public int getI_transactionDeleteID() {
        return i_transactionDeleteID;
    }

    public void setI_transactionDeleteID(int i_transactionDeleteID) {
        this.i_transactionDeleteID = i_transactionDeleteID;
    }

    public Date getD_transactionDeleteDate() {
        return d_transactionDeleteDate;
    }

    public void setD_transactionDeleteDate(Date d_transactionDeleteDate) {
        this.d_transactionDeleteDate = d_transactionDeleteDate;
    }

    public int getI_transactionUpdateID() {
        return i_transactionUpdateID;
    }

    public void setI_transactionUpdateID(int i_transactionUpdateID) {
        this.i_transactionUpdateID = i_transactionUpdateID;
    }

    public Date getD_transactionUpdateDate() {
        return d_transactionUpdateDate;
    }

    public void setD_transactionUpdateDate(Date d_transactionUpdateDate) {
        this.d_transactionUpdateDate = d_transactionUpdateDate;
    }

    public String getS_transactionActive() {
        return s_transactionActive;
    }

    public void setS_transactionActive(String s_transactionActive) {
        this.s_transactionActive = s_transactionActive;
    }
}
