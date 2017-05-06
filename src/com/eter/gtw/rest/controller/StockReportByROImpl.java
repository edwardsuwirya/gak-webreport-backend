package com.eter.gtw.rest.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.model.json.StockReportByRO;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "Stock")
public class StockReportByROImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(StockReportByROImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<StockReportByRO> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_STOCK_BY_RO, param);
        List<StockReportByRO> stocks = new ArrayList<StockReportByRO>();

        if (report.size() > 0) {
            LOGGER.debug("==>receiving List Stock By RO " + report.size());

            if (param.getsType().equalsIgnoreCase("D")) {
                for (Object[] r : report) {
                    StockReportByRO sro = new StockReportByRO();
                    sro.setCompanyName((String) r[0]);
                    sro.setResponsibilityCenterRealCode((String) r[1]);
                    sro.setResponsibilityCenterRealName((String) r[2]);
                    sro.setArticleRealCode((String) r[3]);
                    sro.setArticleName((String) r[4]);
                    sro.setArticleDepartmentName((String) r[5]);
                    sro.setTscTransSerialNo((String) r[6]);
                    sro.setQty((Integer) r[7]);
                    sro.setReceiveOrderRealNo((String) r[8]);
                    sro.setReceiveOrderDate((Date) r[9]);
                    sro.setCustomerRealCode((String) r[10]);
                    sro.setCustomerName((String) r[11]);
                    sro.setCustomerPhone((String) r[12]);
                    sro.setSalesInvoiceGrandTotal((BigDecimal) r[14]);
                    stocks.add(sro);
                }
            } else {
                for (Object[] r : report) {
                    StockReportByRO sro = new StockReportByRO();
                    sro.setCompanyName((String) r[0]);
                    sro.setResponsibilityCenterRealCode((String) r[1]);
                    sro.setResponsibilityCenterRealName((String) r[2]);
                    sro.setArticleDepartmentName((String) r[3]);
                    sro.setTotalQty((Integer) r[4]);
                    sro.setReceiveOrderRealNo((String) r[5]);
                    sro.setReceiveOrderDate((Date) r[6]);
                    sro.setCustomerRealCode((String) r[7]);
                    sro.setCustomerName((String) r[8]);
                    sro.setCustomerPhone((String) r[9]);
                    sro.setTotalAmount((BigDecimal) r[10]);
                    stocks.add(sro);
                }
            }
        }
        return stocks;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "report1.jasper";
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("sReportCode", "");
        parameters.put("sDateDesc", param.getsDateEnd() + " - " + param.getsDateEnd());
        parameters.put("sRCDesc", param.getsRC1() + " - " + param.getsRC2());
        parameters.put("sArticleDesc", param.getsArticle1() + " - " + param.getsArticle2());
        parameters.put("sCustomerDesc", param.getsCustomer1() + " - " + param.getsCustomer2());
        parameters.put("sUserPrint", param.getUserPrint());

        return reportCreator.reportCreation(FILE_PATH, parameters, callSP(param));
    }

}
