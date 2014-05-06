package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwxcQueryDao;
import com.ghtn.model.oracle.Nswinput;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/5/6
 * Time: 9:53
 */
@Repository("swxcQueryDao")
public class SwxcQueryDaoHibernate extends GenericDaoHibernate implements SwxcQueryDao {


    @Override
    public List<Nswinput> getSwxcList(Date startDate, Date endDate, int start, int limit) {
        return getSession().createCriteria(Nswinput.class)
                .add(Restrictions.between("pctime", startDate, endDate))
                .setFirstResult(start).setMaxResults(limit)
                .addOrder(Order.desc("swinputid")).list();
    }
}
