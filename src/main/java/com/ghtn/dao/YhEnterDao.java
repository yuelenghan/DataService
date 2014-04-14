package com.ghtn.dao;

import com.ghtn.model.oracle.BaseBanci;
import com.ghtn.model.oracle.Nyhinput;
import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.Place;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/2
 * Time: 15:19
 */
public interface YhEnterDao extends GenericDao {

    List<Object[]> getYhBasis(String deptNumber);

    List<Object[]> getHazard(String deptNumber);

    List<Object[]> getZrdw(String deptNumber);

    List<Person> getZrr(String deptId);

    List<Place> getPlace(String deptNumber);

    BaseBanci getBaseBanci(String mainDeptId, String banci);

    List<Object[]> filterYhBasis(String deptNumber, String arg);

    List<Object[]> filterHazard(String deptNumber, String arg);

    List<Place> filterPlace(String deptNumber, String arg);

    Nyhinput listYhinput(Integer placeId, String zrdw, Integer yhyj);
}
