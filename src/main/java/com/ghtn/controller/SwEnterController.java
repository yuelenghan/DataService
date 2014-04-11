package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.SwEnterManager;
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
 * Date: 2014/4/10
 * Time: 9:46
 */
@Controller
@RequestMapping("/swEnter")
public class SwEnterController {

    private SwEnterManager swEnterManager;

    @Resource
    public void setSwEnterManager(SwEnterManager swEnterManager) {
        this.swEnterManager = swEnterManager;
    }

    private YhEnterManager yhEnterManager;

    @Resource
    public void setYhEnterManager(YhEnterManager yhEnterManager) {
        this.yhEnterManager = yhEnterManager;
    }

    @RequestMapping("/swBasis/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getSwBasis(@PathVariable String deptNumber, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, swEnterManager.getSwBasisOracleDataSource3(deptNumber, session));
    }

    @RequestMapping("/swBasisLevel/{swid}")
    @ResponseBody
    public JSONPObject getSwBasisLevel(@PathVariable String swid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, swEnterManager.getSwBasisLevelOracleDataSource3(swid, session));
    }

    @RequestMapping("/swBasisType/{swid}")
    @ResponseBody
    public JSONPObject getYhBasisType(@PathVariable String swid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, swEnterManager.getSwBasisTypeOracleDataSource3(swid, session));
    }

    @RequestMapping("/hazard/deptNumber/{deptNumber}")
    @ResponseBody
    public JSONPObject getHazard(@PathVariable String deptNumber, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.getHazardOracleDataSource3(deptNumber));
    }

    @RequestMapping("/basisHazard/{swid}")
    @ResponseBody
    public JSONPObject getBasisHazard(@PathVariable String swid, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, swEnterManager.getBasisHazardOracleDataSource3(swid, session));
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

    @RequestMapping("/person/{mainDeptId}/{shortName}")
    @ResponseBody
    public JSONPObject getPerson(@PathVariable String mainDeptId, @PathVariable String shortName,
                                 @RequestParam String callback) {
        return new JSONPObject(callback, swEnterManager.getPersonOracleDataSource3(shortName, mainDeptId));
    }

    @RequestMapping("/insertInfo/{swyj}/{swxz}/{swlx}/{swzy}/{wxy}/{swms}/{swry}/{pcry}/{pcdd}/{mxdd}/{pcsj}/{pcbc}/{jcfs}/{mainDeptId}")
    @ResponseBody
    public JSONPObject insertInfo(@PathVariable Integer swyj, @PathVariable Integer swxz, @PathVariable Integer swlx,
                                  @PathVariable Integer swzy, @PathVariable String wxy, @PathVariable String swms,
                                  @PathVariable String swry, @PathVariable String pcry, @PathVariable Integer pcdd,
                                  @PathVariable String mxdd, @PathVariable String pcsj, @PathVariable String pcbc,
                                  @PathVariable Integer jcfs, @PathVariable String mainDeptId,
                                  @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback,
                swEnterManager.insertInfoOracleDataSource3(swyj, swxz, swlx, swzy, wxy, swms,
                        swry, pcry, pcdd, mxdd, pcsj, pcbc, jcfs, mainDeptId)
        );
    }
}
