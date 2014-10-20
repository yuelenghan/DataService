package com.ghtn.service.impl;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.model.oracle.Department;
import com.ghtn.service.DepartmentManager;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.DepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
            List<DepartmentVO> resultList = new ArrayList<DepartmentVO>();

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

    @Override
    public List<DepartmentVO> getChildDeptOracleDataSource3(String fDeptNumber, HttpSession session) {
        // 如果获得所有部门的信息, 先判断是否是领导, 如果不是, 获取本矿部门信息
        if (fDeptNumber.equals("0101")) {
            if (session.getAttribute("user") != null) {
                Map<String, String> userInfo = (Map<String, String>) session.getAttribute("user");
                int roleLevel = Integer.parseInt(String.valueOf(userInfo.get("roleLevel")));
                // 如果不是领导, 把fDeptNumber换成当前所属部门
                if (roleLevel != 1) {
                    fDeptNumber = userInfo.get("mainDeptId");
                }
            }
        }

        List<Object[]> list = departmentDao.getChildDept(fDeptNumber);
        if (list != null && list.size() > 0) {
            List<DepartmentVO> resultList = new ArrayList<DepartmentVO>();

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
}
