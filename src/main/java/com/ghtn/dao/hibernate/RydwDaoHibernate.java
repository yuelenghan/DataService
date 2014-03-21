package com.ghtn.dao.hibernate;

import com.ghtn.dao.RydwDao;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import java.sql.*;

/**
 * User: Administrator
 * Date: 14-3-18
 * Time: 上午9:58
 */
@Repository("rydwDao")
public class RydwDaoHibernate extends GenericDaoHibernate implements RydwDao {

    ResultSet resultSet;

    @Override
    public ResultSet getInMinePeople(final Date date) {
        getSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                CallableStatement statement = connection.prepareCall("{call dbo.p_syka_inminepeople(?)}");

                statement.setDate(1, date);
                resultSet = statement.executeQuery();
             /*   statement.execute();
                statement.getMoreResults();
                resultSet =  statement.getResultSet();*/
            }
        });
        return resultSet;
    }
}
