package com.eter.gtw.utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateConverter {
    String formatOriginal = "dd MMM yyyy";
    String formatNewest = "yyyy-MM-dd";

    public String convert(String value) {
        DateTimeFormatter fmtOri = DateTimeFormat.forPattern(formatOriginal);
        DateTimeFormatter fmtNew = DateTimeFormat.forPattern(formatNewest);
        DateTime dt = fmtOri.parseDateTime(value);
        return dt.toString(fmtNew);

    }

    public String convert(String formatOri, String formatNew, String value) {
        DateTimeFormatter fmtOri = DateTimeFormat.forPattern(formatOri);
        DateTimeFormatter fmtNew = DateTimeFormat.forPattern(formatNew);
        DateTime dt = fmtOri.parseDateTime(value);
        return dt.toString(fmtNew);
    }
}
