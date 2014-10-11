package com.ghtn.service.impl;

import com.ghtn.dao.GpcxDao;
import com.ghtn.service.GpcxManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.GpcxDetailVO;
import com.ghtn.vo.GpcxVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lihe on 14/10/10.
 */
@Service("gpcxManager")
public class GpcxManagerImpl extends GenericManagerImpl implements GpcxManager {

    private GpcxDao gpcxDao;

    @Autowired
    public GpcxManagerImpl(GpcxDao gpcxDao) {
        super(gpcxDao);
        this.gpcxDao = gpcxDao;
    }


    @Override
    public List<GpcxVO> getGpcxDataOracleDataSource3(String startDate, String endDate) {
        // 如果开始日期和结束日期都为空，默认开始日期为当前第一天，结束日期为当月最后一天
        if (StringUtil.isNullStr(startDate) && StringUtil.isNullStr(endDate)) {
            startDate = DateUtil.getFirst(new Date());
            endDate = DateUtil.getLast(new Date());
        }

        List<Object[]> list = gpcxDao.getGpcxData(startDate, endDate);
        List<GpcxVO> resultList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                GpcxVO vo = new GpcxVO();
                vo.setDeptNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setGpAll(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setGpYz(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setGpWz(StringUtil.processNullStr(String.valueOf(o[5])));
                resultList.add(vo);
            }
        }

        return resultList;
    }

    @Override
    public List<GpcxDetailVO> getGpcxDetailDataOracleDataSource3(String startDate, String endDate, String deptNumber, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        // 如果开始日期和结束日期都为空，默认开始日期为当前第一天，结束日期为当月最后一天
        if (StringUtil.isNullStr(startDate) && StringUtil.isNullStr(endDate)) {
            startDate = DateUtil.getFirst(new Date());
            endDate = DateUtil.getLast(new Date());
        }

        List<Object[]> list = gpcxDao.getGpcxDetailData(startDate, endDate, deptNumber, start, limit);
        List<GpcxDetailVO> resultList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                GpcxDetailVO vo = new GpcxDetailVO();
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setGppName(StringUtil.processNullStr(String.valueOf(o[1])));

                String gpDateStr = String.valueOf(o[2]);
                if (StringUtil.isNullStr(gpDateStr)) {
                    vo.setGpDate("");
                } else {
                    vo.setGpDate(DateUtil.dateToString(DateUtil.stringToDate(gpDateStr)));
                }

                vo.setZppName(StringUtil.processNullStr(String.valueOf(o[3])));

                String zpDateStr = String.valueOf(o[4]);
                if (StringUtil.isNullStr(zpDateStr)) {
                    vo.setZpDate("");
                } else {
                    vo.setZpDate(DateUtil.dateToString(DateUtil.stringToDate(zpDateStr)));
                }

                vo.setStatus(StringUtil.processNullStr(String.valueOf(o[5])));

                resultList.add(vo);
            }
        }

        return resultList;
    }
}
