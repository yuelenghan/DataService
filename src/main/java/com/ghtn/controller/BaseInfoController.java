package com.ghtn.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ghtn.service.BaseInfoManager;
import com.ghtn.vo.BaseInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:32
 */
@Controller
@RequestMapping("/baseInfo")
public class BaseInfoController {

    private BaseInfoManager baseInfoManager;

    @Resource
    public void setBaseInfoManager(BaseInfoManager baseInfoManager) {
        this.baseInfoManager = baseInfoManager;
    }

    @RequestMapping
    @ResponseBody
    public JSONPObject listBaseInfo(@RequestParam String callback) {
        return new JSONPObject(callback, baseInfoManager.listBaseInfoOracleDataSource3());
    }

    @RequestMapping("/{fid}")
    @ResponseBody
    public List<BaseInfoVO> listBaseInfoByFid(@PathVariable Integer fid) {
        return baseInfoManager.listBaseInfoByFidOracleDataSource3(fid);
    }
}
