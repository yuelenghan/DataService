package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14/10/11.
 */
public interface AqsgcxDao extends GenericDao {

    List<Object[]> getAqsgcxData(String startDate, String endDate, String dept, String xz, Integer start, Integer limit);

}
