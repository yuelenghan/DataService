package com.ghtn.dao;

import com.ghtn.model.oracle.Nswinput;

import java.util.Date;
import java.util.List;

/**
 * User: Administrator
 * Date: 2014/5/6
 * Time: 9:52
 */
public interface SwxcQueryDao extends GenericDao {

    List<Nswinput> getSwxcList(Date startDate, Date endDate, int start, int limit);

}
