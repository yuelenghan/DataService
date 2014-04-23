package com.ghtn.service;

import com.ghtn.vo.SwEnterQueryVO;
import com.ghtn.vo.YhEnterQueryVO;

import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:17
 */
public interface EnterQueryManager extends GenericManager {

    List<YhEnterQueryVO> queryYhEnterOracleDataSource3(String inputPersonId, String banci, String levelId, String typeId) throws ParseException;

    List<SwEnterQueryVO> querySwEnterOracleDataSource3(String inputPersonId, String banci, String levelId, String typeId);

}
