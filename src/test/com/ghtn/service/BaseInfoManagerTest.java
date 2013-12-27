package com.ghtn.service;

import com.ghtn.BaseTestCase;
import com.ghtn.vo.BaseInfoVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:10
 */
public class BaseInfoManagerTest extends BaseTestCase {

    private BaseInfoManager baseInfoManager;

    @Resource
    public void setBaseInfoManager(BaseInfoManager baseInfoManager) {
        this.baseInfoManager = baseInfoManager;
    }

    @Test
    public void testGet() throws Exception {
        List<BaseInfoVO> list = baseInfoManager.listBaseInfoOracleDataSource3();
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }
    }
}
