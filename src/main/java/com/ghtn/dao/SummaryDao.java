package com.ghtn.dao;

import com.ghtn.model.oracle.Gethangtag;

import java.sql.ResultSet;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:33
 */
public interface SummaryDao extends GenericDao {

    /**
     * 入井信息统计
     *
     * @return 统计结果
     */
    ResultSet getRjxxSummary(String beginDate, String endDate, String dwid, String zwjb);

    List<Object[]> getRjxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit);

    List<Object[]> getDbjdbSummary(String date, String banci, String name, Integer start, Integer limit);

    List<Gethangtag> getGpxxSummary(Integer start, Integer limit);

    List<Object[]> getFswxxSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getZbdbldSummary(String date);

    List<Object[]> getYdyhhzSummary(String startDate, String endDate);

    List<Object[]> getLdxjdbSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getKzdkyhSummary(String startDate, String endDate, String mine, Integer start, Integer limit);

    List<Object[]> getYdswgphzSummary(String startDate, String endDate);

    List<Object[]> getYdswhzSummary(String startDate, String endDate);

    List<Object[]> getYdgphzSummary(String startDate, String endDate);

    List<Object[]> getSwxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit);

    List<Object[]> getYhfltjcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit);

    List<Object[]> getYhxxzhcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit);

    List<Object[]> getGsxxSummary(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit);

}
