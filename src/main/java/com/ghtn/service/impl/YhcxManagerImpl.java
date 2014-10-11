package com.ghtn.service.impl;

import com.ghtn.dao.YhcxDao;
import com.ghtn.model.oracle.Place;
import com.ghtn.service.YhcxManager;
import com.ghtn.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
@Service("yhcxManager")
public class YhcxManagerImpl extends GenericManagerImpl implements YhcxManager {

    private YhcxDao yhcxDao;

    @Autowired
    public YhcxManagerImpl(YhcxDao yhcxDao) {
        super(yhcxDao);
        this.yhcxDao = yhcxDao;
    }

    @Override
    public List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhcxDao.filterPlace(deptNumber, arg);
    }

    @Override
    public List<Place> filterPlaceOracleDataSource3(String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhcxDao.filterPlace(arg);
    }
}
