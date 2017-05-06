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
import com.ifm.domain.master.M_Division;
import com.ifm.domain.master.M_Employee;
import com.ifm.domain.master.M_ResponsibilityCenter;

public class T_SalesOrder {
    private String s_salesOrderNo;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_Currency currency;
    private M_Customer customer;
    private M_Employee employee;
    private M_Division division;
    private T_Quotation quotation;
    private String s_salesOrderRealNo;
    private String s_salesOrderPoCustomerNo;
    private Date d_salesOrderDate;
    private String s_salesOrderAddress;
    private String s_salesOrderPhone;
    private String s_salesOrderFax;
    private String s_salesOrderAttn;
    private BigDecimal d_salesOrderExRate;
    private String s_salesOrderDescription;
    private String s_salesOrderBanner1;
    private String s_salesOrderBanner2;
    private String s_salesOrderNote1;
    private String s_salesOrderNote2;
    private String s_salesOrderNote3;
    private int i_salesOrderToc;
    private BigDecimal d_salesOrderSubTotal;
    private BigDecimal d_salesOrderDiscount;
    private BigDecimal d_salesOrderCharge;
    private BigDecimal d_salesOrderTax;
    private BigDecimal d_salesOrderPph;
    private BigDecimal d_salesOrderGrandTotal;
    private String s_salesOrderStatus;
    private int i_salesOrderPrinted;
    private int i_salesOrderCreateID;
    private Date d_salesOrderCreateDate;
    private int i_salesOrderApproveID;
    private Date d_salesOrderApproveDate;
    private int i_salesOrderCancelID;
    private Date d_salesOrderCancelDate;
    private String s_salesOrderCancelReason;
    private int i_salesOrderUpdateID;
    private Date d_salesOrderUpdateDate;
    private String s_salesOrderActive;
    private Set details;

    public T_SalesOrder() {
    }

    public String getS_salesOrderNo() {
        return s_salesOrderNo;
    }

