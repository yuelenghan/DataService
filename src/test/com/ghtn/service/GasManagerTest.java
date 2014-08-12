package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/8/7.
 */
public class GasManagerTest extends BaseTestCase {

    private GasManager gasManager;

    @Resource
    public void setGasManager(GasManager gasManager) {
        this.gasManager = gasManager;
    }

    @Test
    public void testGetCOData() {
        List<Map<String, String>> list = gasManager.getCODataSqlServerDataSource7("刘庄煤矿", 0, 15);
        System.out.println(list.size());
    }

}
