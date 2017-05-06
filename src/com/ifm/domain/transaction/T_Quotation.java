package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Currency;
import com.ifm.domain.master.M_Customer;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_ResponsibilityCenter;

public class T_Quotation {
    private String s_quotationNo;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_Currency currency;
    private M_Customer customer;
    private M_Employee employee;
    private String s_quotationRealNo;
    private String s_quotationCustomerInquiry;
    private Date d_quotationDate;
    private String s_quotationAddress;
    private String s_quotationPhone;
    private String s_quotationFax;
    private String s_quotationAttn;
    private BigDecimal d_quotationExRate;
    private String s_quotationDescription;
    private String s_quotationBanner1;
    private String s_quotationBanner2;
    private String s_quotationDeliveryTimeDescription;
    private String s_quotationDeliveryPointDescription;
    private int i_quotationToc;
    private String s_quotationShipping;
    private String s_quotationPaymentDescription;
    private BigDecimal d_quotationSubTotal;
    private BigDecimal d_quotationDiscount;
    private BigDecimal d_quotationCharge;
    private BigDecimal d_quotationTax;
    private BigDecimal d_quotationPph;
    private BigDecimal d_quotationGrandTotal;
    private String s_quotationStatus;
    private int i_quotationPrinted;
    private int i_quotationCreateID;
    private Date d_quotationCreateDate;
    private int i_quotationApproveID;
    private Date d_quotationApproveDate;
    private int i_quotationCancelID;
    private Date d_quotationCancelDate;
    private String s_quotationCancelReason;
    private int i_quotationUpdateID;
    private Date d_quotationUpdateDate;
    private String s_quotationActive;
    private Set details;
    private Set substitutes;

    public T_Quotation() {
    }

    public String getS_quotationNo() {
        return s_quotationNo;
    }

