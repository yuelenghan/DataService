package com.ghtn.service;

import com.ghtn.model.oracle.SfUser;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午10:12
 * To change this template use File | Settings | File Templates.
 */
public interface UserManager extends GenericManager<SfUser, Long> {

    String loginOracleDataSource3(String userName, String password, HttpSession session);

    String logoutOracleDataSource3(HttpSession session);
}
