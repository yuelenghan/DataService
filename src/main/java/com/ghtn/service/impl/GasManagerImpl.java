package com.ghtn.service.impl;

import com.ghtn.dao.GasDao;
import com.ghtn.service.GasManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/8/7.
 */
@Service("gasManager")
public class GasManagerImpl extends GenericManagerImpl implements GasManager {

    private GasDao gasDao;

    @Autowired
    public GasManagerImpl(GasDao gasDao) {
        super(gasDao);
        this.gasDao = gasDao;
    }

    @Override
    public List<Map<String, String>> getCODataSqlServerDataSource7(String deptName, int start, int limit) {
        List<Object[]> list = gasDao.getCOData(deptName, start, limit);
        List<Map<String, String>> returnList = new ArrayList<Map<String, String>>();
        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("fenzhan", String.valueOf(o[0]));
                map.put("leixing", String.valueOf(o[1]));
                map.put("miaoshu", String.valueOf(o[2]));
                map.put("zhi", String.valueOf(o[3]));

                returnList.add(map);
            }
        }
        return returnList;
    }

    @Override
    public List<Map<String, String>> getEquipDataSqlServerDataSource7(String deptName, int start, int limit) {
        List<Object[]> list = gasDao.getEquipData(deptName, start, limit);
        List<Map<String, String>> returnList = new ArrayList<Map<String, String>>();
        if (list != null && list.size() > 0) {
            for (Object[] o : list) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("kuangming", String.valueOf(o[0]));
                map.put("fenzhan", String.valueOf(o[1]));
                map.put("xuhao", String.valueOf(o[2]));
                map.put("leixing", String.valueOf(o[3]));
                map.put("miaoshu", String.valueOf(o[4]));
                if (String.valueOf(o[5]).equals("1")) {
                    map.put("zhi", "开");
                }
                if (String.valueOf(o[5]).equals("0")) {
                    map.put("zhi", "关");
                }

                map.put("shijian", String.valueOf(o[6]));

                returnList.add(map);
            }
        }
        return returnList;
    }

    @Override
    public List<Map<String, String>> getWsDataSqlServerDataSource7(String deptName, String type, int start, int limit) {
        if (type.equals("CO")) {
            return getCODataSqlServerDataSource7(deptName, start, limit);
        } else if (type.equals("equip")) {
            return getEquipDataSqlServerDataSource7(deptName, start, limit);
        }
        return null;
    }
}
