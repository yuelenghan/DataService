package com.ghtn.dao.hibernate;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.fxyk.Gethangtag;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import oracle.jdbc.OracleTypes;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.Work;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    @Override
    public List<Object[]> getDbjdbSummary(String date, String banci, String name) {
        String sql = "select cast(minedate as varchar2(23)), cast(banci as varchar2(10)), cast(person as varchar2(4000))," +
                "cast(changeperson as varchar2(4000)), cast(realperson as varchar2(4000)) from v_tpplan";
        sql += " where 1=1";

        if (!StringUtil.isNullStr(date)) {
            sql += " and minedate like '%" + date + "%'";
        }

        if (!StringUtil.isNullStr(banci)) {
            sql += " and banci = '" + banci + "'";
        }

        if (!StringUtil.isNullStr(name)) {
            sql += " and person like '%" + name + "%'";
        }

//        System.out.println("sql = " + sql);

        return querySql(sql);
    }

    // TODO : 工伤信息无数据
/*    public List<Object[]> getGsxxSummary() {
        String hql = "select w from Workinjury w, CsBaseinfoset c, Person p, Department d, Place pl";
        return getSession().createQuery(hql).setCacheable(true)
                .list();
    }*/


    @Override
    public List<Gethangtag> getGpxxSummary() {
        return getSession().createCriteria(Gethangtag.class).setCacheable(true)
                .add(Restrictions.or(Restrictions.eq("htstatus", 2), Restrictions.eq("htstatus", 3)))
                .addOrder(Order.desc("recordtime"))
                .list();
    }

}
