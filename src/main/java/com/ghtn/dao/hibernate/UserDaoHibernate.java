package com.ghtn.dao.hibernate;

import com.ghtn.dao.UserDao;
import com.ghtn.model.oracle.SfUser;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午10:11
 * To change this template use File | Settings | File Templates.
 */
@Repository("userDao")
public class UserDaoHibernate extends GenericDaoHibernate<SfUser, Long> implements UserDao {
    public UserDaoHibernate() {
        super(SfUser.class);
    }

    @Override
    public SfUser getUserByName(String userName) {
        return (SfUser) getSession().createCriteria(SfUser.class)
                .add(Restrictions.eq("username", userName)).uniqueResult();
    }
}
