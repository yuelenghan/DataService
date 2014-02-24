package com.ghtn.service.impl;

import com.ghtn.dao.SummaryDao;
import com.ghtn.service.SummaryManager;
import com.ghtn.vo.RjxxSummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午11:11
 */
@Service("summaryManager")
public class SummaryManagerImpl extends GenericManagerImpl implements SummaryManager {

    private SummaryDao summaryDao;

    @Autowired
    public SummaryManagerImpl(SummaryDao summaryDao) {
        super(summaryDao);
        this.summaryDao = summaryDao;
    }

    @Override
    public List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String beginDate, String endDate, String dwid, String zwjb) throws SQLException {
        ResultSet resultSet = summaryDao.getRjxxSummary(beginDate, endDate, dwid, zwjb);
        if (resultSet != null) {
            List<RjxxSummaryVO> resultList = new ArrayList<>();
            while (resultSet.next()) {
                RjxxSummaryVO vo = new RjxxSummaryVO();

                // TODO : 处理resultSet中的数据

                resultList.add(vo);

            }

            return resultList;
        }
        return null;
    }

}
