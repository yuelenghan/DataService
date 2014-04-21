package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:35
 */
public class DepartmentManagerTest extends BaseTestCase {

    private DepartmentManager departmentManager;

    @Resource
    public void setDepartmentManager(DepartmentManager departmentManager) {
        this.departmentManager = departmentManager;
    }

    @Test
    public void testGetAllDept() {
       /* List<Department> list = departmentManager.getAllDeptSqlServerDataSource4();
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }*/
    }
}
