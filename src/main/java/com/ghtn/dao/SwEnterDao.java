package com.ghtn.dao;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/10
 * Time: 9:37
 */
public interface SwEnterDao extends GenericDao {

    List<Object[]> getSwBasis(String deptNumber);

    List<Object[]> filterSwBasis(String deptNumber, String arg);

}
