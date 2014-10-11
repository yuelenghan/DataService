package com.ghtn.service;

import com.ghtn.model.oracle.Place;

import java.util.List;

/**
 * Created by lihe on 14/10/9.
 */
public interface YhcxManager extends GenericManager {


    List<Place> filterPlaceOracleDataSource3(String deptNumber, String arg);

    List<Place> filterPlaceOracleDataSource3(String arg);
}
