package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SwinputManager;
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
@RequestMapping("/swinput")
public class SwinputController extends BaseController {

    private SwinputManager swinputManager;

    @Resource
    public void setSwinputManager(SwinputManager swinputManager) {
        this.swinputManager = swinputManager;
    }

    @RequestMapping("/typeId/{typeId}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject listSwinput(@PathVariable("typeId") Integer typeId,
                                   @PathVariable("start") Integer start,
                                   @PathVariable("limit") Integer limit,
                                   @RequestParam String callback) {
        return new JSONPObject(callback, swinputManager.listSwinputOracleDataSource3(typeId, start, limit));
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public JSONPObject getSwinput(@PathVariable("id") Integer id, @RequestParam String callback) {
        return new JSONPObject(callback, swinputManager.getSwinputOracleDataSource3(id));
    }
}
