package com.ghtn.dao.hibernate;

import com.ghtn.dao.YhEnterDao;
import com.ghtn.model.oracle.BaseBanci;
import com.ghtn.model.oracle.Nyhinput;
import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.Place;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.StringUtil;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:19
 */
@Repository("yhEnterDao")
public class YhEnterDaoHibernate extends GenericDaoHibernate implements YhEnterDao {


    @Override
    public List<Object[]> getYhBasis(String deptNumber) {
        String sql = "select YHID, YHNUMBER, YHCONTENT, Levelid,levelname, Typeid,typename, H_NUMBER,h_content FROM Getyhandhazusing";
        sql += " WHERE DEPTNUMBER = '" + deptNumber + "'";
        return querySql(sql);
    }

    @Override
    public List<Object[]> getHazard(String deptNumber) {
        String sql = "select h_number, h_content from Gethazardusing where deptnumber = '" + deptNumber + "'";
        return querySql(sql);
    }

    @Override
    public List<Object[]> getZrdw(String deptNumber) {
        String sql = "select deptnumber, deptname from VIEW_DEPARTMENT where Maindeptnumber = '" + deptNumber + "'";
        sql += " and (Dlevel = 176 or Dlevel = 177)";
        sql += " and Deptstatus = 1";
        return querySql(sql);
    }

    @Override
    public List<Person> getZrr(String deptId) {
        return getSession().createCriteria(Person.class).add(Restrictions.eq("deptid", deptId)).list();
    }

    @Override
    public List<Place> getPlace(String deptNumber) {
        return getSession().createCriteria(Place.class).add(Restrictions.eq("maindeptid", deptNumber)).list();
    }

    @Override
    public BaseBanci getBaseBanci(String mainDeptId, String banci) {
        return (BaseBanci) getSession().createCriteria(BaseBanci.class).add(Restrictions.eq("btype", "scbc")).
                add(Restrictions.eq("maindept", mainDeptId)).add(Restrictions.eq("name", banci)).uniqueResult();
    }

    @Override
    public List<Object[]> filterYhBasis(String deptNumber, Integer yhyjLevel, Integer yhyjType, String yhyjText) {
        String sql = "select YHID, YHNUMBER, YHCONTENT, Levelid,levelname, Typeid,typename, H_NUMBER,h_content FROM Getyhandhazusing";
        sql += " WHERE DEPTNUMBER = '" + deptNumber + "'";
        if (yhyjLevel != 0) {
            sql += " and levelid = " + yhyjLevel;
        }
        if (yhyjType != 0) {
            sql += " and typeid = " + yhyjType;
        }
        if (!StringUtil.isNullStr(yhyjText)) {
            sql += " and (yhcontent like '%" + yhyjText + "%' or conpyfirst like '%" + yhyjText.toUpperCase() + "%' or pyall like '%" + yhyjText.toLowerCase() + "%')";
        }
        return querySql(sql, 0, ConstantUtil.MAX_RESULT);
    }

    @Override
    public List<Object[]> filterHazard(String deptNumber, String wxyLevel, String wxyText) {
        String sql = "select h_number, h_content from Gethazardusing where deptnumber = '" + deptNumber + "'";
        if (!StringUtil.isNullStr(wxyLevel)) {
            sql += " and fclevel = '" + wxyLevel + "'";
        }
        if (!StringUtil.isNullStr(wxyText)) {
            sql += " and h_content like '%" + wxyText + "%'";
        }
        return querySql(sql, 0, ConstantUtil.MAX_RESULT);
    }

    @Override
    public List<Place> filterPlace(String deptNumber, String arg) {
        return getSession().createCriteria(Place.class)
                .add(Restrictions.eq("maindeptid", deptNumber))
                .add(Restrictions.like("placename", "%" + arg + "%"))
                .setFirstResult(0).setMaxResults(ConstantUtil.MAX_RESULT)
                .list();
    }

    @Override
    public List<Object[]> filterZrdw(String deptNumber, String arg) {
        String sql = "select deptnumber, deptname from view_department where maindeptnumber = '" + deptNumber + "'";
        sql += " and (dlevel = 176 or dlevel = 177) and Deptstatus = 1";
        if (!StringUtil.isNullStr(arg)) {
            sql += " and (deptname like '%" + arg + "%' or pinyin like '%" + arg.toUpperCase() + "%')";
        }
        return querySql(sql);
    }

    @Override
    public Nyhinput getYhinput(Integer placeId, String zrdw, Integer yhyj) {
        return (Nyhinput) getSession().createCriteria(Nyhinput.class)
                .add(Restrictions.eq("placeid", placeId))
                .add(Restrictions.eq("deptid", zrdw))
                .add(Restrictions.eq("yhid", yhyj))
                .add(Restrictions.or(Restrictions.eq("status", "新增"), Restrictions.eq("status", "提交审批"), Restrictions.eq("status", "隐患未整改"), Restrictions.eq("status", "逾期未整改")))
                .uniqueResult();
    }

    @Override
    public List<Person> filterZrr(String deptId, String arg) {
        return getSession().createCriteria(Person.class)
                .add(Restrictions.eq("deptid", deptId))
                .add(Restrictions.or(Restrictions.like("name", "%" + arg + "%"), Restrictions.like("pinyin", "%" + arg.toUpperCase() + "%")))
                .list();
    }
}
