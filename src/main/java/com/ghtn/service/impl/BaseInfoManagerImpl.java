package com.ghtn.service.impl;

import com.ghtn.dao.BaseInfoDao;
import com.ghtn.model.oracle.CsBaseinfoset;
import com.ghtn.service.BaseInfoManager;
import com.ghtn.vo.BaseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:08
 */
@Service("baseInfoManager")
public class BaseInfoManagerImpl extends GenericManagerImpl<CsBaseinfoset, Integer>
        implements BaseInfoManager {

    private BaseInfoDao baseInfoDao;

    @Autowired
    public BaseInfoManagerImpl(BaseInfoDao baseInfoDao) {
        super(baseInfoDao);
        this.baseInfoDao = baseInfoDao;
    }

    @Override
    public List<BaseInfoVO> listBaseInfoOracleDataSource3() {
        List<CsBaseinfoset> list = baseInfoDao.listBaseInfo();
        List<BaseInfoVO> returnList = new ArrayList<BaseInfoVO>();

        if (list != null && list.size() > 0) {
            for (CsBaseinfoset csBaseinfoset : list) {
                returnList.add(transformToVO(csBaseinfoset));
            }
        }

        return returnList;
    }

    @Override
    public List<BaseInfoVO> listBaseInfoByFidOracleDataSource3(Integer fid) {
        List<CsBaseinfoset> list = baseInfoDao.listBaseInfoByFid(fid);
        List<BaseInfoVO> returnList = new ArrayList<BaseInfoVO>();

        if (list != null && list.size() > 0) {
            for (CsBaseinfoset csBaseinfoset : list) {
                returnList.add(transformToVO(csBaseinfoset));
            }
        }

        return returnList;
    }

    @Override
    public List<BaseInfoVO> listTitleOracleDataSource3() {
        List<CsBaseinfoset> list = baseInfoDao.listTitle();
        if (list != null && list.size() > 0) {
            List<BaseInfoVO> resultList = new ArrayList<BaseInfoVO>();
            for (CsBaseinfoset csBaseinfoset : list) {
                resultList.add(transformToVO(csBaseinfoset));
            }

            return resultList;
        }
        return null;
    }

    @Override
    public List<BaseInfoVO> listGslevelOracleDataSource3() {
        List<CsBaseinfoset> list = baseInfoDao.listGsLevel();
        if (list != null && list.size() > 0) {
            List<BaseInfoVO> resultList = new ArrayList<BaseInfoVO>();
            for (CsBaseinfoset csBaseinfoset : list) {
                resultList.add(transformToVO(csBaseinfoset));
            }

            return resultList;
        }
        return null;
    }

    /**
     * 把实体类转换为VO
     *
     * @param csBaseinfoset 实体类
     * @return vo
     */
    private BaseInfoVO transformToVO(CsBaseinfoset csBaseinfoset) {
        BaseInfoVO baseInfoVO = new BaseInfoVO();
        baseInfoVO.setInfoid(csBaseinfoset.getInfoid());
        baseInfoVO.setInfocode(csBaseinfoset.getInfocode());
        baseInfoVO.setInfoname(csBaseinfoset.getInfoname());

        return baseInfoVO;
    }
}
