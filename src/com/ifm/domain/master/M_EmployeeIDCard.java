package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_EmployeeIDCard implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_employeeIDCardCode;
    private M_IDCard idcard;
    private int i_employeeIDCardNo;
    private String s_employeeIDCardIDCardNo;
    private int i_employeeIDCardCreateID;
    private Date d_employeeIDCardCreateDate;
    private int i_employeeIDCardDeleteID;
    private Date d_employeeIDCardDeleteDate;
    private int i_employeeIDCardUpdateID;
    private Date d_employeeIDCardUpdateDate;
    private String s_employeeIDCardActive;

    public M_EmployeeIDCard(String s_employeeIDCardCode,
                            M_IDCard idcard,
                            int i_employeeIDCardNo,
                            String s_employeeIDCardIDCardNo,
                            int i_employeeIDCardCreateID,
                            Date d_employeeIDCardCreateDate,
                            int i_employeeIDCardDeleteID,
                            Date d_employeeIDCardDeleteDate,
                            int i_employeeIDCardUpdateID,
                            Date d_employeeIDCardUpdateDate,
                            String s_employeeIDCardActive) {
        this.s_employeeIDCardCode = s_employeeIDCardCode;
        this.idcard = idcard;
        this.i_employeeIDCardNo = i_employeeIDCardNo;
        this.s_employeeIDCardIDCardNo = s_employeeIDCardIDCardNo;
        this.i_employeeIDCardCreateID = i_employeeIDCardCreateID;
        this.d_employeeIDCardCreateDate = d_employeeIDCardCreateDate;
        this.i_employeeIDCardDeleteID = i_employeeIDCardDeleteID;
        this.d_employeeIDCardDeleteDate = d_employeeIDCardDeleteDate;
        this.i_employeeIDCardUpdateID = i_employeeIDCardUpdateID;
        this.d_employeeIDCardUpdateDate = d_employeeIDCardUpdateDate;
        this.s_employeeIDCardActive = s_employeeIDCardActive;
    }

    public M_EmployeeIDCard() {
    }

    public String getS_employeeIDCardCode() {
        return s_employeeIDCardCode;
    }

    public void setS_employeeIDCardCode(String s_employeeIDCardCode) {
        this.s_employeeIDCardCode = s_employeeIDCardCode;
    }

    public M_IDCard getIdcard() {
        return idcard;
    }

    public void setIdcard(M_IDCard idcard) {
        this.idcard = idcard;
    }

    public int getI_employeeIDCardNo() {
        return i_employeeIDCardNo;
    }

    public void setI_employeeIDCardNo(int i_employeeIDCardNo) {
        this.i_employeeIDCardNo = i_employeeIDCardNo;
    }

    public String getS_employeeIDCardIDCardNo() {
        return s_employeeIDCardIDCardNo;
    }

    public void setS_employeeIDCardIDCardNo(String s_employeeIDCardIDCardNo) {
        this.s_employeeIDCardIDCardNo = s_employeeIDCardIDCardNo;
    }

    public int getI_employeeIDCardCreateID() {
        return i_employeeIDCardCreateID;
    }

    public void setI_employeeIDCardCreateID(int i_employeeIDCardCreateID) {
        this.i_employeeIDCardCreateID = i_employeeIDCardCreateID;
    }

    public Date getD_employeeIDCardCreateDate() {
        return d_employeeIDCardCreateDate;
    }

    public void setD_employeeIDCardCreateDate(Date d_employeeIDCardCreateDate) {
        this.d_employeeIDCardCreateDate = d_employeeIDCardCreateDate;
    }

    public int getI_employeeIDCardDeleteID() {
        return i_employeeIDCardDeleteID;
    }

    public void setI_employeeIDCardDeleteID(int i_employeeIDCardDeleteID) {
        this.i_employeeIDCardDeleteID = i_employeeIDCardDeleteID;
    }

    public Date getD_employeeIDCardDeleteDate() {
        return d_employeeIDCardDeleteDate;
    }

    public void setD_employeeIDCardDeleteDate(Date d_employeeIDCardDeleteDate) {
        this.d_employeeIDCardDeleteDate = d_employeeIDCardDeleteDate;
    }

    public int getI_employeeIDCardUpdateID() {
        return i_employeeIDCardUpdateID;
    }

    public void setI_employeeIDCardUpdateID(int i_employeeIDCardUpdateID) {
        this.i_employeeIDCardUpdateID = i_employeeIDCardUpdateID;
    }

    public Date getD_employeeIDCardUpdateDate() {
        return d_employeeIDCardUpdateDate;
    }

    public void setD_employeeIDCardUpdateDate(Date d_employeeIDCardUpdateDate) {
        this.d_employeeIDCardUpdateDate = d_employeeIDCardUpdateDate;
    }

    public String getS_employeeIDCardActive() {
        return s_employeeIDCardActive;
    }

    public void setS_employeeIDCardActive(String s_employeeIDCardActive) {
        this.s_employeeIDCardActive = s_employeeIDCardActive;
    }
}
