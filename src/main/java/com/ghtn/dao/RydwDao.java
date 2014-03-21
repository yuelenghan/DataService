package com.ghtn.dao;

import java.sql.Date;
import java.sql.ResultSet;

/**
 * User: Administrator
 * Date: 14-3-18
 * Time: 上午9:56
 */
public interface RydwDao extends GenericDao {

    ResultSet getInMinePeople(Date date);


}
