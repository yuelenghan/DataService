package com.ghtn.service.impl;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.BaseBanci;
import com.ghtn.model.oracle.Gethangtag;
import com.ghtn.service.SummaryManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * User: Administrator
 * Date: 14-2-17
 * Time: 上午11:11
 */
@Service("summaryManager")
public class SummaryManagerImpl extends GenericManagerImpl implements SummaryManager {

    private SummaryDao summaryDao;

    @Autowired
    public SummaryManagerImpl(SummaryDao summaryDao) {
        super(summaryDao);
        this.summaryDao = summaryDao;
    }

    @Override
    public List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String startDate, String endDate, String dept, String zwjb, String name, Integer start, Integer limit, HttpSession session) throws SQLException, ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = new ArrayList<>();

        // 如果开始日期和结束日期都为空，默认开始日期为当前第一天，结束日期为当月最后一天
        if (StringUtil.isNullStr(startDate) && StringUtil.isNullStr(endDate)) {
            startDate = DateUtil.getFirst(new Date());
            endDate = DateUtil.getLast(new Date());
        }

        // 如果部门,职务级别, 姓名都为空，默认查询当前登陆人的入井信息
        if (StringUtil.isNullStr(dept) && StringUtil.isNullStr(zwjb) && StringUtil.isNullStr(name)) {
            if (session.getAttribute("user") != null) {
                Map<String, String> userInfo = (Map<String, String>) session.getAttribute("user");
                String personNumber = userInfo.get("personNumber");
                list = summaryDao.getRjxxSummary(startDate, endDate, dept, personNumber, start, limit);
            }
        } else {
            list = summaryDao.getRjxxSummary2(startDate, endDate, dept, zwjb, name, start, limit);
        }


        if (list != null && list.size() > 0) {
            List<RjxxSummaryVO> resultList = new ArrayList<RjxxSummaryVO>();

            for (Object[] o : list) {
                RjxxSummaryVO vo = new RjxxSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setDownTime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[2]))));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<DbjhbSummaryVO> getDbjhbSummaryOracleDataSource3(String date, String banci, String name, Integer start, Integer limit) throws Exception {
        date = StringUtil.processDateStr(date);
        if (banci.equals("all")) {
            banci = "";
        }
        if (banci.equals("zb")) {
            banci = "早班";
        }
        if (banci.equals("zhb")) {
            banci = "中班";
        }
        if (banci.equals("yb")) {
            banci = "夜班";
        }

        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getDbjdbSummary(date, banci, name, start, limit);
        if (list != null && list.size() > 0) {
            List<DbjhbSummaryVO> resultList = new ArrayList<DbjhbSummaryVO>();
            for (int i = 0; i < list.size(); i++) {
                Object[] o = list.get(i);
                DbjhbSummaryVO vo = new DbjhbSummaryVO();

                vo.setMineDate(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setBanci(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setPerson(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setChangePerson(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setRealPerson(StringUtil.processNullStr(String.valueOf(o[4])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<GpxxSummaryVO> getGpxxSummaryOracleDataSource3(Integer start, Integer limit) {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Gethangtag> list = summaryDao.getGpxxSummary(start, limit);
        if (list != null && list.size() > 0) {
            List<GpxxSummaryVO> resultList = new ArrayList<GpxxSummaryVO>();
            for (Gethangtag t : list) {
                GpxxSummaryVO vo = new GpxxSummaryVO();
                vo.setMaindeptname(t.getMaindeptname());
                vo.setZrpersonname(t.getZrpersonname());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                vo.setGpdate(t.getGpdate() == null ? "" : sdf.format(t.getGpdate()));

                vo.setGpbanci(t.getGpbanci());
                vo.setHttype(t.getHttype() + "");

                // 设置挂牌类型
                switch (t.getHttype()) {
                    case 1:
                        vo.setHttypeDesc("采掘");
                        break;
                    case 2:
                        vo.setHttypeDesc("机电运输");
                        break;
                    case 3:
                        vo.setHttypeDesc("一通三防");
                        break;
                    case 4:
                        vo.setHttypeDesc("地测防治水");
                        break;
                    case 5:
                        vo.setHttypeDesc("其他");
                        break;
                }

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<FswxxSummaryVO> getFswxxSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit) {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getFswxxSummary(startDate, endDate, name, start, limit);

        if (list != null && list.size() > 0) {

            List<FswxxSummaryVO> resultList = new ArrayList<FswxxSummaryVO>();

            for (Object[] o : list) {
                FswxxSummaryVO vo = new FswxxSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setYbsw(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setJyzsw(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setYzsw(StringUtil.processNullStr(String.valueOf(o[4])));

                resultList.add(vo);
            }

            return resultList;
        }

        return null;
    }

    @Override
    public List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date, String banci) throws ParseException {
        // 如果前台传进来的banci为null, 从数据库取得当前时间所属的班次
        if (StringUtil.isNullStr(banci)) {
            banci = getBanciOracleDataSource3();
        }

        // 如果banci为空，默认为中班
        if (StringUtil.isNullStr(banci)) {
            banci = "中班";
        }

        // 如果date为空，默认为当前日期
        if (StringUtil.isNullStr(date)) {
            date = DateUtil.dateToString(new Date(), "yyyy-MM-dd");
        }

        List<Object[]> list = summaryDao.getZbdbldSummary(date, banci);

        if (list != null && list.size() > 0) {

            List<ZbdbldSummaryVO> resultList = new ArrayList<ZbdbldSummaryVO>();

            for (Object[] o : list) {
                ZbdbldSummaryVO vo = new ZbdbldSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setZb(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setDb(StringUtil.processNullStr(String.valueOf(o[2])));

                resultList.add(vo);
            }

            return resultList;
        }

        return null;
    }

    @Override
    public Map<String, List<String>> getZbdbldSummaryOracleDataSource3(String date, String dept, String banci) throws ParseException {
        // 如果前台传进来的banci为null, 从数据库取得当前时间所属的班次
        if (StringUtil.isNullStr(banci)) {
            banci = getBanciOracleDataSource3();
        }

        // 如果banci为空，默认为中班
        if (StringUtil.isNullStr(banci)) {
            banci = "中班";
        }

        // 如果date为空，默认为当前日期
        if (StringUtil.isNullStr(date)) {
            date = DateUtil.dateToString(new Date(), "yyyy-MM-dd");
        }

        List<Object[]> zbList = summaryDao.getZbldSummary(date, dept);
        List<Object[]> dbList = summaryDao.getDbldSummary(date, banci, dept);

        List<String> zbResultList = new ArrayList<>();
        List<String> dbResultList = new ArrayList<>();
        if (zbList != null && zbList.size() > 0) {
            for (Object[] o : zbList) {
                zbResultList.add(StringUtil.processNullStr(String.valueOf(o[1])));
            }
        }

        if (dbList != null && dbList.size() > 0) {
            for (Object[] o : dbList) {
                dbResultList.add(StringUtil.processNullStr(String.valueOf(o[2])));
            }
        }

        Map<String, List<String>> resultMap = new HashMap<>();
        resultMap.put("zb", zbResultList);
        resultMap.put("db", dbResultList);

        return resultMap;
    }

    @Override
    public List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date) {
        if (!StringUtil.isNullStr(date)) {
            String[] s = date.split("-");
            String startDate = s[0] + "-" + s[1] + "-" + "01";
            String endDate = s[0] + "-" + s[1] + "-" + DateUtil.getLastDayOfMonth(Integer.parseInt(s[0]), Integer.parseInt(s[1]));


            List<Object[]> list = summaryDao.getYdyhhzSummary(startDate, endDate);
            if (list != null && list.size() > 0) {
                List<YdyhhzSummaryVO> resultList = new ArrayList<YdyhhzSummaryVO>();

                for (Object[] o : list) {
                    YdyhhzSummaryVO vo = new YdyhhzSummaryVO();

                    vo.setMainDeptId(StringUtil.processNullStr(String.valueOf(o[0])));
                    vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                    vo.setYhAll(StringUtil.processNullStr(String.valueOf(o[2])));
                    vo.setYhA(StringUtil.processNullStr(String.valueOf(o[3])));
                    vo.setYhB(StringUtil.processNullStr(String.valueOf(o[4])));
                    vo.setYhC(StringUtil.processNullStr(String.valueOf(o[5])));
                    vo.setYhYqwzg(StringUtil.processNullStr(String.valueOf(o[6])));
                    vo.setYhLsyq(StringUtil.processNullStr(String.valueOf(o[7])));
                    vo.setYhYbh(StringUtil.processNullStr(String.valueOf(o[8])));
                    vo.setYhWbh(StringUtil.processNullStr(String.valueOf(o[9])));

                    resultList.add(vo);
                }

                return resultList;
            }
        }
        return null;
    }

    @Override
    public List<LdxjdbSummaryVO> getLdxjdbSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit) {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getLdxjdbSummary(startDate, endDate, name, start, limit);
        if (list != null && list.size() > 0) {
            List<LdxjdbSummaryVO> resultList = new ArrayList<LdxjdbSummaryVO>();
            for (Object[] o : list) {
                LdxjdbSummaryVO vo = new LdxjdbSummaryVO();

                vo.setMainDeptId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setPersonNumber(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setName(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setPosName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setNeedFreq(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setRjAll(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.setYb(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.setZb(StringUtil.processNullStr(String.valueOf(o[8])));
                vo.setZhb(StringUtil.processNullStr(String.valueOf(o[9])));
                vo.setPlanFreq(StringUtil.processNullStr(String.valueOf(o[10])));
                vo.setDbrj(StringUtil.processNullStr(String.valueOf(o[11])));
                vo.setNeedHour(StringUtil.processNullStr(String.valueOf(o[12])));
                vo.setRjsj(StringUtil.processNullStr(String.valueOf(o[13])));
                vo.setPjsj(StringUtil.processNullStr(String.valueOf(o[14])));
                vo.setYhAll(StringUtil.processNullStr(String.valueOf(o[15])));
                vo.setSwAll(StringUtil.processNullStr(String.valueOf(o[16])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<KzdkyhSummaryVO> getKzdkyhSummaryOracleDataSource3(String startDate, String endDate, String mine, Integer start, Integer limit) {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getKzdkyhSummary(startDate, endDate, mine, start, limit);
        if (list != null && list.size() > 0) {
            List<KzdkyhSummaryVO> resultList = new ArrayList<KzdkyhSummaryVO>();

            for (Object[] o : list) {
                KzdkyhSummaryVO vo = new KzdkyhSummaryVO();

                vo.setMainDeptId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setZrDeptName(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setYhAll(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setYhA(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setYhB(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setYhC(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.setYhYqwzg(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.setYhLsyq(StringUtil.processNullStr(String.valueOf(o[8])));
                vo.setYhYbh(StringUtil.processNullStr(String.valueOf(o[9])));
                vo.setYhWbh(StringUtil.processNullStr(String.valueOf(o[10])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<YdswgphzSummaryVO> getYdswgphzSummaryOracleDataSource3(String date, String type) {
        if (!StringUtil.isNullStr(date)) {
            String[] s = date.split("-");
            String startDate = s[0] + "-" + s[1] + "-" + "01";
            String endDate = s[0] + "-" + s[1] + "-" + DateUtil.getLastDayOfMonth(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            /*List<Object[]> list = summaryDao.getYdswgphzSummary(startDate, endDate);

            if (list != null && list.size() > 0) {
                List<YdswgphzSummaryVO> resultList = new ArrayList<>();
                for (Object[] o : list) {
                    YdswgphzSummaryVO vo = new YdswgphzSummaryVO();

                    vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                    vo.setSwAll(StringUtil.processNullStr(String.valueOf(o[2])));
                    vo.setSwYz(StringUtil.processNullStr(String.valueOf(o[3])));
                    vo.setSwJyz(StringUtil.processNullStr(String.valueOf(o[4])));
                    vo.setSwYb(StringUtil.processNullStr(String.valueOf(o[5])));
                    vo.setGpAll(StringUtil.processNullStr(String.valueOf(o[6])));
                    vo.setGpYz(StringUtil.processNullStr(String.valueOf(o[7])));
                    vo.setGpWz(StringUtil.processNullStr(String.valueOf(o[8])));

                    resultList.add(vo);
                }

                return resultList;
            }*/
            List<Object[]> list;
            List<YdswgphzSummaryVO> resultList = new ArrayList<YdswgphzSummaryVO>();
            if (type.equals("sw")) {
                list = summaryDao.getYdswhzSummary(startDate, endDate);
                if (list != null && list.size() > 0) {
                    resultList = new ArrayList<YdswgphzSummaryVO>();
                    for (Object[] o : list) {
                        YdswgphzSummaryVO vo = new YdswgphzSummaryVO();

                        vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                        vo.setSwAll(StringUtil.processNullStr(String.valueOf(o[2])));
                        vo.setSwYz(StringUtil.processNullStr(String.valueOf(o[3])));
                        vo.setSwJyz(StringUtil.processNullStr(String.valueOf(o[4])));
                        vo.setSwYb(StringUtil.processNullStr(String.valueOf(o[5])));

                        resultList.add(vo);
                    }
                }
            }
            if (type.equals("gp")) {
                list = summaryDao.getYdgphzSummary(startDate, endDate);
                if (list != null && list.size() > 0) {
                    resultList = new ArrayList<YdswgphzSummaryVO>();
                    for (Object[] o : list) {
                        YdswgphzSummaryVO vo = new YdswgphzSummaryVO();

                        vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                        vo.setGpAll(StringUtil.processNullStr(String.valueOf(o[2])));
                        vo.setGpYz(StringUtil.processNullStr(String.valueOf(o[3])));
                        vo.setGpWz(StringUtil.processNullStr(String.valueOf(o[4])));

                        resultList.add(vo);
                    }
                }
            }

            return resultList;
        }
        return null;
    }


    @Override
    public List<SwxxSummaryVO> getSwxxSummaryOracleDataSource3(String startDate, String endDate, String dept, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getSwxxSummary(startDate, endDate, dept, start, limit);
        if (list != null && list.size() > 0) {
            List<SwxxSummaryVO> resultList = new ArrayList<SwxxSummaryVO>();

            for (Object[] o : list) {
                SwxxSummaryVO vo = new SwxxSummaryVO();

                vo.setMainDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setZrkqName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setSwpName(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setPctime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[3]), "yyyy-MM-dd"), "yyyy-MM-dd"));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));

                resultList.add(vo);
            }

            return resultList;
        }

        return null;
    }

    @Override
    public List<YhfltjcxSummaryVO> getYhfltjcxSummaryOracleDataSource3(String startDate, String endDate, String unit, Integer start, Integer limit) {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getYhfltjcxSummary(startDate, endDate, unit, start, limit);
        if (list != null && list.size() > 0) {
            List<YhfltjcxSummaryVO> resultList = new ArrayList<YhfltjcxSummaryVO>();

            for (Object[] o : list) {
                YhfltjcxSummaryVO vo = new YhfltjcxSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setZrDeptName(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setYhAll(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setYhA(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setYhB(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setYhC(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.setYhYqwzg(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.setYhLsyq(StringUtil.processNullStr(String.valueOf(o[8])));
                vo.setYhYbh(StringUtil.processNullStr(String.valueOf(o[9])));
                vo.setYhWbh(StringUtil.processNullStr(String.valueOf(o[10])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<YhxxzhcxSummaryVO> getYhxxzhcxSummaryOracleDataSource3(String startDate, String endDate, String unit, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getYhxxzhcxSummary(startDate, endDate, unit, start, limit);
        if (list != null && list.size() > 0) {
            List<YhxxzhcxSummaryVO> resultList = new ArrayList<YhxxzhcxSummaryVO>();

            for (Object[] o : list) {
                YhxxzhcxSummaryVO vo = new YhxxzhcxSummaryVO();

                vo.setZrDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setBanci(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setPcTime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[2]), "yyyy-MM-dd"), "yyyy-MM-dd"));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setStatus(StringUtil.processNullStr(String.valueOf(o[5])));

                resultList.add(vo);
            }

            return resultList;
        }


        return null;
    }

    @Override
    public List<GsxxSummaryVO> getGsxxSummaryOracleDataSource3(String startDate, String endDate, String unit, String level, String name, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getGsxxSummary(startDate, endDate, unit, level, name, start, limit);
        if (list != null && list.size() > 0) {
            List<GsxxSummaryVO> resultList = new ArrayList<GsxxSummaryVO>();

            for (Object[] o : list) {
                GsxxSummaryVO vo = new GsxxSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setLevel(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setHappenDate(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[3]), "yyyy-MM-dd"), "yyyy-MM-dd"));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public String getBanciOracleDataSource3() throws ParseException {
        List<BaseBanci> list = summaryDao.getBanci();
        Calendar c = Calendar.getInstance();

        // 当前日期
        Date curDate = new Date();
        c.setTime(curDate);
        c.add(Calendar.DAY_OF_MONTH, -1);

        // 前一天
        Date preDate = c.getTime();

        // 后一天
        c.setTime(curDate);
        c.add(Calendar.DAY_OF_MONTH, 1);
        Date aftDate = c.getTime();

        // 前一天夜班开始时间
        String preYbStart = DateUtil.dateToString(preDate, "yyyy-MM-dd") + " " + list.get(0).getStarttime();
        // 前一天夜班结束时间
        String preYbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(0).getEndtime();

        // 后一天夜班开始时间
        String aftYbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(0).getStarttime();
        // 后一天夜班结束时间
        String aftYbEnd = DateUtil.dateToString(aftDate, "yyyy-MM-dd") + " " + list.get(0).getEndtime();

        // 早班开始时间
        String zbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(1).getStarttime();
        // 早班结束时间
        String zbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(1).getEndtime();

        // 中班开始时间
        String zhbStart = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(2).getStarttime();
        // 中班结束时间
        String zhbEnd = DateUtil.dateToString(curDate, "yyyy-MM-dd") + " " + list.get(2).getEndtime();

        if ((curDate.compareTo(DateUtil.stringToDate(zbStart)) == 0 || curDate.after(DateUtil.stringToDate(zbStart))) && curDate.before(DateUtil.stringToDate(zbEnd))) {
            return "早班";
        }

        if ((curDate.compareTo(DateUtil.stringToDate(zhbStart)) == 0 || curDate.after(DateUtil.stringToDate(zhbStart))) && curDate.before(DateUtil.stringToDate(zhbEnd))) {
            return "中班";
        }

        if ((curDate.compareTo(DateUtil.stringToDate(preYbStart)) == 0 || curDate.after(DateUtil.stringToDate(preYbStart))) && curDate.before(DateUtil.stringToDate(preYbEnd))) {
            return "夜班";
        }

        if ((curDate.compareTo(DateUtil.stringToDate(aftYbStart)) == 0 || curDate.after(DateUtil.stringToDate(aftYbStart))) && curDate.before(DateUtil.stringToDate(aftYbEnd))) {
            return "夜班";
        }

        return "";
    }

}
