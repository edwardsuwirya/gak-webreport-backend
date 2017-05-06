package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_Religion implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private Integer i_religionID;
    private String s_religionName;
    private int i_religionCreateID;
    private Date d_religionCreateDate;
    private int i_religionDeleteID;
    private Date d_religionDeleteDate;
    private int i_religionUpdateID;
    private Date d_religionUpdateDate;
    private String s_religionActive;

    public M_Religion() {
    }

    public M_Religion(Integer i_religionID, String s_religionName,
                      int i_religionCreateID, Date d_religionCreateDate,
                      int i_religionDeleteID, Date d_religionDeleteDate,
                      int i_religionUpdateID, Date d_religionUpdateDate,
                      String s_religionActive) {
        this.i_religionID = i_religionID;
        this.s_religionName = s_religionName;
        this.i_religionCreateID = i_religionCreateID;
        this.d_religionCreateDate = d_religionCreateDate;
        this.i_religionDeleteID = i_religionDeleteID;
        this.d_religionDeleteDate = d_religionDeleteDate;
        this.i_religionUpdateID = i_religionUpdateID;
        this.d_religionUpdateDate = d_religionUpdateDate;
        this.s_religionActive = s_religionActive;
    }

    public Integer getI_religionID() {
        return i_religionID;
    }

    public void setI_religionID(Integer i_religionID) {
        this.i_religionID = i_religionID;
    }

    public String getS_religionName() {
        return s_religionName;
    }

    public void setS_religionName(String s_religionName) {
        this.s_religionName = s_religionName;
    }

    public int getI_religionCreateID() {
        return i_religionCreateID;
    }

    public void setI_religionCreateID(int i_religionCreateID) {
        this.i_religionCreateID = i_religionCreateID;
    }

    public Date getD_religionCreateDate() {
        return d_religionCreateDate;
    }

    public void setD_religionCreateDate(Date d_religionCreateDate) {
        this.d_religionCreateDate = d_religionCreateDate;
    }

    public int getI_religionDeleteID() {
        return i_religionDeleteID;
    }

    public void setI_religionDeleteID(int i_religionDeleteID) {
        this.i_religionDeleteID = i_religionDeleteID;
    }

    public Date getD_religionDeleteDate() {
        return d_religionDeleteDate;
    }

    public void setD_religionDeleteDate(Date d_religionDeleteDate) {
        this.d_religionDeleteDate = d_religionDeleteDate;
    }

    public int getI_religionUpdateID() {
        return i_religionUpdateID;
    }

    public void setI_religionUpdateID(int i_religionUpdateID) {
        this.i_religionUpdateID = i_religionUpdateID;
    }

    public Date getD_religionUpdateDate() {
        return d_religionUpdateDate;
    }

    public void setD_religionUpdateDate(Date d_religionUpdateDate) {
        this.d_religionUpdateDate = d_religionUpdateDate;
    }

    public String getS_religionActive() {
        return s_religionActive;
    }

    public void setS_religionActive(String s_religionActive) {
        this.s_religionActive = s_religionActive;
    }
}
