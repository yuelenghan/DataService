package com.ghtn.dao.hibernate;

import com.ghtn.dao.YhcxDao;
import com.ghtn.model.oracle.Place;
import com.ghtn.util.ConstantUtil;
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
}
