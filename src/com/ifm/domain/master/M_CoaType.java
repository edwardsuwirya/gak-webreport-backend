package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_CoaType implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_coaTypeCode;
    private String s_coaTypeName;
    private int i_coaTypeCreateID;
    private Date d_coaTypeCreateDate;
    private int i_coaTypeDeleteID;
    private Date d_coaTypeDeleteDate;
    private int i_coaTypeUpdateID;
    private Date d_coaTypeUpdateDate;
    private String s_coaTypeActive;

    public M_CoaType() {
    }

    public String getS_coaTypeCode() {
        return s_coaTypeCode;
    }

    public void setS_coaTypeCode(String s_coaTypeCode) {
        this.s_coaTypeCode = s_coaTypeCode;
    }

    public String getS_coaTypeName() {
        return s_coaTypeName;
    }

    public void setS_coaTypeName(String s_coaTypeName) {
        this.s_coaTypeName = s_coaTypeName;
    }

    public int getI_coaTypeCreateID() {
        return i_coaTypeCreateID;
    }

    public void setI_coaTypeCreateID(int i_coaTypeCreateID) {
        this.i_coaTypeCreateID = i_coaTypeCreateID;
    }

    public Date getD_coaTypeCreateDate() {
        return d_coaTypeCreateDate;
    }

    public void setD_coaTypeCreateDate(Date d_coaTypeCreateDate) {
        this.d_coaTypeCreateDate = d_coaTypeCreateDate;
    }

    public int getI_coaTypeDeleteID() {
        return i_coaTypeDeleteID;
    }

    public void setI_coaTypeDeleteID(int i_coaTypeDeleteID) {
        this.i_coaTypeDeleteID = i_coaTypeDeleteID;
    }

    public Date getD_coaTypeDeleteDate() {
        return d_coaTypeDeleteDate;
    }

    public void setD_coaTypeDeleteDate(Date d_coaTypeDeleteDate) {
        this.d_coaTypeDeleteDate = d_coaTypeDeleteDate;
    }

    public int getI_coaTypeUpdateID() {
        return i_coaTypeUpdateID;
    }

    public void setI_coaTypeUpdateID(int i_coaTypeUpdateID) {
        this.i_coaTypeUpdateID = i_coaTypeUpdateID;
    }

    public Date getD_coaTypeUpdateDate() {
        return d_coaTypeUpdateDate;
    }

    public void setD_coaTypeUpdateDate(Date d_coaTypeUpdateDate) {
        this.d_coaTypeUpdateDate = d_coaTypeUpdateDate;
    }

    public String getS_coaTypeActive() {
        return s_coaTypeActive;
    }

    public void setS_coaTypeActive(String s_coaTypeActive) {
        this.s_coaTypeActive = s_coaTypeActive;
    }
}
