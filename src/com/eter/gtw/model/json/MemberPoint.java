package com.eter.gtw.model.json;

import java.util.Date;

public class MemberPoint {
    String companyName;
    String memberCode;
    String memberRealCode;
    String memberName;
    String transactionNo;
    String transactionName;
    String responsibilityCenterName;
    String itemName;
    Date transactionDate;
    Integer memberPoint;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberRealCode() {
        return memberRealCode;
    }

    public void setMemberRealCode(String memberRealCode) {
        this.memberRealCode = memberRealCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getResponsibilityCenterName() {
        return responsibilityCenterName;
    }

    public void setResponsibilityCenterName(String responsibilityCenterName) {
        this.responsibilityCenterName = responsibilityCenterName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getMemberPoint() {
        return memberPoint;
    }

    public void setMemberPoint(Integer memberPoint) {
        this.memberPoint = memberPoint;
    }

}
