package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwEnterDao;
import com.ghtn.model.oracle.Nswfineset;
import com.ghtn.util.StringUtil;
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
    public List<Object[]> filterSwBasis(String deptNumber, Integer swyjLevel, String swyjText) {
        String sql = "select SWID, SWNUMBER, SWCONTENT, Levelid,levelname, Typeid,typename, H_NUMBER,h_content FROM Getswandhazusing";
        sql += " WHERE DEPTNUMBER = '" + deptNumber + "'";
        if (swyjLevel != 0) {
            sql += " and levelid = " + swyjLevel;
        }
        if (!StringUtil.isNullStr(swyjText)) {
            sql += " and (swcontent like '%" + swyjText + "%' or conpyfirst like '%" + swyjText.toUpperCase() + "%' or pyall like '%" + swyjText.toLowerCase() + "%')";
        }
        return querySql(sql);
    }

    @Override
    public List<Nswfineset> getSwFineSet(Integer levelId, Integer jcType, String mainDeptId) {
        StringBuilder hql = new StringBuilder();
        hql.append("from Nswfineset n where n.levelid = " + levelId)
                .append(" and n.jctype = " + jcType)
                .append(" and n.maindeptid = '" + mainDeptId + "'")
                .append(" and n.status = '已发布'");
        return queryHql(hql.toString());
    }
}
