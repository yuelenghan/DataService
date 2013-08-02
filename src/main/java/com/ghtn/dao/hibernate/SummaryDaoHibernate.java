package com.ghtn.dao.hibernate;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.Gethangtag;
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
    public List<Object[]> getRjxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit) {
        String sql = "select D.DEPTNAME ,p.name, k.downtime";
        sql += " from department d, person p, kq_record k";
        sql += " where k.KQPNUMBER=p.PERSONNUMBER and k.KQDEPT=d.DEPTNUMBER";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " and k.downtime >= to_date('" + startDate + "', 'yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " and k.downtime <= to_date('" + endDate + "', 'yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and d.deptname like '%" + dept + "%'";
        }

        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getDbjdbSummary(String date, String banci, String name, Integer start, Integer limit) {
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

        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getGsxxSummary(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit) {
        String sql = "select D.DEPTNAME, p.name, c.infoname, w.happendate";
        sql += " from WORKINJURY w,CS_BASEINFOSET c, PERSON p, DEPARTMENT d";
        sql += " where w.GS_LEVELID=c.INFOID(+) and w.PERSONNUMBER=p.PERSONNUMBER(+) and w.DEPTNUMBER=d.DEPTNUMBER(+)";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " and w.happendate >= to_date('" + startDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " and w.happendate <= to_date('" + endDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(unit)) {
            sql += " and D.DEPTNAME like '%" + unit + "%'";
        }
        if (!StringUtil.isNullStr(level)) {
            sql += " and c.infoname = '" + level + "'";
        }
        if (!StringUtil.isNullStr(name)) {
            sql += " and p.name like '%" + name + "%'";
        }

        return querySql(sql, start, limit);
    }


    @Override
    public List<Gethangtag> getGpxxSummary(Integer start, Integer limit) {
        return getSession().createCriteria(Gethangtag.class).setCacheable(true)
                .add(Restrictions.or(Restrictions.eq("htstatus", 2), Restrictions.eq("htstatus", 3)))
                .addOrder(Order.desc("recordtime"))
                .setFirstResult(start).setMaxResults(limit)
                .list();
    }

    @Override
    public List<Object[]> getFswxxSummary(String startDate, String endDate, String name, Integer start, Integer limit) {
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


        return querySql(sql, start, limit);
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
    public List<Object[]> getYdyhhzSummary(String date, Integer start, Integer limit) {
        String sql = "SELECT ny.MAINDEPTID,d.deptname,count(ny.YHPUTINID) YHALL,sum(decode(ny.LEVELID,42,1,0)) YHA,";
        sql += " sum(decode(ny.LEVELID,43,1,0)) YHB,sum(decode(ny.LEVELID,44,1,0)) YHC,";
        sql += " sum(decode(ny.STATUS,'逾期未整改',1,0)) YHYQWZG,";
        sql += " sum(decode(ny.YQCS,0,0,1)) YHLSYQ,sum(decode(ny.STATUS,'现场整改',1,'复查通过',1,'隐患已整改',1,0)) YHYBH,";
        sql += " sum(decode(ny.STATUS,'隐患未整改',1,'复查不通过',1,0)) YHWBH FROM GETYHINPUT ny,Department d";
        sql += " WHERE ny.PCTIME>=to_date('" + date + "','YYYY-MM-DD') and ny.STATUS not in ('新增','作废','提交审批') and ny.MAINDEPTID = d.deptnumber";
        sql += " GROUP BY ny.MAINDEPTID, D.deptname";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getLdxjdbSummary(String startDate, String endDate, String name, Integer start, Integer limit) {
        String sql = "SELECT a.MAINDEPTID,d.DEPTNAME,a.PERSONNUMBER,a.NAME,a.POSNAME,s.NEEDFREQ,a.RJALL,a.YB,a.ZB,a.ZHB,s.PLANFREQ,a.DBRJ,s.NEEDHOUR,";
        sql += " floor(a.RJSJ/60)||'时'||MOD(a.RJSJ,60)||'分' RJSJ,floor(a.RJSJ/a.RJALL/60)||'时'||MOD(floor(a.RJSJ/a.RJALL),60)||'分' PJSJ,";
        sql += " b.YHALL,c.SWALL FROM (SELECT nvl(p.USINGDEPT,p.MAINDEPTID) MAINDEPTID,p.PERSONNUMBER,p.NAME,po.POSNAME,p.ZWLEVEL,po.PSORT,";
        sql += " count(r.RJID) rjall,sum(decode(r.KQTYPE,2,1,0)) dbrj,sum(decode(r.KQBENCI,'夜班',1,0)) yb,sum(decode(r.KQBENCI,'早班',1,0)) zb,";
        sql += " sum(decode(r.KQBENCI,'中班',1,0)) zhb,sum(round(to_number(r.UPTIME-r.DOWNTIME)*1440)) rjsj ";
        sql += " FROM V_PERSON p";
        sql += " LEFT JOIN POSITION po ON p.POSID=po.POSID ";
        sql += " LEFT JOIN KQ_RECORD r ON (p.PERSONNUMBER=r.KQPNUMBER AND r.DOWNTIME IS NOT NULL AND r.UPTIME IS NOT NULL) ";
        sql += " WHERE p.ZWLEVEL<=4";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND r.KQTIME >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND r.KQTIME <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(name)) {
            sql += " AND p.NAME LIKE '%" + name + "%'";
        }

        sql += " GROUP BY nvl(p.USINGDEPT,p.MAINDEPTID),p.PERSONNUMBER,p.NAME,po.POSNAME,p.ZWLEVEL,po.PSORT) a ";
        sql += " INNER JOIN DEPARTMENT d ON a.MAINDEPTID=d.DEPTNUMBER ";
        sql += " LEFT JOIN DEPARTMENT_EX dx ON d.DEPTNUMBER=dx.DEPTNUMBER";
        sql += " LEFT JOIN";
        sql += " (SELECT nm.PERSONID,count(gy.YHPUTINID) yhall ";
        sql += " FROM GETYHINPUT gy";
        sql += " INNER JOIN NYHINPUT_MORE nm ON gy.YHPUTINID=nm.YHPUTINID ";
        sql += " WHERE gy.STATUS NOT IN ('新增','作废') ";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND gy.PCTIME >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND gy.PCTIME <= to_date('" + endDate + "','YYYY-MM-DD')";
        }

        sql += " GROUP BY nm.PERSONID) b ON a.PERSONNUMBER=b.PERSONID ";
        sql += " LEFT JOIN ";
        sql += " (SELECT ns.PCPNUMBER,count(ns.SWINPUTID) swall ";
        sql += " FROM NSWINPUT ns WHERE ns.STATUS='已发布' ";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND ns.PCTIME >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND ns.PCTIME <= to_date('" + endDate + "','YYYY-MM-DD')";
        }

        sql += " GROUP BY ns.PCPNUMBER) c ON a.PERSONNUMBER=c.PCPNUMBER ";
        sql += " LEFT JOIN TP_SCHEDULE s ON (a.PERSONNUMBER=s.PERSONID AND s.STATUS IS NULL OR s.STATUS='') ";
        sql += " ORDER BY dx.DLEVEL,dx.DSORT,d.DEPTNUMBER,a.ZWLEVEL,a.PSORT";

        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getKzdkyhSummary(String date, String mine, Integer start, Integer limit) {
        String sql = "SELECT ny.MAINDEPTID,d.deptname,ny.zrdeptname,count(ny.YHPUTINID) YHALL,sum(decode(ny.LEVELID,42,1,0)) YHA,";
        sql += " sum(decode(ny.LEVELID,43,1,0)) YHB,sum(decode(ny.LEVELID,44,1,0)) YHC,";
        sql += " sum(decode(ny.STATUS,'逾期未整改',1,0)) YHYQWZG,";
        sql += " sum(decode(ny.YQCS,0,0,1)) YHLSYQ,sum(decode(ny.STATUS,'现场整改',1,'复查通过',1,'隐患已整改',1,0)) YHYBH,";
        sql += " sum(decode(ny.STATUS,'隐患未整改',1,'复查不通过',1,0)) YHWBH FROM GETYHINPUT ny,Department d";
        sql += " WHERE ny.MAINDEPTID='" + mine + "' and ny.PCTIME>=to_date('" + date + "','YYYY-MM-DD') and ny.STATUS not in ('新增','作废','提交审批') and ny.MAINDEPTID = d.deptnumber";
        sql += " GROUP BY ny.MAINDEPTID, D.deptname,ny.zrdeptname";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getYdswgphzSummary(String date, Integer start, Integer limit) {
        String sql = "SELECT ns.MAINDEPTID,";
        sql += " d.deptname,";
        sql += " COUNT (ns.SWINPUTID) SWALL,";
        sql += " SUM (DECODE (ns.LEVELID, 89, 1, 0)) SWYZ,";
        sql += " SUM (DECODE (ns.LEVELID, 47, 1, 0)) SWJYZ,";
        sql += " SUM (DECODE (ns.LEVELID, 48, 1, 0)) SWYB,";
        sql += " COUNT (h.RECORDTIME) GPALL,";
        sql += " SUM (DECODE (h.HTSTATUS, 3, 1, 0)) GPYZ,";
        sql += " SUM (DECODE (h.HTSTATUS, 2, 1, 0)) GPWZ";
        sql += " FROM NSWINPUT ns, department d, HANGTAG h";
        sql += " WHERE     ns.PCTIME >= TO_DATE ('" + date + "', 'YYYY-MM-DD')";
        sql += " AND ns.STATUS = '已发布'";
        sql += " AND ns.LEVELID != 88";
        sql += " and ns.MAINDEPTID = d.deptnumber";
        sql += " GROUP BY ns.MAINDEPTID, d.deptname";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getSwxxSummary(String startDate, String endDate, String dept, Integer start, Integer limit) {
        String sql = " select g.MAINDEPTNAME, g.ZRKQNAME, g.SWPNAME, g.PCTIME, g.LEVELNAME from GETSWINPUT g where 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " AND g.maindeptname like '%" + dept + "%'";
        }

        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getYhfltjcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit) {
        String sql = "SELECT ny.MAINDEPTID,d.deptname, NY.ZRDEPTNAME,count(ny.YHPUTINID) YHALL,sum(decode(ny.LEVELID,42,1,0)) YHA,";
        sql += " sum(decode(ny.LEVELID,43,1,0)) YHB,sum(decode(ny.LEVELID,44,1,0)) YHC,";
        sql += " sum(decode(ny.STATUS,'逾期未整改',1,0)) YHYQWZG,";
        sql += " sum(decode(ny.YQCS,0,0,1)) YHLSYQ,sum(decode(ny.STATUS,'现场整改',1,'复查通过',1,'隐患已整改',1,0)) YHYBH,";
        sql += " sum(decode(ny.STATUS,'隐患未整改',1,'复查不通过',1,0)) YHWBH FROM GETYHINPUT ny,Department d";
        sql += " where ny.MAINDEPTID = d.deptnumber and ny.STATUS not in ('新增','作废','提交审批') ";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " and ny.PCTIME >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " and ny.PCTIME <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(unit)) {
            sql += " and ny.ZRDEPTNAME like '%" + unit + "%'";
        }

        sql += " GROUP BY ny.MAINDEPTID, D.deptname, NY.ZRDEPTNAME";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getYhxxzhcxSummary(String startDate, String endDate, String unit, Integer start, Integer limit) {
        String sql = "select zrdeptname,banci,pctime,levelname,typename, status";
        sql += " from getyhinput";
        sql += " where 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " and pctime >= to_date('" + startDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " and pctime <= to_date('" + endDate + "','yyyy-mm-dd')";
        }
        if (!StringUtil.isNullStr(unit)) {
            sql += " and zrdeptname like '%" + unit + "%'";
        }

        return querySql(sql, start, limit);
    }

}
