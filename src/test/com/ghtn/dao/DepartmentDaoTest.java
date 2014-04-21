package com.ghtn.dao;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:10
 */
public class DepartmentDaoTest extends BaseTestCase {

    private DepartmentDao departmentDao;

    @Resource
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Test
    public void testGetAllDept() {
      /*  List<Department> list = departmentDao.getAllDept();
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }*/
    }
}