    public void setS_quotationNo(String s_quotationNo) {
        this.s_quotationNo = s_quotationNo;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ResponsibilityCenter getResponsibilitycenter() {
        return responsibilitycenter;
    }

    public void setResponsibilitycenter(M_ResponsibilityCenter responsibilitycenter) {
        this.responsibilitycenter = responsibilitycenter;
    }

    public M_Currency getCurrency() {
        return currency;
    }

    public void setCurrency(M_Currency currency) {
        this.currency = currency;
    }

    public M_Customer getCustomer() {
        return customer;
    }

    public void setCustomer(M_Customer customer) {
        this.customer = customer;
    }

    public M_Employee getEmployee() {
        return employee;
    }

    public void setEmployee(M_Employee employee) {
        this.employee = employee;
    }

    public String getS_quotationRealNo() {
        return s_quotationRealNo;
    }

    public void setS_quotationRealNo(String s_quotationRealNo) {
        this.s_quotationRealNo = s_quotationRealNo;
    }

    public String getS_quotationCustomerInquiry() {
        return s_quotationCustomerInquiry;
    }

    public void setS_quotationCustomerInquiry(String s_quotationCustomerInquiry) {
        this.s_quotationCustomerInquiry = s_quotationCustomerInquiry;
    }

    public Date getD_quotationDate() {
        return d_quotationDate;
    }

    public void setD_quotationDate(Date d_quotationDate) {
        this.d_quotationDate = d_quotationDate;
    }

    public String getS_quotationAddress() {
        return s_quotationAddress;
    }

    public void setS_quotationAddress(String s_quotationAddress) {
        this.s_quotationAddress = s_quotationAddress;
    }

    public String getS_quotationPhone() {
        return s_quotationPhone;
    }

    public void setS_quotationPhone(String s_quotationPhone) {
        this.s_quotationPhone = s_quotationPhone;
    }

    public String getS_quotationFax() {
        return s_quotationFax;
    }

    public void setS_quotationFax(String s_quotationFax) {
        this.s_quotationFax = s_quotationFax;
    }

    public String getS_quotationAttn() {
        return s_quotationAttn;
    }

    public void setS_quotationAttn(String s_quotationAttn) {
        this.s_quotationAttn = s_quotationAttn;
    }

    public BigDecimal getD_quotationExRate() {
        return d_quotationExRate;
    }

    public void setD_quotationExRate(BigDecimal d_quotationExRate) {
        this.d_quotationExRate = d_quotationExRate;
    }

    public String getS_quotationDescription() {
        return s_quotationDescription;
    }

    public void setS_quotationDescription(String s_quotationDescription) {
        this.s_quotationDescription = s_quotationDescription;
    }

    public String getS_quotationBanner1() {
        return s_quotationBanner1;
    }

    public void setS_quotationBanner1(String s_quotationBanner1) {
        this.s_quotationBanner1 = s_quotationBanner1;
    }

    public String getS_quotationBanner2() {
        return s_quotationBanner2;
    }

    public void setS_quotationBanner2(String s_quotationBanner2) {
        this.s_quotationBanner2 = s_quotationBanner2;
    }

    public String getS_quotationDeliveryTimeDescription() {
        return s_quotationDeliveryTimeDescription;
    }

    public void setS_quotationDeliveryTimeDescription(
            String s_quotationDeliveryTimeDescription) {
        this.s_quotationDeliveryTimeDescription = s_quotationDeliveryTimeDescription;
    }

    public String getS_quotationDeliveryPointDescription() {
        return s_quotationDeliveryPointDescription;
    }

    public void setS_quotationDeliveryPointDescription(
            String s_quotationDeliveryPointDescription) {
        this.s_quotationDeliveryPointDescription = s_quotationDeliveryPointDescription;
    }

    public int getI_quotationToc() {
        return i_quotationToc;
    }

    public void setI_quotationToc(int i_quotationToc) {
        this.i_quotationToc = i_quotationToc;
    }

    public String getS_quotationShipping() {
        return s_quotationShipping;
    }

    public void setS_quotationShipping(String s_quotationShipping) {
        this.s_quotationShipping = s_quotationShipping;
    }

    public String getS_quotationPaymentDescription() {
        return s_quotationPaymentDescription;
    }

    public void setS_quotationPaymentDescription(
            String s_quotationPaymentDescription) {
        this.s_quotationPaymentDescription = s_quotationPaymentDescription;
    }

    public BigDecimal getD_quotationSubTotal() {
        return d_quotationSubTotal;
    }

    public void setD_quotationSubTotal(BigDecimal d_quotationSubTotal) {
        this.d_quotationSubTotal = d_quotationSubTotal;
    }

    public BigDecimal getD_quotationDiscount() {
        return d_quotationDiscount;
    }

    public void setD_quotationDiscount(BigDecimal d_quotationDiscount) {
        this.d_quotationDiscount = d_quotationDiscount;
    }

    public BigDecimal getD_quotationCharge() {
        return d_quotationCharge;
    }

    public void setD_quotationCharge(BigDecimal d_quotationCharge) {
        this.d_quotationCharge = d_quotationCharge;
    }

    public BigDecimal getD_quotationTax() {
        return d_quotationTax;
    }

    public void setD_quotationTax(BigDecimal d_quotationTax) {
        this.d_quotationTax = d_quotationTax;
    }

    public BigDecimal getD_quotationPph() {
        return d_quotationPph;
    }

    public void setD_quotationPph(BigDecimal d_quotationPph) {
        this.d_quotationPph = d_quotationPph;
    }

    public BigDecimal getD_quotationGrandTotal() {
        return d_quotationGrandTotal;
    }

    public void setD_quotationGrandTotal(BigDecimal d_quotationGrandTotal) {
        this.d_quotationGrandTotal = d_quotationGrandTotal;
    }

    public String getS_quotationStatus() {
        return s_quotationStatus;
    }

    public void setS_quotationStatus(String s_quotationStatus) {
        this.s_quotationStatus = s_quotationStatus;
    }

    public int getI_quotationPrinted() {
        return i_quotationPrinted;
    }

    public void setI_quotationPrinted(int i_quotationPrinted) {
        this.i_quotationPrinted = i_quotationPrinted;
    }

    public int getI_quotationCreateID() {
        return i_quotationCreateID;
    }

    public void setI_quotationCreateID(int i_quotationCreateID) {
        this.i_quotationCreateID = i_quotationCreateID;
    }

    public Date getD_quotationCreateDate() {
        return d_quotationCreateDate;
    }

    public void setD_quotationCreateDate(Date d_quotationCreateDate) {
        this.d_quotationCreateDate = d_quotationCreateDate;
    }

    public int getI_quotationApproveID() {
        return i_quotationApproveID;
    }

    public void setI_quotationApproveID(int i_quotationApproveID) {
        this.i_quotationApproveID = i_quotationApproveID;
    }

    public Date getD_quotationApproveDate() {
        return d_quotationApproveDate;
    }

    public void setD_quotationApproveDate(Date d_quotationApproveDate) {
        this.d_quotationApproveDate = d_quotationApproveDate;
    }

    public int getI_quotationCancelID() {
        return i_quotationCancelID;
    }

    public void setI_quotationCancelID(int i_quotationCancelID) {
        this.i_quotationCancelID = i_quotationCancelID;
    }

    public Date getD_quotationCancelDate() {
        return d_quotationCancelDate;
    }

    public void setD_quotationCancelDate(Date d_quotationCancelDate) {
        this.d_quotationCancelDate = d_quotationCancelDate;
    }

    public String getS_quotationCancelReason() {
        return s_quotationCancelReason;
    }

    public void setS_quotationCancelReason(String s_quotationCancelReason) {
        this.s_quotationCancelReason = s_quotationCancelReason;
    }

    public int getI_quotationUpdateID() {
        return i_quotationUpdateID;
    }

    public void setI_quotationUpdateID(int i_quotationUpdateID) {
        this.i_quotationUpdateID = i_quotationUpdateID;
    }

    public Date getD_quotationUpdateDate() {
        return d_quotationUpdateDate;
    }

    public void setD_quotationUpdateDate(Date d_quotationUpdateDate) {
        this.d_quotationUpdateDate = d_quotationUpdateDate;
    }

    public String getS_quotationActive() {
        return s_quotationActive;
    }

    public void setS_quotationActive(String s_quotationActive) {
        this.s_quotationActive = s_quotationActive;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }

    public Set getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(Set substitutes) {
        this.substitutes = substitutes;
    }
}
