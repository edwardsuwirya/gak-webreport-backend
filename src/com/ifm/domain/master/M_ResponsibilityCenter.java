package com.ifm.domain.master;
/**
 * @author febriantoro
 */


import java.util.Date;

public class M_ResponsibilityCenter implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_responsibilityCenterCode;
    private M_Company company;
    private M_Zone zone;
    private M_Area area;
    private M_City city;
    private M_Coa coaar;
    private M_Coa coasales;
    private M_Coa coasalesretur;
    private M_Coa coasalesdiscount;
    private M_Coa coasalesvatout;
    private M_Coa coasalesexpense;
    private M_Coa coasalesservicecharge;
    private M_Coa coasalespromotion;
    private M_Coa coaap;
    private M_Coa coapurchase;
    private M_Coa coapurchaseretur;
    private M_Coa coapurchasediscount;
    private M_Coa coapurchasevatin;
    private M_Coa coapurchaseexpense;
    private M_Coa coainventorystock;
    private M_Coa coabegininventorybalance;
    private M_Coa coaendinventorybalance;
    private M_Coa coacogs;
    private M_Coa coawaste;
    private M_Coa coasample;
    private M_Coa coasalary;
    private M_Coa coaallowance;
    private M_Coa coacommission;
    private M_Coa coabonus;
    private M_Coa coapnlrc;
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

    public M_ResponsibilityCenter() {
    }

    public String getS_responsibilityCenterCode() {
        return s_responsibilityCenterCode;
    }

    public void setS_responsibilityCenterCode(String s_responsibilityCenterCode) {
        this.s_responsibilityCenterCode = s_responsibilityCenterCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Zone getZone() {
        return zone;
    }

    public void setZone(M_Zone zone) {
        this.zone = zone;
    }

    public M_Area getArea() {
        return area;
    }

    public void setArea(M_Area area) {
        this.area = area;
    }

    public M_City getCity() {
        return city;
    }

    public void setCity(M_City city) {
        this.city = city;
    }

    public M_Coa getCoaar() {
        return coaar;
    }

    public void setCoaar(M_Coa coaar) {
        this.coaar = coaar;
    }

    public M_Coa getCoasales() {
        return coasales;
    }

    public void setCoasales(M_Coa coasales) {
        this.coasales = coasales;
    }

    public M_Coa getCoasalesretur() {
        return coasalesretur;
    }

    public void setCoasalesretur(M_Coa coasalesretur) {
        this.coasalesretur = coasalesretur;
    }

    public M_Coa getCoasalesdiscount() {
        return coasalesdiscount;
    }

    public void setCoasalesdiscount(M_Coa coasalesdiscount) {
        this.coasalesdiscount = coasalesdiscount;
    }

    public M_Coa getCoasalesvatout() {
        return coasalesvatout;
    }

    public void setCoasalesvatout(M_Coa coasalesvatout) {
        this.coasalesvatout = coasalesvatout;
    }

    public M_Coa getCoasalesexpense() {
        return coasalesexpense;
    }

    public void setCoasalesexpense(M_Coa coasalesexpense) {
        this.coasalesexpense = coasalesexpense;
    }

    public M_Coa getCoasalesservicecharge() {
        return coasalesservicecharge;
    }

    public void setCoasalesservicecharge(M_Coa coasalesservicecharge) {
        this.coasalesservicecharge = coasalesservicecharge;
    }

    public M_Coa getCoasalespromotion() {
        return coasalespromotion;
    }

    public void setCoasalespromotion(M_Coa coasalespromotion) {
        this.coasalespromotion = coasalespromotion;
    }

    public M_Coa getCoaap() {
        return coaap;
    }

    public void setCoaap(M_Coa coaap) {
        this.coaap = coaap;
    }

    public M_Coa getCoapurchase() {
        return coapurchase;
    }

    public void setCoapurchase(M_Coa coapurchase) {
        this.coapurchase = coapurchase;
    }

    public M_Coa getCoapurchaseretur() {
        return coapurchaseretur;
    }

    public void setCoapurchaseretur(M_Coa coapurchaseretur) {
        this.coapurchaseretur = coapurchaseretur;
    }

    public M_Coa getCoapurchasediscount() {
        return coapurchasediscount;
    }

    public void setCoapurchasediscount(M_Coa coapurchasediscount) {
        this.coapurchasediscount = coapurchasediscount;
    }

    public M_Coa getCoapurchasevatin() {
        return coapurchasevatin;
    }

    public void setCoapurchasevatin(M_Coa coapurchasevatin) {
        this.coapurchasevatin = coapurchasevatin;
    }

    public M_Coa getCoapurchaseexpense() {
        return coapurchaseexpense;
    }

    public void setCoapurchaseexpense(M_Coa coapurchaseexpense) {
        this.coapurchaseexpense = coapurchaseexpense;
    }

    public M_Coa getCoainventorystock() {
        return coainventorystock;
    }

    public void setCoainventorystock(M_Coa coainventorystock) {
        this.coainventorystock = coainventorystock;
    }

    public M_Coa getCoabegininventorybalance() {
        return coabegininventorybalance;
    }

    public void setCoabegininventorybalance(M_Coa coabegininventorybalance) {
        this.coabegininventorybalance = coabegininventorybalance;
    }

    public M_Coa getCoaendinventorybalance() {
        return coaendinventorybalance;
    }

    public void setCoaendinventorybalance(M_Coa coaendinventorybalance) {
        this.coaendinventorybalance = coaendinventorybalance;
    }

    public M_Coa getCoacogs() {
        return coacogs;
    }

    public void setCoacogs(M_Coa coacogs) {
        this.coacogs = coacogs;
    }

    public M_Coa getCoawaste() {
        return coawaste;
    }

    public void setCoawaste(M_Coa coawaste) {
        this.coawaste = coawaste;
    }

    public M_Coa getCoasample() {
        return coasample;
    }

    public void setCoasample(M_Coa coasample) {
        this.coasample = coasample;
    }

    public M_Coa getCoasalary() {
        return coasalary;
    }

    public void setCoasalary(M_Coa coasalary) {
        this.coasalary = coasalary;
    }

    public M_Coa getCoaallowance() {
        return coaallowance;
    }

    public void setCoaallowance(M_Coa coaallowance) {
        this.coaallowance = coaallowance;
    }

    public M_Coa getCoacommission() {
        return coacommission;
    }

    public void setCoacommission(M_Coa coacommission) {
        this.coacommission = coacommission;
    }

    public M_Coa getCoabonus() {
        return coabonus;
    }

    public void setCoabonus(M_Coa coabonus) {
        this.coabonus = coabonus;
    }

    public M_Coa getCoapnlrc() {
        return coapnlrc;
    }

    public void setCoapnlrc(M_Coa coapnlrc) {
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
