package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.YhinputManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:32
 */
@Controller
@RequestMapping("/yhinput")
public class YhinputController extends BaseController {

    private YhinputManager yhinputManager;

    @Resource
    public void setYhinputManager(YhinputManager yhinputManager) {
        this.yhinputManager = yhinputManager;
    }

    @RequestMapping("/typeId/{typeId}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject listYhinput(@PathVariable("typeId") Integer typeId,
                                   @PathVariable("start") Integer start,
                                   @PathVariable("limit") Integer limit,
                                   @RequestParam String callback) {
        return new JSONPObject(callback, yhinputManager.listYhinputOracleDataSource3(typeId, start, limit));
    }

}
