package com.ghtn.dao.hibernate;

import com.ghtn.dao.SummaryDao;
import com.ghtn.util.DateUtil;
import oracle.jdbc.OracleTypes;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午10:33
 */
@Repository("summaryDao")
public class SummaryDaoHibernate extends GenericDaoHibernate implements SummaryDao {
    public SummaryDaoHibernate() {
    }

    ResultSet resultSet;

    /**
     * 入井信息统计
     *
     * @return 统计结果
     */
    @Override
    public ResultSet getRjxxSummary(final String beginDate, final String endDate, final String dwid, final String zwjb) {

        getSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                CallableStatement statement = connection.prepareCall("{call XJDB_POS4ORLESS.getALLXJDB_POS4ORLESS(?, ?, ?, ?, ?)}");

                statement.setDate(1, DateUtil.createSqlDate(beginDate, "yyyy-MM-dd"));
                statement.setDate(2, DateUtil.createSqlDate(endDate, "yyyy-MM-dd"));
                statement.setString(3, dwid);
                statement.setString(4, zwjb);
                statement.registerOutParameter(5, OracleTypes.CURSOR);

                statement.execute();
                resultSet = (ResultSet) statement.getObject(5);
            }
        });
        return resultSet;
    }
}
