package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.model.oracle.Nswfineset;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/11
 * Time: 9:55
 */
public class SwEnterManagerTest extends BaseTestCase {

    private SwEnterManager swEnterManager;

    @Resource
    public void setSwEnterManager(SwEnterManager swEnterManager) {
        this.swEnterManager = swEnterManager;
    }

    @Test
    public void testInsert() throws ParseException {
//        swEnterManager.insertInfoOracleDataSource3(1, 1, 1, 1, "1", "1", "04094", "05558", 111, "1", "2013-08-01", "2", 1, "010102");
    }

    @Test
    public void testGetSwFineSet() {
        List<Nswfineset> list = swEnterManager.getSwFineSetOracleDataSource3(47, 2, "010104");
        System.out.println(list.get(0).getFineobject());
    }

}
