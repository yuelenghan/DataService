package com.ghtn.service;

import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/8/7.
 */
public interface GasManager extends GenericManager {

    List<Map<String, String>> getCODataSqlServerDataSource7(String deptName, int start, int limit);

    List<Map<String, String>> getEquipDataSqlServerDataSource7(String deptName, int start, int limit);

    List<Map<String, String>> getWsDataSqlServerDataSource7(String deptName, String type, int start, int limit);
}
