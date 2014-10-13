package com.ghtn.service;

import com.ghtn.vo.AqsgcxVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * Created by lihe on 14/10/11.
 */
public interface AqsgcxManager extends GenericManager {

    List<AqsgcxVO> getAqsgcxDataOracleDataSource3(String startDate, String endDate, String dept, String xz, Integer start, Integer limit, HttpSession session) throws ParseException;

}
