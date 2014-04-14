package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwEnterDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/10
 * Time: 9:38
 */
@Repository("swEnterDao")
public class SwEnterDaoHibernate extends GenericDaoHibernate implements SwEnterDao {
    @Override
    public List<Object[]> getSwBasis(String deptNumber) {
        String sql = "select SWID, SWNUMBER, SWCONTENT, Levelid,levelname, Typeid,typename, H_NUMBER,h_content FROM Getswandhazusing";
        sql += " WHERE DEPTNUMBER = '" + deptNumber + "'";
        return querySql(sql);
    }

    @Override
    public List<Object[]> filterSwBasis(String deptNumber, String arg) {
        String sql = "select SWID, SWNUMBER, SWCONTENT, Levelid,levelname, Typeid,typename, H_NUMBER,h_content FROM Getswandhazusing";
        sql += " WHERE DEPTNUMBER = '" + deptNumber + "'";
        sql += " and swcontent like '%" + arg + "%'";
        return querySql(sql);
    }
}
