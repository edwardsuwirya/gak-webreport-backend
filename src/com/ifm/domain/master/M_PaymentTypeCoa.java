package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_PaymentTypeCoa implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_paymentTypeCoaCode;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_Coa coaar;
    private int i_paymentTypeCoaCreateID;
    private Date d_paymentTypeCoaCreateDate;
    private int i_paymentTypeCoaUpdateID;
    private Date d_paymentTypeCoaUpdateDate;

    public M_PaymentTypeCoa() {
    }

    public String getS_paymentTypeCoaCode() {
        return s_paymentTypeCoaCode;
    }

    public void setS_paymentTypeCoaCode(String s_paymentTypeCoaCode) {
        this.s_paymentTypeCoaCode = s_paymentTypeCoaCode;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public M_Coa getCoaar() {
        return coaar;
    }

    public void setCoaar(M_Coa coaar) {
        this.coaar = coaar;
    }

    public int getI_paymentTypeCoaCreateID() {
        return i_paymentTypeCoaCreateID;
    }

    public void setI_paymentTypeCoaCreateID(int i_paymentTypeCoaCreateID) {
        this.i_paymentTypeCoaCreateID = i_paymentTypeCoaCreateID;
    }

    public Date getD_paymentTypeCoaCreateDate() {
        return d_paymentTypeCoaCreateDate;
    }

    public void setD_paymentTypeCoaCreateDate(Date d_paymentTypeCoaCreateDate) {
        this.d_paymentTypeCoaCreateDate = d_paymentTypeCoaCreateDate;
    }

    public int getI_paymentTypeCoaUpdateID() {
        return i_paymentTypeCoaUpdateID;
    }

    public void setI_paymentTypeCoaUpdateID(int i_paymentTypeCoaUpdateID) {
        this.i_paymentTypeCoaUpdateID = i_paymentTypeCoaUpdateID;
    }

    public Date getD_paymentTypeCoaUpdateDate() {
        return d_paymentTypeCoaUpdateDate;
    }

    public void setD_paymentTypeCoaUpdateDate(Date d_paymentTypeCoaUpdateDate) {
        this.d_paymentTypeCoaUpdateDate = d_paymentTypeCoaUpdateDate;
    }
}
