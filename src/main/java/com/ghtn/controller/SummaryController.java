package com.ghtn.controller;

import com.ghtn.service.SummaryManager;
import com.ghtn.vo.RjxxSummaryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 下午4:26
 */
@Controller
@RequestMapping("/summary")
public class SummaryController extends BaseController {

    private SummaryManager summaryManager;

    @Resource
    public void setSummaryManager(SummaryManager summaryManager) {
        this.summaryManager = summaryManager;
    }

    @RequestMapping("/rjxx/beginDate/{beginDate}/endDate/{endDate}/dwid/{dwid}/zwjb/{zwjb}")
    @ResponseBody
    public List<RjxxSummaryVO> getRjxxSummary(@PathVariable String beginDate, @PathVariable String endDate,
                                              @PathVariable String dwid, @PathVariable String zwjb) throws SQLException {
        return summaryManager.getRjxxSummaryOracleDataSource3(beginDate, endDate, dwid, zwjb);
    }

}
