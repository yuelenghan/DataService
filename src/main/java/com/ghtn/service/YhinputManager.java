package com.ghtn.service;

import com.ghtn.model.oracle.fxyk.Getyhinput;
import com.ghtn.vo.YhinputVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface YhinputManager extends GenericManager<Getyhinput, Integer> {

    List<YhinputVO> listYhinputOracleDataSource3(Integer typeId, Integer start, Integer limit);

    YhinputVO getYhinputOracleDataSource3(Integer id);

}
