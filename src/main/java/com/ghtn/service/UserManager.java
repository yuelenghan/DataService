package com.ghtn.service;

import com.ghtn.model.mysql.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午10:12
 * To change this template use File | Settings | File Templates.
 */
public interface UserManager extends GenericManager<User, Long> {

    User saveUserMysqlDataSource1(User user);

    User saveUserMysqlDataSource2(User user);

    User saveUserOracleDataSource3(User user);

    User saveUserOracleDataSource4(User user);

    User getUserMysqlDataSource1(Long id);

    User getUserMysqlDataSource2(Long id);

    List<User> listUserMysqlDataSource1();
}
