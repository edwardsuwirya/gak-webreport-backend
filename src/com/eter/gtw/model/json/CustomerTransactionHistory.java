package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerTransactionHistory {
    String companyName;
    String responsibilityCenterRealCode;
    String responsibilityCenterRealName;
    String customerRealCode;
    String customerName;
    String customerPhone;
    String customerEmail1;
    String transResponsibilityCenterName;
    String receiveOrderRealNo;
    Date receiveOrderDate;
    Integer dQty;
    BigDecimal dTotalReception;
    Date dDeliveryDate;
    Integer dQtyDelivery;
    Date dPaymentDate;
    BigDecimal dPayment;

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

    public String getCustomerEmail1() {
        return customerEmail1;
    }

    public void setCustomerEmail1(String customerEmail1) {
        this.customerEmail1 = customerEmail1;
    }

    public String getTransResponsibilityCenterName() {
        return transResponsibilityCenterName;
    }

    public void setTransResponsibilityCenterName(String transResponsibilityCenterName) {
        this.transResponsibilityCenterName = transResponsibilityCenterName;
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

    public Integer getdQty() {
        return dQty;
    }

    public void setdQty(Integer dQty) {
        this.dQty = dQty;
    }

    public BigDecimal getdTotalReception() {
        return dTotalReception;
    }

    public void setdTotalReception(BigDecimal dTotalReception) {
        this.dTotalReception = dTotalReception;
    }

    public Date getdDeliveryDate() {
        return dDeliveryDate;
    }

    public void setdDeliveryDate(Date dDeliveryDate) {
        this.dDeliveryDate = dDeliveryDate;
    }

    public Integer getdQtyDelivery() {
        return dQtyDelivery;
    }

    public void setdQtyDelivery(Integer dQtyDelivery) {
        this.dQtyDelivery = dQtyDelivery;
    }

    public Date getdPaymentDate() {
        return dPaymentDate;
    }

    public void setdPaymentDate(Date dPaymentDate) {
        this.dPaymentDate = dPaymentDate;
    }

    public BigDecimal getdPayment() {
        return dPayment;
    }

    public void setdPayment(BigDecimal dPayment) {
        this.dPayment = dPayment;
    }
}
