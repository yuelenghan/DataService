package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface SwcxDao extends GenericDao {

    List<Object[]> getSwcxData(String startDate, String endDate, String dept, String name, Integer type, Integer level, Integer start, Integer limit);

    List<Object[]> getSwcxData(String startDate, String endDate, String personNumber, Integer type, Integer level);

    List<Object[]> getSwcxData(String startDate, String endDate, String dept, String personNumber, Integer type, Integer level);
}
