package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_MemberType {
    private String s_memberTypeCode;
    private M_Company company;
    private String s_memberTypeRealCode;
    private String s_memberTypeName;
    private byte[] b_memberTypePictureFile;
    private int i_memberTypeLevel;
    private int i_memberTypeCreateID;
    private Date d_memberTypeCreateDate;
    private int i_memberTypeDeleteID;
    private Date d_memberTypeDeleteDate;
    private int i_memberTypeUpdateID;
    private Date d_memberTypeUpdateDate;
    private String s_memberTypeActive;

    public M_MemberType() {
    }

    public String getS_memberTypeCode() {
        return s_memberTypeCode;
    }

    public void setS_memberTypeCode(String s_memberTypeCode) {
        this.s_memberTypeCode = s_memberTypeCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_memberTypeRealCode() {
        return s_memberTypeRealCode;
    }

    public void setS_memberTypeRealCode(String s_memberTypeRealCode) {
        this.s_memberTypeRealCode = s_memberTypeRealCode;
    }

    public String getS_memberTypeName() {
        return s_memberTypeName;
    }

    public void setS_memberTypeName(String s_memberTypeName) {
        this.s_memberTypeName = s_memberTypeName;
    }

    public byte[] getB_memberTypePictureFile() {
        return b_memberTypePictureFile;
    }

    public void setB_memberTypePictureFile(byte[] b_memberTypePictureFile) {
        this.b_memberTypePictureFile = b_memberTypePictureFile;
    }

    public int getI_memberTypeLevel() {
        return i_memberTypeLevel;
    }

    public void setI_memberTypeLevel(int i_memberTypeLevel) {
        this.i_memberTypeLevel = i_memberTypeLevel;
    }

    public int getI_memberTypeCreateID() {
        return i_memberTypeCreateID;
    }

    public void setI_memberTypeCreateID(int i_memberTypeCreateID) {
        this.i_memberTypeCreateID = i_memberTypeCreateID;
    }

    public Date getD_memberTypeCreateDate() {
        return d_memberTypeCreateDate;
    }

    public void setD_memberTypeCreateDate(Date d_memberTypeCreateDate) {
        this.d_memberTypeCreateDate = d_memberTypeCreateDate;
    }

    public int getI_memberTypeDeleteID() {
        return i_memberTypeDeleteID;
    }

    public void setI_memberTypeDeleteID(int i_memberTypeDeleteID) {
        this.i_memberTypeDeleteID = i_memberTypeDeleteID;
    }

    public Date getD_memberTypeDeleteDate() {
        return d_memberTypeDeleteDate;
    }

    public void setD_memberTypeDeleteDate(Date d_memberTypeDeleteDate) {
        this.d_memberTypeDeleteDate = d_memberTypeDeleteDate;
    }

    public int getI_memberTypeUpdateID() {
        return i_memberTypeUpdateID;
    }

    public void setI_memberTypeUpdateID(int i_memberTypeUpdateID) {
        this.i_memberTypeUpdateID = i_memberTypeUpdateID;
    }

    public Date getD_memberTypeUpdateDate() {
        return d_memberTypeUpdateDate;
    }

    public void setD_memberTypeUpdateDate(Date d_memberTypeUpdateDate) {
        this.d_memberTypeUpdateDate = d_memberTypeUpdateDate;
    }

    public String getS_memberTypeActive() {
        return s_memberTypeActive;
    }

    public void setS_memberTypeActive(String s_memberTypeActive) {
        this.s_memberTypeActive = s_memberTypeActive;
    }
}
