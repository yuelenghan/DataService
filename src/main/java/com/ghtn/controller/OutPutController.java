package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.OutPutManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;

/**
 * Created by lihe on 14/8/8.
 */
@Controller
@RequestMapping("/outPut")
public class OutPutController extends BaseController {

    private OutPutManager outPutManager;

    @Resource
    public void setOutPutManager(OutPutManager outPutManager) {
        this.outPutManager = outPutManager;
    }

    @RequestMapping("/{startDate}/{endDate}")
    @ResponseBody
    public JSONPObject getOutPutData(@PathVariable String startDate, @PathVariable String endDate, @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, outPutManager.getOutPutDataSqlServerDataSource6(startDate, endDate));
    }

}
