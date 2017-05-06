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
import com.eter.gtw.model.json.TopCustomer;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "TopCustomer")
public class TopCustomerImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(TopCustomerImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<TopCustomer> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_TOP_CUSTOMER, param);
        List<TopCustomer> topCusts = new ArrayList<TopCustomer>();
        if (report.size() > 0) {
            LOGGER.debug("==>receiving List Top Customer. " + report.size());

            if (param.getsType().equalsIgnoreCase("D")) {
                for (Object[] r : report) {
                    TopCustomer cust = new TopCustomer();
                    cust.setCompany((String) r[0]);
                    cust.setResponsibilityCenterRealCode((String) r[1]);
                    cust.setResponsibilityCenterName((String) r[2]);
                    cust.setCustomerRealCode((String) r[3]);
                    cust.setCustomerName((String) r[4]);
                    cust.setCustomerPhone((String) r[5]);
                    cust.setCustomerEmail1((String) r[6]);
                    cust.setReceiveOrderRealNo((String) r[7]);
                    cust.setReceiveOrderDate((Date) r[8]);
                    cust.setsRCTrans((String) r[9]);
                    cust.setdQty((Integer) r[10]);
                    cust.setdTotal((BigDecimal) r[11]);
                    cust.setPayment((BigDecimal) r[12]);
                    cust.setTotal((BigDecimal) r[13]);
                    topCusts.add(cust);
                }
            } else {
                for (Object[] r : report) {
                    TopCustomer cust = new TopCustomer();
                    cust.setCompany((String) r[0]);
                    cust.setResponsibilityCenterRealCode((String) r[1]);
                    cust.setResponsibilityCenterName((String) r[2]);
                    cust.setCustomerRealCode((String) r[3]);
                    cust.setCustomerName((String) r[4]);
                    cust.setCustomerPhone((String) r[5]);
                    cust.setCustomerEmail1((String) r[6]);
                    cust.setQty((Integer) r[7]);
                    cust.setTotal((BigDecimal) r[8]);
                    cust.setPayment((BigDecimal) r[9]);
                    topCusts.add(cust);
                }
            }
        }
        return topCusts;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRATopCustomerSummary.jasper";
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("sReportCode", "");
        parameters.put("sDateDesc", param.getsDate1() + " - " + param.getsDate2());
        parameters.put("sRCDesc", param.getsRC1() + " - " + param.getsRC2());
        parameters.put("sArticleDesc", param.getsArticle1() + " - " + param.getsArticle2());
        parameters.put("sCustomerDesc", param.getsCustomer1() + " - " + param.getsCustomer2());
        parameters.put("sRCCustomerBaseDesc", param.getsRCCustomerBase1() + " - " + param.getsRCCustomerBase2());
        parameters.put("sUserPrint", param.getUserPrint());

        return reportCreator.reportCreation(FILE_PATH, parameters, callSP(param));
    }

}
