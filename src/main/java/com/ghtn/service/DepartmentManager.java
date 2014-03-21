package com.ghtn.service;

import com.ghtn.model.sqlServer.Department;

import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:31
 */
public interface DepartmentManager extends GenericManager<Department, Short> {

    List<Department> getAllDeptSqlServerDataSource4();

}
