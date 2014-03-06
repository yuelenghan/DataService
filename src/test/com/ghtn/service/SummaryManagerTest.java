package com.ghtn.service;

import com.ghtn.BaseTestCase;
import org.junit.Test;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午11:14
 */
public class SummaryManagerTest extends BaseTestCase {

    private SummaryManager summaryManager;

    @Resource
    public void setSummaryManager(SummaryManager summaryManager) {
        this.summaryManager = summaryManager;
    }

    @Test
    public void testRjxx() throws SQLException {
        List list = summaryManager.getRjxxSummaryOracleDataSource3("", "", "", "");
    }

    @Test
    public void testDbjhb() throws Exception {
        List list = summaryManager.getDbjhbSummaryOracleDataSource3("2013-8-1", "早班", "桂久超");
        if (list != null && list.size() > 0)
            System.out.println(list.size());
    }

    @Test
    public void testGpxx() {
        List list = summaryManager.getGpxxSummaryOracleDataSource3();
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }
        List list2 = summaryManager.getGpxxSummaryOracleDataSource3();
        if (list2 != null && list2.size() > 0) {
            System.out.println(list2.size());
        }
    }

    @Test
    public void testFswxx() {
        summaryManager.getFswxxSummaryOracleDataSource3("", "", "");
    }

    @Test
    public void testZbdbld() {
        summaryManager.getZbdbldSummaryOracleDataSource3("2013-08-11");
    }

    @Test
    public void testYdyhhz() {
        summaryManager.getYdyhhzSummaryOracleDataSource3("2013-01-01");
    }
}
