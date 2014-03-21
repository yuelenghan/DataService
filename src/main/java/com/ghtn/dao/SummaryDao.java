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

    List<Object[]> getRjxxSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getDbjdbSummary(String date, String banci, String name, Integer start, Integer limit);

    List<Gethangtag> getGpxxSummary(Integer start, Integer limit);

    List<Object[]> getFswxxSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getZbdbldSummary(String date, Integer start, Integer limit);

    List<Object[]> getYdyhhzSummary(String date, Integer start, Integer limit);

    List<Object[]> getLdxjdbSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getKzdkyhSummary(String date, Integer start, Integer limit);

    List<Object[]> getYdswgphzSummary(String date, Integer start, Integer limit);

    List<Object[]> getSwxxSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    List<Object[]> getYhfltjcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit);

    List<Object[]> getYhxxzhcxSummary(String startDate, String endDate, String unit, String banci, Integer start, Integer limit);

    List<Object[]> getGsxxSummary(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit);

}
