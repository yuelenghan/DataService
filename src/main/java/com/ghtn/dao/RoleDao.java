package com.ghtn.dao;

import com.ghtn.model.oracle.SfRole;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:08
 */
public interface RoleDao extends GenericDao<SfRole, BigDecimal> {

    List<Object[]> getRoleLevel(Integer userId);

}
