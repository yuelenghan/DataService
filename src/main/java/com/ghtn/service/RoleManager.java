package com.ghtn.service;

import com.ghtn.model.oracle.SfRole;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:17
 */
public interface RoleManager extends GenericManager<SfRole, BigDecimal> {

    List<Integer> getRoleLevelOracleDataSource3(Integer userId);

}