    public void setS_salesOrderNo(String s_salesOrderNo) {
        this.s_salesOrderNo = s_salesOrderNo;
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

    public M_Division getDivision() {
        return division;
    }

    public void setDivision(M_Division division) {
        this.division = division;
    }

    public T_Quotation getQuotation() {
        return quotation;
    }

    public void setQuotation(T_Quotation quotation) {
        this.quotation = quotation;
    }

    public String getS_salesOrderRealNo() {
        return s_salesOrderRealNo;
    }

    public void setS_salesOrderRealNo(String s_salesOrderRealNo) {
        this.s_salesOrderRealNo = s_salesOrderRealNo;
    }

    public String getS_salesOrderPoCustomerNo() {
        return s_salesOrderPoCustomerNo;
    }

    public void setS_salesOrderPoCustomerNo(String s_salesOrderPoCustomerNo) {
        this.s_salesOrderPoCustomerNo = s_salesOrderPoCustomerNo;
    }

    public Date getD_salesOrderDate() {
        return d_salesOrderDate;
    }

    public void setD_salesOrderDate(Date d_salesOrderDate) {
        this.d_salesOrderDate = d_salesOrderDate;
    }

    public String getS_salesOrderAddress() {
        return s_salesOrderAddress;
    }

    public void setS_salesOrderAddress(String s_salesOrderAddress) {
        this.s_salesOrderAddress = s_salesOrderAddress;
    }

    public String getS_salesOrderPhone() {
        return s_salesOrderPhone;
    }

    public void setS_salesOrderPhone(String s_salesOrderPhone) {
        this.s_salesOrderPhone = s_salesOrderPhone;
    }

    public String getS_salesOrderFax() {
        return s_salesOrderFax;
    }

    public void setS_salesOrderFax(String s_salesOrderFax) {
        this.s_salesOrderFax = s_salesOrderFax;
    }

    public String getS_salesOrderAttn() {
        return s_salesOrderAttn;
    }

    public void setS_salesOrderAttn(String s_salesOrderAttn) {
        this.s_salesOrderAttn = s_salesOrderAttn;
    }

    public BigDecimal getD_salesOrderExRate() {
        return d_salesOrderExRate;
    }

    public void setD_salesOrderExRate(BigDecimal d_salesOrderExRate) {
        this.d_salesOrderExRate = d_salesOrderExRate;
    }

    public String getS_salesOrderDescription() {
        return s_salesOrderDescription;
    }

    public void setS_salesOrderDescription(String s_salesOrderDescription) {
        this.s_salesOrderDescription = s_salesOrderDescription;
    }

    public String getS_salesOrderBanner1() {
        return s_salesOrderBanner1;
    }

    public void setS_salesOrderBanner1(String s_salesOrderBanner1) {
        this.s_salesOrderBanner1 = s_salesOrderBanner1;
    }

    public String getS_salesOrderBanner2() {
        return s_salesOrderBanner2;
    }

    public void setS_salesOrderBanner2(String s_salesOrderBanner2) {
        this.s_salesOrderBanner2 = s_salesOrderBanner2;
    }

    public String getS_salesOrderNote1() {
        return s_salesOrderNote1;
    }

    public void setS_salesOrderNote1(String s_salesOrderNote1) {
        this.s_salesOrderNote1 = s_salesOrderNote1;
    }

    public String getS_salesOrderNote2() {
        return s_salesOrderNote2;
    }

    public void setS_salesOrderNote2(String s_salesOrderNote2) {
        this.s_salesOrderNote2 = s_salesOrderNote2;
    }

    public String getS_salesOrderNote3() {
        return s_salesOrderNote3;
    }

    public void setS_salesOrderNote3(String s_salesOrderNote3) {
        this.s_salesOrderNote3 = s_salesOrderNote3;
    }

    public int getI_salesOrderToc() {
        return i_salesOrderToc;
    }

    public void setI_salesOrderToc(int i_salesOrderToc) {
        this.i_salesOrderToc = i_salesOrderToc;
    }

    public BigDecimal getD_salesOrderSubTotal() {
        return d_salesOrderSubTotal;
    }

    public void setD_salesOrderSubTotal(BigDecimal d_salesOrderSubTotal) {
        this.d_salesOrderSubTotal = d_salesOrderSubTotal;
    }

    public BigDecimal getD_salesOrderDiscount() {
        return d_salesOrderDiscount;
    }

    public void setD_salesOrderDiscount(BigDecimal d_salesOrderDiscount) {
        this.d_salesOrderDiscount = d_salesOrderDiscount;
    }

    public BigDecimal getD_salesOrderCharge() {
        return d_salesOrderCharge;
    }

    public void setD_salesOrderCharge(BigDecimal d_salesOrderCharge) {
        this.d_salesOrderCharge = d_salesOrderCharge;
    }

    public BigDecimal getD_salesOrderTax() {
        return d_salesOrderTax;
    }

    public void setD_salesOrderTax(BigDecimal d_salesOrderTax) {
        this.d_salesOrderTax = d_salesOrderTax;
    }

    public BigDecimal getD_salesOrderPph() {
        return d_salesOrderPph;
    }

    public void setD_salesOrderPph(BigDecimal d_salesOrderPph) {
        this.d_salesOrderPph = d_salesOrderPph;
    }

    public BigDecimal getD_salesOrderGrandTotal() {
        return d_salesOrderGrandTotal;
    }

    public void setD_salesOrderGrandTotal(BigDecimal d_salesOrderGrandTotal) {
        this.d_salesOrderGrandTotal = d_salesOrderGrandTotal;
    }

    public String getS_salesOrderStatus() {
        return s_salesOrderStatus;
    }

    public void setS_salesOrderStatus(String s_salesOrderStatus) {
        this.s_salesOrderStatus = s_salesOrderStatus;
    }

    public int getI_salesOrderPrinted() {
        return i_salesOrderPrinted;
    }

    public void setI_salesOrderPrinted(int i_salesOrderPrinted) {
        this.i_salesOrderPrinted = i_salesOrderPrinted;
    }

    public int getI_salesOrderCreateID() {
        return i_salesOrderCreateID;
    }

    public void setI_salesOrderCreateID(int i_salesOrderCreateID) {
        this.i_salesOrderCreateID = i_salesOrderCreateID;
    }

    public Date getD_salesOrderCreateDate() {
        return d_salesOrderCreateDate;
    }

    public void setD_salesOrderCreateDate(Date d_salesOrderCreateDate) {
        this.d_salesOrderCreateDate = d_salesOrderCreateDate;
    }

    public int getI_salesOrderApproveID() {
        return i_salesOrderApproveID;
    }

    public void setI_salesOrderApproveID(int i_salesOrderApproveID) {
        this.i_salesOrderApproveID = i_salesOrderApproveID;
    }

    public Date getD_salesOrderApproveDate() {
        return d_salesOrderApproveDate;
    }

    public void setD_salesOrderApproveDate(Date d_salesOrderApproveDate) {
        this.d_salesOrderApproveDate = d_salesOrderApproveDate;
    }

    public int getI_salesOrderCancelID() {
        return i_salesOrderCancelID;
    }

    public void setI_salesOrderCancelID(int i_salesOrderCancelID) {
        this.i_salesOrderCancelID = i_salesOrderCancelID;
    }

    public Date getD_salesOrderCancelDate() {
        return d_salesOrderCancelDate;
    }

    public void setD_salesOrderCancelDate(Date d_salesOrderCancelDate) {
        this.d_salesOrderCancelDate = d_salesOrderCancelDate;
    }

    public String getS_salesOrderCancelReason() {
        return s_salesOrderCancelReason;
    }

    public void setS_salesOrderCancelReason(String s_salesOrderCancelReason) {
        this.s_salesOrderCancelReason = s_salesOrderCancelReason;
    }

    public int getI_salesOrderUpdateID() {
        return i_salesOrderUpdateID;
    }

    public void setI_salesOrderUpdateID(int i_salesOrderUpdateID) {
        this.i_salesOrderUpdateID = i_salesOrderUpdateID;
    }

    public Date getD_salesOrderUpdateDate() {
        return d_salesOrderUpdateDate;
    }

    public void setD_salesOrderUpdateDate(Date d_salesOrderUpdateDate) {
        this.d_salesOrderUpdateDate = d_salesOrderUpdateDate;
    }

    public String getS_salesOrderActive() {
        return s_salesOrderActive;
    }

    public void setS_salesOrderActive(String s_salesOrderActive) {
        this.s_salesOrderActive = s_salesOrderActive;
    }

    public Set getDetails() {
        return details;
    }

    public void setDetails(Set details) {
        this.details = details;
    }
}
