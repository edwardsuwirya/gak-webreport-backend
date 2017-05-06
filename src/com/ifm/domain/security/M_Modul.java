package com.ifm.domain.security;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Modul implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_modulID;
    private M_Project project;
    private String s_modulName;
    private String s_modulName1;
    private String s_modulDesc;
    private int i_modulLevel;
    private int i_modulOrder;
    private int i_modulParent;
    private int i_modulCreateID;
    private Date d_modulCreateDate = new Date();
    private int i_modulDeleteID;
    private Date d_modulDeleteDate = new Date();
    private int i_modulUpdateID;
    private Date d_modulUpdateDate = new Date();
    private String s_modulActive;

    public M_Modul() {
    }

    public M_Modul(int i_modulID, M_Project project,
                   String s_modulName, String s_modulName1,
                   String s_modulDesc,
                   int i_modulLevel, int i_modulOrder, int i_modulParent,
                   int i_modulCreateID, Date d_modulCreateDate,
                   int i_modulDeleteID, Date d_modulDeleteDate,
                   int i_modulUpdateID, Date d_modulUpdateDate,
                   String s_modulActive) {
        this.i_modulID = i_modulID;
        this.project = project;
        this.s_modulName = s_modulName;
        this.s_modulName1 = s_modulName1;
        this.s_modulDesc = s_modulDesc;
        this.i_modulLevel = i_modulLevel;
        this.i_modulOrder = i_modulOrder;
        this.i_modulParent = i_modulParent;
        this.i_modulCreateID = i_modulCreateID;
        this.d_modulCreateDate = d_modulCreateDate;
        this.i_modulDeleteID = i_modulDeleteID;
        this.d_modulDeleteDate = d_modulDeleteDate;
        this.i_modulUpdateID = i_modulUpdateID;
        this.d_modulUpdateDate = d_modulUpdateDate;
        this.s_modulActive = s_modulActive;
    }

    public int getI_modulID() {
        return i_modulID;
    }

    public void setI_modulID(int i_modulID) {
        this.i_modulID = i_modulID;
    }

    public M_Project getProject() {
        return project;
    }

    public void setProject(M_Project project) {
        this.project = project;
    }

    public String getS_modulName() {
        return s_modulName;
    }

    public void setS_modulName(String s_modulName) {
        this.s_modulName = s_modulName;
    }

    public String getS_modulName1() {
        return s_modulName1;
    }

    public void setS_modulName1(String s_modulName1) {
        this.s_modulName1 = s_modulName1;
    }

    public String getS_modulDesc() {
        return s_modulDesc;
    }

    public void setS_modulDesc(String s_modulDesc) {
        this.s_modulDesc = s_modulDesc;
    }

    public int getI_modulLevel() {
        return i_modulLevel;
    }

    public void setI_modulLevel(int i_modulLevel) {
        this.i_modulLevel = i_modulLevel;
    }

    public int getI_modulOrder() {
        return i_modulOrder;
    }

    public void setI_modulOrder(int i_modulOrder) {
        this.i_modulOrder = i_modulOrder;
    }

    public int getI_modulParent() {
        return i_modulParent;
    }

    public void setI_modulParent(int i_modulParent) {
        this.i_modulParent = i_modulParent;
    }

    public int getI_modulCreateID() {
        return i_modulCreateID;
    }

    public void setI_modulCreateID(int i_modulCreateID) {
        this.i_modulCreateID = i_modulCreateID;
    }

    public Date getD_modulCreateDate() {
        return d_modulCreateDate;
    }

    public void setD_modulCreateDate(Date d_modulCreateDate) {
        this.d_modulCreateDate = d_modulCreateDate;
    }

    public int getI_modulDeleteID() {
        return i_modulDeleteID;
    }

    public void setI_modulDeleteID(int i_modulDeleteID) {
        this.i_modulDeleteID = i_modulDeleteID;
    }

    public Date getD_modulDeleteDate() {
        return d_modulDeleteDate;
    }

    public void setD_modulDeleteDate(Date d_modulDeleteDate) {
        this.d_modulDeleteDate = d_modulDeleteDate;
    }

    public int getI_modulUpdateID() {
        return i_modulUpdateID;
    }

    public void setI_modulUpdateID(int i_modulUpdateID) {
        this.i_modulUpdateID = i_modulUpdateID;
    }

    public Date getD_modulUpdateDate() {
        return d_modulUpdateDate;
    }

    public void setD_modulUpdateDate(Date d_modulUpdateDate) {
        this.d_modulUpdateDate = d_modulUpdateDate;
    }

    public String getS_modulActive() {
        return s_modulActive;
    }

    public void setS_modulActive(String s_modulActive) {
        this.s_modulActive = s_modulActive;
    }
}
