package com.ghtn.dao.hibernate;

import com.ghtn.dao.YhinputDao;
import com.ghtn.model.oracle.fxyk.Getyhinput;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:06
 */
@Repository("yhinputDao")
public class YhinputDaoHibernate extends GenericDaoHibernate<Getyhinput, Integer> implements YhinputDao {
    public YhinputDaoHibernate() {
        super(Getyhinput.class);
    }

    @Override
    public List<Getyhinput> listYhinput(Integer typeId, Integer start, Integer limit) {
        return getSession().createCriteria(Getyhinput.class).setCacheable(true)
                .add(Restrictions.eq("typeid", typeId))
                .addOrder(Order.desc("intime"))
                .setFirstResult(start).setMaxResults(limit).list();
    }

}
