package com.ghtn.dao.hibernate;

import com.ghtn.dao.YhEnterDao;
import com.ghtn.model.oracle.BaseBanci;
import com.ghtn.model.oracle.Nyhinput;
import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.Place;
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
    public void insertNyhinput(Nyhinput nyhinput) {
        save(nyhinput);
    }

    @Override
    public BaseBanci getBaseBanci(String mainDeptId, String banci) {
        return (BaseBanci) getSession().createCriteria(BaseBanci.class).add(Restrictions.eq("btype", "scbc")).
                add(Restrictions.eq("maindept", mainDeptId)).add(Restrictions.eq("name", banci)).uniqueResult();
    }
}
