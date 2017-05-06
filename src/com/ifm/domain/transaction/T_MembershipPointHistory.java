package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Customer;
import com.ifm.domain.master.M_Transaction;

public class T_MembershipPointHistory implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_tmpTransNo;
    private M_Company company;
    private M_Transaction transaction;
    private M_Customer member;
    private int i_tmpItemSequence;
    private String s_tmpItemCode;
    private String s_tmpTransRealNo;
    private String s_tmpItemRealCode;
    private String s_tmpItemName;
    private int i_tmpPoint;
    private int i_tmpTransCreateID;
    private Date d_tmpTransCreateDate;

    public T_MembershipPointHistory(String s_tmpTransNo,
                                    M_Company company,
                                    M_Transaction transaction,
                                    M_Customer member,
                                    int i_tmpItemSequence,
                                    String s_tmpItemCode,
                                    String s_tmpTransRealNo,
                                    String s_tmpItemRealCode,
                                    String s_tmpItemName,
                                    int i_tmpPoint,
                                    int i_tmpTransCreateID,
                                    Date d_tmpTransCreateDate) {
        this.s_tmpTransNo = s_tmpTransNo;
        this.company = company;
        this.transaction = transaction;
        this.member = member;
        this.i_tmpItemSequence = i_tmpItemSequence;
        this.s_tmpItemCode = s_tmpItemCode;
        this.s_tmpTransRealNo = s_tmpTransRealNo;
        this.s_tmpItemRealCode = s_tmpItemRealCode;
        this.s_tmpItemName = s_tmpItemName;
        this.i_tmpPoint = i_tmpPoint;
        this.i_tmpTransCreateID = i_tmpTransCreateID;
        this.d_tmpTransCreateDate = d_tmpTransCreateDate;
    }

    public T_MembershipPointHistory() {
    }

    public String getS_tmpTransNo() {
        return s_tmpTransNo;
    }

    public void setS_tmpTransNo(String s_tmpTransNo) {
        this.s_tmpTransNo = s_tmpTransNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(M_Transaction transaction) {
        this.transaction = transaction;
    }

    public M_Customer getMember() {
        return member;
    }

    public void setMember(M_Customer member) {
        this.member = member;
    }

    public int getI_tmpItemSequence() {
        return i_tmpItemSequence;
    }

    public void setI_tmpItemSequence(int i_tmpItemSequence) {
        this.i_tmpItemSequence = i_tmpItemSequence;
    }

    public String getS_tmpItemCode() {
        return s_tmpItemCode;
    }

    public void setS_tmpItemCode(String s_tmpItemCode) {
        this.s_tmpItemCode = s_tmpItemCode;
    }

    public String getS_tmpTransRealNo() {
        return s_tmpTransRealNo;
    }

    public void setS_tmpTransRealNo(String s_tmpTransRealNo) {
        this.s_tmpTransRealNo = s_tmpTransRealNo;
    }

    public String getS_tmpItemRealCode() {
        return s_tmpItemRealCode;
    }

    public void setS_tmpItemRealCode(String s_tmpItemRealCode) {
        this.s_tmpItemRealCode = s_tmpItemRealCode;
    }

    public String getS_tmpItemName() {
        return s_tmpItemName;
    }

    public void setS_tmpItemName(String s_tmpItemName) {
        this.s_tmpItemName = s_tmpItemName;
    }

    public int getI_tmpPoint() {
        return i_tmpPoint;
    }

    public void setI_tmpPoint(int i_tmpPoint) {
        this.i_tmpPoint = i_tmpPoint;
    }

    public int getI_tmpTransCreateID() {
        return i_tmpTransCreateID;
    }

    public void setI_tmpTransCreateID(int i_tmpTransCreateID) {
        this.i_tmpTransCreateID = i_tmpTransCreateID;
    }

    public Date getD_tmpTransCreateDate() {
        return d_tmpTransCreateDate;
    }

    public void setD_tmpTransCreateDate(Date d_tmpTransCreateDate) {
        this.d_tmpTransCreateDate = d_tmpTransCreateDate;
    }
}