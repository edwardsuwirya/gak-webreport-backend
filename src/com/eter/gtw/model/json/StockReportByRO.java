package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class StockReportByRO {
    String companyName;
    String responsibilityCenterRealCode;
    String responsibilityCenterRealName;
    String articleDepartmentName;
    Integer totalQty;
    String receiveOrderRealNo;
    Date receiveOrderDate;
    String customerRealCode;
    String customerName;
    String customerPhone;
    BigDecimal totalAmount;

    String articleRealCode;
    String articleName;
    String tscTransSerialNo;
    Integer qty;
    BigDecimal salesInvoiceGrandTotal;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getResponsibilityCenterRealCode() {
        return responsibilityCenterRealCode;
    }

    public void setResponsibilityCenterRealCode(String responsibilityCenterRealCode) {
        this.responsibilityCenterRealCode = responsibilityCenterRealCode;
    }

    public String getResponsibilityCenterRealName() {
        return responsibilityCenterRealName;
    }

    public void setResponsibilityCenterRealName(String responsibilityCenterRealName) {
        this.responsibilityCenterRealName = responsibilityCenterRealName;
    }

    public String getArticleDepartmentName() {
        return articleDepartmentName;
    }

    public void setArticleDepartmentName(String articleDepartmentName) {
        this.articleDepartmentName = articleDepartmentName;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public String getReceiveOrderRealNo() {
        return receiveOrderRealNo;
    }

    public void setReceiveOrderRealNo(String receiveOrderRealNo) {
        this.receiveOrderRealNo = receiveOrderRealNo;
    }

    public Date getReceiveOrderDate() {
        return receiveOrderDate;
    }

    public void setReceiveOrderDate(Date receiveOrderDate) {
        this.receiveOrderDate = receiveOrderDate;
    }

    public String getCustomerRealCode() {
        return customerRealCode;
    }

    public void setCustomerRealCode(String customerRealCode) {
        this.customerRealCode = customerRealCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getArticleRealCode() {
        return articleRealCode;
    }

    public void setArticleRealCode(String articleRealCode) {
        this.articleRealCode = articleRealCode;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getTscTransSerialNo() {
        return tscTransSerialNo;
    }

    public void setTscTransSerialNo(String tscTransSerialNo) {
        this.tscTransSerialNo = tscTransSerialNo;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getSalesInvoiceGrandTotal() {
        return salesInvoiceGrandTotal;
    }

    public void setSalesInvoiceGrandTotal(BigDecimal salesInvoiceGrandTotal) {
        this.salesInvoiceGrandTotal = salesInvoiceGrandTotal;
    }
}
