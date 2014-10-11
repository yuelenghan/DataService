package com.ghtn.service.impl;

import com.ghtn.dao.SwcxDao;
import com.ghtn.service.SwcxManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.SwxxSummaryVO;
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
@Service("swcxManager")
public class SwcxManagerImpl extends GenericManagerImpl implements SwcxManager {

    private SwcxDao swcxDao;

    @Autowired
    public SwcxManagerImpl(SwcxDao swcxDao) {
        super(swcxDao);
        this.swcxDao = swcxDao;
    }


    @Override
    public List<SwxxSummaryVO> getSwcxDataOracleDataSource3(String startDate, String endDate, String dept, String name, Integer type, Integer level, Integer start, Integer limit, HttpSession session) throws ParseException {
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

        List<Object[]> list = new ArrayList<>();

        // 如果部门和姓名都为空, 默认查询本单位的三违信息, 并且把本人信息放在最前
        if (StringUtil.isNullStr(dept) && StringUtil.isNullStr(name)) {
            if (session.getAttribute("user") != null) {
                Map<String, String> userInfo = (Map<String, String>) session.getAttribute("user");
                String personNumber = userInfo.get("personNumber");
                dept = userInfo.get("deptId");

                // 先查本人信息, 再查单位信息(去除本人信息), 然后拼装在一起, 保证本人信息放在结果集的最前
                // 不能在数据库做分页, 只能使用list分页
                List<Object[]> list1 = swcxDao.getSwcxData(startDate, endDate, personNumber, type, level);
                List<Object[]> list2 = swcxDao.getSwcxData(startDate, endDate, dept, personNumber, type, level);

                // list1为合并后的list
                list1.addAll(list2);

                // 对list1进行分页操作
                if (list1.size() > 0) {
                    if (list1.size() > start + limit) {
                        list = list1.subList(start, start + limit);
                    } else {
                        list = list1.subList(start, list1.size());
                    }
                }
            }
        } else {
            list = swcxDao.getSwcxData(startDate, endDate, dept, name, type, level, start, limit);
        }

        List<SwxxSummaryVO> resultList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                SwxxSummaryVO vo = new SwxxSummaryVO();

                vo.setMainDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setZrkqName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setSwpName(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setPctime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[3]), "yyyy-MM-dd"), "yyyy-MM-dd"));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));

                resultList.add(vo);
            }
        }

        return resultList;
    }
}
