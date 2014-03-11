package com.ghtn.service;

import com.ghtn.vo.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:31
 */
public interface SummaryManager extends GenericManager {


    List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String startDate, String endDate, String name) throws SQLException;

    List<DbjhbSummaryVO> getDbjhbSummaryOracleDataSource3(String date, String banci, String name) throws Exception;

    List<GpxxSummaryVO> getGpxxSummaryOracleDataSource3();

    List<FswxxSummaryVO> getFswxxSummaryOracleDataSource3(String startDate, String endDate, String name);

    List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date);

    List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date);

    List<LdxjdbSummaryVO> getLdxjdbSummaryOracleDataSource3(String startDate, String endDate, String name);

    List<KzdkyhSummaryVO> getKzdkyhSummaryOracleDataSource3(String date);

    List<YdswgphzSummaryVO> getYdswgphzSummaryOracleDataSource3(String date);

    List<SwxxSummaryVO> getSwxxSummaryOracleDataSource3(String startDate, String endDate, String name) throws ParseException;

    List<YhfltjcxSummaryVO> getYhfltjcxSummaryOracleDataSource3(String startDate, String endDate, String unit);

    List<YhxxzhcxSummaryVO> getYhxxzhcxSummaryOracleDataSource3(String startDate, String endDate, String unit, String banci) throws ParseException;

    List<GsxxSummaryVO> getGsxxSummaryOracleDataSource3(String startDate, String endDate, String unit, String level, String name) throws ParseException;
}
