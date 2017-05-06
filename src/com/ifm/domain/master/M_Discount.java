package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class M_Discount implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_discountCode;
    private M_Company company;
    private String s_discountRealCode;
    private String s_discountName;
    private BigDecimal d_discountPercent;
    private BigDecimal d_discountAmount;
    private Date d_discountStartDate;
    private Date d_discountEndDate;
    private Date d_discountStartTime;
    private Date d_discountEndTime;
    private String s_discountPromoOnPromo;
    private String s_discountMemberOnly;
    private String s_discountMonday;
    private String s_discountSunday;
    private String s_discountTuesday;
    private String s_discountWednesday;
    private String s_discountThursday;
    private String s_discountFriday;
    private String s_discountSaturday;
    private String s_discountAllArticle;
    private String s_discountAllRC;
    private int i_discountPointRedeem;
    private int i_discountCreateID;
    private Date d_discountCreateDate;
    private int i_discountDeleteID;
    private Date d_discountDeleteDate;
    private int i_discountUpdateID;
    private Date d_discountUpdateDate;
    private String s_discountActive;
    private Set responsibilitycenters;
    private Set articles;
    private Set membertypes;
    private Set customers;

    public M_Discount() {
    }

    public String getS_discountCode() {
        return s_discountCode;
    }

    public void setS_discountCode(String s_discountCode) {
        this.s_discountCode = s_discountCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_discountRealCode() {
        return s_discountRealCode;
    }

    public void setS_discountRealCode(String s_discountRealCode) {
        this.s_discountRealCode = s_discountRealCode;
    }

    public String getS_discountName() {
        return s_discountName;
    }

    public void setS_discountName(String s_discountName) {
        this.s_discountName = s_discountName;
    }

    public BigDecimal getD_discountPercent() {
        return d_discountPercent;
    }

    public void setD_discountPercent(BigDecimal d_discountPercent) {
        this.d_discountPercent = d_discountPercent;
    }

    public BigDecimal getD_discountAmount() {
        return d_discountAmount;
    }

    public void setD_discountAmount(BigDecimal d_discountAmount) {
        this.d_discountAmount = d_discountAmount;
    }

    public Date getD_discountStartDate() {
        return d_discountStartDate;
    }

    public void setD_discountStartDate(Date d_discountStartDate) {
        this.d_discountStartDate = d_discountStartDate;
    }

    public Date getD_discountEndDate() {
        return d_discountEndDate;
    }

    public void setD_discountEndDate(Date d_discountEndDate) {
        this.d_discountEndDate = d_discountEndDate;
    }

    public Date getD_discountStartTime() {
        return d_discountStartTime;
    }

    public void setD_discountStartTime(Date d_discountStartTime) {
        this.d_discountStartTime = d_discountStartTime;
    }

    public Date getD_discountEndTime() {
        return d_discountEndTime;
    }

    public void setD_discountEndTime(Date d_discountEndTime) {
        this.d_discountEndTime = d_discountEndTime;
    }

    public String getS_discountPromoOnPromo() {
        return s_discountPromoOnPromo;
    }

    public void setS_discountPromoOnPromo(String s_discountPromoOnPromo) {
        this.s_discountPromoOnPromo = s_discountPromoOnPromo;
    }

    public String getS_discountMemberOnly() {
        return s_discountMemberOnly;
    }

    public void setS_discountMemberOnly(String s_discountMemberOnly) {
        this.s_discountMemberOnly = s_discountMemberOnly;
    }

    public String getS_discountMonday() {
        return s_discountMonday;
    }

    public void setS_discountMonday(String s_discountMonday) {
        this.s_discountMonday = s_discountMonday;
    }

    public String getS_discountSunday() {
        return s_discountSunday;
    }

    public void setS_discountSunday(String s_discountSunday) {
        this.s_discountSunday = s_discountSunday;
    }

    public String getS_discountTuesday() {
        return s_discountTuesday;
    }

    public void setS_discountTuesday(String s_discountTuesday) {
        this.s_discountTuesday = s_discountTuesday;
    }

    public String getS_discountWednesday() {
        return s_discountWednesday;
    }

    public void setS_discountWednesday(String s_discountWednesday) {
        this.s_discountWednesday = s_discountWednesday;
    }

    public String getS_discountThursday() {
        return s_discountThursday;
    }

    public void setS_discountThursday(String s_discountThursday) {
        this.s_discountThursday = s_discountThursday;
    }

    public String getS_discountFriday() {
        return s_discountFriday;
    }

    public void setS_discountFriday(String s_discountFriday) {
        this.s_discountFriday = s_discountFriday;
    }

    public String getS_discountSaturday() {
        return s_discountSaturday;
    }

    public void setS_discountSaturday(String s_discountSaturday) {
        this.s_discountSaturday = s_discountSaturday;
    }

    public String getS_discountAllArticle() {
        return s_discountAllArticle;
    }

    public void setS_discountAllArticle(String s_discountAllArticle) {
        this.s_discountAllArticle = s_discountAllArticle;
    }

    public String getS_discountAllRC() {
        return s_discountAllRC;
    }

    public void setS_discountAllRC(String s_discountAllRC) {
        this.s_discountAllRC = s_discountAllRC;
    }

    public int getI_discountPointRedeem() {
        return i_discountPointRedeem;
    }

    public void setI_discountPointRedeem(int i_discountPointRedeem) {
        this.i_discountPointRedeem = i_discountPointRedeem;
    }

    public int getI_discountCreateID() {
        return i_discountCreateID;
    }

    public void setI_discountCreateID(int i_discountCreateID) {
        this.i_discountCreateID = i_discountCreateID;
    }

    public Date getD_discountCreateDate() {
        return d_discountCreateDate;
    }

    public void setD_discountCreateDate(Date d_discountCreateDate) {
        this.d_discountCreateDate = d_discountCreateDate;
    }

    public int getI_discountDeleteID() {
        return i_discountDeleteID;
    }

    public void setI_discountDeleteID(int i_discountDeleteID) {
        this.i_discountDeleteID = i_discountDeleteID;
    }

    public Date getD_discountDeleteDate() {
        return d_discountDeleteDate;
    }

    public void setD_discountDeleteDate(Date d_discountDeleteDate) {
        this.d_discountDeleteDate = d_discountDeleteDate;
    }

    public int getI_discountUpdateID() {
        return i_discountUpdateID;
    }

    public void setI_discountUpdateID(int i_discountUpdateID) {
        this.i_discountUpdateID = i_discountUpdateID;
    }

    public Date getD_discountUpdateDate() {
        return d_discountUpdateDate;
    }

    public void setD_discountUpdateDate(Date d_discountUpdateDate) {
        this.d_discountUpdateDate = d_discountUpdateDate;
    }

    public String getS_discountActive() {
        return s_discountActive;
    }

    public void setS_discountActive(String s_discountActive) {
        this.s_discountActive = s_discountActive;
    }

    public Set getResponsibilitycenters() {
        return responsibilitycenters;
    }

    public void setResponsibilitycenters(Set responsibilitycenters) {
        this.responsibilitycenters = responsibilitycenters;
    }

    public Set getArticles() {
        return articles;
    }

    public void setArticles(Set articles) {
        this.articles = articles;
    }

    public Set getMembertypes() {
        return membertypes;
    }

    public void setMembertypes(Set membertypes) {
        this.membertypes = membertypes;
    }

    public Set getCustomers() {
        return customers;
    }

    public void setCustomers(Set customers) {
        this.customers = customers;
    }
}
