package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.AqgkManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lihe on 14-5-22.
 */
@Controller
@RequestMapping("/aqgk")
public class AqgkController extends BaseController {

    private AqgkManager aqgkManager;

    @Resource
    public void setAqgkManager(AqgkManager aqgkManager) {
        this.aqgkManager = aqgkManager;
    }

    @RequestMapping("/{date}")
    @ResponseBody
    public JSONPObject getYdyhhzSummary(@PathVariable String date, @RequestParam String callback) {
        return new JSONPObject(callback, aqgkManager.getAqgkOracleDataSource3(date));
    }

}
