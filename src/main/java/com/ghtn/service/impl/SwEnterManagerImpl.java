package com.ghtn.service.impl;

import com.ghtn.dao.DepartmentDao;
import com.ghtn.dao.PersonDao;
import com.ghtn.dao.PlaceDao;
import com.ghtn.dao.SwEnterDao;
import com.ghtn.model.oracle.*;
import com.ghtn.service.SwEnterManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.DepartmentVO;
import com.ghtn.vo.SwBasisVO;
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
 * Date: 2014/4/10
 * Time: 9:40
 */
@Service("swEnterManager")
public class SwEnterManagerImpl extends GenericManagerImpl implements SwEnterManager {

    private SwEnterDao swEnterDao;

    @Autowired
    public SwEnterManagerImpl(SwEnterDao swEnterDao) {
        super(swEnterDao);
        this.swEnterDao = swEnterDao;
    }

    private PersonDao personDao;

    @Resource
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    private PlaceDao placeDao;

    @Resource
    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    private DepartmentDao departmentDao;

    @Resource
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<SwBasisVO> getSwBasisOracleDataSource3(String deptNumber, HttpSession session) {
        List<Object[]> list = swEnterDao.getSwBasis(deptNumber);
        if (list != null && list.size() > 0) {
            List<SwBasisVO> resultList = new ArrayList<SwBasisVO>();
            Map<String, String> levelMap = new HashMap<String, String>();
            Map<String, String> typeMap = new HashMap<String, String>();
            Map<String, String> hazardMap = new HashMap<String, String>();
            for (Object[] o : list) {
                SwBasisVO vo = new SwBasisVO();
                vo.setSwId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setSwNumber(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setSwContent(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setLevelId(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setTypeId(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[8])));

                resultList.add(vo);

                levelMap.put(vo.getSwId(), vo.getLevelId());
                typeMap.put(vo.getSwId(), vo.getTypeId());
                hazardMap.put(vo.getSwId(), vo.gethNumber());

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
    public String getSwBasisLevelOracleDataSource3(String swid, HttpSession session) {
        if (session != null) {
            Map<String, String> levelMap = (Map<String, String>) session.getAttribute("levelMap");
            if (levelMap != null) {
                return levelMap.get(swid);
            }
        }

        return "";
    }

    @Override
    public String getSwBasisTypeOracleDataSource3(String swid, HttpSession session) {
        if (session != null) {
            Map<String, String> typeMap = (Map<String, String>) session.getAttribute("typeMap");
            if (typeMap != null) {
                return typeMap.get(swid);
            }
        }

        return "";
    }

    @Override
    public String getBasisHazardOracleDataSource3(String swid, HttpSession session) {
        if (session != null) {
            Map<String, String> hazardMap = (Map<String, String>) session.getAttribute("hazardMap");
            if (hazardMap != null) {
                return hazardMap.get(swid);
            }
        }

        return "";
    }

    @Override
    public List<Person> getPersonOracleDataSource3(String shortName, String deptId) {
        return personDao.getPerson(shortName, deptId);
    }

    @Override
    public String insertInfoOracleDataSource3(Integer swyj, Integer swxz, Integer swlx, Integer swzy, String swms,
                                              String swry, String pcry, Integer pcdd, String mxdd, String pcsj, String pcbc,
                                              Integer jcfs, String mainDeptId,
                                              boolean dwjf, Integer dwjfValue, boolean dwfk, Integer dwfkValue,
                                              boolean grjf, Integer grjfValue, boolean grfk, Integer grfkValue,
                                              boolean jbxx, Integer jbxxValue, boolean dismiss) throws ParseException {
        // 插入NSWINPUT
        Nswinput nswinput = new Nswinput();

        nswinput.setSwid(swyj);
        nswinput.setRemarks(swms);

        // 处理三违人员字符串 : 责任单位id@三违人员id
        String[] s = swry.split("@");
        nswinput.setSwpnumber(s[1]);


        nswinput.setPcpnumber(pcry);
        nswinput.setPlaceid(pcdd);

        if (StringUtil.isNullStr(mxdd)) {
            mxdd = "";
        }

        nswinput.setPlacedetail(mxdd);
        nswinput.setTypeid(swlx);
        nswinput.setLevelid(swxz);
        nswinput.setZyid(swzy);
//        nswinput.sethNumber(wxy);
        nswinput.setPctime(new Timestamp(DateUtil.stringToDate(pcsj, "yyyy-MM-dd").getTime()));
        nswinput.setBanci(pcbc);
        nswinput.setJctype(BigInteger.valueOf(jcfs));
        nswinput.setIntime(new Timestamp(new Date().getTime()));
        nswinput.setInputpnumber(pcry);
        nswinput.setStatus("新增");
        nswinput.setMaindeptid(mainDeptId);
        nswinput.setLcmark(1);

        nswinput = (Nswinput) swEnterDao.save(nswinput);

        // 插入NSWINPUT_MORE
        NswinputMore nswinputMore = new NswinputMore();

        nswinputMore.setSwinputid(nswinput.getSwinputid());
        nswinputMore.setPersonid(pcry);
        nswinputMore.setJctype(BigInteger.valueOf(jcfs));
        nswinputMore.setRemarks(swms);

        swEnterDao.save(nswinputMore);

        // 插入NSWSTATUSCHANGE
        Nswstatuschange nswstatuschange = new Nswstatuschange();

        nswstatuschange.setSwinputid(nswinput.getSwinputid());
        nswstatuschange.setLcmark(1);
        nswstatuschange.setRecorddate(new Date());
        nswstatuschange.setNstatus("新增");
        nswstatuschange.setCremarks(personDao.getPersonName(pcry) + "于" + DateUtil.dateToString(new Date(), "yyyy/MM/dd HH:mm:ss") + "新增三违!");

        swEnterDao.save(nswstatuschange);

        // 插入NSWPERSISTENCE
        Nswpersistence nswpersistence = new Nswpersistence();

        nswpersistence.setSwinputid(nswinput.getSwinputid());
        nswpersistence.setSwpname(personDao.getPersonName(s[1]));
        nswpersistence.setPcpname(personDao.getPersonName(pcry));
        nswpersistence.setPlacename(placeDao.get(pcdd).getPlacename());
        nswpersistence.setInputpername(personDao.getPersonName(pcry));

        swEnterDao.save(nswpersistence);


        // 处罚信息
        // 插入NSWFINEDETAIL
        if (dwjf) {
            // 单位积分
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ZERO); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.ZERO);    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任单位");
            nswfinedetail.setFineid(s[0]);
            nswfinedetail.setFinename(departmentDao.getDeptName(s[0]));
            nswfinedetail.setFine(BigDecimal.valueOf(dwjfValue));

            swEnterDao.save(nswfinedetail);
        }
        if (dwfk) {
            // 单位罚款
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ZERO); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.ONE);    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任单位");
            nswfinedetail.setFineid(s[0]);
            nswfinedetail.setFinename(departmentDao.getDeptName(s[0]));
            nswfinedetail.setFine(BigDecimal.valueOf(dwfkValue));

            swEnterDao.save(nswfinedetail);
        }
        if (grjf) {
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ONE); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.ZERO);    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任人");
            nswfinedetail.setFineid(s[1]);
            nswfinedetail.setFinename(personDao.getPersonName(s[1]));
            nswfinedetail.setFine(BigDecimal.valueOf(grjfValue));

