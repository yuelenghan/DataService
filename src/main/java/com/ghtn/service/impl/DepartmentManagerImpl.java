package com.ghtn.service.impl;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.model.oracle.Department;
import com.ghtn.service.DepartmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:32
 */
@Service("departmentManager")
public class DepartmentManagerImpl extends GenericManagerImpl<Department, String> implements DepartmentManager {

    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentManagerImpl(DepartmentDao departmentDao) {
        super(departmentDao);
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> getAllDeptSqlServerDataSource4() {
        return departmentDao.getAllDept();
    }
}
