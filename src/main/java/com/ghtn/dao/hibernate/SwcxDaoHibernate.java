package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwcxDao;
import com.ghtn.util.StringUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
@Repository("swcxDao")
public class SwcxDaoHibernate extends GenericDaoHibernate implements SwcxDao {
    @Override
    public List<Object[]> getSwcxData(String startDate, String endDate, String dept, String name, Integer type, Integer level, Integer start, Integer limit) {
        String sql = " select g.MAINDEPTNAME, g.deptname, g.SWPNAME, g.PCTIME, g.LEVELNAME from GETSWINPUT g, person p where g.swpnumber = p.personnumber";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (g.maindeptid = '" + dept + "' or g.deptnumber = '" + dept + "' or g.deptnumber in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(name)) {
            sql += " and (p.name like '%" + name + "%' or p.pinyin like '%" + name.toUpperCase() + "%')";
        }
        if (type > 0) {
            sql += " and g.typeid = " + type;
        }
        if (level > 0) {
            sql += " and g.levelid = " + level;
        }

        sql += " order by g.swinputid desc";

        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getSwcxData(String startDate, String endDate, String personNumber, Integer type, Integer level) {
        String sql = " select g.MAINDEPTNAME, g.deptname, g.SWPNAME, g.PCTIME, g.LEVELNAME from GETSWINPUT g where 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(personNumber)) {
            sql += " and g.swpnumber = '" + personNumber + "'";
        }
        if (type > 0) {
            sql += " and g.typeid = " + type;
        }
        if (level > 0) {
            sql += " and g.levelid = " + level;
        }

        sql += " order by g.swinputid desc";

        return querySql(sql);
    }

    @Override
    public List<Object[]> getSwcxData(String startDate, String endDate, String dept, String personNumber, Integer type, Integer level) {
        String sql = " select g.MAINDEPTNAME, g.deptname, g.SWPNAME, g.PCTIME, g.LEVELNAME from GETSWINPUT g where 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (g.maindeptid = '" + dept + "' or g.deptnumber = '" + dept + "' or g.deptnumber in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(personNumber)) {
            sql += " and g.swpnumber <> '" + personNumber + "'";
        }
        if (type > 0) {
            sql += " and g.typeid = " + type;
        }
        if (level > 0) {
            sql += " and g.levelid = " + level;
        }

        sql += " order by g.swinputid desc";

        return querySql(sql);
    }
}
