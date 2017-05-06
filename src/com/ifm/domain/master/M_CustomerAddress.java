package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_CustomerAddress implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_customerAddressCode;
    private M_OwnedStatus ownedstatus;
    private M_City city;
    private String s_customerAddress_ZipCode;
    private int i_customerAddressNo;
    private String s_customerAddressName;
    private String s_customerAddressPhone;
    private int i_customerAddressCreateID;
    private Date d_customerAddressCreateDate;
    private int i_customerAddressDeleteID;
    private Date d_customerAddressDeleteDate;
    private int i_customerAddressUpdateID;
    private Date d_customerAddressUpdateDate;
    private String s_customerAddressActive;

    public M_CustomerAddress(String s_customerAddressCode,
                             M_OwnedStatus ownedstatus,
                             M_City city,
                             String s_customerAddress_ZipCode,
                             int i_customerAddressNo,
                             String s_customerAddressName,
                             String s_customerAddressPhone,
                             int i_customerAddressCreateID, Date d_customerAddressCreateDate,
                             int i_customerAddressDeleteID, Date d_customerAddressDeleteDate,
                             int i_customerAddressUpdateID, Date d_customerAddressUpdateDate,
                             String s_customerAddressActive) {
        this.s_customerAddressCode = s_customerAddressCode;
        this.ownedstatus = ownedstatus;
        this.city = city;
        this.s_customerAddress_ZipCode = s_customerAddress_ZipCode;
        this.i_customerAddressNo = i_customerAddressNo;
        this.s_customerAddressName = s_customerAddressName;
        this.s_customerAddressPhone = s_customerAddressPhone;
        this.i_customerAddressCreateID = i_customerAddressCreateID;
        this.d_customerAddressCreateDate = d_customerAddressCreateDate;
        this.i_customerAddressDeleteID = i_customerAddressDeleteID;
        this.d_customerAddressDeleteDate = d_customerAddressDeleteDate;
        this.i_customerAddressUpdateID = i_customerAddressUpdateID;
        this.d_customerAddressUpdateDate = d_customerAddressUpdateDate;
        this.s_customerAddressActive = s_customerAddressActive;
    }

    public M_CustomerAddress() {
    }

    public String getS_customerAddressCode() {
        return s_customerAddressCode;
    }

    public void setS_customerAddressCode(String s_customerAddressCode) {
        this.s_customerAddressCode = s_customerAddressCode;
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

    public String getS_customerAddress_ZipCode() {
        return s_customerAddress_ZipCode;
    }

    public void setS_customerAddress_ZipCode(String s_customerAddress_ZipCode) {
        this.s_customerAddress_ZipCode = s_customerAddress_ZipCode;
    }

    public int getI_customerAddressNo() {
        return i_customerAddressNo;
    }

    public void setI_customerAddressNo(int i_customerAddressNo) {
        this.i_customerAddressNo = i_customerAddressNo;
    }

    public String getS_customerAddressName() {
        return s_customerAddressName;
    }

    public void setS_customerAddressName(String s_customerAddressName) {
        this.s_customerAddressName = s_customerAddressName;
    }

    public String getS_customerAddressPhone() {
        return s_customerAddressPhone;
    }

    public void setS_customerAddressPhone(String s_customerAddressPhone) {
        this.s_customerAddressPhone = s_customerAddressPhone;
    }

    public int getI_customerAddressCreateID() {
        return i_customerAddressCreateID;
    }

    public void setI_customerAddressCreateID(int i_customerAddressCreateID) {
        this.i_customerAddressCreateID = i_customerAddressCreateID;
    }

    public Date getD_customerAddressCreateDate() {
        return d_customerAddressCreateDate;
    }

    public void setD_customerAddressCreateDate(Date d_customerAddressCreateDate) {
        this.d_customerAddressCreateDate = d_customerAddressCreateDate;
    }

    public int getI_customerAddressDeleteID() {
        return i_customerAddressDeleteID;
    }

    public void setI_customerAddressDeleteID(int i_customerAddressDeleteID) {
        this.i_customerAddressDeleteID = i_customerAddressDeleteID;
    }

    public Date getD_customerAddressDeleteDate() {
        return d_customerAddressDeleteDate;
    }

    public void setD_customerAddressDeleteDate(Date d_customerAddressDeleteDate) {
        this.d_customerAddressDeleteDate = d_customerAddressDeleteDate;
    }

    public int getI_customerAddressUpdateID() {
        return i_customerAddressUpdateID;
    }

    public void setI_customerAddressUpdateID(int i_customerAddressUpdateID) {
        this.i_customerAddressUpdateID = i_customerAddressUpdateID;
    }

    public Date getD_customerAddressUpdateDate() {
        return d_customerAddressUpdateDate;
    }

    public void setD_customerAddressUpdateDate(Date d_customerAddressUpdateDate) {
        this.d_customerAddressUpdateDate = d_customerAddressUpdateDate;
    }

    public String getS_customerAddressActive() {
        return s_customerAddressActive;
    }

    public void setS_customerAddressActive(String s_customerAddressActive) {
        this.s_customerAddressActive = s_customerAddressActive;
    }
}
