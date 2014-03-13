package com.ghtn.service.impl;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.fxyk.Gethangtag;
import com.ghtn.service.SummaryManager;
import com.ghtn.util.ConstantUtil;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
    public List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit) throws SQLException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getRjxxSummary(startDate, endDate, name, start, limit);
        if (list != null && list.size() > 0) {
            List<RjxxSummaryVO> resultList = new ArrayList<>();

            for (Object[] o : list) {
                RjxxSummaryVO vo = new RjxxSummaryVO();

                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setDownTime(StringUtil.processNullStr(String.valueOf(o[2])));

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
            List<DbjhbSummaryVO> resultList = new ArrayList<>();
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
            List<GpxxSummaryVO> resultList = new ArrayList<>();
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

            List<FswxxSummaryVO> resultList = new ArrayList<>();

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
    public List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date, Integer start, Integer limit) {
        if (!StringUtil.isNullStr(date)) {
            if (start == null || start <= 0) {
                start = 0;
            }
            if (limit == null || limit <= 0) {
                limit = ConstantUtil.PAGE_SIZE;
            }

            List<Object[]> list = summaryDao.getZbdbldSummary(date, start, limit);
            if (list != null && list.size() > 0) {

                List<ZbdbldSummaryVO> resultList = new ArrayList<>();

                for (Object[] o : list) {
                    ZbdbldSummaryVO vo = new ZbdbldSummaryVO();

                    vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                    vo.setDetail(StringUtil.processNullStr(String.valueOf(o[1])));
                    vo.setYb(StringUtil.processNullStr(String.valueOf(o[2])));
                    vo.setZb(StringUtil.processNullStr(String.valueOf(o[3])));
                    vo.setZhb(StringUtil.processNullStr(String.valueOf(o[4])));

                    resultList.add(vo);
                }

                return resultList;
            }
        }

        return null;
    }

    @Override
    public List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date, Integer start, Integer limit) {
        if (!StringUtil.isNullStr(date)) {
            if (start == null || start <= 0) {
                start = 0;
            }
            if (limit == null || limit <= 0) {
                limit = ConstantUtil.PAGE_SIZE;
            }

            List<Object[]> list = summaryDao.getYdyhhzSummary(date, start, limit);
            if (list != null && list.size() > 0) {
                List<YdyhhzSummaryVO> resultList = new ArrayList<>();

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
            List<LdxjdbSummaryVO> resultList = new ArrayList<>();
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
    public List<KzdkyhSummaryVO> getKzdkyhSummaryOracleDataSource3(String date, Integer start, Integer limit) {
        if (!StringUtil.isNullStr(date)) {
            if (start == null || start <= 0) {
                start = 0;
            }
            if (limit == null || limit <= 0) {
                limit = ConstantUtil.PAGE_SIZE;
            }

            List<Object[]> list = summaryDao.getKzdkyhSummary(date, start, limit);
            if (list != null && list.size() > 0) {
                List<KzdkyhSummaryVO> resultList = new ArrayList<>();

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
        }
        return null;
    }

    @Override
    public List<YdswgphzSummaryVO> getYdswgphzSummaryOracleDataSource3(String date, Integer start, Integer limit) {
        if (!StringUtil.isNullStr(date)) {
            if (start == null || start <= 0) {
                start = 0;
            }
            if (limit == null || limit <= 0) {
                limit = ConstantUtil.PAGE_SIZE;
            }

            List<Object[]> list = summaryDao.getYdswgphzSummary(date, start, limit);
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
            }
        }
        return null;
    }

    @Override
    public List<SwxxSummaryVO> getSwxxSummaryOracleDataSource3(String startDate, String endDate, String name, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getSwxxSummary(startDate, endDate, name, start, limit);
        if (list != null && list.size() > 0) {
            List<SwxxSummaryVO> resultList = new ArrayList<>();

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
            List<YhfltjcxSummaryVO> resultList = new ArrayList<>();

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
    public List<YhxxzhcxSummaryVO> getYhxxzhcxSummaryOracleDataSource3(String startDate, String endDate, String unit, String banci, Integer start, Integer limit) throws ParseException {
        if (start == null || start <= 0) {
            start = 0;
        }
        if (limit == null || limit <= 0) {
            limit = ConstantUtil.PAGE_SIZE;
        }

        List<Object[]> list = summaryDao.getYhxxzhcxSummary(startDate, endDate, unit, banci, start, limit);
        if (list != null && list.size() > 0) {
            List<YhxxzhcxSummaryVO> resultList = new ArrayList<>();

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
            List<GsxxSummaryVO> resultList = new ArrayList<>();

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

}
