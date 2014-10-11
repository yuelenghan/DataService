package com.ghtn.service;

import com.ghtn.vo.SwjfcxVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
public interface SwjfcxManager extends GenericManager {

    List<SwjfcxVO> getSwjfcxDataOracleDataSource3(String startDate, String endDate, String dept, String name, Integer start, Integer limit, HttpSession session) throws ParseException;


}
