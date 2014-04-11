package com.ghtn.service;

import com.ghtn.model.oracle.Person;
import com.ghtn.vo.SwBasisVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/10
 * Time: 9:40
 */
public interface SwEnterManager extends GenericManager {

    List<SwBasisVO> getSwBasisOracleDataSource3(String deptNumber, HttpSession session);

    String getSwBasisLevelOracleDataSource3(String swid, HttpSession session);

    String getSwBasisTypeOracleDataSource3(String swid, HttpSession session);

    String getBasisHazardOracleDataSource3(String swid, HttpSession session);

    List<Person> getPersonOracleDataSource3(String shortName, String mainDeptId);

    String insertInfoOracleDataSource3(Integer swyj, Integer swxz, Integer swlx, Integer swzy, String wxy, String swms, String swry, String pcry,
                                       Integer pcdd, String mxdd, String pcsj, String pcbc, Integer jcfs, String mainDeptId) throws ParseException;

}
