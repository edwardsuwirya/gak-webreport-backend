package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class ReceiveOrderActivity {
    String companyName;
    String receiveOrderRealNo;
    Date receiveOrderDate;
    String responsibilityCenterRealCode;
    String responsibilityCenterName;
    String customerRealCode;
    String customerName;
    String customerPhone;
    Integer receptionQty;
    BigDecimal receiveOrderGrandTotal;
    String receptionOperator;
    Date salesInvoicePaymentDate;
    String paymentTypeName;
    BigDecimal payment;
    String userName;
    Integer totalQtyPerRC;
    BigDecimal totalAmountPerRC;
    BigDecimal totalQty;
    BigDecimal totalAmount;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getResponsibilityCenterRealCode() {
        return responsibilityCenterRealCode;
    }

    public void setResponsibilityCenterRealCode(String responsibilityCenterRealCode) {
        this.responsibilityCenterRealCode = responsibilityCenterRealCode;
    }

    public String getResponsibilityCenterName() {
        return responsibilityCenterName;
    }

    public void setResponsibilityCenterName(String responsibilityCenterName) {
        this.responsibilityCenterName = responsibilityCenterName;
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

    public Integer getReceptionQty() {
        return receptionQty;
    }

    public void setReceptionQty(Integer receptionQty) {
        this.receptionQty = receptionQty;
    }

    public BigDecimal getReceiveOrderGrandTotal() {
        return receiveOrderGrandTotal;
    }

    public void setReceiveOrderGrandTotal(BigDecimal receiveOrderGrandTotal) {
        this.receiveOrderGrandTotal = receiveOrderGrandTotal;
    }

    public String getReceptionOperator() {
        return receptionOperator;
    }

    public void setReceptionOperator(String receptionOperator) {
        this.receptionOperator = receptionOperator;
    }

    public Date getSalesInvoicePaymentDate() {
        return salesInvoicePaymentDate;
    }

    public void setSalesInvoicePaymentDate(Date salesInvoicePaymentDate) {
        this.salesInvoicePaymentDate = salesInvoicePaymentDate;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTotalQtyPerRC() {
        return totalQtyPerRC;
    }

    public void setTotalQtyPerRC(Integer totalQtyPerRC) {
        this.totalQtyPerRC = totalQtyPerRC;
    }

    public BigDecimal getTotalAmountPerRC() {
        return totalAmountPerRC;
    }

    public void setTotalAmountPerRC(BigDecimal totalAmountPerRC) {
        this.totalAmountPerRC = totalAmountPerRC;
    }

    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

}
