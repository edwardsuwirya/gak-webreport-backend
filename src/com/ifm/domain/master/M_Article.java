package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.ifm.domain.master.M_ArticleGroup;
import com.ifm.domain.master.M_Company;
import com.ifm.domain.master.M_Uom;
import com.ifm.domain.utility.M_Report;

public class M_Article implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_articleCode;
    private M_Company company;
    private M_ArticleGroup articleGroup;
    private M_Uom uom;
    private M_Uom uomlength;
    private M_Uom uomwidth;
    private M_Uom uomheight;
    private M_Brand brand;
    private M_ArticleSpecialSpecification articleSpecialSpecification;
    private M_ArticleDepartment articleDepartment;
    private M_ArticleCategory articleCategory;
    private M_ArticleClass articleClass;
    private M_Report articleReport;
    private String s_articleRealCode;
    private String s_articleBarcode;
    private String s_articleName;
    private String s_articleNameLong;
    private String s_articleDisplayName;
    private String s_articleDescription;
    private BigDecimal d_articlePrice;
    private BigDecimal d_articleLength;
    private BigDecimal d_articleWidth;
    private BigDecimal d_articleHeight;
    private String s_articleSize;
    private String s_articleWallThickness;
    private String s_articleSpecification;
    private String s_articleSpecificationLong;
    private String s_articleRatingPressure;
    private BigDecimal d_articleMinStock;
    private BigDecimal d_articleMaxStock;
    private BigDecimal d_articleReorder;
    private String s_articleStock;
    private String s_articleCogs;
    private String s_articleSpareParts;
    private String s_articleDiscontinue;
    private String s_articleProductBundlingRecipe;
    private String s_articleParent;
    private BigDecimal d_articleTaxPct;
    private BigDecimal d_articlePB1Pct;
    private BigDecimal d_articleServiceChargePct;
    private BigDecimal d_articleBonusPct;
    private byte[] b_articleCatalogFilePath;
    private String s_articleCodeParent;
    private int i_articleCreateID;
    private Date d_articleCreateDate;
    private int i_articleDeleteID;
    private Date d_articleDeleteDate;
    private int i_articleUpdateID;
    private Date d_articleUpdateDate;
    private String s_articleActive;
    private Set uoms;
    private Set responsibilitycenterprices;
    private Set zoneprices;

    public M_Article() {
    }

    public M_Article(String s_articleCode,
                     M_Company company,
                     M_ArticleGroup articleGroup,
                     M_Uom uom,
                     M_Uom uomlength,
                     M_Uom uomwidth,
                     M_Uom uomheight,
                     M_Brand brand,
                     M_ArticleSpecialSpecification articleSpecialSpecification,
                     M_ArticleDepartment articleDepartment,
                     M_ArticleCategory articleCategory,
                     M_ArticleClass articleClass,
                     M_Report articleReport,
                     String s_articleRealCode,
                     String s_articleBarcode,
                     String s_articleName,
                     String s_articleNameLong,
                     String s_articleDisplayName,
                     String s_articleDescription,
                     BigDecimal d_articlePrice,
                     BigDecimal d_articleLength,
                     BigDecimal d_articleWidth,
                     BigDecimal d_articleHeight,
                     String s_articleSize,
                     String s_articleWallThickness,
                     String s_articleSpecification,
                     String s_articleSpecificationLong,
                     String s_articleRatingPressure,
                     BigDecimal d_articleMinStock,
                     BigDecimal d_articleMaxStock,
                     BigDecimal d_articleReorder,
                     String s_articleStock,
                     String s_articleCogs,
                     String s_articleSpareParts,
                     String s_articleDiscontinue,
                     String s_articleProductBundlingRecipe,
                     String s_articleParent,
                     BigDecimal d_articleTaxPct,
                     BigDecimal d_articlePB1Pct,
                     BigDecimal d_articleServiceChargePct,
                     BigDecimal d_articleBonusPct,
                     byte[] b_articleCatalogFilePath,
                     String s_articleCodeParent,
                     int i_articleCreateID,
                     Date d_articleCreateDate,
                     int i_articleDeleteID,
                     Date d_articleDeleteDate,
                     int i_articleUpdateID,
                     Date d_articleUpdateDate,
                     String s_articleActive) {
        this.s_articleCode = s_articleCode;
        this.company = company;
        this.articleGroup = articleGroup;
        this.uom = uom;
        this.uomlength = uomlength;
        this.uomwidth = uomwidth;
        this.uomheight = uomheight;
        this.brand = brand;
        this.articleSpecialSpecification = articleSpecialSpecification;
        this.articleDepartment = articleDepartment;
        this.articleClass = articleClass;
        this.articleCategory = articleCategory;
        this.articleReport = articleReport;
        this.s_articleRealCode = s_articleRealCode;
        this.s_articleBarcode = s_articleBarcode;
        this.s_articleName = s_articleName;
        this.s_articleNameLong = s_articleNameLong;
        this.s_articleDisplayName = s_articleDisplayName;
        this.s_articleDescription = s_articleDescription;
        this.d_articlePrice = d_articlePrice;
        this.d_articleLength = d_articleLength;
        this.d_articleWidth = d_articleWidth;
        this.d_articleHeight = d_articleHeight;
        this.s_articleSize = s_articleSize;
        this.s_articleWallThickness = s_articleWallThickness;
        this.s_articleSpecification = s_articleSpecification;
        this.s_articleSpecificationLong = s_articleSpecificationLong;
        this.s_articleRatingPressure = s_articleRatingPressure;
        this.d_articleMinStock = d_articleMinStock;
        this.d_articleMaxStock = d_articleMaxStock;
        this.d_articleReorder = d_articleReorder;
        this.s_articleStock = s_articleStock;
        this.s_articleCogs = s_articleCogs;
        this.s_articleSpareParts = s_articleSpareParts;
        this.s_articleDiscontinue = s_articleDiscontinue;
        this.s_articleProductBundlingRecipe = s_articleProductBundlingRecipe;
        this.s_articleParent = s_articleParent;
        this.d_articleTaxPct = d_articleTaxPct;
        this.d_articlePB1Pct = d_articlePB1Pct;
        this.d_articleServiceChargePct = d_articleServiceChargePct;
        this.d_articleBonusPct = d_articleBonusPct;
        this.b_articleCatalogFilePath = b_articleCatalogFilePath;
        this.s_articleCodeParent = s_articleCodeParent;
        this.i_articleCreateID = i_articleCreateID;
        this.d_articleCreateDate = d_articleCreateDate;
        this.i_articleDeleteID = i_articleDeleteID;
        this.d_articleDeleteDate = d_articleDeleteDate;
        this.i_articleUpdateID = i_articleUpdateID;
        this.d_articleUpdateDate = d_articleUpdateDate;
        this.s_articleActive = s_articleActive;
    }


    public String getS_articleCode() {
        return s_articleCode;
    }

    public void setS_articleCode(String s_articleCode) {
        this.s_articleCode = s_articleCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_ArticleGroup getArticleGroup() {
        return articleGroup;
    }

    public void setArticleGroup(M_ArticleGroup articleGroup) {
        this.articleGroup = articleGroup;
    }

    public M_Uom getUom() {
        return uom;
    }

    public void setUom(M_Uom uom) {
        this.uom = uom;
    }

    public M_Uom getUomlength() {
        return uomlength;
    }

    public void setUomlength(M_Uom uomlength) {
        this.uomlength = uomlength;
    }

    public M_Uom getUomwidth() {
        return uomwidth;
    }

    public void setUomwidth(M_Uom uomwidth) {
        this.uomwidth = uomwidth;
    }

    public M_Uom getUomheight() {
        return uomheight;
    }

    public void setUomheight(M_Uom uomheight) {
        this.uomheight = uomheight;
    }

    public M_Brand getBrand() {
        return brand;
    }

    public void setBrand(M_Brand brand) {
        this.brand = brand;
    }

    public M_ArticleSpecialSpecification getArticleSpecialSpecification() {
        return articleSpecialSpecification;
    }

    public void setArticleSpecialSpecification(
            M_ArticleSpecialSpecification articleSpecialSpecification) {
        this.articleSpecialSpecification = articleSpecialSpecification;
    }

    public M_ArticleDepartment getArticleDepartment() {
        return articleDepartment;
    }

    public void setArticleDepartment(M_ArticleDepartment articleDepartment) {
        this.articleDepartment = articleDepartment;
    }

    public M_ArticleCategory getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(M_ArticleCategory articleCategory) {
        this.articleCategory = articleCategory;
    }

    public M_ArticleClass getArticleClass() {
        return articleClass;
    }

    public void setArticleClass(M_ArticleClass articleClass) {
        this.articleClass = articleClass;
    }

    public M_Report getArticleReport() {
        return articleReport;
    }

    public void setArticleReport(M_Report articleReport) {
        this.articleReport = articleReport;
    }

    public String getS_articleRealCode() {
        return s_articleRealCode;
    }

    public void setS_articleRealCode(String s_articleRealCode) {
        this.s_articleRealCode = s_articleRealCode;
    }

    public String getS_articleBarcode() {
        return s_articleBarcode;
    }

    public void setS_articleBarcode(String s_articleBarcode) {
        this.s_articleBarcode = s_articleBarcode;
    }

    public String getS_articleName() {
        return s_articleName;
    }

    public void setS_articleName(String s_articleName) {
        this.s_articleName = s_articleName;
    }

    public String getS_articleNameLong() {
        return s_articleNameLong;
    }

    public void setS_articleNameLong(String s_articleNameLong) {
        this.s_articleNameLong = s_articleNameLong;
    }

    public String getS_articleDisplayName() {
        return s_articleDisplayName;
    }

    public void setS_articleDisplayName(String s_articleDisplayName) {
        this.s_articleDisplayName = s_articleDisplayName;
    }

    public String getS_articleDescription() {
        return s_articleDescription;
    }

    public void setS_articleDescription(String s_articleDescription) {
        this.s_articleDescription = s_articleDescription;
    }

    public BigDecimal getD_articlePrice() {
        return d_articlePrice;
    }

    public void setD_articlePrice(BigDecimal d_articlePrice) {
        this.d_articlePrice = d_articlePrice;
    }

    public BigDecimal getD_articleLength() {
        return d_articleLength;
    }

    public void setD_articleLength(BigDecimal d_articleLength) {
        this.d_articleLength = d_articleLength;
    }

    public BigDecimal getD_articleWidth() {
        return d_articleWidth;
    }

    public void setD_articleWidth(BigDecimal d_articleWidth) {
        this.d_articleWidth = d_articleWidth;
    }

    public BigDecimal getD_articleHeight() {
        return d_articleHeight;
    }

    public void setD_articleHeight(BigDecimal d_articleHeight) {
        this.d_articleHeight = d_articleHeight;
    }

    public String getS_articleSize() {
        return s_articleSize;
    }

    public void setS_articleSize(String s_articleSize) {
        this.s_articleSize = s_articleSize;
    }

    public String getS_articleWallThickness() {
        return s_articleWallThickness;
    }

    public void setS_articleWallThickness(String s_articleWallThickness) {
        this.s_articleWallThickness = s_articleWallThickness;
    }

    public String getS_articleSpecification() {
        return s_articleSpecification;
    }

    public void setS_articleSpecification(String s_articleSpecification) {
        this.s_articleSpecification = s_articleSpecification;
    }

    public String getS_articleSpecificationLong() {
        return s_articleSpecificationLong;
    }

    public void setS_articleSpecificationLong(String s_articleSpecificationLong) {
        this.s_articleSpecificationLong = s_articleSpecificationLong;
    }

    public String getS_articleRatingPressure() {
        return s_articleRatingPressure;
    }

    public void setS_articleRatingPressure(String s_articleRatingPressure) {
        this.s_articleRatingPressure = s_articleRatingPressure;
    }

    public BigDecimal getD_articleMinStock() {
        return d_articleMinStock;
    }

    public void setD_articleMinStock(BigDecimal d_articleMinStock) {
        this.d_articleMinStock = d_articleMinStock;
    }

    public BigDecimal getD_articleMaxStock() {
        return d_articleMaxStock;
    }

    public void setD_articleMaxStock(BigDecimal d_articleMaxStock) {
        this.d_articleMaxStock = d_articleMaxStock;
    }

    public BigDecimal getD_articleReorder() {
        return d_articleReorder;
    }

    public void setD_articleReorder(BigDecimal d_articleReorder) {
        this.d_articleReorder = d_articleReorder;
    }

    public String getS_articleStock() {
        return s_articleStock;
    }

    public void setS_articleStock(String s_articleStock) {
        this.s_articleStock = s_articleStock;
    }

    public String getS_articleCogs() {
        return s_articleCogs;
    }

    public void setS_articleCogs(String s_articleCogs) {
        this.s_articleCogs = s_articleCogs;
    }

    public String getS_articleSpareParts() {
        return s_articleSpareParts;
    }

    public void setS_articleSpareParts(String s_articleSpareParts) {
        this.s_articleSpareParts = s_articleSpareParts;
    }

    public String getS_articleDiscontinue() {
        return s_articleDiscontinue;
    }

    public void setS_articleDiscontinue(String s_articleDiscontinue) {
        this.s_articleDiscontinue = s_articleDiscontinue;
    }

    public String getS_articleProductBundlingRecipe() {
        return s_articleProductBundlingRecipe;
    }

    public void setS_articleProductBundlingRecipe(
            String s_articleProductBundlingRecipe) {
        this.s_articleProductBundlingRecipe = s_articleProductBundlingRecipe;
    }

    public String getS_articleParent() {
        return s_articleParent;
    }

    public void setS_articleParent(String s_articleParent) {
        this.s_articleParent = s_articleParent;
    }

    public byte[] getB_articleCatalogFilePath() {
        return b_articleCatalogFilePath;
    }

    public void setB_articleCatalogFilePath(byte[] b_articleCatalogFilePath) {
        this.b_articleCatalogFilePath = b_articleCatalogFilePath;
    }

    public BigDecimal getD_articleBonusPct() {
        return d_articleBonusPct;
    }

    public void setD_articleBonusPct(BigDecimal d_articleBonusPct) {
        this.d_articleBonusPct = d_articleBonusPct;
    }

    public BigDecimal getD_articleServiceChargePct() {
        return d_articleServiceChargePct;
    }

    public void setD_articleServiceChargePct(BigDecimal d_articleServiceChargePct) {
        this.d_articleServiceChargePct = d_articleServiceChargePct;
    }

    public BigDecimal getD_articlePB1Pct() {
        return d_articlePB1Pct;
    }

    public void setD_articlePB1Pct(BigDecimal d_articlePB1Pct) {
        this.d_articlePB1Pct = d_articlePB1Pct;
    }

    public BigDecimal getD_articleTaxPct() {
        return d_articleTaxPct;
    }

    public void setD_articleTaxPct(BigDecimal d_articleTaxPct) {
        this.d_articleTaxPct = d_articleTaxPct;
    }

    public String getS_articleCodeParent() {
        return s_articleCodeParent;
    }

    public void setS_articleCodeParent(String s_articleCodeParent) {
        this.s_articleCodeParent = s_articleCodeParent;
    }

    public int getI_articleCreateID() {
        return i_articleCreateID;
    }

    public void setI_articleCreateID(int i_articleCreateID) {
        this.i_articleCreateID = i_articleCreateID;
    }

    public Date getD_articleCreateDate() {
        return d_articleCreateDate;
    }

    public void setD_articleCreateDate(Date d_articleCreateDate) {
        this.d_articleCreateDate = d_articleCreateDate;
    }

    public int getI_articleDeleteID() {
        return i_articleDeleteID;
    }

    public void setI_articleDeleteID(int i_articleDeleteID) {
        this.i_articleDeleteID = i_articleDeleteID;
    }

    public Date getD_articleDeleteDate() {
        return d_articleDeleteDate;
    }

    public void setD_articleDeleteDate(Date d_articleDeleteDate) {
        this.d_articleDeleteDate = d_articleDeleteDate;
    }

    public int getI_articleUpdateID() {
        return i_articleUpdateID;
    }

    public void setI_articleUpdateID(int i_articleUpdateID) {
        this.i_articleUpdateID = i_articleUpdateID;
    }

    public Date getD_articleUpdateDate() {
        return d_articleUpdateDate;
    }

    public void setD_articleUpdateDate(Date d_articleUpdateDate) {
        this.d_articleUpdateDate = d_articleUpdateDate;
    }

    public String getS_articleActive() {
        return s_articleActive;
    }

    public void setS_articleActive(String s_articleActive) {
        this.s_articleActive = s_articleActive;
    }

    public Set getUoms() {
        return uoms;
    }

    public void setUoms(Set uoms) {
        this.uoms = uoms;
    }

    public Set getResponsibilitycenterprices() {
        return responsibilitycenterprices;
    }

    public void setResponsibilitycenterprices(Set responsibilitycenterprices) {
        this.responsibilitycenterprices = responsibilitycenterprices;
    }

    public Set getZoneprices() {
        return zoneprices;
    }

    public void setZoneprices(Set zoneprices) {
        this.zoneprices = zoneprices;
    }
}
