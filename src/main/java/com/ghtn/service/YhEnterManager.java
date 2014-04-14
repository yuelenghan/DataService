package com.ghtn.service;

import com.ghtn.model.oracle.Place;
import com.ghtn.vo.HazardVO;
import com.ghtn.vo.YhBasisVO;
import com.ghtn.vo.ZrdwVO;
import com.ghtn.vo.ZrrVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:28
 */
public interface YhEnterManager extends GenericManager {

    List<YhBasisVO> getYhBasisOracleDataSource3(String deptNumber, HttpSession session);

    String getYhBasisLevelOracleDataSource3(String yhid, HttpSession session);

    String getYhBasisTypeOracleDataSource3(String yhid, HttpSession session);

    List<HazardVO> getHazardOracleDataSource3(String deptNumber);

    String getBasisHazardOracleDataSource3(String yhid, HttpSession session);

    List<ZrdwVO> getZrdwOracleDataSource3(String deptNumber);

    List<ZrrVO> getZrrOracleDataSource3(String deptId);

    List<Place> getPlaceOracleDataSource3(String deptNumber);

    String insertInfoOracleDataSource3(Integer yhyj, Integer yhjb, String yhlx, String wxy, String yhms, String zrdw, String zrr, Integer pcdd, String mxdd,
                                       String pcsj, String pcbc, String pcry, Integer pclx, String zgfs, String zgqx, String zgbc, Integer yhzy, String mainDeptId) throws ParseException;

    List<YhBasisVO> filterYhBasisOracleDataSource3(String deptNumber, String arg);

    List<HazardVO> filterHazardOracleDataSource3(String deptNumber, String arg);

    List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg);

}
