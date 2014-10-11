package com.ghtn.dao;

import com.ghtn.model.oracle.Place;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface YhcxDao extends GenericDao {

    List<Place> filterPlace(String deptNumber, String arg);

    List<Place> filterPlace(String arg);
}
