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

import com.eter.gtw.model.json.CustomerTransactionHistory;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "CustTransHist")
public class CustomerTransactionHistoryImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(CustomerTransactionHistoryImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<CustomerTransactionHistory> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_CUSTOMER_TRANSACTION_HISTORY, param);
        List<CustomerTransactionHistory> histories = new ArrayList<CustomerTransactionHistory>();
        if (report.size() > 0) {
            LOGGER.debug("==>receiving Customer Trans Hist. " + report.size());

            for (Object[] r : report) {
                CustomerTransactionHistory cth = new CustomerTransactionHistory();
                cth.setCompanyName((String) r[0]);
                cth.setResponsibilityCenterRealCode((String) r[1]);
                cth.setResponsibilityCenterRealName((String) r[2]);
                cth.setCustomerRealCode((String) r[3]);
                cth.setCustomerName((String) r[4]);
                cth.setCustomerPhone((String) r[5]);
                cth.setCustomerEmail1((String) r[6]);
                cth.setTransResponsibilityCenterName((String) r[7]);
                cth.setReceiveOrderRealNo((String) r[8]);
                cth.setReceiveOrderDate((Date) r[9]);
                cth.setdQty((Integer) r[10]);
                cth.setdTotalReception((BigDecimal) r[11]);
                cth.setdDeliveryDate((Date) r[12]);
                cth.setdQtyDelivery((Integer) r[13]);
                cth.setdPaymentDate((Date) r[14]);
                cth.setdPayment((BigDecimal) r[15]);
                histories.add(cth);
            }
        }
        return histories;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRACustomerTransactionHistory.jasper";
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
