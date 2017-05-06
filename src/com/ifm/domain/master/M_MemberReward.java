package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;

public class M_MemberReward {
    private String s_memberRewardCode;
    private M_Company company;
    private String s_memberRewardRealCode;
    private String s_memberRewardName;
    private byte[] b_memberRewardPictureFile;
    private int i_memberRewardPointRedeem;
    private int i_memberRewardCreateID;
    private Date d_memberRewardCreateDate;
    private int i_memberRewardDeleteID;
    private Date d_memberRewardDeleteDate;
    private int i_memberRewardUpdateID;
    private Date d_memberRewardUpdateDate;
    private String s_memberRewardActive;

    public M_MemberReward() {
    }

    public String getS_memberRewardCode() {
        return s_memberRewardCode;
    }

    public void setS_memberRewardCode(String s_memberRewardCode) {
        this.s_memberRewardCode = s_memberRewardCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_memberRewardRealCode() {
        return s_memberRewardRealCode;
    }

    public void setS_memberRewardRealCode(String s_memberRewardRealCode) {
        this.s_memberRewardRealCode = s_memberRewardRealCode;
    }

    public String getS_memberRewardName() {
        return s_memberRewardName;
    }

    public void setS_memberRewardName(String s_memberRewardName) {
        this.s_memberRewardName = s_memberRewardName;
    }

    public byte[] getB_memberRewardPictureFile() {
        return b_memberRewardPictureFile;
    }

    public void setB_memberRewardPictureFile(byte[] b_memberRewardPictureFile) {
        this.b_memberRewardPictureFile = b_memberRewardPictureFile;
    }

    public int getI_memberRewardPointRedeem() {
        return i_memberRewardPointRedeem;
    }

    public void setI_memberRewardPointRedeem(int i_memberRewardPointRedeem) {
        this.i_memberRewardPointRedeem = i_memberRewardPointRedeem;
    }

    public int getI_memberRewardCreateID() {
        return i_memberRewardCreateID;
    }

    public void setI_memberRewardCreateID(int i_memberRewardCreateID) {
        this.i_memberRewardCreateID = i_memberRewardCreateID;
    }

    public Date getD_memberRewardCreateDate() {
        return d_memberRewardCreateDate;
    }

    public void setD_memberRewardCreateDate(Date d_memberRewardCreateDate) {
        this.d_memberRewardCreateDate = d_memberRewardCreateDate;
    }

    public int getI_memberRewardDeleteID() {
        return i_memberRewardDeleteID;
    }

    public void setI_memberRewardDeleteID(int i_memberRewardDeleteID) {
        this.i_memberRewardDeleteID = i_memberRewardDeleteID;
    }

    public Date getD_memberRewardDeleteDate() {
        return d_memberRewardDeleteDate;
    }

    public void setD_memberRewardDeleteDate(Date d_memberRewardDeleteDate) {
        this.d_memberRewardDeleteDate = d_memberRewardDeleteDate;
    }

    public int getI_memberRewardUpdateID() {
        return i_memberRewardUpdateID;
    }

    public void setI_memberRewardUpdateID(int i_memberRewardUpdateID) {
        this.i_memberRewardUpdateID = i_memberRewardUpdateID;
    }

    public Date getD_memberRewardUpdateDate() {
        return d_memberRewardUpdateDate;
    }

    public void setD_memberRewardUpdateDate(Date d_memberRewardUpdateDate) {
        this.d_memberRewardUpdateDate = d_memberRewardUpdateDate;
    }

    public String getS_memberRewardActive() {
        return s_memberRewardActive;
    }

    public void setS_memberRewardActive(String s_memberRewardActive) {
        this.s_memberRewardActive = s_memberRewardActive;
    }
}
