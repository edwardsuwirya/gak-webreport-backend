package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_EmployeeJobPosition implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_employeeJobPositionCode;
    private M_Division division;
    private M_Department department;
    private M_Section section;
    private M_JobPosition jobposition;
    private M_Employee supervisor;
    private int i_employeeJobPositionNo;
    private int i_employeeJobPositionCreateID;
    private Date d_employeeJobPositionCreateDate;
    private int i_employeeJobPositionDeleteID;
    private Date d_employeeJobPositionDeleteDate;
    private int i_employeeJobPositionUpdateID;
    private Date d_employeeJobPositionUpdateDate;
    private String s_employeeJobPositionActive;

    public M_EmployeeJobPosition(String s_employeeJobPositionCode,
                                 M_Division division,
                                 M_Department department,
                                 M_Section section,
                                 M_JobPosition jobposition,
                                 M_Employee supervisor,
                                 int i_employeeJobPositionNo,
                                 int i_employeeJobPositionCreateID,
                                 Date d_employeeJobPositionCreateDate,
                                 int i_employeeJobPositionDeleteID,
                                 Date d_employeeJobPositionDeleteDate,
                                 int i_employeeJobPositionUpdateID,
                                 Date d_employeeJobPositionUpdateDate,
                                 String s_employeeJobPositionActive) {
        this.s_employeeJobPositionCode = s_employeeJobPositionCode;
        this.division = division;
        this.department = department;
        this.section = section;
        this.jobposition = jobposition;
        this.supervisor = supervisor;
        this.i_employeeJobPositionNo = i_employeeJobPositionNo;
        this.i_employeeJobPositionCreateID = i_employeeJobPositionCreateID;
        this.d_employeeJobPositionCreateDate = d_employeeJobPositionCreateDate;
        this.i_employeeJobPositionDeleteID = i_employeeJobPositionDeleteID;
        this.d_employeeJobPositionDeleteDate = d_employeeJobPositionDeleteDate;
        this.i_employeeJobPositionUpdateID = i_employeeJobPositionUpdateID;
        this.d_employeeJobPositionUpdateDate = d_employeeJobPositionUpdateDate;
        this.s_employeeJobPositionActive = s_employeeJobPositionActive;
    }

    public M_EmployeeJobPosition() {
    }

    public String getS_employeeJobPositionCode() {
        return s_employeeJobPositionCode;
    }

    public void setS_employeeJobPositionCode(String s_employeeJobPositionCode) {
        this.s_employeeJobPositionCode = s_employeeJobPositionCode;
    }

    public M_Division getDivision() {
        return division;
    }

    public void setDivision(M_Division division) {
        this.division = division;
    }

    public M_Department getDepartment() {
        return department;
    }

    public void setDepartment(M_Department department) {
        this.department = department;
    }

    public M_Section getSection() {
        return section;
    }

    public void setSection(M_Section section) {
        this.section = section;
    }

    public M_JobPosition getJobposition() {
        return jobposition;
    }

    public void setJobposition(M_JobPosition jobposition) {
        this.jobposition = jobposition;
    }

    public M_Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(M_Employee supervisor) {
        this.supervisor = supervisor;
    }

    public int getI_employeeJobPositionNo() {
        return i_employeeJobPositionNo;
    }

    public void setI_employeeJobPositionNo(int i_employeeJobPositionNo) {
        this.i_employeeJobPositionNo = i_employeeJobPositionNo;
    }

    public int getI_employeeJobPositionCreateID() {
        return i_employeeJobPositionCreateID;
    }

    public void setI_employeeJobPositionCreateID(int i_employeeJobPositionCreateID) {
        this.i_employeeJobPositionCreateID = i_employeeJobPositionCreateID;
    }

    public Date getD_employeeJobPositionCreateDate() {
        return d_employeeJobPositionCreateDate;
    }

    public void setD_employeeJobPositionCreateDate(
            Date d_employeeJobPositionCreateDate) {
        this.d_employeeJobPositionCreateDate = d_employeeJobPositionCreateDate;
    }

    public int getI_employeeJobPositionDeleteID() {
        return i_employeeJobPositionDeleteID;
    }

    public void setI_employeeJobPositionDeleteID(int i_employeeJobPositionDeleteID) {
        this.i_employeeJobPositionDeleteID = i_employeeJobPositionDeleteID;
    }

    public Date getD_employeeJobPositionDeleteDate() {
        return d_employeeJobPositionDeleteDate;
    }

    public void setD_employeeJobPositionDeleteDate(
            Date d_employeeJobPositionDeleteDate) {
        this.d_employeeJobPositionDeleteDate = d_employeeJobPositionDeleteDate;
    }

    public int getI_employeeJobPositionUpdateID() {
        return i_employeeJobPositionUpdateID;
    }

    public void setI_employeeJobPositionUpdateID(int i_employeeJobPositionUpdateID) {
        this.i_employeeJobPositionUpdateID = i_employeeJobPositionUpdateID;
    }

    public Date getD_employeeJobPositionUpdateDate() {
        return d_employeeJobPositionUpdateDate;
    }

    public void setD_employeeJobPositionUpdateDate(
            Date d_employeeJobPositionUpdateDate) {
        this.d_employeeJobPositionUpdateDate = d_employeeJobPositionUpdateDate;
    }

    public String getS_employeeJobPositionActive() {
        return s_employeeJobPositionActive;
    }

    public void setS_employeeJobPositionActive(String s_employeeJobPositionActive) {
        this.s_employeeJobPositionActive = s_employeeJobPositionActive;
    }
}
