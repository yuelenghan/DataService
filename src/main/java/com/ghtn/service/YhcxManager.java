package com.ghtn.service;

import com.ghtn.model.oracle.Place;
import com.ghtn.vo.YhcxVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface YhcxManager extends GenericManager {


    List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg);

    List<Place> filterPlaceOracleDataSource3(String arg);

    List<YhcxVO> getYhcxDataOracleDataSource3(String startDate, String endDate, String dept, String status,
                                              Integer pcType, Integer type, Integer place, String zgType,
                                              Integer level, Integer start, Integer limit, HttpSession session) throws ParseException;
}
