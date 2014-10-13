package com.ghtn.dao.hibernate;

import com.ghtn.dao.YhcxDao;
import com.ghtn.model.oracle.Place;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.StringUtil;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
@Repository("yhcxDao")
public class YhcxDaoHibernate extends GenericDaoHibernate implements YhcxDao {
    @Override
    public List<Place> filterPlace(String deptNumber, String arg) {
        return getSession().createCriteria(Place.class)
                .add(Restrictions.eq("maindeptid", deptNumber))
                .add(Restrictions.like("placename", "%" + arg + "%"))
                .setFirstResult(0).setMaxResults(ConstantUtil.MAX_RESULT)
                .list();
    }

    @Override
    public List<Place> filterPlace(String arg) {
        return getSession().createCriteria(Place.class)
                .add(Restrictions.like("placename", "%" + arg + "%"))
                .setFirstResult(0).setMaxResults(ConstantUtil.MAX_RESULT)
                .list();
    }

    @Override
    public List<Object[]> getYhcxData(String startDate, String endDate, String dept, String status, Integer pcType, Integer type, Integer place, String zgType, Integer level, Integer start, Integer limit) {
        String sql = "SELECT G.ZRDEPTNAME, G.PCTIME, G.LEVELNAME, G.TYPENAME, G.STATUS";
        sql += " FROM GETYHINPUT G WHERE 1=1";

        if (!StringUtil.isNullStr(startDate)) {
            sql += " AND g.pctime >= to_date('" + startDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(endDate)) {
            sql += " AND g.pctime <= to_date('" + endDate + "','YYYY-MM-DD')";
        }
        if (!StringUtil.isNullStr(dept)) {
            sql += " and (g.deptid = '" + dept + "' or g.maindeptid = '" + dept + "' or g.deptid in (select d.deptnumber from view_department d where fdeptnumber = '" + dept + "'))";
        }
        if (!StringUtil.isNullStr(status)) {
            sql += " and g.status = '" + status + "'";
        }
        if (pcType > -7) {
            sql += " and g.jctype = " + pcType;
        }
        if (type > 0) {
            sql += " and g.typeid = " + type;
        }
        if (place > 0) {
            sql += " and g.placeid = " + place;
        }
        if (!StringUtil.isNullStr(zgType)) {
            if (zgType.equals("现场整改")) {
                sql += " and g.status = '现场整改'";
            }
            if (zgType.equals("限期整改")) {
                sql += " and (g.status <> '现场整改' or g.status = '作废')";
            }
        }
        if (level > 0) {
            sql += " and g.levelid = " + level;
        }

        sql += " order by g.yhputinid desc";
        return querySql(sql, start, limit);
    }
}
