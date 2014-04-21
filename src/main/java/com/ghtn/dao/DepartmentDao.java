package com.ghtn.dao;

import com.ghtn.model.oracle.Department;

import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:05
 */
public interface DepartmentDao extends GenericDao<Department, String> {

    List<Object[]> getAllDept();

    List<Object[]> getDept(String mainDeptId);
}
