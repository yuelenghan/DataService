package com.ghtn.dao;

import com.ghtn.BaseTestCase;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午11:32
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoTest extends BaseTestCase {


    private UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
