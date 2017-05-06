package com.eter.gtw.model.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ifm.domain.master.M_ResponsibilityCenter;

public class ResponsibilityCenter {
    private String s_responsibilityCenterCode;
    private String company;
    private String zone;
    private String area;
    private String city;
    private String coaar;
    private String coasales;
    private String coasalesretur;
    private String coasalesdiscount;
    private String coasalesvatout;
    private String coasalesexpense;
    private String coasalesservicecharge;
    private String coasalespromotion;
    private String coaap;
    private String coapurchase;
    private String coapurchaseretur;
    private String coapurchasediscount;
    private String coapurchasevatin;
    private String coapurchaseexpense;
    private String coainventorystock;
    private String coabegininventorybalance;
    private String coaendinventorybalance;
    private String coacogs;
    private String coawaste;
    private String coasample;
    private String coasalary;
    private String coaallowance;
    private String coacommission;
    private String coabonus;
    private String coapnlrc;
    private String s_responsibilityCenter_ZipCode;
    private String s_responsibilityCenterRealCode;
    private String s_responsibilityCenterAlias;
    private String s_responsibilityCenterName;
    private String s_responsibilityCenterAddress;
    private String s_responsibilityCenterPhone;
    private String s_responsibilityCenterFax;
    private String s_responsibilityCenterTaxCode;
    private String s_responsibilityCenterNpwp;
    private String s_responsibilityCenterEmail;
    private Date d_responsibilityCenterStartDate;
    private Date d_responsibilityCenterSellingDate;
    private Date d_responsibilityCenterUpdatetableSellingDate;
    private Date d_responsibilityCenterPeriod;
    private String s_responsibilityCenterServerLocalName;
    private String s_responsibilityCenterDBLocalName;
    private int i_responsibilityCenterCreateID;
    private Date d_responsibilityCenterCreateDate;
    private int i_responsibilityCenterDeleteID;
    private Date d_responsibilityCenterDeleteDate;
    private int i_responsibilityCenterUpdateID;
    private Date d_responsibilityCenterUpdateDate;
    private String s_responsibilityCenterActive;

    public ResponsibilityCenter() {

    }

