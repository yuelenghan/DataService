package com.ghtn.service.impl;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.dao.PersonDao;
import com.ghtn.dao.PlaceDao;
import com.ghtn.dao.YhEnterDao;
import com.ghtn.model.oracle.*;
import com.ghtn.service.YhEnterManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.HazardVO;
import com.ghtn.vo.YhBasisVO;
import com.ghtn.vo.ZrdwVO;
import com.ghtn.vo.ZrrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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

    @Resource
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<YhBasisVO> getYhBasisOracleDataSource3(String deptNumber, HttpSession session) {
        List<Object[]> list = yhEnterDao.getYhBasis(deptNumber);
        if (list != null && list.size() > 0) {
            List<YhBasisVO> resultList = new ArrayList<>();
            Map<String, String> levelMap = new HashMap<>();
            Map<String, String> typeMap = new HashMap<>();
            Map<String, String> hazardMap = new HashMap<>();
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
            List<HazardVO> resultList = new ArrayList<>();
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
            List<ZrdwVO> resultList = new ArrayList<>();
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
            List<ZrrVO> resultList = new ArrayList<>();
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
    public String insertInfoOracleDataSource3(Integer yhyj, Integer yhjb, String yhlx, String wxy, String yhms, String zrdw, String zrr, Integer pcdd, String mxdd, String pcsj, String pcbc, String pcry, Integer pclx, String zgfs, String zgqx, String zgbc, Integer yhzy, String mainDeptId) throws ParseException {
        Nyhinput nyhinput = yhEnterDao.getYhinput(pcdd, zrdw, yhyj);
        if (nyhinput == null) {
            // 插入NYHINPUT
            nyhinput = new Nyhinput();

            nyhinput.setDeptid(zrdw);
            nyhinput.setPlaceid(pcdd);

            if (StringUtil.isNullStr(mxdd)) {
                mxdd = "";
            }
            nyhinput.setPlacedetail(mxdd);
            nyhinput.setBanci(pcbc);
            nyhinput.setPersonid(zrr);
            nyhinput.setPctime(new Timestamp(DateUtil.stringToDate(pcsj, "yyyy-MM-dd").getTime()));
            nyhinput.setIntime(new Timestamp(new Date().getTime()));
            nyhinput.setYhid(yhyj);
            nyhinput.setLevelid(yhjb);
            nyhinput.setTypeid(yhzy);
            nyhinput.sethNumber(wxy);
            nyhinput.setRemarks(yhms);
            nyhinput.setStatus(zgfs);
            nyhinput.setInputpersonid(pcry);
            nyhinput.setMaindeptid(mainDeptId);
            nyhinput.setLcmark(1L);

            // 限期整改填写
            if (zgfs.equals("新增")) {
                if (!StringUtil.isNullStr(zgqx)) {
                    nyhinput.setXqdate(new Timestamp(DateUtil.stringToDate(zgqx, "yyyy-MM-dd").getTime()));

                    BaseBanci baseBanci = yhEnterDao.getBaseBanci(mainDeptId, zgbc);
                    Date xqDate = DateUtil.stringToDate(zgqx, "yyyy-MM-dd");
                    Date endTime = DateUtil.stringToDate(baseBanci.getEndtime(), "HH:mm:ss");
                    nyhinput.setLastxqtime(new Timestamp(xqDate.getTime() + endTime.getTime() + 4 * 3600 * 1000));
                }

                nyhinput.setXqbanci(zgbc);
            }

            nyhinput.setYqcs(BigInteger.ZERO);
            nyhinput.setDxtx(BigInteger.ZERO);

            // 排查类型为矿专项检查或公司专项检查，指定排查专业
            if (pclx == 4 || pclx == 7) {
                nyhinput.setYhzyid(yhzy);
            }

            nyhinput.setJctype(pclx);

            nyhinput = (Nyhinput) yhEnterDao.save(nyhinput);


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
            yhpersistence.setZrdeptname(departmentDao.get(zrdw).getDeptname());
            yhpersistence.setZrpername(personDao.getPersonName(zrr));
            yhpersistence.setPlacename(placeDao.get(pcdd).getPlacename());
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
    public List<YhBasisVO> filterYhBasisOracleDataSource3(String deptNumber, String arg) {
        List<Object[]> list = yhEnterDao.filterYhBasis(deptNumber, arg);
        if (list != null && list.size() > 0) {
            List<YhBasisVO> resultList = new ArrayList<>();
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

            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<HazardVO> filterHazardOracleDataSource3(String deptNumber, String arg) {
        List<Object[]> list = yhEnterDao.filterHazard(deptNumber, arg);
        if (list != null && list.size() > 0) {
            List<HazardVO> resultList = new ArrayList<>();
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
        return yhEnterDao.filterPlace(deptNumber, arg);
    }

}
