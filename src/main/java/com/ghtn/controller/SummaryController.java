package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SummaryManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 下午4:26
 */
@Controller
@RequestMapping("/summary")
public class SummaryController extends BaseController {

    private SummaryManager summaryManager;

    @Resource
    public void setSummaryManager(SummaryManager summaryManager) {
        this.summaryManager = summaryManager;
    }

    @RequestMapping("/rjxx/beginDate/{beginDate}/endDate/{endDate}/dwid/{dwid}/zwjb/{zwjb}")
    @ResponseBody
    public JSONPObject getRjxxSummary(@PathVariable String beginDate, @PathVariable String endDate,
                                      @PathVariable String dwid, @PathVariable String zwjb,
                                      @RequestParam String callback) throws SQLException {
        return new JSONPObject(callback, summaryManager.getRjxxSummaryOracleDataSource3(beginDate, endDate, dwid, zwjb));
    }

    @RequestMapping("/dbjhb/date/{date}/banci/{banci}/name/{name}")
    public JSONPObject getDbjhbSummary(@PathVariable String date, @PathVariable String banci, @PathVariable String name, @RequestParam String callback) {

    }
}
