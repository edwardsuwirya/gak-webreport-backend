package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_OwnedStatus implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_ownedStatusID;
    private String s_ownedStatusName;
    private int i_ownedStatusCreateID;
    private Date d_ownedStatusCreateDate;
    private int i_ownedStatusDeleteID;
    private Date d_ownedStatusDeleteDate;
    private int i_ownedStatusUpdateID;
    private Date d_ownedStatusUpdateDate;
    private String s_ownedStatusActive;

    public M_OwnedStatus() {
    }

    public M_OwnedStatus(int i_ownedStatusID, String s_ownedStatusName,
                         int i_ownedStatusCreateID, Date d_ownedStatusCreateDate,
                         int i_ownedStatusDeleteID, Date d_ownedStatusDeleteDate,
                         int i_ownedStatusUpdateID, Date d_ownedStatusUpdateDate,
                         String s_ownedStatusActive) {
        this.i_ownedStatusID = i_ownedStatusID;
        this.s_ownedStatusName = s_ownedStatusName;
        this.i_ownedStatusCreateID = i_ownedStatusCreateID;
        this.d_ownedStatusCreateDate = d_ownedStatusCreateDate;
        this.i_ownedStatusDeleteID = i_ownedStatusDeleteID;
        this.d_ownedStatusDeleteDate = d_ownedStatusDeleteDate;
        this.i_ownedStatusUpdateID = i_ownedStatusUpdateID;
        this.d_ownedStatusUpdateDate = d_ownedStatusUpdateDate;
        this.s_ownedStatusActive = s_ownedStatusActive;
    }

    public int getI_ownedStatusID() {
        return i_ownedStatusID;
    }

    public void setI_ownedStatusID(int i_ownedStatusID) {
        this.i_ownedStatusID = i_ownedStatusID;
    }

    public String getS_ownedStatusName() {
        return s_ownedStatusName;
    }

    public void setS_ownedStatusName(String s_ownedStatusName) {
        this.s_ownedStatusName = s_ownedStatusName;
    }

    public int getI_ownedStatusCreateID() {
        return i_ownedStatusCreateID;
    }

    public void setI_ownedStatusCreateID(int i_ownedStatusCreateID) {
        this.i_ownedStatusCreateID = i_ownedStatusCreateID;
    }

    public Date getD_ownedStatusCreateDate() {
        return d_ownedStatusCreateDate;
    }

    public void setD_ownedStatusCreateDate(Date d_ownedStatusCreateDate) {
        this.d_ownedStatusCreateDate = d_ownedStatusCreateDate;
    }

    public int getI_ownedStatusDeleteID() {
        return i_ownedStatusDeleteID;
    }

    public void setI_ownedStatusDeleteID(int i_ownedStatusDeleteID) {
        this.i_ownedStatusDeleteID = i_ownedStatusDeleteID;
    }

    public Date getD_ownedStatusDeleteDate() {
        return d_ownedStatusDeleteDate;
    }

    public void setD_ownedStatusDeleteDate(Date d_ownedStatusDeleteDate) {
        this.d_ownedStatusDeleteDate = d_ownedStatusDeleteDate;
    }

    public int getI_ownedStatusUpdateID() {
        return i_ownedStatusUpdateID;
    }

    public void setI_ownedStatusUpdateID(int i_ownedStatusUpdateID) {
        this.i_ownedStatusUpdateID = i_ownedStatusUpdateID;
    }

    public Date getD_ownedStatusUpdateDate() {
        return d_ownedStatusUpdateDate;
    }

    public void setD_ownedStatusUpdateDate(Date d_ownedStatusUpdateDate) {
        this.d_ownedStatusUpdateDate = d_ownedStatusUpdateDate;
    }

    public String getS_ownedStatusActive() {
        return s_ownedStatusActive;
    }

    public void setS_ownedStatusActive(String s_ownedStatusActive) {
        this.s_ownedStatusActive = s_ownedStatusActive;
    }
}
