package com.ghtn.service;

import com.ghtn.model.oracle.fxyk.Getswinput;
import com.ghtn.vo.SwinputVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface SwinputManager extends GenericManager<Getswinput, Integer> {

    List<SwinputVO> listSwinputOracleDataSource3(Integer typeId);

}
