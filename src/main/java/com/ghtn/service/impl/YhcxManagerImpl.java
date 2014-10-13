package com.ghtn.service.impl;

import com.ghtn.dao.YhcxDao;
import com.ghtn.model.oracle.Place;
import com.ghtn.service.YhcxManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.YhcxVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/10/9.
 */
@Service("yhcxManager")
public class YhcxManagerImpl extends GenericManagerImpl implements YhcxManager {

    private YhcxDao yhcxDao;

    @Autowired
    public YhcxManagerImpl(YhcxDao yhcxDao) {
        super(yhcxDao);
        this.yhcxDao = yhcxDao;
    }

    @Override
    public List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhcxDao.filterPlace(deptNumber, arg);
    }

    @Override
    public List<Place> filterPlaceOracleDataSource3(String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhcxDao.filterPlace(arg);
    }

    @Override
    public List<YhcxVO> getYhcxDataOracleDataSource3(String startDate, String endDate, String dept, String status, Integer pcType, Integer type, Integer place, String zgType, Integer level, Integer start, Integer limit, HttpSession session) throws ParseException {
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

        // 如果dept为空, 默认为本单位
        if (StringUtil.isNullStr(dept)) {
            if (session.getAttribute("user") != null) {
                Map<String, String> userInfo = (Map<String, String>) session.getAttribute("user");
                dept = userInfo.get("deptId");
            }
        }

        List<Object[]> list = yhcxDao.getYhcxData(startDate, endDate, dept, status, pcType, type, place, zgType, level, start, limit);
        List<YhcxVO> resultList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                YhcxVO vo = new YhcxVO();
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setPcTime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[1]), "yyyy-MM-dd"), "yyyy-MM-dd"));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setStatus(StringUtil.processNullStr(String.valueOf(o[4])));

                resultList.add(vo);
            }
        }

        return resultList;
    }
}
