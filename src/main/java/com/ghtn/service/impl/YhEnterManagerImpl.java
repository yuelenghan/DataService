package com.ghtn.service.impl;

import com.ghtn.dao.*;
import com.ghtn.model.oracle.*;
import com.ghtn.service.YhEnterManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.*;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:29
 */
@Service("yhEnterManager")
public class YhEnterManagerImpl extends GenericManagerImpl implements YhEnterManager {

    private YhEnterDao yhEnterDao;

    @Autowired
    public YhEnterManagerImpl(YhEnterDao yhEnterDao) {
        super(yhEnterDao);
        this.yhEnterDao = yhEnterDao;
    }

    private PlaceDao placeDao;

    @Resource
    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    private PersonDao personDao;

    @Resource
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    private DepartmentDao departmentDao;

    private BaseBanciDao baseBanciDao;

    @Resource
    public void setBaseBanciDao(BaseBanciDao baseBanciDao) {
        this.baseBanciDao = baseBanciDao;
    }

    @Resource
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<YhBasisVO> getYhBasisOracleDataSource3(String deptNumber, HttpSession session) {
        List<Object[]> list = yhEnterDao.getYhBasis(deptNumber);
        if (list != null && list.size() > 0) {
            List<YhBasisVO> resultList = new ArrayList<YhBasisVO>();
            Map<String, String> levelMap = new HashMap<String, String>();
            Map<String, String> typeMap = new HashMap<String, String>();
            Map<String, String> hazardMap = new HashMap<String, String>();
            for (Object[] o : list) {
                YhBasisVO vo = new YhBasisVO();
                vo.setYhId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setYhNumber(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setYhContent(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setLevelId(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setTypeId(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[8])));

                resultList.add(vo);

                levelMap.put(vo.getYhId(), vo.getLevelId());
                typeMap.put(vo.getYhId(), vo.getTypeId());
                hazardMap.put(vo.getYhId(), vo.gethNumber());

            }

            if (session != null) {
                session.setAttribute("levelMap", levelMap);
                session.setAttribute("typeMap", typeMap);
                session.setAttribute("hazardMap", hazardMap);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public String getYhBasisLevelOracleDataSource3(String yhid, HttpSession session) {
        if (session != null) {
            Map<String, String> levelMap = (Map<String, String>) session.getAttribute("levelMap");
            if (levelMap != null) {
                return levelMap.get(yhid);
            }
        }

        return "";
    }

    @Override
    public String getYhBasisTypeOracleDataSource3(String yhid, HttpSession session) {
        if (session != null) {
            Map<String, String> typeMap = (Map<String, String>) session.getAttribute("typeMap");
            if (typeMap != null) {
                return typeMap.get(yhid);
            }
        }

        return "";
    }

    @Override
    public List<HazardVO> getHazardOracleDataSource3(String deptNumber) {
        List<Object[]> list = yhEnterDao.getHazard(deptNumber);
        if (list != null && list.size() > 0) {
            List<HazardVO> resultList = new ArrayList<HazardVO>();
            for (Object[] o : list) {
                HazardVO vo = new HazardVO();

                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[1])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public String getBasisHazardOracleDataSource3(String yhid, HttpSession session) {
        if (session != null) {
            Map<String, String> hazardMap = (Map<String, String>) session.getAttribute("hazardMap");
            if (hazardMap != null) {
                return hazardMap.get(yhid);
            }
        }

        return "";
    }

    @Override
    public List<ZrdwVO> getZrdwOracleDataSource3(String deptNumber) {
        List<Object[]> list = yhEnterDao.getZrdw(deptNumber);
        if (list != null && list.size() > 0) {
            List<ZrdwVO> resultList = new ArrayList<ZrdwVO>();
            for (Object[] o : list) {
                ZrdwVO vo = new ZrdwVO();

                vo.setDeptNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<ZrrVO> getZrrOracleDataSource3(String deptId) {
        List<Person> list = yhEnterDao.getZrr(deptId);
        if (list != null && list.size() > 0) {
            List<ZrrVO> resultList = new ArrayList<ZrrVO>();
            for (Person p : list) {
                ZrrVO vo = new ZrrVO();

                vo.setPersonId(p.getPersonid() + "");
                vo.setPersonNumber(p.getPersonnumber());
                vo.setName(p.getName());
                vo.setDeptId(p.getDeptid());
                vo.setMainDeptId(p.getMaindeptid());

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<Place> getPlaceOracleDataSource3(String deptNumber) {
        return yhEnterDao.getPlace(deptNumber);
    }

    @Override
    public String insertInfoOracleDataSource3(Integer yhyj, Integer yhjb, Integer yhlx, String yhms, String zrdw, String zrr, Integer pcdd, String mxdd, String pcsj, String pcbc, String pcry, Integer pclx, String zgfs, String zgqx, String zgbc, Integer yhzy, String mainDeptId,
                                              Integer fineType, Integer dwfk, Integer grfk, Integer rjid) throws ParseException {
        Nyhinput nyhinput = yhEnterDao.getYhinput(pcdd, zrdw, yhyj);
        if (nyhinput == null) {
            // 插入NYHINPUT
            nyhinput = new Nyhinput();

            // 如果是现场整改, 只录入这些数据
            // =================界面录入======================
            nyhinput.setYhid(yhyj); // 隐患依据
            nyhinput.setLevelid(yhjb); // 隐患级别
            nyhinput.setTypeid(yhlx);   // 隐患类型
            nyhinput.setRemarks(yhms); // 隐患描述
            nyhinput.setDeptid(zrdw); //责任单位
            nyhinput.setBanci(pcbc); // 排查班次
            nyhinput.setStatus(zgfs);   // 整改方式

            // =================隐藏信息======================
            nyhinput.setInputpersonid(pcry); // 排查人员
            nyhinput.setYqcs(BigInteger.ZERO); // 逾期次数
            nyhinput.setDxtx(BigInteger.ZERO); // 短信提醒
            nyhinput.setLcmark(1L); // 流程标记
            nyhinput.setMaindeptid(mainDeptId); // 被查矿
            // 录入时间
            nyhinput.setIntime(new Timestamp(new Date().getTime()));

            // 排查时间
            nyhinput.setPctime(new Timestamp(DateUtil.stringToDate(pcsj, "yyyy-MM-dd").getTime()));

            // 入井id, 确认入井信息时生成的id
            if (rjid != null && rjid > 0) {
                nyhinput.setRjid(rjid);
            }


            // 限期整改录入其他数据
            if (zgfs.equals("新增")) {
                nyhinput.setPlaceid(pcdd); // 地点编码

                if (StringUtil.isNullStr(mxdd)) {
                    mxdd = "";
                }
                nyhinput.setPlacedetail(mxdd); // 明细地点

                nyhinput.setPersonid(zrr);  // 责任人

                //nyhinput.sethNumber(wxy);


                if (!StringUtil.isNullStr(zgqx)) {
                    nyhinput.setXqdate(new Timestamp(DateUtil.stringToDate(zgqx, "yyyy-MM-dd").getTime()));

                    BaseBanci baseBanci = yhEnterDao.getBaseBanci(mainDeptId, zgbc);
                    Date xqDate = DateUtil.stringToDate(zgqx, "yyyy-MM-dd");
                    if (baseBanci != null) {
                        Date endTime = DateUtil.stringToDate(baseBanci.getEndtime(), "HH:mm:ss");
                        nyhinput.setLastxqtime(new Timestamp(xqDate.getTime() + endTime.getTime() + 4 * 3600 * 1000));
                    } else {
                        nyhinput.setLastxqtime(new Timestamp(xqDate.getTime() + 4 * 3600 * 1000));
                    }

                }

                nyhinput.setXqbanci(zgbc);

                // 排查类型为矿专项检查或公司专项检查，指定排查专业
                if (pclx == 4 || pclx == 7) {
                    nyhinput.setYhzyid(yhzy);
                }

                nyhinput.setJctype(pclx);
            }


            nyhinput = (Nyhinput) yhEnterDao.save(nyhinput);

            String zrdwName = "";
            // 根据责任单位id得到责任单位名称
            if (!StringUtil.isNullStr(zrdw)) {
                zrdwName = departmentDao.get(zrdw).getDeptname();
            }

            String zrrName = "";
            // 根据责任人id得到责任人名称
            if (!StringUtil.isNullStr(zrr)) {
                zrrName = personDao.getPersonName(zrr);
            }


            if (zgfs.equals("新增") && fineType != 0) {
                // 插入罚款信息
                if (fineType == 1) {
                    Nyhfinedetail nyhfinedetail = new Nyhfinedetail();
                    nyhfinedetail.setYhputinid(nyhinput.getYhputinid());
                    nyhfinedetail.setRecorddate(new Date());
                    nyhfinedetail.setLcmark(1);
                    nyhfinedetail.setFinetype(BigInteger.valueOf(fineType));
                    nyhfinedetail.setObjectname("责任单位");
                    nyhfinedetail.setFineid(zrdw);
                    nyhfinedetail.setFinename(zrdwName);
                    nyhfinedetail.setFine(BigDecimal.valueOf(dwfk));

                    yhEnterDao.save(nyhfinedetail);
                }

                if (fineType == 2) {
                    Nyhfinedetail nyhfinedetail = new Nyhfinedetail();
                    nyhfinedetail.setYhputinid(nyhinput.getYhputinid());
                    nyhfinedetail.setRecorddate(new Date());
                    nyhfinedetail.setLcmark(1);
                    nyhfinedetail.setFinetype(BigInteger.valueOf(fineType));
                    nyhfinedetail.setObjectname("责任人");
                    nyhfinedetail.setFineid(zrr);
                    nyhfinedetail.setFinename(zrrName);
                    nyhfinedetail.setFine(BigDecimal.valueOf(grfk));

                    yhEnterDao.save(nyhfinedetail);
                }

                if (fineType == 3) {
                    Nyhfinedetail nyhfinedetail = new Nyhfinedetail();
                    nyhfinedetail.setYhputinid(nyhinput.getYhputinid());
                    nyhfinedetail.setRecorddate(new Date());
                    nyhfinedetail.setLcmark(1);
                    nyhfinedetail.setFinetype(BigInteger.valueOf(1));
                    nyhfinedetail.setObjectname("责任单位");
                    nyhfinedetail.setFineid(zrdw);
                    nyhfinedetail.setFinename(zrdwName);
                    nyhfinedetail.setFine(BigDecimal.valueOf(dwfk));

                    yhEnterDao.save(nyhfinedetail);

                    Nyhfinedetail nyhfinedetail2 = new Nyhfinedetail();
                    nyhfinedetail2.setYhputinid(nyhinput.getYhputinid());
                    nyhfinedetail2.setRecorddate(new Date());
                    nyhfinedetail2.setLcmark(1);
                    nyhfinedetail2.setFinetype(BigInteger.valueOf(2));
                    nyhfinedetail2.setObjectname("责任人");
                    nyhfinedetail2.setFineid(zrr);
                    nyhfinedetail2.setFinename(zrrName);
                    nyhfinedetail2.setFine(BigDecimal.valueOf(grfk));

                    yhEnterDao.save(nyhfinedetail2);
                }
            }


            // 插入NYHINPUT_MORE
            NyhinputMore nyhinputMore = new NyhinputMore();
            nyhinputMore.setYhputinid(nyhinput.getYhputinid());
            nyhinputMore.setPersonid(pcry);
            nyhinputMore.setPctime(new Timestamp(DateUtil.stringToDate(pcsj, "yyyy-MM-dd").getTime()));
            nyhinputMore.setBanci(pcbc);
            nyhinputMore.setJctype(BigInteger.valueOf(pclx));
            nyhinputMore.setRemarks(yhms);

            yhEnterDao.save(nyhinputMore);

            // 插入NYHSTATUSCHANGE
            Nyhstatuschange nyhstatuschange = new Nyhstatuschange();
            nyhstatuschange.setYhputinid(nyhinput.getYhputinid());
            nyhstatuschange.setLcmark(1);
            nyhstatuschange.setRecorddate(new Timestamp(new Date().getTime()));
            nyhstatuschange.setNstatus(zgfs);
            nyhstatuschange.setCremarks(personDao.getPersonName(pcry) + "于" + DateUtil.dateToString(new Date(), "yyyy/MM/dd HH:mm:ss") + "新增一条隐患!");

            yhEnterDao.save(nyhstatuschange);


            // 插入YHPERSISTENCE
            Yhpersistence yhpersistence = new Yhpersistence();
            yhpersistence.setYhputinid(nyhinput.getYhputinid());
            yhpersistence.setZrdeptname(zrdwName);
            yhpersistence.setZrpername(zrrName);

            // 限期整改填写排查地点, 现场整改不填写
            if (zgfs.equals("新增")) {
                yhpersistence.setPlacename(placeDao.get(pcdd).getPlacename());
            } else {
                yhpersistence.setPlacename("");
            }

            yhpersistence.setInputpername(personDao.getPersonName(pcry));

            yhEnterDao.save(yhpersistence);
        } else {
            // 插入NYHINPUT_MORE
            NyhinputMore nyhinputMore = new NyhinputMore();
            nyhinputMore.setYhputinid(nyhinput.getYhputinid());
            nyhinputMore.setPersonid(pcry);
            nyhinputMore.setPctime(new Timestamp(DateUtil.stringToDate(pcsj, "yyyy-MM-dd").getTime()));
            nyhinputMore.setBanci(pcbc);
            nyhinputMore.setJctype(BigInteger.valueOf(pclx));
            nyhinputMore.setRemarks(yhms);

            yhEnterDao.save(nyhinputMore);
        }


        return "success";
    }

    @Override
    public List<YhBasisVO> filterYhBasisOracleDataSource3(String deptNumber, String yhyjLevel, String yhyjType, String yhyjText, HttpSession session) {
        int yhyjLevelInt = 0;
        int yhyjTypeInt = 0;
        if (!StringUtil.isNullStr(yhyjLevel)) {
            yhyjLevelInt = Integer.parseInt(yhyjLevel);
        }
        if (!StringUtil.isNullStr(yhyjType)) {
            yhyjTypeInt = Integer.parseInt(yhyjType);
        }
        List<Object[]> list = yhEnterDao.filterYhBasis(deptNumber, yhyjLevelInt, yhyjTypeInt, yhyjText);
        if (list != null && list.size() > 0) {
            List<YhBasisVO> resultList = new ArrayList<YhBasisVO>();
            Map<String, String> levelMap = new HashMap<String, String>();
            Map<String, String> typeMap = new HashMap<String, String>();
            Map<String, String> hazardMap = new HashMap<String, String>();
            for (Object[] o : list) {
                YhBasisVO vo = new YhBasisVO();
                vo.setYhId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setYhNumber(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setYhContent(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setLevelId(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setTypeId(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[8])));

                resultList.add(vo);

                levelMap.put(vo.getYhId(), vo.getLevelId());
                typeMap.put(vo.getYhId(), vo.getTypeId());
                hazardMap.put(vo.getYhId(), vo.gethNumber());

            }


            if (session != null) {
                session.setAttribute("levelMap", levelMap);
                session.setAttribute("typeMap", typeMap);
                session.setAttribute("hazardMap", hazardMap);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<HazardVO> filterHazardOracleDataSource3(String deptNumber, String wxyLevel, String wxyText) {
        List<Object[]> list = yhEnterDao.filterHazard(deptNumber, wxyLevel, wxyText);
        if (list != null && list.size() > 0) {
            List<HazardVO> resultList = new ArrayList<HazardVO>();
            for (Object[] o : list) {
                HazardVO vo = new HazardVO();

                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[1])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhEnterDao.filterPlace(deptNumber, arg);
    }

    @Override
    public List<DepartmentVO> filterZrdwOracleDataSource3(String deptNumber, String arg) {
        List<Object[]> list = yhEnterDao.filterZrdw(deptNumber, arg);
        if (list != null && list.size() > 0) {
            List<DepartmentVO> resultList = new ArrayList<DepartmentVO>();
            for (Object[] o : list) {
                DepartmentVO vo = new DepartmentVO();
                vo.setDeptNumber(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setDeptName(StringUtil.processNullStr(String.valueOf(o[1])));

                resultList.add(vo);
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<Person> filterZrrOracleDataSource3(String deptId, String arg) {
        if (StringUtil.isNullStr(arg)) {
            arg = "";
        }
        return yhEnterDao.filterZrr(deptId, arg);
    }

    @Override
    public String getBanciByTimeOracleDataSource3(String time, String mainDeptId, String bType) {
        BaseBanci banci = baseBanciDao.get(mainDeptId, bType, time);
        if (banci == null) {
            banci = baseBanciDao.getYb(mainDeptId, bType, time);
        }
        if (banci == null) {
            return "";
        }
//        System.out.println(banci.getName());
        return banci.getName();
    }

}
