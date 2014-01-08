package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.vo.YhinputVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 上午11:09
 */
public class YhinputManagerTest extends BaseTestCase {

    private YhinputManager yhinputManager;

    @Resource
    public void setYhinputManager(YhinputManager yhinputManager) {
        this.yhinputManager = yhinputManager;
    }

    @Test
    public void testGet() throws Exception {
        List<YhinputVO> list = yhinputManager.listYhinputOracleDataSource3(146, 0, 15);
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }
    }
}
