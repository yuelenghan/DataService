package com.ghtn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String dateToString(Date date) {
        return dateToString(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        return stringToDate(dateStr, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date stringToDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }

    public static java.util.Date createUtilDate(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.sql.Date createSqlDate(String dateStr, String format) {
        java.sql.Date date = new java.sql.Date(createUtilDate(dateStr, format).getTime());
        return date;
    }
}
