package com.ghtn.service.impl;

import com.ghtn.dao.RydwDao;
import com.ghtn.service.RydwManager;
import com.ghtn.util.DateUtil;
import com.ghtn.vo.RydwVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-18
 * Time: 上午10:14
 */
@Service("rydwManager")
public class RydwManagerImpl extends GenericManagerImpl implements RydwManager {

    private static Log log = LogFactory.getLog(RydwManagerImpl.class);

    private RydwDao rydwDao;

    @Autowired
    public RydwManagerImpl(RydwDao rydwDao) {
        super(rydwDao);
        this.rydwDao = rydwDao;
    }

    @Override
    public List<RydwVO> getInMinePeopleSqlServerDataSource4(String date, HttpSession session, Integer start, Integer limit) throws SQLException {
        // 缓存标识符
        String sessionStr = "inMinePeople$" + date;
        List<RydwVO> cacheList = null;
        // 得到session中的totalList缓存
        if (session != null) {
            cacheList = (List<RydwVO>) session.getAttribute(sessionStr);
        }

        if (cacheList != null && cacheList.size() > 0) {
            if (cacheList.size() > start + limit) {
                return cacheList.subList(start, start + limit);
            } else {
                return cacheList.subList(start, cacheList.size());
            }
        } else {
            log.debug("调用存储过程！！");
            // 调用存储过程取得总的结果集totalList，在内存中对totalList进行分页
            ResultSet resultSet = rydwDao.getInMinePeople(DateUtil.createSqlDate(date, "yyyy-MM-dd"));
            if (resultSet != null) {
                List<RydwVO> totalList = new ArrayList<>();
                while (resultSet.next()) {
                    int peopleId = resultSet.getInt("People_id");
                    String peopleName = resultSet.getString("People_name");
                    String deptName = resultSet.getString("Dept_name");
                    String deptFullName = resultSet.getString("Dept_fullname");
                    String workTypeName = resultSet.getString("Worktype_name");
                    String rankName = resultSet.getString("Rank_name");
                    String positionDesc = resultSet.getString("Position_desc");
                    String firstReportTime = DateUtil.dateToString(resultSet.getTimestamp("First_report_time"), "yyyy-MM-dd HH:mm:ss");
                    String lastReportTime = DateUtil.dateToString(resultSet.getTimestamp("Last_report_time"), "yyyy-MM-dd HH:mm:ss");
                    String inMineTime = DateUtil.dateToString(resultSet.getTimestamp("In_Mine_time"), "yyyy-MM-dd HH:mm:ss");

                    RydwVO vo = new RydwVO();
                    vo.setPeopleId(peopleId);
                    vo.setPeopleName(peopleName);
                    vo.setDeptName(deptName);
                    vo.setDeptFullName(deptFullName);
                    vo.setWorkTypeName(workTypeName);
                    vo.setRankName(rankName);
                    vo.setPositionDesc(positionDesc);
                    vo.setFirstReportTime(firstReportTime);
                    vo.setLastReportTime(lastReportTime);
                    vo.setInMineTime(inMineTime);

                    totalList.add(vo);
                }

                // 把totalList放到session中缓存起来
                if (session != null) {
                    session.setAttribute(sessionStr, totalList);
                }


                List<RydwVO> resultList = null;

                if (totalList.size() > 0) {
                    if (totalList.size() > start + limit) {
                        resultList = totalList.subList(start, start + limit);
                    } else {
                        resultList = totalList.subList(start, totalList.size());
                    }
                }

                return resultList;
            }
        }

        return null;
    }
}
