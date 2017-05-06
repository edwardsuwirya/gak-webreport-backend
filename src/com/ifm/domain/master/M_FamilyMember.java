package com.ifm.domain.master;
/**
 * @author Oncom
 */

import java.util.Date;

public class M_FamilyMember implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_familyMemberID;
    private String s_familyMemberName;
    private int i_familyMemberCreateID;
    private Date d_familyMemberCreateDate;
    private int i_familyMemberDeleteID;
    private Date d_familyMemberDeleteDate;
    private int i_familyMemberUpdateID;
    private Date d_familyMemberUpdateDate;
    private String s_familyMemberActive;

    public M_FamilyMember() {
    }

    public M_FamilyMember(int i_familyMemberID, String s_familyMemberName,
                          int i_familyMemberCreateID, Date d_familyMemberCreateDate,
                          int i_familyMemberDeleteID, Date d_familyMemberDeleteDate,
                          int i_familyMemberUpdateID, Date d_familyMemberUpdateDate,
                          String s_familyMemberActive) {
        this.i_familyMemberID = i_familyMemberID;
        this.s_familyMemberName = s_familyMemberName;
        this.i_familyMemberCreateID = i_familyMemberCreateID;
        this.d_familyMemberCreateDate = d_familyMemberCreateDate;
        this.i_familyMemberDeleteID = i_familyMemberDeleteID;
        this.d_familyMemberDeleteDate = d_familyMemberDeleteDate;
        this.i_familyMemberUpdateID = i_familyMemberUpdateID;
        this.d_familyMemberUpdateDate = d_familyMemberUpdateDate;
        this.s_familyMemberActive = s_familyMemberActive;
    }

    public int getI_familyMemberID() {
        return i_familyMemberID;
    }

    public void setI_familyMemberID(int i_familyMemberID) {
        this.i_familyMemberID = i_familyMemberID;
    }

    public String getS_familyMemberName() {
        return s_familyMemberName;
    }

    public void setS_familyMemberName(String s_familyMemberName) {
        this.s_familyMemberName = s_familyMemberName;
    }

    public String getS_familyMemberActive() {
        return s_familyMemberActive;
    }

    public void setS_familyMemberActive(String s_familyMemberActive) {
        this.s_familyMemberActive = s_familyMemberActive;
    }

    public int getI_familyMemberCreateID() {
        return i_familyMemberCreateID;
    }

    public void setI_familyMemberCreateID(int i_familyMemberCreateID) {
        this.i_familyMemberCreateID = i_familyMemberCreateID;
    }

    public Date getD_familyMemberCreateDate() {
        return d_familyMemberCreateDate;
    }

    public void setD_familyMemberCreateDate(Date d_familyMemberCreateDate) {
        this.d_familyMemberCreateDate = d_familyMemberCreateDate;
    }

    public int getI_familyMemberDeleteID() {
        return i_familyMemberDeleteID;
    }

    public void setI_familyMemberDeleteID(int i_familyMemberDeleteID) {
        this.i_familyMemberDeleteID = i_familyMemberDeleteID;
    }

    public Date getD_familyMemberDeleteDate() {
        return d_familyMemberDeleteDate;
    }

    public void setD_familyMemberDeleteDate(Date d_familyMemberDeleteDate) {
        this.d_familyMemberDeleteDate = d_familyMemberDeleteDate;
    }

    public int getI_familyMemberUpdateID() {
        return i_familyMemberUpdateID;
    }

    public void setI_familyMemberUpdateID(int i_familyMemberUpdateID) {
        this.i_familyMemberUpdateID = i_familyMemberUpdateID;
    }

    public Date getD_familyMemberUpdateDate() {
        return d_familyMemberUpdateDate;
    }

    public void setD_familyMemberUpdateDate(Date d_familyMemberUpdateDate) {
        this.d_familyMemberUpdateDate = d_familyMemberUpdateDate;
    }
}