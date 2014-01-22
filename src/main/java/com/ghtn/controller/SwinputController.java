package com.ghtn.controller;

import com.ghtn.service.SwinputManager;
import com.ghtn.vo.SwinputVO;
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
@RequestMapping("/swinput")
public class SwinputController extends BaseController {

    private SwinputManager swinputManager;

    @Resource
    public void setSwinputManager(SwinputManager swinputManager) {
        this.swinputManager = swinputManager;
    }

    @RequestMapping("/typeId/{typeId}/start/{start}/limit/{limit}")
    @ResponseBody
    public List<SwinputVO> listSwinput(@PathVariable("typeId") Integer typeId,
                                       @PathVariable("start") Integer start,
                                       @PathVariable("limit") Integer limit) {
        return swinputManager.listSwinputOracleDataSource3(typeId, start, limit);
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public SwinputVO getSwinput(@PathVariable("id") Integer id) {
        return swinputManager.getSwinputOracleDataSource3(id);
    }
}