    public ResponsibilityCenter(M_ResponsibilityCenter m) {
        this.s_responsibilityCenterCode = m.getS_responsibilityCenterCode();
        this.company = m.getCompany() != null ? m.getCompany().getS_companyCode() : "";
        this.zone = m.getZone() != null ? m.getZone().getS_zoneCode() : "";
        this.area = m.getArea() != null ? m.getArea().getS_areaCode() : "";
        this.city = m.getCity() != null ? m.getCity().getS_cityCode() : "";
        this.coaar = m.getCoaar() != null ? m.getCoaar().getS_coaCode() : "";
        this.coasales = m.getCoasales() != null ? m.getCoasales().getS_coaCode() : "";
        this.coasalesretur = m.getCoasalesretur() != null ? m.getCoasalesretur().getS_coaCode() : "";
        this.coasalesdiscount = m.getCoasalesdiscount() != null ? m.getCoasalesdiscount().getS_coaCode() : "";
        this.coasalesvatout = m.getCoasalesvatout() != null ? m.getCoasalesvatout().getS_coaCode() : "";
        this.coasalesexpense = m.getCoasalesexpense() != null ? m.getCoasalesexpense().getS_coaCode() : "";
        this.coasalesservicecharge = m.getCoasalesservicecharge() != null ? m.getCoasalesservicecharge().getS_coaCode() : "";
        this.coasalespromotion = m.getCoasalespromotion() != null ? m.getCoasalespromotion().getS_coaCode() : "";
        this.coaap = m.getCoaap() != null ? m.getCoaap().getS_coaCode() : "";
        this.coapurchase = m.getCoapurchase() != null ? m.getCoapurchase().getS_coaCode() : "";
        this.coapurchaseretur = m.getCoapurchaseretur() != null ? m.getCoapurchaseretur().getS_coaCode() : "";
        this.coapurchasediscount = m.getCoapurchasediscount() != null ? m.getCoapurchasediscount().getS_coaCode() : "";
        this.coapurchasevatin = m.getCoapurchasevatin() != null ? m.getCoapurchasevatin().getS_coaCode() : "";
        this.coapurchaseexpense = m.getCoapurchaseexpense() != null ? m.getCoapurchaseexpense().getS_coaCode() : "";
        this.coainventorystock = m.getCoainventorystock() != null ? m.getCoainventorystock().getS_coaCode() : "";
        this.coabegininventorybalance = m.getCoabegininventorybalance() != null ? m.getCoabegininventorybalance().getS_coaCode() : "";
        this.coaendinventorybalance = m.getCoaendinventorybalance() != null ? m.getCoaendinventorybalance().getS_coaCode() : "";
        this.coacogs = m.getCoacogs() != null ? m.getCoacogs().getS_coaCode() : "";
        this.coawaste = m.getCoawaste() != null ? m.getCoawaste().getS_coaCode() : "";
        this.coasample = m.getCoasample() != null ? m.getCoasample().getS_coaCode() : "";
        this.coasalary = m.getCoasalary() != null ? m.getCoasalary().getS_coaCode() : "";
        this.coaallowance = m.getCoaallowance() != null ? m.getCoaallowance().getS_coaCode() : "";
        this.coacommission = m.getCoacommission() != null ? m.getCoacommission().getS_coaCode() : "";
        this.coabonus = m.getCoabonus() != null ? m.getCoabonus().getS_coaCode() : "";
        this.coapnlrc = m.getCoapnlrc() != null ? m.getCoapnlrc().getS_coaCode() : "";
        this.s_responsibilityCenter_ZipCode = m.getS_responsibilityCenter_ZipCode();
        this.s_responsibilityCenterRealCode = m.getS_responsibilityCenterRealCode();
        this.s_responsibilityCenterAlias = m.getS_responsibilityCenterAlias();
        this.s_responsibilityCenterName = m.getS_responsibilityCenterName();
        this.s_responsibilityCenterAddress = m.getS_responsibilityCenterAddress();
        this.s_responsibilityCenterPhone = m.getS_responsibilityCenterPhone();
        this.s_responsibilityCenterFax = m.getS_responsibilityCenterFax();
        this.s_responsibilityCenterTaxCode = m.getS_responsibilityCenterTaxCode();
        this.s_responsibilityCenterNpwp = m.getS_responsibilityCenterNpwp();
        this.s_responsibilityCenterEmail = m.getS_responsibilityCenterEmail();
        this.d_responsibilityCenterStartDate = m.getD_responsibilityCenterStartDate();
        this.d_responsibilityCenterSellingDate = m.getD_responsibilityCenterSellingDate();
        this.d_responsibilityCenterUpdatetableSellingDate = m.getD_responsibilityCenterUpdatetableSellingDate();
        this.d_responsibilityCenterPeriod = m.getD_responsibilityCenterPeriod();
        this.s_responsibilityCenterServerLocalName = m.getS_responsibilityCenterServerLocalName();
        this.s_responsibilityCenterDBLocalName = m.getS_responsibilityCenterDBLocalName();
        this.i_responsibilityCenterCreateID = m.getI_responsibilityCenterCreateID();
        this.d_responsibilityCenterCreateDate = m.getD_responsibilityCenterCreateDate();
        this.i_responsibilityCenterDeleteID = m.getI_responsibilityCenterDeleteID();
        this.d_responsibilityCenterDeleteDate = m.getD_responsibilityCenterDeleteDate();
        this.i_responsibilityCenterUpdateID = m.getI_responsibilityCenterUpdateID();
        this.d_responsibilityCenterUpdateDate = m.getD_responsibilityCenterUpdateDate();
        this.s_responsibilityCenterActive = m.getS_responsibilityCenterActive();

    }

