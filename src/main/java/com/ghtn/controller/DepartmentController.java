package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.DepartmentManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lihe on 14/9/26.
 */
@Controller
@RequestMapping("/department")
public class DepartmentController extends BaseController {

    private DepartmentManager departmentManager;

    @Resource
    public void setDepartmentManager(DepartmentManager departmentManager) {
        this.departmentManager = departmentManager;
    }

    @RequestMapping("/{deptNumber}")
    @ResponseBody
    public JSONPObject getChildDept(@PathVariable String deptNumber, @RequestParam String callback, HttpSession session) {
        return new JSONPObject(callback, departmentManager.getChildDeptOracleDataSource3(deptNumber, session));
    }

}
