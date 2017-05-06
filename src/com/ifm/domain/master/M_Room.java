package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_Room implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_roomCode;
    private M_Company company;
    private String s_roomRealCode;
    private String s_roomName;
    private int i_roomCreateID;
    private Date d_roomCreateDate;
    private int i_roomDeleteID;
    private Date d_roomDeleteDate;
    private int i_roomUpdateID;
    private Date d_roomUpdateDate;
    private String s_roomActive;

    public M_Room() {
    }

    public String getS_roomCode() {
        return s_roomCode;
    }

    public void setS_roomCode(String s_roomCode) {
        this.s_roomCode = s_roomCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_roomRealCode() {
        return s_roomRealCode;
    }

    public void setS_roomRealCode(String s_roomRealCode) {
        this.s_roomRealCode = s_roomRealCode;
    }

    public String getS_roomName() {
        return s_roomName;
    }

    public void setS_roomName(String s_roomName) {
        this.s_roomName = s_roomName;
    }

    public int getI_roomCreateID() {
        return i_roomCreateID;
    }

    public void setI_roomCreateID(int i_roomCreateID) {
        this.i_roomCreateID = i_roomCreateID;
    }

    public Date getD_roomCreateDate() {
        return d_roomCreateDate;
    }

    public void setD_roomCreateDate(Date d_roomCreateDate) {
        this.d_roomCreateDate = d_roomCreateDate;
    }

    public int getI_roomDeleteID() {
        return i_roomDeleteID;
    }

    public void setI_roomDeleteID(int i_roomDeleteID) {
        this.i_roomDeleteID = i_roomDeleteID;
    }

    public Date getD_roomDeleteDate() {
        return d_roomDeleteDate;
    }

    public void setD_roomDeleteDate(Date d_roomDeleteDate) {
        this.d_roomDeleteDate = d_roomDeleteDate;
    }

    public int getI_roomUpdateID() {
        return i_roomUpdateID;
    }

    public void setI_roomUpdateID(int i_roomUpdateID) {
        this.i_roomUpdateID = i_roomUpdateID;
    }

    public Date getD_roomUpdateDate() {
        return d_roomUpdateDate;
    }

    public void setD_roomUpdateDate(Date d_roomUpdateDate) {
        this.d_roomUpdateDate = d_roomUpdateDate;
    }

    public String getS_roomActive() {
        return s_roomActive;
    }

    public void setS_roomActive(String s_roomActive) {
        this.s_roomActive = s_roomActive;
    }
}