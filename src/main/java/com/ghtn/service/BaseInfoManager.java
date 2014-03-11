package com.ghtn.service;

import com.ghtn.model.oracle.fxyk.CsBaseinfoset;
import com.ghtn.vo.BaseInfoVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface BaseInfoManager extends GenericManager<CsBaseinfoset, Integer> {

    List<BaseInfoVO> listBaseInfoOracleDataSource3();

    List<BaseInfoVO> listBaseInfoByFidOracleDataSource3(Integer fid);

    /**
     * 职务级别
     *
     * @return
     */
    List<BaseInfoVO> listTitleOracleDataSource3();

    /**
     * 工伤等级
     *
     * @return
     */
    List<BaseInfoVO> listGslevelOracleDataSource3();
}
