package com.ghtn.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by lihe on 14/8/8.
 */
public interface OutPutManager extends GenericManager {

    List<Map<String, String>> getOutPutDataSqlServerDataSource6(String startDate, String endDate) throws ParseException;

}
