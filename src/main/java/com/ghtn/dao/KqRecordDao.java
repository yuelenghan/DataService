package com.ghtn.dao;

import com.ghtn.model.oracle.KqRecord;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public interface KqRecordDao extends GenericDao<KqRecord, Integer> {

    List<Object[]> listKqRecord(Integer typeId, Integer start, Integer limit);

    Object[] getKqRecord(Integer id);

}
