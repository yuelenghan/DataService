package com.ghtn.dao.hibernate;

import com.ghtn.dao.BaseBanciDao;
import com.ghtn.model.oracle.BaseBanci;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lihe on 14-6-3.
 */
@Repository("baseBanciDao")
public class BaseBanciDaoHibernate extends GenericDaoHibernate<BaseBanci, BigDecimal>
        implements BaseBanciDao {

    public BaseBanciDaoHibernate() {
        super(BaseBanci.class);
    }

    @Override
    public List<BaseBanci> get(String mainDeptId, String bType) {
        return getSession().createCriteria(BaseBanci.class)
                .add(Restrictions.eq("btype", bType))
                .add(Restrictions.eq("maindept", mainDeptId))
                .list();
    }

    @Override
    public BaseBanci get(String mainDeptId, String bType, String time) {
        String hql = "from BaseBanci b where b.btype = '" + bType + "'";
        hql += " and b.maindept = '" + mainDeptId + "'";
        hql += " and starttime <= '" + time + "'";
        hql += " and endtime > '" + time + "'";
        return (BaseBanci) getSession().createQuery(hql).uniqueResult();
       /* return (BaseBanci) getSession().createCriteria(BaseBanci.class)
                .add(Restrictions.eq("btype", bType))
                .add(Restrictions.eqProperty("maindept", mainDeptId))
                .add(Restrictions.le("starttime", time))
                .add(Restrictions.gt("endtime", time)).uniqueResult();*/
    }

    @Override
    public BaseBanci getYb(String mainDeptId, String bType, String time) {
        String hql = "from BaseBanci b where b.btype = '" + bType + "'";
        hql += " and b.maindept = '" + mainDeptId + "'";
        hql += " and (starttime <= '" + time + "' or endtime > '" + time + "')";
        hql += " and starttime > endtime";
        return (BaseBanci) getSession().createQuery(hql).uniqueResult();
    }
}
