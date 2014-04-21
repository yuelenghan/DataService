package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:22
 */
public class RoleManagerTest extends BaseTestCase {

    private RoleManager roleManager;

    @Resource
    public void setRoleManager(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    @Test
    public void testGetRoleLevel() {
        List<Integer> list = roleManager.getRoleLevelOracleDataSource3(1);
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }

}
