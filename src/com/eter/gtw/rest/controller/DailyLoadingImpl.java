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

import com.eter.gtw.model.json.DailyLoading;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "DailyLoading")
public class DailyLoadingImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(DailyLoadingImpl.class);

    @Autowired
    ControllerProperties controllerProperties;
    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<DailyLoading> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_DAILY_LOADING, param);
        List<DailyLoading> loadings = new ArrayList<DailyLoading>();

        if (report.size() > 0) {
            LOGGER.debug("==>receiving Daily Loading. " + report.size());

            for (Object[] r : report) {
                DailyLoading dl = new DailyLoading();
                dl.setCompanyName((String) r[0]);
                dl.setResponsibilityCenterRealCode((String) r[1]);
                dl.setResponsibilityCenterName((String) r[2]);
                dl.setTransactionDateTime((Date) r[3]);
                dl.setKeterangan((String) r[4]);
                dl.setDepartment((String) r[5]);
                dl.setLoading((Integer) r[6]);
                dl.setSales((BigDecimal) r[7]);
                dl.setCustomer((Integer) r[8]);
                dl.setUrut((String) r[9]);
                loadings.add(dl);
            }
        }
        return loadings;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRADailyLoading.jasper";
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("sReportCode", "");
        parameters.put("sDateDesc", param.getsDate1() + " - " + param.getsDate2());
        parameters.put("sRCDesc", param.getsRC1() + " - " + param.getsRC2());
        parameters.put("sArticleDesc", param.getsArticle1() + " - " + param.getsArticle2());
        parameters.put("sUserPrint", param.getUserPrint());

        return reportCreator.reportCreation(FILE_PATH, parameters, callSP(param));
    }

}
