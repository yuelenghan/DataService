package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.DepartmentManager;
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

    private DepartmentManager departmentManager;

    @Resource
    public void setDepartmentManager(DepartmentManager departmentManager) {
        this.departmentManager = departmentManager;
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

    @RequestMapping("/insertInfo/{yhyj}/{yhjb}/{yhlx}/{yhms}/{zrdw}/{zrr}/{pcdd}/{mxdd}/{pcsj}/{pcbc}/{pcry}/{pclx}/{zgfs}/{zgqx}/{zgbc}/{yhzy}/{mainDeptId}/{fineType}/{dwfk}/{grfk}/{rjid}")
    @ResponseBody
    public JSONPObject insertInfo(@PathVariable Integer yhyj, @PathVariable Integer yhjb, @PathVariable Integer yhlx,
                                  @PathVariable String yhms, @PathVariable String zrdw,
                                  @PathVariable String zrr, @PathVariable Integer pcdd, @PathVariable String mxdd,
                                  @PathVariable String pcsj, @PathVariable String pcbc, @PathVariable String pcry,
                                  @PathVariable Integer pclx, @PathVariable String zgfs, @PathVariable String zgqx,
                                  @PathVariable String zgbc, @PathVariable Integer yhzy, @PathVariable String mainDeptId,
                                  @PathVariable Integer fineType, @PathVariable Integer dwfk, @PathVariable Integer grfk,
                                  @PathVariable Integer rjid, @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback,
                yhEnterManager.insertInfoOracleDataSource3(yhyj, yhjb, yhlx, yhms,
                        zrdw, zrr, pcdd, mxdd, pcsj, pcbc, pcry, pclx, zgfs,
                        zgqx, zgbc, yhzy, mainDeptId, fineType, dwfk, grfk, rjid)
        );
    }

    @RequestMapping("/yhBasis/deptNumber/{deptNumber}/{yhyjLevel}/{yhyjType}/{yhyjText}")
    @ResponseBody
    public JSONPObject filterYhBasis(@PathVariable String deptNumber, @PathVariable String yhyjLevel,
                                     @PathVariable String yhyjType, @PathVariable String yhyjText,
                                     @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, yhEnterManager.filterYhBasisOracleDataSource3(deptNumber, yhyjLevel, yhyjType, yhyjText, session));
    }

    @RequestMapping("/hazard/deptNumber/{deptNumber}/{wxyLevel}/{wxyText}")
    @ResponseBody
    public JSONPObject filterHazard(@PathVariable String deptNumber, @PathVariable String wxyLevel,
                                    @PathVariable String wxyText, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterHazardOracleDataSource3(deptNumber, wxyLevel, wxyText));
    }

    @RequestMapping("/place/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterPlace(@PathVariable String deptNumber, @PathVariable String arg,
                                   @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterPlaceOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/department")
    @ResponseBody
    public JSONPObject getAllDepartment(@RequestParam String callback) {
        return new JSONPObject(callback, departmentManager.getAllDeptOracleDataSource3());
    }

    @RequestMapping("/zrdw/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterZrdw(@PathVariable String deptNumber, @PathVariable String arg,
                                  @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterZrdwOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/zrr/deptId/{deptId}/{arg}")
    @ResponseBody
    public JSONPObject filterZrr(@PathVariable String deptId, @PathVariable String arg,
                                 @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterZrrOracleDataSource3(deptId, arg));
    }
}
