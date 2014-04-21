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
    public List<Object[]> getAllDept() {
        String sql = "select deptnumber, deptname from view_department where dlevel = 175 order by dsort";
        return querySql(sql);
    }

    @Override
    public List<Object[]> getDept(String mainDeptId) {
        String sql = "select deptnumber, deptname from view_department where (dlevel = 176 or dlevel = 177)" +
                " and Deptstatus = 1 and maindeptnumber = '" + mainDeptId + "' order by dsort";
        return querySql(sql);
    }
}
