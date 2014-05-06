package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SwxcQueryManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;

/**
 * User: Administrator
 * Date: 2014/5/6
 * Time: 9:51
 */
@Controller
@RequestMapping("/swxcQuery")
public class SwxcQueryController extends BaseController {

    private SwxcQueryManager swxcQueryManager;

    @Resource
    public void setSwxcQueryManager(SwxcQueryManager swxcQueryManager) {
        this.swxcQueryManager = swxcQueryManager;
    }

    @RequestMapping("/swxcList/{startDate}/{endDate}/{start}/{limit}")
    @ResponseBody
    public JSONPObject getSwxcList(@PathVariable String startDate, @PathVariable String endDate,
                                   @PathVariable int start, @PathVariable int limit, @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, swxcQueryManager.getSwxcListOracleDataSource3(startDate, endDate, start, limit));
    }
}
