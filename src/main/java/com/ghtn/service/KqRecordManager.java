package com.ghtn.service;

import com.ghtn.model.oracle.KqRecord;
import com.ghtn.vo.KqRecordVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
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

    KqRecordVO insertKqRecordOracleDataSource3(String key, String mainDeptId, Integer kqType, HttpSession session) throws ParseException;

    KqRecordVO insertKqRecordOracleDataSource3(String personNumber, String downTime, String upTime, String kqTime, String kqBanci, Integer kqType, String kqDept) throws ParseException;

}
