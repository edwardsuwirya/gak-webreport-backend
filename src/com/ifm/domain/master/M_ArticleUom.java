package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;

public class M_ArticleUom {
    private String s_articleUomCode;
    private M_Uom uomfrom;
    private M_Uom uomto;
    private BigDecimal d_articleUomMultiplier;
    private int i_articleUomCreateID;
    private Date d_articleUomCreateDate;
    private int i_articleUomUpdateID;
    private Date d_articleUomUpdateDate;

    public M_ArticleUom(String s_articleUomCode,
                        M_Uom uomfrom,
                        M_Uom uomto,
                        BigDecimal d_articleUomMultiplier,
                        int i_articleUomCreateID,
                        Date d_articleUomCreateDate,
                        int i_articleUomUpdateID,
                        Date d_articleUomUpdateDate) {
        this.s_articleUomCode = s_articleUomCode;
        this.uomfrom = uomfrom;
        this.uomto = uomto;
        this.d_articleUomMultiplier = d_articleUomMultiplier;
        this.i_articleUomCreateID = i_articleUomCreateID;
        this.d_articleUomCreateDate = d_articleUomCreateDate;
        this.i_articleUomUpdateID = i_articleUomUpdateID;
        this.d_articleUomUpdateDate = d_articleUomUpdateDate;
    }

    public M_ArticleUom() {
    }

    public String getS_articleUomCode() {
        return s_articleUomCode;
    }

    public void setS_articleUomCode(String s_articleUomCode) {
        this.s_articleUomCode = s_articleUomCode;
    }

    public M_Uom getUomfrom() {
        return uomfrom;
    }

    public void setUomfrom(M_Uom uomfrom) {
        this.uomfrom = uomfrom;
    }

    public M_Uom getUomto() {
        return uomto;
    }

    public void setUomto(M_Uom uomto) {
        this.uomto = uomto;
    }

    public BigDecimal getD_articleUomMultiplier() {
        return d_articleUomMultiplier;
    }

    public void setD_articleUomMultiplier(BigDecimal d_articleUomMultiplier) {
        this.d_articleUomMultiplier = d_articleUomMultiplier;
    }

    public int getI_articleUomCreateID() {
        return i_articleUomCreateID;
    }

    public void setI_articleUomCreateID(int i_articleUomCreateID) {
        this.i_articleUomCreateID = i_articleUomCreateID;
    }

    public Date getD_articleUomCreateDate() {
        return d_articleUomCreateDate;
    }

    public void setD_articleUomCreateDate(Date d_articleUomCreateDate) {
        this.d_articleUomCreateDate = d_articleUomCreateDate;
    }

    public int getI_articleUomUpdateID() {
        return i_articleUomUpdateID;
    }

    public void setI_articleUomUpdateID(int i_articleUomUpdateID) {
        this.i_articleUomUpdateID = i_articleUomUpdateID;
    }

    public Date getD_articleUomUpdateDate() {
        return d_articleUomUpdateDate;
    }

    public void setD_articleUomUpdateDate(Date d_articleUomUpdateDate) {
        this.d_articleUomUpdateDate = d_articleUomUpdateDate;
    }
}
