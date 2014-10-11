package com.ghtn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static void main(String[] args) throws ParseException {
        /*String str = "2013-06-01 14:33:20";
        String s = dateToString(stringToDate(str), "HH:mm:ss");
        System.out.println(s);*/

        /*Long t1 = stringToDate("2013-06-01 12:05:00").getTime();
        Long t2 = stringToDate("2013-06-01 16:08:01").getTime();
        System.out.println((t2-t1)/1000/60);*/

       /* System.out.println(getFirst(new Date()));
        System.out.println(getLast(new Date()));*/

        /*Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(DateUtil.stringToDate("04:00:00", "HH:mm:ss"));
        c2.setTime(DateUtil.stringToDate("12:00:00", "HH:mm:ss"));

        Date curDate = new Date();
        System.out.println(curDate.after(c1.getTime()));
        System.out.println(curDate.before(c2.getTime()));

        c1.setTime(DateUtil.stringToDate("12:00:00", "HH:mm:ss"));
        c2.setTime(DateUtil.stringToDate("19:00:00", "HH:mm:ss"));

        System.out.println(curDate.after(c1.getTime()));
        System.out.println(curDate.before(c2.getTime()));

        System.out.println(c2.getTime());*/

        /*Calendar c = Calendar.getInstance();
        Date curDate = new Date();
        c.setTime(curDate);
        c.add(Calendar.DAY_OF_MONTH, -8);
        System.out.println(DateUtil.dateToString(c.getTime()));*/

        // 当前日期
        Date curDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(curDate);
        c.add(Calendar.DAY_OF_MONTH, -1);

        // 前一天
        Date preDate = c.getTime();

        c.setTime(curDate);
        c.add(Calendar.DAY_OF_MONTH, 1);
        Date aftDate = c.getTime();

        // 夜班开始时间
        String preYbStart = DateUtil.dateToString(preDate, "yyyy-MM-dd") + " " + "19:00:00";
        // 夜班结束时间
        String preYbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "04:00:00";

        String aftYbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "19:00:00";
        String aftYbEnd = DateUtil.dateToString(aftDate, "yyyy-MM-dd") + " " + "04:00:00";

        String zbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "04:00:00";
        String zbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "12:00:00";

        String zhbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "12:00:00";
        String zhbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + "19:00:00";

        System.out.println("夜班：start = " + preYbStart + ", end = " + preYbEnd);
        System.out.println("早班：start = " + zbStart + ", end = " + zbEnd);
        System.out.println("中班：start = " + zhbStart + ", end = " + zhbEnd);
        System.out.println("夜班：start = " + aftYbStart + ", end = " + aftYbEnd);

        Date testDate = DateUtil.stringToDate("2014-10-08 19:00:00");

        if ((testDate.compareTo(DateUtil.stringToDate(zbStart)) == 0 || testDate.after(DateUtil.stringToDate(zbStart))) && testDate.before(DateUtil.stringToDate(zbEnd))) {
            System.out.println("早班");
        }

        if ((testDate.compareTo(DateUtil.stringToDate(zhbStart)) == 0 || testDate.after(DateUtil.stringToDate(zhbStart))) && testDate.before(DateUtil.stringToDate(zhbEnd))) {
            System.out.println("中班");
        }

        if ((testDate.compareTo(DateUtil.stringToDate(preYbStart)) == 0 || testDate.after(DateUtil.stringToDate(preYbStart))) && testDate.before(DateUtil.stringToDate(preYbEnd))) {
            System.out.println("夜班");
        }

        if ((testDate.compareTo(DateUtil.stringToDate(aftYbStart)) == 0 || testDate.after(DateUtil.stringToDate(aftYbStart))) && testDate.before(DateUtil.stringToDate(aftYbEnd))) {
            System.out.println("夜班");
        }
    }

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

    /**
     * 得到指定年月的最后一天
     *
     * @param year  年
     * @param month 月
     * @return 指定年月的最后一天
     */
    public static int getLastDayOfMonth(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        return c.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 根据传入的日期，得到当月第一天
     *
     * @param date
     * @return
     */
    public static String getFirst(Date date) {
        if (date != null) {
            String[] temp = dateToString(date, "yyyy-MM-dd").split("-");
            return temp[0] + "-" + temp[1] + "-01";
        }
        return "";
    }

    /**
     * 根据传入的日期，得到当月最后一天
     *
     * @param date
     * @return
     */
    public static String getLast(Date date) {
        if (date != null) {
            String[] temp = dateToString(date, "yyyy-MM-dd").split("-");
            return temp[0] + "-" + temp[1] + "-" + getLastDayOfMonth(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        return "";
    }

}
