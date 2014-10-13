package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.YhcxManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;

/**
 * Created by lihe on 14/10/9.
 */
@Controller
@RequestMapping("/yhcx")
public class YhcxController extends BaseController {

    private YhcxManager yhcxManager;

    @Resource
    public void setYhcxManager(YhcxManager yhcxManager) {
        this.yhcxManager = yhcxManager;
    }

    @RequestMapping("/place/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterPlace(@PathVariable String deptNumber, @PathVariable String arg,
                                   @RequestParam String callback) {
        return new JSONPObject(callback, yhcxManager.filterPlaceOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/place/{arg}")
    @ResponseBody
    public JSONPObject filterPlace(@PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhcxManager.filterPlaceOracleDataSource3(arg));
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}/dept/{dept}/status/{status}/pcType/{pcType}/type/{type}/place/{place}/zgType/{zgType}/level/{level}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getYhcxData(@PathVariable String startDate, @PathVariable String endDate,
                                   @PathVariable String dept, @PathVariable String status,
                                   @PathVariable Integer pcType, @PathVariable Integer type,
                                   @PathVariable Integer place, @PathVariable String zgType,
                                   @PathVariable Integer level,
                                   @PathVariable Integer start, @PathVariable Integer limit,
                                   @RequestParam String callback, HttpSession session) throws ParseException {
        return new JSONPObject(callback, yhcxManager.getYhcxDataOracleDataSource3(startDate, endDate, dept, status, pcType, type, place, zgType, level, start, limit, session));
    }

}
