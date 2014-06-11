package com.ghtn.service.impl;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.model.oracle.Department;
import com.ghtn.service.DepartmentManager;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<DepartmentVO> getAllDeptOracleDataSource3() {
        List<Object[]> list = departmentDao.getAllDept();
        if (list != null && list.size() > 0) {
            List<DepartmentVO> resultList = new ArrayList<>();

            for (Object[] o : list) {
                DepartmentVO vo = new DepartmentVO();
                vo.setDeptNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public String getDeptNameOracleDataSource3(String deptNumber) {
        return departmentDao.getDeptName(deptNumber);
    }
}
