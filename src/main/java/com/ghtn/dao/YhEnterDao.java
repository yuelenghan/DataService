package com.ghtn.dao;

import com.ghtn.model.oracle.BaseBanci;
import com.ghtn.model.oracle.Nyhinput;
import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.Place;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:19
 */
public interface YhEnterDao extends GenericDao {

    /**
     * 查询隐患依据
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Object[]> getYhBasis(String deptNumber);

    /**
     * 查询危险源
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Object[]> getHazard(String deptNumber);

    /**
     * 查询责任单位
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Object[]> getZrdw(String deptNumber);

    /**
     * 查询责任人
     *
     * @param deptId 责任单位编码
     * @return
     */
    List<Person> getZrr(String deptId);

    /**
     * 查询地点
     *
     * @param deptNumber 部门编码
     * @return
     */
    List<Place> getPlace(String deptNumber);

    /**
     * 查询班次时间
     *
     * @param mainDeptId 部门编码
     * @param banci      班次
     * @return
     */
    BaseBanci getBaseBanci(String mainDeptId, String banci);

    /**
     * 过滤隐患依据
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<Object[]> filterYhBasis(String deptNumber, Integer yhyjLevel, Integer yhyjType, String yhyjText);

    /**
     * 过滤危险源
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<Object[]> filterHazard(String deptNumber, String wxyLevel, String wxyText);

    /**
     * 过滤地点
     *
     * @param deptNumber 部门编码
     * @param arg        过滤条件
     * @return
     */
    List<Place> filterPlace(String deptNumber, String arg);

    List<Object[]> filterZrdw(String deptNumber, String arg);

    /**
     * 查询隐患录入记录
     *
     * @param placeId 地点
     * @param zrdw    责任单位
     * @param yhyj    隐患依据
     * @return
     */
    Nyhinput getYhinput(Integer placeId, String zrdw, Integer yhyj);

    List<Person> filterZrr(String deptId, String arg);
}
