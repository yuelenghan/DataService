package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.GpcxManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;

/**
 * Created by lihe on 14/10/10.
 */
@Controller
@RequestMapping("/gpcx")
public class GpcxController extends BaseController {

    private GpcxManager gpcxManager;

    @Resource
    public void setGpcxManager(GpcxManager gpcxManager) {
        this.gpcxManager = gpcxManager;
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}")
    @ResponseBody
    public JSONPObject getGpcxData(@PathVariable String startDate, @PathVariable String endDate,
                                   @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, gpcxManager.getGpcxDataOracleDataSource3(startDate, endDate));
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}/dept/{dept}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getGpcxData(@PathVariable String startDate, @PathVariable String endDate,
                                   @PathVariable String dept, @PathVariable Integer start,
                                   @PathVariable Integer limit,
                                   @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, gpcxManager.getGpcxDetailDataOracleDataSource3(startDate, endDate, dept, start, limit));
    }
}
