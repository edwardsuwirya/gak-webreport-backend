package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Currency;
import com.ifm.domain.master.M_ResponsibilityCenter;
import com.ifm.domain.security.M_User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class T_Task implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_taskCode;
    private M_Company company;
    private M_User user;
    private M_Currency currency;
    private M_ResponsibilityCenter responsibilitycenter;
    private String s_taskRealCode;
    private String s_taskName;
    private Date d_taskEstimateStartDate;
    private Date d_taskEstimateEndDate;
    private BigDecimal d_taskEstimateBudget;
    private Date d_taskStartDate;
    private Date d_taskEndDate;
    private BigDecimal d_taskCost;
    private String s_taskStatus;
    private int i_taskCreateID;
    private Date d_taskCreateDate;
    private int i_taskDeleteID;
    private Date d_taskDeleteDate;
    private int i_taskCancelID;
    private Date d_taskCancelDate;
    private String s_taskCancelReason;
    private int i_taskUpdateID;
    private Date d_taskUpdateDate;
    private String s_taskActive;
    private Set steps;

    public T_Task() {
    }

    public T_Task(String s_taskCode,
                  M_Company company, M_User user, M_Currency currency, M_ResponsibilityCenter responsibilitycenter,
                  String s_taskRealCode, String s_taskName,
                  Date d_taskEstimateStartDate, Date d_taskEstimateEndDate,
                  BigDecimal d_taskEstimateBudget,
                  Date d_taskStartDate, Date d_taskEndDate,
                  BigDecimal d_taskCost,
                  String s_taskStatus,
                  int i_taskCreateID, Date d_taskCreateDate,
                  int i_taskDeleteID, Date d_taskDeleteDate,
                  int i_taskCancelID, Date d_taskCancelDate,
                  String s_taskCancelReason,
                  int i_taskUpdateID, Date d_taskUpdateDate,
                  String s_taskActive) {
        this.s_taskCode = s_taskCode;
        this.company = company;
        this.user = user;
        this.currency = currency;
        this.responsibilitycenter = responsibilitycenter;
        this.s_taskRealCode = s_taskRealCode;
        this.s_taskName = s_taskName;
        this.d_taskEstimateStartDate = d_taskEstimateStartDate;
        this.d_taskEstimateEndDate = d_taskEstimateEndDate;
        this.d_taskEstimateBudget = d_taskEstimateBudget;
        this.d_taskStartDate = d_taskStartDate;
        this.d_taskEndDate = d_taskEndDate;
        this.d_taskCost = d_taskCost;
        this.s_taskStatus = s_taskStatus;
        this.i_taskCreateID = i_taskCreateID;
        this.d_taskCreateDate = d_taskCreateDate;
        this.i_taskDeleteID = i_taskDeleteID;
        this.d_taskDeleteDate = d_taskDeleteDate;
        this.i_taskCancelID = i_taskCancelID;
        this.d_taskCancelDate = d_taskCancelDate;
        this.s_taskCancelReason = s_taskCancelReason;
        this.i_taskUpdateID = i_taskUpdateID;
        this.d_taskUpdateDate = d_taskUpdateDate;
        this.s_taskActive = s_taskActive;
    }

    public String getS_taskCode() {
        return s_taskCode;
    }

    public void setS_taskCode(String s_taskCode) {
        this.s_taskCode = s_taskCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
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

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public String getS_taskRealCode() {
        return s_taskRealCode;
    }

    public void setS_taskRealCode(String s_taskRealCode) {
        this.s_taskRealCode = s_taskRealCode;
    }

    public String getS_taskName() {
        return s_taskName;
    }

    public void setS_taskName(String s_taskName) {
        this.s_taskName = s_taskName;
    }

    public Date getD_taskEstimateStartDate() {
        return d_taskEstimateStartDate;
    }

    public void setD_taskEstimateStartDate(Date d_taskEstimateStartDate) {
        this.d_taskEstimateStartDate = d_taskEstimateStartDate;
    }

    public Date getD_taskEstimateEndDate() {
        return d_taskEstimateEndDate;
    }

    public void setD_taskEstimateEndDate(Date d_taskEstimateEndDate) {
        this.d_taskEstimateEndDate = d_taskEstimateEndDate;
    }

    public BigDecimal getD_taskEstimateBudget() {
        return d_taskEstimateBudget;
    }

    public void setD_taskEstimateBudget(BigDecimal d_taskEstimateBudget) {
        this.d_taskEstimateBudget = d_taskEstimateBudget;
    }

    public Date getD_taskStartDate() {
        return d_taskStartDate;
    }

    public void setD_taskStartDate(Date d_taskStartDate) {
        this.d_taskStartDate = d_taskStartDate;
    }

    public Date getD_taskEndDate() {
        return d_taskEndDate;
    }

    public void setD_taskEndDate(Date d_taskEndDate) {
        this.d_taskEndDate = d_taskEndDate;
    }

    public BigDecimal getD_taskCost() {
        return d_taskCost;
    }

    public void setD_taskCost(BigDecimal d_taskCost) {
        this.d_taskCost = d_taskCost;
    }

    public String getS_taskStatus() {
        return s_taskStatus;
    }

    public void setS_taskStatus(String s_taskStatus) {
        this.s_taskStatus = s_taskStatus;
    }

    public int getI_taskCreateID() {
        return i_taskCreateID;
    }

    public void setI_taskCreateID(int i_taskCreateID) {
        this.i_taskCreateID = i_taskCreateID;
    }

    public Date getD_taskCreateDate() {
        return d_taskCreateDate;
    }

    public void setD_taskCreateDate(Date d_taskCreateDate) {
        this.d_taskCreateDate = d_taskCreateDate;
    }

    public int getI_taskDeleteID() {
        return i_taskDeleteID;
    }

    public void setI_taskDeleteID(int i_taskDeleteID) {
        this.i_taskDeleteID = i_taskDeleteID;
    }

    public Date getD_taskDeleteDate() {
        return d_taskDeleteDate;
    }

    public void setD_taskDeleteDate(Date d_taskDeleteDate) {
        this.d_taskDeleteDate = d_taskDeleteDate;
    }

    public int getI_taskCancelID() {
        return i_taskCancelID;
    }

    public void setI_taskCancelID(int i_taskCancelID) {
        this.i_taskCancelID = i_taskCancelID;
    }

    public Date getD_taskCancelDate() {
        return d_taskCancelDate;
    }

    public void setD_taskCancelDate(Date d_taskCancelDate) {
        this.d_taskCancelDate = d_taskCancelDate;
    }

    public String getS_taskCancelReason() {
        return s_taskCancelReason;
    }

    public void setS_taskCancelReason(String s_taskCancelReason) {
        this.s_taskCancelReason = s_taskCancelReason;
    }

    public int getI_taskUpdateID() {
        return i_taskUpdateID;
    }

    public void setI_taskUpdateID(int i_taskUpdateID) {
        this.i_taskUpdateID = i_taskUpdateID;
    }

    public Date getD_taskUpdateDate() {
        return d_taskUpdateDate;
    }

    public void setD_taskUpdateDate(Date d_taskUpdateDate) {
        this.d_taskUpdateDate = d_taskUpdateDate;
    }

    public String getS_taskActive() {
        return s_taskActive;
    }

    public void setS_taskActive(String s_taskActive) {
        this.s_taskActive = s_taskActive;
    }

    public Set getSteps() {
        return steps;
    }

    public void setSteps(Set steps) {
        this.steps = steps;
    }
}
