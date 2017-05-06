package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_CustomerGroup;
import com.ifm.domain.master.M_MaritalStatus;
import com.ifm.domain.master.M_Religion;
import com.ifm.domain.master.M_ResponsibilityCenter;
import com.ifm.domain.master.M_MemberType;

public class M_Customer {
    private String s_customerCode;
    private M_Company company;
    private M_ResponsibilityCenter responsibilitycenter;
    private M_CustomerGroup customergroup;
    private M_Religion religion;
    private M_MaritalStatus maritalstatus;
    private M_MemberType membertype;
    private Date d_customerRegisterDate;
    private String s_customerRealCode;
    private String s_customerTitle;
    private String s_customerName;
    private String s_customerGender;
    private Date d_customerBirthDate;
    private String s_customerBirthPlace;
    private String s_customerCompany;
    private String s_customerOccupation;
    private String s_customerCellPhone1;
    private String s_customerCellPhone2;
    private String s_customerCellPhone3;
    private String s_customerEmail1;
    private String s_customerEmail2;
    private String s_customerEmail3;
    private String s_customerSiup;
    private String s_customerTdp;
    private String s_customerNppkp;
    private String s_customerNpwp;
    private String s_customerSpecialInstruction;
    private BigDecimal d_customerFactor1;
    private String s_customerOperator1;
    private BigDecimal d_customerFactor2;
    private String s_customerOperator2;
    private String s_customerMember;
    private Date d_customerMemberRegisterDate;
    private Date d_customerMemberExpiredDate;
    private int i_customerMemberPoint;
    private int i_customerMemberQtyFreeArticle;
    private String s_customerMemberFreePeriod;
    private byte[] b_customerMemberPictureFile;
    private int i_customerCreateID;
    private Date d_customerCreateDate;
    private int i_customerDeleteID;
    private Date d_customerDeleteDate;
    private int i_customerUpdateID;
    private Date d_customerUpdateDate;
    private String s_customerActive;
    private Set addresses;
    private Set idcards;
    private Set articles;
    private Set contacts;

    public M_Customer() {
    }

    public String getS_customerCode() {
        return s_customerCode;
    }

