package com.eter.gtw.model.json;

import java.math.BigDecimal;
import java.util.Date;

public class DailyLoading {
    String companyName;
    String responsibilityCenterRealCode;
    String responsibilityCenterName;
    Date transactionDateTime;
    String keterangan;
    String department;
    Integer loading;
    BigDecimal sales;
    Integer customer;
    String urut;

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

    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(Date transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getLoading() {
        return loading;
    }

    public void setLoading(Integer loading) {
        this.loading = loading;
    }

    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public String getUrut() {
        return urut;
    }

    public void setUrut(String urut) {
        this.urut = urut;
    }

}
