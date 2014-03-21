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
        summaryDao.getFswxxSummary("2013-01-01", "2013-04-01", "姚尚东", 0, 15);
    }

    @Test
    public void testGetZbdbld() {
//        summaryDao.getZbdbldSummary("2013-08-11");
    }

    @Test
    public void testGetYdyhhz() {
//        summaryDao.getYdyhhzSummary("2013-01-01");
    }

    @Test
    public void testGetLdxjdb() {
//        summaryDao.getLdxjdbSummary("2013-01-01", "2014-01-01", "李");
    }

    @Test
    public void testGetYdswgphz() {
//        summaryDao.getYdswgphzSummary("2013-01-01");
    }

    @Test
    public void testGetRjxx() {
//        summaryDao.getRjxxSummary("2013-01-01", "2014-01-01", null);
    }

    @Test
    public void testGetSwxx() {
//        summaryDao.getSwxxSummary("2013-01-01", "2014-01-01", "刘");
    }

    @Test
    public void testGetYhfltj() {
//        summaryDao.getYhfltjcxSummary("2013-01-01", "2014-01-01", "掘进");
    }

    @Test
    public void testGetYhxxzhcx() {
//        summaryDao.getYhxxzhcxSummary("2013-01-01", "2014-01-01", "", "早班");
    }

    @Test
    public void testGetGsxx() {
//        summaryDao.getGsxxSummary("2014-01-01", "2014-03-01", "", "轻伤");
    }
}
