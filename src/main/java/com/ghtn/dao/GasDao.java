package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14/8/7.
 */
public interface GasDao extends GenericDao {

    List<Object[]> getCOData(String deptName, int start, int limit);

    List<Object[]> getEquipData(String deptName, int start, int limit);

}
