package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class TopCustomer {
    String company;
    String responsibilityCenterRealCode;
    String responsibilityCenterName;
    String customerRealCode;
    String customerName;
    String customerPhone;
    String customerEmail1;
    Integer qty;
    BigDecimal total;
    BigDecimal payment;

    String receiveOrderRealNo;
    Date receiveOrderDate;
    String sRCTrans;
    Integer dQty;

    BigDecimal dTotal;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getCustomerEmail1() {
        return customerEmail1;
    }

    public void setCustomerEmail1(String customerEmail1) {
        this.customerEmail1 = customerEmail1;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
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

    public String getsRCTrans() {
        return sRCTrans;
    }

    public void setsRCTrans(String sRCTrans) {
        this.sRCTrans = sRCTrans;
    }

    public BigDecimal getdTotal() {
        return dTotal;
    }

    public void setdTotal(BigDecimal dTotal) {
        this.dTotal = dTotal;
    }

    public Integer getdQty() {
        return dQty;
    }

    public void setdQty(Integer dQty) {
        this.dQty = dQty;
    }


}
