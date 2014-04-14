package com.ghtn.dao;

import com.ghtn.model.oracle.Gethangtag;

import java.sql.ResultSet;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:33
 */
public interface SummaryDao extends GenericDao {

    /**
     * 入井信息统计
     *
     * @return 统计结果
     */
    ResultSet getRjxxSummary(String beginDate, String endDate, String dwid, String zwjb);

    /**
     * 入井信息统计
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param dept      部门
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getRjxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit);

    /**
     * 带班计划表
     *
     * @param date  日期
     * @param banci 班次
     * @param name  姓名
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getDbjdbSummary(String date, String banci, String name, Integer start, Integer limit);

    /**
     * 挂牌信息
     *
     * @param start
     * @param limit
     * @return
     */
    List<Gethangtag> getGpxxSummary(Integer start, Integer limit);

    /**
     * 反三违信息
     *
     * @param startDate 开始日期
     * @param endDate   截止日期
     * @param name      姓名
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getFswxxSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    /**
     * 值班带班领导
     *
     * @param date 日期
     * @return
     */
    List<Object[]> getZbdbldSummary(String date);

    /**
     * 月度隐患汇总
     *
     * @param startDate 开始日期
     * @param endDate   截止日期
     * @return
     */
    List<Object[]> getYdyhhzSummary(String startDate, String endDate);

    /**
     * 领导下井带班
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param name      姓名
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getLdxjdbSummary(String startDate, String endDate, String name, Integer start, Integer limit);

    /**
     * 各矿隐患汇总
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param mine      矿
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getKzdkyhSummary(String startDate, String endDate, String mine, Integer start, Integer limit);

    /**
     * 月度三违挂牌信息汇总
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @return
     */
    List<Object[]> getYdswgphzSummary(String startDate, String endDate);

    /**
     * 月度三违汇总
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @return
     */
    List<Object[]> getYdswhzSummary(String startDate, String endDate);

    /**
     * 月度挂牌汇总
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @return
     */
    List<Object[]> getYdgphzSummary(String startDate, String endDate);

    /**
     * 三违信息统计
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param dept      部门
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getSwxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit);

    /**
     * 隐患分类统计查询
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param unit      单位
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getYhfltjcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit);

    /**
     * 隐患信息综合查询
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param unit      单位
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getYhxxzhcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit);

    /**
     * 工伤信息
     *
     * @param startDate 开始日期
     * @param endDate   截至日期
     * @param unit      单位
     * @param level     工伤等级
     * @param name      姓名
     * @param start
     * @param limit
     * @return
     */
    List<Object[]> getGsxxSummary(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit);

}
