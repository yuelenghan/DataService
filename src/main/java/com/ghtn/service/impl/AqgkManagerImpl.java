package com.ghtn.service.impl;

import com.ghtn.dao.AqgkDao;
import com.ghtn.service.AqgkManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.AqgkVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihe on 14-5-22.
 */
@Service("aqgkManager")
public class AqgkManagerImpl extends GenericManagerImpl implements AqgkManager {

    private AqgkDao aqgkDao;

    @Autowired
    public AqgkManagerImpl(AqgkDao aqgkDao) {
        super(aqgkDao);
        this.aqgkDao = aqgkDao;
    }

    @Override
    public List<AqgkVO> getAqgkOracleDataSource3(String date) {
        if (!StringUtil.isNullStr(date)) {
            String[] s = date.split("-");
            String startDate = s[0] + "-" + s[1] + "-" + "01";
            String endDate = s[0] + "-" + s[1] + "-" + DateUtil.getLastDayOfMonth(Integer.parseInt(s[0]), Integer.parseInt(s[1]));


            List<Object[]> list = aqgkDao.getAqgk(startDate, endDate);
            if (list != null && list.size() > 0) {
                List<AqgkVO> resultList = new ArrayList<AqgkVO>();

                for (Object[] o : list) {
                    AqgkVO vo = new AqgkVO();

                    vo.setMainDeptId(StringUtil.processNullStr(String.valueOf(o[0])));
                    vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));

                    String yhAllStr = StringUtil.processNullStr(String.valueOf(o[2]));
                    if (yhAllStr.equals("")) {
                        vo.setYhAll("0");
                    } else {
                        vo.setYhAll(yhAllStr);
                    }

                    String swAllStr = StringUtil.processNullStr(String.valueOf(o[3]));
                    if (swAllStr.equals("")) {
                        vo.setSwAll("0");
                    } else {
                        vo.setSwAll(swAllStr);
                    }

                    String gpAllStr = StringUtil.processNullStr(String.valueOf(o[4]));
                    if (gpAllStr.equals("")) {
                        vo.setGpAll("0");
                    } else {
                        vo.setGpAll(gpAllStr);
                    }

                    resultList.add(vo);
                }

                return resultList;
            }
        }
        return null;
    }
}
