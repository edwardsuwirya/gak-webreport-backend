package com.eter.gtw.utils;

public interface URLConstants {
    public static final String URL_TEST = "/api/test/get/{message}";
    public static final String URL_COUNTRY_ADD = "/api/country/add";
    public static final String URL_COUNTRY_GET_ALL = "/api/country/get";
    public static final String URL_COUNTRY_GET_BY_ID = "/api/country/get/:id";

    public static final String URL_CREATE_TOKEN = "/common/token/create";

    public static final String URL_RECEIVE_ORDER_ADD = "api/transaction/receiveOrder/add";
    public static final String URL_SALES_INVOICE_ADD = "api/transaction/salesInvoice/add";
    public static final String URL_DELIVERY_ORDER_ADD = "api/transaction/deliveryOrder/add";
    public static final String URL_BUCKET_TRANSACTION_ADD = "api/transaction/bucketTransaction/add";

    public static final String URL_REPORT_TRANS_CUSTOMER = "/api/report/customerTransactionHistory";
    public static final String URL_REPORT_DAILY_LOADING = "/api/report/dailyLoading";
    public static final String URL_REPORT_LIST_DO_ACTIVITY = "/api/report/listDOActivity";
    public static final String URL_REPORT_LIST_RO_ACTIVITY = "/api/report/listROActivity";
    public static final String URL_REPORT_MEMBER_POINT = "/api/report/memberPoint";
    public static final String URL_REPORT_STOCK_BY_RO = "/api/report/stockByRO";
    public static final String URL_REPORT_TOP_CUSTOMER = "/api/report/topCustomer";

    public static final String URL_PDF_TRANS_CUSTOMER = "/api/report/pdf/customerTransactionHistory";
    public static final String URL_PDF_DAILY_LOADING = "/api/report/pdf/dailyLoading";
    public static final String URL_PDF_LIST_DO_ACTIVITY = "/api/report/pdf/listDOActivity";
    public static final String URL_PDF_LIST_RO_ACTIVITY = "/api/report/pdf/listROActivity";
    public static final String URL_PDF_MEMBER_POINT = "/api/report/pdf/memberPoint";
    public static final String URL_PDF_STOCK_BY_RO = "/api/report/pdf/stockByRO";
    public static final String URL_PDF_TOP_CUSTOMER = "/api/report/pdf/topCustomer";

    public static final String URL_ARTICLE_GET_ALL = "/api/article/getAll";
    public static final String URL_RESPONSIBILITY_CENTER_GET_ALL = "/api/responsibilityCenter/getAll";
}

