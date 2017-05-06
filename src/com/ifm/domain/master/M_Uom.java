package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Uom implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_uomCode;
    private String s_uomName;
    private int i_uomCreateID;
    private Date d_uomCreateDate;
    private int i_uomDeleteID;
    private Date d_uomDeleteDate;
    private int i_uomUpdateID;
    private Date d_uomUpdateDate;
    private String s_uomActive;

    public M_Uom() {
    }

    public String getS_uomCode() {
        return s_uomCode;
    }

    public void setS_uomCode(String s_uomCode) {
        this.s_uomCode = s_uomCode;
    }

    public String getS_uomName() {
        return s_uomName;
    }

    public void setS_uomName(String s_uomName) {
        this.s_uomName = s_uomName;
    }

    public int getI_uomCreateID() {
        return i_uomCreateID;
    }

    public void setI_uomCreateID(int i_uomCreateID) {
        this.i_uomCreateID = i_uomCreateID;
    }

    public Date getD_uomCreateDate() {
        return d_uomCreateDate;
    }

    public void setD_uomCreateDate(Date d_uomCreateDate) {
        this.d_uomCreateDate = d_uomCreateDate;
    }

    public int getI_uomDeleteID() {
        return i_uomDeleteID;
    }

    public void setI_uomDeleteID(int i_uomDeleteID) {
        this.i_uomDeleteID = i_uomDeleteID;
    }

    public Date getD_uomDeleteDate() {
        return d_uomDeleteDate;
    }

    public void setD_uomDeleteDate(Date d_uomDeleteDate) {
        this.d_uomDeleteDate = d_uomDeleteDate;
    }

    public int getI_uomUpdateID() {
        return i_uomUpdateID;
    }

    public void setI_uomUpdateID(int i_uomUpdateID) {
        this.i_uomUpdateID = i_uomUpdateID;
    }

    public Date getD_uomUpdateDate() {
        return d_uomUpdateDate;
    }

    public void setD_uomUpdateDate(Date d_uomUpdateDate) {
        this.d_uomUpdateDate = d_uomUpdateDate;
    }

    public String getS_uomActive() {
        return s_uomActive;
    }

    public void setS_uomActive(String s_uomActive) {
        this.s_uomActive = s_uomActive;
    }
}
