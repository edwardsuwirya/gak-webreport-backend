package com.eter.gtw.rest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eter.gtw.model.json.MemberPoint;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.SPNameConstants;

@Repository(value = "MemberPoint")
public class MemberPointImpl extends BaseController implements ISpReport {
    private static final Logger LOGGER = Logger.getLogger(MemberPointImpl.class);

    @Autowired
    ControllerProperties controllerProperties;

    @Autowired
    IReportCreator reportCreator;

    @SuppressWarnings("unchecked")
    @Override
    public List<MemberPoint> callSP(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        List<Object[]> report = pmf.callStoredProcedure(SPNameConstants.RPT_MEMBER_POINT_HISTORY, param);
        List<MemberPoint> points = new ArrayList<MemberPoint>();
        if (report.size() > 0) {
            LOGGER.debug("==>receiving List Member Point. " + report.size());

            for (Object[] r : report) {
                MemberPoint mp = new MemberPoint();
                mp.setCompanyName((String) r[0]);
                mp.setMemberCode((String) r[1]);
                mp.setMemberRealCode((String) r[2]);
                mp.setMemberName((String) r[3]);
                mp.setTransactionNo((String) r[4]);
                mp.setTransactionName((String) r[5]);
                mp.setResponsibilityCenterName((String) r[6]);
                mp.setItemName((String) r[7]);
                mp.setTransactionDate((Date) r[8]);
                mp.setMemberPoint((Integer) r[9]);
                points.add(mp);
            }
        }
        return points;
    }

    @Override
    public byte[] getFile(ReportParam param) throws Exception {
        // TODO Auto-generated method stub
        String FILE_PATH = controllerProperties.getPdfPath() + "HIRAMemberPointHistory.jasper";
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("sReportCode", "");
        parameters.put("sMemberDesc", param.getsMemberCodeStart() + " - " + param.getsMemberCodeStart());
        parameters.put("sUserPrint", param.getUserPrint());

        return reportCreator.reportCreation(FILE_PATH, parameters, callSP(param));
    }

}
