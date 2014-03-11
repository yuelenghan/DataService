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

    @RequestMapping("/rjxx/startDate/{startDate}/endDate/{endDate}/name/{name}")
    @ResponseBody
    public JSONPObject getRjxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String name,
                                      @RequestParam String callback) throws SQLException {
        return new JSONPObject(callback, summaryManager.getRjxxSummaryOracleDataSource3(startDate, endDate, name));
    }

    @RequestMapping("/dbjhb/date/{date}/banci/{banci}/name/{name}")
    @ResponseBody
    public JSONPObject getDbjhbSummary(@PathVariable String date, @PathVariable String banci,
                                       @PathVariable String name, @RequestParam String callback) throws Exception {
        return new JSONPObject(callback, summaryManager.getDbjhbSummaryOracleDataSource3(date, banci, name));
    }

    @RequestMapping("/gpxx")
    @ResponseBody
    public JSONPObject getGpxxSummary(@RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getGpxxSummaryOracleDataSource3());
    }

    @RequestMapping("/fswxx/startDate/{startDate}/endDate/{endDate}/name/{name}")
    @ResponseBody
    public JSONPObject getFswxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                       @PathVariable String name, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getFswxxSummaryOracleDataSource3(startDate, endDate, name));
    }

    @RequestMapping("/zbdbld/date/{date}")
    @ResponseBody
    public JSONPObject getZbdbldSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getZbdbldSummaryOracleDataSource3(date));
    }

    @RequestMapping("/ydyhhz/date/{date}")
    @ResponseBody
    public JSONPObject getYdyhhzSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getYdyhhzSummaryOracleDataSource3(date));
    }

    @RequestMapping("/ldxjdb/startDate/{startDate}/endDate/{endDate}/name/{name}")
    @ResponseBody
    public JSONPObject getLdxjdbSummary(@PathVariable String startDate, @PathVariable String endDate,
                                        @PathVariable String name, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getLdxjdbSummaryOracleDataSource3(startDate, endDate, name));
    }

    @RequestMapping("/kzdkyh/date/{date}")
    @ResponseBody
    public JSONPObject getKzdkyhSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getKzdkyhSummaryOracleDataSource3(date));
    }

    @RequestMapping("/ydswgphz/date/{date}")
    @ResponseBody
    public JSONPObject getYdswgphzSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, summaryManager.getYdswgphzSummaryOracleDataSource3(date));
    }

    @RequestMapping("/swxx/startDate/{startDate}/endDate/{endDate}/name/{name}")
    @ResponseBody
    public JSONPObject getSwxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String name,
                                      @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getSwxxSummaryOracleDataSource3(startDate, endDate, name));
    }

    @RequestMapping("/yhfltjcx/startDate/{startDate}/endDate/{endDate}/unit/{unit}")
    @ResponseBody
    public JSONPObject getYhfltjcxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                          @PathVariable String unit,
                                          @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getYhfltjcxSummaryOracleDataSource3(startDate, endDate, unit));
    }

    @RequestMapping("/yhxxzhcx/startDate/{startDate}/endDate/{endDate}/unit/{unit}/banci/{banci}")
    @ResponseBody
    public JSONPObject getYhxxzhcxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                          @PathVariable String unit, @PathVariable String banci,
                                          @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getYhxxzhcxSummaryOracleDataSource3(startDate, endDate, unit, banci));
    }

    @RequestMapping("/gsxx/startDate/{startDate}/endDate/{endDate}/unit/{unit}/level/{level}/name/{name}")
    @ResponseBody
    public JSONPObject getGsxxSummary(@PathVariable String startDate, @PathVariable String endDate,
                                      @PathVariable String unit, @PathVariable String level,
                                      @PathVariable String name,
                                      @RequestParam String callback) throws SQLException, ParseException {
        return new JSONPObject(callback, summaryManager.getGsxxSummaryOracleDataSource3(startDate, endDate, unit, level, name));
    }
}
