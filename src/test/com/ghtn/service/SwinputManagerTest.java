package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.vo.SwinputVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午4:18
 */
public class SwinputManagerTest extends BaseTestCase {

    private SwinputManager swinputManager;

    @Resource
    public void setSwinputManager(SwinputManager swinputManager) {
        this.swinputManager = swinputManager;
    }

    @Test
    public void testGet() throws Exception {
        List<SwinputVO> list = swinputManager.listSwinputOracleDataSource3(103);
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }
    }
}