    public static List<ResponsibilityCenter> fromM_ResponsibilityCenter(List<M_ResponsibilityCenter> listM_ResponsibilityCenter) {
        List<ResponsibilityCenter> listResponsibilityCenter = new ArrayList<ResponsibilityCenter>();

        if (listM_ResponsibilityCenter != null) {
            for (M_ResponsibilityCenter m : listM_ResponsibilityCenter) {
                listResponsibilityCenter.add(new ResponsibilityCenter(m));
            }
        }

        return listResponsibilityCenter;
    }


    public String getS_responsibilityCenterCode() {
        return s_responsibilityCenterCode;
    }

    public void setS_responsibilityCenterCode(String s_responsibilityCenterCode) {
        this.s_responsibilityCenterCode = s_responsibilityCenterCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoaar() {
        return coaar;
    }

    public void setCoaar(String coaar) {
        this.coaar = coaar;
    }

    public String getCoasales() {
        return coasales;
    }

    public void setCoasales(String coasales) {
        this.coasales = coasales;
    }

    public String getCoasalesretur() {
        return coasalesretur;
    }

    public void setCoasalesretur(String coasalesretur) {
        this.coasalesretur = coasalesretur;
    }

    public String getCoasalesdiscount() {
        return coasalesdiscount;
    }

    public void setCoasalesdiscount(String coasalesdiscount) {
        this.coasalesdiscount = coasalesdiscount;
    }

    public String getCoasalesvatout() {
        return coasalesvatout;
    }

    public void setCoasalesvatout(String coasalesvatout) {
        this.coasalesvatout = coasalesvatout;
    }

    public String getCoasalesexpense() {
        return coasalesexpense;
    }

    public void setCoasalesexpense(String coasalesexpense) {
        this.coasalesexpense = coasalesexpense;
    }

    public String getCoasalesservicecharge() {
        return coasalesservicecharge;
    }

    public void setCoasalesservicecharge(String coasalesservicecharge) {
        this.coasalesservicecharge = coasalesservicecharge;
    }

    public String getCoasalespromotion() {
        return coasalespromotion;
    }

    public void setCoasalespromotion(String coasalespromotion) {
        this.coasalespromotion = coasalespromotion;
    }

    public String getCoaap() {
        return coaap;
    }

    public void setCoaap(String coaap) {
        this.coaap = coaap;
    }

    public String getCoapurchase() {
        return coapurchase;
    }

    public void setCoapurchase(String coapurchase) {
        this.coapurchase = coapurchase;
    }

    public String getCoapurchaseretur() {
        return coapurchaseretur;
    }

    public void setCoapurchaseretur(String coapurchaseretur) {
        this.coapurchaseretur = coapurchaseretur;
    }

    public String getCoapurchasediscount() {
        return coapurchasediscount;
    }

    public void setCoapurchasediscount(String coapurchasediscount) {
        this.coapurchasediscount = coapurchasediscount;
    }

    public String getCoapurchasevatin() {
        return coapurchasevatin;
    }

    public void setCoapurchasevatin(String coapurchasevatin) {
        this.coapurchasevatin = coapurchasevatin;
    }

    public String getCoapurchaseexpense() {
        return coapurchaseexpense;
    }

    public void setCoapurchaseexpense(String coapurchaseexpense) {
        this.coapurchaseexpense = coapurchaseexpense;
    }

    public String getCoainventorystock() {
        return coainventorystock;
    }

    public void setCoainventorystock(String coainventorystock) {
        this.coainventorystock = coainventorystock;
    }

    public String getCoabegininventorybalance() {
        return coabegininventorybalance;
    }

    public void setCoabegininventorybalance(String coabegininventorybalance) {
        this.coabegininventorybalance = coabegininventorybalance;
    }

    public String getCoaendinventorybalance() {
        return coaendinventorybalance;
    }

    public void setCoaendinventorybalance(String coaendinventorybalance) {
        this.coaendinventorybalance = coaendinventorybalance;
    }

    public String getCoacogs() {
        return coacogs;
    }

    public void setCoacogs(String coacogs) {
        this.coacogs = coacogs;
    }

    public String getCoawaste() {
        return coawaste;
    }

    public void setCoawaste(String coawaste) {
        this.coawaste = coawaste;
    }

    public String getCoasample() {
        return coasample;
    }

    public void setCoasample(String coasample) {
        this.coasample = coasample;
    }

    public String getCoasalary() {
        return coasalary;
    }

    public void setCoasalary(String coasalary) {
        this.coasalary = coasalary;
    }

    public String getCoaallowance() {
        return coaallowance;
    }

    public void setCoaallowance(String coaallowance) {
        this.coaallowance = coaallowance;
    }

    public String getCoacommission() {
        return coacommission;
    }

    public void setCoacommission(String coacommission) {
        this.coacommission = coacommission;
    }

    public String getCoabonus() {
        return coabonus;
    }

    public void setCoabonus(String coabonus) {
        this.coabonus = coabonus;
    }

    public String getCoapnlrc() {
        return coapnlrc;
    }

    public void setCoapnlrc(String coapnlrc) {
        this.coapnlrc = coapnlrc;
    }

    public String getS_responsibilityCenter_ZipCode() {
        return s_responsibilityCenter_ZipCode;
    }

    public void setS_responsibilityCenter_ZipCode(
            String s_responsibilityCenter_ZipCode) {
        this.s_responsibilityCenter_ZipCode = s_responsibilityCenter_ZipCode;
    }

    public String getS_responsibilityCenterRealCode() {
        return s_responsibilityCenterRealCode;
    }

    public void setS_responsibilityCenterRealCode(
            String s_responsibilityCenterRealCode) {
        this.s_responsibilityCenterRealCode = s_responsibilityCenterRealCode;
    }

    public String getS_responsibilityCenterAlias() {
        return s_responsibilityCenterAlias;
    }

    public void setS_responsibilityCenterAlias(String s_responsibilityCenterAlias) {
        this.s_responsibilityCenterAlias = s_responsibilityCenterAlias;
    }

    public String getS_responsibilityCenterName() {
        return s_responsibilityCenterName;
    }

    public void setS_responsibilityCenterName(String s_responsibilityCenterName) {
        this.s_responsibilityCenterName = s_responsibilityCenterName;
    }

    public String getS_responsibilityCenterAddress() {
        return s_responsibilityCenterAddress;
    }

    public void setS_responsibilityCenterAddress(
            String s_responsibilityCenterAddress) {
        this.s_responsibilityCenterAddress = s_responsibilityCenterAddress;
    }

    public String getS_responsibilityCenterPhone() {
        return s_responsibilityCenterPhone;
    }

    public void setS_responsibilityCenterPhone(String s_responsibilityCenterPhone) {
        this.s_responsibilityCenterPhone = s_responsibilityCenterPhone;
    }

    public String getS_responsibilityCenterFax() {
        return s_responsibilityCenterFax;
    }

    public void setS_responsibilityCenterFax(String s_responsibilityCenterFax) {
        this.s_responsibilityCenterFax = s_responsibilityCenterFax;
    }

    public String getS_responsibilityCenterTaxCode() {
        return s_responsibilityCenterTaxCode;
    }

    public void setS_responsibilityCenterTaxCode(
            String s_responsibilityCenterTaxCode) {
        this.s_responsibilityCenterTaxCode = s_responsibilityCenterTaxCode;
    }

    public String getS_responsibilityCenterNpwp() {
        return s_responsibilityCenterNpwp;
    }

    public void setS_responsibilityCenterNpwp(String s_responsibilityCenterNpwp) {
        this.s_responsibilityCenterNpwp = s_responsibilityCenterNpwp;
    }

    public String getS_responsibilityCenterEmail() {
        return s_responsibilityCenterEmail;
    }

    public void setS_responsibilityCenterEmail(String s_responsibilityCenterEmail) {
        this.s_responsibilityCenterEmail = s_responsibilityCenterEmail;
    }

    public Date getD_responsibilityCenterStartDate() {
        return d_responsibilityCenterStartDate;
    }

    public void setD_responsibilityCenterStartDate(
            Date d_responsibilityCenterStartDate) {
        this.d_responsibilityCenterStartDate = d_responsibilityCenterStartDate;
    }

    public Date getD_responsibilityCenterSellingDate() {
        return d_responsibilityCenterSellingDate;
    }

    public void setD_responsibilityCenterSellingDate(
            Date d_responsibilityCenterSellingDate) {
        this.d_responsibilityCenterSellingDate = d_responsibilityCenterSellingDate;
    }

    public Date getD_responsibilityCenterUpdatetableSellingDate() {
        return d_responsibilityCenterUpdatetableSellingDate;
    }

    public void setD_responsibilityCenterUpdatetableSellingDate(
            Date d_responsibilityCenterUpdatetableSellingDate) {
        this.d_responsibilityCenterUpdatetableSellingDate = d_responsibilityCenterUpdatetableSellingDate;
    }

    public Date getD_responsibilityCenterPeriod() {
        return d_responsibilityCenterPeriod;
    }

    public void setD_responsibilityCenterPeriod(Date d_responsibilityCenterPeriod) {
        this.d_responsibilityCenterPeriod = d_responsibilityCenterPeriod;
    }

    public String getS_responsibilityCenterServerLocalName() {
        return s_responsibilityCenterServerLocalName;
    }

    public void setS_responsibilityCenterServerLocalName(
            String s_responsibilityCenterServerLocalName) {
        this.s_responsibilityCenterServerLocalName = s_responsibilityCenterServerLocalName;
    }

    public String getS_responsibilityCenterDBLocalName() {
        return s_responsibilityCenterDBLocalName;
    }

    public void setS_responsibilityCenterDBLocalName(
            String s_responsibilityCenterDBLocalName) {
        this.s_responsibilityCenterDBLocalName = s_responsibilityCenterDBLocalName;
    }

    public int getI_responsibilityCenterCreateID() {
        return i_responsibilityCenterCreateID;
    }

    public void setI_responsibilityCenterCreateID(int i_responsibilityCenterCreateID) {
        this.i_responsibilityCenterCreateID = i_responsibilityCenterCreateID;
    }

    public Date getD_responsibilityCenterCreateDate() {
        return d_responsibilityCenterCreateDate;
    }

    public void setD_responsibilityCenterCreateDate(
            Date d_responsibilityCenterCreateDate) {
        this.d_responsibilityCenterCreateDate = d_responsibilityCenterCreateDate;
    }

    public int getI_responsibilityCenterDeleteID() {
        return i_responsibilityCenterDeleteID;
    }

    public void setI_responsibilityCenterDeleteID(int i_responsibilityCenterDeleteID) {
        this.i_responsibilityCenterDeleteID = i_responsibilityCenterDeleteID;
    }

    public Date getD_responsibilityCenterDeleteDate() {
        return d_responsibilityCenterDeleteDate;
    }

    public void setD_responsibilityCenterDeleteDate(
            Date d_responsibilityCenterDeleteDate) {
        this.d_responsibilityCenterDeleteDate = d_responsibilityCenterDeleteDate;
    }

    public int getI_responsibilityCenterUpdateID() {
        return i_responsibilityCenterUpdateID;
    }

    public void setI_responsibilityCenterUpdateID(int i_responsibilityCenterUpdateID) {
        this.i_responsibilityCenterUpdateID = i_responsibilityCenterUpdateID;
    }

    public Date getD_responsibilityCenterUpdateDate() {
        return d_responsibilityCenterUpdateDate;
    }

    public void setD_responsibilityCenterUpdateDate(
            Date d_responsibilityCenterUpdateDate) {
        this.d_responsibilityCenterUpdateDate = d_responsibilityCenterUpdateDate;
    }

    public String getS_responsibilityCenterActive() {
        return s_responsibilityCenterActive;
    }

    public void setS_responsibilityCenterActive(String s_responsibilityCenterActive) {
        this.s_responsibilityCenterActive = s_responsibilityCenterActive;
    }
}
