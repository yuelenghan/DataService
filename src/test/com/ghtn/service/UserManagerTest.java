package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.model.mysql.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
@Component
public class UserManagerTest extends BaseTestCase {

    @Resource
    private UserManager userManager;

    private static Log log = LogFactory.getLog(UserManagerTest.class);

    @Test
    public void testSave() {
        User user = new User();
        user.setName("数据源111");
        user.setAge(20);

        /*log.info("切换到数据源 : mysqlDataSource1");
        ContextHolder.setDbType(DataSourceType.mysqlDataSource1);
        userManager.save(user);

        user.setName("数据源222");
        log.info("切换到数据源 : mysqlDataSource1");
        ContextHolder.setDbType(DataSourceType.mysqlDataSource2);
        userManager.save(user);*/

       /* userManager.saveUserMysqlDataSource1(user);

        user.setName("数据源222");
        userManager.saveUserMysqlDataSource2(user);*/

    }

    @Test
    public void testGet() {
        System.out.println(userManager.getUserMysqlDataSource1(45L).getName());
        System.out.println(userManager.getUserMysqlDataSource2(13L).getName());
    }

    @Test
    public void testSave2() {
        User user = new User();
        user.setName("user1");
        userManager.saveUserMysqlDataSource1(user);

        user.setName("user2");
        userManager.saveUserMysqlDataSource2(user);

    }
}
