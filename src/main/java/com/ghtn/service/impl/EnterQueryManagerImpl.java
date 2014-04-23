package com.ghtn.service.impl;

import com.ghtn.dao.EnterQueryDao;
import com.ghtn.service.EnterQueryManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.SwEnterQueryVO;
import com.ghtn.vo.YhEnterQueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:17
 */
@Service("enterQueryManager")
public class EnterQueryManagerImpl extends GenericManagerImpl implements EnterQueryManager {

    private EnterQueryDao enterQueryDao;

    @Autowired
    public EnterQueryManagerImpl(EnterQueryDao enterQueryDao) {
        super(enterQueryDao);
        this.enterQueryDao = enterQueryDao;
    }


    @Override
    public List<YhEnterQueryVO> queryYhEnterOracleDataSource3(String inputPersonId, String banci, String levelId, String typeId) throws ParseException {
        int levelIdInt = 0, typeIdInt = 0;

        if (!StringUtil.isNullStr(levelId)) {
            levelIdInt = Integer.parseInt(levelId);
        }
        if (!StringUtil.isNullStr(typeId)) {
            typeIdInt = Integer.parseInt(typeId);
        }

        List<Object[]> list = enterQueryDao.queryYhEnter(inputPersonId, banci, levelIdInt, typeIdInt);

        if (list != null && list.size() > 0) {
            List<YhEnterQueryVO> resultList = new ArrayList<>();
            for (Object[] o : list) {
                YhEnterQueryVO vo = new YhEnterQueryVO();
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setYhContent(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setRemarks(StringUtil.processNullStr(String.valueOf(o[2])));

                switch (StringUtil.processNullStr(String.valueOf(o[3]))) {
                    case "-6":
                        vo.setJcTypeDesc("采掘专项检查");
                        break;
                    case "-5":
                        vo.setJcTypeDesc("火工品专项检查");
                        break;
                    case "-4":
                        vo.setJcTypeDesc("机电运输专项检查");
                        break;
                    case "-3":
                        vo.setJcTypeDesc("地测防治水专项检查");
                        break;
                    case "-2":
                        vo.setJcTypeDesc("一通三防专项检查");
                        break;
                    case "-1":
                        vo.setJcTypeDesc("顶板管理专项检查");
                        break;
                    case "0":
                        vo.setJcTypeDesc("重大安全隐患");
                        break;
                    case "1":
                        vo.setJcTypeDesc("年度隐患");
                        break;
                    case "2":
                        vo.setJcTypeDesc("月度隐患");
                        break;
                    case "3":
                        vo.setJcTypeDesc("日常动态检查隐患");
                        break;
                    case "4":
                        vo.setJcTypeDesc("矿专项检查");
                        break;
                    case "5":
                        vo.setJcTypeDesc("地面检查");
                        break;
                    case "6":
                        vo.setJcTypeDesc("职工检查");
                        break;
                    case "7":
                        vo.setJcTypeDesc("公司专项检查");
                        break;
                    case "8":
                        vo.setJcTypeDesc("省局检查");
                        break;
                    case "9":
                        vo.setJcTypeDesc("市局检查");
                        break;
                    case "10":
                        vo.setJcTypeDesc("国投检查");
                        break;
                    case "11":
                        vo.setJcTypeDesc("经信委检查");
                        break;
                    case "12":
                        vo.setJcTypeDesc("公司预评估");
                        break;
                    default:
                        vo.setJcTypeDesc("");
                        break;
                }

                vo.setInTime(DateUtil.dateToString((Date) o[4]));

                resultList.add(vo);
            }

            return resultList;
        }

        return null;
    }

    @Override
    public List<SwEnterQueryVO> querySwEnterOracleDataSource3(String inputPersonId, String banci, String levelId, String typeId) {
        int levelIdInt = 0, typeIdInt = 0;

        if (!StringUtil.isNullStr(levelId)) {
            levelIdInt = Integer.parseInt(levelId);
        }
        if (!StringUtil.isNullStr(typeId)) {
            typeIdInt = Integer.parseInt(typeId);
        }

        List<Object[]> list = enterQueryDao.querySwEnter(inputPersonId, banci, levelIdInt, typeIdInt);

        if (list != null && list.size() > 0) {
            List<SwEnterQueryVO> resultList = new ArrayList<>();
            for (Object[] o : list) {
                SwEnterQueryVO vo = new SwEnterQueryVO();
                vo.setSwPerson(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setSwContent(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setRemarks(StringUtil.processNullStr(String.valueOf(o[2])));

                switch (StringUtil.processNullStr(String.valueOf(o[3]))) {
                    case "1":
                        vo.setJcTypeDesc("区队自查");
                        break;
                    case "2":
                        vo.setJcTypeDesc("职能科室");
                        break;
                    case "3":
                        vo.setJcTypeDesc("安检部门");
                        break;
                    case "4":
                        vo.setJcTypeDesc("矿领导");
                        break;
                    case "5":
                        vo.setJcTypeDesc("公司部门");
                        break;
                    default:
                        vo.setJcTypeDesc("");
                        break;
                }

                vo.setInTime(DateUtil.dateToString((Date) o[4]));

                resultList.add(vo);
            }

            return resultList;
        }

        return null;
    }
}
