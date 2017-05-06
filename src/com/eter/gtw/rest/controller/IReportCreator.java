package com.eter.gtw.rest.controller;

import java.util.List;
import java.util.Map;

public interface IReportCreator {
    <T> byte[] reportCreation(String jasperFilePath, Map<String, Object> parameters, List<T> dataSource);
}
