package com.ghtn.dao.hibernate;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.model.oracle.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:06
 */
@Repository("departmentDao")
public class DepartmentDaoHibernate extends GenericDaoHibernate<Department, String> implements DepartmentDao {

    public DepartmentDaoHibernate() {
        super(Department.class);
    }

    @Override
    public List<Department> getAllDept() {
        return getSession().createCriteria(Department.class).list();
    }
}
