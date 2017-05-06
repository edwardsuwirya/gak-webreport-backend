package com.ifm.domain.master;
/**
 * @author oncom
 */

import java.util.Date;

public class M_JobPosition implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_jobPositionCode;
    private String s_jobPositionRealCode;
    private M_Company company;
    private String s_jobPositionName;
    private int i_jobPositionRank;
    private int i_jobPositionCreateID;
    private Date d_jobPositionCreateDate;
    private int i_jobPositionDeleteID;
    private Date d_jobPositionDeleteDate;
    private int i_jobPositionUpdateID;
    private Date d_jobPositionUpdateDate;
    private String s_jobPositionActive;

    public M_JobPosition() {
    }

    public String getS_jobPositionCode() {
        return s_jobPositionCode;
    }

    public void setS_jobPositionCode(String s_jobPositionCode) {
        this.s_jobPositionCode = s_jobPositionCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_jobPositionRealCode() {
        return s_jobPositionRealCode;
    }

    public void setS_jobPositionRealCode(String s_jobPositionRealCode) {
        this.s_jobPositionRealCode = s_jobPositionRealCode;
    }

    public String getS_jobPositionName() {
        return s_jobPositionName;
    }

    public void setS_jobPositionName(String s_jobPositionName) {
        this.s_jobPositionName = s_jobPositionName;
    }

    public int getI_jobPositionRank() {
        return i_jobPositionRank;
    }

    public void setI_jobPositionRank(int i_jobPositionRank) {
        this.i_jobPositionRank = i_jobPositionRank;
    }

    public int getI_jobPositionCreateID() {
        return i_jobPositionCreateID;
    }

    public void setI_jobPositionCreateID(int i_jobPositionCreateID) {
        this.i_jobPositionCreateID = i_jobPositionCreateID;
    }

    public Date getD_jobPositionCreateDate() {
        return d_jobPositionCreateDate;
    }

    public void setD_jobPositionCreateDate(Date d_jobPositionCreateDate) {
        this.d_jobPositionCreateDate = d_jobPositionCreateDate;
    }

    public int getI_jobPositionDeleteID() {
        return i_jobPositionDeleteID;
    }

    public void setI_jobPositionDeleteID(int i_jobPositionDeleteID) {
        this.i_jobPositionDeleteID = i_jobPositionDeleteID;
    }

    public Date getD_jobPositionDeleteDate() {
        return d_jobPositionDeleteDate;
    }

    public void setD_jobPositionDeleteDate(Date d_jobPositionDeleteDate) {
        this.d_jobPositionDeleteDate = d_jobPositionDeleteDate;
    }

    public int getI_jobPositionUpdateID() {
        return i_jobPositionUpdateID;
    }

    public void setI_jobPositionUpdateID(int i_jobPositionUpdateID) {
        this.i_jobPositionUpdateID = i_jobPositionUpdateID;
    }

    public Date getD_jobPositionUpdateDate() {
        return d_jobPositionUpdateDate;
    }

    public void setD_jobPositionUpdateDate(Date d_jobPositionUpdateDate) {
        this.d_jobPositionUpdateDate = d_jobPositionUpdateDate;
    }

    public String getS_jobPositionActive() {
        return s_jobPositionActive;
    }

    public void setS_jobPositionActive(String s_jobPositionActive) {
        this.s_jobPositionActive = s_jobPositionActive;
    }
}
