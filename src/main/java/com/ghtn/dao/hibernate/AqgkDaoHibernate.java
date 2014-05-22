package com.ghtn.dao.hibernate;

import com.ghtn.dao.AqgkDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14-5-22.
 */
@Repository("aqgkDao")
public class AqgkDaoHibernate extends GenericDaoHibernate implements AqgkDao {

    @Override
    public List<Object[]> getAqgk(String startDate, String endDate) {
        String sql = "select t1.maindeptid, d.deptname, t1.yhall, t2.swall, t3.gpall from";
        sql += " (SELECT ny.MAINDEPTID, COUNT (ny.YHPUTINID) YHALL";
        sql += " FROM GETYHINPUT ny";
        sql += " WHERE ny.PCTIME between TO_DATE ('" + startDate + "', 'YYYY-MM-DD')";
        sql += " and to_date('" + endDate + "','YYYY-MM-DD')";
        sql += " AND ny.STATUS NOT IN ('新增', '作废', '提交审批')";
        sql += " GROUP BY ny.MAINDEPTID) t1,";
        sql += " (SELECT ns.MAINDEPTID, COUNT (ns.SWINPUTID) SWALL";
        sql += " FROM NSWINPUT ns";
        sql += " WHERE ns.PCTIME between TO_DATE ('" + startDate + "', 'YYYY-MM-DD')";
        sql += " and to_date('" + endDate + "','YYYY-MM-DD')";
        sql += " AND ns.STATUS = '已发布'";
        sql += " AND ns.LEVELID != 88";
        sql += " GROUP BY ns.MAINDEPTID) t2,";
        sql += " ( SELECT h.MAINDEPT,";
        sql += " COUNT (h.RECORDTIME) GPALL";
        sql += " FROM HANGTAG h";
        sql += " WHERE h.GPDATE between TO_DATE ('" + startDate + "', 'YYYY-MM-DD') ";
        sql += " and to_date('" + endDate + "','YYYY-MM-DD')";
        sql += " AND h.HTSTATUS IN (2, 3)";
        sql += " GROUP BY h.MAINDEPT) t3, department d";
        sql += " where t1.maindeptid = t2.maindeptid";
        sql += " and t1.maindeptid = t3.maindept";
        sql += " and t1.maindeptid = d.deptnumber";
        return querySql(sql);
    }
}
