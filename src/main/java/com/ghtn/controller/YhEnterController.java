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
import java.text.ParseException;

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

    @RequestMapping("/insertInfo/{yhyj}/{yhjb}/{yhlx}/{wxy}/{yhms}/{zrdw}/{zrr}/{pcdd}/{mxdd}/{pcsj}/{pcbc}/{pcry}/{pclx}/{zgfs}/{zgqx}/{zgbc}/{yhzy}/{mainDeptId}")
    @ResponseBody
    public JSONPObject insertInfo(@PathVariable Integer yhyj, @PathVariable Integer yhjb, @PathVariable String yhlx,
                                  @PathVariable String wxy, @PathVariable String yhms, @PathVariable String zrdw,
                                  @PathVariable String zrr, @PathVariable Integer pcdd, @PathVariable String mxdd,
                                  @PathVariable String pcsj, @PathVariable String pcbc, @PathVariable String pcry,
                                  @PathVariable Integer pclx, @PathVariable String zgfs, @PathVariable String zgqx,
                                  @PathVariable String zgbc, @PathVariable Integer yhzy, @PathVariable String mainDeptId,
                                  @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback,
                yhEnterManager.insertInfoOracleDataSource3(yhyj, yhjb, yhlx, wxy, yhms,
                        zrdw, zrr, pcdd, mxdd, pcsj, pcbc, pcry, pclx, zgfs,
                        zgqx, zgbc, yhzy, mainDeptId)
        );
    }

    @RequestMapping("/yhBasis/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterYhBasis(@PathVariable String deptNumber, @PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterYhBasisOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/hazard/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterHazard(@PathVariable String deptNumber, @PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterHazardOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/place/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterPlace(@PathVariable String deptNumber, @PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterPlaceOracleDataSource3(deptNumber, arg));
    }
}
