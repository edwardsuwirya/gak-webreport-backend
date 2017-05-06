package com.ifm.domain.security;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_Project implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_projectID;
    private String s_projectName;
    private Date d_projectBeginDate;
    private Date d_projectEndDate;
    private String s_projectDatabase;
    private String s_projectLicensed;
    private int i_projectCreateID;
    private Date d_projectCreateDate;
    private int i_projectDeleteID;
    private Date d_projectDeleteDate;
    private int i_projectUpdateID;
    private Date d_projectUpdateDate;
    private String s_projectActive;

    public M_Project() {
    }

    public M_Project(int i_projectID, String s_projectName,
                     Date d_projectBeginDate, Date d_projectEndDate,
                     String s_projectDatabase, String s_projectLicensed,
                     int i_projectCreateID, Date d_projectCreateDate,
                     int i_projectDeleteID, Date d_projectDeleteDate,
                     int i_projectUpdateID, Date d_projectUpdateDate,
                     String s_projectActive) {
        super();
        this.i_projectID = i_projectID;
        this.s_projectName = s_projectName;
        this.d_projectBeginDate = d_projectBeginDate;
        this.d_projectEndDate = d_projectEndDate;
        this.s_projectDatabase = s_projectDatabase;
        this.s_projectLicensed = s_projectLicensed;
        this.i_projectCreateID = i_projectCreateID;
        this.d_projectCreateDate = d_projectCreateDate;
        this.i_projectDeleteID = i_projectDeleteID;
        this.d_projectDeleteDate = d_projectDeleteDate;
        this.i_projectUpdateID = i_projectUpdateID;
        this.d_projectUpdateDate = d_projectUpdateDate;
        this.s_projectActive = s_projectActive;
    }

    public int getI_projectID() {
        return i_projectID;
    }

    public void setI_projectID(int i_projectID) {
        this.i_projectID = i_projectID;
    }

    public String getS_projectName() {
        return s_projectName;
    }

    public void setS_projectName(String s_projectName) {
        this.s_projectName = s_projectName;
    }

    public Date getD_projectBeginDate() {
        return d_projectBeginDate;
    }

    public void setD_projectBeginDate(Date d_projectBeginDate) {
        this.d_projectBeginDate = d_projectBeginDate;
    }

    public Date getD_projectEndDate() {
        return d_projectEndDate;
    }

    public void setD_projectEndDate(Date d_projectEndDate) {
        this.d_projectEndDate = d_projectEndDate;
    }

    public String getS_projectDatabase() {
        return s_projectDatabase;
    }

    public void setS_projectDatabase(String s_projectDatabase) {
        this.s_projectDatabase = s_projectDatabase;
    }

    public String getS_projectLicensed() {
        return s_projectLicensed;
    }

    public void setS_projectLicensed(String s_projectLicensed) {
        this.s_projectLicensed = s_projectLicensed;
    }

    public int getI_projectCreateID() {
        return i_projectCreateID;
    }

    public void setI_projectCreateID(int i_projectCreateID) {
        this.i_projectCreateID = i_projectCreateID;
    }

    public Date getD_projectCreateDate() {
        return d_projectCreateDate;
    }

    public void setD_projectCreateDate(Date d_projectCreateDate) {
        this.d_projectCreateDate = d_projectCreateDate;
    }

    public int getI_projectDeleteID() {
        return i_projectDeleteID;
    }

    public void setI_projectDeleteID(int i_projectDeleteID) {
        this.i_projectDeleteID = i_projectDeleteID;
    }

    public Date getD_projectDeleteDate() {
        return d_projectDeleteDate;
    }

    public void setD_projectDeleteDate(Date d_projectDeleteDate) {
        this.d_projectDeleteDate = d_projectDeleteDate;
    }

    public int getI_projectUpdateID() {
        return i_projectUpdateID;
    }

    public void setI_projectUpdateID(int i_projectUpdateID) {
        this.i_projectUpdateID = i_projectUpdateID;
    }

    public Date getD_projectUpdateDate() {
        return d_projectUpdateDate;
    }

    public void setD_projectUpdateDate(Date d_projectUpdateDate) {
        this.d_projectUpdateDate = d_projectUpdateDate;
    }

    public String getS_projectActive() {
        return s_projectActive;
    }

    public void setS_projectActive(String s_projectActive) {
        this.s_projectActive = s_projectActive;
    }
}
