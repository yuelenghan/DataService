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

    @RequestMapping("/person/{deptId}/{shortName}")
    @ResponseBody
    public JSONPObject getPerson(@PathVariable String deptId, @PathVariable String shortName,
                                 @RequestParam String callback) {
        return new JSONPObject(callback, swEnterManager.getPersonOracleDataSource3(shortName, deptId));
    }

    @RequestMapping("/insertInfo/{swyj}/{swxz}/{swlx}/{swzy}/{swms}/{swry}/{pcry}/{pcdd}/{mxdd}/{pcsj}/{pcbc}/{jcfs}/{mainDeptId}/{dwjf}/{dwjfValue}/{dwfk}/{dwfkValue}/{grjf}/{grjfValue}/{grfk}/{grfkValue}/{jbxx}/{jbxxValue}/{dismiss}")
    @ResponseBody
    public JSONPObject insertInfo(@PathVariable Integer swyj, @PathVariable Integer swxz, @PathVariable Integer swlx,
                                  @PathVariable Integer swzy, @PathVariable String swms,
                                  @PathVariable String swry, @PathVariable String pcry, @PathVariable Integer pcdd,
                                  @PathVariable String mxdd, @PathVariable String pcsj, @PathVariable String pcbc,
                                  @PathVariable Integer jcfs, @PathVariable String mainDeptId,
                                  @PathVariable boolean dwjf, @PathVariable Integer dwjfValue,
                                  @PathVariable boolean dwfk, @PathVariable Integer dwfkValue,
                                  @PathVariable boolean grjf, @PathVariable Integer grjfValue,
                                  @PathVariable boolean grfk, @PathVariable Integer grfkValue,
                                  @PathVariable boolean jbxx, @PathVariable Integer jbxxValue,
                                  @PathVariable boolean dismiss,
                                  @RequestParam String callback) throws ParseException {
        return new JSONPObject(callback,
                swEnterManager.insertInfoOracleDataSource3(swyj, swxz, swlx, swzy, swms,
                        swry, pcry, pcdd, mxdd, pcsj, pcbc, jcfs, mainDeptId,
                        dwjf, dwjfValue, dwfk, dwfkValue, grjf, grjfValue, grfk, grfkValue,
                        jbxx, jbxxValue, dismiss)
        );
    }

    @RequestMapping("/swBasis/deptNumber/{deptNumber}/{swyjLevel}/{swyjText}")
    @ResponseBody
    public JSONPObject filterSwBasis(@PathVariable String deptNumber, @PathVariable String swyjLevel,
                                     @PathVariable String swyjText, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, swEnterManager.filterSwBasisOracleDataSource3(deptNumber, swyjLevel, swyjText, session));
    }

    @RequestMapping("/hazard/deptNumber/{deptNumber}/{wxyLevel}/{wxyText}")
    @ResponseBody
    public JSONPObject filterHazard(@PathVariable String deptNumber, @PathVariable String wxyLevel,
                                    @PathVariable String wxyText, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterHazardOracleDataSource3(deptNumber, wxyLevel, wxyText));
    }

    @RequestMapping("/place/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterPlace(@PathVariable String deptNumber, @PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterPlaceOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/zrdw/deptNumber/{deptNumber}/{arg}")
    @ResponseBody
    public JSONPObject filterZrdw(@PathVariable String deptNumber, @PathVariable String arg, @RequestParam String callback) {
        return new JSONPObject(callback, yhEnterManager.filterPlaceOracleDataSource3(deptNumber, arg));
    }

    @RequestMapping("/department/{mainDeptId}")
    @ResponseBody
    public JSONPObject getDepartment(@PathVariable String mainDeptId, @RequestParam String callback) {
        return new JSONPObject(callback, swEnterManager.filterDepartmentOracleDataSource3(mainDeptId));
    }

    @RequestMapping("/fineSet/{levelId}/{jcType}/{mainDeptId}")
    @ResponseBody
    public JSONPObject getSwFineSet(@PathVariable Integer levelId, @PathVariable Integer jcType,
                                    @PathVariable String mainDeptId, @RequestParam String callback) {
        return new JSONPObject(callback, swEnterManager.getSwFineSetOracleDataSource3(levelId, jcType, mainDeptId));
    }
}
