package com.ghtn.service;

import com.ghtn.vo.*;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:31
 */
public interface SummaryManager extends GenericManager {


    List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String startDate, String endDate, String dept, String zwjb, String name, Integer start, Integer limit, HttpSession session) throws SQLException, ParseException;

    List<DbjhbSummaryVO> getDbjhbSummaryOracleDataSource3(String date, String banci, String name, Integer start, Integer limit) throws Exception;

    List<GpxxSummaryVO> getGpxxSummaryOracleDataSource3(Integer start, Integer limit);

    List<FswxxSummaryVO> getFswxxSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit);

    List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date) throws ParseException;

    List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date);

    List<LdxjdbSummaryVO> getLdxjdbSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit);

    List<KzdkyhSummaryVO> getKzdkyhSummaryOracleDataSource3(String startDate, String endDate, String mine, Integer start, Integer limit);

    List<YdswgphzSummaryVO> getYdswgphzSummaryOracleDataSource3(String date, String type);

    List<SwxxSummaryVO> getSwxxSummaryOracleDataSource3(String startDate, String endDate, String dept, Integer start, Integer limit) throws ParseException;

    List<YhfltjcxSummaryVO> getYhfltjcxSummaryOracleDataSource3(String startDate, String endDate, String unit, Integer start, Integer limit);

    List<YhxxzhcxSummaryVO> getYhxxzhcxSummaryOracleDataSource3(String startDate, String endDate, String unit, Integer start, Integer limit) throws ParseException;

    List<GsxxSummaryVO> getGsxxSummaryOracleDataSource3(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit) throws ParseException;

    String getBanciOracleDataSource3() throws ParseException;
}