    public void setS_customerCode(String s_customerCode) {
        this.s_customerCode = s_customerCode;
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

    public M_CustomerGroup getCustomergroup() {
        return customergroup;
    }

    public void setCustomergroup(M_CustomerGroup customergroup) {
        this.customergroup = customergroup;
    }

    public M_Religion getReligion() {
        return religion;
    }

    public void setReligion(M_Religion religion) {
        this.religion = religion;
    }

    public M_MaritalStatus getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(M_MaritalStatus maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public M_MemberType getMembertype() {
        return membertype;
    }

    public void setMembertype(M_MemberType membertype) {
        this.membertype = membertype;
    }

    public Date getD_customerRegisterDate() {
        return d_customerRegisterDate;
    }

    public void setD_customerRegisterDate(Date d_customerRegisterDate) {
        this.d_customerRegisterDate = d_customerRegisterDate;
    }

    public String getS_customerRealCode() {
        return s_customerRealCode;
    }

    public void setS_customerRealCode(String s_customerRealCode) {
        this.s_customerRealCode = s_customerRealCode;
    }

    public String getS_customerTitle() {
        return s_customerTitle;
    }

    public void setS_customerTitle(String s_customerTitle) {
        this.s_customerTitle = s_customerTitle;
    }

    public String getS_customerName() {
        return s_customerName;
    }

    public void setS_customerName(String s_customerName) {
        this.s_customerName = s_customerName;
    }

    public String getS_customerGender() {
        return s_customerGender;
    }

    public void setS_customerGender(String s_customerGender) {
        this.s_customerGender = s_customerGender;
    }

    public Date getD_customerBirthDate() {
        return d_customerBirthDate;
    }

    public void setD_customerBirthDate(Date d_customerBirthDate) {
        this.d_customerBirthDate = d_customerBirthDate;
    }

    public String getS_customerBirthPlace() {
        return s_customerBirthPlace;
    }

    public void setS_customerBirthPlace(String s_customerBirthPlace) {
        this.s_customerBirthPlace = s_customerBirthPlace;
    }

    public String getS_customerCompany() {
        return s_customerCompany;
    }

    public void setS_customerCompany(String s_customerCompany) {
        this.s_customerCompany = s_customerCompany;
    }

    public String getS_customerOccupation() {
        return s_customerOccupation;
    }

    public void setS_customerOccupation(String s_customerOccupation) {
        this.s_customerOccupation = s_customerOccupation;
    }

    public String getS_customerCellPhone1() {
        return s_customerCellPhone1;
    }

    public void setS_customerCellPhone1(String s_customerCellPhone1) {
        this.s_customerCellPhone1 = s_customerCellPhone1;
    }

    public String getS_customerCellPhone2() {
        return s_customerCellPhone2;
    }

    public void setS_customerCellPhone2(String s_customerCellPhone2) {
        this.s_customerCellPhone2 = s_customerCellPhone2;
    }

    public String getS_customerCellPhone3() {
        return s_customerCellPhone3;
    }

    public void setS_customerCellPhone3(String s_customerCellPhone3) {
        this.s_customerCellPhone3 = s_customerCellPhone3;
    }

    public String getS_customerEmail1() {
        return s_customerEmail1;
    }

    public void setS_customerEmail1(String s_customerEmail1) {
        this.s_customerEmail1 = s_customerEmail1;
    }

    public String getS_customerEmail2() {
        return s_customerEmail2;
    }

    public void setS_customerEmail2(String s_customerEmail2) {
        this.s_customerEmail2 = s_customerEmail2;
    }

    public String getS_customerEmail3() {
        return s_customerEmail3;
    }

    public void setS_customerEmail3(String s_customerEmail3) {
        this.s_customerEmail3 = s_customerEmail3;
    }

    public String getS_customerSiup() {
        return s_customerSiup;
    }

    public void setS_customerSiup(String s_customerSiup) {
        this.s_customerSiup = s_customerSiup;
    }

    public String getS_customerTdp() {
        return s_customerTdp;
    }

    public void setS_customerTdp(String s_customerTdp) {
        this.s_customerTdp = s_customerTdp;
    }

    public String getS_customerNppkp() {
        return s_customerNppkp;
    }

    public void setS_customerNppkp(String s_customerNppkp) {
        this.s_customerNppkp = s_customerNppkp;
    }

    public String getS_customerNpwp() {
        return s_customerNpwp;
    }

    public void setS_customerNpwp(String s_customerNpwp) {
        this.s_customerNpwp = s_customerNpwp;
    }

    public String getS_customerSpecialInstruction() {
        return s_customerSpecialInstruction;
    }

    public void setS_customerSpecialInstruction(String s_customerSpecialInstruction) {
        this.s_customerSpecialInstruction = s_customerSpecialInstruction;
    }

    public BigDecimal getD_customerFactor1() {
        return d_customerFactor1;
    }

    public void setD_customerFactor1(BigDecimal d_customerFactor1) {
        this.d_customerFactor1 = d_customerFactor1;
    }

    public String getS_customerOperator1() {
        return s_customerOperator1;
    }

    public void setS_customerOperator1(String s_customerOperator1) {
        this.s_customerOperator1 = s_customerOperator1;
    }

    public BigDecimal getD_customerFactor2() {
        return d_customerFactor2;
    }

    public void setD_customerFactor2(BigDecimal d_customerFactor2) {
        this.d_customerFactor2 = d_customerFactor2;
    }

    public String getS_customerOperator2() {
        return s_customerOperator2;
    }

    public void setS_customerOperator2(String s_customerOperator2) {
        this.s_customerOperator2 = s_customerOperator2;
    }

    public String getS_customerMember() {
        return s_customerMember;
    }

    public void setS_customerMember(String s_customerMember) {
        this.s_customerMember = s_customerMember;
    }

    public Date getD_customerMemberRegisterDate() {
        return d_customerMemberRegisterDate;
    }

    public void setD_customerMemberRegisterDate(Date d_customerMemberRegisterDate) {
        this.d_customerMemberRegisterDate = d_customerMemberRegisterDate;
    }

    public Date getD_customerMemberExpiredDate() {
        return d_customerMemberExpiredDate;
    }

    public void setD_customerMemberExpiredDate(Date d_customerMemberExpiredDate) {
        this.d_customerMemberExpiredDate = d_customerMemberExpiredDate;
    }

    public int getI_customerMemberPoint() {
        return i_customerMemberPoint;
    }

    public void setI_customerMemberPoint(int i_customerMemberPoint) {
        this.i_customerMemberPoint = i_customerMemberPoint;
    }

    public int getI_customerMemberQtyFreeArticle() {
        return i_customerMemberQtyFreeArticle;
    }

    public void setI_customerMemberQtyFreeArticle(int i_customerMemberQtyFreeArticle) {
        this.i_customerMemberQtyFreeArticle = i_customerMemberQtyFreeArticle;
    }

    public String getS_customerMemberFreePeriod() {
        return s_customerMemberFreePeriod;
    }

    public void setS_customerMemberFreePeriod(String s_customerMemberFreePeriod) {
        this.s_customerMemberFreePeriod = s_customerMemberFreePeriod;
    }

    public byte[] getB_customerMemberPictureFile() {
        return b_customerMemberPictureFile;
    }

    public void setB_customerMemberPictureFile(byte[] b_customerMemberPictureFile) {
        this.b_customerMemberPictureFile = b_customerMemberPictureFile;
    }

    public int getI_customerCreateID() {
        return i_customerCreateID;
    }

    public void setI_customerCreateID(int i_customerCreateID) {
        this.i_customerCreateID = i_customerCreateID;
    }

    public Date getD_customerCreateDate() {
        return d_customerCreateDate;
    }

    public void setD_customerCreateDate(Date d_customerCreateDate) {
        this.d_customerCreateDate = d_customerCreateDate;
    }

    public int getI_customerDeleteID() {
        return i_customerDeleteID;
    }

    public void setI_customerDeleteID(int i_customerDeleteID) {
        this.i_customerDeleteID = i_customerDeleteID;
    }

    public Date getD_customerDeleteDate() {
        return d_customerDeleteDate;
    }

    public void setD_customerDeleteDate(Date d_customerDeleteDate) {
        this.d_customerDeleteDate = d_customerDeleteDate;
    }

    public int getI_customerUpdateID() {
        return i_customerUpdateID;
    }

    public void setI_customerUpdateID(int i_customerUpdateID) {
        this.i_customerUpdateID = i_customerUpdateID;
    }

    public Date getD_customerUpdateDate() {
        return d_customerUpdateDate;
    }

    public void setD_customerUpdateDate(Date d_customerUpdateDate) {
        this.d_customerUpdateDate = d_customerUpdateDate;
    }

    public String getS_customerActive() {
        return s_customerActive;
    }

    public void setS_customerActive(String s_customerActive) {
        this.s_customerActive = s_customerActive;
    }

    public Set getAddresses() {
        return addresses;
    }

    public void setAddresses(Set addresses) {
        this.addresses = addresses;
    }

    public Set getIdcards() {
        return idcards;
    }

    public void setIdcards(Set idcards) {
        this.idcards = idcards;
    }

    public Set getArticles() {
        return articles;
    }

    public void setArticles(Set articles) {
        this.articles = articles;
    }

    public Set getContacts() {
        return contacts;
    }

    public void setContacts(Set contacts) {
        this.contacts = contacts;
    }
}