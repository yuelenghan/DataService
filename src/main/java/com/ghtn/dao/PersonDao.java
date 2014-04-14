package com.ghtn.dao;

import com.ghtn.model.oracle.Person;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/3
 * Time: 11:13
 */
public interface PersonDao extends GenericDao<Person, Long> {

    String getPersonName(String personNumber);

    List<Person> getPerson(String shortName, String mainDeptId);

}