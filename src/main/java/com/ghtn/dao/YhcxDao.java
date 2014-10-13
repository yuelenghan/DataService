package com.ghtn.dao;

import com.ghtn.model.oracle.Place;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface YhcxDao extends GenericDao {

    List<Place> filterPlace(String deptNumber, String arg);

    List<Place> filterPlace(String arg);

    List<Object[]> getYhcxData(String startDate, String endDate, String dept, String status,
                               Integer pcType, Integer type, Integer place, String zgType,
                               Integer level, Integer start, Integer limit);
}
