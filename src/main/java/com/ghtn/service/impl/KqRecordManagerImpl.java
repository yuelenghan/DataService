package com.ghtn.service.impl;

import com.ghtn.dao.KqRecordDao;
import com.ghtn.model.oracle.KqRecord;
import com.ghtn.service.KqRecordManager;
import com.ghtn.service.YhEnterManager;
import com.ghtn.util.DateUtil;
import com.ghtn.util.StringUtil;
import com.ghtn.vo.IrisVO;
import com.ghtn.vo.KqRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:08
 */
@Service("kqRecordManager")
public class KqRecordManagerImpl extends GenericManagerImpl<KqRecord, Integer>
        implements KqRecordManager {

    private KqRecordDao kqRecordDao;

    @Autowired
    public KqRecordManagerImpl(KqRecordDao kqRecordDao) {
        super(kqRecordDao);
        this.kqRecordDao = kqRecordDao;
    }

    private YhEnterManager yhEnterManager;

    @Resource
    public void setYhEnterManager(YhEnterManager yhEnterManager) {
        this.yhEnterManager = yhEnterManager;
    }

    @Override
    public List<KqRecordVO> listKqRecordOracleDataSource3(Integer typeId, Integer start, Integer limit) {
        List<Object[]> list = kqRecordDao.listKqRecord(typeId, start, limit);
        List<KqRecordVO> returnList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Object[] obj : list) {
                returnList.add(transformToVO(obj));
            }
        }

        return returnList;
    }

    @Override
    public KqRecordVO getKqRecordOracleDataSource3(Integer id) {
        if (id != null && id > 0) {
            return transformToVO(kqRecordDao.getKqRecord(id));
        }
        return null;
    }

    @Override
    public KqRecordVO insertKqRecordOracleDataSource3(String key, String mainDeptId, Integer kqType, HttpSession session) throws ParseException {
        Object o = session.getAttribute("irisMap");
        if (o != null) {
            Map<String, IrisVO> map = (Map<String, IrisVO>) o;
            if (!StringUtil.isNullStr(key)) {
                IrisVO vo = map.get(key);
                KqRecord kqRecord = new KqRecord();
                kqRecord.setKqpnumber(vo.getWorkerSn());
                kqRecord.setDowntime(new Timestamp(DateUtil.stringToDate(vo.getInWellTime()).getTime()));
                kqRecord.setUptime(new Timestamp(DateUtil.stringToDate(vo.getOutWellTime()).getTime()));
                kqRecord.setKqtime(new Timestamp(DateUtil.stringToDate(vo.getAttendDate(), "yyyy-MM-dd").getTime()));

                // 根据入井时间确定班次
                String time = DateUtil.dateToString(DateUtil.stringToDate(vo.getInWellTime()), "HH:mm:ss");
                String banci = yhEnterManager.getBanciByTimeOracleDataSource3(time, mainDeptId, "rjbc");
                kqRecord.setKqbenci(banci);

                kqRecord.setKqtype(BigInteger.valueOf(kqType));
                kqRecord.setDatafrom(BigInteger.ONE);
                kqRecord.setInputperson(vo.getWorkerSn());
                kqRecord.setKqdept(mainDeptId);

                // 计算下井时长
                if (StringUtil.isNullStr(vo.getInWellWorkTime())) {
                    long workTime = (kqRecord.getUptime().getTime() - kqRecord.getDowntime().getTime()) / 1000 / 60;
                    kqRecord.setWorktime((int) workTime);
                } else {
                    kqRecord.setWorktime(Integer.parseInt(vo.getInWellWorkTime()));
                }

                kqRecord = kqRecordDao.save(kqRecord);

                KqRecordVO kqRecordVO = new KqRecordVO();
                kqRecordVO.setRjid(kqRecord.getRjid());
                kqRecordVO.setKqbenci(banci);
                kqRecordVO.setKqtime(vo.getAttendDate());

                return kqRecordVO;
            }
        }

        return null;
    }

    @Override
    public KqRecordVO insertKqRecordOracleDataSource3(String personNumber, String downTime, String upTime, String kqTime, String kqBanci, Integer kqType, String kqDept) throws ParseException {
        KqRecord kqRecord = new KqRecord();
        kqRecord.setKqpnumber(personNumber);
        kqRecord.setDowntime(new Timestamp(DateUtil.stringToDate(downTime, "yyyy-MM-dd HH:mm").getTime()));
        kqRecord.setUptime(new Timestamp(DateUtil.stringToDate(upTime, "yyyy-MM-dd HH:mm").getTime()));
        kqRecord.setKqtime(new Timestamp(DateUtil.stringToDate(kqTime, "yyyy-MM-dd").getTime()));
        kqRecord.setKqbenci(kqBanci);
        kqRecord.setKqtype(BigInteger.valueOf(kqType));
        kqRecord.setDatafrom(BigInteger.valueOf(3));
        kqRecord.setInputperson(personNumber);
        kqRecord.setKqdept(kqDept);

        long workTime = (kqRecord.getUptime().getTime() - kqRecord.getDowntime().getTime()) / 1000 / 60;
        kqRecord.setWorktime((int) workTime);

        kqRecord = kqRecordDao.save(kqRecord);

        KqRecordVO kqRecordVO = new KqRecordVO();
        kqRecordVO.setRjid(kqRecord.getRjid());
        kqRecordVO.setKqbenci(kqBanci);
        kqRecordVO.setKqtime(kqTime);

        return kqRecordVO;

    }

    /**
     * 把实体类转换为VO
     *
     * @param obj 实体类
     * @return vo
     */
    private KqRecordVO transformToVO(Object[] obj) {
        KqRecordVO kqRecordVO = new KqRecordVO();

        KqRecord kqRecord = (KqRecord) obj[0];

        kqRecordVO.setRjid(kqRecord.getRjid());
        kqRecordVO.setKqpnumber(kqRecord.getKqpnumber());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        kqRecordVO.setDowntime(kqRecord.getDowntime() == null ? "" : sdf.format(kqRecord.getDowntime()));
        kqRecordVO.setUptime(kqRecord.getUptime() == null ? "" : sdf.format(kqRecord.getUptime()));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        kqRecordVO.setKqtime(kqRecord.getKqtime() == null ? "" : sdf2.format(kqRecord.getKqtime()));

        kqRecordVO.setKqbenci(kqRecord.getKqbenci());

        int kqtype = kqRecord.getKqtype() == null ? 0 : kqRecord.getKqtype().intValue();
        kqRecordVO.setKqtype(kqtype);
        switch (kqtype) {
            case 1:
                kqRecordVO.setKqtypeDesc("正常");
                break;
            case 2:
                kqRecordVO.setKqtypeDesc("带班");
                break;
            default:
                kqRecordVO.setKqtypeDesc("正常");
        }

        int datafrom = kqRecord.getDatafrom() == null ? 0 : kqRecord.getDatafrom().intValue();
        kqRecordVO.setDatafrom(datafrom);
        switch (datafrom) {
            case 1:
                kqRecordVO.setDatafromDesc("虹膜");
                break;
            case 2:
                kqRecordVO.setDatafromDesc("人员定位");
                break;
            case 3:
                kqRecordVO.setDatafromDesc("手工录入");
                break;
            default:
                kqRecordVO.setDatafromDesc("虹膜");
        }

        kqRecordVO.setKqdept(kqRecord.getKqdept());
        kqRecordVO.setWorktime(kqRecord.getWorktime());
        kqRecordVO.setKqpname(obj[1].toString());
        kqRecordVO.setDeptDesc(obj[2].toString());

        return kqRecordVO;
    }
}
