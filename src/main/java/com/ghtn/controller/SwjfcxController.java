package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SwjfcxManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;

/**
 * Created by lihe on 14/10/10.
 */
@Controller
@RequestMapping("/swjfcx")
public class SwjfcxController extends BaseController {

    private SwjfcxManager swjfcxManager;

    @Resource
    public void setSwjfcxManager(SwjfcxManager swjfcxManager) {
        this.swjfcxManager = swjfcxManager;
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}/dept/{dept}/name/{name}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getSwcxData(@PathVariable String startDate, @PathVariable String endDate,
                                   @PathVariable String dept, @PathVariable String name,
                                   @PathVariable Integer start, @PathVariable Integer limit,
                                   @RequestParam String callback, HttpSession session) throws ParseException {
        return new JSONPObject(callback, swjfcxManager.getSwjfcxDataOracleDataSource3(startDate, endDate, dept, name, start, limit, session));
    }

}
