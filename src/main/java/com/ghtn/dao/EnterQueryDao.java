package com.ghtn.dao;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:02
 */
public interface EnterQueryDao extends GenericDao {

    List<Object[]> queryYhEnter(String inputPersonId, String banci, Integer levelId, Integer typeId);

    List<Object[]> querySwEnter(String inputPersonId, String banci, Integer levelId, Integer typeId);
}
