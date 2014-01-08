package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.KqRecordManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午5:40
 */
@Controller
@RequestMapping("/kqRecord")
public class KqRecordController extends BaseController {

    private KqRecordManager kqRecordManager;

    @Resource
    public void setKqRecordManager(KqRecordManager kqRecordManager) {
        this.kqRecordManager = kqRecordManager;
    }

    @RequestMapping("/typeId/{typeId}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject listKqRecord(@PathVariable("typeId") Integer typeId,
                                    @PathVariable("start") Integer start,
                                    @PathVariable("limit") Integer limit,
                                    @RequestParam String callback) {
        return new JSONPObject(callback, kqRecordManager.listKqRecordOracleDataSource3(typeId, start, limit));
    }
}
