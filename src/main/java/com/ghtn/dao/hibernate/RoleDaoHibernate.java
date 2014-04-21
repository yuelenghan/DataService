package com.ghtn.dao.hibernate;

import com.ghtn.dao.RoleDao;
import com.ghtn.model.oracle.SfRole;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:09
 */
@Repository("roleDao")
public class RoleDaoHibernate extends GenericDaoHibernate<SfRole, BigDecimal> implements RoleDao {

    public RoleDaoHibernate() {
        super(SfRole.class);
    }


    @Override
    public List<Object[]> getRoleLevel(Integer userId) {
        String sql = "select levelid from sf_role";
        sql += " where roleid in (select roleid from sf_userrole where userid = " + userId + ")";
        return querySql(sql);
    }
}
