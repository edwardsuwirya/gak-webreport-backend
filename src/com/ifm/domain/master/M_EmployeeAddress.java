package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_EmployeeAddress implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_employeeAddressCode;
    private M_OwnedStatus ownedstatus;
    private M_City city;
    private String s_employeeAddress_ZipCode;
    private int i_employeeAddressNo;
    private String s_employeeAddressName;
    private String s_employeeAddressPhone;
    private int i_employeeAddressCreateID;
    private Date d_employeeAddressCreateDate;
    private int i_employeeAddressDeleteID;
    private Date d_employeeAddressDeleteDate;
    private int i_employeeAddressUpdateID;
    private Date d_employeeAddressUpdateDate;
    private String s_employeeAddressActive;

    public M_EmployeeAddress(String s_employeeAddressCode,
                             M_OwnedStatus ownedstatus,
                             M_City city,
                             String s_employeeAddress_ZipCode,
                             int i_employeeAddressNo,
                             String s_employeeAddressName,
                             String s_employeeAddressPhone,
                             int i_employeeAddressCreateID, Date d_employeeAddressCreateDate,
                             int i_employeeAddressDeleteID, Date d_employeeAddressDeleteDate,
                             int i_employeeAddressUpdateID, Date d_employeeAddressUpdateDate,
                             String s_employeeAddressActive) {
        this.s_employeeAddressCode = s_employeeAddressCode;
        this.ownedstatus = ownedstatus;
        this.city = city;
        this.s_employeeAddress_ZipCode = s_employeeAddress_ZipCode;
        this.i_employeeAddressNo = i_employeeAddressNo;
        this.s_employeeAddressName = s_employeeAddressName;
        this.s_employeeAddressPhone = s_employeeAddressPhone;
        this.i_employeeAddressCreateID = i_employeeAddressCreateID;
        this.d_employeeAddressCreateDate = d_employeeAddressCreateDate;
        this.i_employeeAddressDeleteID = i_employeeAddressDeleteID;
        this.d_employeeAddressDeleteDate = d_employeeAddressDeleteDate;
        this.i_employeeAddressUpdateID = i_employeeAddressUpdateID;
        this.d_employeeAddressUpdateDate = d_employeeAddressUpdateDate;
        this.s_employeeAddressActive = s_employeeAddressActive;
    }

    public M_EmployeeAddress() {
    }

    public String getS_employeeAddressCode() {
        return s_employeeAddressCode;
    }

    public void setS_employeeAddressCode(String s_employeeAddressCode) {
        this.s_employeeAddressCode = s_employeeAddressCode;
    }

    public M_OwnedStatus getOwnedstatus() {
        return ownedstatus;
    }

    public void setOwnedstatus(M_OwnedStatus ownedstatus) {
        this.ownedstatus = ownedstatus;
    }

    public M_City getCity() {
        return city;
    }

    public void setCity(M_City city) {
        this.city = city;
    }

    public String getS_employeeAddress_ZipCode() {
        return s_employeeAddress_ZipCode;
    }

    public void setS_employeeAddress_ZipCode(String s_employeeAddress_ZipCode) {
        this.s_employeeAddress_ZipCode = s_employeeAddress_ZipCode;
    }

    public int getI_employeeAddressNo() {
        return i_employeeAddressNo;
    }

    public void setI_employeeAddressNo(int i_employeeAddressNo) {
        this.i_employeeAddressNo = i_employeeAddressNo;
    }

    public String getS_employeeAddressName() {
        return s_employeeAddressName;
    }

    public void setS_employeeAddressName(String s_employeeAddressName) {
        this.s_employeeAddressName = s_employeeAddressName;
    }

    public String getS_employeeAddressPhone() {
        return s_employeeAddressPhone;
    }

    public void setS_employeeAddressPhone(String s_employeeAddressPhone) {
        this.s_employeeAddressPhone = s_employeeAddressPhone;
    }

    public int getI_employeeAddressCreateID() {
        return i_employeeAddressCreateID;
    }

    public void setI_employeeAddressCreateID(int i_employeeAddressCreateID) {
        this.i_employeeAddressCreateID = i_employeeAddressCreateID;
    }

    public Date getD_employeeAddressCreateDate() {
        return d_employeeAddressCreateDate;
    }

    public void setD_employeeAddressCreateDate(Date d_employeeAddressCreateDate) {
        this.d_employeeAddressCreateDate = d_employeeAddressCreateDate;
    }

    public int getI_employeeAddressDeleteID() {
        return i_employeeAddressDeleteID;
    }

    public void setI_employeeAddressDeleteID(int i_employeeAddressDeleteID) {
        this.i_employeeAddressDeleteID = i_employeeAddressDeleteID;
    }

    public Date getD_employeeAddressDeleteDate() {
        return d_employeeAddressDeleteDate;
    }

    public void setD_employeeAddressDeleteDate(Date d_employeeAddressDeleteDate) {
        this.d_employeeAddressDeleteDate = d_employeeAddressDeleteDate;
    }

    public int getI_employeeAddressUpdateID() {
        return i_employeeAddressUpdateID;
    }

    public void setI_employeeAddressUpdateID(int i_employeeAddressUpdateID) {
        this.i_employeeAddressUpdateID = i_employeeAddressUpdateID;
    }

    public Date getD_employeeAddressUpdateDate() {
        return d_employeeAddressUpdateDate;
    }

    public void setD_employeeAddressUpdateDate(Date d_employeeAddressUpdateDate) {
        this.d_employeeAddressUpdateDate = d_employeeAddressUpdateDate;
    }

    public String getS_employeeAddressActive() {
        return s_employeeAddressActive;
    }

    public void setS_employeeAddressActive(String s_employeeAddressActive) {
        this.s_employeeAddressActive = s_employeeAddressActive;
    }
}
