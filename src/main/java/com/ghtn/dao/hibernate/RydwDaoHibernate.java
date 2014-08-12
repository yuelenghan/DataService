package com.ghtn.dao.hibernate;

import com.ghtn.dao.RydwDao;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

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

    @Override
    public List<Object[]> getRydwSummary() {
        String sql = "SELECT short_name as 煤矿简称, config_mine.max_num as 定员数, num_mine as 井下人数, num_leader as 跟班领导,";
        sql += " num_spec as 井下特种人员, num_overtime as 超时报警 , times_sys as 系统异常";
        sql += " FROM result_mineone inner join config_mine on result_mineone.mine_id = config_mine.mine_id";
        return querySql(sql);
    }

    @Override
    public List<Object[]> test() {
        String sql = "select Alarm_id as ID, Alarm_type as 类型, Process_time as 日期 from AlarmReport where First_report_time >= '2013-07-24';";
        return querySql(sql);
    }
}
