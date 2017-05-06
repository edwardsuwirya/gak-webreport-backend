package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Transaction;
import com.ifm.domain.security.M_User;

public class T_LogTransaction implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private M_Company company;
    private M_Transaction transaction;
    private M_User user;
    private String s_tltTransNo;

    public T_LogTransaction() {
    }

    public T_LogTransaction(M_Company company,
                            M_Transaction transaction,
                            M_User user,
                            String s_tltTransNo) {
        this.company = company;
        this.transaction = transaction;
        this.user = user;
        this.s_tltTransNo = s_tltTransNo;
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

    public M_User getUser() {
        return user;
    }

    public void setUser(M_User user) {
        this.user = user;
    }

    public String getS_tltTransNo() {
        return s_tltTransNo;
    }

    public void setS_tltTransNo(String s_tltTransNo) {
        this.s_tltTransNo = s_tltTransNo;
    }
}
