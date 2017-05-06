package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_CustomerIDCard implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_customerIDCardCode;
    private M_IDCard idcard;
    private int i_customerIDCardNo;
    private String s_customerIDCardIDCardNo;
    private int i_customerIDCardCreateID;
    private Date d_customerIDCardCreateDate;
    private int i_customerIDCardDeleteID;
    private Date d_customerIDCardDeleteDate;
    private int i_customerIDCardUpdateID;
    private Date d_customerIDCardUpdateDate;
    private String s_customerIDCardActive;

    public M_CustomerIDCard(String s_customerIDCardCode,
                            M_IDCard idcard,
                            int i_customerIDCardNo,
                            String s_customerIDCardIDCardNo,
                            int i_customerIDCardCreateID,
                            Date d_customerIDCardCreateDate,
                            int i_customerIDCardDeleteID,
                            Date d_customerIDCardDeleteDate,
                            int i_customerIDCardUpdateID,
                            Date d_customerIDCardUpdateDate,
                            String s_customerIDCardActive) {
        this.s_customerIDCardCode = s_customerIDCardCode;
        this.idcard = idcard;
        this.i_customerIDCardNo = i_customerIDCardNo;
        this.s_customerIDCardIDCardNo = s_customerIDCardIDCardNo;
        this.i_customerIDCardCreateID = i_customerIDCardCreateID;
        this.d_customerIDCardCreateDate = d_customerIDCardCreateDate;
        this.i_customerIDCardDeleteID = i_customerIDCardDeleteID;
        this.d_customerIDCardDeleteDate = d_customerIDCardDeleteDate;
        this.i_customerIDCardUpdateID = i_customerIDCardUpdateID;
        this.d_customerIDCardUpdateDate = d_customerIDCardUpdateDate;
        this.s_customerIDCardActive = s_customerIDCardActive;
    }

    public M_CustomerIDCard() {
    }

    public String getS_customerIDCardCode() {
        return s_customerIDCardCode;
    }

    public void setS_customerIDCardCode(String s_customerIDCardCode) {
        this.s_customerIDCardCode = s_customerIDCardCode;
    }

    public M_IDCard getIdcard() {
        return idcard;
    }

    public void setIdcard(M_IDCard idcard) {
        this.idcard = idcard;
    }

    public int getI_customerIDCardNo() {
        return i_customerIDCardNo;
    }

    public void setI_customerIDCardNo(int i_customerIDCardNo) {
        this.i_customerIDCardNo = i_customerIDCardNo;
    }

    public String getS_customerIDCardIDCardNo() {
        return s_customerIDCardIDCardNo;
    }

    public void setS_customerIDCardIDCardNo(String s_customerIDCardIDCardNo) {
        this.s_customerIDCardIDCardNo = s_customerIDCardIDCardNo;
    }

    public int getI_customerIDCardCreateID() {
        return i_customerIDCardCreateID;
    }

    public void setI_customerIDCardCreateID(int i_customerIDCardCreateID) {
        this.i_customerIDCardCreateID = i_customerIDCardCreateID;
    }

    public Date getD_customerIDCardCreateDate() {
        return d_customerIDCardCreateDate;
    }

    public void setD_customerIDCardCreateDate(Date d_customerIDCardCreateDate) {
        this.d_customerIDCardCreateDate = d_customerIDCardCreateDate;
    }

    public int getI_customerIDCardDeleteID() {
        return i_customerIDCardDeleteID;
    }

    public void setI_customerIDCardDeleteID(int i_customerIDCardDeleteID) {
        this.i_customerIDCardDeleteID = i_customerIDCardDeleteID;
    }

    public Date getD_customerIDCardDeleteDate() {
        return d_customerIDCardDeleteDate;
    }

    public void setD_customerIDCardDeleteDate(Date d_customerIDCardDeleteDate) {
        this.d_customerIDCardDeleteDate = d_customerIDCardDeleteDate;
    }

    public int getI_customerIDCardUpdateID() {
        return i_customerIDCardUpdateID;
    }

    public void setI_customerIDCardUpdateID(int i_customerIDCardUpdateID) {
        this.i_customerIDCardUpdateID = i_customerIDCardUpdateID;
    }

    public Date getD_customerIDCardUpdateDate() {
        return d_customerIDCardUpdateDate;
    }

    public void setD_customerIDCardUpdateDate(Date d_customerIDCardUpdateDate) {
        this.d_customerIDCardUpdateDate = d_customerIDCardUpdateDate;
    }

    public String getS_customerIDCardActive() {
        return s_customerIDCardActive;
    }

    public void setS_customerIDCardActive(String s_customerIDCardActive) {
        this.s_customerIDCardActive = s_customerIDCardActive;
    }
}