            swEnterDao.save(nswfinedetail);
        }
        if (grfk) {
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ONE); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.ONE);    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任人");
            nswfinedetail.setFineid(s[1]);
            nswfinedetail.setFinename(personDao.getPersonName(s[1]));
            nswfinedetail.setFine(BigDecimal.valueOf(grfkValue));

            swEnterDao.save(nswfinedetail);
        }
        if (jbxx) {
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ONE); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.valueOf(2));    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任人");
            nswfinedetail.setFineid(s[1]);
            nswfinedetail.setFinename(personDao.getPersonName(s[1]));
            nswfinedetail.setFine(BigDecimal.valueOf(jbxxValue));

            swEnterDao.save(nswfinedetail);

            nswinput.setIslearn(BigInteger.valueOf(jbxxValue));
            swEnterDao.save(nswinput);
        }
        if (dismiss) {
            Nswfinedetail nswfinedetail = new Nswfinedetail();
            nswfinedetail.setSwinputid(nswinput.getSwinputid());
            nswfinedetail.setLcmark(1);
            nswfinedetail.setRecorddate(new Date());
            nswfinedetail.setFinekind(BigInteger.ONE); // 处罚对象 0:单位, 1:人
            nswfinedetail.setFinetype(BigInteger.valueOf(3));    // 处罚方式 0:积分, 1:罚款, 2:进班学习, 3:解除劳动合同
            nswfinedetail.setObjectname("责任人");
            nswfinedetail.setFineid(s[1]);
            nswfinedetail.setFinename(personDao.getPersonName(s[1]));

            swEnterDao.save(nswfinedetail);
        }


        return "success";
    }

    @Override
    public List<SwBasisVO> filterSwBasisOracleDataSource3(String deptNumber, String swyjLevel, String swyjText, HttpSession session) {
        int swyjLevelInt = 0;
        if (!StringUtil.isNullStr(swyjLevel)) {
            swyjLevelInt = Integer.parseInt(swyjLevel);
        }
        List<Object[]> list = swEnterDao.filterSwBasis(deptNumber, swyjLevelInt, swyjText);
        if (list != null && list.size() > 0) {
            List<SwBasisVO> resultList = new ArrayList<SwBasisVO>();
            Map<String, String> levelMap = new HashMap<String, String>();
            Map<String, String> typeMap = new HashMap<String, String>();
            Map<String, String> hazardMap = new HashMap<String, String>();
            for (Object[] o : list) {
                SwBasisVO vo = new SwBasisVO();
                vo.setSwId(StringUtil.processNullStr(String.valueOf(o[0])));
                vo.setSwNumber(StringUtil.processNullStr(String.valueOf(o[1])));
                vo.setSwContent(StringUtil.processNullStr(String.valueOf(o[2])));
                vo.setLevelId(StringUtil.processNullStr(String.valueOf(o[3])));
                vo.setLevelName(StringUtil.processNullStr(String.valueOf(o[4])));
                vo.setTypeId(StringUtil.processNullStr(String.valueOf(o[5])));
                vo.setTypeName(StringUtil.processNullStr(String.valueOf(o[6])));
                vo.sethNumber(StringUtil.processNullStr(String.valueOf(o[7])));
                vo.sethContent(StringUtil.processNullStr(String.valueOf(o[8])));

                resultList.add(vo);

                levelMap.put(vo.getSwId(), vo.getLevelId());
                typeMap.put(vo.getSwId(), vo.getTypeId());
                hazardMap.put(vo.getSwId(), vo.gethNumber());
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
    public List<DepartmentVO> filterDepartmentOracleDataSource3(String mainDeptId) {
        List<Object[]> list = departmentDao.getDept(mainDeptId);
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
    public List<Nswfineset> getSwFineSetOracleDataSource3(Integer levelId, Integer jcType, String mainDeptId) {
        return swEnterDao.getSwFineSet(levelId, jcType, mainDeptId);
    }
}
