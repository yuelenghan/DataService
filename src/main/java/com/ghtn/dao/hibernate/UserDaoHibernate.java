package com.ghtn.dao.hibernate;

import com.ghtn.dao.UserDao;
import com.ghtn.model.mysql.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午10:11
 * To change this template use File | Settings | File Templates.
 */
@Repository("userDao")
public class UserDaoHibernate extends GenericDaoHibernate<User, Long> implements UserDao {
    public UserDaoHibernate() {
        super(User.class);
    }

    @Override
    public List<User> listUser() {
        return getSession().createCriteria(User.class).setCacheable(true).list();
    }
}
