package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
public interface SwjfcxDao extends GenericDao {

    List<Object[]> getSwjfcxData(String startDate, String endDate, String dept, String name, Integer start, Integer limit);

    List<Object[]> getSwjfcxData(String startDate, String endDate, String personNumber);

    List<Object[]> getSwjfcxData(String startDate, String endDate, String dept, String personNumber);
}
