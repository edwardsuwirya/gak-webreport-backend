package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Currency;
import com.ifm.domain.security.M_User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class T_Step implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_stepCode;
    private M_User user;
    private M_Currency currency;
    private int i_stepSequence;
    private String s_stepName;
    private BigDecimal d_stepCost;
    private BigDecimal d_stepForeignExchange;
    private Date d_stepStartDate;
    private Date d_stepEndDate;
    private String s_stepStatus;
    private int i_stepCreateID;
    private Date d_stepCreateDate;
    private int i_stepUpdateID;
    private Date d_stepUpdateDate;
    private Set files;
    private Set users;

    public T_Step() {
    }

    public T_Step(String s_stepCode,
                  M_User user, M_Currency currency,
                  int i_stepSequence, String s_stepName,
                  BigDecimal d_stepCost, BigDecimal d_stepForeignExchange,
                  Date d_stepStartDate, Date d_stepEndDate,
                  String s_stepStatus,
                  int i_stepCreateID, Date d_stepCreateDate,
                  int i_stepUpdateID, Date d_stepUpdateDate) {
        this.s_stepCode = s_stepCode;
        this.user = user;
        this.currency = currency;
        this.i_stepSequence = i_stepSequence;
        this.s_stepName = s_stepName;
        this.d_stepCost = d_stepCost;
        this.d_stepForeignExchange = d_stepForeignExchange;
        this.d_stepStartDate = d_stepStartDate;
        this.d_stepEndDate = d_stepEndDate;
        this.s_stepStatus = s_stepStatus;
        this.i_stepCreateID = i_stepCreateID;
        this.d_stepCreateDate = d_stepCreateDate;
        this.i_stepUpdateID = i_stepCreateID;
        this.d_stepUpdateDate = d_stepUpdateDate;
    }

    public T_Step(String s_stepCode,
                  M_User user, M_Currency currency,
                  int i_stepSequence, String s_stepName,
                  BigDecimal d_stepCost, BigDecimal d_stepForeignExchange,
                  Date d_stepStartDate, Date d_stepEndDate,
                  String s_stepStatus,
                  int i_stepCreateID, Date d_stepCreateDate,
                  int i_stepUpdateID, Date d_stepUpdateDate,
                  Set users) {
        this.s_stepCode = s_stepCode;
        this.user = user;
        this.currency = currency;
        this.i_stepSequence = i_stepSequence;
        this.s_stepName = s_stepName;
        this.d_stepCost = d_stepCost;
        this.d_stepForeignExchange = d_stepForeignExchange;
        this.d_stepStartDate = d_stepStartDate;
        this.d_stepEndDate = d_stepEndDate;
        this.s_stepStatus = s_stepStatus;
        this.i_stepCreateID = i_stepCreateID;
        this.d_stepCreateDate = d_stepCreateDate;
        this.i_stepUpdateID = i_stepCreateID;
        this.d_stepUpdateDate = d_stepUpdateDate;
        this.users = users;
    }

    public String getS_stepCode() {
        return s_stepCode;
    }

    public void setS_stepCode(String s_stepCode) {
        this.s_stepCode = s_stepCode;
    }

    public M_User getUser() {
        return user;
    }

    public void setUser(M_User user) {
        this.user = user;
    }

    public M_Currency getCurrency() {
        return currency;
    }

    public void setCurrency(M_Currency currency) {
        this.currency = currency;
    }

    public int getI_stepSequence() {
        return i_stepSequence;
    }

    public void setI_stepSequence(int i_stepSequence) {
        this.i_stepSequence = i_stepSequence;
    }

    public String getS_stepName() {
        return s_stepName;
    }

    public void setS_stepName(String s_stepName) {
        this.s_stepName = s_stepName;
    }

    public BigDecimal getD_stepCost() {
        return d_stepCost;
    }

    public void setD_stepCost(BigDecimal d_stepCost) {
        this.d_stepCost = d_stepCost;
    }

    public BigDecimal getD_stepForeignExchange() {
        return d_stepForeignExchange;
    }

    public void setD_stepForeignExchange(BigDecimal d_stepForeignExchange) {
        this.d_stepForeignExchange = d_stepForeignExchange;
    }

    public Date getD_stepStartDate() {
        return d_stepStartDate;
    }

    public void setD_stepStartDate(Date d_stepStartDate) {
        this.d_stepStartDate = d_stepStartDate;
    }

    public Date getD_stepEndDate() {
        return d_stepEndDate;
    }

    public void setD_stepEndDate(Date d_stepEndDate) {
        this.d_stepEndDate = d_stepEndDate;
    }

    public String getS_stepStatus() {
        return s_stepStatus;
    }

    public void setS_stepStatus(String s_stepStatus) {
        this.s_stepStatus = s_stepStatus;
    }

    public int getI_stepCreateID() {
        return i_stepCreateID;
    }

    public void setI_stepCreateID(int i_stepCreateID) {
        this.i_stepCreateID = i_stepCreateID;
    }

    public Date getD_stepCreateDate() {
        return d_stepCreateDate;
    }

    public void setD_stepCreateDate(Date d_stepCreateDate) {
        this.d_stepCreateDate = d_stepCreateDate;
    }

    public int getI_stepUpdateID() {
        return i_stepUpdateID;
    }

    public void setI_stepUpdateID(int i_stepUpdateID) {
        this.i_stepUpdateID = i_stepUpdateID;
    }

    public Date getD_stepUpdateDate() {
        return d_stepUpdateDate;
    }

    public void setD_stepUpdateDate(Date d_stepUpdateDate) {
        this.d_stepUpdateDate = d_stepUpdateDate;
    }

    public Set getFiles() {
        return files;
    }

    public void setFiles(Set files) {
        this.files = files;
    }

    public Set getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }
}
