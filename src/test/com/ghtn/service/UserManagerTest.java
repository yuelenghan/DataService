package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
public class UserManagerTest extends BaseTestCase {

    @Resource
    private UserManager userManager;

    private static Log log = LogFactory.getLog(UserManagerTest.class);

    @Test
    public void testLogin() {
        Assert.assertEquals("success", userManager.loginOracleDataSource3("05337", "123456", null));
    }
}
