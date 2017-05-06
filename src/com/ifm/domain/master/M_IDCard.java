package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_IDCard implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_idCardCode;
    private String s_idCardName;
    private int i_idCardCreateID;
    private Date d_idCardCreateDate;
    private int i_idCardDeleteID;
    private Date d_idCardDeleteDate;
    private int i_idCardUpdateID;
    private Date d_idCardUpdateDate;
    private String s_idCardActive;

    public M_IDCard() {
    }

    public String getS_idCardCode() {
        return s_idCardCode;
    }

    public void setS_idCardCode(String s_idCardCode) {
        this.s_idCardCode = s_idCardCode;
    }

    public String getS_idCardName() {
        return s_idCardName;
    }

    public void setS_idCardName(String s_idCardName) {
        this.s_idCardName = s_idCardName;
    }

    public int getI_idCardCreateID() {
        return i_idCardCreateID;
    }

    public void setI_idCardCreateID(int i_idCardCreateID) {
        this.i_idCardCreateID = i_idCardCreateID;
    }

    public Date getD_idCardCreateDate() {
        return d_idCardCreateDate;
    }

    public void setD_idCardCreateDate(Date d_idCardCreateDate) {
        this.d_idCardCreateDate = d_idCardCreateDate;
    }

    public int getI_idCardDeleteID() {
        return i_idCardDeleteID;
    }

    public void setI_idCardDeleteID(int i_idCardDeleteID) {
        this.i_idCardDeleteID = i_idCardDeleteID;
    }

    public Date getD_idCardDeleteDate() {
        return d_idCardDeleteDate;
    }

    public void setD_idCardDeleteDate(Date d_idCardDeleteDate) {
        this.d_idCardDeleteDate = d_idCardDeleteDate;
    }

    public int getI_idCardUpdateID() {
        return i_idCardUpdateID;
    }

    public void setI_idCardUpdateID(int i_idCardUpdateID) {
        this.i_idCardUpdateID = i_idCardUpdateID;
    }

    public Date getD_idCardUpdateDate() {
        return d_idCardUpdateDate;
    }

    public void setD_idCardUpdateDate(Date d_idCardUpdateDate) {
        this.d_idCardUpdateDate = d_idCardUpdateDate;
    }

    public String getS_idCardActive() {
        return s_idCardActive;
    }

    public void setS_idCardActive(String s_idCardActive) {
        this.s_idCardActive = s_idCardActive;
    }
}
