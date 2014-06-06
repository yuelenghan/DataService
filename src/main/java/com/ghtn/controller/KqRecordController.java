package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.KqRecordManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;

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

    @RequestMapping("/{id}")
    @ResponseBody
    public JSONPObject getKqRecord(@PathVariable("id") Integer id, @RequestParam String callback) {
        return new JSONPObject(callback, kqRecordManager.getKqRecordOracleDataSource3(id));
    }

    @RequestMapping("/{key}/{mainDeptId}/{kqType}")
    @ResponseBody
    public JSONPObject insertKqRecord(@PathVariable String key, @PathVariable String mainDeptId,
                                      @PathVariable Integer kqType, @RequestParam String callback,
                                      HttpSession session) throws ParseException {
        return new JSONPObject(callback, kqRecordManager.insertKqRecordOracleDataSource3(key, mainDeptId, kqType, session));
    }

    @RequestMapping("/{personNumber}/{downTime}/{upTime}/{kqTime}/{kqBanci}/{kqType}/{kqDept}")
    @ResponseBody
    public JSONPObject insertKqRecord(@PathVariable String personNumber, @PathVariable String downTime,
                                      @PathVariable String upTime, @PathVariable String kqTime,
                                      @PathVariable String kqBanci, @PathVariable Integer kqType,
                                      @PathVariable String kqDept, @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback, kqRecordManager.insertKqRecordOracleDataSource3(personNumber, downTime, upTime, kqTime, kqBanci, kqType, kqDept));
    }
}
