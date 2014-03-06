package com.ghtn.service;

import com.ghtn.vo.*;

import java.sql.SQLException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:31
 */
public interface SummaryManager extends GenericManager {


    List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String beginDate, String endDate, String dwid, String zwjb) throws SQLException;

    List<DbjhbSummaryVO> getDbjhbSummaryOracleDataSource3(String date, String banci, String name) throws Exception;

    List<GpxxSummaryVO> getGpxxSummaryOracleDataSource3();

    List<FswxxSummaryVO> getFswxxSummaryOracleDataSource3(String startDate, String endDate, String name);

    List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date);

    List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date);
}
