package com.ghtn.dao.hibernate;

import com.ghtn.dao.SwinputDao;
import com.ghtn.model.oracle.fxyk.Getswinput;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:06
 */
@Repository("swinputDao")
public class SwinputDaoHibernate extends GenericDaoHibernate<Getswinput, Integer> implements SwinputDao {
    public SwinputDaoHibernate() {
        super(Getswinput.class);
    }

    @Override
    public List<Getswinput> listSwinput(Integer typeId, Integer start, Integer limit) {
        return getSession().createCriteria(Getswinput.class).setCacheable(true)
                .add(Restrictions.eq("typeid", typeId))
                .addOrder(Order.desc("intime"))
                .setFirstResult(start).setMaxResults(limit).list();
    }
}
