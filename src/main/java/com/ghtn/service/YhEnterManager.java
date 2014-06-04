package com.ghtn.service;

import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.Place;
import com.ghtn.vo.*;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:28
 */
public interface YhEnterManager extends GenericManager {

    /**
     * 查询隐患依据
     *
     * @param deptNumber 部门编码
     * @param session    HttpSession
     * @return
     */
    List<YhBasisVO> getYhBasisOracleDataSource3(String deptNumber, HttpSession session);

    /**
     * 根据隐患id从session中取得隐患级别
     *
     * @param yhid    隐患id
     * @param session HttpSession
     * @return
     */
    String getYhBasisLevelOracleDataSource3(String yhid, HttpSession session);

    /**
     * 根据隐患id从session中取得隐患类型
     *
     * @param yhid    隐患id
     * @param session HttpSession
     * @return
     */
    String getYhBasisTypeOracleDataSource3(String yhid, HttpSession session);

    /**
     * 查询危险源
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<HazardVO> getHazardOracleDataSource3(String deptNumber);

    /**
     * 根据隐患id从session中取得危险源
     *
     * @param yhid    隐患id
     * @param session HttpSession
     * @return
     */
    String getBasisHazardOracleDataSource3(String yhid, HttpSession session);

    /**
     * 查询责任单位
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<ZrdwVO> getZrdwOracleDataSource3(String deptNumber);

    /**
     * 查询责任人
     *
     * @param deptId 责任单位编码
     * @return
     */
    List<ZrrVO> getZrrOracleDataSource3(String deptId);

    /**
     * 查询地点
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Place> getPlaceOracleDataSource3(String deptNumber);

    /**
     * 把隐患信息插入数据库
     *
     * @param yhyj       隐患依据
     * @param yhjb       隐患级别
     * @param yhlx       隐患类型
     * @param wxy        危险源
     * @param yhms       隐患描述
     * @param zrdw       责任单位
     * @param zrr        责任人
     * @param pcdd       排查地点
     * @param mxdd       明细地点
     * @param pcsj       排查时间
     * @param pcbc       排查班次
     * @param pcry       排查人员
     * @param pclx       排查类型
     * @param zgfs       整改方式
     * @param zgqx       整改期限
     * @param zgbc       整改班次
     * @param yhzy       隐患专业
     * @param mainDeptId 部门编码
     * @return
     * @throws ParseException
     */
    String insertInfoOracleDataSource3(Integer yhyj, Integer yhjb, Integer yhlx, String yhms, String zrdw, String zrr, Integer pcdd, String mxdd,
                                       String pcsj, String pcbc, String pcry, Integer pclx, String zgfs, String zgqx, String zgbc, Integer yhzy, String mainDeptId,
                                       Integer fineType, Integer dwfk, Integer grfk) throws ParseException;

    /**
     * 过滤隐患依据
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<YhBasisVO> filterYhBasisOracleDataSource3(String deptNumber, String yhyjLevel, String yhyjType, String yhyjText, HttpSession session);

    /**
     * 过滤危险源
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<HazardVO> filterHazardOracleDataSource3(String deptNumber, String wxyLevel, String wxyText);

    /**
     * 过滤地点
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg);

    List<DepartmentVO> filterZrdwOracleDataSource3(String deptNumber, String arg);

    List<Person> filterZrrOracleDataSource3(String deptId, String arg);

    String getBanciByTimeOracleDataSource3(String time, String mainDeptId, String bType);

}
