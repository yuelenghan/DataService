package com.ghtn.controller;

import com.ghtn.service.KqRecordManager;
import com.ghtn.vo.KqRecordVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午5:40
 */
@Controller
@RequestMapping("/kqRecord")
public class KqRecordController extends BaseController {

    private KqRecordManager kqRecordManager;

    @Resource
    public void setKqRecordManager(KqRecordManager kqRecordManager) {
        this.kqRecordManager = kqRecordManager;
    }

    @RequestMapping("/typeId/{typeId}")
    @ResponseBody
    public List<KqRecordVO> listKqRecord(@PathVariable("typeId") Integer typeId) {
        return kqRecordManager.listKqRecordOracleDataSource3(typeId);
    }
}
