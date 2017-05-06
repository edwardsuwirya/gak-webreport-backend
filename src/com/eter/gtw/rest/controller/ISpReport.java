package com.eter.gtw.rest.controller;

import java.util.List;

import com.eter.gtw.model.json.ReportParam;

public interface ISpReport {
    <T> List<T> callSP(ReportParam param) throws Exception;

    byte[] getFile(ReportParam param) throws Exception;
}
