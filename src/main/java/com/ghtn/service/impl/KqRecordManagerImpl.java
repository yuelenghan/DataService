package com.ghtn.service.impl;

import com.ghtn.dao.KqRecordDao;
import com.ghtn.model.oracle.KqRecord;
import com.ghtn.service.KqRecordManager;
import com.ghtn.vo.KqRecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

        return kqRecordVO;
    }
}
