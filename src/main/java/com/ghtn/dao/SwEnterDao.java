package com.ghtn.dao;

import com.ghtn.model.oracle.Nswfineset;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/10
 * Time: 9:37
 */
public interface SwEnterDao extends GenericDao {

    /**
     * 查询三违依据
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Object[]> getSwBasis(String deptNumber);

    /**
     * 过滤三违依据
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<Object[]> filterSwBasis(String deptNumber, Integer swyjLevel, String swyjText);

    List<Nswfineset> getSwFineSet(Integer levelId, Integer jcType, String mainDeptId);

}
