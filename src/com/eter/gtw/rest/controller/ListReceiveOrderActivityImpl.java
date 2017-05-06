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

import com.eter.gtw.model.json.ReceiveOrderActivity;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "ReceiveOrder")
public class ListReceiveOrderActivityImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(ListReceiveOrderActivityImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<ReceiveOrderActivity> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_LIST_RO_ACTIVITY, param);
        List<ReceiveOrderActivity> roActs = new ArrayList<ReceiveOrderActivity>();

        if (report.size() > 0) {
            LOGGER.debug("==>receiving List Receive Order Activity. " + report.size());

            for (Object[] r : report) {
                ReceiveOrderActivity roa = new ReceiveOrderActivity();
                roa.setCompanyName((String) r[0]);
                roa.setReceiveOrderRealNo((String) r[1]);
                roa.setReceiveOrderDate((Date) r[2]);
                roa.setResponsibilityCenterRealCode((String) r[3]);
                roa.setResponsibilityCenterName((String) r[4]);
                roa.setCustomerRealCode((String) r[5]);
                roa.setCustomerName((String) r[6]);
                roa.setCustomerPhone((String) r[7]);
                roa.setReceptionQty((Integer) r[8]);
                roa.setReceiveOrderGrandTotal((BigDecimal) r[9]);
                roa.setReceptionOperator((String) r[10]);
                roa.setSalesInvoicePaymentDate((Date) r[11]);
                roa.setPaymentTypeName((String) r[12]);
                roa.setPayment((BigDecimal) r[13]);
                roa.setUserName((String) r[14]);
                roa.setTotalQtyPerRC((Integer) r[15]);
                roa.setTotalAmountPerRC((BigDecimal) r[16]);
                roa.setTotalQty((BigDecimal) r[17]);
                roa.setTotalAmount((BigDecimal) r[18]);
                roActs.add(roa);
            }
        }
        return roActs;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRAReceptionActivity.jasper";
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("sReportCode", "");
        parameters.put("sDateDesc", param.getsDate1() + " - " + param.getsDate2());
        parameters.put("sRCDesc", param.getsRC1() + " - " + param.getsRC2());
        parameters.put("sArticleDesc", param.getsArticle1() + " - " + param.getsArticle2());
        parameters.put("sCustomerDesc", param.getsCustomer1() + " - " + param.getsCustomer2());
        parameters.put("sUserPrint", param.getUserPrint());

        return reportCreator.reportCreation(FILE_PATH, parameters, callSP(param));
    }

}
