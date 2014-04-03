package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.YhEnterManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:38
 */
@Controller
@RequestMapping("/yhEnter")
public class YhEnterController extends BaseController {

    private YhEnterManager yhEnterManager;

    @Resource
    public void setYhEnterManager(YhEnterManager yhEnterManager) {
        this.yhEnterManager = yhEnterManager;
    }

    @RequestMapping("/yhBasis/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getYhBasis(@PathVariable String deptNumber, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, yhEnterManager.getYhBasisOracleDataSource3(deptNumber, session));
    }

    @RequestMapping("/yhBasisLevel/{yhid}")
    @ResponseBody
    public JSONPObject getYhBasisLevel(@PathVariable String yhid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, yhEnterManager.getYhBasisLevelOracleDataSource3(yhid, session));
    }

    @RequestMapping("/yhBasisType/{yhid}")
    @ResponseBody
    public JSONPObject getYhBasisType(@PathVariable String yhid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, yhEnterManager.getYhBasisTypeOracleDataSource3(yhid, session));
    }

    @RequestMapping("/hazard/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getHazard(@PathVariable String deptNumber, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.getHazardOracleDataSource3(deptNumber));
    }

    @RequestMapping("/basisHazard/{yhid}")
    @ResponseBody
    public JSONPObject getBasisHazard(@PathVariable String yhid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, yhEnterManager.getBasisHazardOracleDataSource3(yhid, session));
    }

    @RequestMapping("/zrdw/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getZrdw(@PathVariable String deptNumber, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.getZrdwOracleDataSource3(deptNumber));
    }

    @RequestMapping("/zrr/deptId/{deptId}")
    @ResponseBody
    public JSONPObject getZrr(@PathVariable String deptId, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.getZrrOracleDataSource3(deptId));
    }

    @RequestMapping("/place/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getPlace(@PathVariable String deptNumber, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.getPlaceOracleDataSource3(deptNumber));
    }

    @RequestMapping("/pcPerson")
    @ResponseBody
    public JSONPObject getPcPerson(@RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, session.getAttribute("user"));
    }
}
