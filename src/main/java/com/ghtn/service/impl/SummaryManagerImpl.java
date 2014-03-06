package com.ghtn.service.impl;

import com.ghtn.dao.SummaryDao;
import com.ghtn.model.oracle.fxyk.Gethangtag;
import com.ghtn.service.SummaryManager;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    public List<RjxxSummaryVO> getRjxxSummaryOracleDataSource3(String beginDate, String endDate, String dwid, String zwjb) throws SQLException {
        ResultSet resultSet = summaryDao.getRjxxSummary(beginDate, endDate, dwid, zwjb);
        if (resultSet != null) {
            List<RjxxSummaryVO> resultList = new ArrayList<>();
            while (resultSet.next()) {
                RjxxSummaryVO vo = new RjxxSummaryVO();

                vo.setMainDeptId(resultSet.getString("MAINDEPTID"));
                vo.setDeptName(resultSet.getString("DEPTNAME"));
                vo.setPersonNumber(resultSet.getString("PERSONNUMBER"));
                vo.setName(resultSet.getString("NAME"));
                vo.setPosName(resultSet.getString("POSNAME"));
                vo.setNeedFreq(resultSet.getInt("NEEDFREQ") + "");
                vo.setRjAll(resultSet.getInt("RJALL") + "");
                vo.setYb(resultSet.getInt("YB") + "");
                vo.setZb(resultSet.getInt("ZB") + "");
                vo.setZhb(resultSet.getInt("ZHB") + "");
                vo.setPlanFreq(resultSet.getInt("PLANFREQ") + "");
                vo.setDbrj(resultSet.getInt("DBRJ") + "");
                vo.setNeedHour(resultSet.getInt("NEEDHOUR") + "");
                vo.setRjsj(resultSet.getString("RJSJ"));
                vo.setPjsj(resultSet.getString("PJSJ"));
                vo.setYhAll(resultSet.getInt("YHALL") + "");
                vo.setSwAll(resultSet.getInt("SWALL") + "");

                resultList.add(vo);

            }
            resultSet.close();
            return resultList;
        }
        return null;
    }

    @Override
    public List<DbjhbSummaryVO> getDbjhbSummaryOracleDataSource3(String date, String banci, String name) throws Exception {
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

        List<Object[]> list = summaryDao.getDbjdbSummary(date, banci, name);
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
    public List<GpxxSummaryVO> getGpxxSummaryOracleDataSource3() {
        List<Gethangtag> list = summaryDao.getGpxxSummary();
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
    public List<FswxxSummaryVO> getFswxxSummaryOracleDataSource3(String startDate, String endDate, String name) {
        List<Object[]> list = summaryDao.getFswxxSummary(startDate, endDate, name);

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
    public List<ZbdbldSummaryVO> getZbdbldSummaryOracleDataSource3(String date) {
        if (!StringUtil.isNullStr(date)) {
            List<Object[]> list = summaryDao.getZbdbldSummary(date);
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
    public List<YdyhhzSummaryVO> getYdyhhzSummaryOracleDataSource3(String date) {
        if (!StringUtil.isNullStr(date)) {
            List<Object[]> list = summaryDao.getYdyhhzSummary(date);
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

}
