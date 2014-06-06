package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.IrisManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;

/**
 * Created by lihe on 14-6-5.
 */
@Controller
@RequestMapping("/iris")
public class IrisController extends BaseController {

    private IrisManager irisManager;

    @Resource
    public void setIrisManager(IrisManager irisManager) {
        this.irisManager = irisManager;
    }

    @RequestMapping("/{personNumber}")
    @ResponseBody
    public JSONPObject getIrisData(@PathVariable String personNumber, @RequestParam String callback,
                                   HttpSession session) throws ParseException {
        return new JSONPObject(callback, irisManager.getIrisDataMysqlDataSource5(personNumber, session));
    }
}
