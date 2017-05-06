package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

public class M_PaymentType implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_paymentTypeCode;
    private M_Company company;
    private M_Coa coaar;
    private String s_paymentTypeRealCode;
    private String s_paymentTypeName;
    private String s_paymentTypeNeedCardType;
    private String s_paymentTypeNeedCardNo;
    private String s_paymentTypeNeedCardBank;
    private String s_paymentTypeNeedCardExp;
    private String s_paymentTypeNeedCardCharge;
    private String s_paymentTypeNeedEdc;
    private String s_paymentTypePointCalculation;
    private int i_paymentTypeCreateID;
    private Date d_paymentTypeCreateDate;
    private int i_paymentTypeDeleteID;
    private Date d_paymentTypeDeleteDate;
    private int i_paymentTypeUpdateID;
    private Date d_paymentTypeUpdateDate;
    private String s_paymentTypeActive;
    private Set coaars;

    public M_PaymentType() {
    }

    public String getS_paymentTypeCode() {
        return s_paymentTypeCode;
    }

    public void setS_paymentTypeCode(String s_paymentTypeCode) {
        this.s_paymentTypeCode = s_paymentTypeCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Coa getCoaar() {
        return coaar;
    }

    public void setCoaar(M_Coa coaar) {
        this.coaar = coaar;
    }

    public String getS_paymentTypeRealCode() {
        return s_paymentTypeRealCode;
    }

    public void setS_paymentTypeRealCode(String s_paymentTypeRealCode) {
        this.s_paymentTypeRealCode = s_paymentTypeRealCode;
    }

    public String getS_paymentTypeName() {
        return s_paymentTypeName;
    }

    public void setS_paymentTypeName(String s_paymentTypeName) {
        this.s_paymentTypeName = s_paymentTypeName;
    }

    public String getS_paymentTypeNeedCardType() {
        return s_paymentTypeNeedCardType;
    }

    public void setS_paymentTypeNeedCardType(String s_paymentTypeNeedCardType) {
        this.s_paymentTypeNeedCardType = s_paymentTypeNeedCardType;
    }

    public String getS_paymentTypeNeedCardNo() {
        return s_paymentTypeNeedCardNo;
    }

    public void setS_paymentTypeNeedCardNo(String s_paymentTypeNeedCardNo) {
        this.s_paymentTypeNeedCardNo = s_paymentTypeNeedCardNo;
    }

    public String getS_paymentTypeNeedCardBank() {
        return s_paymentTypeNeedCardBank;
    }

    public void setS_paymentTypeNeedCardBank(String s_paymentTypeNeedCardBank) {
        this.s_paymentTypeNeedCardBank = s_paymentTypeNeedCardBank;
    }

    public String getS_paymentTypeNeedCardExp() {
        return s_paymentTypeNeedCardExp;
    }

    public void setS_paymentTypeNeedCardExp(String s_paymentTypeNeedCardExp) {
        this.s_paymentTypeNeedCardExp = s_paymentTypeNeedCardExp;
    }

    public String getS_paymentTypeNeedCardCharge() {
        return s_paymentTypeNeedCardCharge;
    }

    public void setS_paymentTypeNeedCardCharge(String s_paymentTypeNeedCardCharge) {
        this.s_paymentTypeNeedCardCharge = s_paymentTypeNeedCardCharge;
    }

    public String getS_paymentTypeNeedEdc() {
        return s_paymentTypeNeedEdc;
    }

    public void setS_paymentTypeNeedEdc(String s_paymentTypeNeedEdc) {
        this.s_paymentTypeNeedEdc = s_paymentTypeNeedEdc;
    }

    public String getS_paymentTypePointCalculation() {
        return s_paymentTypePointCalculation;
    }

    public void setS_paymentTypePointCalculation(
            String s_paymentTypePointCalculation) {
        this.s_paymentTypePointCalculation = s_paymentTypePointCalculation;
    }

    public int getI_paymentTypeCreateID() {
        return i_paymentTypeCreateID;
    }

    public void setI_paymentTypeCreateID(int i_paymentTypeCreateID) {
        this.i_paymentTypeCreateID = i_paymentTypeCreateID;
    }

    public Date getD_paymentTypeCreateDate() {
        return d_paymentTypeCreateDate;
    }

    public void setD_paymentTypeCreateDate(Date d_paymentTypeCreateDate) {
        this.d_paymentTypeCreateDate = d_paymentTypeCreateDate;
    }

    public int getI_paymentTypeDeleteID() {
        return i_paymentTypeDeleteID;
    }

    public void setI_paymentTypeDeleteID(int i_paymentTypeDeleteID) {
        this.i_paymentTypeDeleteID = i_paymentTypeDeleteID;
    }

    public Date getD_paymentTypeDeleteDate() {
        return d_paymentTypeDeleteDate;
    }

    public void setD_paymentTypeDeleteDate(Date d_paymentTypeDeleteDate) {
        this.d_paymentTypeDeleteDate = d_paymentTypeDeleteDate;
    }

    public int getI_paymentTypeUpdateID() {
        return i_paymentTypeUpdateID;
    }

    public void setI_paymentTypeUpdateID(int i_paymentTypeUpdateID) {
        this.i_paymentTypeUpdateID = i_paymentTypeUpdateID;
    }

    public Date getD_paymentTypeUpdateDate() {
        return d_paymentTypeUpdateDate;
    }

    public void setD_paymentTypeUpdateDate(Date d_paymentTypeUpdateDate) {
        this.d_paymentTypeUpdateDate = d_paymentTypeUpdateDate;
    }

    public String getS_paymentTypeActive() {
        return s_paymentTypeActive;
    }

    public void setS_paymentTypeActive(String s_paymentTypeActive) {
        this.s_paymentTypeActive = s_paymentTypeActive;
    }

    public Set getCoaars() {
        return coaars;
    }

    public void setCoaars(Set coaars) {
        this.coaars = coaars;
    }
}
