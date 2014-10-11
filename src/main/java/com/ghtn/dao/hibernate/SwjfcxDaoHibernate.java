package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwjfcxDao;
import com.ghtn.util.StringUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
@Repository("swjfcxDao")
public class SwjfcxDaoHibernate extends GenericDaoHibernate implements SwjfcxDao {
    @Override
    public List<Object[]> getSwjfcxData(String startDate, String endDate, String dept, String name, Integer start, Integer limit) {
        String sql = "SELECT p.DEPTNAME, sd.*";
        sql += " FROM GETSWINPUT s";
        sql += " INNER JOIN NSWFINEDETAIL sd ON s.SWINPUTID = sd.SWINPUTID";
        sql += " INNER JOIN V_PERSON p ON sd.FINEID = p.PERSONNUMBER";
        sql += " WHERE s.STATUS = '已发布' AND sd.FINETYPE = 0 AND sd.FINEKIND = 1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND s.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND s.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (s.maindeptid = '" + dept + "' or s.deptnumber = '" + dept + "' or s.deptnumber in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(name)) {
            sql += " and (p.name LIKE '%" + name + "%' or p.pinyin like '%" + name.toUpperCase() + "%')";
        }

        sql += " order by s.swinputid desc";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getSwjfcxData(String startDate, String endDate, String personNumber) {
        String sql = "SELECT p.DEPTNAME, sd.*";
        sql += " FROM GETSWINPUT s";
        sql += " INNER JOIN NSWFINEDETAIL sd ON s.SWINPUTID = sd.SWINPUTID";
        sql += " INNER JOIN V_PERSON p ON sd.FINEID = p.PERSONNUMBER";
        sql += " WHERE s.STATUS = '已发布' AND sd.FINETYPE = 0 AND sd.FINEKIND = 1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND s.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND s.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(personNumber)) {
            sql += " and sd.FINEID = '" + personNumber + "'";
        }

        sql += " order by s.swinputid desc";
        return querySql(sql);
    }

    @Override
    public List<Object[]> getSwjfcxData(String startDate, String endDate, String dept, String personNumber) {
        String sql = "SELECT p.DEPTNAME, sd.*";
        sql += " FROM GETSWINPUT s";
        sql += " INNER JOIN NSWFINEDETAIL sd ON s.SWINPUTID = sd.SWINPUTID";
        sql += " INNER JOIN V_PERSON p ON sd.FINEID = p.PERSONNUMBER";
        sql += " WHERE s.STATUS = '已发布' AND sd.FINETYPE = 0 AND sd.FINEKIND = 1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND s.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND s.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (s.maindeptid = '" + dept + "' or s.deptnumber = '" + dept + "' or s.deptnumber in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(personNumber)) {
            sql += " and sd.FINEID <> '" + personNumber + "'";
        }

        sql += " order by s.swinputid desc";
        return querySql(sql);
    }
}
