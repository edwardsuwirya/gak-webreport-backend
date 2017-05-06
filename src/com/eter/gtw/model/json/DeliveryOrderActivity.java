package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryOrderActivity {
    String companyName;
    String responsibilityCenterRealCode;
    String responsibilityCenterName;
    String deliveryOrderRealNo;
    Date deliveryOrderDate;
    String receiveOrderRealNo;
    Date receiveOrderDate;
    String customerRealCode;
    String customerName;
    String customerCellPhone;
    String customerEmail1;
    Integer dQty;
    BigDecimal receiveOrderGrandTotal;
    Date salesInvoicePaymentDate;
    String paymentTypeName;
    BigDecimal payment;
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

    public String getDeliveryOrderRealNo() {
        return deliveryOrderRealNo;
    }

    public void setDeliveryOrderRealNo(String deliveryOrderRealNo) {
        this.deliveryOrderRealNo = deliveryOrderRealNo;
    }

    public Date getDeliveryOrderDate() {
        return deliveryOrderDate;
    }

    public void setDeliveryOrderDate(Date deliveryOrderDate) {
        this.deliveryOrderDate = deliveryOrderDate;
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

    public String getCustomerCellPhone() {
        return customerCellPhone;
    }

    public void setCustomerCellPhone(String customerCellPhone) {
        this.customerCellPhone = customerCellPhone;
    }

    public String getCustomerEmail1() {
        return customerEmail1;
    }

    public void setCustomerEmail1(String customerEmail1) {
        this.customerEmail1 = customerEmail1;
    }

    public Integer getdQty() {
        return dQty;
    }

    public void setdQty(Integer dQty) {
        this.dQty = dQty;
    }

    public BigDecimal getReceiveOrderGrandTotal() {
        return receiveOrderGrandTotal;
    }

    public void setReceiveOrderGrandTotal(BigDecimal receiveOrderGrandTotal) {
        this.receiveOrderGrandTotal = receiveOrderGrandTotal;
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
