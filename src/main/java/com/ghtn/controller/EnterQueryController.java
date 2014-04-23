package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.EnterQueryManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:39
 */
@Controller
@RequestMapping("/enterQuery")
public class EnterQueryController extends BaseController {

    private EnterQueryManager enterQueryManager;

    @Resource
    public void setEnterQueryManager(EnterQueryManager enterQueryManager) {
        this.enterQueryManager = enterQueryManager;
    }

    @RequestMapping("/yhEnter/{inputPersonId}/{banci}/{levelId}/{typeId}")
    @ResponseBody
    public JSONPObject queryYhEnter(@PathVariable String inputPersonId, @PathVariable String banci,
                                    @PathVariable String levelId, @PathVariable String typeId,
                                    @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, enterQueryManager.queryYhEnterOracleDataSource3(inputPersonId, banci, levelId, typeId));
    }

    @RequestMapping("/swEnter/{inputPersonId}/{banci}/{levelId}/{typeId}")
    @ResponseBody
    public JSONPObject querySwEnter(@PathVariable String inputPersonId, @PathVariable String banci,
                                    @PathVariable String levelId, @PathVariable String typeId,
                                    @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, enterQueryManager.querySwEnterOracleDataSource3(inputPersonId, banci, levelId, typeId));
    }

}
