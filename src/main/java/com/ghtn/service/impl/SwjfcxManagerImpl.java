package com.ghtn.service.impl;

import com.ghtn.dao.SwjfcxDao;
import com.ghtn.service.SwjfcxManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.SwjfcxVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/10/10.
 */
@Service("swjfcxManager")
public class SwjfcxManagerImpl extends GenericManagerImpl implements SwjfcxManager {

    private SwjfcxDao swjfcxDao;

    @Autowired
    public SwjfcxManagerImpl(SwjfcxDao swjfcxDao) {
        super(swjfcxDao);
        this.swjfcxDao = swjfcxDao;
    }

    @Override
    public List<SwjfcxVO> getSwjfcxDataOracleDataSource3(String startDate, String endDate, String dept, String name, Integer start, Integer limit, HttpSession session) throws ParseException {
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

        // 如果部门和姓名都为空, 默认查询本单位的三违积分信息, 并且把本人信息放在最前
        if (StringUtil.isNullStr(dept) && StringUtil.isNullStr(name)) {
            if (session.getAttribute("user") != null) {
                Map<String, String> userInfo = (Map<String, String>) session.getAttribute("user");
                String personNumber = userInfo.get("personNumber");
                dept = userInfo.get("deptId");

                // 先查本人信息, 再查单位信息(去除本人信息), 然后拼装在一起, 保证本人信息放在结果集的最前
                // 不能在数据库做分页, 只能使用list分页
                List<Object[]> list1 = swjfcxDao.getSwjfcxData(startDate, endDate, personNumber);
                List<Object[]> list2 = swjfcxDao.getSwjfcxData(startDate, endDate, dept, personNumber);

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
            list = swjfcxDao.getSwjfcxData(startDate, endDate, dept, name, start, limit);
        }

        List<SwjfcxVO> resultList = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                SwjfcxVO vo = new SwjfcxVO();
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setFineName(StringUtil.processNullStr(String.valueOf(o[8])));
                vo.setFine(StringUtil.processNullStr(String.valueOf(o[9])));
                vo.setRecordDate(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[3]))));

                resultList.add(vo);
            }
        }

        return resultList;
    }
}
