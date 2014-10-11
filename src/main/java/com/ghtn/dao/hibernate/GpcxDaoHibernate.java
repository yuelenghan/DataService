package com.ghtn.dao.hibernate;

import com.ghtn.dao.GpcxDao;
import com.ghtn.util.StringUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
@Repository("gpcxDao")
public class GpcxDaoHibernate extends GenericDaoHibernate implements GpcxDao {

    @Override
    public List<Object[]> getGpcxData(String startDate, String endDate) {
        String sql = "SELECT h.MAINDEPT, d.DEPTNAME, d.DSORT,";
        sql += " COUNT (H.RECORDTIME) GPALL,";
        sql += " SUM (DECODE (H.HTSTATUS, 3, 1, 0)) GPYZ,";
        sql += " SUM (DECODE (H.HTSTATUS, 2, 1, 0)) GPWZ";
        sql += " FROM HANGTAG H, VIEW_DEPARTMENT D";
        sql += " WHERE H.MAINDEPT = D.DEPTNUMBER";
        sql += " AND H.HTSTATUS IN (2, 3)";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND H.GPDATE >= TO_DATE ('" + startDate + "', 'YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND H.GPDATE <= TO_DATE ('" + endDate + "', 'YYYY-MM-DD')";
        }

        sql += " GROUP BY H.MAINDEPT, D.DEPTNAME,D.DSORT";
        sql += " ORDER BY D.DSORT";
        return querySql(sql);
    }

    @Override
    public List<Object[]> getGpcxDetailData(String startDate, String endDate, String deptNumber, Integer start, Integer limit) {
        String sql = "SELECT G.ZRDEPTNAME, G.GPPNAME, G.GPDATE, G.ZPPNAME, G.ZPDATE, DECODE(G.HTSTATUS,3,'已摘牌', 2, '未摘牌', '') STATUS";
        sql += " FROM GETHANGTAG G WHERE  G.HTSTATUS IN (2,3)";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND G.GPDATE >= TO_DATE ('" + startDate + "', 'YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND G.GPDATE <= TO_DATE ('" + endDate + "', 'YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(deptNumber)) {
            sql += " AND (G.MAINDEPTID = '" + deptNumber + "' or g.zrdept = '" + deptNumber + "')";
        }

        sql += " ORDER BY G.RECORDTIME DESC, G.HTSTATUS";

        return querySql(sql, start, limit);
    }
}
