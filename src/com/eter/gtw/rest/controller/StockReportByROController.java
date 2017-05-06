package com.eter.gtw.rest.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eter.gtw.model.json.CommonResponse;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.model.json.StockReportByRO;
import com.eter.gtw.utils.URLConstants;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class StockReportByROController {
    private static final Logger LOGGER = Logger.getLogger(StockReportByROController.class);

    @Autowired
    @Qualifier("Stock")
    ISpReport iSpReport;

    @RequestMapping(value = URLConstants.URL_REPORT_STOCK_BY_RO, method = RequestMethod.POST)
    public CommonResponse getReportStockByRO(@RequestBody ReportParam param) {
        try {
            List<StockReportByRO> stocks = iSpReport.callSP(param);
            if (stocks.size() > 0) {
                ObjectMapper mapper = new ObjectMapper();
                String jsonInString = mapper.writeValueAsString(stocks);
                return new CommonResponse("0", jsonInString);
            } else {
                return new CommonResponse("3", "Result Set is empty");
            }
        } catch (Exception e) {
            LOGGER.error(e);
            return new CommonResponse("99", e.toString());
        }
    }

    @RequestMapping(value = URLConstants.URL_PDF_STOCK_BY_RO, method = RequestMethod.POST, produces = "application/pdf")
    public
    @ResponseBody
    HttpEntity<byte[]> downloadPDFFile(@RequestBody ReportParam param) throws Exception {
        byte[] document = iSpReport.getFile(param);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.setContentType(new MediaType("application", "pdf"));
        headers.set("Content-Disposition", "inline; filename=StockReport.pdf");
        headers.setContentLength(document.length);

        return new HttpEntity<byte[]>(document, headers);
    }
}
