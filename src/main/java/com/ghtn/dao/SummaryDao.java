package com.ghtn.dao;

import com.ghtn.model.oracle.fxyk.Gethangtag;

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

    List<Object[]> getRjxxSummary(String startDate, String endDate, String name);

    List<Object[]> getDbjdbSummary(String date, String banci, String name);

    List<Gethangtag> getGpxxSummary();

    List<Object[]> getFswxxSummary(String startDate, String endDate, String name);

    List<Object[]> getZbdbldSummary(String date);

    List<Object[]> getYdyhhzSummary(String date);

    List<Object[]> getLdxjdbSummary(String startDate, String endDate, String name);

    List<Object[]> getKzdkyhSummary(String date);

    List<Object[]> getYdswgphzSummary(String date);

    List<Object[]> getSwxxSummary(String startDate, String endDate, String name);

    List<Object[]> getYhfltjcxSummary(String startDate, String endDate, String unit);

    List<Object[]> getYhxxzhcxSummary(String startDate, String endDate, String unit, String banci);

    List<Object[]> getGsxxSummary(String startDate, String endDate, String unit, String level, String name);

}
