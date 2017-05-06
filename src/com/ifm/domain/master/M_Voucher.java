package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_Voucher implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_voucherCode;
    private M_Company company;
    private String s_voucherRealCode;
    private String s_voucherName;
    private BigDecimal d_voucherPercent;
    private BigDecimal d_voucherAmount;
    private Date d_voucherExpiredDate;
    private String s_voucherStatus;
    private int i_voucherCreateID;
    private Date d_voucherCreateDate;
    private int i_voucherDeleteID;
    private Date d_voucherDeleteDate;
    private int i_voucherUpdateID;
    private Date d_voucherUpdateDate;
    private String s_voucherActive;

    public M_Voucher() {
    }

    public String getS_voucherCode() {
        return s_voucherCode;
    }

    public void setS_voucherCode(String s_voucherCode) {
        this.s_voucherCode = s_voucherCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_voucherRealCode() {
        return s_voucherRealCode;
    }

    public void setS_voucherRealCode(String s_voucherRealCode) {
        this.s_voucherRealCode = s_voucherRealCode;
    }

    public String getS_voucherName() {
        return s_voucherName;
    }

    public void setS_voucherName(String s_voucherName) {
        this.s_voucherName = s_voucherName;
    }

    public BigDecimal getD_voucherPercent() {
        return d_voucherPercent;
    }

    public void setD_voucherPercent(BigDecimal d_voucherPercent) {
        this.d_voucherPercent = d_voucherPercent;
    }

    public BigDecimal getD_voucherAmount() {
        return d_voucherAmount;
    }

    public void setD_voucherAmount(BigDecimal d_voucherAmount) {
        this.d_voucherAmount = d_voucherAmount;
    }

    public Date getD_voucherExpiredDate() {
        return d_voucherExpiredDate;
    }

    public void setD_voucherExpiredDate(Date d_voucherExpiredDate) {
        this.d_voucherExpiredDate = d_voucherExpiredDate;
    }

    public String getS_voucherStatus() {
        return s_voucherStatus;
    }

    public void setS_voucherStatus(String s_voucherStatus) {
        this.s_voucherStatus = s_voucherStatus;
    }

    public int getI_voucherCreateID() {
        return i_voucherCreateID;
    }

    public void setI_voucherCreateID(int i_voucherCreateID) {
        this.i_voucherCreateID = i_voucherCreateID;
    }

    public Date getD_voucherCreateDate() {
        return d_voucherCreateDate;
    }

    public void setD_voucherCreateDate(Date d_voucherCreateDate) {
        this.d_voucherCreateDate = d_voucherCreateDate;
    }

    public int getI_voucherDeleteID() {
        return i_voucherDeleteID;
    }

    public void setI_voucherDeleteID(int i_voucherDeleteID) {
        this.i_voucherDeleteID = i_voucherDeleteID;
    }

    public Date getD_voucherDeleteDate() {
        return d_voucherDeleteDate;
    }

    public void setD_voucherDeleteDate(Date d_voucherDeleteDate) {
        this.d_voucherDeleteDate = d_voucherDeleteDate;
    }

    public int getI_voucherUpdateID() {
        return i_voucherUpdateID;
    }

    public void setI_voucherUpdateID(int i_voucherUpdateID) {
        this.i_voucherUpdateID = i_voucherUpdateID;
    }

    public Date getD_voucherUpdateDate() {
        return d_voucherUpdateDate;
    }

    public void setD_voucherUpdateDate(Date d_voucherUpdateDate) {
        this.d_voucherUpdateDate = d_voucherUpdateDate;
    }

    public String getS_voucherActive() {
        return s_voucherActive;
    }

    public void setS_voucherActive(String s_voucherActive) {
        this.s_voucherActive = s_voucherActive;
    }
}
