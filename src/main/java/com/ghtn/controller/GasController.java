package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.GasManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lihe on 14/8/8.
 */
@Controller
@RequestMapping("/gas")
public class GasController extends BaseController {

    private GasManager gasManager;

    @Resource
    public void setGasManager(GasManager gasManager) {
        this.gasManager = gasManager;
    }

    @RequestMapping("/{deptName}/{type}/{start}/{limit}")
    @ResponseBody
    public JSONPObject getWsData(@PathVariable String deptName, @PathVariable String type,
                                 @PathVariable int start, @PathVariable int limit,
                                 @RequestParam String callback) {
        return new JSONPObject(callback, gasManager.getWsDataSqlServerDataSource7(deptName, type, start, limit));
    }

    @RequestMapping("/CO/{deptName}/{start}/{limit}")
    @ResponseBody
    public JSONPObject getCOData(@PathVariable String deptName, @PathVariable int start,
                                 @PathVariable int limit, @RequestParam String callback) {
        return new JSONPObject(callback, gasManager.getCODataSqlServerDataSource7(deptName, start, limit));
    }

    @RequestMapping("/equip/{deptName}/{start}/{limit}")
    @ResponseBody
    public JSONPObject getEquipData(@PathVariable String deptName, @PathVariable int start,
                                    @PathVariable int limit, @RequestParam String callback) {
        return new JSONPObject(callback, gasManager.getEquipDataSqlServerDataSource7(deptName, start, limit));
    }

}
