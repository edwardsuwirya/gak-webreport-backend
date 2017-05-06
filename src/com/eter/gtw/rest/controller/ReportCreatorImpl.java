package com.eter.gtw.rest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Component
public class ReportCreatorImpl implements IReportCreator {

    @Override
    public <T> byte[] reportCreation(String jasperFilePath, Map<String, Object> parameters, List<T> dataSource) {
        // TODO Auto-generated method stub

        JasperReport report;
        try {
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataSource);
            report = (JasperReport) JRLoader.loadObjectFromFile(jasperFilePath);
            JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, beanColDataSource);
            return JasperExportManager.exportReportToPdf(jasperPrint);
        } catch (JRException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

}
