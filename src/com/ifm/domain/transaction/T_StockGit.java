package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.master.M_Warehouse;

public class T_StockGit implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private M_Company company;
    private M_Article article;
    private M_Warehouse warehouse;
    private String s_tsgTransSerialNo;
    private BigDecimal d_tsgTransQty;
    private M_Uom qtyuom;

    public T_StockGit(M_Company company,
                      M_Article article,
                      M_Warehouse warehouse,
                      String s_tsgTransSerialNo,
                      BigDecimal d_tsgTransQty,
                      M_Uom qtyuom) {
        this.company = company;
        this.article = article;
        this.warehouse = warehouse;
        this.s_tsgTransSerialNo = s_tsgTransSerialNo;
        this.d_tsgTransQty = d_tsgTransQty;
        this.qtyuom = qtyuom;
    }

    public T_StockGit() {
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Article getArticle() {
        return article;
    }

    public void setArticle(M_Article article) {
        this.article = article;
    }

    public M_Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(M_Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getS_tsgTransSerialNo() {
        return s_tsgTransSerialNo;
    }

    public void setS_tsgTransSerialNo(String s_tsgTransSerialNo) {
        this.s_tsgTransSerialNo = s_tsgTransSerialNo;
    }

    public BigDecimal getD_tsgTransQty() {
        return d_tsgTransQty;
    }

    public void setD_tsgTransQty(BigDecimal d_tsgTransQty) {
        this.d_tsgTransQty = d_tsgTransQty;
    }

    public M_Uom getQtyuom() {
        return qtyuom;
    }

    public void setQtyuom(M_Uom qtyuom) {
        this.qtyuom = qtyuom;
    }
}
