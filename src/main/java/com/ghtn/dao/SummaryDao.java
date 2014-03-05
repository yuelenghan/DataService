package com.ghtn.dao;

import com.ghtn.model.oracle.fxyk.Gethangtag;

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

    List<Object[]> getDbjdbSummary(String date, String banci, String name);

    List<Gethangtag> getGpxxSummary();
}
