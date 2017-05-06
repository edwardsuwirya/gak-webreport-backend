package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_ArticleSpecialSpecification implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String s_articleSpecialSpecificationCode;
    private M_Company company;
    private String s_articleSpecialSpecificationRealCode;
    private String s_articleSpecialSpecificationName;
    private int i_articleSpecialSpecificationCreateID;
    private Date d_articleSpecialSpecificationCreateDate;
    private int i_articleSpecialSpecificationDeleteID;
    private Date d_articleSpecialSpecificationDeleteDate;
    private int i_articleSpecialSpecificationUpdateID;
    private Date d_articleSpecialSpecificationUpdateDate;
    private String s_articleSpecialSpecificationActive;

    public M_ArticleSpecialSpecification() {
    }

    public String getS_articleSpecialSpecificationCode() {
        return s_articleSpecialSpecificationCode;
    }

    public void setS_articleSpecialSpecificationCode(
            String s_articleSpecialSpecificationCode) {
        this.s_articleSpecialSpecificationCode = s_articleSpecialSpecificationCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_articleSpecialSpecificationRealCode() {
        return s_articleSpecialSpecificationRealCode;
    }

    public void setS_articleSpecialSpecificationRealCode(
            String s_articleSpecialSpecificationRealCode) {
        this.s_articleSpecialSpecificationRealCode = s_articleSpecialSpecificationRealCode;
    }

    public String getS_articleSpecialSpecificationName() {
        return s_articleSpecialSpecificationName;
    }

    public void setS_articleSpecialSpecificationName(
            String s_articleSpecialSpecificationName) {
        this.s_articleSpecialSpecificationName = s_articleSpecialSpecificationName;
    }

    public int getI_articleSpecialSpecificationCreateID() {
        return i_articleSpecialSpecificationCreateID;
    }

    public void setI_articleSpecialSpecificationCreateID(
            int i_articleSpecialSpecificationCreateID) {
        this.i_articleSpecialSpecificationCreateID = i_articleSpecialSpecificationCreateID;
    }

    public Date getD_articleSpecialSpecificationCreateDate() {
        return d_articleSpecialSpecificationCreateDate;
    }

    public void setD_articleSpecialSpecificationCreateDate(
            Date d_articleSpecialSpecificationCreateDate) {
        this.d_articleSpecialSpecificationCreateDate = d_articleSpecialSpecificationCreateDate;
    }

    public int getI_articleSpecialSpecificationDeleteID() {
        return i_articleSpecialSpecificationDeleteID;
    }

    public void setI_articleSpecialSpecificationDeleteID(
            int i_articleSpecialSpecificationDeleteID) {
        this.i_articleSpecialSpecificationDeleteID = i_articleSpecialSpecificationDeleteID;
    }

    public Date getD_articleSpecialSpecificationDeleteDate() {
        return d_articleSpecialSpecificationDeleteDate;
    }

    public void setD_articleSpecialSpecificationDeleteDate(
            Date d_articleSpecialSpecificationDeleteDate) {
        this.d_articleSpecialSpecificationDeleteDate = d_articleSpecialSpecificationDeleteDate;
    }

    public int getI_articleSpecialSpecificationUpdateID() {
        return i_articleSpecialSpecificationUpdateID;
    }

    public void setI_articleSpecialSpecificationUpdateID(
            int i_articleSpecialSpecificationUpdateID) {
        this.i_articleSpecialSpecificationUpdateID = i_articleSpecialSpecificationUpdateID;
    }

    public Date getD_articleSpecialSpecificationUpdateDate() {
        return d_articleSpecialSpecificationUpdateDate;
    }

    public void setD_articleSpecialSpecificationUpdateDate(
            Date d_articleSpecialSpecificationUpdateDate) {
        this.d_articleSpecialSpecificationUpdateDate = d_articleSpecialSpecificationUpdateDate;
    }

    public String getS_articleSpecialSpecificationActive() {
        return s_articleSpecialSpecificationActive;
    }

    public void setS_articleSpecialSpecificationActive(
            String s_articleSpecialSpecificationActive) {
        this.s_articleSpecialSpecificationActive = s_articleSpecialSpecificationActive;
    }
}
