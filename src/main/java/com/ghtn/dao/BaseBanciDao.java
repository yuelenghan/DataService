package com.ghtn.dao;

import com.ghtn.model.oracle.BaseBanci;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lihe on 14-6-3.
 */
public interface BaseBanciDao extends GenericDao<BaseBanci, BigDecimal> {

    List<BaseBanci> get(String mainDeptId, String bType);

    BaseBanci get(String mainDeptId, String bType, String time);

    BaseBanci getYb(String mainDeptId, String bType, String time);

}
