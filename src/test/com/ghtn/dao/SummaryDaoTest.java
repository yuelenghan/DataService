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

    @Test
    public void testGetFswxx() {
        summaryDao.getFswxxSummary("2013-01-01", "2013-04-01", "姚尚东");
    }

    @Test
    public void testGetZbdbld() {
        summaryDao.getZbdbldSummary("2013-08-11");
    }

    @Test
    public void testGetYdyhhz() {
        summaryDao.getYdyhhzSummary("2013-01-01");
    }
}
