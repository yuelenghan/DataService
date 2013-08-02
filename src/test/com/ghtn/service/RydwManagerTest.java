package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 14-3-18
 * Time: 上午10:18
 */
public class RydwManagerTest extends BaseTestCase {

    private RydwManager rydwManager;

    @Resource
    public void setRydwManager(RydwManager rydwManager) {
        this.rydwManager = rydwManager;
    }

    @Test
    public void testGetInMinePeople() throws SQLException {
        rydwManager.getInMinePeopleSqlServerDataSource4("2013-08-01 09:53:35", null, 0, 15);
    }

}
