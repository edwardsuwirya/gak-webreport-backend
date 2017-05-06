package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_CustomerContact implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_customerContactCode;
    private int i_customerContactNo;
    private String s_customerContactName;
    private String s_customerContactPosition;
    private String s_customerContactPhone;
    private String s_customerContactFax;
    private String s_customerContactCellPhone;
    private int i_customerContactCreateID;
    private Date d_customerContactCreateDate;
    private int i_customerContactDeleteID;
    private Date d_customerContactDeleteDate;
    private int i_customerContactUpdateID;
    private Date d_customerContactUpdateDate;
    private String s_customerContactActive;

    public M_CustomerContact(String s_customerContactCode,
                             int i_customerContactNo,
                             String s_customerContactName,
                             String s_customerContactPosition,
                             String s_customerContactPhone,
                             String s_customerContactFax,
                             String s_customerContactCellPhone,
                             int i_customerContactCreateID,
                             Date d_customerContactCreateDate,
                             int i_customerContactDeleteID,
                             Date d_customerContactDeleteDate,
                             int i_customerContactUpdateID,
                             Date d_customerContactUpdateDate,
                             String s_customerContactActive) {
        this.s_customerContactCode = s_customerContactCode;
        this.i_customerContactNo = i_customerContactNo;
        this.s_customerContactName = s_customerContactName;
        this.s_customerContactPosition = s_customerContactPosition;
        this.s_customerContactPhone = s_customerContactPhone;
        this.s_customerContactFax = s_customerContactFax;
        this.s_customerContactCellPhone = s_customerContactCellPhone;
        this.i_customerContactCreateID = i_customerContactCreateID;
        this.d_customerContactCreateDate = d_customerContactCreateDate;
        this.i_customerContactDeleteID = i_customerContactDeleteID;
        this.d_customerContactDeleteDate = d_customerContactDeleteDate;
        this.i_customerContactUpdateID = i_customerContactUpdateID;
        this.d_customerContactUpdateDate = d_customerContactUpdateDate;
        this.s_customerContactActive = s_customerContactActive;
    }

    public M_CustomerContact() {
    }

    public String getS_customerContactCode() {
        return s_customerContactCode;
    }

    public void setS_customerContactCode(String s_customerContactCode) {
        this.s_customerContactCode = s_customerContactCode;
    }

    public int getI_customerContactNo() {
        return i_customerContactNo;
    }

    public void setI_customerContactNo(int i_customerContactNo) {
        this.i_customerContactNo = i_customerContactNo;
    }

    public String getS_customerContactName() {
        return s_customerContactName;
    }

    public void setS_customerContactName(String s_customerContactName) {
        this.s_customerContactName = s_customerContactName;
    }

    public String getS_customerContactPosition() {
        return s_customerContactPosition;
    }

    public void setS_customerContactPosition(String s_customerContactPosition) {
        this.s_customerContactPosition = s_customerContactPosition;
    }

    public String getS_customerContactPhone() {
        return s_customerContactPhone;
    }

    public void setS_customerContactPhone(String s_customerContactPhone) {
        this.s_customerContactPhone = s_customerContactPhone;
    }

    public String getS_customerContactFax() {
        return s_customerContactFax;
    }

    public void setS_customerContactFax(String s_customerContactFax) {
        this.s_customerContactFax = s_customerContactFax;
    }

    public String getS_customerContactCellPhone() {
        return s_customerContactCellPhone;
    }

    public void setS_customerContactCellPhone(String s_customerContactCellPhone) {
        this.s_customerContactCellPhone = s_customerContactCellPhone;
    }

    public int getI_customerContactCreateID() {
        return i_customerContactCreateID;
    }

    public void setI_customerContactCreateID(int i_customerContactCreateID) {
        this.i_customerContactCreateID = i_customerContactCreateID;
    }

    public Date getD_customerContactCreateDate() {
        return d_customerContactCreateDate;
    }

    public void setD_customerContactCreateDate(Date d_customerContactCreateDate) {
        this.d_customerContactCreateDate = d_customerContactCreateDate;
    }

    public int getI_customerContactDeleteID() {
        return i_customerContactDeleteID;
    }

    public void setI_customerContactDeleteID(int i_customerContactDeleteID) {
        this.i_customerContactDeleteID = i_customerContactDeleteID;
    }

    public Date getD_customerContactDeleteDate() {
        return d_customerContactDeleteDate;
    }

    public void setD_customerContactDeleteDate(Date d_customerContactDeleteDate) {
        this.d_customerContactDeleteDate = d_customerContactDeleteDate;
    }

    public int getI_customerContactUpdateID() {
        return i_customerContactUpdateID;
    }

    public void setI_customerContactUpdateID(int i_customerContactUpdateID) {
        this.i_customerContactUpdateID = i_customerContactUpdateID;
    }

    public Date getD_customerContactUpdateDate() {
        return d_customerContactUpdateDate;
    }

    public void setD_customerContactUpdateDate(Date d_customerContactUpdateDate) {
        this.d_customerContactUpdateDate = d_customerContactUpdateDate;
    }

    public String getS_customerContactActive() {
        return s_customerContactActive;
    }

    public void setS_customerContactActive(String s_customerContactActive) {
        this.s_customerContactActive = s_customerContactActive;
    }
}
