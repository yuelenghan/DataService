package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.RydwManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

/**
 * User: Administrator
 * Date: 2014/3/21
 * Time: 9:09
 */
@Controller
@RequestMapping("/rydw")
public class RydwController extends BaseController {

    private RydwManager rydwManager;

    @Resource
    public void setRydwManager(RydwManager rydwManager) {
        this.rydwManager = rydwManager;
    }

    @RequestMapping("/inMinePeople/date/{date}/start/{start}/limit/{limit}")
    @ResponseBody
    public JSONPObject getInMinePeople(@PathVariable String date, @PathVariable Integer start, @PathVariable Integer limit,
                                       @RequestParam String callback, HttpSession session) throws SQLException {

        return new JSONPObject(callback, rydwManager.getInMinePeopleSqlServerDataSource4(date, session, start, limit));
    }
}
