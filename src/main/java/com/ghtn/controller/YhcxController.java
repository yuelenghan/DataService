package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.YhcxManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

}
