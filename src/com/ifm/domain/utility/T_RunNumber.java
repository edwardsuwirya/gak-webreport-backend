package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Transaction;

public class T_RunNumber implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private M_Transaction transaction;
    private M_Company company;
    private String s_trnPrefix;
    private int i_trnLastNumber;
    private int i_trnUpdateID;
    private Date d_trnUpdateDate;

    public T_RunNumber() {
    }

    public M_Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(M_Transaction transaction) {
        this.transaction = transaction;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_trnPrefix() {
        return s_trnPrefix;
    }

    public void setS_trnPrefix(String s_trnPrefix) {
        this.s_trnPrefix = s_trnPrefix;
    }

    public int getI_trnLastNumber() {
        return i_trnLastNumber;
    }

    public void setI_trnLastNumber(int i_trnLastNumber) {
        this.i_trnLastNumber = i_trnLastNumber;
    }

    public int getI_trnUpdateID() {
        return i_trnUpdateID;
    }

    public void setI_trnUpdateID(int i_trnUpdateID) {
        this.i_trnUpdateID = i_trnUpdateID;
    }

    public Date getD_trnUpdateDate() {
        return d_trnUpdateDate;
    }

    public void setD_trnUpdateDate(Date d_trnUpdateDate) {
        this.d_trnUpdateDate = d_trnUpdateDate;
    }
}
