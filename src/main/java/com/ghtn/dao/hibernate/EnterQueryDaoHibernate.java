package com.ghtn.dao.hibernate;

import com.ghtn.dao.EnterQueryDao;
import com.ghtn.util.StringUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:03
 */
@Repository("enterQueryDao")
public class EnterQueryDaoHibernate extends GenericDaoHibernate implements EnterQueryDao {
    @Override
    public List<Object[]> queryYhEnter(String inputPersonId, String banci, Integer levelId, Integer typeId) {
        String sql = "select d.deptname, g.yhcontent, n.remarks, n.jctype, n.intime";
        sql += " from NYHINPUT n, department d, Getyhandhazusing g";
        sql += " where d.deptnumber = n.deptid and g.yhid = n.yhid and n.maindeptid = g.deptnumber";
        sql += " and n.inputpersonid = '" + inputPersonId + "'";
        if (!StringUtil.isNullStr(banci)) {
            sql += " and n.banci = '" + banci + "'";
        }
        if (levelId > 0) {
            sql += " and n.levelid = " + levelId;
        }
        if (typeId > 0) {
            sql += " and n.typeid = " + typeId;
        }
        sql += " order by n.YHPUTINID desc";
        return querySql(sql, 0, 20);
    }

    @Override
    public List<Object[]> querySwEnter(String inputPersonId, String banci, Integer levelId, Integer typeId) {
        String sql = "select p.name, g.swcontent, n.remarks, n.jctype, n.intime";
        sql += " from NSWINPUT n ,person p, Getswandhazusing g";
        sql += " where p.personnumber = n.swpnumber and g.swid = n.swid and n.maindeptid = g.deptnumber";
        sql += " and n.inputpnumber = '" + inputPersonId + "'";
        if (!StringUtil.isNullStr(banci)) {
            sql += " and n.banci = '" + banci + "'";
        }
        if (levelId > 0) {
            sql += " and n.levelid = " + levelId;
        }
        if (typeId > 0) {
            sql += " and n.typeid = " + typeId;
        }
        sql += " order by n.SWINPUTID desc";
        return querySql(sql, 0, 20);
    }
}
