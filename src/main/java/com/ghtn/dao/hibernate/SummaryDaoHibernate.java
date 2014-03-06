package com.ghtn.dao.hibernate;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.fxyk.Gethangtag;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import oracle.jdbc.OracleTypes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private static Log log = LogFactory.getLog(SummaryDaoHibernate.class);

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

    @Override
    public List<Object[]> getFswxxSummary(String startDate, String endDate, String name) {
        String sql = "SELECT x.DEPTNAME,x.NAME,sum(CASE WHEN x.LEVELID=48 THEN 1 ELSE 0 END) YBSW,";
        sql += " sum(CASE WHEN x.LEVELID=47 THEN 1 ELSE 0 END) JYZSW,";
        sql += " sum(CASE WHEN x.LEVELID=89 THEN 1 ELSE 0 END) YZSW,";
        sql += " sum(CASE WHEN x.BANCI='夜班' THEN 1 ELSE 0 END) YEB,";
        sql += " sum(CASE WHEN x.BANCI='早班' THEN 1 ELSE 0 END) ZAOB,";
        sql += " sum(CASE WHEN x.BANCI='中班' THEN 1 ELSE 0 END) ZHONGB,count(x.SWINPUTID) ALLSW,";
        sql += " X.ZB,(CASE WHEN X.ZB>count(x.SWINPUTID) THEN X.ZB-count(x.SWINPUTID) ElSE 0 END) CS ";
        sql += " FROM";
        sql += " (SELECT d.DEPTNAME,p.NAME,t.LEVELID,t.BANCI,t.SWINPUTID,(CASE WHEN (pf.POSITIONID IS NULL) THEN 0 ELSE (pf.COUNT/pf.MONTH) END) ZB";
        sql += " FROM NSWINPUT t INNER JOIN NSWINPUT_MORE m ON t.SWINPUTID=m.SWINPUTID ";
        sql += " INNER JOIN PERSON p ON m.PERSONID=p.PERSONNUMBER ";
        sql += " INNER JOIN DEPARTMENT d ON p.AREADEPTID=d.DEPTNUMBER";
        sql += " LEFT JOIN Positionfswset pf ON (p.POSID=pf.POSITIONID AND p.USINGDEPT=pf.MAINDEPTID) WHERE t.STATUS='已发布'";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " and t.PCTIME >= to_date('" + startDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " and t.PCTIME <= to_date('" + endDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(name)) {
            sql += " and p.NAME like '%" + name + "%'";
        }

        sql += " )x GROUP BY x.DEPTNAME,x.NAME,x.ZB";


        return querySql(sql);
    }

    @Override
    public List<Object[]> getZbdbldSummary(String date) {
        String sql = "SELECT nvl(x.DEPTNAME,y.CREATEDEPT) DEPTNAME,x.DETAIL,y.YB,y.ZB,y.ZHB ";
        sql += " FROM ";
        sql += " (SELECT t.DUTYDATE,WMSYS.WM_CONCAT(t.PNAME) DETAIL,t.MIANDEPT,d.DEPTNAME ";
        sql += " FROM SHIFTSTABLE t INNER JOIN V_PERSON v ON t.DUTYPERSON=v.PERSONNUMBER ";
        sql += " INNER JOIN DEPARTMENT d ON t.MIANDEPT=d.DEPTNUMBER ";
        sql += " WHERE v.ZWLEVEL<=4";

        sql += " AND t.DUTYDATE=to_date('" + date + "','YYYY-MM-DD')";

        sql += " GROUP BY t.DUTYDATE,t.MIANDEPT,d.DEPTNAME ) x ";
        sql += " FULL JOIN (SELECT a.DEPTNUMBER,a.CREATEDEPT,WMSYS.WM_CONCAT(decode(a.BANCI,'夜班',DETAIL,'')) YB,";
        sql += " WMSYS.WM_CONCAT(decode(a.BANCI,'早班',DETAIL,'')) ZB,WMSYS.WM_CONCAT(decode(a.BANCI,'中班',DETAIL,'')) ZHB ";
        sql += " FROM (SELECT d.DEPTNUMBER,t.CREATEDEPT,decode(t.Status,'发布',t.BANCI,c.BANCI) BANCI,WMSYS.WM_CONCAT(v.NAME) DETAIL";
        sql += " FROM TP_PLAN t INNER JOIN V_PERSON v ON t.PLANPERSONID=v.PERSONNUMBER";
        sql += " INNER JOIN DEPARTMENT d ON t.CREATEDEPT=d.DEPTNAME";
        sql += " LEFT JOIN TP_CHANGE_LAST c ON t.ID=c.PLANID WHERE (t.STATUS='发布' or t.status='调班' or t.status='换班')";

        sql += " AND decode(t.Status,'发布',t.DOWNMINEDATE,c.DOWNMINEDATE)=to_date('" + date + "','YYYY-MM-DD')";

        sql += " AND v.ZWLEVEL<=4 GROUP BY d.DEPTNUMBER,t.CREATEDEPT,d.DEPTNUMBER,decode(t.Status,'发布',t.BANCI,c.BANCI)) a";
        sql += " GROUP BY a.CREATEDEPT,a.DEPTNUMBER) y ON x.MIANDEPT=y.DEPTNUMBER INNER JOIN VIEW_DEPARTMENT zz ON nvl(x.MIANDEPT,y.DEPTNUMBER)=zz.DEPTNUMBER ";
        sql += " ORDER BY zz.DLEVEL,zz.DSORT";

        return querySql(sql);
    }

    @Override
    public List<Object[]> getYdyhhzSummary(String date) {
        String sql = "SELECT ny.MAINDEPTID,d.deptname,count(ny.YHPUTINID) YHALL,sum(decode(ny.LEVELID,42,1,0)) YHA,";
        sql += " sum(decode(ny.LEVELID,43,1,0)) YHB,sum(decode(ny.LEVELID,44,1,0)) YHC,";
        sql += " sum(decode(ny.STATUS,'逾期未整改',1,0)) YHYQWZG,";
        sql += " sum(decode(ny.YQCS,0,0,1)) YHLSYQ,sum(decode(ny.STATUS,'现场整改',1,'复查通过',1,'隐患已整改',1,0)) YHYBH,";
        sql += " sum(decode(ny.STATUS,'隐患未整改',1,'复查不通过',1,0)) YHWBH FROM GETYHINPUT ny,Department d";
        sql += " WHERE ny.PCTIME>=to_date('" + date + "','YYYY-MM-DD') and ny.STATUS not in ('新增','作废','提交审批') and ny.MAINDEPTID = d.deptnumber";
        sql += " GROUP BY ny.MAINDEPTID, D.deptname";
        return querySql(sql);
    }

}
