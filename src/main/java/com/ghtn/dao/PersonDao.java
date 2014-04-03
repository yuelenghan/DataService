package com.ghtn.dao;

import com.ghtn.model.oracle.Person;

/**
 * User: Administrator
 * Date: 2014/4/3
 * Time: 11:13
 */
public interface PersonDao extends GenericDao<Person, Long> {

    String getPersonName(String personNumber);

}
