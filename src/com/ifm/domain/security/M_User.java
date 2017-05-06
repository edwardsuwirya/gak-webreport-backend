package com.ifm.domain.security;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Country;

import java.util.Date;
import java.util.Set;


public class M_User implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private int i_userID;
    private M_UserLevel userLevel;
    private M_Country country;
    private String s_userName;
    private String s_userPassword;
    private String s_userLocked;
    private String s_userGender;
    private Date d_userBirthDate;
    private int i_userCreateID;
    private Date d_userCreateDate;
    private int i_userDeleteID;
    private Date d_userDeleteDate;
    private int i_userUpdateID;
    private Date d_userUpdateDate;
    private String s_userActive;
    private Set companies;
    private Set moduls;
    private Set rur;
    private Set rut;

    public M_User() {
    }

    public M_User(int i_userID,
                  M_UserLevel userLevel,
                  M_Country country,
                  String s_userName,
                  String s_userPassword,
                  String s_userLocked,
                  String s_userGender,
                  Date d_userBirthDate,
                  int i_userCreateID, Date d_userCreateDate,
                  int i_userDeleteID, Date d_userDeleteDate,
                  int i_userUpdateID, Date d_userUpdateDate,
                  String s_userActive) {
        this.i_userID = i_userID;
        this.userLevel = userLevel;
        this.country = country;
        this.s_userName = s_userName;
        this.s_userPassword = s_userPassword;
        this.s_userLocked = s_userLocked;
        this.s_userGender = s_userGender;
        this.d_userBirthDate = d_userBirthDate;
        this.i_userCreateID = i_userCreateID;
        this.d_userCreateDate = d_userCreateDate;
        this.i_userDeleteID = i_userDeleteID;
        this.d_userDeleteDate = d_userDeleteDate;
        this.i_userUpdateID = i_userUpdateID;
        this.d_userUpdateDate = d_userUpdateDate;
        this.s_userActive = s_userActive;
    }

    public int getI_userID() {
        return i_userID;
    }

    public void setI_userID(int i_userID) {
        this.i_userID = i_userID;
    }

    public M_UserLevel getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(M_UserLevel userLevel) {
        this.userLevel = userLevel;
    }

    public M_Country getCountry() {
        return country;
    }

    public void setCountry(M_Country country) {
        this.country = country;
    }

    public String getS_userName() {
        return s_userName;
    }

    public void setS_userName(String s_userName) {
        this.s_userName = s_userName;
    }

    public String getS_userPassword() {
        return s_userPassword;
    }

    public void setS_userPassword(String s_userPassword) {
        this.s_userPassword = s_userPassword;
    }

    public String getS_userLocked() {
        return s_userLocked;
    }

    public void setS_userLocked(String s_userLocked) {
        this.s_userLocked = s_userLocked;
    }

    public String getS_userGender() {
        return s_userGender;
    }

    public void setS_userGender(String s_userGender) {
        this.s_userGender = s_userGender;
    }

    public Date getD_userBirthDate() {
        return d_userBirthDate;
    }

    public void setD_userBirthDate(Date d_userBirthDate) {
        this.d_userBirthDate = d_userBirthDate;
    }

    public int getI_userCreateID() {
        return i_userCreateID;
    }

    public void setI_userCreateID(int i_userCreateID) {
        this.i_userCreateID = i_userCreateID;
    }

    public Date getD_userCreateDate() {
        return d_userCreateDate;
    }

    public void setD_userCreateDate(Date d_userCreateDate) {
        this.d_userCreateDate = d_userCreateDate;
    }

    public int getI_userDeleteID() {
        return i_userDeleteID;
    }

    public void setI_userDeleteID(int i_userDeleteID) {
        this.i_userDeleteID = i_userDeleteID;
    }

    public Date getD_userDeleteDate() {
        return d_userDeleteDate;
    }

    public void setD_userDeleteDate(Date d_userDeleteDate) {
        this.d_userDeleteDate = d_userDeleteDate;
    }

    public int getI_userUpdateID() {
        return i_userUpdateID;
    }

    public void setI_userUpdateID(int i_userUpdateID) {
        this.i_userUpdateID = i_userUpdateID;
    }

    public Date getD_userUpdateDate() {
        return d_userUpdateDate;
    }

    public void setD_userUpdateDate(Date d_userUpdateDate) {
        this.d_userUpdateDate = d_userUpdateDate;
    }

    public String getS_userActive() {
        return s_userActive;
    }

    public void setS_userActive(String s_userActive) {
        this.s_userActive = s_userActive;
    }

    public Set getCompanies() {
        return companies;
    }

    public void setCompanies(Set companies) {
        this.companies = companies;
    }

    public Set getModuls() {
        return moduls;
    }

    public void setModuls(Set moduls) {
        this.moduls = moduls;
    }

    public Set getRur() {
        return rur;
    }

    public void setRur(Set rur) {
        this.rur = rur;
    }

    public Set getRut() {
        return rut;
    }

    public void setRut(Set rut) {
        this.rut = rut;
    }
}
