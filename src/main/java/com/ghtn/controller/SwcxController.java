package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SwcxManager;
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
@RequestMapping("/swcx")
public class SwcxController extends BaseController {

    private SwcxManager swcxManager;

    @Resource
    public void setSwcxManager(SwcxManager swcxManager) {
        this.swcxManager = swcxManager;
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}/dept/{dept}/name/{name}/type/{type}/level/{level}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getSwcxData(@PathVariable String startDate, @PathVariable String endDate,
                                   @PathVariable String dept, @PathVariable String name,
                                   @PathVariable Integer type, @PathVariable Integer level,
                                   @PathVariable Integer start, @PathVariable Integer limit,
                                   @RequestParam String callback, HttpSession session) throws ParseException {
        return new JSONPObject(callback, swcxManager.getSwcxDataOracleDataSource3(startDate, endDate, dept, name, type, level, start, limit, session));
    }
}
