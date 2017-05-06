package com.ifm.domain.transaction;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;

import com.ifm.domain.master.M_Article;
import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.master.M_Warehouse;

public class T_StockReal implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private M_Company company;
    private M_Article article;
    private M_Warehouse warehouse;
    private String s_tsrTransSerialNo;
    private BigDecimal d_tsrTransQty;
    private M_Uom qtyuom;

    public T_StockReal(M_Company company,
                       M_Article article,
                       M_Warehouse warehouse,
                       String s_tsrTransSerialNo,
                       BigDecimal d_tsrTransQty,
                       M_Uom qtyuom) {
        this.company = company;
        this.article = article;
        this.warehouse = warehouse;
        this.s_tsrTransSerialNo = s_tsrTransSerialNo;
        this.d_tsrTransQty = d_tsrTransQty;
        this.qtyuom = qtyuom;
    }

    public T_StockReal() {
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

    public String getS_tsrTransSerialNo() {
        return s_tsrTransSerialNo;
    }

    public void setS_tsrTransSerialNo(String s_tsrTransSerialNo) {
        this.s_tsrTransSerialNo = s_tsrTransSerialNo;
    }

    public BigDecimal getD_tsrTransQty() {
        return d_tsrTransQty;
    }

    public void setD_tsrTransQty(BigDecimal d_tsrTransQty) {
        this.d_tsrTransQty = d_tsrTransQty;
    }

    public M_Uom getQtyuom() {
        return qtyuom;
    }

    public void setQtyuom(M_Uom qtyuom) {
        this.qtyuom = qtyuom;
    }
}
