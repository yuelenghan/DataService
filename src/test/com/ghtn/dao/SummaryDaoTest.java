package com.ghtn.dao;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午11:04
 */
public class SummaryDaoTest extends BaseTestCase {

    private SummaryDao summaryDao;

    @Resource
    public void setSummaryDao(SummaryDao summaryDao) {
        this.summaryDao = summaryDao;
    }

    @Test
    public void testGet() {

    }
}
