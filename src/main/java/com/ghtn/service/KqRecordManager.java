package com.ghtn.service;

import com.ghtn.model.oracle.fxyk.KqRecord;
import com.ghtn.vo.KqRecordVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:44
 * To change this template use File | Settings | File Templates.
 */
public interface KqRecordManager extends GenericManager<KqRecord, Integer> {

    List<KqRecordVO> listKqRecordOracleDataSource3(Integer typeId, Integer start, Integer limit);

    KqRecordVO getKqRecordOracleDataSource3(Integer id);
}
