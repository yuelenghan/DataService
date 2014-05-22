package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14-5-22.
 */
public interface AqgkDao extends GenericDao {

    List<Object[]> getAqgk(String startDate, String endDate);

}
