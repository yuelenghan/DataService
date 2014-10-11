package com.ghtn.dao;

import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
public interface GpcxDao extends GenericDao {

    /**
     * 得到挂牌汇总数据
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 汇总数据
     */
    List<Object[]> getGpcxData(String startDate, String endDate);

    List<Object[]> getGpcxDetailData(String startDate, String endDate, String deptNumber, Integer start, Integer limit);

}
