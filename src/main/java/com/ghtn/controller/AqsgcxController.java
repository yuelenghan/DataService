package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.AqsgcxManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;

/**
 * Created by lihe on 14/10/13.
 */
@Controller
@RequestMapping("/aqsgcx")
public class AqsgcxController extends BaseController {

    private AqsgcxManager aqsgcxManager;

    @Resource
    public void setAqsgcxManager(AqsgcxManager aqsgcxManager) {
        this.aqsgcxManager = aqsgcxManager;
    }

    @RequestMapping("/startDate/{startDate}/endDate/{endDate}/dept/{dept}/xz/{xz}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getAqsgcxData(@PathVariable String startDate, @PathVariable String endDate,
                                     @PathVariable String dept, @PathVariable String xz,
                                     @PathVariable Integer start, @PathVariable Integer limit,
                                     @RequestParam String callback, HttpSession session) throws ParseException {
        return new JSONPObject(callback, aqsgcxManager.getAqsgcxDataOracleDataSource3(startDate, endDate, dept, xz, start, limit, session));
    }
}
