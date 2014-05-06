package com.ghtn.service;

import com.ghtn.vo.SwxcListVO;

import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/5/6
 * Time: 9:52
 */
public interface SwxcQueryManager extends GenericManager {

    List<SwxcListVO> getSwxcListOracleDataSource3(String startDate, String endDate, int start, int limit) throws ParseException;

}
