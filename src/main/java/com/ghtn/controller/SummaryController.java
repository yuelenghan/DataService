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
import java.text.ParseException;

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

    @RequestMapping("/rjxx/startDate/{startDate}/endDate/{endDate}/dept/{dept}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getRjxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String dept, @PathVariable Integer start, @PathVariable Integer limit,
                                      @RequestParam String callback) throws SQLException {
        return new JSONPObject(callback, summaryManager.getRjxxSummaryOracleDataSource3(startDate, endDate, dept, start, limit));
    }

    @RequestMapping("/dbjhb/date/{date}/banci/{banci}/name/{name}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getDbjhbSummary(@PathVariable String date, @PathVariable String banci,
                                       @PathVariable String name, @PathVariable Integer start, @PathVariable Integer limit,
                                       @RequestParam String callback) throws Exception {
        return new JSONPObject(callback, summaryManager.getDbjhbSummaryOracleDataSource3(date, banci, name, start, limit));
    }

    @RequestMapping("/gpxx/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getGpxxSummary(@PathVariable Integer start, @PathVariable Integer limit, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getGpxxSummaryOracleDataSource3(start, limit));
    }

    @RequestMapping("/fswxx/startDate/{startDate}/endDate/{endDate}/name/{name}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getFswxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                       @PathVariable Integer start, @PathVariable Integer limit,
                                       @PathVariable String name, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getFswxxSummaryOracleDataSource3(startDate, endDate, name, start, limit));
    }

    @RequestMapping("/zbdbld/date/{date}")
    @ResponseBody
    public JSONPObject getZbdbldSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getZbdbldSummaryOracleDataSource3(date));
    }

    @RequestMapping("/ydyhhz/date/{date}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getYdyhhzSummary(@PathVariable String date,
                                        @PathVariable Integer start, @PathVariable Integer limit,
                                        @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getYdyhhzSummaryOracleDataSource3(date, start, limit));
    }

    @RequestMapping("/ldxjdb/startDate/{startDate}/endDate/{endDate}/name/{name}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getLdxjdbSummary(@PathVariable String startDate, @PathVariable String endDate,
                                        @PathVariable String name,
                                        @PathVariable Integer start, @PathVariable Integer limit,
                                        @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getLdxjdbSummaryOracleDataSource3(startDate, endDate, name, start, limit));
    }

    @RequestMapping("/kzdkyh/date/{date}/mine/{mine}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getKzdkyhSummary(@PathVariable String date, @PathVariable String mine,
                                        @PathVariable Integer start, @PathVariable Integer limit,
                                        @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getKzdkyhSummaryOracleDataSource3(date, mine, start, limit));
    }

    @RequestMapping("/ydswgphz/date/{date}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getYdswgphzSummary(@PathVariable String date,
                                          @PathVariable Integer start, @PathVariable Integer limit,
                                          @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getYdswgphzSummaryOracleDataSource3(date, start, limit));
    }

    @RequestMapping("/swxx/startDate/{startDate}/endDate/{endDate}/dept/{dept}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getSwxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String dept,
                                      @PathVariable Integer start, @PathVariable Integer limit,
                                      @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getSwxxSummaryOracleDataSource3(startDate, endDate, dept, start, limit));
    }

    @RequestMapping("/yhfltjcx/startDate/{startDate}/endDate/{endDate}/unit/{unit}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getYhfltjcxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                          @PathVariable String unit,
                                          @PathVariable Integer start, @PathVariable Integer limit,
                                          @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getYhfltjcxSummaryOracleDataSource3(startDate, endDate, unit, start, limit));
    }

    @RequestMapping("/yhxxzhcx/startDate/{startDate}/endDate/{endDate}/unit/{unit}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getYhxxzhcxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                          @PathVariable String unit,
                                          @PathVariable Integer start, @PathVariable Integer limit,
                                          @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getYhxxzhcxSummaryOracleDataSource3(startDate, endDate, unit, start, limit));
    }

    @RequestMapping("/gsxx/startDate/{startDate}/endDate/{endDate}/unit/{unit}/level/{level}/name/{name}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getGsxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String unit, @PathVariable String level,
                                      @PathVariable String name,
                                      @PathVariable Integer start, @PathVariable Integer limit,
                                      @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getGsxxSummaryOracleDataSource3(startDate, endDate, unit, level, name, start, limit));
    }
}
