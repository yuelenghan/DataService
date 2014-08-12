package com.ghtn.service.impl;

import com.ghtn.dao.IrisDao;
import com.ghtn.service.IrisManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.IrisVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<IrisVO> getIrisDataMysqlDataSource5(String personNumber, HttpSession session) throws ParseException {
        List<Object[]> list = irisDao.getIrisData(personNumber);
        if (list != null && list.size() > 0) {
            List<IrisVO> resultList = new ArrayList<IrisVO>();
            Map<String, IrisVO> map = new HashMap<String, IrisVO>();
            for (Object[] o : list) {
                IrisVO vo = new IrisVO();
                vo.setWorkerSn(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setPersonName(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setDepartCode(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setDepartName(StringUtil.processNullStr(String.valueOf(o[3])));

                if (!StringUtil.isNullStr(String.valueOf(o[4]))) {
                    vo.setInWellTime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[4]))));
                } else {
                    vo.setInWellTime("");
                }

                if (!StringUtil.isNullStr(String.valueOf(o[5]))) {
                    vo.setOutWellTime(DateUtil.dateToString(DateUtil.stringToDate(String.valueOf(o[5]))));
                } else {
                    vo.setOutWellTime("");
                }

                vo.setAttendDate(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.setInWellWorkTime(StringUtil.processNullStr(String.valueOf(o[7])));

                // 用工号和入井时间组成字符串做key, 唯一标示虹膜数据
                String key = vo.getWorkerSn() + "-" + vo.getInWellTime();
                vo.setKey(key);

                resultList.add(vo);


                map.put(key, vo);
            }

            // 把虹膜数据存放到session中
            session.setAttribute("irisMap", map);

            return resultList;
        }
        return null;
    }
}
