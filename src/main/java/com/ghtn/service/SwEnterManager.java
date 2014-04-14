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

    /**
     * 查询三违依据
     *
     * @param deptNumber 部门编码
     * @param session    HttpSession
     * @return
     */
    List<SwBasisVO> getSwBasisOracleDataSource3(String deptNumber, HttpSession session);

    /**
     * 根据三违id从session中取得三违级别
     *
     * @param swid    三违id
     * @param session HttpSession
     * @return
     */
    String getSwBasisLevelOracleDataSource3(String swid, HttpSession session);

    /**
     * 根据三违id从session中取得三违类型
     *
     * @param swid    三违id
     * @param session HttpSession
     * @return
     */
    String getSwBasisTypeOracleDataSource3(String swid, HttpSession session);

    /**
     * 根据三违id从session中取得危险源
     *
     * @param swid    三违id
     * @param session HttpSession
     * @return
     */
    String getBasisHazardOracleDataSource3(String swid, HttpSession session);

    /**
     * 根据输入的查询条件查询人员列表
     *
     * @param shortName  查询条件
     * @param mainDeptId 部门id
     * @return
     */
    List<Person> getPersonOracleDataSource3(String shortName, String mainDeptId);

    /**
     * 把三违信息插入数据库
     *
     * @param swyj       三违依据
     * @param swxz       三违性质
     * @param swlx       三违类型
     * @param swzy       三违专业
     * @param wxy        危险源
     * @param swms       三违描述
     * @param swry       三违人员
     * @param pcry       排查人员
     * @param pcdd       排查地点
     * @param mxdd       明细地点
     * @param pcsj       排查时间
     * @param pcbc       排查班次
     * @param jcfs       检查方式
     * @param mainDeptId 部门编码
     * @return
     * @throws ParseException
     */
    String insertInfoOracleDataSource3(Integer swyj, Integer swxz, Integer swlx, Integer swzy, String wxy, String swms, String swry, String pcry,
                                       Integer pcdd, String mxdd, String pcsj, String pcbc, Integer jcfs, String mainDeptId) throws ParseException;

    /**
     * 过滤三违依据
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<SwBasisVO> filterSwBasisOracleDataSource3(String deptNumber, String arg);
}
