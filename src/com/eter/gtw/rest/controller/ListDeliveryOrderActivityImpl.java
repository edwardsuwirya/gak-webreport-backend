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

import com.eter.gtw.model.json.DeliveryOrderActivity;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "DeliveryOrder")
public class ListDeliveryOrderActivityImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(ListDeliveryOrderActivityImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<DeliveryOrderActivity> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_LIST_DO_ACTIVITY, param);
        List<DeliveryOrderActivity> doActs = new ArrayList<DeliveryOrderActivity>();

        if (report.size() > 0) {
            LOGGER.debug("==>receiving List Delivery Order Activity. " + report.size());

            for (Object[] r : report) {
                DeliveryOrderActivity doa = new DeliveryOrderActivity();
                doa.setCompanyName((String) r[0]);
                doa.setResponsibilityCenterRealCode((String) r[1]);
                doa.setResponsibilityCenterName((String) r[2]);
                doa.setDeliveryOrderRealNo((String) r[3]);
                doa.setDeliveryOrderDate((Date) r[4]);
                doa.setReceiveOrderRealNo((String) r[5]);
                doa.setReceiveOrderDate((Date) r[6]);
                doa.setCustomerRealCode((String) r[7]);
                doa.setCustomerName((String) r[8]);
                doa.setCustomerCellPhone((String) r[9]);
                doa.setCustomerEmail1((String) r[10]);
                doa.setdQty((Integer) r[11]);
                doa.setReceiveOrderGrandTotal((BigDecimal) r[12]);
                doa.setSalesInvoicePaymentDate((Date) r[13]);
                doa.setPaymentTypeName((String) r[14]);
                doa.setPayment((BigDecimal) r[15]);
                doa.setTotalQtyPerRC((Integer) r[16]);
                doa.setTotalAmountPerRC((BigDecimal) r[17]);
                doa.setTotalQty((BigDecimal) r[18]);
                doa.setTotalAmount((BigDecimal) r[19]);
                doActs.add(doa);
            }
        }
        return doActs;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRADeliveryActivity.jasper";
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
