package com.ghtn.controller;

import com.ghtn.service.YhinputManager;
import com.ghtn.vo.YhinputVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:32
 */
@Controller
@RequestMapping("/yhinput")
public class YhinputController extends BaseController {

    private YhinputManager yhinputManager;

    @Resource
    public void setYhinputManager(YhinputManager yhinputManager) {
        this.yhinputManager = yhinputManager;
    }

    @RequestMapping("/typeId/{typeId}/start/{start}/limit/{limit}")
    @ResponseBody
    public List<YhinputVO> listYhinput(@PathVariable("typeId") Integer typeId,
                                       @PathVariable("start") Integer start,
                                       @PathVariable("limit") Integer limit) {
        return yhinputManager.listYhinputOracleDataSource3(typeId, start, limit);
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public YhinputVO getYhinput(@PathVariable("id") Integer id) {
        return yhinputManager.getYhinputOracleDataSource3(id);
    }

}
