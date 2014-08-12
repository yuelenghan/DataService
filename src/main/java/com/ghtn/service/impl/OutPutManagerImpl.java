package com.ghtn.service.impl;

import com.ghtn.dao.OutPutDao;
import com.ghtn.model.sqlServer.Xsrb;
import com.ghtn.service.OutPutManager;
import com.ghtn.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/8/8.
 */
@Service("outPutManager")
public class OutPutManagerImpl extends GenericManagerImpl implements OutPutManager {

    private OutPutDao outPutDao;

    @Autowired
    public OutPutManagerImpl(OutPutDao outPutDao) {
        super(outPutDao);
        this.outPutDao = outPutDao;
    }

    @Override
    public List<Map<String, String>> getOutPutDataSqlServerDataSource6(String startDate, String endDate) throws ParseException {
        List<Xsrb> list = outPutDao.getOutPutData(DateUtil.stringToDate(startDate, "yyyy-MM-dd"), DateUtil.stringToDate(endDate, "yyyy-MM-dd"));
        List<Map<String, String>> returnList = new ArrayList<Map<String, String>>();
        if (list != null && list.size() > 0) {
            for (Xsrb xsrb : list) {
                Map<String, String> map = new HashMap<String, String>();
              /*  map.put("id", String.valueOf(o[0]));
                map.put("ydName", String.valueOf(o[1]));
                map.put("ydContent", String.valueOf(o[2]));
                map.put("ydDw", String.valueOf(o[3]));
                map.put("ydDt1", DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[4]), "yyyy-MM-dd"), "yyyy-MM-dd"));*/

                map.put("id", xsrb.getId() + "");
                map.put("ydName", xsrb.getYd_name());
                map.put("ydContent", xsrb.getYd_content());
                map.put("ydDw", xsrb.getYd_dw());
                map.put("ydDt1", DateUtil.dateToString(xsrb.getYd_dt1(), "yyyy-MM-dd"));

                returnList.add(map);
            }
        }
        return returnList;
    }
}
