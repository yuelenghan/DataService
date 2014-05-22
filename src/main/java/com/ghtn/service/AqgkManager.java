package com.ghtn.service;

import com.ghtn.vo.AqgkVO;

import java.util.List;

/**
 * Created by lihe on 14-5-22.
 */
public interface AqgkManager extends GenericManager {

    List<AqgkVO> getAqgkOracleDataSource3(String date);

}
