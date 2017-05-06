package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.util.Date;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Brand;

public class T_QuotationSubstitute {
    private String s_quotationSusbtituteNo;
    private M_Article article;
    private M_Brand brand;
    private int i_quotationSubstitutePriority;
    private int i_quotationSubstituteUpdateID;
    private Date d_quotationSubstituteUpdateDate;

    public T_QuotationSubstitute() {
    }

    public String getS_quotationSusbtituteNo() {
        return s_quotationSusbtituteNo;
    }

    public void setS_quotationSusbtituteNo(String s_quotationSusbtituteNo) {
        this.s_quotationSusbtituteNo = s_quotationSusbtituteNo;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public M_Brand getBrand() {
        return brand;
    }

    public void setBrand(M_Brand brand) {
        this.brand = brand;
    }

    public int getI_quotationSubstitutePriority() {
        return i_quotationSubstitutePriority;
    }

    public void setI_quotationSubstitutePriority(int i_quotationSubstitutePriority) {
        this.i_quotationSubstitutePriority = i_quotationSubstitutePriority;
    }

    public int getI_quotationSubstituteUpdateID() {
        return i_quotationSubstituteUpdateID;
    }

    public void setI_quotationSubstituteUpdateID(int i_quotationSubstituteUpdateID) {
        this.i_quotationSubstituteUpdateID = i_quotationSubstituteUpdateID;
    }

    public Date getD_quotationSubstituteUpdateDate() {
        return d_quotationSubstituteUpdateDate;
    }

    public void setD_quotationSubstituteUpdateDate(
            Date d_quotationSubstituteUpdateDate) {
        this.d_quotationSubstituteUpdateDate = d_quotationSubstituteUpdateDate;
    }
}
