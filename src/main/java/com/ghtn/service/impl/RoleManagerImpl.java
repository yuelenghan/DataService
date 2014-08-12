package com.ghtn.service.impl;

import com.ghtn.dao.RoleDao;
import com.ghtn.model.oracle.SfRole;
import com.ghtn.service.RoleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:17
 */
@Service("roleManager")
public class RoleManagerImpl extends GenericManagerImpl<SfRole, BigDecimal> implements RoleManager {

    private RoleDao roleDao;

    @Autowired
    public RoleManagerImpl(RoleDao roleDao) {
        super(roleDao);
        this.roleDao = roleDao;
    }

    @Override
    public List<Integer> getRoleLevelOracleDataSource3(Integer userId) {
        List list = roleDao.getRoleLevel(userId);
        if (list != null && list.size() > 0) {
            List<Integer> resultList = new ArrayList<Integer>();
            for (Object b : list) {
                resultList.add(Integer.parseInt(String.valueOf(b)));
            }

            return resultList;
        }
        return null;
    }
}
