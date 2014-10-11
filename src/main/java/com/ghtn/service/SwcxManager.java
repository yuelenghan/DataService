package com.ghtn.service;

import com.ghtn.vo.SwxxSummaryVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface SwcxManager extends GenericManager {

    List<SwxxSummaryVO> getSwcxDataOracleDataSource3(String startDate, String endDate, String dept, String name, Integer type, Integer level, Integer start, Integer limit, HttpSession session) throws ParseException;

}
