package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午5:31
 */
public class KqRecordManagerTest extends BaseTestCase {

    private KqRecordManager kqRecordManager;

    @Resource
    public void setKqRecordManager(KqRecordManager kqRecordManager) {
        this.kqRecordManager = kqRecordManager;
    }

    @Test
    public void testGet() throws Exception {
        kqRecordManager.getKqRecordOracleDataSource3(4350);
    }

}
