package com.ghtn.service.impl;

import com.ghtn.dao.SwxcQueryDao;
import com.ghtn.model.oracle.Nswinput;
import com.ghtn.service.SwxcQueryManager;
import com.ghtn.util.DateUtil;
import com.ghtn.vo.SwxcListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/5/6
 * Time: 10:07
 */
@Service("swxcQueryManager")
public class SwxcQueryManagerImpl extends GenericManagerImpl implements SwxcQueryManager {

    private SwxcQueryDao swxcQueryDao;

    @Autowired
    public SwxcQueryManagerImpl(SwxcQueryDao swxcQueryDao) {
        super(swxcQueryDao);
        this.swxcQueryDao = swxcQueryDao;
    }

    @Override
    public List<SwxcListVO> getSwxcListOracleDataSource3(String startDate, String endDate, int start, int limit) throws ParseException {
        List<Nswinput> list = swxcQueryDao.getSwxcList(DateUtil.stringToDate(startDate, "yyyy-MM-dd"),
                DateUtil.stringToDate(endDate, "yyyy-MM-dd"), start, limit);
        if (list != null && list.size() > 0) {

            List<SwxcListVO> resultList = new ArrayList<SwxcListVO>();

            for (Nswinput nswinput : list) {
                SwxcListVO vo = new SwxcListVO();

                vo.setSwinputId(nswinput.getSwinputid());
                vo.setRemarks(nswinput.getRemarks());
                vo.setBanci(nswinput.getBanci());
                vo.setPcTime(DateUtil.dateToString(nswinput.getPctime(), "yyyy-MM-dd"));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }
}
