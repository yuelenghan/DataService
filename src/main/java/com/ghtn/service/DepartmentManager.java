package com.ghtn.service;

import com.ghtn.model.oracle.Department;
import com.ghtn.vo.DepartmentVO;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午5:31
 */
public interface DepartmentManager extends GenericManager<Department, String> {

    List<DepartmentVO> getAllDeptOracleDataSource3();

    String getDeptNameOracleDataSource3(String deptNumber);

    List<DepartmentVO> getChildDeptOracleDataSource3(String fDeptNumber, HttpSession session);

}
