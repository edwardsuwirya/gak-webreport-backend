package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

public class M_Warehouse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_warehouseCode;
    private M_Company company;
    private M_ResponsibilityCenter responsibilityCenter;
    private M_City city;
    private String s_warehouse_ZipCode;
    private String s_warehouseRealCode;
    private String s_warehouseName;
    private String s_warehouseAddress;
    private String s_warehousePhone;
    private String s_warehouseFax;
    private String s_warehouseTaxCode;
    private String s_warehouseNpwp;
    private String s_warehouseEmail;
    private int i_warehouseCreateID;
    private Date d_warehouseCreateDate;
    private int i_warehouseDeleteID;
    private Date d_warehouseDeleteDate;
    private int i_warehouseUpdateID;
    private Date d_warehouseUpdateDate;
    private String s_warehouseActive;
    private Set transactions;
    private Set warehouses;

    public M_Warehouse() {
    }

    public String getS_warehouseCode() {
        return s_warehouseCode;
    }

    public void setS_warehouseCode(String s_warehouseCode) {
        this.s_warehouseCode = s_warehouseCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ResponsibilityCenter getResponsibilityCenter() {
        return responsibilityCenter;
    }

    public void setResponsibilityCenter(M_ResponsibilityCenter responsibilityCenter) {
        this.responsibilityCenter = responsibilityCenter;
    }

    public M_City getCity() {
        return city;
    }

    public void setCity(M_City city) {
        this.city = city;
    }

    public String getS_warehouse_ZipCode() {
        return s_warehouse_ZipCode;
    }

    public void setS_warehouse_ZipCode(String s_warehouse_ZipCode) {
        this.s_warehouse_ZipCode = s_warehouse_ZipCode;
    }

    public String getS_warehouseRealCode() {
        return s_warehouseRealCode;
    }

    public void setS_warehouseRealCode(String s_warehouseRealCode) {
        this.s_warehouseRealCode = s_warehouseRealCode;
    }

    public String getS_warehouseName() {
        return s_warehouseName;
    }

    public void setS_warehouseName(String s_warehouseName) {
        this.s_warehouseName = s_warehouseName;
    }

    public String getS_warehouseAddress() {
        return s_warehouseAddress;
    }

    public void setS_warehouseAddress(String s_warehouseAddress) {
        this.s_warehouseAddress = s_warehouseAddress;
    }

    public String getS_warehousePhone() {
        return s_warehousePhone;
    }

    public void setS_warehousePhone(String s_warehousePhone) {
        this.s_warehousePhone = s_warehousePhone;
    }

    public String getS_warehouseFax() {
        return s_warehouseFax;
    }

    public void setS_warehouseFax(String s_warehouseFax) {
        this.s_warehouseFax = s_warehouseFax;
    }

    public String getS_warehouseTaxCode() {
        return s_warehouseTaxCode;
    }

    public void setS_warehouseTaxCode(String s_warehouseTaxCode) {
        this.s_warehouseTaxCode = s_warehouseTaxCode;
    }

    public String getS_warehouseNpwp() {
        return s_warehouseNpwp;
    }

    public void setS_warehouseNpwp(String s_warehouseNpwp) {
        this.s_warehouseNpwp = s_warehouseNpwp;
    }

    public String getS_warehouseEmail() {
        return s_warehouseEmail;
    }

    public void setS_warehouseEmail(String s_warehouseEmail) {
        this.s_warehouseEmail = s_warehouseEmail;
    }

    public int getI_warehouseCreateID() {
        return i_warehouseCreateID;
    }

    public void setI_warehouseCreateID(int i_warehouseCreateID) {
        this.i_warehouseCreateID = i_warehouseCreateID;
    }

    public Date getD_warehouseCreateDate() {
        return d_warehouseCreateDate;
    }

    public void setD_warehouseCreateDate(Date d_warehouseCreateDate) {
        this.d_warehouseCreateDate = d_warehouseCreateDate;
    }

    public int getI_warehouseUpdateID() {
        return i_warehouseUpdateID;
    }

    public void setI_warehouseUpdateID(int i_warehouseUpdateID) {
        this.i_warehouseUpdateID = i_warehouseUpdateID;
    }

    public Date getD_warehouseUpdateDate() {
        return d_warehouseUpdateDate;
    }

    public void setD_warehouseUpdateDate(Date d_warehouseUpdateDate) {
        this.d_warehouseUpdateDate = d_warehouseUpdateDate;
    }

    public int getI_warehouseDeleteID() {
        return i_warehouseDeleteID;
    }

    public void setI_warehouseDeleteID(int i_warehouseDeleteID) {
        this.i_warehouseDeleteID = i_warehouseDeleteID;
    }

    public Date getD_warehouseDeleteDate() {
        return d_warehouseDeleteDate;
    }

    public void setD_warehouseDeleteDate(Date d_warehouseDeleteDate) {
        this.d_warehouseDeleteDate = d_warehouseDeleteDate;
    }

    public String getS_warehouseActive() {
        return s_warehouseActive;
    }

    public void setS_warehouseActive(String s_warehouseActive) {
        this.s_warehouseActive = s_warehouseActive;
    }

    public Set getTransactions() {
        return transactions;
    }

    public void setTransactions(Set transactions) {
        this.transactions = transactions;
    }

    public Set getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(Set warehouses) {
        this.warehouses = warehouses;
    }
}
