package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_EmployeeFamilyMember implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_employeeFamilyMemberCode;
    private M_FamilyMember familymember;
    private int i_employeeFamilyMemberNo;
    private String s_employeeFamilyMemberName;
    private Date d_employeeFamilyMemberBirthdate;
    private String s_employeeFamilyMemberGender;
    private int i_employeeFamilyMemberCreateID;
    private Date d_employeeFamilyMemberCreateDate;
    private int i_employeeFamilyMemberDeleteID;
    private Date d_employeeFamilyMemberDeleteDate;
    private int i_employeeFamilyMemberUpdateID;
    private Date d_employeeFamilyMemberUpdateDate;
    private String s_employeeFamilyMemberActive;

    public M_EmployeeFamilyMember(String s_employeeFamilyMemberCode,
                                  M_FamilyMember familymember,
                                  int i_employeeFamilyMemberNo,
                                  String s_employeeFamilyMemberName,
                                  Date d_employeeFamilyMemberBirthdate,
                                  String s_employeeFamilyMemberGender,
                                  int i_employeeFamilyMemberCreateID, Date d_employeeFamilyMemberCreateDate,
                                  int i_employeeFamilyMemberDeleteID, Date d_employeeFamilyMemberDeleteDate,
                                  int i_employeeFamilyMemberUpdateID, Date d_employeeFamilyMemberUpdateDate,
                                  String s_employeeFamilyMemberActive) {
        this.s_employeeFamilyMemberCode = s_employeeFamilyMemberCode;
        this.familymember = familymember;
        this.i_employeeFamilyMemberNo = i_employeeFamilyMemberNo;
        this.s_employeeFamilyMemberName = s_employeeFamilyMemberName;
        this.d_employeeFamilyMemberBirthdate = d_employeeFamilyMemberBirthdate;
        this.s_employeeFamilyMemberGender = s_employeeFamilyMemberGender;
        this.i_employeeFamilyMemberCreateID = i_employeeFamilyMemberCreateID;
        this.d_employeeFamilyMemberCreateDate = d_employeeFamilyMemberCreateDate;
        this.i_employeeFamilyMemberDeleteID = i_employeeFamilyMemberDeleteID;
        this.d_employeeFamilyMemberDeleteDate = d_employeeFamilyMemberDeleteDate;
        this.i_employeeFamilyMemberUpdateID = i_employeeFamilyMemberUpdateID;
        this.d_employeeFamilyMemberUpdateDate = d_employeeFamilyMemberUpdateDate;
        this.s_employeeFamilyMemberActive = s_employeeFamilyMemberActive;
    }

    public M_EmployeeFamilyMember() {
    }

    public String getS_employeeFamilyMemberCode() {
        return s_employeeFamilyMemberCode;
    }

    public void setS_employeeFamilyMemberCode(String s_employeeFamilyMemberCode) {
        this.s_employeeFamilyMemberCode = s_employeeFamilyMemberCode;
    }

    public M_FamilyMember getFamilymember() {
        return familymember;
    }

    public void setFamilymember(M_FamilyMember familymember) {
        this.familymember = familymember;
    }

    public int getI_employeeFamilyMemberNo() {
        return i_employeeFamilyMemberNo;
    }

    public void setI_employeeFamilyMemberNo(int i_employeeFamilyMemberNo) {
        this.i_employeeFamilyMemberNo = i_employeeFamilyMemberNo;
    }

    public String getS_employeeFamilyMemberName() {
        return s_employeeFamilyMemberName;
    }

    public void setS_employeeFamilyMemberName(String s_employeeFamilyMemberName) {
        this.s_employeeFamilyMemberName = s_employeeFamilyMemberName;
    }

    public Date getD_employeeFamilyMemberBirthdate() {
        return d_employeeFamilyMemberBirthdate;
    }

    public void setD_employeeFamilyMemberBirthdate(
            Date d_employeeFamilyMemberBirthdate) {
        this.d_employeeFamilyMemberBirthdate = d_employeeFamilyMemberBirthdate;
    }

    public String getS_employeeFamilyMemberGender() {
        return s_employeeFamilyMemberGender;
    }

    public void setS_employeeFamilyMemberGender(String s_employeeFamilyMemberGender) {
        this.s_employeeFamilyMemberGender = s_employeeFamilyMemberGender;
    }

    public int getI_employeeFamilyMemberCreateID() {
        return i_employeeFamilyMemberCreateID;
    }

    public void setI_employeeFamilyMemberCreateID(int i_employeeFamilyMemberCreateID) {
        this.i_employeeFamilyMemberCreateID = i_employeeFamilyMemberCreateID;
    }

    public Date getD_employeeFamilyMemberCreateDate() {
        return d_employeeFamilyMemberCreateDate;
    }

    public void setD_employeeFamilyMemberCreateDate(
            Date d_employeeFamilyMemberCreateDate) {
        this.d_employeeFamilyMemberCreateDate = d_employeeFamilyMemberCreateDate;
    }

    public int getI_employeeFamilyMemberDeleteID() {
        return i_employeeFamilyMemberDeleteID;
    }

    public void setI_employeeFamilyMemberDeleteID(int i_employeeFamilyMemberDeleteID) {
        this.i_employeeFamilyMemberDeleteID = i_employeeFamilyMemberDeleteID;
    }

    public Date getD_employeeFamilyMemberDeleteDate() {
        return d_employeeFamilyMemberDeleteDate;
    }

    public void setD_employeeFamilyMemberDeleteDate(
            Date d_employeeFamilyMemberDeleteDate) {
        this.d_employeeFamilyMemberDeleteDate = d_employeeFamilyMemberDeleteDate;
    }

    public int getI_employeeFamilyMemberUpdateID() {
        return i_employeeFamilyMemberUpdateID;
    }

    public void setI_employeeFamilyMemberUpdateID(int i_employeeFamilyMemberUpdateID) {
        this.i_employeeFamilyMemberUpdateID = i_employeeFamilyMemberUpdateID;
    }

    public Date getD_employeeFamilyMemberUpdateDate() {
        return d_employeeFamilyMemberUpdateDate;
    }

    public void setD_employeeFamilyMemberUpdateDate(
            Date d_employeeFamilyMemberUpdateDate) {
        this.d_employeeFamilyMemberUpdateDate = d_employeeFamilyMemberUpdateDate;
    }

    public String getS_employeeFamilyMemberActive() {
        return s_employeeFamilyMemberActive;
    }

    public void setS_employeeFamilyMemberActive(String s_employeeFamilyMemberActive) {
        this.s_employeeFamilyMemberActive = s_employeeFamilyMemberActive;
    }
}
