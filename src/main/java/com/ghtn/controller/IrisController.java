package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.IrisManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lihe on 14-6-5.
 */
@Controller
@RequestMapping("/iris")
public class IrisController extends BaseController {

    private IrisManager irisManager;

    private static Log log = LogFactory.getLog(IrisController.class);

    @Resource
    public void setIrisManager(IrisManager irisManager) {
        this.irisManager = irisManager;
    }

    @RequestMapping("/{personNumber}")
    @ResponseBody
    public JSONPObject getIrisData(@PathVariable String personNumber, @RequestParam String callback,
                                   HttpSession session) {
        try {
            return new JSONPObject(callback, irisManager.getIrisDataMysqlDataSource5(personNumber, session));
        } catch (Exception e) {
            log.error("Message : " + e.getMessage());
            log.error("Caused by : " + e.getCause());
            return new JSONPObject(callback, null);
        }
    }
}
