package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.ParseException;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:33
 */
public class YhEnterManagerTest extends BaseTestCase {

    private YhEnterManager yhEnterManager;

    @Resource
    public void setYhEnterManager(YhEnterManager yhEnterManager) {
        this.yhEnterManager = yhEnterManager;
    }

    @Test
    public void testGetYhBasis() {
        yhEnterManager.getYhBasisOracleDataSource3("010103", null);
    }

    @Test
    public void testInsert() throws ParseException {
        yhEnterManager.insertInfoOracleDataSource3(1, 1, "1", "1", "1", "1", "1", 40, "1", "2013-08-01", "1", "1", 1, "新增", "2014-01-01", "早班", 1, "010102");
    }

}
