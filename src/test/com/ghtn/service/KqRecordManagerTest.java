package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.vo.KqRecordVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

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
        List<KqRecordVO> list = kqRecordManager.listKqRecordOracleDataSource3(2, 0, 15);
        if (list != null && list.size() > 0) {
            for (KqRecordVO vo : list) {
                System.out.println(vo.getKqpname());
            }
        }
    }
}
