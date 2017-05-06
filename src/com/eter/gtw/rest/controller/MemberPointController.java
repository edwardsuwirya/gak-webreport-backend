package com.eter.gtw.rest.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.CommonResponse;
import com.eter.gtw.model.json.MemberPoint;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.URLConstants;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MemberPointController {
    private static final Logger LOGGER = Logger.getLogger(MemberPointController.class);

    @Autowired
    @Qualifier("MemberPoint")
    ISpReport iSpReport;

    @RequestMapping(value = URLConstants.URL_REPORT_MEMBER_POINT, method = RequestMethod.POST)
    public CommonResponse getReportMemberPoint(@RequestBody ReportParam param) {
        try {
            List<MemberPoint> points = iSpReport.callSP(param);
            if (points.size() > 0) {
                ObjectMapper mapper = new ObjectMapper();
                String jsonInString = mapper.writeValueAsString(points);
                return new CommonResponse("0", jsonInString);
            } else {
                return new CommonResponse("3", "Result Set is empty");
            }
        } catch (Exception e) {
            LOGGER.error(e);
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_PDF_MEMBER_POINT, method = RequestMethod.POST)
    public
    @ResponseBody
    ResponseEntity<byte[]> downloadPDFFile(@RequestBody ReportParam param) {
        try {
            byte[] document = iSpReport.getFile(param);

            HttpHeaders headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");
            headers.setContentType(new MediaType("application", "pdf"));
            headers.set("Content-Disposition", "inline; filename=MemberPoint.pdf");
            headers.setContentLength(document.length);

            return new ResponseEntity<byte[]>(document, headers, HttpStatus.OK);
        } catch (Exception ex) {
            LOGGER.error("Error in Creating PDF Member Point : " + ex);
            return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
