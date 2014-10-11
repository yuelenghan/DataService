package com.ghtn.service;

import com.ghtn.vo.GpcxDetailVO;
import com.ghtn.vo.GpcxVO;

import java.text.ParseException;
import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
public interface GpcxManager extends GenericManager {

    List<GpcxVO> getGpcxDataOracleDataSource3(String startDate, String endDate);

    List<GpcxDetailVO> getGpcxDetailDataOracleDataSource3(String startDate, String endDate, String deptNumber, Integer start, Integer limit) throws ParseException;
}
