package com.ghtn.dao;

import java.util.List;

/**
 * 读取虹膜数据
 * Created by lihe on 14-6-3.
 */
public interface IrisDao extends GenericDao {

    List<Object[]> getIrisData(String personNumber);

}
