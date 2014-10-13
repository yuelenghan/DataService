package com.ghtn.dao.hibernate;

import com.ghtn.dao.AqsgcxDao;
import com.ghtn.util.StringUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/10/11.
 */
@Repository("aqsgcxDao")
public class AqsgcxDaoHibernate extends GenericDaoHibernate implements AqsgcxDao {
    @Override
    public List<Object[]> getAqsgcxData(String startDate, String endDate, String dept, String xz, Integer start, Integer limit) {
        String sql = "select g.hdeptname, g.zgdeptname, g.hplacename, g.hdate, g.hxz";
        sql += " from GETACCIDENTCASE g where 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.hdate >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.hdate <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (g.zgdept = '" + dept + "' or g.maindept = '" + dept + "' or g.zgdept in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(xz)) {
            sql += " and g.hxz = '" + xz + "'";
        }

        sql += " order by g.recordtime desc";

        return querySql(sql, start, limit);
    }
}
