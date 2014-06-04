package com.ghtn.service.impl;

import com.ghtn.dao.IrisDao;
import com.ghtn.service.IrisManager;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.IrisVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihe on 14-6-3.
 */
@Service("irisManager")
public class IrisManagerImpl extends GenericManagerImpl implements IrisManager {

    private IrisDao irisDao;

    @Autowired
    public IrisManagerImpl(IrisDao irisDao) {
        super(irisDao);
        this.irisDao = irisDao;
    }

    @Override
    public List<IrisVO> getIrisDataMysqlDataSource5(String personNumber) {
        List<Object[]> list = irisDao.getIrisData(personNumber);
        if (list != null && list.size() > 0) {
            List<IrisVO> resultList = new ArrayList<>();
            for (Object[] o : list) {
                IrisVO vo = new IrisVO();
                vo.setWorkerSn(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setPersonName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setDepartCode(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setDepartName(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setInWellTime(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setOutWellTime(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setAttendDate(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.setInWellWorkTime(StringUtil.processNullStr(String.valueOf(o[7])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }
}
